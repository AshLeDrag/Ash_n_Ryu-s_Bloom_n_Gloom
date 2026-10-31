package net.Ash_n_Ryu.lumenfuge.entity.custom.boss;

import net.Ash_n_Ryu.lumenfuge.block.ModBlocks;
import net.Ash_n_Ryu.lumenfuge.item.ModItems;
import net.Ash_n_Ryu.lumenfuge.sound.ModSounds;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.phys.shapes.CollisionContext;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Mth;
import net.minecraft.world.BossEvent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.control.LookControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.event.EventHooks;

import java.util.function.Predicate;

public class EtheralKnightEntity extends Monster {
		public static final int PHASE_ONE = 0;
		public static final int PHASE_ONE_END = 1;
		public static final int ARMOR_BREAK = 2;
		public static final int REVEAL = 3;
		public static final int PHASE_TWO = 4;
		public static final int PHASE_ONE_END_TICKS = 30;
		public static final int ARMOR_BREAK_TICKS = 101;
		public static final int REVEAL_TICKS = 20;
		private static final EntityDataAccessor<Integer> DATA_PHASE =
				SynchedEntityData.defineId(EtheralKnightEntity.class, EntityDataSerializers.INT);
		private static final EntityDataAccessor<Integer> DATA_PHASE_TICKS =
				SynchedEntityData.defineId(EtheralKnightEntity.class, EntityDataSerializers.INT);
		public final AnimationState transformationAnimationState = new AnimationState();
		private int lastAnimationPhase = -1;
		private static final EntityDataAccessor<Integer> DATA_ATTACK = SynchedEntityData.defineId(EtheralKnightEntity.class, EntityDataSerializers.INT);
		private static final EntityDataAccessor<Integer> DATA_ATTACK_TICKS = SynchedEntityData.defineId(EtheralKnightEntity.class, EntityDataSerializers.INT);
		private static final EntityDataAccessor<Integer> DATA_SPAWN_TICKS = SynchedEntityData.defineId(EtheralKnightEntity.class, EntityDataSerializers.INT);
		private static final EntityDataAccessor<Boolean> DATA_WALKING = SynchedEntityData.defineId(EtheralKnightEntity.class, EntityDataSerializers.BOOLEAN);
		public final AnimationState attackAnimationState = new AnimationState();
		public final AnimationState walkAnimationState = new AnimationState();
		private int lastAnimationAttack;
		private int nextAttack;
		private LivingEntity attackTarget;
		private float walkBlend;
		private float previousWalkBlend;
		private int attackCooldown;
		private float combatYaw = Float.NaN;
		private static final double MOVEMENT_SPEED = 0.19D;
		private static final double PHASE_ONE_DAMAGE = 9.0D;
		private static final double PHASE_TWO_DAMAGE = 18.0D;
		private static final double PHASE_ONE_HEALTH = 500.0D;
		private static final double PHASE_TWO_HEALTH = 1000.0D;
		private static final double SLAM_RADIUS = 7.0D;
		
		private boolean isInStrikeRange(LivingEntity target) {
				double reach = getPhase() == PHASE_TWO ? 5.5D : 3.5D;
				return distanceToSqr(target) <= reach * reach;
		}
		
		public int getAttack() { return entityData.get(DATA_ATTACK); }
		public int getAttackTicks() { return entityData.get(DATA_ATTACK_TICKS); }
		public int getSpawnTicks() { return entityData.get(DATA_SPAWN_TICKS); }
		public boolean isSpawning() { return getSpawnTicks() > 0; }
		public boolean isAttacking() { return getAttack() != 0; }
		public float getWalkBlend(float partialTick) { return Mth.lerp(partialTick, previousWalkBlend, walkBlend); }
		
		public void beginSummoning() {
				entityData.set(DATA_SPAWN_TICKS, 80);
				getNavigation().stop();
		}
		
		public int getAttackDuration() {
				return getPhase() == PHASE_TWO
								 ? switch (getAttack()) { case 1 -> 45; case 2 -> 56; default -> 60; }
								 : (getAttack() == 1 ? 75 : 86);
		}
		
		private void stopAttack() {
				if (isAttacking()) attackCooldown = 2;
				entityData.set(DATA_ATTACK, 0);
				entityData.set(DATA_ATTACK_TICKS, 0);
				attackTarget = null;
		}
		
		private void tickAttack() {
				if (!isAttacking()) return;
				if (isTransforming() || isSpawning()) { stopAttack(); return; }
				getNavigation().stop();
				int elapsed = getAttackTicks() + 1;
				entityData.set(DATA_ATTACK_TICKS, elapsed);
				// Apply damage once, during the swing rather than at the beginning of the wind-up.
				boolean slam = getPhase() == PHASE_TWO && getAttack() == 3;
				// Both hands reach the ground around two seconds into the exported animation.
				int impactTick = slam ? 40 : getAttackDuration() / 2;
				if (elapsed == impactTick) {
						if (slam) {
								slamGround();
						} else if (attackTarget != null && attackTarget.isAlive()
											  && canAttack(attackTarget) && isInStrikeRange(attackTarget)
											  && getSensing().hasLineOfSight(attackTarget)) {
								super.doHurtTarget(attackTarget);
						}
				}
				if (elapsed >= getAttackDuration()) stopAttack();
		}
		
		private void faceAttackTarget(LivingEntity target) {
				double dx = target.getX() - getX();
				double dz = target.getZ() - getZ();
				if (Float.isNaN(combatYaw)) combatYaw = yBodyRot;
				if (dx * dx + dz * dz > 0.0625D) {
						float yaw = (float) (Mth.atan2(dz, dx) * 180.0D / Math.PI) - 90F;
						if (Math.abs(Mth.wrapDegrees(yaw - combatYaw)) > 2F) {
								combatYaw = Mth.approachDegrees(combatYaw, yaw, 6F);
						}
				}
				setYRot(combatYaw);
				setYBodyRot(combatYaw);
				setYHeadRot(combatYaw);
				float pitch = isAttacking() ? 0F : Mth.clamp((float) (-Mth.atan2(
						target.getEyeY() - getEyeY(), Math.sqrt(dx * dx + dz * dz)) * 180D / Math.PI), -25F, 45F);
				setXRot(Mth.approachDegrees(getXRot(), pitch, 3F));
		}
		
		@Override
		protected BodyRotationControl createBodyControl() {
				return new BodyRotationControl(this) {
						@Override public void clientTick() {
								// Render the networked entity heading without vanilla's delayed body/head corrections.
								setYBodyRot(getYRot());
						}
				};
		}
		
		private void slamGround() {
				if (!(level() instanceof ServerLevel server)) return;
				float damage = (float) getAttributeValue(Attributes.ATTACK_DAMAGE) * 2F;
				for (LivingEntity victim : server.getEntitiesOfClass(LivingEntity.class,
						getBoundingBox().inflate(SLAM_RADIUS, SLAM_RADIUS , SLAM_RADIUS))) {
						double dx = victim.getX() - getX();
						double dz = victim.getZ() - getZ();
						if (victim == this || victim instanceof EtheralKnightEntity || !victim.isAlive()
									 || !canAttack(victim) || isAlliedTo(victim)
									 || (victim instanceof Player player && (player.isCreative() || player.isSpectator()))
									 || dx * dx + dz * dz > SLAM_RADIUS * SLAM_RADIUS
									 || Math.abs(victim.getY() - getY()) > 2.0D || !hasLineOfSight(victim)) continue;
						if (victim.hurt(damageSources().mobAttack(this), damage)) {
								victim.knockback(0.8D, -dx, -dz);
								victim.hurtMarked = true;
						}
				}
				// Visual shockwave only: no explosion or terrain destruction.
				server.sendParticles(ParticleTypes.EXPLOSION, getX(), getY() + 0.2, getZ(), 1, 0, 0, 0, 0);
				for (int i = 0; i < 32; i++) {
						double angle = i * Math.PI * 2 / 32;
						server.sendParticles(ParticleTypes.CLOUD, getX() + Math.cos(angle) * SLAM_RADIUS,
								getY() + 0.15, getZ() + Math.sin(angle) * SLAM_RADIUS,
								1, 0.1, 0.05, 0.1, 0.02);
				}
				playSound(SoundEvents.GENERIC_EXPLODE.value(), 1.5F, 0.7F);
		}
		
		public int getPhase() {
				return entityData.get(DATA_PHASE);
		}
		
		public int getPhaseTicks() {
				return entityData.get(DATA_PHASE_TICKS);
		}
		
		public boolean isTransforming() {
				return getPhase() > PHASE_ONE && getPhase() < PHASE_TWO;
		}
		
		public boolean setPhase(int phase) {
				if (phase == this.getPhase()) return false;
				stopAttack();
				nextAttack = 0;
				entityData.set(DATA_PHASE, phase);
				getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(phase == PHASE_TWO ? PHASE_TWO_DAMAGE : PHASE_ONE_DAMAGE);
				getAttribute(Attributes.MAX_HEALTH).setBaseValue(phase == PHASE_TWO ? PHASE_TWO_HEALTH : PHASE_ONE_HEALTH);
				entityData.set(DATA_PHASE_TICKS, 0);
				bossEvent.setColor(phase == PHASE_TWO ? BossEvent.BossBarColor.PURPLE : BossEvent.BossBarColor.BLUE);
				return true;
		}
		
		@Override
		public void die(DamageSource source) {
				// Damage has already passed through armor, absorption and NeoForge hooks here.
				// Administrative damage such as /kill must still be able to remove the boss.
				if (!source.is(DamageTypeTags.BYPASSES_INVULNERABILITY) && beginPhaseTwoTransition()) return;
				super.die(source);
		}
		
		public boolean beginPhaseTwoTransition() {
				if (level().isClientSide || isRemoved() || getPhase() != PHASE_ONE || isSpawning()) return false;
				setHealth(1.0F);
				setPhase(ARMOR_BREAK);
				getNavigation().stop();
				setDeltaMovement(0, getDeltaMovement().y, 0);
				return true;
		}
		
		@Override
		public boolean doHurtTarget(Entity target) {
				if (isTransforming() || isSpawning() || isAttacking() || attackCooldown > 0
							 || !(target instanceof LivingEntity living) || !canAttack(living)
							 || !isInStrikeRange(living) || !getSensing().hasLineOfSight(living)) return false;
				attackTarget = living;
				entityData.set(DATA_ATTACK_TICKS, 0);
				entityData.set(DATA_ATTACK, 1 + nextAttack++ % (getPhase() == PHASE_TWO ? 3 : 2));
				this.playSound(this.getAttackSound(), 1.0F, 1.0F);
				getNavigation().stop();
				return true;
		}
		
		@Override
		protected boolean isImmobile() {
				return isTransforming() || isSpawning() || isAttacking() || super.isImmobile();
		}
		
		private void tickTransformation() {
				if (!isTransforming()) return;
				getNavigation().stop();
				setDeltaMovement(0, getDeltaMovement().y, 0);
				int elapsed = getPhaseTicks() + 1;
				entityData.set(DATA_PHASE_TICKS, elapsed);
				this.playSound(this.getTransitionSound(), 1.0F, 1.0F);
				int duration = switch (getPhase()) {
						case PHASE_ONE_END -> PHASE_ONE_END_TICKS;
						case ARMOR_BREAK -> ARMOR_BREAK_TICKS;
						default -> REVEAL_TICKS;
				};
				if (elapsed >= duration) {
						if (getPhase() == REVEAL) {
								getAttribute(Attributes.MAX_HEALTH).setBaseValue(1000.0D);
								setHealth(getMaxHealth());
								setPhase(PHASE_TWO);
						} else {
								setPhase(getPhase() + 1);
						}
				}
				bossEvent.setProgress(getHealth() / getMaxHealth());
		}
		public final AnimationState idleAnimationState = new AnimationState();
		private static final EntityDataAccessor<Integer> DATA_ID_INV;
		private final ServerBossEvent bossEvent;
		private static final Predicate<LivingEntity> LIVING_ENTITY_SELECTOR;
		
		
		public EtheralKnightEntity(EntityType<? extends Monster> entityType, Level level) {
				super(entityType, level);
				this.lookControl = new LookControl(this) {
						@Override public void tick() {
								if (getTarget() == null && !isAttacking() && !isTransforming() && !isSpawning()) {
										super.tick();
								}
						}
				};
				// The default name comes from the registered entity type.
				this.bossEvent = (ServerBossEvent)(new ServerBossEvent(this.getDisplayName(), BossEvent.BossBarColor.BLUE, BossEvent.BossBarOverlay.PROGRESS)).setDarkenScreen(true);
				this.xpReward = 50;
		}
		
		
		@Override
		protected void registerGoals() {
				this.goalSelector.addGoal(0, new Goal() {
						{
								setFlags(java.util.EnumSet.allOf(Goal.Flag.class));
						}
						@Override public boolean canUse() { return isTransforming() || isSpawning(); }
						@Override public void start() { getNavigation().stop(); }
						@Override public void tick() { getNavigation().stop(); }
				});
				this.goalSelector.addGoal(2, new Goal() {
						private int repathTicks;
						{ setFlags(java.util.EnumSet.of(Flag.MOVE, Flag.LOOK)); }
						@Override public boolean canUse() {
								LivingEntity target = getTarget();
								return !isTransforming() && !isSpawning() && target != null
												 && target.isAlive() && canAttack(target);
						}
						@Override public boolean canContinueToUse() { return canUse(); }
						@Override public boolean requiresUpdateEveryTick() { return true; }
						@Override public void start() { repathTicks = 0; }
						@Override public void stop() { getNavigation().stop(); }
						@Override public void tick() {
								if (isAttacking()) { getNavigation().stop(); return; }
								LivingEntity target = getTarget();
								if (target == null) return;
								getLookControl().setLookAt(target, 30F, 30F);
								if (isInStrikeRange(target) && getSensing().hasLineOfSight(target)) {
										getNavigation().stop();
										doHurtTarget(target);
										repathTicks = 0;
								} else if (--repathTicks <= 0 || getNavigation().isDone()) {
										getNavigation().moveTo(target, 1.0D);
										repathTicks = 10;
								}
						}
				});
				this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
				this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
				this.targetSelector.addGoal(0, new NearestAttackableTargetGoal<>(this, Player.class, true));
				this.targetSelector.addGoal(1, new HurtByTargetGoal(this, new Class[0]));
				this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 0, false, false, LIVING_ENTITY_SELECTOR));
		}
		
		@Override
		protected void defineSynchedData(SynchedEntityData.Builder builder) {
				super.defineSynchedData(builder);
				builder.define(DATA_ID_INV, 0);
				builder.define(DATA_PHASE, PHASE_ONE);
				builder.define(DATA_PHASE_TICKS, 0);
				builder.define(DATA_ATTACK, 0);
				builder.define(DATA_ATTACK_TICKS, 0);
				builder.define(DATA_SPAWN_TICKS, 0);
				builder.define(DATA_WALKING, false);
		}
		
		
		public static AttributeSupplier.Builder createAttributes() {
				return Monster.createMonsterAttributes()
								 .add(Attributes.MAX_HEALTH, 500d)
								 .add(Attributes.MOVEMENT_SPEED, MOVEMENT_SPEED)
								 .add(Attributes.ATTACK_DAMAGE, PHASE_ONE_DAMAGE)
								 .add(Attributes.FOLLOW_RANGE, 40.0D)
								 .add(Attributes.KNOCKBACK_RESISTANCE, 1.0D)
								 .add(Attributes.ATTACK_KNOCKBACK, 6.0D)
								 .add(Attributes.STEP_HEIGHT, 1.5D);
		}
		
		private void setupAnimationStates() {
				if (lastAnimationPhase != getPhase()) {
						lastAnimationPhase = getPhase();
						transformationAnimationState.stop();
						if (isTransforming()) {
								transformationAnimationState.start(tickCount - getPhaseTicks());
						}
				}
				idleAnimationState.animateWhen(!isTransforming(), tickCount);
				if (lastAnimationAttack != getAttack()) {
						lastAnimationAttack = getAttack();
						attackAnimationState.stop();
						if (isAttacking()) attackAnimationState.start(tickCount - getAttackTicks());
				}
				previousWalkBlend = walkBlend;
				walkBlend = Mth.approach(walkBlend, entityData.get(DATA_WALKING) ? 1F : 0F, 0.15F);
				walkAnimationState.animateWhen(walkBlend > 0F, tickCount);
		}
		
		@Override
		public void tick() {
				super.tick();
				stayOnFluidSurface();
				if (!level().isClientSide && isAlive()) {
						if (isSpawning()) entityData.set(DATA_SPAWN_TICKS, getSpawnTicks() - 1);
						tickAttack();
						tickTransformation();
						LivingEntity facingTarget = isAttacking() ? attackTarget : getTarget();
						if (!isTransforming() && !isSpawning() && facingTarget != null && facingTarget.isAlive()) {
								// Run once, after navigation and look controls, using our own persistent heading.
								faceAttackTarget(facingTarget);
						} else {
								combatYaw = Float.NaN;
						}
						entityData.set(DATA_WALKING, !isAttacking() && !isTransforming() && !isSpawning()
																	  && !getNavigation().isDone() && getDeltaMovement().horizontalDistanceSqr() > 1.0E-8);
				}
				
				if(this.level().isClientSide()) {
						this.setupAnimationStates();
				}
		}
		
		@Override
		protected PathNavigation createNavigation(Level level) {
				return new EtheralKnightNavigation(this, level);
		}
		
		private void stayOnFluidSurface() {
				FluidState fluid = level().getFluidState(blockPosition());
				if (fluid.isEmpty() || !canStandOnFluid(fluid)) return;
				if (CollisionContext.of(this).isAbove(LiquidBlock.STABLE_SHAPE, blockPosition(), true)
							 && level().getFluidState(blockPosition().above()).isEmpty()) {
						setOnGround(true);
				} else {
						Vec3 movement = getDeltaMovement();
						setDeltaMovement(movement.x, Math.max(0.08D, movement.y * 0.5D), movement.z);
				}
		}
		
		
		public void addAdditionalSaveData(CompoundTag compound) {
				super.addAdditionalSaveData(compound);
				compound.putInt("Invul", this.getInvulnerableTicks());
				compound.putInt("KnightPhase", getPhase());
				compound.putInt("KnightPhaseTicks", getPhaseTicks());
				compound.putInt("SummoningTicks", getSpawnTicks());
		}
		
		public void readAdditionalSaveData(CompoundTag compound) {
				super.readAdditionalSaveData(compound);
				// Upgrade existing bosses saved with the previous almost-zero speed.
				if (getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() <= 0.0081D) {
						getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(MOVEMENT_SPEED);
				}
				this.setInvulnerableTicks(compound.getInt("Invul"));
				setPhase(Mth.clamp(compound.getInt("KnightPhase"), PHASE_ONE, PHASE_TWO));
				if (getPhase() == PHASE_ONE_END) setPhase(ARMOR_BREAK);
				entityData.set(DATA_SPAWN_TICKS, Mth.clamp(compound.getInt("SummoningTicks"), 0, 80));
				entityData.set(DATA_PHASE_TICKS, Math.max(0, compound.getInt("KnightPhaseTicks")));
				if (getPhase() == PHASE_TWO) {
						getAttribute(Attributes.MAX_HEALTH).setBaseValue(1000.0D);
				}
				if (this.hasCustomName()) {
						if (this.bossEvent != null) {
								this.bossEvent.setName(this.getDisplayName());
						}
				}
				
		}
		
		public void setCustomName(@javax.annotation.Nullable Component name) {
				super.setCustomName(name);
				if (this.bossEvent != null) {
						this.bossEvent.setName(this.getDisplayName());
				}
		}
		
		protected SoundEvent getAmbientSound() {
				return ModSounds.ETHEREAL_AMBIENT.get();
		}
		
		protected SoundEvent getHurtSound(DamageSource damageSource) {
				return ModSounds.ETHEREAL_HURT.get();
		}
		
		protected SoundEvent getDeathSound() {
				return ModSounds.ETHEREAL_DEATH.get();
		}
		
		protected SoundEvent getTransitionSound() {
				return ModSounds.ETHEREAL_TRANSITION.get();
		}
		
		protected SoundEvent getAttackSound() {
				return ModSounds.ETHEREAL_ATTACK.get();
		}
		
		@Override
		protected void customServerAiStep() {
				super.customServerAiStep();
				if (attackCooldown > 0) --attackCooldown;
				if (getInvulnerableTicks() > 0) {
						setInvulnerableTicks(getInvulnerableTicks() - 1);
				}
				
				if (!isAlive() || isTransforming() || isSpawning() || getInvulnerableTicks() > 0) {
						bossEvent.setProgress(getHealth() / getMaxHealth());
						return;
				}
				
				LivingEntity target = getTarget();
				if (target != null && (!target.isAlive() || !canAttack(target))) {
						setTarget(null);
						getNavigation().stop();
				}
				if (!isAttacking() && tickCount % 10 == 0) {
						retargetNearestEnemy();
				}
				
				// One health point per second, as in the original AI; never during transformation.
				if (tickCount % 20 == 0) {
						heal(1.0F);
				}
				
				bossEvent.setProgress(getHealth() / getMaxHealth());
		}
		
		private void retargetNearestEnemy() {
				double range = getAttributeValue(Attributes.FOLLOW_RANGE);
				TargetingConditions conditions = TargetingConditions.forCombat().range(range)
																	.selector(LIVING_ENTITY_SELECTOR);
				LivingEntity current = getTarget();
				LivingEntity nearest = null;
				double nearestDistance = range * range;
				for (LivingEntity candidate : level().getEntitiesOfClass(LivingEntity.class,
						getBoundingBox().inflate(range))) {
						if (!conditions.test(this, candidate) || !isWithinRestriction(candidate.blockPosition())) continue;
						double distance = distanceToSqr(candidate);
						boolean candidateIsPlayer = candidate instanceof Player;
						boolean nearestIsPlayer = nearest instanceof Player;
						if (nearest == null || (candidateIsPlayer && !nearestIsPlayer)
									 || (candidateIsPlayer == nearestIsPlayer && distance < nearestDistance)) {
								nearest = candidate;
								nearestDistance = distance;
						}
				}
				// A small margin avoids flickering between enemies standing at almost the same distance.
				if (nearest != null && nearest != current && (current == null
																					 || !conditions.test(this, current)
																					 || (nearest instanceof Player && !(current instanceof Player))
																					 || ((nearest instanceof Player) == (current instanceof Player)
																								  && nearestDistance < distanceToSqr(current) * 0.81D))) {
						setTarget(nearest);
						getNavigation().stop();
				}
		}
		
		public void startSeenByPlayer(ServerPlayer player) {
				super.startSeenByPlayer(player);
				this.bossEvent.addPlayer(player);
		}
		
		public void stopSeenByPlayer(ServerPlayer player) {
				super.stopSeenByPlayer(player);
				this.bossEvent.removePlayer(player);
		}
		
		
		
		@Override
		public boolean hurt(DamageSource source, float amount) {
				if ((isTransforming() || isSpawning() || getInvulnerableTicks() > 0)
							 && !source.is(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
						return false;
				}
				return super.hurt(source, amount);
		}
		
		protected void dropCustomDeathLoot(ServerLevel level, DamageSource damageSource, boolean recentlyHit) {
				super.dropCustomDeathLoot(level, damageSource, recentlyHit);
				int nbrM = random.nextInt(6)+5;
				int nbrS = random.nextInt(2)+3;
				ItemEntity itementityM = this.spawnAtLocation(new ItemStack(ModItems.MANTISITE_SHARD.get(), nbrM));
				ItemEntity itementityS = this.spawnAtLocation(new ItemStack(ModBlocks.ERNEST_SAPLING.get(), nbrS));
				if (itementityM != null) {
						itementityM.setExtendedLifetime();
				}
				if (itementityS != null) {
						itementityS.setExtendedLifetime();
				}
				
		}
		
		public void checkDespawn() {
				if (!EventHooks.checkMobDespawn(this)) {
						if (this.level().getDifficulty() == Difficulty.PEACEFUL && this.shouldDespawnInPeaceful()) {
								this.discard();
						} else {
								this.noActionTime = 0;
						}
						
				}
		}
		
		
		public int getInvulnerableTicks() {
				return this.entityData.get(DATA_ID_INV);
		}
		
		public void setInvulnerableTicks(int invulnerableTicks) {
				this.entityData.set(DATA_ID_INV, Math.max(0, invulnerableTicks));
		}
		
		protected boolean canRide(Entity entity) {
				return false;
		}
		
		public boolean canUsePortal(boolean allowPassengers) {
				return false;
		}
		
		@Override public boolean canBeHitByProjectile() {
				return false;
		}
		
		@Override protected boolean isAffectedByFluids() {
				return false;
		}
		
		@Override protected boolean isAlwaysExperienceDropper() {
				return true;
		}
		
		@Override public boolean canDisableShield() {
				return true;
		}
		
		@Override public boolean canStandOnFluid(FluidState fluidState) {
				return !fluidState.isEmpty();
		}
		
		@Override public boolean fireImmune() {
				return true;
		}
		
		@Override public boolean ignoreExplosion(Explosion explosion) {
				return false;
		}
		
		@Override public boolean isPushable() {
				return false;
		}
		
		static {
				DATA_ID_INV = SynchedEntityData.defineId(EtheralKnightEntity.class, EntityDataSerializers.INT);
				LIVING_ENTITY_SELECTOR = (p_348303_) -> !(p_348303_ instanceof EtheralKnightEntity) && p_348303_.attackable();
		}
}

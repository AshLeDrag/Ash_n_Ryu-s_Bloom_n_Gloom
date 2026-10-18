package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.entity.custom;

import net.AshLeDrag.thingsfordays.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;

public class SteelThrowableProjectileEntity extends AbstractArrow {
		
		private static final EntityDataAccessor<Byte> ID_LOYALTY =
				SynchedEntityData.defineId(SteelThrowableProjectileEntity.class, EntityDataSerializers.BYTE);
		private static final EntityDataAccessor<Boolean> ID_FOIL =
				SynchedEntityData.defineId(SteelThrowableProjectileEntity.class, EntityDataSerializers.BOOLEAN);
		
		protected boolean dealtDamage;
		public int clientSideReturnTridentTickCount;
		
		public SteelThrowableProjectileEntity(EntityType<? extends SteelThrowableProjectileEntity> entityType, Level level) {
				super(entityType, level);
		}
		
		public SteelThrowableProjectileEntity(EntityType<? extends SteelThrowableProjectileEntity> entity, LivingEntity thrower, Level level, ItemStack pickupItemStack) {
				super(entity, thrower, level, pickupItemStack, null);
				this.entityData.set(ID_LOYALTY, this.getLoyaltyFromItem(pickupItemStack));
				this.entityData.set(ID_FOIL, pickupItemStack.hasFoil());
		}
		
		public SteelThrowableProjectileEntity(EntityType entity, Level level, double x, double y, double z, ItemStack pickupItemStack) {
				super(entity, x, y, z, level, pickupItemStack, pickupItemStack);
				this.entityData.set(ID_LOYALTY, this.getLoyaltyFromItem(pickupItemStack));
				this.entityData.set(ID_FOIL, pickupItemStack.hasFoil());
		}
		
		@Override
		protected void defineSynchedData(SynchedEntityData.Builder builder) {
				super.defineSynchedData(builder);
				builder.define(ID_LOYALTY, (byte) 0);
				builder.define(ID_FOIL, false);
		}
		
		@Override
		public void tick() {
				if (this.inGroundTime > 4) {
						this.dealtDamage = true;
				}
				
				Entity entity = this.getOwner();
				int loyaltyLevel = this.entityData.get(ID_LOYALTY);
				
				if (loyaltyLevel > 0 && this.dealtDamage && entity != null) {
						if (!this.isAcceptableReturnOwner()) {
								if (!this.level().isClientSide && this.pickup == Pickup.ALLOWED) {
										this.spawnAtLocation(this.getPickupItem(), 0.1F);
								}
								this.discard();
						} else {
								this.setNoPhysics(true);
								Vec3 vec3 = entity.getEyePosition().subtract(this.position());
								this.setPosRaw(this.getX(), this.getY() + vec3.y * 0.015 * loyaltyLevel, this.getZ());
								if (this.level().isClientSide) {
										this.yOld = this.getY();
								}
								this.setDeltaMovement(this.getDeltaMovement().scale(0.95)
																	 .add(vec3.normalize().scale(0.05 * loyaltyLevel)));
								if (this.clientSideReturnTridentTickCount == 0) {
										this.playSound(SoundEvents.TRIDENT_RETURN, 10.0F, 1.0F);
								}
								++this.clientSideReturnTridentTickCount;
						}
				}
				
				super.tick();
		}
		
		protected boolean isAcceptableReturnOwner() {
				Entity entity = this.getOwner();
				return entity != null && entity.isAlive()
								 && (!(entity instanceof ServerPlayer) || !entity.isSpectator());
		}
		
		public boolean isFoil() {
				return this.entityData.get(ID_FOIL);
		}
		
		@Nullable
		@Override
		protected EntityHitResult findHitEntity(Vec3 startVec, Vec3 endVec) {
				return this.dealtDamage ? null : super.findHitEntity(startVec, endVec);
		}
		
		@Override
		protected void onHitEntity(EntityHitResult result) {
				Entity entity = result.getEntity();
				float speed = (float) this.getDeltaMovement().length();
				speed = (speed * 3 - 6.75F);
				if (speed < 0) {
						speed = 1 / Math.abs(speed);
				} else {
						speed++;
				}
				float f = 8.0F * speed;
				Entity owner = this.getOwner();
				DamageSource damageSource = this.damageSources().trident(this, owner == null ? this : owner);
				
				Level level = this.level();
				if (level instanceof ServerLevel serverLevel) {
						f = EnchantmentHelper.modifyDamage(serverLevel, this.getWeaponItem(), entity, damageSource, f);
				}
				
				this.dealtDamage = true;
				if (entity.hurt(damageSource, f)) {
						if (entity.getType() == EntityType.ENDERMAN) return;
						if (level instanceof ServerLevel serverLevel) {
								EnchantmentHelper.doPostAttackEffectsWithItemSource(
										serverLevel, entity, damageSource, this.getWeaponItem());
						}
						if (entity instanceof LivingEntity livingEntity) {
								this.doKnockback(livingEntity, damageSource);
								this.doPostHurtEffects(livingEntity);
						}
				}
				
				this.setDeltaMovement(this.getDeltaMovement().multiply(-0.01, -0.1, -0.01));
				this.playSound(SoundEvents.TRIDENT_HIT, 1.0F, 1.0F);
		}
		
		public ItemStack getWeaponItem() {
				return this.getPickupItemStackOrigin();
		}
		
		@Override
		protected boolean tryPickup(Player player) {
				return super.tryPickup(player)
								 || this.isNoPhysics() && this.ownedBy(player)
											 && player.getInventory().add(this.getPickupItem());
		}
		
		@Override
		protected ItemStack getDefaultPickupItem() {
				return new ItemStack(ModItems.Weapons.COLOSSAL_SWORD.get());
		}
		
		@Override
		protected net.minecraft.sounds.SoundEvent getDefaultHitGroundSoundEvent() {
				return SoundEvents.TRIDENT_HIT_GROUND;
		}
		
		@Override
		public void playerTouch(Player entity) {
				if (this.ownedBy(entity) || this.getOwner() == null) {
						super.playerTouch(entity);
				}
		}
		
		@Override
		public void readAdditionalSaveData(CompoundTag compound) {
				super.readAdditionalSaveData(compound);
				this.dealtDamage = compound.getBoolean("DealtDamage");
				this.entityData.set(ID_LOYALTY, this.getLoyaltyFromItem(this.getPickupItemStackOrigin()));
		}
		
		@Override
		public void addAdditionalSaveData(CompoundTag compound) {
				super.addAdditionalSaveData(compound);
				compound.putBoolean("DealtDamage", this.dealtDamage);
		}
		
		protected byte getLoyaltyFromItem(ItemStack stack) {
				if (this.level() instanceof ServerLevel serverLevel) {
						return (byte) Mth.clamp(
								EnchantmentHelper.getTridentReturnToOwnerAcceleration(serverLevel, stack, this), 0, 127);
				}
				return 0;
		}
		
		@Override
		public void tickDespawn() {
				int loyalty = this.entityData.get(ID_LOYALTY);
				if (this.pickup != Pickup.ALLOWED || loyalty <= 0) {
						super.tickDespawn();
				}
		}
		
		@Override
		protected float getWaterInertia() {
				return 0.99F;
		}
		
		@Override
		public boolean shouldRender(double x, double y, double z) {
				return true;
		}
}
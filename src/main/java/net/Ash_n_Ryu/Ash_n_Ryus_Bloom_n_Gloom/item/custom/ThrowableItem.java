package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item.custom;

import net.AshLeDrag.thingsfordays.entity.ModEntities;
import net.AshLeDrag.thingsfordays.entity.custom.SteelThrowableProjectileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Position;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ThrowableItem extends TridentItem {
		public static final double BASE_DAMAGE = 12.0d;
		public static final float SHOOT_POWER = 4.5f;
		public static final float SHOOT_DURATION = 45.0f;
		public static int USE_DURATION;
		
		
		public ThrowableItem(
				Properties properties, int useDuration) {
				super(properties);
				USE_DURATION = useDuration;
		}
		
		public static ItemAttributeModifiers createAttributes() {
				return ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, BASE_DAMAGE, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, (double)-2.9F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
		}
		
		public static Tool createToolProperties() {
				return new Tool(List.of(), 1.0F, 2);
		}
		
		public boolean canAttackBlock(
				BlockState state, Level level, BlockPos pos, Player player) {
				return !player.isCreative();
		}
		
		public @NotNull UseAnim getUseAnimation(ItemStack stack) {
				return UseAnim.SPEAR;
		}
		
		public int getUseDuration(ItemStack stack, LivingEntity entity) {
				return 72000;
		}
		
		public void releaseUsing(ItemStack stack, Level level, LivingEntity entityLiving, int timeLeft) {
				if (entityLiving instanceof Player player) {
						int i = this.getUseDuration(stack, entityLiving) - timeLeft;
						System.out.println(i);
						if (i >= 10) {
								float f = getPowerForTime(i);
								System.out.println(f);
								if (!((double)f < 0.1) && !isTooDamagedToUse(stack)) {
										Holder<SoundEvent> holder = EnchantmentHelper.pickHighestLevel(stack, EnchantmentEffectComponents.TRIDENT_SOUND).orElse(SoundEvents.TRIDENT_THROW);
										if (!level.isClientSide) {
												stack.hurtAndBreak(1, player, LivingEntity.getSlotForHand(entityLiving.getUsedItemHand()));
												System.out.println(stack);
												SteelThrowableProjectileEntity steelThrowableProjectile = new SteelThrowableProjectileEntity(ModEntities.STEEL_THROWABLE.get(), player, level, stack);
												steelThrowableProjectile.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, f, 1.0F);
												if (player.hasInfiniteMaterials()) {
														steelThrowableProjectile.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												}
												
												level.addFreshEntity(steelThrowableProjectile);
												level.playSound((Player)null, steelThrowableProjectile, (SoundEvent)holder.value(), SoundSource.PLAYERS, 1.0F, 1.0F);
												if (!player.hasInfiniteMaterials()) {
														player.getInventory().removeItem(stack);
												}
												
										}
								}
						}
				}
				
		}
		
		
		
		public static float getPowerForTime(int i) {
				float charge = (float) i;
				if(charge >= SHOOT_DURATION) {
						charge = SHOOT_DURATION;
				}
				float f = charge / SHOOT_DURATION;
				f = f * SHOOT_POWER;
				if(f < 1.0F) {
						f = 1.0F;
				}
				System.out.println(f);
				return f;
		}
		
		public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
				ItemStack itemstack = player.getItemInHand(hand);
				if (isTooDamagedToUse(itemstack)) {
						return InteractionResultHolder.fail(itemstack);
				} else if (EnchantmentHelper.getTridentSpinAttackStrength(itemstack, player) > 0.0F && !player.isInWaterOrRain()) {
						return InteractionResultHolder.fail(itemstack);
				} else {
						player.startUsingItem(hand);
						return InteractionResultHolder.consume(itemstack);
				}
		}
		
		private static boolean isTooDamagedToUse(ItemStack stack) {
				return stack.getDamageValue() >= stack.getMaxDamage() - 1;
		}
		
		public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
				return true;
		}
		
		public void postHurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
				stack.hurtAndBreak(1, attacker, EquipmentSlot.MAINHAND);
		}
		
		public int getEnchantmentValue() {
				return 1;
		}
		
		public Projectile asProjectile(Level level, Position pos, ItemStack stack, Direction direction) {
				SteelThrowableProjectileEntity steelThrowableProjectile = new SteelThrowableProjectileEntity(ModEntities.STEEL_THROWABLE.get(), level, pos.x(), pos.y(), pos.z(), stack.copyWithCount(1));
				steelThrowableProjectile.pickup = AbstractArrow.Pickup.ALLOWED;
				return steelThrowableProjectile;
		}
		
		public boolean canPerformAction(ItemStack stack, ItemAbility itemAbility) {
				return ItemAbilities.DEFAULT_TRIDENT_ACTIONS.contains(itemAbility);
		}
}

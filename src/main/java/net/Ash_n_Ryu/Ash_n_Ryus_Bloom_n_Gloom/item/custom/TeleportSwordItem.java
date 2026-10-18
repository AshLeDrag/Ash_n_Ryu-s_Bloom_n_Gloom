package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item.custom;

import net.AshLeDrag.thingsfordays.entity.custom.TeleportSpearProjectileEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Position;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TeleportSwordItem extends ThrowableItem {
		public static final double BASE_DAMAGE = 12.0d;
		public static final float SHOOT_POWER = 4.5f;
		public static final float SHOOT_DURATION = 45.0f;
		public static int USE_DURATION;
		public TeleportSwordItem(Properties properties, int useDuration) {
				super(properties, useDuration);
				USE_DURATION = useDuration;
		}
		
		public static ItemAttributeModifiers createAttributes() {
				return ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, BASE_DAMAGE, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, (double)-2.9F, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
		}
		
		public static Tool createToolProperties() {
				return new Tool(List.of(), 1.0F, 2);
		}
		
		public int getUseDuration(ItemStack stack, LivingEntity entity) {
				return USE_DURATION;
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
												TeleportSpearProjectileEntity teleportSpearProjectileEntity = new TeleportSpearProjectileEntity(player, level, stack);
												teleportSpearProjectileEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, f, 1.0F);
												if (player.hasInfiniteMaterials()) {
														teleportSpearProjectileEntity.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
												}
												
												level.addFreshEntity(teleportSpearProjectileEntity);
												level.playSound((Player)null, teleportSpearProjectileEntity, (SoundEvent)holder.value(), SoundSource.PLAYERS, 1.0F, 1.0F);
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
		
		public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
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
		
		public @NotNull Projectile asProjectile(Level level, Position pos, ItemStack stack, Direction direction) {
				TeleportSpearProjectileEntity teleportSpearProjectileEntity = new TeleportSpearProjectileEntity(level, pos.x(), pos.y(), pos.z(), stack.copyWithCount(1));
				teleportSpearProjectileEntity.pickup = AbstractArrow.Pickup.ALLOWED;
				return teleportSpearProjectileEntity;
		}
		
}

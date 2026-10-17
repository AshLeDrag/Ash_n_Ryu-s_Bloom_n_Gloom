package net.Ash_n_Ryu.examplemod.util;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.component.ModDataComponents;
import net.AshLeDrag.thingsfordays.item.ModItems;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItemProperties {
		public static void addCustomItemProperties() {
				ItemProperties.register(ModItems.Tools.CHISEL.get(), ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "used"),
						(stack, level, entity, seed) -> stack.get(ModDataComponents.COORDINATES) != null ? 1f: 0f);
				
				makeCustomBow(ModItems.Breadinium.Weapons.BOW.get());
		}
		
		private static void makeCustomBow(Item item){
				ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"),
						(ClampedItemPropertyFunction)((p_344163_, p_344164_, p_344165_, p_344166_) -> {
								if (p_344165_ == null) {
										return 0.0F;
								} else {
										return p_344165_.getUseItem() != p_344163_ ? 0.0F : (float)(p_344163_.getUseDuration(p_344165_) - p_344165_.getUseItemRemainingTicks()) / 20.0F;
								}
						}));
				ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"),
						(ClampedItemPropertyFunction)((p_174630_, p_174631_, p_174632_, p_174633_) -> p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F));
				
		}
}

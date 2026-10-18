package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.event;


import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.item.ModItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ComputeFovModifierEvent;



@EventBusSubscriber(modid = Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, value =  Dist.CLIENT)
public class ModClientEvents {
		@SubscribeEvent
		public static void onComputeFovModifierEvent(ComputeFovModifierEvent event) {
				if(event.getPlayer().isUsingItem() && event.getPlayer().getUseItem().getItem() == ModItems.Mantisite.Weapons.BOW.get()) {
						float fovModifier = 1f;
						int ticksUsingItem = event.getPlayer().getTicksUsingItem();
						float deltaTicks = (float)ticksUsingItem / 20f;
						if(deltaTicks > 1f) {
								deltaTicks = 1f;
						} else {
								deltaTicks *= deltaTicks;
						}
						fovModifier *= 1f - deltaTicks * 0.15f;
						event.setNewFovModifier(fovModifier);
				}
		}
}


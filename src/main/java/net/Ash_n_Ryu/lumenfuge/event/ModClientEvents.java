package net.Ash_n_Ryu.lumenfuge.event;


import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.item.ModItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ComputeFovModifierEvent;



@EventBusSubscriber(modid = Lumenfuge.MOD_ID, value =  Dist.CLIENT)
public class ModClientEvents {
		@SubscribeEvent
		public static void onComputeFovModifierEvent(ComputeFovModifierEvent event) {
				if(event.getPlayer().isUsingItem() && event.getPlayer().getUseItem().getItem() == ModItems.MANTISITE_SWORD.get()) {
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


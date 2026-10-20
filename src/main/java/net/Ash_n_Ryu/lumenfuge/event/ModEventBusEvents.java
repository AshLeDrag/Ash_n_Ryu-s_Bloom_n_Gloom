package net.Ash_n_Ryu.lumenfuge.event;


import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = Lumenfuge.MOD_ID)
public class ModEventBusEvents {
		@SubscribeEvent
		public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
		}
}


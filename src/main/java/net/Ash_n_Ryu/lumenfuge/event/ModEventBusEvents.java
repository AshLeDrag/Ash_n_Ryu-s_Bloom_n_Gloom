package net.Ash_n_Ryu.lumenfuge.event;


import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.ModEntities;
import net.Ash_n_Ryu.lumenfuge.entity.client.ArogModel;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ArogEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = Lumenfuge.MOD_ID)
public class ModEventBusEvents {
		@SubscribeEvent
		public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
			event.registerLayerDefinition(ArogModel.LAYER_LOCATION, ArogModel::createBodyLayer);
		}

		@SubscribeEvent
		public static void registerAttributes(EntityAttributeCreationEvent event) {
			event.put(ModEntities.AROG.get(), ArogEntity.createAttributes().build());
		}

}


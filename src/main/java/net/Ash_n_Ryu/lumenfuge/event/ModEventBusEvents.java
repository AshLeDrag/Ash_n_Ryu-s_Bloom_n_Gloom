package net.Ash_n_Ryu.lumenfuge.event;


import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.ModEntities;
import net.Ash_n_Ryu.lumenfuge.entity.client.ArogModel;
import net.Ash_n_Ryu.lumenfuge.entity.client.ZepiModel;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ArogEntity;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ZepiEntity;
import net.minecraft.world.entity.SpawnPlacementType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

@EventBusSubscriber(modid = Lumenfuge.MOD_ID)
public class ModEventBusEvents {
		@SubscribeEvent
		public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
			event.registerLayerDefinition(ArogModel.LAYER_LOCATION, ArogModel::createBodyLayer);
			event.registerLayerDefinition(ZepiModel.LAYER_LOCATION, ZepiModel::createBodyLayer);
		}

		@SubscribeEvent
		public static void registerAttributes(EntityAttributeCreationEvent event) {
			event.put(ModEntities.AROG.get(), ArogEntity.createAttributes().build());
			event.put(ModEntities.ZEPI.get(), ZepiEntity.createAttributes().build());
		}
		
		@SubscribeEvent
		public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event){
				event.register(ModEntities.AROG.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES
						,Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
				event.register(ModEntities.ZEPI.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES
						,Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
		}

}


package net.Ash_n_Ryu.lumenfuge.event;


import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.ModEntities;
import net.Ash_n_Ryu.lumenfuge.entity.client.ArogModel;
import net.Ash_n_Ryu.lumenfuge.entity.client.EtheralKnightPhase1Model;
import net.Ash_n_Ryu.lumenfuge.entity.client.EtheralKnightTransitionModel;
import net.Ash_n_Ryu.lumenfuge.entity.client.EtheralKnightPhase2Model;
import net.Ash_n_Ryu.lumenfuge.entity.client.ZepiModel;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ArogEntity;
import net.Ash_n_Ryu.lumenfuge.entity.custom.ZepiEntity;
import net.Ash_n_Ryu.lumenfuge.entity.custom.boss.EtheralKnightEntity;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
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
			event.registerLayerDefinition(EtheralKnightPhase1Model.LAYER_LOCATION, EtheralKnightPhase1Model::createBodyLayer);
			event.registerLayerDefinition(EtheralKnightTransitionModel.LAYER_LOCATION, EtheralKnightTransitionModel::createBodyLayer);
			event.registerLayerDefinition(EtheralKnightPhase2Model.LAYER_LOCATION, EtheralKnightPhase2Model::createBodyLayer);
		}

		@SubscribeEvent
		public static void registerAttributes(EntityAttributeCreationEvent event) {
			event.put(ModEntities.AROG.get(), ArogEntity.createAttributes().build());
			event.put(ModEntities.ZEPI.get(), ZepiEntity.createAttributes().build());
			event.put(ModEntities.EtheralKnight.get(), EtheralKnightEntity.createAttributes().build());
		}
		
		@SubscribeEvent
		public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event){
				event.register(ModEntities.AROG.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES
						,Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
				event.register(ModEntities.ZEPI.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES
						,Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
				event.register(ModEntities.EtheralKnight.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES
						, Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
		}

}


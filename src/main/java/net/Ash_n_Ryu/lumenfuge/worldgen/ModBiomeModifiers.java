package net.Ash_n_Ryu.lumenfuge.worldgen;


import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.ModEntities;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;

public class ModBiomeModifiers {
		
		
		
		
		public static final ResourceKey<BiomeModifier> ADD_TREE_ERNEST = registerKey("add_tree_ernest");
		
		
		public static final ResourceKey<BiomeModifier> SPAWN_AROG_AND_ZEPI = registerKey("spawn_arog_and_zepi");
		
		
		
		
		
		
		public static void bootstrap(BootstrapContext<BiomeModifier> context) {
				// CF -> PF -> BM
				var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
				var biomes = context.lookup(Registries.BIOME);
				
				context.register(ADD_TREE_ERNEST, new BiomeModifiers.AddFeaturesBiomeModifier(
						HolderSet.direct(biomes.getOrThrow(ModBiomes.BLOOM_GLOOM)),
						HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ERNEST_PLACED_KEY)),
						GenerationStep.Decoration.VEGETAL_DECORATION
				));
				
				
				context.register(SPAWN_AROG_AND_ZEPI, new BiomeModifiers.AddSpawnsBiomeModifier(
						HolderSet.direct(biomes.getOrThrow(ModBiomes.BLOOM_GLOOM)),
						List.of(new MobSpawnSettings.SpawnerData(ModEntities.AROG.get(), 20, 2, 4),
								new MobSpawnSettings.SpawnerData(ModEntities.ZEPI.get(), 20, 2, 4))
				));
				
				
		}
		
		private static ResourceKey<BiomeModifier> registerKey(String name) {
				return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, name));
		}
}
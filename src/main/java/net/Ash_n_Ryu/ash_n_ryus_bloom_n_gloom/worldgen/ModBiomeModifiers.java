package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.worldgen;


import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
		
		//     ============ ====   == == == == ==   == ==== ============
		// ============ ==== ==== == == ORES == == ==== ==== ==== ==========
		//     ============ ====   == == == == ==   == ==== ============
		
		/* ======================= Mantisite ======================= */
		
		
		public static final ResourceKey<BiomeModifier> ADD_MANTISITE_ORE = registerKey("add_mantisite_ore");
		
		//     ============ ====   == == === == ==   == ==== ============
		// ============ ==== ==== == == TREES == == ==== ==== ==== ==========
		//     ============ ====   == == === == ==   == ==== ============
		
		public static final ResourceKey<BiomeModifier> ADD_TREE_ERNEST = registerKey("add_tree_ernest");
		
		
		
		
		
		
		public static void bootstrap(BootstrapContext<BiomeModifier> context) {
				// CF -> PF -> BM
				var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
				var biomes = context.lookup(Registries.BIOME);
				
				
				//     ============ ====   == == == == ==   == ==== ============
				// ============ ==== ==== == == ORES == == ==== ==== ==== ==========
				//     ============ ====   == == == == ==   == ==== ============
				
				/* ======================= Mantisite ======================= */
				
				context.register(ADD_MANTISITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
						biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
						HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MANTISITE_ORE_PLACED_KEY)),
						GenerationStep.Decoration.UNDERGROUND_ORES
				));
				// Biome specific example
				//
				//	context.register(ADD_MANTISITE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
				//			HolderSet.direct(biomes.getOrThrow(Biomes.PLAINS)),
				//			HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MANTISITE_ORE_PLACED_KEY)),
				//			GenerationStep.Decoration.UNDERGROUND_ORES
				//	));
				
				
				
				
				
				
				
				//     ============ ====   == == === == ==   == ==== ============
				// ============ ==== ==== == == TREES == == ==== ==== ==== ==========
				//     ============ ====   == == === == ==   == ==== ============
				
				context.register(ADD_TREE_ERNEST, new BiomeModifiers.AddFeaturesBiomeModifier(
						HolderSet.direct(biomes.getOrThrow(ModBiomes.BLOOM_GLOOM)),
						HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ERNEST_PLACED_KEY)),
						GenerationStep.Decoration.VEGETAL_DECORATION
				));
		}
		
		private static ResourceKey<BiomeModifier> registerKey(String name) {
				return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, name));
		}
}
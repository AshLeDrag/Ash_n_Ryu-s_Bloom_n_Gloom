package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.worldgen;


import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
		
		//     ============ ====   == == == == ==   == ==== ============
		// ============ ==== ==== == == ORES == == ==== ==== ==== ==========
		//     ============ ====   == == == == ==   == ==== ============
		
		/* ======================= Mantisite ======================= */
		
		public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MANTISITE_ORE_KEY = registerKey("mantisite_ore");
		
		
		
		
		
		//     ============ ====   == == === == ==   == ==== ============
		// ============ ==== ==== == == TREES == == ==== ==== ==== ==========
		//     ============ ====   == == === == ==   == ==== ============
		
		
		public static final ResourceKey<ConfiguredFeature<?, ?>> ERNEST_KEY = registerKey("ernest");
		
		
		
		public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
				
				RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
				RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
				
				List<OreConfiguration.TargetBlockState> overworldMantisiteOres = List.of(
						OreConfiguration.target(stoneReplaceables, ModBlocks.MANTISTE_ORE.get().defaultBlockState()),
						OreConfiguration.target(deepslateReplaceables, ModBlocks.MANTISTE_DEEPSLATE_ORE.get().defaultBlockState()));
				
				register(context, OVERWORLD_MANTISITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMantisiteOres, 9));
				
				
				// ── Giant Ernest Sequoia ─────────────────────────────────────────────
				// Height: 60 + rand(0..55) = 60 to 115 blocks tall (clamped in getTreeHeight)
				// Trunk:  2x2 logs via GiantSequoiaTrunkPlacer (bypasses vanilla 80-block cap)
				// Foliage: MegaPineFoliagePlacer gives layered pine-crown rings at each
				//          foliage attachment (trunk top + every branch tip)
				register(context, ERNEST_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
						BlockStateProvider.simple(ModBlocks.ERNEST_LOG.get()),
						new ForkingTrunkPlacer(60, 40, 15),    // 60 + 0..55 = exactly 60-115 blocks
						
						BlockStateProvider.simple(ModBlocks.ERNEST_LEAVES.get()),
						new MegaPineFoliagePlacer(
								ConstantInt.of(0),                  // radius (spread handled by trunk placer)
								ConstantInt.of(0),                  // offset
								ConstantInt.of(13)),                // crown height (layers of leaves per attachment)
						
						// Lower size 3: needs 3-block radius clear at base (covers the 3x3 trunk)
						// Upper size 3: needs 3-block radius clear above height 1
						new TwoLayersFeatureSize(1, 3, 3))
																					.ignoreVines()
																					.build());
				
				
		
		}
		
		public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
				return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, name));
		}
		
		private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
				ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
				context.register(key, new ConfiguredFeature<>(feature, configuration));
		}
}

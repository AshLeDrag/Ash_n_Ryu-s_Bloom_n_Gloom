package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.worldgen;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.block.ModBlocks;
import net.AshLeDrag.thingsfordays.worldgen.trunkplacers.GiantSequoiaTrunkPlacer;
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
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
		
		//     ============ ====   == == == == ==   == ==== ============
		// ============ ==== ==== == == ORES == == ==== ==== ==== ==========
		//     ============ ====   == == == == ==   == ==== ============
		
		/* ======================= Breadinium ======================= */
		
		public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BREADINIUM_ORE_KEY = registerKey("breadinium_ore");
		public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_BREADINIUM_ORE_KEY = registerKey("nether_breadinium_ore");
		public static final ResourceKey<ConfiguredFeature<?, ?>> END_BREADINIUM_ORE_KEY = registerKey("end_breadinium_ore");
		
		public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MYTHRIL_ORE_KEY = registerKey("mythril_ore");
		public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_MYTHRIL_ORE_KEY   = registerKey("nether_mythril_ore");
		public static final ResourceKey<ConfiguredFeature<?, ?>> END_MYTHRIL_ORE_KEY      = registerKey("end_mythril_ore");
		
		
		
		
		
		//     ============ ====   == == === == ==   == ==== ============
		// ============ ==== ==== == == TREES == == ==== ==== ==== ==========
		//     ============ ====   == == === == ==   == ==== ============
		
		
		public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("redwood");
		
		
		
		public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
				
				RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
				RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
				RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
				RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
				
				List<OreConfiguration.TargetBlockState> overworldBreadiniumOres = List.of(
						OreConfiguration.target(stoneReplaceables, ModBlocks.BREADINIUM_ORE.get().defaultBlockState()),
						OreConfiguration.target(deepslateReplaceables, ModBlocks.BREADINIUM_DEEPSLATE_ORE.get().defaultBlockState()));
				
				register(context, OVERWORLD_BREADINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldBreadiniumOres, 9));
				
				register(context, NETHER_BREADINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
						ModBlocks.BREADINIUM_NETHER_ORE.get().defaultBlockState(), 9));
				
				register(context, END_BREADINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
						ModBlocks.BREADINIUM_END_ORE.get().defaultBlockState(), 9));
				
				// ── Giant Redwood Sequoia ─────────────────────────────────────────────
				// Height: 60 + rand(0..55) = 60 to 115 blocks tall (clamped in getTreeHeight)
				// Trunk:  2x2 logs via GiantSequoiaTrunkPlacer (bypasses vanilla 80-block cap)
				// Foliage: MegaPineFoliagePlacer gives layered pine-crown rings at each
				//          foliage attachment (trunk top + every branch tip)
				register(context, REDWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
						BlockStateProvider.simple(ModBlocks.REDWOOD_LOG.get()),
						new GiantSequoiaTrunkPlacer(60, 40, 15),    // 60 + 0..55 = exactly 60-115 blocks
						
						BlockStateProvider.simple(ModBlocks.REDWOOD_LEAVES.get()),
						new MegaPineFoliagePlacer(
								ConstantInt.of(0),                  // radius (spread handled by trunk placer)
								ConstantInt.of(0),                  // offset
								ConstantInt.of(13)),                // crown height (layers of leaves per attachment)
						
						// Lower size 3: needs 3-block radius clear at base (covers the 3x3 trunk)
						// Upper size 3: needs 3-block radius clear above height 1
						new TwoLayersFeatureSize(1, 3, 3))
																					.ignoreVines()
																					.build());
				
				List<OreConfiguration.TargetBlockState> overworldMythrilOres = List.of(
						OreConfiguration.target(stoneReplaceables,    ModBlocks.MYTHRIL_ORE.get().defaultBlockState()),
						OreConfiguration.target(deepslateReplaceables, ModBlocks.MYTHRIL_DEEPSLATE_ORE.get().defaultBlockState()));
				
				register(context, OVERWORLD_MYTHRIL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMythrilOres, 9));
				register(context, NETHER_MYTHRIL_ORE_KEY,   Feature.ORE, new OreConfiguration(netherrackReplaceables,
						ModBlocks.MYTHRIL_NETHER_ORE.get().defaultBlockState(), 9));
				register(context, END_MYTHRIL_ORE_KEY,      Feature.ORE, new OreConfiguration(endReplaceables,
						ModBlocks.MYTHRIL_END_ORE.get().defaultBlockState(), 9));
		
		}
		
		public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
				return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, name));
		}
		
		private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
				ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
				context.register(key, new ConfiguredFeature<>(feature, configuration));
		}
}

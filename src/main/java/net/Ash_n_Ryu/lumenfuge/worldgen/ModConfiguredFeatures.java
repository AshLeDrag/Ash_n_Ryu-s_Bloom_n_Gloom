package net.Ash_n_Ryu.lumenfuge.worldgen;


import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
		
		public static final ResourceKey<ConfiguredFeature<?, ?>> ERNEST_KEY = registerKey("ernest");
		public static final ResourceKey<ConfiguredFeature<?, ?>> ALIVE_ERNEST_KEY = registerKey("alive_ernest");
		
		
		
		public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
				
				
				
				
				register(context, ERNEST_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
						BlockStateProvider.simple(ModBlocks.ERNEST_LOG.get()),
						new ForkingTrunkPlacer(4, 4, 3),
						
						BlockStateProvider.simple(ModBlocks.DEAD_ERNEST_LEAVES.get()),
						new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(3), 3),
						
						new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
				
				register(context, ALIVE_ERNEST_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
						BlockStateProvider.simple(ModBlocks.ERNEST_LOG.get()),
						new ForkingTrunkPlacer(4, 4, 3),
						
						BlockStateProvider.simple(ModBlocks.ERNEST_LEAVES.get()),
						new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(3), 3),
						
						new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
				
				
		
		}
		
		public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
				return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, name));
		}
		
		private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
				ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
				context.register(key, new ConfiguredFeature<>(feature, configuration));
		}
}

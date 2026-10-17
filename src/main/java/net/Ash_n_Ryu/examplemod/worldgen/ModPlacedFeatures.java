package net.Ash_n_Ryu.examplemod.worldgen;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
		
		//     ============ ====   == == == == ==   == ==== ============
		// ============ ==== ==== == == ORES == == ==== ==== ==== ==========
		//     ============ ====   == == == == ==   == ==== ============
		
		/* ======================= Breadinium ======================= */
		
		public static final ResourceKey<PlacedFeature> BREADINIUM_ORE_PLACED_KEY = registerKey("breadinium_ore_placed");
		public static final ResourceKey<PlacedFeature> NETHER_BREADINIUM_ORE_PLACED_KEY = registerKey("nether_breadinium_ore_placed");
		public static final ResourceKey<PlacedFeature> END_BREADINIUM_ORE_PLACED_KEY = registerKey("end_breadinium_ore_placed");
		
		
		public static final ResourceKey<PlacedFeature> MYTHRIL_ORE_PLACED_KEY        = registerKey("mythril_ore_placed");
		public static final ResourceKey<PlacedFeature> NETHER_MYTHRIL_ORE_PLACED_KEY = registerKey("nether_mythril_ore_placed");
		public static final ResourceKey<PlacedFeature> END_MYTHRIL_ORE_PLACED_KEY    = registerKey("end_mythril_ore_placed");
		
		//     ============ ====   == == === == ==   == ==== ============
		// ============ ==== ==== == == TREES == == ==== ==== ==== ==========
		//     ============ ====   == == === == ==   == ==== ============
		
		
		public static final ResourceKey<PlacedFeature> REDWOOD_PLACED_KEY = registerKey("redwood_placed");
		
		
		
		
		public static void bootstrap(BootstrapContext<PlacedFeature> context) {
				var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
				
				//     ============ ====   == == == == ==   == ==== ============
				// ============ ==== ==== == == ORES == == ==== ==== ==== ==========
				//     ============ ====   == == == == ==   == ==== ============
				
				/* ======================= Breadinium ======================= */
				
				register(context, BREADINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_BREADINIUM_ORE_KEY),
							ModOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
				register(context, NETHER_BREADINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_BREADINIUM_ORE_KEY),
							ModOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
				register(context, END_BREADINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_BREADINIUM_ORE_KEY),
							ModOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
				
				
				
				
				
				
				register(context, MYTHRIL_ORE_PLACED_KEY,
						configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_MYTHRIL_ORE_KEY),
						ModOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
				register(context, NETHER_MYTHRIL_ORE_PLACED_KEY,
						configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_MYTHRIL_ORE_KEY),
						ModOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
				register(context, END_MYTHRIL_ORE_PLACED_KEY,
						configuredFeatures.getOrThrow(ModConfiguredFeatures.END_MYTHRIL_ORE_KEY),
						ModOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
				
				
				//     ============ ====   == == === == ==   == ==== ============
				// ============ ==== ==== == == TREES == == ==== ==== ==== ==========
				//     ============ ====   == == === == ==   == ==== ============
				
				
				register(context, REDWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.REDWOOD_KEY),
						VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.REDWOOD_SAPLING.get()));
				
		}
		
		private static ResourceKey<PlacedFeature> registerKey(String name) {
				return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, name));
		}
		
		private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
				List<PlacementModifier> modifiers) {
				context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
		}
}
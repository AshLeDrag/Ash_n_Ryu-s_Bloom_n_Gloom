package net.Ash_n_Ryu.lumenfuge.worldgen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.heightproviders.ConstantHeight;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.TerrainAdjustment;
import net.minecraft.world.level.levelgen.structure.structures.JigsawStructure;

public class ModStructures {
		public static final ResourceKey<Structure> Ethereal_Arena =
				ResourceKey.create(
						Registries.STRUCTURE,
						ResourceLocation.fromNamespaceAndPath(
								Lumenfuge.MOD_ID, "ethereal_arena"
						)
				);
		
		public static void bootstrap(BootstrapContext<Structure> context) {
				var biomes = context.lookup(Registries.BIOME);
				var pools = context.lookup(Registries.TEMPLATE_POOL);
				
				
				var settings = new Structure.StructureSettings.Builder(
						HolderSet.direct(biomes.getOrThrow(ModBiomes.BLOOM_GLOOM))
				)
											.generationStep(GenerationStep.Decoration.SURFACE_STRUCTURES)
											.terrainAdapation(TerrainAdjustment.BEARD_THIN)
											.build();
				
				context.register(Ethereal_Arena, new JigsawStructure(
						settings,
						pools.getOrThrow(ModTemplatePools.ETHEREAL_ARENA),
						1,
						ConstantHeight.of(VerticalAnchor.absolute(0)),
						false,
						Heightmap.Types.WORLD_SURFACE_WG
				));
		}
}

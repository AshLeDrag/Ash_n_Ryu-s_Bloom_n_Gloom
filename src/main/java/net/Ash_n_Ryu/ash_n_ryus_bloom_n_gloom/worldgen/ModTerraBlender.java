package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.worldgen;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerraBlender {
		public static void registerRegions() {
				Regions.register(new ModOverworldRegion(
						ResourceLocation.fromNamespaceAndPath(
								Ash_n_Ryus_Bloom_n_Gloom.MOD_ID,
								"overworld"
						),
						5
				));
		}
}
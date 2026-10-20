package net.Ash_n_Ryu.lumenfuge.worldgen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerraBlender {
		public static void registerRegions() {
				Regions.register(new ModOverworldRegion(
						ResourceLocation.fromNamespaceAndPath(
								Lumenfuge.MOD_ID,
								"overworld"
						),
						5
				));
		}
}
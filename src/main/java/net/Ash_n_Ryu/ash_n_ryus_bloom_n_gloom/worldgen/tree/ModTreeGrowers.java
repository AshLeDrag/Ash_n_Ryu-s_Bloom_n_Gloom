package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.worldgen.tree;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
		public static final TreeGrower ERNEST = new TreeGrower(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID + ":ernest",
				Optional.empty(), Optional.of(ModConfiguredFeatures.ERNEST_KEY), Optional.empty());
		
		
}

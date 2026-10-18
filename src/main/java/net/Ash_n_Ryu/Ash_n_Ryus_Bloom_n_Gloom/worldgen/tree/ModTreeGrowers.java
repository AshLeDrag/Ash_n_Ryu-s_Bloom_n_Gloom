package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.worldgen.tree;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
		public static final TreeGrower REDWOOD = new TreeGrower(ThingsForDays.MOD_ID + ":redwood",
				Optional.empty(), Optional.of(ModConfiguredFeatures.REDWOOD_KEY), Optional.empty());
		
		
}

package net.Ash_n_Ryu.lumenfuge.worldgen.tree;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
		public static final TreeGrower ERNEST = new TreeGrower(Lumenfuge.MOD_ID + ":ernest",
				Optional.empty(), Optional.of(ModConfiguredFeatures.ERNEST_KEY), Optional.empty());
		public static final TreeGrower ALIVE_ERNEST = new TreeGrower(Lumenfuge.MOD_ID + ":alive_ernest",
				Optional.empty(), Optional.of(ModConfiguredFeatures.ALIVE_ERNEST_KEY), Optional.empty());
		
		
}

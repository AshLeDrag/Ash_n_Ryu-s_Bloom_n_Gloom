package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.worldgen;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.worldgen.trunkplacers.GiantSequoiaTrunkPlacer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModTrunkPlacerTypes {
		
		public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER_TYPES =
				DeferredRegister.create(BuiltInRegistries.TRUNK_PLACER_TYPE, ThingsForDays.MOD_ID);
		
		public static final DeferredHolder<TrunkPlacerType<?>, TrunkPlacerType<GiantSequoiaTrunkPlacer>> GIANT_SEQUOIA_TRUNK_PLACER =
				TRUNK_PLACER_TYPES.register("giant_sequoia_trunk_placer",
						() -> new TrunkPlacerType<>(GiantSequoiaTrunkPlacer.CODEC));
}
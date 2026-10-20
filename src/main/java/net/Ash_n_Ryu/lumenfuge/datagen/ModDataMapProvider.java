package net.Ash_n_Ryu.lumenfuge.datagen;

import net.Ash_n_Ryu.lumenfuge.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
	protected ModDataMapProvider(PackOutput packOutput,
	                             CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(packOutput,
		      lookupProvider);
	}
	
	@Override
	protected void gather(HolderLookup.Provider provider) {
		this.builder(NeoForgeDataMaps.FURNACE_FUELS)
			.add(ModItems.Fuels.STARLIGHT_ASHES.getId(), new FurnaceFuel(1200), false);
		
		this.builder(NeoForgeDataMaps.COMPOSTABLES)
				.add(ModItems.Foods.RADISH.getId(), new Compostable(0.25f), false)
				.add(ModItems.Foods.RADISH.getId(), new Compostable(0.45f), false);
	}
}

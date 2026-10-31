package net.Ash_n_Ryu.lumenfuge.datagen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.worldgen.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {
		public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
																				 .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
																				 .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
																				 .add(Registries.BIOME, ModBiomes::bootstrap)
																				 .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap)
																				 .add(Registries.TEMPLATE_POOL, ModTemplatePools::bootstrap)
																				 .add(Registries.STRUCTURE, ModStructures::bootstrap)
																				 .add(Registries.STRUCTURE_SET, ModStructureSets::bootstrap);
		
		public ModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
				super(output, registries, BUILDER, Set.of(Lumenfuge.MOD_ID));
		}
}


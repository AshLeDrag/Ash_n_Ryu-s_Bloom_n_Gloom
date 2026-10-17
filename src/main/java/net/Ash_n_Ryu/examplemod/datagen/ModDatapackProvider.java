package net.Ash_n_Ryu.examplemod.datagen;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.enchantment.ModEnchantments;
import net.AshLeDrag.thingsfordays.worldgen.ModBiomeModifiers;
import net.AshLeDrag.thingsfordays.worldgen.ModConfiguredFeatures;
import net.AshLeDrag.thingsfordays.worldgen.ModPlacedFeatures;
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
																				 .add(Registries.ENCHANTMENT, ModEnchantments::bootstrap)
																				 .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
																				 .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
																				 .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
		
		public ModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
				super(output, registries, BUILDER, Set.of(ThingsForDays.MOD_ID));
		}
}


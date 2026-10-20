package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.datagen;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.enchantment.ModEnchantments;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.worldgen.ModBiomeModifiers;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.worldgen.ModBiomes;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.worldgen.ModConfiguredFeatures;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.worldgen.ModPlacedFeatures;
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
																				 .add(Registries.BIOME, ModBiomes::bootstrap)
																				 .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
		
		public ModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
				super(output, registries, BUILDER, Set.of(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID));
		}
}


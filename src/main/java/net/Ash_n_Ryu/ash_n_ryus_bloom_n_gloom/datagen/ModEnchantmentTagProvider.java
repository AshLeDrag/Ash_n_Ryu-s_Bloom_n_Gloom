package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.datagen;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EnchantmentTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModEnchantmentTagProvider extends EnchantmentTagsProvider {
		public ModEnchantmentTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
				ExistingFileHelper existingFileHelper) {
				super(output, lookupProvider, Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, existingFileHelper);
		}
		
		@Override
		protected void addTags(HolderLookup.Provider provider) {
				tag(ModTags.Enchantments.RETURN_EXCLUSIVES)
						.addOptional(ResourceLocation.fromNamespaceAndPath(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, "teleportation_with_colossal_sword"))
						.addOptional(ResourceLocation.fromNamespaceAndPath(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, "gather"))
						.addOptional(ResourceLocation.fromNamespaceAndPath("minecraft", "loyalty"));
		}
}
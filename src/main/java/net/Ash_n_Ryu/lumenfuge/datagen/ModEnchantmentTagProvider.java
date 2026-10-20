package net.Ash_n_Ryu.lumenfuge.datagen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EnchantmentTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModEnchantmentTagProvider extends EnchantmentTagsProvider {
		public ModEnchantmentTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
				ExistingFileHelper existingFileHelper) {
				super(output, lookupProvider, Lumenfuge.MOD_ID, existingFileHelper);
		}
		
		@Override
		protected void addTags(HolderLookup.Provider provider) {
				tag(ModTags.Enchantments.RETURN_EXCLUSIVES)
						.addOptional(ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "teleportation_with_colossal_sword"))
						.addOptional(ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "gather"))
						.addOptional(ResourceLocation.fromNamespaceAndPath("minecraft", "loyalty"));
		}
}
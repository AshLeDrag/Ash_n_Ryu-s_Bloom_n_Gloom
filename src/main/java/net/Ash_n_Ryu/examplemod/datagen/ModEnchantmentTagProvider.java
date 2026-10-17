package net.Ash_n_Ryu.examplemod.datagen;

import net.Ash_n_Ryu.examplemod.ExampleMod;
import net.Ash_n_Ryu.examplemod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EnchantmentTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModEnchantmentTagProvider extends EnchantmentTagsProvider {
		public ModEnchantmentTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
				ExistingFileHelper existingFileHelper) {
				super(output, lookupProvider, ExampleMod.MOD_ID, existingFileHelper);
		}
		
		@Override
		protected void addTags(HolderLookup.Provider provider) {
				tag(ModTags.Enchantments.RETURN_EXCLUSIVES)
						.addOptional(ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "teleportation_with_colossal_sword"))
						.addOptional(ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "gather"))
						.addOptional(ResourceLocation.fromNamespaceAndPath("minecraft", "loyalty"));
		}
}
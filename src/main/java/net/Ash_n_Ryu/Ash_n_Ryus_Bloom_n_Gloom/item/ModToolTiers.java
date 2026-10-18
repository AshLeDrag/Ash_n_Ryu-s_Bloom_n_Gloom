package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item;


import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
		public static final Tier MANTISITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_MANTISITE_TOOL,
																		  900, 7.5f, 2f, 28, () -> Ingredient.of(ModItems.Mantisite.Resource.INGOT));
		

}

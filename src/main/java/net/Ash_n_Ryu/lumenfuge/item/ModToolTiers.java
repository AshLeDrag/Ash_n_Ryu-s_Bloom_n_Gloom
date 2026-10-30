package net.Ash_n_Ryu.lumenfuge.item;


import net.Ash_n_Ryu.lumenfuge.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
		public static final Tier MANTISITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_MANTISITE_TOOL,
																		  4096, 11f, 6f, 22, () -> Ingredient.of(ModItems.MANTISITE_SHARD));
		

}
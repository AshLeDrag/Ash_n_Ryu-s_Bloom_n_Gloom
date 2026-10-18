package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.datagen;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.ModBlocks;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item.ModItems;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.recipe.WeaponForgeRecipeBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
		public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
				super(output, registries);
		}
		
		@Override
		protected void buildRecipes(RecipeOutput recipeOutput) {
				
				ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.Mantisite.Tools.HAMMER.get())
						.requires(ModItems.Mantisite.Tools.AXE_HAMMER)
						.unlockedBy("has_bismuth_block", has(ModItems.Mantisite.Resource.INGOT)).save(recipeOutput);
				
				
				ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.Weapons.COLOSSAL_SWORD)
						.pattern("SMS")
						.pattern("SSS")
						.pattern("LTL")
						.define('S', ModItems.Steel.Stainless.Resource.INGOT)
						.define('M', ModItems.Mana.Resource.PURE_MANA)
						.define('L', Items.LEATHER)
						.define('T', Items.STICK)
						.unlockedBy("has_pure_mana", has(ModItems.Mana.Resource.PURE_MANA))
						.unlockedBy("has_stainless_steel_ingot", has(ModItems.Steel.Stainless.Resource.INGOT)).save(recipeOutput);
				
				
				List<ItemLike> MANTISITE_SMELTABLES = List.of(ModItems.Mantisite.Resource.RAW,
						ModBlocks.MANTISITE_ORE, ModBlocks.MANTISITE_DEEPSLATE_ORE,
						ModBlocks.MANTISITE_NETHER_ORE, ModBlocks.MANTISITE_END_ORE);
				
				
				
				oreRecipies(recipeOutput, MANTISITE_SMELTABLES, RecipeCategory.MISC, ModItems.Mantisite.Resource.INGOT, ModBlocks.MANTISITE_BLOCK, 0.25f,  600, "mantisite");
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
				float pExperience, int pCookingTIme, String pGroup) {
				oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
						pExperience, pCookingTIme, pGroup, "_from_smelting");
		}
		
		protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
				float pExperience, int pCookingTime, String pGroup) {
				oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
						pExperience, pCookingTime, pGroup, "_from_blasting");
		}
		
		protected static void oreRecipies(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, ItemLike pBlock,
				float pExperience, int pCookingTime, String pGroup) {
				
				oreSmelting(recipeOutput, pIngredients, pCategory, pResult, pExperience, pCookingTime*2, pGroup);
				oreBlasting(recipeOutput, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup);
				
				ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pBlock)
						.pattern("BBB")
						.pattern("BBB")
						.pattern("BBB")
						.define('B', pResult)
						.unlockedBy("has_" + getItemName(pResult), has(pResult)).save(recipeOutput);
				
				ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 9)
						.requires(pBlock)
						.unlockedBy("has_" + getItemName(pBlock), has(pBlock)).save(recipeOutput);
		}
		
		protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
				List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
				for(ItemLike itemlike : pIngredients) {
						SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
								.save(recipeOutput, ThingsForDays.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
				}
		}
}

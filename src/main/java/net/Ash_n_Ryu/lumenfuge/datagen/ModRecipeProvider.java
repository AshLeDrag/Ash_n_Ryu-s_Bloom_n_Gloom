package net.Ash_n_Ryu.lumenfuge.datagen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.block.ModBlocks;
import net.Ash_n_Ryu.lumenfuge.item.ModItems;
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
				ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MANTISITE_PICKAXE.get())
						.pattern("MMM")
						.pattern(" B ")
						.pattern(" B ")
						.define('B', Items.STICK )
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MANTISITE_AXE.get())
						.pattern("MM")
						.pattern("MB")
						.pattern(" B")
						.define('B', Items.STICK )
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				
				ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MANTISITE_HOE.get())
						.pattern("MM")
						.pattern("B ")
						.pattern("B ")
						.define('B', Items.STICK )
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				
				ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MANTISITE_SWORD.get())
						.pattern("M")
						.pattern("M")
						.pattern("B")
						.define('B', Items.STICK )
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MANTISITE_SHOVEL.get())
						.pattern("M")
						.pattern("B")
						.pattern("B")
						.define('B', Items.STICK )
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				
				ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANTISITE_BLOCK.get())
						.pattern("MMM")
						.pattern("MMM")
						.pattern("MMM")
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				
				ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MANTISITE_SHARD.get(), 9)
						.requires(ModBlocks.MANTISITE_BLOCK.get())
						.unlockedBy("has_" + getItemName(ModBlocks.MANTISITE_BLOCK.get()), has(ModBlocks.MANTISITE_BLOCK.get())).save(recipeOutput);
				
				
				
				ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MANTISITE_HELMET.get())
						.pattern("MMM")
						.pattern("M M")
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				
				
				ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MANTISITE_CHESTPLATE.get())
						.pattern("M M")
						.pattern("MMM")
						.pattern("MMM")
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				
				
				ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MANTISITE_LEGGINGS.get())
						.pattern("MMM")
						.pattern("M M")
						.pattern("M M")
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				
				
				ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MANTISITE_BOOTS.get())
						.pattern("M M")
						.pattern("M M")
						.define('M', ModItems.MANTISITE_SHARD.get())
						.unlockedBy("has_mantisite_shard", has(ModItems.MANTISITE_SHARD.get())).save(recipeOutput);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
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
								.save(recipeOutput, Lumenfuge.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
				}
		}
}

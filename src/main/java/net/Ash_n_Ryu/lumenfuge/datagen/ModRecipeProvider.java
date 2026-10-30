package net.Ash_n_Ryu.lumenfuge.datagen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.block.ModBlocks;
import net.Ash_n_Ryu.lumenfuge.item.ModItems;
import net.Ash_n_Ryu.lumenfuge.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
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
						.unlockedBy("has_mantisite_block", has(ModBlocks.MANTISITE_BLOCK.get())).save(recipeOutput);
				
				
				
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
				
				ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ETHERAL_KEY.get())
						.pattern(" H ")
						.pattern("TBT")
						.pattern("TBT")
						.define('H', ModItems.ETHERAL_KEY_BOW.get())
						.define('T', ModItems.ETHERAL_KEY_TOOTH.get())
						.define('B', ModItems.ETHERAL_KEY_BLADE.get())
						.unlockedBy("has_key_bow", has(ModItems.ETHERAL_KEY_BOW.get()))
						.unlockedBy("has_key_tooth", has(ModItems.ETHERAL_KEY_TOOTH.get()))
						.unlockedBy("has_key_blade", has(ModItems.ETHERAL_KEY_BLADE.get())).save(recipeOutput);
				
				ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ETHERAL_KEY_BOW.get())
						.pattern("G G")
						.pattern("GHG")
						.pattern("DND")
						.define('G', Items.GOAT_HORN)
						.define('H', Items.NETHERITE_HELMET)
						.define('D', Items.DIAMOND)
						.define('N', Items.NETHERITE_INGOT)
						.unlockedBy("has_netherite_helmet", has(Items.NETHERITE_INGOT)).save(recipeOutput);
				
				ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ETHERAL_KEY_TOOTH.get())
						.pattern(" I ")
						.pattern("IGI")
						.pattern("IGI")
						.define('I', Items.GOLD_INGOT)
						.define('G', Items.EMERALD)
						.unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
						.unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);
				
				ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ETHERAL_KEY_BLADE.get())
						.pattern("IGI")
						.pattern("IGI")
						.pattern("IGI")
						.define('I', Items.GOLD_INGOT)
						.define('G', Items.EMERALD)
						.unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
						.unlockedBy("has_emerald", has(Items.EMERALD)).save(recipeOutput);
				
				
				
				planksFromLogs(recipeOutput, ModBlocks.ERNEST_PLANKS, ModTags.Items.ERNEST_LOGS, 4);
				
				stairBuilder(ModBlocks.ERNEST_STAIRS.get(), Ingredient.of(ModBlocks.ERNEST_PLANKS)).group("stairs")
						.unlockedBy("has_ernest", has(ModBlocks.ERNEST_PLANKS)).save(recipeOutput);
				slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ERNEST_SLAB.get(), ModBlocks.ERNEST_PLANKS.get());
				
				buttonBuilder(ModBlocks.ERNEST_BUTTON.get(), Ingredient.of(ModBlocks.ERNEST_PLANKS.get())).group("buttons")
						.unlockedBy("has_ernest", has(ModBlocks.ERNEST_PLANKS.get())).save(recipeOutput);
				pressurePlate(recipeOutput, ModBlocks.ERNEST_PRESSURE_PLATE.get(), ModBlocks.ERNEST_PLANKS.get());
				
				fenceBuilder(ModBlocks.ERNEST_FENCE.get(), Ingredient.of(ModBlocks.ERNEST_PLANKS.get())).group("fences")
						.unlockedBy("has_ernest", has(ModBlocks.ERNEST_PLANKS.get())).save(recipeOutput);
				fenceGateBuilder(ModBlocks.ERNEST_FENCE_GATE.get(), Ingredient.of(ModBlocks.ERNEST_PLANKS.get())).group("fennnce_gates")
						.unlockedBy("has_ernest", has(ModBlocks.ERNEST_PLANKS.get())).save(recipeOutput);
				
				doorBuilder(ModBlocks.ERNEST_DOOR.get(), Ingredient.of(ModBlocks.ERNEST_PLANKS.get())).group("doors")
						.unlockedBy("has_ernest", has(ModBlocks.ERNEST_PLANKS.get())).save(recipeOutput);
				trapdoorBuilder(ModBlocks.ERNEST_TRAPDOOR.get(), Ingredient.of(ModBlocks.ERNEST_PLANKS.get())).group("trapdoors")
						.unlockedBy("has_ernest", has(ModBlocks.ERNEST_PLANKS.get())).save(recipeOutput);
				
				
				woodFromLogs(recipeOutput, ModBlocks.ERNEST_WOOD, ModBlocks.ERNEST_LOG);
				woodFromLogs(recipeOutput, ModBlocks.STRIPPED_ERNEST_WOOD, ModBlocks.STRIPPED_ERNEST_LOG);
				
				
				SmithingTransformRecipeBuilder.smithing(
						Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
						Ingredient.of(Items.DIAMOND_HORSE_ARMOR),
						Ingredient.of(ModItems.MANTISITE_SHARD),
						RecipeCategory.COMBAT,
						ModItems.MANTISITE_HORSE.get())
						.unlocks("has_mantisite_shard", has(ModItems.MANTISITE_SHARD))
						.save(recipeOutput, getItemName(ModItems.MANTISITE_HORSE) + "_smithing");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		}
}

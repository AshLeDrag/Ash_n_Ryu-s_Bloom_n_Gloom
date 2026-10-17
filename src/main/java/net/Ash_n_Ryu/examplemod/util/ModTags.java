package net.Ash_n_Ryu.examplemod.util;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        
        public static final TagKey<Block> NEEDS_BREADINIUM_TOOL = createTag("needs_breadinium_tool");
        public static final TagKey<Block> INCORRECT_FOR_BREADINIUM_TOOL = createTag("incorrect_for_breadinium_tool");
        
        public static final TagKey<Block> NEEDS_CHROMIUM_TOOL = createTag("needs_chromium_tool");
        public static final TagKey<Block> INCORRECT_FOR_CHROMIUM_TOOL = createTag("incorrect_for_chromium_tool");
        
        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");
        
        public static final TagKey<Block> NEEDS_STAINLESS_STEEL_TOOL = createTag("needs_stainless_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_STAINLESS_STEEL_TOOL = createTag("incorrect_for_stainless_steel_tool");
        
            public static final TagKey<Block> NEEDS_MYTHRIL_TOOL = createTag("needs_mythril_tool");
        public static final TagKey<Block> INCORRECT_FOR_MYTHRIL_TOOL = createTag("incorrect_for_mythril_tool");
        public static final TagKey<Block> INCORRECT_FOR_ORGA_TOOL = createTag("incorrect_for_orga_tool");
        public static final TagKey<Block> INCORRECT_FOR_POLNUMARIUM_TOOL = createTag("incorrect_for_polnumarium_tool");
        public static final TagKey<Block> INCORRECT_FOR_FATIUM_TOOL = createTag("incorrect_for_fatium_tool");
        public static final TagKey<Block> INCORRECT_FOR_TITANIUM_TOOL = createTag("incorrect_for_titanium_tool");
        public static final TagKey<Block> INCORRECT_FOR_HALIUM_TOOL = createTag("incorrect_for_halium_tool");
        public static final TagKey<Block> INCORRECT_FOR_UHEN_TOOL = createTag("incorrect_for_uhen_tool");
        public static final TagKey<Block> INCORRECT_FOR_MANTISITE_TOOL = createTag("incorrect_for_mantisite_tool");
        public static final TagKey<Block> INCORRECT_FOR_FARIUM_TOOL = createTag("incorrect_for_farium_tool");
        public static final TagKey<Block> INCORRECT_FOR_PLACINE_TOOL = createTag("incorrect_for_placine_tool");
        
        
        public static final TagKey<Block> BASIC_HAMMER_MINEABLE = createTag("hammer_mineable");
        public static final TagKey<Block> PICKAXE_HAMMER_MINEABLE = createTag("pickaxe_hammer_mineable");
        public static final TagKey<Block> SHOVEL_HAMMER_MINEABLE = createTag("shovel_hammer_mineable");
        public static final TagKey<Block> AXE_HAMMER_MINEABLE = createTag("axe_hammer_mineable");
        
        

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ESSENCE_TO_MANA = createTag("essence_to_mana");
        public static final TagKey<Item> COLOSSAL_SWORD_ENCHANTABLE = createTag("colossal_enchantable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, name));
        }
    }
    
    public static class Enchantments {
        public static final TagKey<Enchantment> RETURN_EXCLUSIVES = createTag("colossal_sword_return_exclusives");
        
        private static TagKey<Enchantment> createTag(String name) {
            return TagKey.create(Registries.ENCHANTMENT,
                  ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, name));
        }
    }
}

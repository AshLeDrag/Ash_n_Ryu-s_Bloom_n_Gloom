package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.util;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
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
        
        public static final TagKey<Block> NEEDS_MANTISITE_TOOL = createTag("needs_mantisite_tool");
        public static final TagKey<Block> INCORRECT_FOR_MANTISITE_TOOL = createTag("incorrect_for_mantisite_tool");
        
        
        public static final TagKey<Block> BASIC_HAMMER_MINEABLE = createTag("hammer_mineable");
        public static final TagKey<Block> PICKAXE_HAMMER_MINEABLE = createTag("pickaxe_hammer_mineable");
        public static final TagKey<Block> SHOVEL_HAMMER_MINEABLE = createTag("shovel_hammer_mineable");
        public static final TagKey<Block> AXE_HAMMER_MINEABLE = createTag("axe_hammer_mineable");
        
        

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ESSENCE_TO_MANA = createTag("essence_to_mana");
        public static final TagKey<Item> COLOSSAL_SWORD_ENCHANTABLE = createTag("colossal_enchantable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, name));
        }
    }
    
    public static class Enchantments {
        public static final TagKey<Enchantment> RETURN_EXCLUSIVES = createTag("colossal_sword_return_exclusives");
        
        private static TagKey<Enchantment> createTag(String name) {
            return TagKey.create(Registries.ENCHANTMENT,
                  ResourceLocation.fromNamespaceAndPath(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, name));
        }
    }
}

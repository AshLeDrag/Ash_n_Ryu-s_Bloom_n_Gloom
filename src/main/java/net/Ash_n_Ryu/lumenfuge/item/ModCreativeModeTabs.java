package net.Ash_n_Ryu.lumenfuge.item;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
      public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister
                                                                                      .create(Registries.CREATIVE_MODE_TAB, Lumenfuge.MOD_ID);
      
      public static final Supplier<CreativeModeTab> LUMENFUGE = CREATIVE_MODE_TAB
                                                                         .register("lumenfuge",
                                                                               () -> CreativeModeTab.builder()
                                                                                           .icon(() -> new ItemStack(ModItems.Mantisite.Tools.AXE.get()))
                                                                                           .title(Component.translatable("creativetab.lumenfuge"))
                                                                                           .displayItems(((itemDisplayParameters, output) -> {
                                                                                                 output.accept(ModBlocks.MANTISITE_BLOCK);
                                                                                                 output.accept(ModBlocks.MANTISITE_ORE);
                                                                                                 output.accept(ModBlocks.MANTISITE_DEEPSLATE_ORE);
                                                                                                 output.accept(ModItems.Mantisite.Resource.RAW);
                                                                                                 output.accept(ModItems.Mantisite.Resource.INGOT);
                                                                                                 output.accept(ModItems.Mantisite.Resource.NUGGET);
                                                                                                 output.accept(ModItems.Mantisite.Weapons.SWORD);
                                                                                                 output.accept(ModItems.Mantisite.Tools.AXE);
                                                                                                 output.accept(ModItems.Mantisite.Tools.PICKAXE);
                                                                                                 output.accept(ModItems.Mantisite.Tools.SHOVEL);
                                                                                                 output.accept(ModItems.Mantisite.Tools.HOE);
                                                                                                 output.accept(ModItems.Mantisite.Armor.HELMET);
                                                                                                 output.accept(ModItems.Mantisite.Armor.CHESTPLATE);
                                                                                                 output.accept(ModItems.Mantisite.Armor.LEGGINGS);
                                                                                                 output.accept(ModItems.Mantisite.Armor.BOOTS);
                                                                                                 output.accept(ModItems.Mantisite.Armor.HORSE);
                                                                                                 output.accept(ModBlocks.ERNEST_LOG);
                                                                                                 output.accept(ModBlocks.STRIPPED_ERNEST_LOG);
                                                                                                 output.accept(ModBlocks.ERNEST_WOOD);
                                                                                                 output.accept(ModBlocks.STRIPPED_ERNEST_WOOD);
                                                                                                 output.accept(ModBlocks.DEAD_ERNEST_LEAVES);
                                                                                                 output.accept(ModBlocks.ERNEST_LEAVES);
                                                                                                 output.accept(ModBlocks.DEAD_ERNEST_SAPLING);
                                                                                                 output.accept(ModBlocks.ERNEST_SAPLING);
                                                                                                 output.accept(ModBlocks.ERNEST_PLANKS);
                                                                                                 output.accept(ModBlocks.ERNEST_STAIRS);
                                                                                                 output.accept(ModBlocks.ERNEST_SLAB);
                                                                                                 output.accept(ModBlocks.ERNEST_PRESSURE_PLATE);
                                                                                                 output.accept(ModBlocks.ERNEST_BUTTON);
                                                                                                 output.accept(ModBlocks.ERNEST_FENCE);
                                                                                                 output.accept(ModBlocks.ERNEST_FENCE_GATE);
                                                                                                 output.accept(ModBlocks.ERNEST_DOOR);
                                                                                                 output.accept(ModBlocks.ERNEST_TRAPDOOR);
                                                                                                 
                                                                                           })).build());
      
      public static void register(IEventBus eventBus){
            CREATIVE_MODE_TAB.register(eventBus);
      }
}

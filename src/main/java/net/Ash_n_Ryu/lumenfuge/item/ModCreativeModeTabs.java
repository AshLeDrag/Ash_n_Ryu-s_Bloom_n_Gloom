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
                                                                                           .icon(() -> new ItemStack(ModItems.MANTISITE_AXE.get()))
                                                                                           .title(Component.translatable("creativetab.lumenfuge"))
                                                                                           .displayItems(((itemDisplayParameters, output) -> {
                                                                                                 output.accept(ModBlocks.MANTISITE_BLOCK);
                                                                                                 output.accept(ModItems.MANTISITE_SHARD);
                                                                                                 output.accept(ModItems.MANTISITE_SWORD);
                                                                                                 output.accept(ModItems.MANTISITE_AXE);
                                                                                                 output.accept(ModItems.MANTISITE_PICKAXE);
                                                                                                 output.accept(ModItems.MANTISITE_SHOVEL);
                                                                                                 output.accept(ModItems.MANTISITE_HOE);
                                                                                                 output.accept(ModItems.MANTISITE_HELMET);
                                                                                                 output.accept(ModItems.MANTISITE_CHESTPLATE);
                                                                                                 output.accept(ModItems.MANTISITE_LEGGINGS);
                                                                                                 output.accept(ModItems.MANTISITE_BOOTS);
                                                                                                 output.accept(ModItems.MANTISITE_HORSE);
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

                                                                                                 output.accept(ModItems.AROG_SPAWN_EGG);

                                                                                                 
                                                                                           })).build());
      
      public static void register(IEventBus eventBus){
            CREATIVE_MODE_TAB.register(eventBus);
      }
}

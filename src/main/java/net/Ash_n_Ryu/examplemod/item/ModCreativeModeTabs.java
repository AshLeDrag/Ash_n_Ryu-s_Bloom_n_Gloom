package net.Ash_n_Ryu.examplemod.item;

import net.Ash_n_Ryu.examplemod.ExampleMod;
import net.Ash_n_Ryu.examplemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.model.generators.loaders.ItemLayerModelBuilder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
      public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister
                                                                                      .create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);
      
      public static final Supplier<CreativeModeTab> TOOLSFORDAYS = CREATIVE_MODE_TAB
                                                                         .register("toolsfordaystab",
                                                                               () -> CreativeModeTab.builder()
                                                                                           .icon(() -> new ItemStack(ModItems.Breadinium.Tools.HAMMER.get()))
                                                                                           .title(Component.translatable("creativetab.thingsfordays.tfd_tab"))
                                                                                           .displayItems(((itemDisplayParameters, output) -> {
                                                                                                 output.accept(ModItems.Breadinium.Tools.AXE);
                                                                                                 output.accept(ModItems.Breadinium.Tools.PICKAXE);
                                                                                                 output.accept(ModItems.Breadinium.Tools.SHOVEL);
                                                                                                 output.accept(ModItems.Breadinium.Tools.HOE);
                                                                                                 output.accept(ModItems.Breadinium.Tools.HAMMER);
                                                                                                 output.accept(ModItems.Breadinium.Tools.AXE_HAMMER);
                                                                                                 output.accept(ModItems.Breadinium.Tools.PICKAXE_HAMMER);
                                                                                                 output.accept(ModItems.Breadinium.Tools.SHOVEL_HAMMER);
                                                                                           })).build());
      
      public static final Supplier<CreativeModeTab> WEAPONSFORDAYS = CREATIVE_MODE_TAB
                                                                           .register("weaponsfordaystab",
                                                                                 () -> CreativeModeTab.builder()
                                                                                             .icon(() -> new ItemStack(ModItems.Breadinium.Weapons.SWORD.get()))
                                                                                             .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "toolsfordaystab"))
                                                                                             .title(Component.translatable("creativetab.thingsfordays.wfd_tab"))
                                                                                             .displayItems(((itemDisplayParameters, output) -> {
                                                                                                   output.accept(ModItems.Breadinium.Weapons.SWORD);
                                                                                                   output.accept(ModItems.Breadinium.Weapons.BOW);
                                                                                                   output.accept(ModItems.Weapons.COLOSSAL_SWORD);
                                                                                                   output.accept(ModItems.Weapons.ASTRAL_RIFTBLADE);
                                                                                                   output.accept(ModItems.Weapons.VOLCANIC_CLEAVER);
                                                                                                   output.accept(ModItems.Weapons.SYLVAN_GLAIVE);
                                                                                                   output.accept(ModItems.Weapons.CRYOLUNE_GREATSWORD);
                                                                                             })).build());
      
      public static void register(IEventBus eventBus){
            CREATIVE_MODE_TAB.register(eventBus);
      }
}

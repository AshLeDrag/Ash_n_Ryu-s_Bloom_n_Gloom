package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
      public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister
                                                                                      .create(Registries.CREATIVE_MODE_TAB, Ash_n_Ryus_Bloom_n_Gloom.MOD_ID);
      
      public static final Supplier<CreativeModeTab> TOOLSFORDAYS = CREATIVE_MODE_TAB
                                                                         .register("toolsfordaystab",
                                                                               () -> CreativeModeTab.builder()
                                                                                           .icon(() -> new ItemStack(ModItems.Mantisite.Tools.AXE.get()))
                                                                                           .title(Component.translatable("creativetab.bng."))
                                                                                           .displayItems(((itemDisplayParameters, output) -> {
                                                                                                 output.accept(ModItems.Mantisite.Tools.AXE);
                                                                                                 output.accept(ModItems.Mantisite.Tools.PICKAXE);
                                                                                                 output.accept(ModItems.Mantisite.Tools.SHOVEL);
                                                                                                 output.accept(ModItems.Mantisite.Tools.HOE);
                                                                                           })).build());
      
      public static void register(IEventBus eventBus){
            CREATIVE_MODE_TAB.register(eventBus);
      }
}

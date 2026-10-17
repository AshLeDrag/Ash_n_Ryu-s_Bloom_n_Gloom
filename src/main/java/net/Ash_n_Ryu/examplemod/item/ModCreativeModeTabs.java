package net.Ash_n_Ryu.examplemod.item;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.block.ModBlocks;
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
                                                                                      .create(Registries.CREATIVE_MODE_TAB, ThingsForDays.MOD_ID);
      
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
                                                                                                 ModGeneratedOres.ALL.forEach(family -> family.tools.forEach(item -> output.accept(item.get())));
                                                                                           })).build());
      
      public static final Supplier<CreativeModeTab> WEAPONSFORDAYS = CREATIVE_MODE_TAB
                                                                           .register("weaponsfordaystab",
                                                                                 () -> CreativeModeTab.builder()
                                                                                             .icon(() -> new ItemStack(ModItems.Breadinium.Weapons.SWORD.get()))
                                                                                             .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "toolsfordaystab"))
                                                                                             .title(Component.translatable("creativetab.thingsfordays.wfd_tab"))
                                                                                             .displayItems(((itemDisplayParameters, output) -> {
                                                                                                   output.accept(ModItems.Breadinium.Weapons.SWORD);
                                                                                                   output.accept(ModItems.Breadinium.Weapons.BOW);
                                                                                                   output.accept(ModItems.Weapons.COLOSSAL_SWORD);
																   output.accept(ModItems.Weapons.ASTRAL_RIFTBLADE);
																   output.accept(ModItems.Weapons.VOLCANIC_CLEAVER);
																   output.accept(ModItems.Weapons.SYLVAN_GLAIVE);
																   output.accept(ModItems.Weapons.CRYOLUNE_GREATSWORD);
                                                                                                   ModGeneratedOres.ALL.forEach(family -> family.weapons.forEach(item -> output.accept(item.get())));
                                                                                             })).build());
      
      public static final Supplier<CreativeModeTab> ARMORFORDAYS = CREATIVE_MODE_TAB
                                                                         .register("armorfordaystab",
                                                                               () -> CreativeModeTab.builder()
                                                                                           .icon(() -> new ItemStack(ModItems.Breadinium.Resource.INGOT.get()))
                                                                                           .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "weaponsfordaystab"))
                                                                                           .title(Component.translatable("creativetab.thingsfordays.afd_tab"))
                                                                                           .displayItems(((itemDisplayParameters, output) -> {
                                                                                                 output.accept(ModItems.Breadinium.Armor.HELMET);
                                                                                                 output.accept(ModItems.Breadinium.Armor.CHESTPLATE);
                                                                                                 output.accept(ModItems.Breadinium.Armor.LEGGINGS);
                                                                                                 output.accept(ModItems.Breadinium.Armor.BOOTS);
                                                                                                 output.accept(ModItems.Breadinium.Armor.HORSE);
                                                                                                 ModGeneratedOres.ALL.forEach(family -> family.armor.forEach(item -> output.accept(item.get())));
                                                                                           })).build());
      
      public static final Supplier<CreativeModeTab> ORESFORDAYS = CREATIVE_MODE_TAB
                                                                        .register("oresfordaystab",
                                                                              () -> CreativeModeTab.builder()
                                                                                          .icon(() -> new ItemStack(ModBlocks.BREADINIUM_ORE.get()))
                                                                                          .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "armorfordaystab"))
                                                                                          .title(Component.translatable("creativetab.thingsfordays.ofd_tab"))
                                                                                          .displayItems(((itemDisplayParameters, output) -> {
                                                                                                output.accept(ModBlocks.BREADINIUM_ORE);
                                                                                                output.accept(ModBlocks.BREADINIUM_DEEPSLATE_ORE);
                                                                                                output.accept(ModBlocks.BREADINIUM_NETHER_ORE);
                                                                                                output.accept(ModBlocks.BREADINIUM_END_ORE);
                                                                                                output.accept(ModItems.Breadinium.Resource.RAW);
                                                                                                output.accept(ModItems.Breadinium.Resource.INGOT);
                                                                                                output.accept(ModBlocks.BREADINIUM_BLOCK.get());
                                                                                                ModGeneratedOres.ALL.forEach(family -> {
                                                                                                      output.accept(family.ore.get());
                                                                                                      output.accept(family.raw.get());
                                                                                                      output.accept(family.ingot.get());
                                                                                                      output.accept(family.nugget.get());
                                                                                                });
                                                                                          })).build());
      
      public static final Supplier<CreativeModeTab> BLOCKSFORDAYS = CREATIVE_MODE_TAB
                                                                          .register("blocksfordaystab",
                                                                                () -> CreativeModeTab.builder()
                                                                                            .icon(() -> new ItemStack(ModBlocks.MANA_BLOCK.get()))
                                                                                            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "oresfordaystab"))
                                                                                            .title(Component.translatable("creativetab.thingsfordays.bfd_tab"))
                                                                                            .displayItems(((itemDisplayParameters, output) -> {
                                                                                                  output.accept(ModBlocks.MANA_BLOCK);
                                                                                                  
                                                                                                  
                                                                                                  output.accept(ModBlocks.REDWOOD_SAPLING.get());
                                                                                                  output.accept(ModBlocks.REDWOOD_PLANKS.get());
                                                                                                  output.accept(ModBlocks.REDWOOD_LOG.get());
                                                                                                  output.accept(ModBlocks.STRIPPED_REDWOOD_LOG.get());
                                                                                                  output.accept(ModBlocks.REDWOOD_WOOD.get());
                                                                                                  output.accept(ModBlocks.STRIPPED_REDWOOD_WOOD.get());
                                                                                                  output.accept(ModBlocks.REDWOOD_LEAVES.get());
                                                                                                  output.accept(ModBlocks.REDWOOD_LEAVES.get());
                                                                                                  
                                                                                                  
                                                                                                  output.accept(ModBlocks.BREADINIUM_BLOCK.get());
                                                                                                  ModGeneratedOres.ALL.forEach(family -> output.accept(family.storageBlock.get()));
															  output.accept(ModBlocks.ASTRAL_STONE.get());
															  output.accept(ModBlocks.VOLCANIC_ROCK.get());
															  output.accept(ModBlocks.SYLVAN_STONE.get());
															  output.accept(ModBlocks.CRYO_CRYSTAL.get());
                                                                                                  
                                                                                                  
                                                                                                  output.accept(ModBlocks.HOLDER.get());
                                                                                                  
                                                                                                  
                                                                                                  output.accept(ModBlocks.WEAPON_FORGE.get());
                                                                                                  output.accept(ModBlocks.ASTRALIS_PORTAL.get());
                                                                                                  output.accept(ModBlocks.VOLCANIS_PORTAL.get());
                                                                                                  output.accept(ModBlocks.SYLVARIA_PORTAL.get());
                                                                                                  output.accept(ModBlocks.CRYOLUNE_PORTAL.get());
                                                                                                  
                                                                                                  
                                                                                                  
                                                                                            })).build());
      
      public static final Supplier<CreativeModeTab> RESOURCESFORDAYS = CREATIVE_MODE_TAB
                                                                             .register("resourcesfordaystab",
                                                                                   () -> CreativeModeTab.builder()
                                                                                               .icon(() -> new ItemStack(ModItems.Breadinium.Resource.INGOT.get()))
                                                                                               .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "blocksfordaystab"))
                                                                                               .title(Component.translatable("creativetab.thingsfordays.rfd_tab"))
                                                                                               .displayItems(((itemDisplayParameters, output) -> {
                                                                                                     output.accept(ModItems.Breadinium.Resource.RAW);
                                                                                                     output.accept(ModItems.Breadinium.Resource.INGOT);
                                                                                                     
                                                                                                     output.accept(ModItems.Steel.Resource.BILLET);
                                                                                                     output.accept(ModItems.Steel.Resource.INGOT);
                                                                                                     
                                                                                                     output.accept(ModItems.Steel.Stainless.Resource.BILLET);
                                                                                                     output.accept(ModItems.Steel.Stainless.Resource.INGOT);
                                                                                                     
                                                                                                     output.accept(ModItems.Chromium.Resource.RAW);
                                                                                                     output.accept(ModItems.Chromium.Resource.INGOT);
                                                                                                     output.accept(ModItems.Chromium.Resource.NUGGET);
                                                                                                     ModGeneratedOres.ALL.forEach(family -> {
                                                                                                           output.accept(family.raw.get());
                                                                                                           output.accept(family.ingot.get());
                                                                                                           output.accept(family.nugget.get());
                                                                                                     });
                                                                                                     
                                                                                                     
                                                                                                     
                                                                                                     output.accept(ModItems.Steel.Resource.ARROW_HEAD);
                                                                                                     output.accept(ModItems.Steel.Resource.SPEAR_HEAD);
                                                                                               })).build());
      
      public static final Supplier<CreativeModeTab> FOODFORDAYS = CREATIVE_MODE_TAB
                                                                        .register("foodfordaystab",
                                                                              () -> CreativeModeTab.builder()
                                                                                          .icon(() -> new ItemStack(ModItems.Foods.RADISH.get()))
                                                                                          .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "resourcesfordaystab"))
                                                                                          .title(Component.translatable("creativetab.thingsfordays.fofd_tab"))
                                                                                          .displayItems(((itemDisplayParameters, output) -> {
                                                                                                output.accept(ModItems.Foods.RADISH);
                                                                                                output.accept(ModItems.Foods.RADISH_SEEDS);
                                                                                          })).build());
      
      public static final Supplier<CreativeModeTab> FUELFORDAYS = CREATIVE_MODE_TAB
                                                                        .register("fuelfordaystab",
                                                                              () -> CreativeModeTab.builder()
                                                                                          .icon(() -> new ItemStack(ModItems.Fuels.STARLIGHT_ASHES.get()))
                                                                                          .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "foodfordaystab"))
                                                                                          .title(Component.translatable("creativetab.thingsfordays.fufd_tab"))
                                                                                          .displayItems(((itemDisplayParameters, output) -> {
                                                                                                output.accept(ModItems.Fuels.STARLIGHT_ASHES);
                                                                                          })).build());
      
      public static final Supplier<CreativeModeTab> POTIONSFORDAYS = CREATIVE_MODE_TAB
                                                                           .register("potionsfordaystab",
                                                                                 () -> CreativeModeTab.builder()
                                                                                             .icon(() -> new ItemStack(ModItems.Fuels.STARLIGHT_ASHES.get()))
                                                                                             .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "fuelfordaystab"))
                                                                                             .title(Component.translatable("creativetab.thingsfordays.pfd_tab"))
                                                                                             .displayItems(((itemDisplayParameters, output) -> {
                                                                                                   output.accept(ModItems.Fuels.STARLIGHT_ASHES);
                                                                                             })).build());
      
      public static final Supplier<CreativeModeTab> ENCHANTSFORDAYS = CREATIVE_MODE_TAB
                                                                            .register("enchantsfordaystab",
                                                                                  () -> CreativeModeTab.builder()
                                                                                              .icon(() -> new ItemStack(ModItems.Fuels.STARLIGHT_ASHES.get()))
                                                                                              .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "potionsfordaystab"))
                                                                                              .title(Component.translatable("creativetab.thingsfordays.efd_tab"))
                                                                                              .displayItems(((itemDisplayParameters, output) -> {
                                                                                                    output.accept(ModItems.Fuels.STARLIGHT_ASHES);
                                                                                              })).build());
      
      public static final Supplier<CreativeModeTab> TFD_ADDITIONS = CREATIVE_MODE_TAB
                                                                          .register("tfd_additions",
                                                                                () -> CreativeModeTab.builder()
                                                                                            .icon(() -> new ItemStack(ModItems.Fuels.STARLIGHT_ASHES.get()))
                                                                                            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, "potionsfordaystab"))
                                                                                            .title(Component.translatable("creativetab.thingsfordays.tfda_tab"))
                                                                                            .displayItems(((itemDisplayParameters, output) -> {})).build());
      
      public static void register(IEventBus eventBus){
            CREATIVE_MODE_TAB.register(eventBus);
      }
}

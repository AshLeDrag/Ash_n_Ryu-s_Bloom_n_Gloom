package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.block.ModBlocks;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.block.entity.ModBlockEntities;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.component.ModDataComponents;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.enchantment.ModEnchantmentEffects;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.entity.ModEntities;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.item.ModArmorMaterials;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.item.ModCreativeModeTabs;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.item.ModItems;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.sound.ModSounds;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID)
public class Ash_n_Ryus_Bloom_n_Gloom {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "ash_n_ryus_bloom_n_gloom";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "ash_n_ryus_bloom_n_gloom" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    // Create a Deferred Register to hold Items which will all be registered under the "ash_n_ryus_bloom_n_gloom" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "ash_n_ryus_bloom_n_gloom" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    // Creates a new Block with the id "ash_n_ryus_bloom_n_gloom:example_block", combining the namespace and path
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    // Creates a new BlockItem with the id "ash_n_ryus_bloom_n_gloom:example_block", combining the namespace and path
    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);

    // Creates a new food item with the id "ash_n_ryus_bloom_n_gloom:example_id", nutrition 1 and saturation 2
    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    // Creates a creative tab with the id "ash_n_ryus_bloom_n_gloom:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.ash_n_ryus_bloom_n_gloom")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(EXAMPLE_ITEM.get());// Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Ash_n_Ryus_Bloom_n_Gloom(IEventBus modEventBus, ModContainer modContainer) {// Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        
        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ash_n_ryus_bloom_n_gloom) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
        
        ModArmorMaterials.register(modEventBus);
        ModDataComponents.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModSounds.register(modEventBus);
        
        
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        
        ModEnchantmentEffects.register(modEventBus);
        
        ModEntities.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        
        
        
        
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
    
    private void commonSetup(FMLCommonSetupEvent event) {
    
    }
    
    
    
    
    
    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        }
    }
    
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    
    }
    
    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}

        @SubscribeEvent
        public static void registerBER(EntityRenderersEvent.RegisterRenderers event){}

        @SubscribeEvent
        public static void registerParticles(RegisterParticleProvidersEvent event) {}

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event){}

        @SubscribeEvent
        public static void registerParticleFactories(RegisterParticleProvidersEvent event) {}

    }
}

// ================================================ TODOS ================================================ \\

/*
 * TODO: Make zworb (zombie sword) that spawns zombies which attack enemies
 * TODO: Make a Breader (block) that transforms breadinium and milk into dough
 *
 *
 *
 *
 */
 

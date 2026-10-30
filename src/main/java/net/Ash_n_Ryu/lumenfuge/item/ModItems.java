package net.Ash_n_Ryu.lumenfuge.item;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.ModEntities;
import net.Ash_n_Ryu.lumenfuge.item.custom.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
		public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Lumenfuge.MOD_ID);
		
		
		
		
		
		
		
		public static final DeferredItem<Item> MANTISITE_SHARD = ITEMS.register("mantisite_shard", () -> new Item(new Item.Properties()));
		
		
		
		
		
		public static final DeferredItem<Item> ETHERAL_KEY = ITEMS.register("etheral_key", () -> new Item(new Item.Properties()));
		
		
		
		
		public static final DeferredItem<PickaxeItem> MANTISITE_PICKAXE = ITEMS.register("mantisite_pickaxe", () -> new PickaxeItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.MANTISITE, 1.0f, -2.8f))));
		
		public static final DeferredItem<AxeItem> MANTISITE_AXE = ITEMS.register("mantisite_axe", () -> new AxeItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.MANTISITE, 6.0f, -3.2f))));
		
		public static final DeferredItem<ShovelItem> MANTISITE_SHOVEL = ITEMS.register("mantisite_shovel", () -> new ShovelItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.MANTISITE, 1.5f, -3.0f))));
		
		
		public static final DeferredItem<HoeItem> MANTISITE_HOE = ITEMS.register("mantisite_hoe", () -> new HoeItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.MANTISITE, 0f, -2.4f))));
		
		
		
		
		public static final DeferredItem<ArmorItem> MANTISITE_HELMET = ITEMS.register("mantisite_helmet", () -> new ModArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
		public static final DeferredItem<ArmorItem> MANTISITE_CHESTPLATE = ITEMS.register("mantisite_chestplate", () -> new ArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(3))));
		public static final DeferredItem<ArmorItem> MANTISITE_LEGGINGS = ITEMS.register("mantisite_leggings", () -> new ArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
		public static final DeferredItem<ArmorItem> MANTISITE_BOOTS = ITEMS.register("mantisite_boots", () -> new ArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));
		
		public static final DeferredItem<Item> MANTISITE_HORSE = ITEMS.register("mantisite_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
		
		
		
		public static final DeferredItem<SwordItem> MANTISITE_SWORD = ITEMS.register("mantisite_sword", () -> new SwordItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.MANTISITE, 5.0f, -2.4f))));
		
		
		public static final DeferredItem<Item> AROG_SPAWN_EGG = ITEMS.register("arog_spawn_egg",
				() -> new DeferredSpawnEggItem(ModEntities.AROG, 0x174651, 0xbfb8b1,
						new Item.Properties()));
		
		public static final DeferredItem<Item> ZEPI_SPAWN_EGG = ITEMS.register("zepi_spawn_egg",
				() -> new DeferredSpawnEggItem(ModEntities.ZEPI, 0x081f40, 0xef9c1c,
						new Item.Properties()));
		
		
		public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}

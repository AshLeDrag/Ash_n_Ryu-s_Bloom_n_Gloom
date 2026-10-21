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
		
		public static class Tools {
		}
		
		public static class Weapons {
		}
		
		public static class Fuels {
				public static final DeferredItem<Item> STARLIGHT_ASHES = ITEMS.register("starlight_ashes", () -> new Item(new Item.Properties()));
		}
		
		public static class Foods {
				public static final DeferredItem<Item> RADISH = ITEMS.register("radish", () -> new Item(new Item.Properties().food(ModFoodProperties.RADISH)) {
						@Override public void appendHoverText(
								ItemStack stack,
								TooltipContext context,
								List<Component> tooltipComponents,
								TooltipFlag tooltipFlag) {
								tooltipComponents.add(Component.translatable("tooltip.thingsfordays.radish.tooltip"));
								super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
						}
				});
		}
		
		public static class Mantisite {
				public static class Resource {
						public static final DeferredItem<Item> SHARD = ITEMS.register("mantisite_shard", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("mantisite_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("mantisite_nugget", () -> new Item(new Item.Properties()));
				}
				
				public static class Tools {
						
						public static final DeferredItem<PickaxeItem> PICKAXE = ITEMS.register("mantisite_pickaxe", () -> new PickaxeItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.MANTISITE, 1.0f, -2.8f))));
						
						public static final DeferredItem<AxeItem> AXE = ITEMS.register("mantisite_axe", () -> new AxeItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.MANTISITE, 6.0f, -3.2f))));
						
						public static final DeferredItem<ShovelItem> SHOVEL = ITEMS.register("mantisite_shovel", () -> new ShovelItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.MANTISITE, 1.5f, -3.0f))));
						
						
						public static final DeferredItem<HoeItem> HOE = ITEMS.register("mantisite_hoe", () -> new HoeItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.MANTISITE, 0f, -2.4f))));
						
				}
				
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = ITEMS.register("mantisite_helmet", () -> new ModArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
						public static final DeferredItem<ArmorItem> CHESTPLATE = ITEMS.register("mantisite_chestplate", () -> new ArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(3))));
						public static final DeferredItem<ArmorItem> LEGGINGS = ITEMS.register("mantisite_leggings", () -> new ArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
						public static final DeferredItem<ArmorItem> BOOTS = ITEMS.register("mantisite_boots", () -> new ArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));
						
						public static final DeferredItem<Item> HORSE = ITEMS.register("mantisite_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
						
				}
				
				public static class Weapons {
						public static final DeferredItem<SwordItem> SWORD = ITEMS.register("mantisite_sword", () -> new SwordItem(ModToolTiers.MANTISITE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.MANTISITE, 5.0f, -2.4f))));
				}
		}
		
		public static class Resource {
				public static final DeferredItem<Item> SUPERPEARL = ITEMS.register("super_pearl", () -> new Item(new Item.Properties())); //TODO: make a reusable ender pearl

			public static final DeferredItem<Item> AROG_SPAWN_EGG = ITEMS.register("arog_spawn_egg",
					() -> new DeferredSpawnEggItem(ModEntities.AROG, 0x174651, 0xbfb8b1,
							new Item.Properties()));
		}

		public static void register(
				IEventBus eventBus) {
				initNestedClasses(ModItems.class);
				ITEMS.register(eventBus);
		}
		
		
		// I used CLAUDE for initNestedClasses
		private static void initNestedClasses(
				Class<?> clazz) {
				for(Class<?> inner : clazz.getDeclaredClasses()) {
						try {
								Class.forName(inner.getName(), true, inner.getClassLoader());
						} catch(ClassNotFoundException e) {
								throw new RuntimeException("Failed to initialize class: " + inner.getName(), e);
						}
						initNestedClasses(inner); // recurse into deeper nesting
				}
		}
}

package net.Ash_n_Ryu.examplemod.item;

import net.Ash_n_Ryu.examplemod.ExampleMod;
import net.Ash_n_Ryu.examplemod.block.ModBlocks;
import net.Ash_n_Ryu.examplemod.item.custom.*;
import net.Ash_n_Ryu.examplemod.util.ModTags;
import net.Ash_n_Ryu.examplemod.ExampleMod;
import net.Ash_n_Ryu.examplemod.item.custom.BreadiniumHammerItem;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
		public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MOD_ID);
		
		public static class Tools {
				public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel", () -> new ChiselItem(new Item.Properties().durability(32)));
		}
		
		public static class Weapons {
				public static final DeferredItem<Item> COLOSSAL_SWORD = ITEMS.register("steel_throwable", () -> new ThrowableItem(new Item.Properties().stacksTo(1)
						                                                                                                                    .durability(700), 72000));
				public static final DeferredItem<Item> TELEPORT_SPEAR = ITEMS.register("teleport_spear", () -> new TeleportSwordItem(new Item.Properties().stacksTo(1)
																																												.durability(700), 72000));
				public static final DeferredItem<Item> HARDENED_SWORD = ITEMS.register("hardened_sword", () -> new ThrowableItem(new Item.Properties().stacksTo(1)
						                                                                                                                   .durability(700), 72000));
				public static final DeferredItem<Item> HARDENED_TELEPORT_SWORD = ITEMS.register("hardened_teleport_sword", () -> new ThrowableItem(new Item.Properties().stacksTo(1)
						                                                                                                                            .durability(700), 72000));
				public static final DeferredItem<Item> GATHER_SWORD = ITEMS.register("gather_sword", () -> new ThrowableItem(new Item.Properties().stacksTo(1)
						                                                                                                                 .durability(700), 72000));
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
				public static final DeferredItem<Item> RADISH_SEEDS = ITEMS.register("radish_seeds", () -> new ItemNameBlockItem(ModBlocks.RADISH_CROP.get(), new Item.Properties()));
		}
		
		public static class Breadinium {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_breadinium", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("breadinium_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("breadinium_nugget", () -> new Item(new Item.Properties()));
				}
				
				public static class Tools {
						public static final DeferredItem<BreadiniumHammerItem> HAMMER = ITEMS.register("breadinium_hammer", () -> new BreadiniumHammerItem(ModToolTiers.BREADINIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BREADINIUM, 6.7f, -4.0f)), 5, 5, ModTags.Blocks.BASIC_HAMMER_MINEABLE) {
								@Override public void appendHoverText(
										ItemStack stack,
										TooltipContext context,
										List<Component> tooltipComponents,
										TooltipFlag tooltipFlag) {
										tooltipComponents.add(Component.translatable("tooltip.thingsfordays.3hammer"));
										super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
								}
						});
						
						public static final DeferredItem<BreadiniumHammerItem> AXE_HAMMER = ITEMS.register("breadinium_wood_hammer", () -> new BreadiniumHammerItem(ModToolTiers.BREADINIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BREADINIUM, 6.7f, -4.0f)), 3, 3, ModTags.Blocks.AXE_HAMMER_MINEABLE) {
								@Override public void appendHoverText(
										ItemStack stack,
										TooltipContext context,
										List<Component> tooltipComponents,
										TooltipFlag tooltipFlag) {
										tooltipComponents.add(Component.translatable("tooltip.thingsfordays.3wood_hammer"));
										super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
								}
						});
						
						public static final DeferredItem<BreadiniumHammerItem> PICKAXE_HAMMER = ITEMS.register("breadinium_pickaxe_hammer", () -> new BreadiniumHammerItem(ModToolTiers.BREADINIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BREADINIUM, 6.7f, -4.0f)), 3, 3, ModTags.Blocks.PICKAXE_HAMMER_MINEABLE) {
								@Override public void appendHoverText(
										ItemStack stack,
										TooltipContext context,
										List<Component> tooltipComponents,
										TooltipFlag tooltipFlag) {
										tooltipComponents.add(Component.translatable("tooltip.thingsfordays.3pickaxe_hammer"));
										super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
								}
						});
						
						public static final DeferredItem<BreadiniumHammerItem> SHOVEL_HAMMER = ITEMS.register("breadinium_shovel_hammer", () -> new BreadiniumHammerItem(ModToolTiers.BREADINIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BREADINIUM, 6.7f, -4.0f)), 5, 5
								, ModTags.Blocks.SHOVEL_HAMMER_MINEABLE) {
								@Override public void appendHoverText(
										ItemStack stack,
										TooltipContext context,
										List<Component> tooltipComponents,
										TooltipFlag tooltipFlag) {
										tooltipComponents.add(Component.translatable("tooltip.thingsfordays.3shovel_hammer"));
										super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
								}
						});
						
						
						public static final DeferredItem<PickaxeItem> PICKAXE = ITEMS.register("breadinium_pickaxe", () -> new PickaxeItem(ModToolTiers.BREADINIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BREADINIUM, 1.0f, -2.8f))));
						
						public static final DeferredItem<AxeItem> AXE = ITEMS.register("breadinium_axe", () -> new AxeItem(ModToolTiers.BREADINIUM, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BREADINIUM, 6.0f, -3.2f))));
						
						public static final DeferredItem<ShovelItem> SHOVEL = ITEMS.register("breadinium_shovel", () -> new ShovelItem(ModToolTiers.BREADINIUM, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BREADINIUM, 1.5f, -3.0f))));
						
						
						public static final DeferredItem<HoeItem> HOE = ITEMS.register("breadinium_hoe", () -> new HoeItem(ModToolTiers.BREADINIUM, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BREADINIUM, 0f, -2.4f))));
						
				}
				
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = ITEMS.register("breadinium_helmet", () -> new ModArmorItem(ModArmorMaterials.BREADINIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
						public static final DeferredItem<ArmorItem> CHESTPLATE = ITEMS.register("breadinium_chestplate", () -> new ArmorItem(ModArmorMaterials.BREADINIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(3))));
						public static final DeferredItem<ArmorItem> LEGGINGS = ITEMS.register("breadinium_leggings", () -> new ArmorItem(ModArmorMaterials.BREADINIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
						public static final DeferredItem<ArmorItem> BOOTS = ITEMS.register("breadinium_boots", () -> new ArmorItem(ModArmorMaterials.BREADINIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));
						
						public static final DeferredItem<Item> HORSE = ITEMS.register("breadinium_horse_armor", () -> new AnimalArmorItem(ModArmorMaterials.BREADINIUM_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));
						
				}
				
				public static class Weapons {
						public static final DeferredItem<SwordItem> SWORD = ITEMS.register("breadinium_sword", () -> new SwordItem(ModToolTiers.BREADINIUM, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BREADINIUM, 5.0f, -2.4f))));
						
						public static final DeferredItem<Item> BOW = ITEMS.register("breadinium_bow", () -> new BowItem(new Item.Properties().durability(500)));
				}
		}
		
		public static class Resource {
				public static final DeferredItem<Item> SUPERPEARL = ITEMS.register("super_pearl", () -> new Item(new Item.Properties())); //TODO: make a reusable ender pearl
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

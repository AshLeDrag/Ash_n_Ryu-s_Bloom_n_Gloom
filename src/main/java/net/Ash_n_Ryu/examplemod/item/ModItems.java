package net.Ash_n_Ryu.examplemod.item;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.AshLeDrag.thingsfordays.block.ModBlocks;
import net.AshLeDrag.thingsfordays.item.custom.*;
import net.AshLeDrag.thingsfordays.util.ModTags;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
		public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ThingsForDays.MOD_ID);
		
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
				public static final DeferredItem<DimensionalWeaponItem> ASTRAL_RIFTBLADE = registerDimensionalWeapon(
						"astral_riftblade", DimensionalWeaponItem.Power.ASTRAL, 8.0f, -2.2f);
				public static final DeferredItem<DimensionalWeaponItem> VOLCANIC_CLEAVER = registerDimensionalWeapon(
						"volcanic_cleaver", DimensionalWeaponItem.Power.VOLCANIC, 10.0f, -2.8f);
				public static final DeferredItem<DimensionalWeaponItem> SYLVAN_GLAIVE = registerDimensionalWeapon(
						"sylvan_glaive", DimensionalWeaponItem.Power.SYLVAN, 7.0f, -2.0f);
				public static final DeferredItem<DimensionalWeaponItem> CRYOLUNE_GREATSWORD = registerDimensionalWeapon(
						"cryolune_greatsword", DimensionalWeaponItem.Power.CRYOLUNE, 9.0f, -2.6f);
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
		
		public static class Chromium {
				
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_chromium", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("chromium_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("chromium_nugget", () -> new Item(new Item.Properties()));
				}
				
				public static class Tools {}
				
				public static class Armor {}
				
				public static class Weapons {}
		}
		
		public static class Steel {
				
				public static class Stainless {
						public static class Resource {
								public static final DeferredItem<Item> BILLET = ITEMS.register("stainless_steel_billet", () -> new Item(new Item.Properties()));
								public static final DeferredItem<Item> INGOT = ITEMS.register("stainless_steel_ingot", () -> new Item(new Item.Properties()));
						}
						
						public static class Tools {}
						
						public static class Armor {}
						
						public static class Weapons {}
				}
				
				public static class Resource {
						public static final DeferredItem<Item> BILLET = ITEMS.register("steel_billet", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
						
						
						public static final DeferredItem<Item> HARDENED_BILLET = ITEMS.register("hardened_steel_billet", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> HARDENED_INGOT = ITEMS.register("hardened_steel_ingot", () -> new Item(new Item.Properties()));
						
						
						public static final DeferredItem<Item> ARROW_HEAD = ITEMS.register("steel_arrow_head", () -> new Item(new Item.Properties().stacksTo(16)));
						public static final DeferredItem<Item> SPEAR_HEAD = ITEMS.register("steel_spear_head", () -> new Item(new Item.Properties().stacksTo(16)));
				}
				
				public static class Tools {}
				
				public static class Armor {}
				
				public static class Weapons {}
		}
		
		public static class Mana {
				public static class Resource {
						public static final DeferredItem<Item> PURE_MANA = ITEMS.register("pure_mana", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> MANA_ESSENCE = ITEMS.register("mana_essence", () -> new Item(new Item.Properties()));
				}
				
				public static class Tools {}
				
				public static class Armor {}
				
				public static class Weapons {}
		}
		
		public static class Mythril {
				public static class Resource {
						public static final DeferredItem<Item> RAW    = ITEMS.register("raw_mythril",      () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT  = ITEMS.register("mythril_ingot",    () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("mythril_nugget",   () -> new Item(new Item.Properties()));
				}
				public static class Tools {
						public static final DeferredItem<BreadiniumHammerItem> HAMMER = registerHammer("mythril_hammer", ModToolTiers.MYTHRIL, 5, 5, ModTags.Blocks.BASIC_HAMMER_MINEABLE, "tooltip.thingsfordays.3hammer");
						public static final DeferredItem<BreadiniumHammerItem> AXE_HAMMER = registerHammer("mythril_wood_hammer", ModToolTiers.MYTHRIL, 3, 3, ModTags.Blocks.AXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3wood_hammer");
						public static final DeferredItem<BreadiniumHammerItem> PICKAXE_HAMMER = registerHammer("mythril_pickaxe_hammer", ModToolTiers.MYTHRIL, 3, 3, ModTags.Blocks.PICKAXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3pickaxe_hammer");
						public static final DeferredItem<BreadiniumHammerItem> SHOVEL_HAMMER = registerHammer("mythril_shovel_hammer", ModToolTiers.MYTHRIL, 5, 5, ModTags.Blocks.SHOVEL_HAMMER_MINEABLE, "tooltip.thingsfordays.3shovel_hammer");
						public static final DeferredItem<PickaxeItem> PICKAXE = ITEMS.register("mythril_pickaxe", () -> new PickaxeItem(ModToolTiers.MYTHRIL, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.MYTHRIL, 1.0f, -2.8f))));
						public static final DeferredItem<AxeItem>     AXE     = ITEMS.register("mythril_axe",     () -> new AxeItem    (ModToolTiers.MYTHRIL, new Item.Properties().attributes(AxeItem    .createAttributes(ModToolTiers.MYTHRIL, 6.0f, -3.2f))));
						public static final DeferredItem<ShovelItem>  SHOVEL  = ITEMS.register("mythril_shovel",  () -> new ShovelItem (ModToolTiers.MYTHRIL, new Item.Properties().attributes(ShovelItem .createAttributes(ModToolTiers.MYTHRIL, 1.5f, -3.0f))));
						public static final DeferredItem<HoeItem>     HOE     = ITEMS.register("mythril_hoe",     () -> new HoeItem    (ModToolTiers.MYTHRIL, new Item.Properties().attributes(HoeItem    .createAttributes(ModToolTiers.MYTHRIL, 0f,   -2.4f))));
				}
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET     = ITEMS.register("mythril_helmet",     () -> new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,     new Item.Properties().durability(ArmorItem.Type.HELMET    .getDurability(19))));
						public static final DeferredItem<ArmorItem> CHESTPLATE = ITEMS.register("mythril_chestplate", () -> new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
						public static final DeferredItem<ArmorItem> LEGGINGS   = ITEMS.register("mythril_leggings",   () -> new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,   new Item.Properties().durability(ArmorItem.Type.LEGGINGS  .getDurability(19))));
						public static final DeferredItem<ArmorItem> BOOTS      = ITEMS.register("mythril_boots",      () -> new ArmorItem(ModArmorMaterials.MYTHRIL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,      new Item.Properties().durability(ArmorItem.Type.BOOTS     .getDurability(19))));
				}
				public static class Weapons {
						public static final DeferredItem<SwordItem> SWORD = ITEMS.register("mythril_sword", () -> new SwordItem(ModToolTiers.MYTHRIL, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.MYTHRIL, 5.0f, -2.4f))));
				}
		}

		public static class Orga {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_orga", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("orga_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("orga_nugget", () -> new Item(new Item.Properties()));
				}
				public static class Tools {
						public static final DeferredItem<BreadiniumHammerItem> HAMMER = registerHammer("orga_hammer", ModToolTiers.ORGA, 5, 5, ModTags.Blocks.BASIC_HAMMER_MINEABLE, "tooltip.thingsfordays.3hammer");
						public static final DeferredItem<BreadiniumHammerItem> AXE_HAMMER = registerHammer("orga_wood_hammer", ModToolTiers.ORGA, 3, 3, ModTags.Blocks.AXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3wood_hammer");
						public static final DeferredItem<BreadiniumHammerItem> PICKAXE_HAMMER = registerHammer("orga_pickaxe_hammer", ModToolTiers.ORGA, 3, 3, ModTags.Blocks.PICKAXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3pickaxe_hammer");
						public static final DeferredItem<BreadiniumHammerItem> SHOVEL_HAMMER = registerHammer("orga_shovel_hammer", ModToolTiers.ORGA, 5, 5, ModTags.Blocks.SHOVEL_HAMMER_MINEABLE, "tooltip.thingsfordays.3shovel_hammer");
						public static final DeferredItem<PickaxeItem> PICKAXE = ITEMS.register("orga_pickaxe", () -> new PickaxeItem(ModToolTiers.ORGA, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ORGA, 1.0f, -2.8f))));
						public static final DeferredItem<AxeItem> AXE = ITEMS.register("orga_axe", () -> new AxeItem(ModToolTiers.ORGA, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ORGA, 6.0f, -3.2f))));
						public static final DeferredItem<ShovelItem> SHOVEL = ITEMS.register("orga_shovel", () -> new ShovelItem(ModToolTiers.ORGA, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ORGA, 1.5f, -3.0f))));
						public static final DeferredItem<HoeItem> HOE = ITEMS.register("orga_hoe", () -> new HoeItem(ModToolTiers.ORGA, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ORGA, 0f, -2.4f))));
				}
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = registerArmor("orga_helmet", ModArmorMaterials.ORGA_ARMOR_MATERIAL, ArmorItem.Type.HELMET);
						public static final DeferredItem<ArmorItem> CHESTPLATE = registerArmor("orga_chestplate", ModArmorMaterials.ORGA_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE);
						public static final DeferredItem<ArmorItem> LEGGINGS = registerArmor("orga_leggings", ModArmorMaterials.ORGA_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS);
						public static final DeferredItem<ArmorItem> BOOTS = registerArmor("orga_boots", ModArmorMaterials.ORGA_ARMOR_MATERIAL, ArmorItem.Type.BOOTS);
				}
				public static class Weapons {
						public static final DeferredItem<SwordItem> SWORD = registerSword("orga_sword", ModToolTiers.ORGA);
				}
		}

		public static class Polnumarium {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_polnumarium", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("polnumarium_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("polnumarium_nugget", () -> new Item(new Item.Properties()));
				}
				public static class Tools {
						public static final DeferredItem<BreadiniumHammerItem> HAMMER = registerHammer("polnumarium_hammer", ModToolTiers.POLNUMARIUM, 5, 5, ModTags.Blocks.BASIC_HAMMER_MINEABLE, "tooltip.thingsfordays.3hammer");
						public static final DeferredItem<BreadiniumHammerItem> AXE_HAMMER = registerHammer("polnumarium_wood_hammer", ModToolTiers.POLNUMARIUM, 3, 3, ModTags.Blocks.AXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3wood_hammer");
						public static final DeferredItem<BreadiniumHammerItem> PICKAXE_HAMMER = registerHammer("polnumarium_pickaxe_hammer", ModToolTiers.POLNUMARIUM, 3, 3, ModTags.Blocks.PICKAXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3pickaxe_hammer");
						public static final DeferredItem<BreadiniumHammerItem> SHOVEL_HAMMER = registerHammer("polnumarium_shovel_hammer", ModToolTiers.POLNUMARIUM, 5, 5, ModTags.Blocks.SHOVEL_HAMMER_MINEABLE, "tooltip.thingsfordays.3shovel_hammer");
						public static final DeferredItem<PickaxeItem> PICKAXE = registerPickaxe("polnumarium_pickaxe", ModToolTiers.POLNUMARIUM);
						public static final DeferredItem<AxeItem> AXE = registerAxe("polnumarium_axe", ModToolTiers.POLNUMARIUM);
						public static final DeferredItem<ShovelItem> SHOVEL = registerShovel("polnumarium_shovel", ModToolTiers.POLNUMARIUM);
						public static final DeferredItem<HoeItem> HOE = registerHoe("polnumarium_hoe", ModToolTiers.POLNUMARIUM);
				}
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = registerArmor("polnumarium_helmet", ModArmorMaterials.POLNUMARIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET);
						public static final DeferredItem<ArmorItem> CHESTPLATE = registerArmor("polnumarium_chestplate", ModArmorMaterials.POLNUMARIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE);
						public static final DeferredItem<ArmorItem> LEGGINGS = registerArmor("polnumarium_leggings", ModArmorMaterials.POLNUMARIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS);
						public static final DeferredItem<ArmorItem> BOOTS = registerArmor("polnumarium_boots", ModArmorMaterials.POLNUMARIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS);
				}
				public static class Weapons { public static final DeferredItem<SwordItem> SWORD = registerSword("polnumarium_sword", ModToolTiers.POLNUMARIUM); }
		}

		public static class Fatium {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_fatium", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("fatium_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("fatium_nugget", () -> new Item(new Item.Properties()));
				}
				public static class Tools {
						public static final DeferredItem<BreadiniumHammerItem> HAMMER = registerHammer("fatium_hammer", ModToolTiers.FATIUM, 5, 5, ModTags.Blocks.BASIC_HAMMER_MINEABLE, "tooltip.thingsfordays.3hammer");
						public static final DeferredItem<BreadiniumHammerItem> AXE_HAMMER = registerHammer("fatium_wood_hammer", ModToolTiers.FATIUM, 3, 3, ModTags.Blocks.AXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3wood_hammer");
						public static final DeferredItem<BreadiniumHammerItem> PICKAXE_HAMMER = registerHammer("fatium_pickaxe_hammer", ModToolTiers.FATIUM, 3, 3, ModTags.Blocks.PICKAXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3pickaxe_hammer");
						public static final DeferredItem<BreadiniumHammerItem> SHOVEL_HAMMER = registerHammer("fatium_shovel_hammer", ModToolTiers.FATIUM, 5, 5, ModTags.Blocks.SHOVEL_HAMMER_MINEABLE, "tooltip.thingsfordays.3shovel_hammer");
						public static final DeferredItem<PickaxeItem> PICKAXE = registerPickaxe("fatium_pickaxe", ModToolTiers.FATIUM);
						public static final DeferredItem<AxeItem> AXE = registerAxe("fatium_axe", ModToolTiers.FATIUM);
						public static final DeferredItem<ShovelItem> SHOVEL = registerShovel("fatium_shovel", ModToolTiers.FATIUM);
						public static final DeferredItem<HoeItem> HOE = registerHoe("fatium_hoe", ModToolTiers.FATIUM);
				}
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = registerArmor("fatium_helmet", ModArmorMaterials.FATIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET);
						public static final DeferredItem<ArmorItem> CHESTPLATE = registerArmor("fatium_chestplate", ModArmorMaterials.FATIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE);
						public static final DeferredItem<ArmorItem> LEGGINGS = registerArmor("fatium_leggings", ModArmorMaterials.FATIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS);
						public static final DeferredItem<ArmorItem> BOOTS = registerArmor("fatium_boots", ModArmorMaterials.FATIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS);
				}
				public static class Weapons { public static final DeferredItem<SwordItem> SWORD = registerSword("fatium_sword", ModToolTiers.FATIUM); }
		}

		public static class Titanium {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_titanium", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("titanium_nugget", () -> new Item(new Item.Properties()));
				}
				public static class Tools {
						public static final DeferredItem<BreadiniumHammerItem> HAMMER = registerHammer("titanium_hammer", ModToolTiers.TITANIUM, 5, 5, ModTags.Blocks.BASIC_HAMMER_MINEABLE, "tooltip.thingsfordays.3hammer");
						public static final DeferredItem<BreadiniumHammerItem> AXE_HAMMER = registerHammer("titanium_wood_hammer", ModToolTiers.TITANIUM, 3, 3, ModTags.Blocks.AXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3wood_hammer");
						public static final DeferredItem<BreadiniumHammerItem> PICKAXE_HAMMER = registerHammer("titanium_pickaxe_hammer", ModToolTiers.TITANIUM, 3, 3, ModTags.Blocks.PICKAXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3pickaxe_hammer");
						public static final DeferredItem<BreadiniumHammerItem> SHOVEL_HAMMER = registerHammer("titanium_shovel_hammer", ModToolTiers.TITANIUM, 5, 5, ModTags.Blocks.SHOVEL_HAMMER_MINEABLE, "tooltip.thingsfordays.3shovel_hammer");
						public static final DeferredItem<PickaxeItem> PICKAXE = registerPickaxe("titanium_pickaxe", ModToolTiers.TITANIUM);
						public static final DeferredItem<AxeItem> AXE = registerAxe("titanium_axe", ModToolTiers.TITANIUM);
						public static final DeferredItem<ShovelItem> SHOVEL = registerShovel("titanium_shovel", ModToolTiers.TITANIUM);
						public static final DeferredItem<HoeItem> HOE = registerHoe("titanium_hoe", ModToolTiers.TITANIUM);
				}
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = registerArmor("titanium_helmet", ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET);
						public static final DeferredItem<ArmorItem> CHESTPLATE = registerArmor("titanium_chestplate", ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE);
						public static final DeferredItem<ArmorItem> LEGGINGS = registerArmor("titanium_leggings", ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS);
						public static final DeferredItem<ArmorItem> BOOTS = registerArmor("titanium_boots", ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS);
				}
				public static class Weapons { public static final DeferredItem<SwordItem> SWORD = registerSword("titanium_sword", ModToolTiers.TITANIUM); }
		}

		public static class Halium {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_halium", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("halium_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("halium_nugget", () -> new Item(new Item.Properties()));
				}
				public static class Tools {
						public static final DeferredItem<BreadiniumHammerItem> HAMMER = registerHammer("halium_hammer", ModToolTiers.HALIUM, 5, 5, ModTags.Blocks.BASIC_HAMMER_MINEABLE, "tooltip.thingsfordays.3hammer");
						public static final DeferredItem<BreadiniumHammerItem> AXE_HAMMER = registerHammer("halium_wood_hammer", ModToolTiers.HALIUM, 3, 3, ModTags.Blocks.AXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3wood_hammer");
						public static final DeferredItem<BreadiniumHammerItem> PICKAXE_HAMMER = registerHammer("halium_pickaxe_hammer", ModToolTiers.HALIUM, 3, 3, ModTags.Blocks.PICKAXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3pickaxe_hammer");
						public static final DeferredItem<BreadiniumHammerItem> SHOVEL_HAMMER = registerHammer("halium_shovel_hammer", ModToolTiers.HALIUM, 5, 5, ModTags.Blocks.SHOVEL_HAMMER_MINEABLE, "tooltip.thingsfordays.3shovel_hammer");
						public static final DeferredItem<PickaxeItem> PICKAXE = registerPickaxe("halium_pickaxe", ModToolTiers.HALIUM);
						public static final DeferredItem<AxeItem> AXE = registerAxe("halium_axe", ModToolTiers.HALIUM);
						public static final DeferredItem<ShovelItem> SHOVEL = registerShovel("halium_shovel", ModToolTiers.HALIUM);
						public static final DeferredItem<HoeItem> HOE = registerHoe("halium_hoe", ModToolTiers.HALIUM);
				}
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = registerArmor("halium_helmet", ModArmorMaterials.HALIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET);
						public static final DeferredItem<ArmorItem> CHESTPLATE = registerArmor("halium_chestplate", ModArmorMaterials.HALIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE);
						public static final DeferredItem<ArmorItem> LEGGINGS = registerArmor("halium_leggings", ModArmorMaterials.HALIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS);
						public static final DeferredItem<ArmorItem> BOOTS = registerArmor("halium_boots", ModArmorMaterials.HALIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS);
				}
				public static class Weapons { public static final DeferredItem<SwordItem> SWORD = registerSword("halium_sword", ModToolTiers.HALIUM); }
		}

		public static class Uhen {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_uhen", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("uhen_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("uhen_nugget", () -> new Item(new Item.Properties()));
				}
				public static class Tools {
						public static final DeferredItem<BreadiniumHammerItem> HAMMER = registerHammer("uhen_hammer", ModToolTiers.UHEN, 5, 5, ModTags.Blocks.BASIC_HAMMER_MINEABLE, "tooltip.thingsfordays.3hammer");
						public static final DeferredItem<BreadiniumHammerItem> AXE_HAMMER = registerHammer("uhen_wood_hammer", ModToolTiers.UHEN, 3, 3, ModTags.Blocks.AXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3wood_hammer");
						public static final DeferredItem<BreadiniumHammerItem> PICKAXE_HAMMER = registerHammer("uhen_pickaxe_hammer", ModToolTiers.UHEN, 3, 3, ModTags.Blocks.PICKAXE_HAMMER_MINEABLE, "tooltip.thingsfordays.3pickaxe_hammer");
						public static final DeferredItem<BreadiniumHammerItem> SHOVEL_HAMMER = registerHammer("uhen_shovel_hammer", ModToolTiers.UHEN, 5, 5, ModTags.Blocks.SHOVEL_HAMMER_MINEABLE, "tooltip.thingsfordays.3shovel_hammer");
						public static final DeferredItem<PickaxeItem> PICKAXE = registerPickaxe("uhen_pickaxe", ModToolTiers.UHEN);
						public static final DeferredItem<AxeItem> AXE = registerAxe("uhen_axe", ModToolTiers.UHEN);
						public static final DeferredItem<ShovelItem> SHOVEL = registerShovel("uhen_shovel", ModToolTiers.UHEN);
						public static final DeferredItem<HoeItem> HOE = registerHoe("uhen_hoe", ModToolTiers.UHEN);
				}
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = registerArmor("uhen_helmet", ModArmorMaterials.UHEN_ARMOR_MATERIAL, ArmorItem.Type.HELMET);
						public static final DeferredItem<ArmorItem> CHESTPLATE = registerArmor("uhen_chestplate", ModArmorMaterials.UHEN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE);
						public static final DeferredItem<ArmorItem> LEGGINGS = registerArmor("uhen_leggings", ModArmorMaterials.UHEN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS);
						public static final DeferredItem<ArmorItem> BOOTS = registerArmor("uhen_boots", ModArmorMaterials.UHEN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS);
				}
				public static class Weapons { public static final DeferredItem<SwordItem> SWORD = registerSword("uhen_sword", ModToolTiers.UHEN); }
		}

		public static class Mantisite {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_mantisite", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("mantisite_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("mantisite_nugget", () -> new Item(new Item.Properties()));
				}
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = registerArmor("mantisite_helmet", ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET);
						public static final DeferredItem<ArmorItem> CHESTPLATE = registerArmor("mantisite_chestplate", ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE);
						public static final DeferredItem<ArmorItem> LEGGINGS = registerArmor("mantisite_leggings", ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS);
						public static final DeferredItem<ArmorItem> BOOTS = registerArmor("mantisite_boots", ModArmorMaterials.MANTISITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS);
				}
				public static class Weapons { public static final DeferredItem<SwordItem> SWORD = registerSword("mantisite_sword", ModToolTiers.MANTISITE); }
		}

		public static class Farium {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_farium", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("farium_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("farium_nugget", () -> new Item(new Item.Properties()));
				}
				public static class Tools {
						public static final DeferredItem<BreadiniumHammerItem> HAMMER = registerHammer("farium_hammer", ModToolTiers.FARIUM, 5, 5, ModTags.Blocks.BASIC_HAMMER_MINEABLE, "tooltip.thingsfordays.3hammer");
						public static final DeferredItem<PickaxeItem> PICKAXE = registerPickaxe("farium_pickaxe", ModToolTiers.FARIUM);
						public static final DeferredItem<AxeItem> AXE = registerAxe("farium_axe", ModToolTiers.FARIUM);
						public static final DeferredItem<ShovelItem> SHOVEL = registerShovel("farium_shovel", ModToolTiers.FARIUM);
						public static final DeferredItem<HoeItem> HOE = registerHoe("farium_hoe", ModToolTiers.FARIUM);
				}
				public static class Armor {
						public static final DeferredItem<ArmorItem> HELMET = registerArmor("farium_helmet", ModArmorMaterials.FARIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET);
						public static final DeferredItem<ArmorItem> CHESTPLATE = registerArmor("farium_chestplate", ModArmorMaterials.FARIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE);
						public static final DeferredItem<ArmorItem> LEGGINGS = registerArmor("farium_leggings", ModArmorMaterials.FARIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS);
						public static final DeferredItem<ArmorItem> BOOTS = registerArmor("farium_boots", ModArmorMaterials.FARIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS);
				}
				public static class Weapons { public static final DeferredItem<SwordItem> SWORD = registerSword("farium_sword", ModToolTiers.FARIUM); }
		}

		public static class Placine {
				public static class Resource {
						public static final DeferredItem<Item> RAW = ITEMS.register("raw_placine", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> INGOT = ITEMS.register("placine_ingot", () -> new Item(new Item.Properties()));
						public static final DeferredItem<Item> NUGGET = ITEMS.register("placine_nugget", () -> new Item(new Item.Properties()));
				}
				public static class Tools {
						public static final DeferredItem<HoeItem> HOE = registerHoe("placine_hoe", ModToolTiers.PLACINE);
				}
		}
		
		
		public static class Resource {
				public static final DeferredItem<Item> SUPERPEARL = ITEMS.register("super_pearl", () -> new Item(new Item.Properties())); //TODO: make a reusable ender pearl
		}

		private static DeferredItem<PickaxeItem> registerPickaxe(String name, Tier tier) {
				return ITEMS.register(name, () -> new PickaxeItem(tier, new Item.Properties().attributes(PickaxeItem.createAttributes(tier, 1.0f, -2.8f))));
		}

		private static DeferredItem<AxeItem> registerAxe(String name, Tier tier) {
				return ITEMS.register(name, () -> new AxeItem(tier, new Item.Properties().attributes(AxeItem.createAttributes(tier, 6.0f, -3.2f))));
		}

		private static DeferredItem<ShovelItem> registerShovel(String name, Tier tier) {
				return ITEMS.register(name, () -> new ShovelItem(tier, new Item.Properties().attributes(ShovelItem.createAttributes(tier, 1.5f, -3.0f))));
		}

		private static DeferredItem<HoeItem> registerHoe(String name, Tier tier) {
				return ITEMS.register(name, () -> new HoeItem(tier, new Item.Properties().attributes(HoeItem.createAttributes(tier, 0f, -2.4f))));
		}

		private static DeferredItem<SwordItem> registerSword(String name, Tier tier) {
				return ITEMS.register(name, () -> new SwordItem(tier, new Item.Properties().attributes(SwordItem.createAttributes(tier, 5.0f, -2.4f))));
		}

		private static DeferredItem<DimensionalWeaponItem> registerDimensionalWeapon(
				String name, DimensionalWeaponItem.Power power, float damage, float speed) {
				return ITEMS.register(name, () -> new DimensionalWeaponItem(Tiers.NETHERITE, power,
						new Item.Properties().durability(1800).fireResistant()
								.attributes(SwordItem.createAttributes(Tiers.NETHERITE, damage, speed))));
		}

		private static DeferredItem<ArmorItem> registerArmor(String name, net.minecraft.core.Holder<ArmorMaterial> material, ArmorItem.Type type) {
				return ITEMS.register(name, () -> new ArmorItem(material, type, new Item.Properties().durability(type.getDurability(19))));
		}

		private static DeferredItem<BreadiniumHammerItem> registerHammer(String name, Tier tier, int radius, int depth, TagKey<Block> mineableTag, String tooltip) {
				return ITEMS.register(name, () -> new BreadiniumHammerItem(tier, new Item.Properties().attributes(PickaxeItem.createAttributes(tier, 6.7f, -4.0f)), radius, depth, mineableTag) {
						@Override public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
								tooltipComponents.add(Component.translatable(tooltip));
								super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
						}
				});
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

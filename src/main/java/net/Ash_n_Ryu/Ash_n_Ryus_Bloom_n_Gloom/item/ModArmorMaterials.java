package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item;


import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
		public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
				DeferredRegister.create(Registries.ARMOR_MATERIAL, ThingsForDays.MOD_ID);

		public static final Holder<ArmorMaterial> BREADINIUM_ARMOR_MATERIAL = register("breadinium",
				Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
						attribute.put(ArmorItem.Type.BOOTS,5);
						attribute.put(ArmorItem.Type.LEGGINGS,7);
						attribute.put(ArmorItem.Type.CHESTPLATE,9);
						attribute.put(ArmorItem.Type.HELMET,5);
						attribute.put(ArmorItem.Type.BODY,11);
				}), 30, 3f, 1.1f, () -> ModItems.Breadinium.Resource.INGOT.get());
		public static final Holder<ArmorMaterial> MYTHRIL_ARMOR_MATERIAL = register("mythril",
				Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
						attribute.put(ArmorItem.Type.BOOTS,5);
						attribute.put(ArmorItem.Type.LEGGINGS,7);
						attribute.put(ArmorItem.Type.CHESTPLATE,9);
						attribute.put(ArmorItem.Type.HELMET,5);
						attribute.put(ArmorItem.Type.BODY,11);
				}), 30, 3f, 1.1f, () -> ModItems.Mythril.Resource.INGOT.get());
		public static final Holder<ArmorMaterial> ORGA_ARMOR_MATERIAL = registerStandard("orga", () -> ModItems.Orga.Resource.INGOT.get());
		public static final Holder<ArmorMaterial> POLNUMARIUM_ARMOR_MATERIAL = registerStandard("polnumarium", () -> ModItems.Polnumarium.Resource.INGOT.get());
		public static final Holder<ArmorMaterial> FATIUM_ARMOR_MATERIAL = registerStandard("fatium", () -> ModItems.Fatium.Resource.INGOT.get());
		public static final Holder<ArmorMaterial> TITANIUM_ARMOR_MATERIAL = registerStandard("titanium", () -> ModItems.Titanium.Resource.INGOT.get());
		public static final Holder<ArmorMaterial> HALIUM_ARMOR_MATERIAL = registerStandard("halium", () -> ModItems.Halium.Resource.INGOT.get());
		public static final Holder<ArmorMaterial> UHEN_ARMOR_MATERIAL = registerStandard("uhen", () -> ModItems.Uhen.Resource.INGOT.get());
		public static final Holder<ArmorMaterial> MANTISITE_ARMOR_MATERIAL = registerStandard("mantisite", () -> ModItems.Mantisite.Resource.INGOT.get());
		public static final Holder<ArmorMaterial> FARIUM_ARMOR_MATERIAL = registerStandard("farium", () -> ModItems.Farium.Resource.INGOT.get());

		public static Holder<ArmorMaterial> registerStandard(String name, Supplier<Item> ingredientItem) {
				return register(name, Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
						attribute.put(ArmorItem.Type.BOOTS, 5);
						attribute.put(ArmorItem.Type.LEGGINGS, 7);
						attribute.put(ArmorItem.Type.CHESTPLATE, 9);
						attribute.put(ArmorItem.Type.HELMET, 5);
						attribute.put(ArmorItem.Type.BODY, 11);
				}), 30, 3f, 1.1f, ingredientItem);
		}
		
		private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
				int enchantability, float toughness, float knockbackResistance,
				Supplier<Item> ingredientItem) {
				Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
				Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
				List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(
						net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, name)));
				
				EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
				for (ArmorItem.Type type : ArmorItem.Type.values()) {
						typeMap.put(type, typeProtection.get(type));
				}
				
				return ARMOR_MATERIALS.register(name,
						() -> new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
		}

		public static void register(IEventBus eventBus) {
				ARMOR_MATERIALS.register(eventBus);
		}
}

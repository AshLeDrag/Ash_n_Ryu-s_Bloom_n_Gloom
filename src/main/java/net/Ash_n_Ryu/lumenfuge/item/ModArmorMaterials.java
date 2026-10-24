package net.Ash_n_Ryu.lumenfuge.item;


import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
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
				DeferredRegister.create(Registries.ARMOR_MATERIAL, Lumenfuge.MOD_ID);

		public static final Holder<ArmorMaterial> MANTISITE_ARMOR_MATERIAL = register("mantisite",
				Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
						attribute.put(ArmorItem.Type.BOOTS,5);
						attribute.put(ArmorItem.Type.LEGGINGS,7);
						attribute.put(ArmorItem.Type.CHESTPLATE,9);
						attribute.put(ArmorItem.Type.HELMET,5);
						attribute.put(ArmorItem.Type.BODY,11);
				}), 30, 3f, 1.1f, () -> ModItems.MANTISITE_SHARD.get());

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
						net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, name)));
				
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

package net.Ash_n_Ryu.lumenfuge.enchantment;


import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.enchantment.custom.LightningStrikerEnchantmentEffect;
import net.Ash_n_Ryu.lumenfuge.util.ModTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentTarget;

public class ModEnchantments {
		
		public static final ResourceKey<Enchantment> LIGHTNING_STRIKER = ResourceKey.create(Registries.ENCHANTMENT,
				ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "lightning_striker"));
		public static final ResourceKey<Enchantment> TELEPORTATION = ResourceKey.create(Registries.ENCHANTMENT,
				ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "teleportation"));
		public static final ResourceKey<Enchantment> HOLLOW = ResourceKey.create(Registries.ENCHANTMENT,
				ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "hollow"));
		public static final ResourceKey<Enchantment> HARDENED = ResourceKey.create(Registries.ENCHANTMENT,
				ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "hardened"));
		public static final ResourceKey<Enchantment> GATHER = ResourceKey.create(Registries.ENCHANTMENT,
				ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "gather"));
		
		public static void bootstrap(BootstrapContext<Enchantment> context) {
				var enchantments = context.lookup(Registries.ENCHANTMENT);
				var items = context.lookup(Registries.ITEM);
				
				register(context, LIGHTNING_STRIKER, Enchantment.enchantment(Enchantment.definition(
								items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
								items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
								5, 2,
								Enchantment.dynamicCost(5, 7),
								Enchantment.dynamicCost(25, 7),
								2,
								EquipmentSlotGroup.MAINHAND))
																		 .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
																		 .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER,
																				 EnchantmentTarget.VICTIM, new LightningStrikerEnchantmentEffect()));
				
				register(context, TELEPORTATION, Enchantment.enchantment(Enchantment.definition(
								items.getOrThrow(ModTags.Items.COLOSSAL_SWORD_ENCHANTABLE),
								1, 1,
								Enchantment.dynamicCost(1, 1),
								Enchantment.dynamicCost(50, 1),
								4,
								EquipmentSlotGroup.MAINHAND))
																	.exclusiveWith(enchantments.getOrThrow(ModTags.Enchantments.RETURN_EXCLUSIVES)));
				
				register(context, HOLLOW, Enchantment.enchantment(Enchantment.definition(
								items.getOrThrow(ModTags.Items.COLOSSAL_SWORD_ENCHANTABLE),
								1, 1,
								Enchantment.dynamicCost(5, 5),
								Enchantment.dynamicCost(50, 5),
								4,
								EquipmentSlotGroup.MAINHAND)));
				
				register(context, HARDENED, Enchantment.enchantment(Enchantment.definition(
								items.getOrThrow(ModTags.Items.COLOSSAL_SWORD_ENCHANTABLE),
								1, 15,
								Enchantment.dynamicCost(10, 5),
								Enchantment.dynamicCost(50, 5),
								6,
								EquipmentSlotGroup.MAINHAND)));
				
				register(context, GATHER, Enchantment.enchantment(Enchantment.definition(
								items.getOrThrow(ModTags.Items.COLOSSAL_SWORD_ENCHANTABLE),
								1, 3,
								Enchantment.dynamicCost(1, 1),
								Enchantment.dynamicCost(50, 1),
								4,
								EquipmentSlotGroup.MAINHAND))
														  .exclusiveWith(enchantments.getOrThrow(ModTags.Enchantments.RETURN_EXCLUSIVES)));
		}
		
		private static void register(BootstrapContext<Enchantment> registry, ResourceKey<Enchantment> key,
				Enchantment.Builder builder) {
				registry.register(key, builder.build(key.location()));
		}
}
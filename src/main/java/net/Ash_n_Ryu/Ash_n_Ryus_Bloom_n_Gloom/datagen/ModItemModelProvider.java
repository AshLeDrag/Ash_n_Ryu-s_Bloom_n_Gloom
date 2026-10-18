package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.datagen;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.ExampleMod;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.ModBlocks;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
		public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
				super(output, ExampleMod.MOD_ID, existingFileHelper);
		}
		
		private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
		static {
				trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
				trimMaterials.put(TrimMaterials.IRON, 0.2F);
				trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
				trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
				trimMaterials.put(TrimMaterials.COPPER, 0.5F);
				trimMaterials.put(TrimMaterials.GOLD, 0.6F);
				trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
				trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
				trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
				trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
		}
		
		@Override
		protected void registerModels() {
				// basicItem Items
				basicItem(ModItems.Foods.RADISH.get());
				basicItem(ModItems.Fuels.STARLIGHT_ASHES.get());
				basicItem(ModItems.Breadinium.Resource.RAW.get());
				basicItem(ModItems.Breadinium.Resource.INGOT.get());
				basicItem(ModItems.Foods.RADISH_SEEDS.get());
				
				// handheldItem Items
				handheldItem(ModItems.Breadinium.Weapons.SWORD);
				handheldItem(ModItems.Breadinium.Tools.AXE);
				handheldItem(ModItems.Breadinium.Tools.PICKAXE);
				handheldItem(ModItems.Breadinium.Tools.SHOVEL);
				handheldItem(ModItems.Breadinium.Tools.HOE);
				handheldItem(ModItems.Breadinium.Tools.HAMMER);
				handheldItem(ModItems.Breadinium.Tools.AXE_HAMMER);
				handheldItem(ModItems.Breadinium.Tools.PICKAXE_HAMMER);
				handheldItem(ModItems.Breadinium.Tools.SHOVEL_HAMMER);
				
				// Armor
				trimmedArmorItem(ModItems.Breadinium.Armor.HELMET);
				trimmedArmorItem(ModItems.Breadinium.Armor.CHESTPLATE);
				trimmedArmorItem(ModItems.Breadinium.Armor.LEGGINGS);
				trimmedArmorItem(ModItems.Breadinium.Armor.BOOTS);
				basicItem(ModItems.Breadinium.Armor.HORSE.get());
				
				
				
				// Saplings
				saplingItem(ModBlocks.REDWOOD_SAPLING);
		}
		
		private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
				return withExistingParent(item.getId().getPath(),
						ResourceLocation.parse("item/generated")).texture("layer0",
						ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID,"block/" + item.getId().getPath()));
		}
		
		// Shoutout to El_Redstoniano for making this
		
		private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
				final String MOD_ID = ExampleMod.MOD_ID; // Change this to your mod id
				
				if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
						trimMaterials.forEach((trimMaterial, value) -> {
								float trimValue = value;
								
								String armorType = switch (armorItem.getEquipmentSlot()) {
										case HEAD -> "helmet";
										case CHEST -> "chestplate";
										case LEGS -> "leggings";
										case FEET -> "boots";
										default -> "";
								};
								
								String armorItemPath = armorItem.toString();
								String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
								String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
								ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
								ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
								ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);
								
								// This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
								// avoid an IllegalArgumentException
								existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");
								
								// Trimmed armorItem files
								getBuilder(currentTrimName)
										.parent(new ModelFile.UncheckedModelFile("item/generated"))
										.texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
										.texture("layer1", trimResLoc);
								
								// Non-trimmed armorItem file (normal variant)
								this.withExistingParent(itemDeferredItem.getId().getPath(),
												mcLoc("item/generated"))
										.override()
										.model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
										.predicate(mcLoc("trim_type"), trimValue).end()
										.texture("layer0",
												ResourceLocation.fromNamespaceAndPath(MOD_ID,
														"item/" + itemDeferredItem.getId().getPath()));
						});
				}
		}
		
		private ItemModelBuilder handheldItem(DeferredItem<?> item) {
				return withExistingParent(item.getId().getPath(),
						ResourceLocation.parse("item/handheld")).texture("layer0",
						ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID,"item/" + item.getId().getPath()));
		}
}

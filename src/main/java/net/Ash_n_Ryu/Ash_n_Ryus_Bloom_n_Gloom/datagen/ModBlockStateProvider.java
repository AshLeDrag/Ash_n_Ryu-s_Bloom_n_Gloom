package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.datagen;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.ModBlocks;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.custom.RadishCropBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, exFileHelper);
	}
	
	@Override
	protected void registerStatesAndModels() {
			// cubeAll Blocks
			blockWithItem(ModBlocks.MANA_BLOCK);
			blockWithItem(ModBlocks.BREADINIUM_DEEPSLATE_ORE);
			blockWithItem(ModBlocks.BREADINIUM_ORE);
			
			logBlock(((RotatedPillarBlock) ModBlocks.REDWOOD_LOG.get()));
			axisBlock(((RotatedPillarBlock) ModBlocks.REDWOOD_WOOD.get()), blockTexture(ModBlocks.REDWOOD_LOG.get()), blockTexture(ModBlocks.REDWOOD_LOG.get()));
			logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_REDWOOD_LOG.get()));
			axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_REDWOOD_WOOD.get()), blockTexture(ModBlocks.STRIPPED_REDWOOD_LOG.get()), blockTexture(ModBlocks.STRIPPED_REDWOOD_LOG.get()));
			
			blockItem(ModBlocks.REDWOOD_LOG);
			blockItem(ModBlocks.REDWOOD_WOOD);
			blockItem(ModBlocks.STRIPPED_REDWOOD_LOG);
			blockItem(ModBlocks.STRIPPED_REDWOOD_WOOD);
			
			blockWithItem(ModBlocks.REDWOOD_PLANKS);
			
			blockWithItem(ModBlocks.WEAPON_FORGE);
			
			leavesBlock(ModBlocks.REDWOOD_LEAVES);
			saplingBlock(ModBlocks.REDWOOD_SAPLING);
			
			
			
			
			
			// Crops
			makeCrop(((CropBlock) ModBlocks.RADISH_CROP.get()), "radish_crop_stage");
	}
	
	private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
			simpleBlock(blockRegistryObject.get(),
							models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
	}
	
	private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
			simpleBlockWithItem(blockRegistryObject.get(),
									  models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
																	 "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
	}
		
	public void makeCrop(CropBlock block, String modelName) {
			Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName);
			
			getVariantBuilder(block).forAllStates(function);
	}
		
	private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName) {
			ConfiguredModel[] models = new ConfiguredModel[1];
			models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((RadishCropBlock) block).getAgeProperty()),
					ResourceLocation.fromNamespaceAndPath(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID, "block/" + modelName + state.getValue(((RadishCropBlock) block).getAgeProperty()))).renderType("cutout"));
			
			return models;
	}
	
	public void blockWithItem(DeferredBlock<?> deferredBlock) {
		simpleBlockWithItem(deferredBlock.get(),cubeAll(deferredBlock.get()));
	}
	
	private void blockItem(DeferredBlock<?> deferredBlock) {
		simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("thingsfordays:block/" + deferredBlock.getId().getPath()));
	}
	
	private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
		simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("thingsfordays:block/" + deferredBlock.getId().getPath() + appendix));
	}
}

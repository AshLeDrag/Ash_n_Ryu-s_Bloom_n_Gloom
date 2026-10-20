package net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.datagen;

import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.block.ModBlocks;
import net.Ash_n_Ryu.ash_n_ryus_bloom_n_gloom.block.custom.RadishCropBlock;
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
//			blockWithItem(ModBlocks.MANTISITE_DEEPSLATE_ORE);
//			blockWithItem(ModBlocks.MANTISITE_ORE);
			
			logBlock(((RotatedPillarBlock) ModBlocks.ERNEST_LOG.get()));
			axisBlock(((RotatedPillarBlock) ModBlocks.ERNEST_WOOD.get()), blockTexture(ModBlocks.ERNEST_LOG.get()), blockTexture(ModBlocks.ERNEST_LOG.get()));
			logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ERNEST_LOG.get()));
			axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ERNEST_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ERNEST_LOG.get()), blockTexture(ModBlocks.STRIPPED_ERNEST_LOG.get()));
			
			blockItem(ModBlocks.ERNEST_LOG);
			blockItem(ModBlocks.ERNEST_WOOD);
			blockItem(ModBlocks.STRIPPED_ERNEST_LOG);
			blockItem(ModBlocks.STRIPPED_ERNEST_WOOD);
			
			blockWithItem(ModBlocks.ERNEST_PLANKS);
			
			leavesBlock(ModBlocks.ERNEST_LEAVES);
			leavesBlock(ModBlocks.DEAD_ERNEST_LEAVES);
			saplingBlock(ModBlocks.ERNEST_SAPLING);
			saplingBlock(ModBlocks.DEAD_ERNEST_SAPLING);
			
			stairsBlock(ModBlocks.ERNEST_STAIRS.get(), blockTexture(ModBlocks.ERNEST_PLANKS.get()));
			slabBlock(ModBlocks.ERNEST_SLAB.get(), blockTexture(ModBlocks.ERNEST_PLANKS.get()), blockTexture(ModBlocks.ERNEST_PLANKS.get()));
			
			buttonBlock(ModBlocks.ERNEST_BUTTON.get(), blockTexture(ModBlocks.ERNEST_PLANKS.get()));
			pressurePlateBlock(ModBlocks.ERNEST_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ERNEST_PLANKS.get()));
			
			fenceBlock(ModBlocks.ERNEST_FENCE.get(), blockTexture(ModBlocks.ERNEST_PLANKS.get()));
			fenceGateBlock(ModBlocks.ERNEST_FENCE_GATE.get(), blockTexture(ModBlocks.ERNEST_PLANKS.get()));
			
			doorBlockWithRenderType(ModBlocks.ERNEST_DOOR.get(), modLoc("block/ernest_door_bottom"), modLoc("block/ernest_door_top"), "cutout");
			trapdoorBlockWithRenderType(ModBlocks.ERNEST_TRAPDOOR.get(), modLoc("block/ernest_trapdoor"), true, "cutout");
			
			
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

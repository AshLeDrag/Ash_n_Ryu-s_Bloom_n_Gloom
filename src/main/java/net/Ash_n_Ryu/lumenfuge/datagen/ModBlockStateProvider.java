package net.Ash_n_Ryu.lumenfuge.datagen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, Lumenfuge.MOD_ID, exFileHelper);
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
			
			
			blockItem(ModBlocks.ERNEST_STAIRS);
			blockItem(ModBlocks.ERNEST_SLAB);
			blockItem(ModBlocks.ERNEST_PRESSURE_PLATE);
			blockItem(ModBlocks.ERNEST_FENCE_GATE);
			blockItem(ModBlocks.ERNEST_TRAPDOOR, "_bottom");
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
	
	
	public void blockWithItem(DeferredBlock<?> deferredBlock) {
		simpleBlockWithItem(deferredBlock.get(),cubeAll(deferredBlock.get()));
	}
	
	private void blockItem(DeferredBlock<?> deferredBlock) {
		simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + deferredBlock.getId().getPath()).toString()));
	}
	
	private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
		simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + deferredBlock.getId().getPath() + appendix).toString()));
	}
}

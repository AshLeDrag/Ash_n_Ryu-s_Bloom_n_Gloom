package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.Ash_n_Ryus_Bloom_n_Gloom;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.custom.*;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item.ModItems;
import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
      public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Ash_n_Ryus_Bloom_n_Gloom.MOD_ID);
      
      
      
      public static final DeferredBlock<Block> MANTISTE_ORE = registerBlock("mantisite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
      public static final DeferredBlock<Block> MANTISTE_DEEPSLATE_ORE = registerBlock("mantisite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
      public static final DeferredBlock<Block> MANTISTE_BLOCK = registerBlock("mantisite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
      public static final DeferredBlock<Block> RAW_MANTISTE_BLOCK = registerBlock("mantisite_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
      
      
      
      
      
      public static final DeferredBlock<Block> ERNEST_LOG = registerBlock("ernest_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
      public static final DeferredBlock<Block> ERNEST_WOOD = registerBlock("ernest_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
      public static final DeferredBlock<Block> STRIPPED_ERNEST_LOG = registerBlock("stripped_ernest_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
      public static final DeferredBlock<Block> STRIPPED_ERNEST_WOOD = registerBlock("stripped_ernest_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
      
      
      public static final DeferredBlock<Block> ERNEST_PLANKS = registerBlock("ernest_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                  @Override
                  public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return false;
                  }
                  
                  @Override
                  public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 0;
                  }
                  
                  @Override
                  public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 0;
                  }
            });
      public static final DeferredBlock<Block> ERNEST_LEAVES = registerBlock("ernest_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                  @Override
                  public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return false;
                  }
                  
                  @Override
                  public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 0;
                  }
                  
                  @Override
                  public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 0;
                  }
            });
      
      public static final DeferredBlock<Block> ERNEST_SAPLING = registerBlock("ernest_sapling",
            () -> new SaplingBlock(ModTreeGrowers.ERNEST, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
      
      
      
      
      
      
      
      
      
      
      // CropBlocks
      
      public static final DeferredBlock<Block> RADISH_CROP = BLOCKS.register("radish_crop",
            () -> new RadishCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEETROOTS)));
      
      
      
      
      
      
      
      
      private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
            DeferredBlock<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn);
            return toReturn;
      }
      
      
      private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
            ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
      }
      
      public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}
      
}

//TODO:Mantisite Ore...
//TODO:Ernest Tree
//TODO:new type of stone
//TODO:new plant --> grows on ani side of a block
//TODO:
//TODO:
//TODO:
//TODO:
//TODO:
//TODO:
//TODO:
//TODO:
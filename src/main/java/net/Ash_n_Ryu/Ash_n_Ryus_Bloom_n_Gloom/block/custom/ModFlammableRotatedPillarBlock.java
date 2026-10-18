package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.custom;

import net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
		public ModFlammableRotatedPillarBlock(Properties properties) {
				super(properties);
		}
		
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
		
		@Override
		public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context,
																		 ItemAbility itemAbility, boolean simulate) {
				if(context.getItemInHand().getItem() instanceof AxeItem) {
						
						if(state.is(ModBlocks.ERNEST_LOG)) {
								return ModBlocks.STRIPPED_ERNEST_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
						}
						
						if(state.is(ModBlocks.ERNEST_WOOD)) {
								return ModBlocks.STRIPPED_ERNEST_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
						}
				}
				
				return super.getToolModifiedState(state, context, itemAbility, simulate);
		}
}
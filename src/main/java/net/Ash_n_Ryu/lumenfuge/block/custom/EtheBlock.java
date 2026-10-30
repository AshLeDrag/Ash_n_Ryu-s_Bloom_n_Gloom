package net.Ash_n_Ryu.lumenfuge.block.custom;

import com.mojang.serialization.MapCodec;
import net.Ash_n_Ryu.lumenfuge.entity.ModEntities;
import net.Ash_n_Ryu.lumenfuge.entity.custom.boss.EtheralKnightEntity;
import net.Ash_n_Ryu.lumenfuge.item.ModItems;
import net.Ash_n_Ryu.lumenfuge.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.List;

public class EtheBlock extends HorizontalDirectionalBlock {
		public static final MapCodec<EtheBlock> CODEC = simpleCodec(EtheBlock::new);
        private static final VoxelShape NORTH_SHAPE = Shapes.or(
                Block.box(0.5, 0, 1.5, 15.5, 11, 14.5),
                Block.box(-10, 9.5, 7, 26, 11.5, 9));
        private static final VoxelShape EAST_SHAPE = rotateClockwise(NORTH_SHAPE);
        private static final VoxelShape SOUTH_SHAPE = rotateClockwise(EAST_SHAPE);
        private static final VoxelShape WEST_SHAPE = rotateClockwise(SOUTH_SHAPE);

        private static VoxelShape rotateClockwise(VoxelShape shape) {
            VoxelShape[] result = {Shapes.empty()};
            shape.forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) ->
                    result[0] = Shapes.or(result[0], Shapes.box(
                            1 - maxZ, minY, minX, 1 - minZ, maxY, maxX)));
            return result[0].optimize();
        }
		
		public EtheBlock(Properties properties) {
				super(properties);
		}
		
		@Override
		protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
                return switch (state.getValue(FACING)) {
                    case EAST -> EAST_SHAPE;
                    case SOUTH -> SOUTH_SHAPE;
                    case WEST -> WEST_SHAPE;
                    default -> NORTH_SHAPE;
                };
		}

        @Override
        protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
            return getShape(state, level, pos, context);
        }
		
		@Override
		protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
				return CODEC;
		}
		
		@Nullable
		@Override
		public BlockState getStateForPlacement(BlockPlaceContext context) {
				return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
		}
		
		@Override
		protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
				builder.add(FACING);
		}
		
		@Override
		protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos,
                Player player, InteractionHand hand, BlockHitResult hit) {
            if (!stack.is(ModItems.ETHERAL_KEY.get())) return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
            if (level.isClientSide) return ItemInteractionResult.SUCCESS;
            ServerLevel server = (ServerLevel) level;
            if (server.getDifficulty() == Difficulty.PEACEFUL
                    || !server.getEntitiesOfClass(EtheralKnightEntity.class, new AABB(pos).inflate(64), Entity::isAlive).isEmpty()) {
                return ItemInteractionResult.FAIL;
            }
            EtheralKnightEntity boss = ModEntities.EtheralKnight.get().create(server);
            if (boss == null) return ItemInteractionResult.FAIL;
            boss.moveTo(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5,
                    state.getValue(FACING).toYRot(), 0F);
            if (!server.noCollision(boss) || server.containsAnyLiquid(boss.getBoundingBox())) {
                return ItemInteractionResult.FAIL;
            }
            boss.beginSummoning();
            if (!server.addFreshEntity(boss)) return ItemInteractionResult.FAIL;
            server.removeBlock(pos, false);
            repelPlayers(server, boss);
            if (!player.getAbilities().instabuild) stack.shrink(1);
            server.playSound(null, pos, SoundEvents.BEACON_ACTIVATE, SoundSource.HOSTILE, 2F, 0.6F);
            return ItemInteractionResult.CONSUME;
        }

        private void repelPlayers(ServerLevel level, EtheralKnightEntity boss) {
            for (net.minecraft.server.level.ServerPlayer nearby : level.getEntitiesOfClass(
                    net.minecraft.server.level.ServerPlayer.class,
                    boss.getBoundingBox().inflate(8, 4, 8), p -> p.isAlive() && !p.isSpectator())) {
                double dx = nearby.getX() - boss.getX();
                double dz = nearby.getZ() - boss.getZ();
                double distance = Math.sqrt(dx * dx + dz * dz);
                if (distance > 8) continue;
                if (distance < 0.001) {
                    // A player directly above the altar still needs an outward direction.
                    dx = -nearby.getLookAngle().x;
                    dz = -nearby.getLookAngle().z;
                    distance = Math.sqrt(dx * dx + dz * dz);
                    if (distance < 0.001) { dx = 1; dz = 0; distance = 1; }
                }
                nearby.push(dx / distance * 1.5, 0.45, dz / distance * 1.5);
                nearby.connection.send(new net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket(nearby));
            }
        }

        @Override
		protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
				Player player, BlockHitResult hitResult) {
				level.playSound(player, pos, SoundEvents.SPONGE_PLACE, SoundSource.BLOCKS, 1f, 1f);
				return InteractionResult.FAIL;
		}
		
		
		@Override
		public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
				tooltipComponents.add(Component.translatable("tooltip.etheblock"));
				super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
		}
}

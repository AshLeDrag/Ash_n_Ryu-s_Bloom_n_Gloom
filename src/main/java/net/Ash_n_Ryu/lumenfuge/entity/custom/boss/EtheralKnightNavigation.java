package net.Ash_n_Ryu.lumenfuge.entity.custom.boss;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.PathFinder;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.pathfinder.PathfindingContext;
import net.minecraft.world.level.pathfinder.WalkNodeEvaluator;
import net.minecraft.world.level.material.FluidState;

public class EtheralKnightNavigation extends GroundPathNavigation {
    public EtheralKnightNavigation(Mob mob, Level level) {
        super(mob, level);
        setCanFloat(true);
    }

    @Override
    protected PathFinder createPathFinder(int maxVisitedNodes) {
        nodeEvaluator = new WalkNodeEvaluator() {
            @Override
            public PathType getPathType(PathfindingContext context, int x, int y, int z) {
                PathType type = super.getPathType(context, x, y, z);
                BlockPos pos = new BlockPos(x, y, z);
                FluidState fluid = context.getBlockState(pos).getFluidState();
                FluidState below = context.getBlockState(pos.below()).getFluidState();
                if (type == PathType.OPEN && !below.isEmpty() && mob.canStandOnFluid(below)) {
                    return PathType.WALKABLE;
                }
                if ((type == PathType.WATER || type == PathType.LAVA)
                        && !fluid.isEmpty() && mob.canStandOnFluid(fluid)
                        && context.getBlockState(pos.above()).isAir()) {
                    return PathType.WALKABLE;
                }
                return type;
            }

            @Override
            protected double getFloorLevel(BlockPos pos) {
                FluidState fluid = currentContext.getBlockState(pos).getFluidState();
                if (!fluid.isEmpty() && mob.canStandOnFluid(fluid)) {
                    return pos.getY() + fluid.getHeight(currentContext.level(), pos);
                }
                BlockPos belowPos = pos.below();
                FluidState below = currentContext.getBlockState(belowPos).getFluidState();
                if (!below.isEmpty() && mob.canStandOnFluid(below)) {
                    return belowPos.getY() + below.getHeight(currentContext.level(), belowPos);
                }
                return super.getFloorLevel(pos);
            }
        };
        nodeEvaluator.setCanPassDoors(true);
        return new PathFinder(nodeEvaluator, maxVisitedNodes);
    }

    @Override
    public boolean isStableDestination(BlockPos pos) {
        FluidState fluid = level.getFluidState(pos);
        FluidState below = level.getFluidState(pos.below());
        return (!fluid.isEmpty() && mob.canStandOnFluid(fluid))
                || (!below.isEmpty() && mob.canStandOnFluid(below))
                || super.isStableDestination(pos);
    }
}

package net.Ash_n_Ryu.lumenfuge.event;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.Ash_n_Ryu.lumenfuge.entity.custom.boss.EtheralKnightEntity;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

@EventBusSubscriber(modid = Lumenfuge.MOD_ID)
public final class ModCommands {
    private ModCommands() {}

    @SubscribeEvent
    public static void register(RegisterCommandsEvent event) {
        event.getDispatcher().register(Commands.literal(Lumenfuge.MOD_ID)
                                             .requires(source -> source.hasPermission(2))
                                             .then(Commands.literal("phase1")
                                                         .executes(context -> Phase1(context.getSource()))
                                                         .then(Commands.argument("targets", EntityArgument.entities())
                                                                     .executes(context -> transition1(context.getSource(),
                                                                           EntityArgument.getEntities(context, "targets")))))
                                             .then(Commands.literal("phase2")
                                                         .executes(context -> Phase2(context.getSource()))
                                                         .then(Commands.argument("targets", EntityArgument.entities())
                                                                     .executes(context -> transition2(context.getSource(),
                                                                           EntityArgument.getEntities(context, "targets"))))));
    }

    private static int Phase1(CommandSourceStack source) {
        var position = source.getPosition();
        var boss = source.getLevel().getEntitiesOfClass(EtheralKnightEntity.class,
                        new AABB(position, position).inflate(64), Entity::isAlive).stream()
                .filter(entity -> entity.distanceToSqr(position) <= 64 * 64)
                .min(Comparator.comparingDouble(entity -> entity.distanceToSqr(position)));
        if (boss.isEmpty()) {
            source.sendFailure(Component.translatable("lumenfuge.0etheral"));
            return 0;
        }
        return transition1(source, List.of(boss.get()));
    }

    private static int Phase2(CommandSourceStack source) {
        var position = source.getPosition();
        var boss = source.getLevel().getEntitiesOfClass(EtheralKnightEntity.class,
                        new AABB(position, position).inflate(64), Entity::isAlive).stream()
                .filter(entity -> entity.distanceToSqr(position) <= 64 * 64)
                .min(Comparator.comparingDouble(entity -> entity.distanceToSqr(position)));
        if (boss.isEmpty()) {
            source.sendFailure(Component.translatable("lumenfuge.0etheral"));
            return 0;
        }
        return transition2(source, List.of(boss.get()));
    }
    
    
    

    private static int transition1(CommandSourceStack source, Collection<? extends Entity> targets) {
        int changed = 0;
        for (Entity target : targets) {
            if (target instanceof EtheralKnightEntity boss && boss.isAlive()
                    && boss.setPhase(0)) ++changed;
        }
        if (changed == 0) {
            source.sendFailure(Component.translatable("lumenfuge.djp1"));
            return 0;
        }
        
        int count = changed;
        source.sendSuccess(() -> Component.literal(Component.translatable("lumenfuge.phase").getString() + count + " boss."), true);
        return changed;
    }
    
    
    

    private static int transition2(CommandSourceStack source, Collection<? extends Entity> targets) {
        int changed = 0;
        for (Entity target : targets) {
            if (target instanceof EtheralKnightEntity boss && boss.isAlive()
                    && boss.setPhase(2)) ++changed;
        }
        if (changed == 0) {
            source.sendFailure(Component.translatable("lumenfuge.djp2"));
            return 0;
        }
        int count = changed;
        source.sendSuccess(() -> Component.literal(Component.translatable("lumenfuge.phase").getString() + count + " boss."), true);
        return changed;
    }
}

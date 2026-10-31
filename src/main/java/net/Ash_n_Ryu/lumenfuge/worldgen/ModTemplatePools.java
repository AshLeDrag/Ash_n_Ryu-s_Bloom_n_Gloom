package net.Ash_n_Ryu.lumenfuge.worldgen;

import com.mojang.datafixers.util.Pair;
import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;

import java.util.List;

public class ModTemplatePools {
    public static final ResourceKey<StructureTemplatePool> ETHEREAL_ARENA = ResourceKey.create(
            Registries.TEMPLATE_POOL, ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "ethereal_arena"));

    public static void bootstrap(BootstrapContext<StructureTemplatePool> context) {
        var pools = context.lookup(Registries.TEMPLATE_POOL);
        context.register(ETHEREAL_ARENA, new StructureTemplatePool(
                pools.getOrThrow(Pools.EMPTY),
                List.of(Pair.of(StructurePoolElement.single(Lumenfuge.MOD_ID + ":ethereal_arena"), 1)),
                StructureTemplatePool.Projection.RIGID));
    }
}

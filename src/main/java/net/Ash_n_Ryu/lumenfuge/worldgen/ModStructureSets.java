package net.Ash_n_Ryu.lumenfuge.worldgen;

import net.Ash_n_Ryu.lumenfuge.Lumenfuge;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;

public class ModStructureSets {
    public static final ResourceKey<StructureSet> ETHEREAL_ARENA = ResourceKey.create(
            Registries.STRUCTURE_SET, ResourceLocation.fromNamespaceAndPath(Lumenfuge.MOD_ID, "ethereal_arena"));

    public static void bootstrap(BootstrapContext<StructureSet> context) {
        var structures = context.lookup(Registries.STRUCTURE);
        context.register(ETHEREAL_ARENA, new StructureSet(
                structures.getOrThrow(ModStructures.Ethereal_Arena),
                // Spacing and separation are in chunks, not blocks.
                new RandomSpreadStructurePlacement(32, 8, RandomSpreadType.LINEAR, 193746251)));
    }
}

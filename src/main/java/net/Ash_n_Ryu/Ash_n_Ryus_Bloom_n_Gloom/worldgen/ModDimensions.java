package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.worldgen;

import net.AshLeDrag.thingsfordays.ThingsForDays;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public final class ModDimensions {
    public static final ResourceKey<Level> ASTRALIS = create("astralis");
    public static final ResourceKey<Level> VOLCANIS = create("volcanis");
    public static final ResourceKey<Level> SYLVARIA = create("sylvaria");
    public static final ResourceKey<Level> CRYOLUNE = create("cryolune");

    private ModDimensions() {}

    private static ResourceKey<Level> create(String name) {
        return ResourceKey.create(Registries.DIMENSION,
                ResourceLocation.fromNamespaceAndPath(ThingsForDays.MOD_ID, name));
    }
}

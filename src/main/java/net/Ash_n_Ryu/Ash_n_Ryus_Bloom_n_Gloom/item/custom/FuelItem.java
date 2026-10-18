package net.Ash_n_Ryu.Ash_n_Ryus_Bloom_n_Gloom.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class FuelItem extends Item {
    private int burnTime = 0;

    public FuelItem(Properties properties, int burnTime) {
        super(properties);
        this.burnTime = burnTime;
    }


    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return super.getBurnTime(itemStack, recipeType);
    }
}

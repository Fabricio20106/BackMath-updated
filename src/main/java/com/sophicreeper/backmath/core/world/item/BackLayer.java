package com.sophicreeper.backmath.core.world.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BackLayer extends ItemGroup {
    public static final BackLayer TAB = new BackLayer("back_math");

    public BackLayer(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(AxolotlTest.GOLDEN_PLATED.get());
    }
}

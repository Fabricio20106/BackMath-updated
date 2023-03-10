package com.sophicreeper.backmath.core.world.item;

import com.sophicreeper.backmath.core.world.level.block.BMBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class CharjanCoalBlockItem extends BlockItem {
    public CharjanCoalBlockItem(Properties properties) {
        super(BMBlocks.CHARJAN_COAL_BLOCK.get(), properties);
    }

    @Override
    public int getBurnTime(ItemStack stack) {
        return 4800;
    }
}

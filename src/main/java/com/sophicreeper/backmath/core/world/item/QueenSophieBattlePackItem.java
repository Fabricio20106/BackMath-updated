package com.sophicreeper.backmath.core.world.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class QueenSophieBattlePackItem extends Item {
    public QueenSophieBattlePackItem() {
        super(new Properties().isImmuneToFire().group(SophiesCursedFoods.TAB));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        ItemStack heldItem = player.getHeldItem(hand);
        player.addItemStackToInventory(new ItemStack(AxolotlTest.QUEEN_SOPHIE_SPAWN_EGG.get()));
        player.addItemStackToInventory(new ItemStack(AxolotlTest.QUEEN_SOPHIE_BATTLE_INFO.get()));
        heldItem.shrink(1);
        return super.onItemRightClick(world, player, hand);
    }
}

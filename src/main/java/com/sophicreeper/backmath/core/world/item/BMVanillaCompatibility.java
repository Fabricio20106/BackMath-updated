package com.sophicreeper.backmath.core.world.item;

import com.google.common.collect.Maps;
import com.sophicreeper.backmath.core.world.level.block.BMBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ShovelItem;

public class BMVanillaCompatibility {
    public static void registerCompatibilities() {
        flammable(BMBlocks.GUARANA_OAK_LEAVES.get(), 30, 60);
        flammable(BMBlocks.MANGO_OAK_LEAVES.get(), 30, 60);
        flammable(BMBlocks.GRAPE_VINE_LEAVES.get(), 30, 60);
        flammable(BMBlocks.LEMON_OAK_LEAVES.get(), 30, 60);
        flammable(BMBlocks.ALJAME_BIRCH_LEAVES.get(), 30, 60);
        flammable(BMBlocks.PINEAPPLE_OAK_LEAVES.get(), 30, 60);
        flammable(BMBlocks.CRYSTALLINE_BIRCH_LEAVES.get(), 30, 60);
        flammable(BMBlocks.ALJANWOOD_LEAVES.get(), 30, 60);
        flammable(BMBlocks.ALJANCAP_LEAVES.get(), 30, 60);
        flammable(BMBlocks.AMARACAP_LEAVES.get(), 30, 60);
        flammable(BMBlocks.INSOMNIAN_LEAVES.get(), 30, 60);
        flammable(BMBlocks.DEVIL_WOOL.get(), 30, 60);
        flammable(BMBlocks.DEVIL_CARPET.get(), 60, 20);
        flammable(BMBlocks.RED_YELLOW_FLOWER.get(), 60, 100);
        flammable(BMBlocks.FRIED_EGG_FLOWER.get(), 60, 100);
        flammable(BMBlocks.TURTLE_FRIED_EGG_FLOWER.get(), 60, 100);
        flammable(BMBlocks.ALJAN_TULIP.get(), 60, 100);
        flammable(BMBlocks.POISON_ROSE.get(), 60, 100);
        flammable(BMBlocks.INSOMNIAN_TULIP.get(), 60, 100);
        flammable(BMBlocks.TITO.get(), 30, 60);
        flammable(BMBlocks.TOTI.get(), 30, 60);
        flammable(BMBlocks.ALICE_TOY.get(), 60, 20);
        flammable(BMBlocks.ALAN_TOY.get(), 60, 20);
        flammable(BMBlocks.INNOVATOR_TOY.get(), 60, 20);
        flammable(BMBlocks.TYLER_TOY.get(), 60, 20);
        flammable(BMBlocks.MALENA_TOY.get(), 60, 20);
        strippable(BMBlocks.ALJANWOOD_LOG.get(), BMBlocks.STRIPPED_ALJANWOOD_LOG.get());
        strippable(BMBlocks.ALJANWOOD_WOOD.get(), BMBlocks.STRIPPED_ALJANWOOD_WOOD.get());
        strippable(BMBlocks.ALJANCAP_LOG.get(), BMBlocks.STRIPPED_ALJANCAP_LOG.get());
        strippable(BMBlocks.ALJANCAP_WOOD.get(), BMBlocks.STRIPPED_ALJANCAP_WOOD.get());
        strippable(BMBlocks.INSOMNIAN_LOG.get(), BMBlocks.STRIPPED_INSOMNIAN_LOG.get());
        strippable(BMBlocks.INSOMNIAN_WOOD.get(), BMBlocks.STRIPPED_INSOMNIAN_WOOD.get());
        tillable(BMBlocks.ALJAMIC_GRASS_BLOCK.get(), BMBlocks.ALJAMIC_FARMLAND.get().getDefaultState());
        tillable(BMBlocks.ALJAMIC_DIRT.get(), BMBlocks.ALJAMIC_FARMLAND.get().getDefaultState());

        // Back Math 1.8.0:
        flammable(BMBlocks.GUAVA_PLANKS.get(), 5, 20);
        flammable(BMBlocks.GUAVA_STAIRS.get(), 5, 20);
        flammable(BMBlocks.GUAVA_SLAB.get(), 5, 20);
        flammable(BMBlocks.GUAVA_FENCE.get(), 5, 20);
        flammable(BMBlocks.GUAVA_FENCE_GATE.get(), 5, 20);
        flammable(BMBlocks.GUAVA_TRAPDOOR.get(), 5, 20);
        flammable(BMBlocks.GUAVA_DOOR.get(), 5, 20);
        flammable(BMBlocks.GUAVA_BUTTON.get(), 5, 20);
        flammable(BMBlocks.GUAVA_PRESSURE_PLATE.get(), 5, 20);
        flammable(BMBlocks.GUAVA_LADDER.get(), 5, 20);
        flammable(BMBlocks.GUAVA_LOG.get(), 5, 5);
        flammable(BMBlocks.STRIPPED_GUAVA_LOG.get(), 5, 5);
        flammable(BMBlocks.GUAVA_WOOD.get(), 5, 5);
        flammable(BMBlocks.STRIPPED_GUAVA_WOOD.get(), 5, 5);
        flammable(BMBlocks.GUAVA_LEAVES.get(), 30, 60);
        flammable(BMBlocks.GOLDENWOOD_PLANKS.get(), 5, 20);
        flammable(BMBlocks.GOLDENWOOD_STAIRS.get(), 5, 20);
        flammable(BMBlocks.GOLDENWOOD_SLAB.get(), 5, 20);
        flammable(BMBlocks.GOLDENWOOD_FENCE.get(), 5, 20);
        flammable(BMBlocks.GOLDENWOOD_FENCE_GATE.get(), 5, 20);
        flammable(BMBlocks.GOLDENWOOD_TRAPDOOR.get(), 5, 20);
        flammable(BMBlocks.GOLDENWOOD_DOOR.get(), 5, 20);
        flammable(BMBlocks.GOLDENWOOD_BUTTON.get(), 5, 20);
        flammable(BMBlocks.GOLDENWOOD_PRESSURE_PLATE.get(), 5, 20);
        flammable(BMBlocks.GOLDENWOOD_LOG.get(), 5, 5);
        flammable(BMBlocks.STRIPPED_GOLDENWOOD_LOG.get(), 5, 5);
        flammable(BMBlocks.GOLDENWOOD_WOOD.get(), 5, 5);
        flammable(BMBlocks.STRIPPED_GOLDENWOOD_WOOD.get(), 5, 5);
        flammable(BMBlocks.GOLDENWOOD_LEAVES.get(), 30, 60);
        flammable(BMBlocks.ENCHANTED_GOLDENWOOD_LEAVES.get(), 30, 60);
        flammable(BMBlocks.MANGAED_MANGO_OAK_LEAVES.get(), 30, 60);
        flammable(BMBlocks.LEANDRO_TOY.get(), 60, 20);
        flammable(BMBlocks.TEENAGER_ALICE_TOY.get(), 60, 20);
        strippable(BMBlocks.GUAVA_LOG.get(), BMBlocks.STRIPPED_GUAVA_LOG.get());
        strippable(BMBlocks.GUAVA_WOOD.get(), BMBlocks.STRIPPED_GUAVA_WOOD.get());
        strippable(BMBlocks.GOLDENWOOD_LOG.get(), BMBlocks.STRIPPED_GOLDENWOOD_LOG.get());
        strippable(BMBlocks.GOLDENWOOD_WOOD.get(), BMBlocks.STRIPPED_GOLDENWOOD_WOOD.get());
        tillable(BMBlocks.ALJAMIC_DIRT_PATH.get(), BMBlocks.ALJAMIC_FARMLAND.get().getDefaultState());
        makePath(BMBlocks.ALJAMIC_GRASS_BLOCK.get(), BMBlocks.ALJAMIC_DIRT_PATH.get().getDefaultState());
        makePath(BMBlocks.ALJAMIC_DIRT.get(), BMBlocks.ALJAMIC_DIRT_PATH.get().getDefaultState());
        makePath(BMBlocks.ALJAMIC_FARMLAND.get(), BMBlocks.ALJAMIC_DIRT_PATH.get().getDefaultState());
    }

    public static void strippable(Block log, Block strippedLog) {
        AxeItem.BLOCK_STRIPPING_MAP = Maps.newHashMap(AxeItem.BLOCK_STRIPPING_MAP);
        AxeItem.BLOCK_STRIPPING_MAP.put(log, strippedLog);
    }

    private static void flammable(Block block, int encouragement, int flammability) {
        FireBlock fireBlock = (FireBlock) Blocks.FIRE;
        fireBlock.setFireInfo(block, encouragement, flammability);
    }

    private static void tillable(Block block, BlockState farmland) {
        HoeItem.HOE_LOOKUP = Maps.newHashMap(HoeItem.HOE_LOOKUP);
        HoeItem.HOE_LOOKUP.put(block, farmland);
    }

    private static void makePath(Block block, BlockState path) {
        ShovelItem.SHOVEL_LOOKUP = Maps.newHashMap(ShovelItem.SHOVEL_LOOKUP);
        ShovelItem.SHOVEL_LOOKUP.put(block, path);
    }
}

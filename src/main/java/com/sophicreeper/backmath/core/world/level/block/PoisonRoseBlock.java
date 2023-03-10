package com.sophicreeper.backmath.core.world.level.block;

import com.sophicreeper.backmath.core.world.entity.BMDamageSources;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class PoisonRoseBlock extends FlowerBlock {
    public PoisonRoseBlock(Effect effect, Properties properties) {
        super(effect, 10, properties);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isRemote && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                if (!livingEntity.isInvulnerableTo(BMDamageSources.POISON_ROSE) || !livingEntity.isInvulnerableTo(DamageSource.MAGIC)) {
                    livingEntity.addPotionEffect(new EffectInstance(Effects.POISON, 100));
                }
            }
        }
    }
}

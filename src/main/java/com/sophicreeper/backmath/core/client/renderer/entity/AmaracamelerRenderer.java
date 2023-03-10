package com.sophicreeper.backmath.core.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.sophicreeper.backmath.core.client.BackMath;
import com.sophicreeper.backmath.core.client.model.entity.AmaracamelerModel;
import com.sophicreeper.backmath.core.client.renderer.entity.layer.AmaracamelerGelLayer;
import com.sophicreeper.backmath.core.world.entity.monster.aljan.Amaracameler;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AmaracamelerRenderer extends MobRenderer<Amaracameler, AmaracamelerModel<Amaracameler>> {
    public static final ResourceLocation AMARACAMELER_TEXTURE = BackMath.resourceLoc("textures/entity/amaracameler.png");

    public AmaracamelerRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new AmaracamelerModel<>(16), 0.25f);
        this.addLayer(new AmaracamelerGelLayer(this));
    }

    @Override
    public void render(Amaracameler amaracameler, float p_225623_2_, float p_225623_3_, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int p_225623_6_) {
        this.shadowSize = 0.25f * (float) amaracameler.getSlimeSize();
        super.render(amaracameler, p_225623_2_, p_225623_3_, matrixStack, renderTypeBuffer, p_225623_6_);
    }

    @Override
    protected void preRenderCallback(Amaracameler amaracameler, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.999f, 0.999f, 0.999f);
        matrixStack.translate(0.0, 0.0010000000474974513, 0.0);
        float amaracamelerSize = (float) amaracameler.getSlimeSize();
        float squishFactor = MathHelper.lerp(partialTickTime, amaracameler.prevSquishFactor, amaracameler.squishFactor) / (amaracamelerSize * 0.5f + 1.0f);
        float f3 = 1.0f / (squishFactor + 1.0f);
        matrixStack.scale(f3 * amaracamelerSize, 1.0f / f3 * amaracamelerSize, f3 * amaracamelerSize);
    }

    @Override
    public ResourceLocation getEntityTexture(Amaracameler amaracameler) {
        return AMARACAMELER_TEXTURE;
    }
}

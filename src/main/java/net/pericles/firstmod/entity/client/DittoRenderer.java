package net.pericles.firstmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pericles.firstmod.FirstMod;
import net.pericles.firstmod.entity.custom.DittoEntity;

public class DittoRenderer extends MobRenderer<DittoEntity, dittoModel<DittoEntity>> {
    public DittoRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new dittoModel<>(pContext.bakeLayer(ModModelLayers.DITTO_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(DittoEntity dittoEntity) {
        return new ResourceLocation(FirstMod.MODID, "textures/entity/ditto.png");
    }

    @Override
    public void render(DittoEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()){
            pPoseStack.scale(0.48f,0.48f, 0.48f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

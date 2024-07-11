package net.pericles.firstmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pericles.firstmod.FirstMod;
import net.pericles.firstmod.entity.custom.ZackEntity;

public class ZackRenderer extends MobRenderer<ZackEntity, zackFair<ZackEntity>> {
    public ZackRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new zackFair<>(pContext.bakeLayer(ModModelLayers.ZACK_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(ZackEntity zackEntity) {
        return new ResourceLocation(FirstMod.MODID, "textures/entity/zacktexture.png");
    }

    @Override
    public void render(ZackEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()){
            pPoseStack.scale(0.48f,0.48f, 0.48f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

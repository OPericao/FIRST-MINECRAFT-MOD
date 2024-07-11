package net.pericles.firstmod.entity.client;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class zackFair<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart body;

	public zackFair(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(22, 13).addBox(3.0F, -1.0F, -6.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(22, 0).addBox(-2.0F, -1.0F, -6.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-1.0F, -4.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -4.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 35).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(3.0F, -2.0F, -4.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(33, 34).addBox(-2.0F, -5.0F, -4.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(33, 0).addBox(3.0F, -5.0F, -4.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(33, 12).addBox(-2.0F, -8.0F, -4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 31).addBox(3.0F, -8.0F, -4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 20).addBox(-1.0F, -11.0F, -3.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-2.0F, -16.0F, -4.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -24.0F, -5.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(38, 18).addBox(1.0F, -18.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 38).addBox(-2.0F, -25.0F, -6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 37).addBox(5.0F, -25.0F, -6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-2.0F, -25.0F, -5.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 25).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -14.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 29).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -11.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 37).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -12.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 29).addBox(-3.25F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -10.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 29).addBox(-3.25F, -3.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -9.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 6).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -14.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return body;
	}
}
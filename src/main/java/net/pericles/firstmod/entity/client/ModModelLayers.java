package net.pericles.firstmod.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.pericles.firstmod.FirstMod;

public class ModModelLayers {
    public static final ModelLayerLocation DITTO_LAYER = new ModelLayerLocation(
            new ResourceLocation(FirstMod.MODID, "ditto_layer"), "main");

    public static final ModelLayerLocation ZACK_LAYER = new ModelLayerLocation(
            new ResourceLocation(FirstMod.MODID, "zack_layer"), "main");
}

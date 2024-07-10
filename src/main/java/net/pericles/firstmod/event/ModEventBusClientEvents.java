package net.pericles.firstmod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pericles.firstmod.FirstMod;
import net.pericles.firstmod.entity.client.ModModelLayers;
import net.pericles.firstmod.entity.client.dittoModel;

@Mod.EventBusSubscriber(modid = FirstMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.DITTO_LAYER, dittoModel::createBodyLayer);
    }
}

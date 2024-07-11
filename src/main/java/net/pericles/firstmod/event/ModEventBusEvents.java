package net.pericles.firstmod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pericles.firstmod.FirstMod;
import net.pericles.firstmod.entity.ModEntities;
import net.pericles.firstmod.entity.custom.DittoEntity;
import net.pericles.firstmod.entity.custom.ZackEntity;

@Mod.EventBusSubscriber(modid = FirstMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.DITTO.get(), DittoEntity.createAttributes().build());
        event.put(ModEntities.ZACK.get(), ZackEntity.createAttributes().build());
    }
}

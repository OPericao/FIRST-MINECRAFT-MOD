package net.pericles.firstmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pericles.firstmod.FirstMod;
import net.pericles.firstmod.entity.custom.DittoEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FirstMod.MODID);

    public static final RegistryObject<EntityType<DittoEntity>> DITTO =
            ENTITY_TYPES.register("ditto", () -> EntityType.Builder.of(DittoEntity::new, MobCategory.CREATURE)
                    .sized(0.3f, 0.3f).build("ditto"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}

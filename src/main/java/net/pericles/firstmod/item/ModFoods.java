package net.pericles.firstmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties COMBINADO4 = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.4f).effect(() -> new MobEffectInstance(MobEffects.GLOWING, 60), 0.0001220703125f).build();
}

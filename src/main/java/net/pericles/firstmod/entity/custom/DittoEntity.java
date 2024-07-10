package net.pericles.firstmod.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.pericles.firstmod.FirstMod;
import net.pericles.firstmod.entity.ModEntities;
import net.pericles.firstmod.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class DittoEntity extends Animal {
    public DittoEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new BreedGoal(this, 1.480));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1.600, Ingredient.of(ModItems.COMBINADO4.get()), false));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.480));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class,1.48f));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 48)
                .add(Attributes.MOVEMENT_SPEED, 0.48)
                .add(Attributes.FOLLOW_RANGE, 480) // Creo que solo necesario para que os fillos sigan aos pais
                .add(Attributes.ARMOR_TOUGHNESS, 0.048f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.8f)
                .add(Attributes.ATTACK_DAMAGE, 4.8f);
    }
    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return ModEntities.DITTO.get().create(serverLevel);
    }

    @Override
    public boolean isFood(ItemStack pStack){
        return pStack.is(ModItems.COMBINADO4.get());
    }
}

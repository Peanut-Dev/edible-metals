package mr_chumbucket.ediblemetals.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent COPPER_SNACK = new FoodComponent.Builder().nutrition(5).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100), 1f)
            .alwaysEdible().build();
    public static final FoodComponent GOLD_SNACK = new FoodComponent.Builder().nutrition(5).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1f)
            .alwaysEdible().build();
    public static final FoodComponent IRON_SNACK = new FoodComponent.Builder().nutrition(5).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100), 1f)
            .alwaysEdible().build();
    public static final FoodComponent NETHERITE_SNACK = new FoodComponent.Builder().nutrition(5).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 4800, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 4800, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 4800, 2), 1f)
            .alwaysEdible()
            .build();
}

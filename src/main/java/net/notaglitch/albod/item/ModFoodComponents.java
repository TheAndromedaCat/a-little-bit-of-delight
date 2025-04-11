package net.notaglitch.albod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoodComponents {

    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().snack().nutrition(2).saturationModifier(0.15f)
            .build();


    public static final FoodComponent BLUEBERRY_CHEESECAKE_SLICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();

    public static final FoodComponent BLUEBERRY_COOKIE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.10f)
            .build();

    public static final FoodComponent SCONE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(ModEffects.COMFORT, 1500), 1.0f)
            .build();

    public static final FoodComponent BLUEBERRY_PIE_SLICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();

    public static final FoodComponent RAW_GELATIN_BRICK = new FoodComponent.Builder().nutrition(1).saturationModifier(0.50f)
            .build();

    public static final FoodComponent JUICE = new FoodComponent.Builder().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 1.0f).usingConvertsTo(Items.GLASS_BOTTLE)
            .build();
    public static final FoodComponent BMILK = new FoodComponent.Builder().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200), 0.5f)
            .build();

    public static final FoodComponent SYRUP = new FoodComponent.Builder().nutrition(1).saturationModifier(1.0f).usingConvertsTo(Items.GLASS_BOTTLE)
            .build();
}

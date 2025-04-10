package net.notaglitch.albod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.List;

public class ModFoodComponents {
    List<ItemConvertible> JELLY_JAM = List.of(AModItems.BLUEBERRY_JELLY, AModItems.BLUEBERRY_JAM);

    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().snack().nutrition(2).saturationModifier(0.15f)
            .build();


    public static final FoodComponent BLUEBERRY_CHEESECAKE_SLICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();

    public static final FoodComponent BLUEBERRY_COOKIE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.10f)
            .build();

    public static final FoodComponent BLUEBERRY_PIE_SLICE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();

    public static final FoodComponent RAW_GELATIN_BRICK = new FoodComponent.Builder().nutrition(1).saturationModifier(0.50f)
            .build();

    public static final FoodComponent BLUEBERRY_JELLY = new FoodComponent.Builder().nutrition(1).saturationModifier(1.0f)
            .build();

}

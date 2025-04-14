package net.notaglitch.albod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.notaglitch.albod.ALittleBitOfDelight;
import net.notaglitch.albod.block.AModBlocks;
import net.notaglitch.albod.item.custom.BlueberryJuiceItem;
import net.notaglitch.albod.item.custom.BlueberryMilkItem;

import java.util.function.Supplier;

public class AModItems {
    public static final TagKey<Item> MILK = TagKey.of(RegistryKeys.ITEM,
            Identifier.of(ALittleBitOfDelight.MOD_ID, "milk"));
    public static final TagKey<Item> BREAD_SLICE = TagKey.of(RegistryKeys.ITEM,
            Identifier.of(ALittleBitOfDelight.MOD_ID, "bread_slice"));
    public static final Supplier<FoodComponent> JELLY = () -> new FoodComponent.Builder().nutrition(1).saturationModifier(1.0f).usingConvertsTo(AModItems.EMPTY_JAR.asItem())
            .build();

    public static final Item BLUEBERRIES = registerItem("blueberries",
            new AliasedBlockItem(AModBlocks.BLUEBERRY_BUSH, new Item.Settings().food(ModFoodComponents.BLUEBERRY)));
    public static final Item BLUEBERRY_CHEESECAKE_SLICE = registerItem("blueberry_cheesecake_slice",
            new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY_CHEESECAKE_SLICE)));
    public static final Item BLUEBERRY_COOKIE = registerItem("blueberry_cookie",
            new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY_COOKIE)));
    public static final Item BLUEBERRY_PIE_SLICE = registerItem("blueberry_pie_slice",
            new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY_PIE_SLICE)));
    public static final Item EMPTY_JAR = registerItem("empty_jar",
            new Item(new Item.Settings()));
    public static final Item GELATIN_POWDER = registerItem("gelatin_powder",
            new Item(new Item.Settings()));
    public static final Item RAW_GELATIN_BRICK = registerItem("raw_gelatin_brick",
            new Item(new Item.Settings().food(ModFoodComponents.RAW_GELATIN_BRICK)));
    public static final Item BLUEBERRY_JELLY = registerItem("blueberry_jelly",
            new Item(new Item.Settings().food(JELLY.get()).recipeRemainder(AModItems.EMPTY_JAR).maxCount(16)));
    public static final Item BLUEBERRY_JAM = registerItem("blueberry_jam",
            new Item(new Item.Settings().food(JELLY.get()).recipeRemainder(AModItems.EMPTY_JAR).maxCount(16)));
    public static final Item TOAST_WITH_BLUEBERRY_JELLY = registerItem("toast_with_blueberry_jelly",
            new Item(new Item.Settings()));
    public static final Item BLUEBERRY_JELLY_SANDWICH = registerItem("blueberry_jelly_sandwich",
            new Item(new Item.Settings()));
    public static final Item BLUEBERRY_JUICE = registerItem("blueberry_juice",
            new BlueberryJuiceItem(new Item.Settings().food(ModFoodComponents.JUICE).recipeRemainder(Items.GLASS_BOTTLE).maxCount(16)));
    public static final Item BLUEBERRY_MILK = registerItem("blueberry_milk",
            new BlueberryMilkItem(new Item.Settings().food(ModFoodComponents.BMILK).recipeRemainder(Items.GLASS_BOTTLE).maxCount(16)));
    public static final Item BLUEBERRY_SYRUP = registerItem("blueberry_syrup",
            new Item(new Item.Settings().food(ModFoodComponents.SYRUP).recipeRemainder(Items.GLASS_BOTTLE).maxCount(16)));
    public static final Item BLUEBERRY_SCONE = registerItem("blueberry_scone",
            new Item(new Item.Settings().food(ModFoodComponents.SCONE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ALittleBitOfDelight.MOD_ID, name), item);
    }



    public static void registerModItems(){
        ALittleBitOfDelight.LOGGER.info("Registering Mod Items for " + ALittleBitOfDelight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(BLUEBERRIES);
            entries.add(BLUEBERRY_CHEESECAKE_SLICE);
            entries.add(BLUEBERRY_COOKIE);
            entries.add(BLUEBERRY_PIE_SLICE);
            entries.add(EMPTY_JAR);
            entries.add(GELATIN_POWDER);
            entries.add(RAW_GELATIN_BRICK);
            entries.add(BLUEBERRY_JELLY);
            entries.add(BLUEBERRY_JAM);
            entries.add(BLUEBERRY_JELLY_SANDWICH);
            entries.add(TOAST_WITH_BLUEBERRY_JELLY);
            entries.add(BLUEBERRY_MILK);
            entries.add(BLUEBERRY_JUICE);
            entries.add(BLUEBERRY_SCONE);
            entries.add(BLUEBERRY_SYRUP);
        });

    }

}
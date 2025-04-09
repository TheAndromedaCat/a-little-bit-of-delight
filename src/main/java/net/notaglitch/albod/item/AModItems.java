package net.notaglitch.albod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.notaglitch.albod.ALittleBitOfDelight;
import net.notaglitch.albod.block.AModBlocks;
import net.notaglitch.albod.item.custom.GelatinBucketItem;

public class AModItems {
    public static final TagKey<Item> MILK = TagKey.of(RegistryKeys.ITEM,
            Identifier.of(ALittleBitOfDelight.MOD_ID, "milk"));

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
    public static final Item GELATIN_BUCKET = registerItem("gelatin_bucket",
            new GelatinBucketItem(new Item.Settings().recipeRemainder(Items.BUCKET)));
    public static final Item GELATIN_POWDER = registerItem("gelatin_powder",
            new Item(new Item.Settings()));


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
            entries.add(GELATIN_BUCKET);
            entries.add(GELATIN_POWDER);
        });
    }

}
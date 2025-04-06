package net.notaglitch.albod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notaglitch.albod.ALittleBitOfDelight;
import net.notaglitch.albod.block.ModBlocks;

public class ModItems {

    public static final Item BLUEBERRIES = registerItem("blueberries",
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new Item.Settings().food(ModFoodComponents.BLUEBERRY)));
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie",
            new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY_PIE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ALittleBitOfDelight.MOD_ID, name), item);
    }


    public static void registerModItems(){
        ALittleBitOfDelight.LOGGER.info("Registering Mod Items for " + ALittleBitOfDelight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(BLUEBERRIES);
        });
    }

}
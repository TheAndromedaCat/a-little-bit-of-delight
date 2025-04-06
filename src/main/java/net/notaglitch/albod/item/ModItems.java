package net.notaglitch.albod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notaglitch.albod.ALittleBitOfDelight;

public class ModItems {

    public static final Item BLUEBERRY = registerItem("blueberry",
            new Item(new Item.Settings().maxCount(64)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ALittleBitOfDelight.MOD_ID, name), item);
    }


    public static void registerModItems(){
        ALittleBitOfDelight.LOGGER.info("Registering Mod Items for " + ALittleBitOfDelight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {

        });
    }

}
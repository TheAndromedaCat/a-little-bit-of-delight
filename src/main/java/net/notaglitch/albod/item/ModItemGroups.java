package net.notaglitch.albod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.notaglitch.albod.ALittleBitOfDelight;
import net.notaglitch.albod.block.AModBlocks;

public class ModItemGroups {
    public static final ItemGroup ALBOD_PASTRIES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ALittleBitOfDelight.MOD_ID, "albod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(AModItems.BLUEBERRIES))
                    .displayName(Text.translatable("itemgroup.albod.items"))
                    .entries((displayContext, entries) -> {
                        entries.add(AModItems.BLUEBERRIES);
                        entries.add(AModBlocks.BLUEBERRY_CHEESECAKE);
                        entries.add(AModItems.BLUEBERRY_CHEESECAKE_SLICE);
                        entries.add(AModItems.BLUEBERRY_COOKIE);
                        entries.add(AModItems.BLUEBERRY_PIE_SLICE);
                        entries.add(AModBlocks.BLUEBERRY_PIE);
                        entries.add(AModItems.EMPTY_JAR);
                        entries.add(AModItems.GELATIN_POWDER);
                        entries.add(AModItems.RAW_GELATIN_BRICK);
                        entries.add(AModBlocks.BLUEBERRY_CRATE);
                        entries.add(AModItems.BLUEBERRY_JELLY);
                        entries.add(AModItems.BLUEBERRY_JAM);
                        entries.add(AModItems.BLUEBERRY_JELLY_SANDWICH);
                        entries.add(AModItems.TOAST_WITH_BLUEBERRY_JELLY);
                        entries.add(AModItems.BLUEBERRY_JUICE);
                        entries.add(AModItems.BLUEBERRY_MILK);
                        entries.add(AModItems.BLUEBERRY_SYRUP);
                        entries.add(AModItems.BLUEBERRY_SCONE);

                    }).build());

    public static void registerItemGroups(){
        ALittleBitOfDelight.LOGGER.info("Registering Item Groups for " + ALittleBitOfDelight.MOD_ID);
    }
}

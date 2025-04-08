package net.notaglitch.albod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.notaglitch.albod.ALittleBitOfDelight;
import net.notaglitch.albod.block.custom.BlueberryBushBlock;
import net.notaglitch.albod.item.AModItems;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.registry.ModBlocks;

public class AModBlocks {

    public static final Block BLUEBERRY_BUSH = registerBlockWithoutBlockItem("blueberry_bush",
            new BlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final Block BLUEBERRY_CHEESECAKE = registry(new PieBlock(AbstractBlock.Settings.copy(ModBlocks.SWEET_BERRY_CHEESECAKE.get()), () -> AModItems.BLUEBERRY_CHEESECAKE_SLICE), "blueberry_cheesecake");

    private static Block registry(Block block, String name) {
        Registry.register(Registries.BLOCK, Identifier.of("albod", name), block);
        var item = new BlockItem(block, new Item.Settings());
        Registry.register(Registries.ITEM, Identifier.of("albod", name), item);

        AModItems.registerModItems();
        return block;
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(ALittleBitOfDelight.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ALittleBitOfDelight.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ALittleBitOfDelight.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ALittleBitOfDelight.LOGGER.info("Registering Blocks for " + ALittleBitOfDelight.MOD_ID);
    }
}

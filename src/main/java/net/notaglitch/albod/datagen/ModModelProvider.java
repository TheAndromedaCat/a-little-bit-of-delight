package net.notaglitch.albod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.notaglitch.albod.block.AModBlocks;
import net.notaglitch.albod.block.custom.BlueberryBushBlock;
import net.notaglitch.albod.item.AModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(AModBlocks.BLUEBERRY_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED,
                BlueberryBushBlock.AGE, 0, 1, 2 ,3);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AModItems.BLUEBERRY_CHEESECAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(AModBlocks.BLUEBERRY_CHEESECAKE.asItem(), Models.GENERATED);
        itemModelGenerator.register(AModItems.BLUEBERRY_COOKIE, Models.GENERATED);
        itemModelGenerator.register(AModItems.EMPTY_JAR, Models.GENERATED);
        itemModelGenerator.register(AModBlocks.BLUEBERRY_PIE.asItem(), Models.GENERATED);
        itemModelGenerator.register(AModItems.BLUEBERRY_PIE_SLICE, Models.GENERATED);
        itemModelGenerator.register(AModItems.GELATIN_POWDER, Models.GENERATED);
        itemModelGenerator.register(AModItems.RAW_GELATIN_BRICK, Models.GENERATED);
    }
}

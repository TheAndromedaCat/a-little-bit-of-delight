package net.notaglitch.albod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.notaglitch.albod.block.AModBlocks;

public class ALittleBitOfDelightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(AModBlocks.BLUEBERRY_BUSH, RenderLayer.getCutout());

    }
}

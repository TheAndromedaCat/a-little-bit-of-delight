package net.notaglitch.albod.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.notaglitch.albod.ALittleBitOfDelight;
import net.notaglitch.albod.block.AModBlocks;
import net.notaglitch.albod.block.custom.BlueberryBushBlock;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUEBERRY_BUSH_KEY = registerKey("blueberry_bush");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, BLUEBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(AModBlocks.BLUEBERRY_BUSH
                                .getDefaultState().with(BlueberryBushBlock.AGE, 3))),
                        List.of(Blocks.GRASS_BLOCK)));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String  name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ALittleBitOfDelight.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}

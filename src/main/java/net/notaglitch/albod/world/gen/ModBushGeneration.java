package net.notaglitch.albod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.notaglitch.albod.world.ModPlacedFeatures;

public class ModBushGeneration {

    public static void generateBushes() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.FLOWER_FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUEBERRY_BUSH_COMMON_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE, BiomeKeys.MEADOW, BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUEBERRY_BUSH_RARE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUEBERRY_BUSH_ULTRARE_PLACED_KEY);
    }
}
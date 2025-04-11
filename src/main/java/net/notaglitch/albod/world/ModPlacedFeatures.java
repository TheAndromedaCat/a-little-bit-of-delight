package net.notaglitch.albod.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.notaglitch.albod.ALittleBitOfDelight;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> BLUEBERRY_BUSH_RARE_PLACED_KEY = registerKey("blueberry_bush_placed_rare");
    public static final RegistryKey<PlacedFeature> BLUEBERRY_BUSH_COMMON_PLACED_KEY = registerKey("blueberry_bush_placed");
    public static final RegistryKey<PlacedFeature> BLUEBERRY_BUSH_ULTRARE_PLACED_KEY = registerKey("blueberry_bush_placed_ultrare");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, BLUEBERRY_BUSH_COMMON_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUEBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(32), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, BLUEBERRY_BUSH_RARE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUEBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(64), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, BLUEBERRY_BUSH_ULTRARE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUEBERRY_BUSH_KEY),
                RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }



    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(ALittleBitOfDelight.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}

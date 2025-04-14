package net.notaglitch.albod.util;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.notaglitch.albod.ALittleBitOfDelight;

public class AModTags {

    public static final TagKey<StatusEffect> MILK_BOTTLE_IGNORED = modEffectTag("ignored/milk_bottle");

    public static final TagKey<Biome> OVERWORLD_TEMPERATE_BIOMES = modBiomeTag("is_temperate/overworld");



    private static TagKey<StatusEffect> modEffectTag(String path) {
        return TagKey.of(RegistryKeys.STATUS_EFFECT, Identifier.of(ALittleBitOfDelight.MOD_ID, path));
    }
    private static TagKey<Biome> modBiomeTag(String path) {
        return TagKey.of(RegistryKeys.BIOME, Identifier.of(ALittleBitOfDelight.MOD_ID, path));
    }


    public static void registerModTags(){
        ALittleBitOfDelight.LOGGER.info("[ALBOD] Registering those silly tags!");

    }
}

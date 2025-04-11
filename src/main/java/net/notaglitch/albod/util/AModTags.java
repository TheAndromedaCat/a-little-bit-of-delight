package net.notaglitch.albod.util;

import com.mojang.datafixers.types.templates.Tag;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.notaglitch.albod.ALittleBitOfDelight;
import vectorwing.farmersdelight.FarmersDelight;

public class AModTags {

    public static final TagKey<StatusEffect> MILK_BOTTLE_IGNORED = modEffectTag("ignored/milk_bottle");




    private static TagKey<StatusEffect> modEffectTag(String path) {
        return TagKey.of(RegistryKeys.STATUS_EFFECT, Identifier.of(ALittleBitOfDelight.MOD_ID, path));
    }


    public static void registerModTags(){
        ALittleBitOfDelight.LOGGER.info("[ALBOD] Registering those silly tags!");

    }
}

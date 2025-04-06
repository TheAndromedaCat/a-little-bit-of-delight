package net.notaglitch.albod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.notaglitch.albod.ALittleBitOfDelight;

public class ModSounds {

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(ALittleBitOfDelight.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        ALittleBitOfDelight.LOGGER.info("Registering Mod Sounds for " + ALittleBitOfDelight.MOD_ID);
    }
}


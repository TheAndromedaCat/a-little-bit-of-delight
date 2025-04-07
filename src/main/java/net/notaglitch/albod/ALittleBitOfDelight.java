package net.notaglitch.albod;

import net.fabricmc.api.ModInitializer;

import net.notaglitch.albod.block.ModBlocks;
import net.notaglitch.albod.item.ModItemGroups;
import net.notaglitch.albod.item.AModItems;
import net.notaglitch.albod.sound.ModSounds;
import net.notaglitch.albod.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ALittleBitOfDelight implements ModInitializer {
	public static final String MOD_ID = "albod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		AModItems.registerModItems();
		ModSounds.registerSounds();
		ModLootTableModifiers.modifyLootTables();
		ModBlocks.registerModBlocks();
	}
}
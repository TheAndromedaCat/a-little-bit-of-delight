package net.notaglitch.albod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import net.notaglitch.albod.block.AModBlocks;
import net.notaglitch.albod.item.ModItemGroups;
import net.notaglitch.albod.item.AModItems;
import net.notaglitch.albod.sound.ModSounds;
import net.notaglitch.albod.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vectorwing.farmersdelight.common.tag.ModTags;

public class ALittleBitOfDelight implements ModInitializer {
	public static final String MOD_ID = "albod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final TagKey<Item> KNIVES = ModTags.KNIVES;

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		AModItems.registerModItems();
		ModSounds.registerSounds();
		ModLootTableModifiers.modifyLootTables();
		AModBlocks.registerModBlocks();
	}
}
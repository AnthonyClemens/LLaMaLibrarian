package com.llamalibrarian;

import com.llamalibrarian.block.ModBlocks;
import com.llamalibrarian.item.ModItemGroups;
import com.llamalibrarian.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LLaMaLibrarian implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID  = "llamalibrarian";
    public static final Logger LOGGER = LoggerFactory.getLogger("llamalibrarian");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroup();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
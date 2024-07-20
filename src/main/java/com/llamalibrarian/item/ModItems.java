package com.llamalibrarian.item;

import com.llamalibrarian.LLaMaLibrarian;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LLAMALIBRARIANEGG = registerItem("llamalibrarianegg", new Item(new FabricItemSettings()));


    private static void addToSpawnEggItemGroup(FabricItemGroupEntries entries){
        entries.add(LLAMALIBRARIANEGG);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(LLaMaLibrarian.MOD_ID, name),item);
    }

    public static void registerModItems(){
        LLaMaLibrarian.LOGGER.info("Registering Mod Items for LLaMaLibrarian");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addToSpawnEggItemGroup);
    }
}

package com.llamalibrarian.item;

import com.llamalibrarian.LLaMaLibrarian;
import com.llamalibrarian.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LLAMA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LLaMaLibrarian.MOD_ID, "icon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.llama"))
                    .icon(() -> new ItemStack(ModItems.LLAMALIBRARIANEGG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LLAMALIBRARIANEGG);
                        entries.add(ModBlocks.COMPUTER);
                    }).build());

    public static void registerItemGroup(){
        LLaMaLibrarian.LOGGER.info("Registering Item Groups for LLaMaLibrarian");
    }
}

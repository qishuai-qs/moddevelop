package com.besson.tutorialmod.item;

import com.besson.tutorialmod.TutorialMod;
import com.besson.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModitemGroup {
    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"tutorial_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.tutorial_group")).icon(()-> new ItemStack(ModItems.ICE_ETHER)).entries((displayContext, entries) -> {
                entries.add(ModItems.ICE_ETHER);
                entries.add(Items.BOOK);
                entries.add(Blocks.GRASS_BLOCK);
                entries.add(ModBlocks.ICE_ETHER_BLOCK);
            }).build());

    public static final ItemGroup TUTORIAL_WEAPON_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"tutorial_weapon_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.tutorial_weapon_group")).icon(()-> new ItemStack(ModItems.ICE_ETHER_V2)).entries((displayContext, entries) -> {
                entries.add(ModItems.ICE_ETHER_V2);
                entries.add(Items.BOOK);
                entries.add(Blocks.GRASS_BLOCK);
            }).build());

    public static void registerModItemGroup  (){


    }
}
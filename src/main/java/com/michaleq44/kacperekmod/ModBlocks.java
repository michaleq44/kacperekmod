package com.michaleq44.kacperekmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block kacperekblock;

    public static void init() {
        kacperekblock = new BlockSound("kacperek_block", Material.sand, 2.0f, 10.0f);

        GameRegistry.registerBlock(kacperekblock, "kacperek_block");
    }
}

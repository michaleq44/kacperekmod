package com.michaleq44.kacperekmod;

import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item kacperek;

    public ModItems() {}

    public static void init() {
        kacperek = new ItemRightClickMessage("kacperek", "kacperek = -4/3", EnumChatFormatting.GOLD);

        GameRegistry.registerItem(kacperek, "kacperek");
    }
}

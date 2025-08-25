package com.michaleq44.michaleqmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;

public class ModItems {
    public static Item kacperek;

    public static void init() {
        kacperek = new ItemConsumableMessage("kacperek", "kacperek = -4/3", EnumChatFormatting.GOLD);

        GameRegistry.registerItem(kacperek, "kacperek");
    }
}

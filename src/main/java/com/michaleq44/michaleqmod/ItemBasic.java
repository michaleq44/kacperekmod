package com.michaleq44.michaleqmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBasic extends Item {

    public ItemBasic() {}

    public ItemBasic(String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName("michaleqmod:" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return itemStack.copy();
    }
}

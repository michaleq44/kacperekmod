package com.michaleq44.michaleqmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemConsumableMessage extends ItemBasic{
    private final String message;
    private final EnumChatFormatting color;

    public ItemConsumableMessage(String unlocalizedName, String message, EnumChatFormatting color) {
        super(unlocalizedName);
        this.message = message;
        this.color = color;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            ChatComponentText chatMessage = new ChatComponentText(this.message);
            chatMessage.getChatStyle().setColor(color);
            player.addChatMessage(chatMessage);
        }

        return itemStack;
    }
}

package com.michaleq44.kacperekmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;

public class ItemRightClickMessage extends ItemBasic {

    private final String message;
    private final EnumChatFormatting color;

    public ItemRightClickMessage(String unlocalizedName, String message, EnumChatFormatting color) {
        super(unlocalizedName);
        this.setMaxStackSize(43);
        this.message = message;
        this.color = color;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            ChatComponentText chatMessage = new ChatComponentText(this.message);
            chatMessage.getChatStyle()
                .setColor(color);
            broadcastToAllPlayers(world, chatMessage);

            if (!player.capabilities.isCreativeMode) {
                stack.stackSize--;
                if (stack.stackSize <= 0) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                }
            }
        }

        return stack;
    }

    private void broadcastToAllPlayers(World world, ChatComponentText chatMessage) {
        if (world.isRemote) return;

        for (EntityPlayer player : world.playerEntities) {
            if (player != null && !(player instanceof FakePlayer)) {
                player.addChatMessage(chatMessage);
            }
        }
    }
}

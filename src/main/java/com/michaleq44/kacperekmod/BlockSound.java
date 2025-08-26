package com.michaleq44.kacperekmod;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockSound extends BlockBasic {

    public BlockSound(String unlocalizedName, Material material, float hardness, float resistance) {
        super(unlocalizedName, material, hardness, resistance);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX,
        float hitY, float hitZ) {
        if (!world.isRemote) {
            world.playSoundEffect(x + 0.5, y + 0.5, z + 0.5, ModSounds.KACPEREK_SOUND, 1.0F, 1.0F);
        }

        return true;
    }
}

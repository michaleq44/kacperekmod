package com.michaleq44.kacperekmod;

import net.minecraft.world.World;

public class ModSounds {

    public static final String KACPEREK_SOUND = "kacperekmod:kacperek_sound";

    public static void registerSounds() {}

    public static void playSound(World world, double x, double y, double z, String soundName, float volume,
        float pitch) {
        if (!world.isRemote) {
            world.playSoundEffect(x, y, z, soundName, volume, pitch);
        }
    }
}

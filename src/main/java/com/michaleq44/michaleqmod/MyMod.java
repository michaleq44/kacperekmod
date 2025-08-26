package com.michaleq44.michaleqmod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MyMod.MODID, version = Tags.VERSION, name = "MichaleqMod", acceptedMinecraftVersions = "[1.7.10]")
public class MyMod {

    public static final String MODID = "michaleqmod";
    public static Logger LOG = null;

    @SidedProxy(
        clientSide = "com.michaleq44.michaleqmod.ClientProxy",
        serverSide = "com.michaleq44.michaleqmod.CommonProxy")
    public static CommonProxy proxy;

    public MyMod() {
        LOG = LogManager.getLogger(MODID);
    }

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        ModItems.init();
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        addRecipes();
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }

    private void addRecipes() {
        GameRegistry.addShapelessRecipe(
            new ItemStack(ModItems.kacperek),
            OreDictionary.getOres("gemDiamond")
                .get(0));
    }
}

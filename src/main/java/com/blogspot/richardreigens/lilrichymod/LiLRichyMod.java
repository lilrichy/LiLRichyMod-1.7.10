package com.blogspot.richardreigens.lilrichymod;

import com.blogspot.richardreigens.lilrichymod.handler.ConfigurationHandler;
import com.blogspot.richardreigens.lilrichymod.handler.GuiHandler;
import com.blogspot.richardreigens.lilrichymod.handler.PacketDescriptionHandler;
import com.blogspot.richardreigens.lilrichymod.handler.network.NetworkHandler;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocksGlass;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import com.blogspot.richardreigens.lilrichymod.init.ModTileEntity;
import com.blogspot.richardreigens.lilrichymod.proxy.CommonProxy;
import com.blogspot.richardreigens.lilrichymod.recipes.Recipes;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import com.blogspot.richardreigens.lilrichymod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

/**
 * Created by Rich on 11/18/2015.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class lilrichymod {
    @Mod.Instance(Reference.MOD_ID)
    public static lilrichymod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LogHelper.info("LILRICHY MOD IS BOOTING UP!!!!!!!!!");

        ModItems.init();
        LogHelper.info("Items Loading");

        ModBlocks.init();
        ModBlocksGlass.init();
        LogHelper.info("Blocks Loading");

        ModTileEntity.Init();
        LogHelper.info("Tile Entity's Loading");

        PacketDescriptionHandler.init();
        LogHelper.info("Packet Description Handler Loading");

        //GameRegistry.registerWorldGenerator(new WorldGenLiLRichy(), 0);
        //LogHelper.info("World Gen Loading");

        NetworkHandler.init();

        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
        LogHelper.info("GUI Handler Loading");

        proxy.registerRenderers();
        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Recipes.init();
        LogHelper.info("Recipes Loading");
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialization Complete");
        LogHelper.info("LiLRichy Mod Loaded!");
    }
}
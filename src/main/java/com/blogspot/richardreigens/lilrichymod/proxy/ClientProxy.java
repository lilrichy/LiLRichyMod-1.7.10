package com.blogspot.richardreigens.lilrichymod.proxy;

import com.blogspot.richardreigens.lilrichymod.renderers.RenderBlockTable;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityBlockTable;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Rich on 11/19/2015.
 */
public class ClientProxy extends CommonProxy
{

    public static void registerRenders()
    {
        TileEntitySpecialRenderer render1 = new RenderBlockTable();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockTable.class, render1);
    }

    @Override
    public void preInit()
    {

    }

    @Override
    public void init()
    {

    }

    @Override
    public void postInit()
    {

    }

    @Override
    public EntityPlayer getClientPlayer()
    {
        return Minecraft.getMinecraft().thePlayer;
    }
}

package com.blogspot.richardreigens.lilrichymod.proxy;

import com.blogspot.richardreigens.lilrichymod.handler.EventHandler;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.renderers.ItemRenderBlockTable;
import com.blogspot.richardreigens.lilrichymod.renderers.RenderBlockTable;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityBlockTable;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Rich on 11/19/2015.
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy
{

    @Override
    public void registerRenderers()
    {
        TileEntitySpecialRenderer render = new RenderBlockTable();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockTable.class, render);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.blockTable), new ItemRenderBlockTable(render, new TileEntityBlockTable()));
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
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    @Override
    public EntityPlayer getClientPlayer()
    {
        return Minecraft.getMinecraft().thePlayer;
    }


}

package com.blogspot.richardreigens.lilrichymod.blocks.blockTable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

/**
 * Created by Rich on 12/17/2015.
 */
public class ItemRenderBlockTable implements IItemRenderer {
    @SideOnly(Side.CLIENT)
    TileEntitySpecialRenderer render;
    private TileEntity entity;

    public ItemRenderBlockTable(TileEntitySpecialRenderer render, TileEntity entity) {
        this.entity = entity;
        this.render = render;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        if (type == ItemRenderType.ENTITY) {
            GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
            this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
        }

        if (type == ItemRenderType.INVENTORY) {
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
        }
        if (type == ItemRenderType.EQUIPPED) {
            this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
        }
        if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
            this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
        }
    }
}
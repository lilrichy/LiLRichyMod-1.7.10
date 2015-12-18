package com.blogspot.richardreigens.lilrichymod.renderers;

import com.blogspot.richardreigens.lilrichymod.models.ModelBlockTable;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityBlockTable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by Rich on 12/8/2015.
 */
@SideOnly(Side.CLIENT)
public class RenderBlockTable extends TileEntitySpecialRenderer
{
    ResourceLocation texture = new ResourceLocation(
            Reference.MOD_ID + ":textures/models/" + Names.Models.BLOCK_TABLE + ".png");

    private ModelBlockTable model;

    public RenderBlockTable()
    {
        this.model = new ModelBlockTable();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double i, double j, double k, float f)
    {
        TileEntityBlockTable te = (TileEntityBlockTable) tileEntity;
        float x = (float) i;
        float y = (float) j;
        float z = (float) k;
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y, z);
        GL11.glTranslatef(0.5F, 1.5F, 0.5F);

        //    Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        this.bindTexture(texture);

        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(te.direction * 90, 0.0F, 1.0F, 0.0F);

        model.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}

package com.blogspot.richardreigens.lilrichymod.gui;

import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Rich on 11/27/2015.
 */
public abstract class GuiLiLRichyMod extends GuiContainer
{
    private ResourceLocation guiTexture;

    public GuiLiLRichyMod(Container container, String guiTextureName)
    {
        super(container);
        this.guiTexture = new ResourceLocation(Reference.MOD_ID + ":textures/gui/" + guiTextureName + ".png");
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseY)
    {
        mc.getTextureManager().bindTexture(guiTexture);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);


    }
}
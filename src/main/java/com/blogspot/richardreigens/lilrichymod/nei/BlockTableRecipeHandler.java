package com.blogspot.richardreigens.lilrichymod.nei;

import codechicken.nei.recipe.TemplateRecipeHandler;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Rich on 12/17/2015.
 */
public class BlockTableRecipeHandler extends TemplateRecipeHandler
{
    @Override
    public String getRecipeName()
    {
        return "Block Table ";
    }

    @Override
    public String getGuiTexture()
    {
        return new ResourceLocation(Reference.MOD_ID, ":textures/gui/blockTableGUI.png").toString();
    }


}

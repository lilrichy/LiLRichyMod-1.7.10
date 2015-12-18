package com.blogspot.richardreigens.lilrichymod.nei;


import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import com.blogspot.richardreigens.lilrichymod.gui.GuiBlockTable;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;

/**
 * Created by Rich on 12/17/2015.
 */
public class NEIlilrichymodConfig implements IConfigureNEI
{
    @Override
    public void loadConfig()
    {
        API.registerRecipeHandler(new BlockTableRecipeHandler());
        API.registerUsageHandler(new BlockTableRecipeHandler());
        API.setGuiOffset(GuiBlockTable.class, 0, 0);
    }

    @Override
    public String getName()
    {
        return "lilrichymod Plugin";
    }

    @Override
    public String getVersion()
    {
        return Reference.VERSION;
    }
}

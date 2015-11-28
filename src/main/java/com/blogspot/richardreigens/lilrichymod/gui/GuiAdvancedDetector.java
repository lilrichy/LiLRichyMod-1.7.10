package com.blogspot.richardreigens.lilrichymod.gui;

import com.blogspot.richardreigens.lilrichymod.inventory.ContainerAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityAdvancedDetector;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created by Rich on 11/27/2015.
 */
public class GuiAdvancedDetector extends GuiLiLRichyMod
{
    public GuiAdvancedDetector(InventoryPlayer playerInventory, TileEntityAdvancedDetector te)
    {
        super(new ContainerAdvancedDetector(playerInventory, te), Names.Gui.ADVANCED_DETECTOR_GUI);
    }


}

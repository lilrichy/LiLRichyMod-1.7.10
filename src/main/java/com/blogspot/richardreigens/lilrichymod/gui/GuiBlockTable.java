package com.blogspot.richardreigens.lilrichymod.gui;

import com.blogspot.richardreigens.lilrichymod.inventory.ContainerBlockTable;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityBlockTable;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created by Rich on 12/10/2015.
 */
public class GuiBlockTable extends GuiLiLRichyMod
{
    private TileEntityBlockTable tileEntity;

    public GuiBlockTable(InventoryPlayer invPlayer, TileEntityBlockTable tileEntityBlockTable)
    {
        super(new ContainerBlockTable(invPlayer, tileEntityBlockTable), Names.Gui.BLOCK_TABLE_GUI, tileEntityBlockTable);

        this.tileEntity = tileEntityBlockTable;
    }

    @Override
    public void updateScreen()
    {
        super.updateScreen();
    }

    @Override
    public void initGui()
    {
        super.initGui();
    }
}

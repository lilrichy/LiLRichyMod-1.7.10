package com.blogspot.richardreigens.lilrichymod.gui;

import com.blogspot.richardreigens.lilrichymod.handler.MessageHandleGuiButtonPress;
import com.blogspot.richardreigens.lilrichymod.handler.network.NetworkHandler;
import com.blogspot.richardreigens.lilrichymod.inventory.ContainerAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityAdvancedDetector;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created by Rich on 11/27/2015.
 */
public class GuiAdvancedDetector extends GuiLiLRichyMod
{
    private final TileEntityAdvancedDetector te;
    private GuiButton invertButton;

    public GuiAdvancedDetector(InventoryPlayer playerInventory, TileEntityAdvancedDetector te)
    {
        super(new ContainerAdvancedDetector(playerInventory, te), Names.Gui.ADVANCED_DETECTOR_GUI, te);
        this.te = te;
    }

    @Override
    public void initGui()
    {
        super.initGui();
        invertButton = new GuiButton(0, guiLeft + 7, guiTop + 48, 55, 20, I18n.format("gui.LiLRichyMod.AdvancedDetector.button.invert"));
        buttonList.add(invertButton);

    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        if (button.id == 0) {
            NetworkHandler.sendToServer(new MessageHandleGuiButtonPress(te, 0));
        }
    }

    public void updateScreen()
    {
        super.updateScreen();
        invertButton.displayString = I18n.format("gui.LiLRichyMod.AdvancedDetector.button." + (te.invert ? "invert" : "regular"));
    }
}

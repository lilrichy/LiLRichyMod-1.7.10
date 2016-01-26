package com.blogspot.richardreigens.lilrichymod.handler;

import com.blogspot.richardreigens.lilrichymod.blocks.advancedPlayerDetector.ContainerAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.advancedPlayerDetector.GuiAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.advancedPlayerDetector.TileEntityAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.blockTable.ContainerBlockTable;
import com.blogspot.richardreigens.lilrichymod.blocks.blockTable.GuiBlockTable;
import com.blogspot.richardreigens.lilrichymod.blocks.blockTable.TileEntityBlockTable;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Rich on 11/26/2015.
 */
public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (GuiIDs.values()[ID]) {
            case ADVANCED_DETECTOR:
                return new ContainerAdvancedDetector(player.inventory, (TileEntityAdvancedDetector) world.getTileEntity(x, y, z));
            case BLOCK_TABLE:
                return new ContainerBlockTable(player.inventory, (TileEntityBlockTable) world.getTileEntity(x, y, z));
        }
        throw new IllegalArgumentException("No gui with id" + ID);
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (GuiIDs.values()[ID]) {
            case ADVANCED_DETECTOR:
                return new GuiAdvancedDetector(player.inventory, (TileEntityAdvancedDetector) world.getTileEntity(x, y, z));
            case BLOCK_TABLE:
                return new GuiBlockTable(player.inventory, (TileEntityBlockTable) world.getTileEntity(x, y, z));
        }
        throw new IllegalArgumentException("No gui with id" + ID);
    }

    public enum GuiIDs {
        ADVANCED_DETECTOR,
        BLOCK_TABLE
    }
}

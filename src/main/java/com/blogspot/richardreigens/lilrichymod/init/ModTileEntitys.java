package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.advancedPlayerDetector.TileEntityAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.blockTable.TileEntityBlockTable;
import com.blogspot.richardreigens.lilrichymod.blocks.lectern.TileEntityLectern;
import com.blogspot.richardreigens.lilrichymod.blocks.playerDetector.TEPlayerDetector;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 11/23/2015.
 */
public class ModTileEntitys {
    public static void Init() {
        GameRegistry.registerTileEntity(TEPlayerDetector.class, Names.TileEntities.PLAYER_DETECTOR);
        GameRegistry.registerTileEntity(TileEntityAdvancedDetector.class, Names.TileEntities.ADVANCED_DETECTOR);
        GameRegistry.registerTileEntity(TileEntityBlockTable.class, Names.Models.BLOCK_TABLE);

        GameRegistry.registerTileEntity(TileEntityLectern.class, Names.Models.LECTERN);
    }
}
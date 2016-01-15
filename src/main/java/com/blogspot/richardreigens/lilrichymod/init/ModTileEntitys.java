package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityBlockTable;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityPlayerDetector;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 11/23/2015.
 */
public class ModTileEntitys {
    public static void Init() {
        GameRegistry.registerTileEntity(TileEntityPlayerDetector.class, Names.TileEntities.PLAYER_DETECTOR);
        GameRegistry.registerTileEntity(TileEntityAdvancedDetector.class, Names.TileEntities.ADVANCED_DETECTOR);
        GameRegistry.registerTileEntity(TileEntityBlockTable.class, Names.Models.BLOCK_TABLE);
    }
}
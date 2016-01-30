package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.advancedPlayerDetector.BlockAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.advancedPlayerDetector.TileEntityAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.blockTable.BlockTable;
import com.blogspot.richardreigens.lilrichymod.blocks.blockTable.TileEntityBlockTable;
import com.blogspot.richardreigens.lilrichymod.blocks.lectern.BlockLectern;
import com.blogspot.richardreigens.lilrichymod.blocks.lectern.TileEntityLectern;
import com.blogspot.richardreigens.lilrichymod.blocks.playerDetector.BlockPlayerDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.playerDetector.TEPlayerDetector;
import com.blogspot.richardreigens.lilrichymod.handler.ConfigurationHandler;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

/**
 * Created by Rich on 11/23/2015.
 */
public class ModTileEntity {

    public static final BlockPlayerDetector playerDetector = new BlockPlayerDetector(Material.anvil);
    public static final BlockAdvancedDetector advancedDetector = new BlockAdvancedDetector(Material.anvil);
    public static final BlockTable blockTable = new BlockTable(Material.rock);
    public static final BlockLectern lectern = new BlockLectern();

    public static void Init() {
        if (ConfigurationHandler.loadPlayerDetector) {
            GameRegistry.registerBlock(playerDetector, Names.Blocks.PLAYER_DETECTOR);
            GameRegistry.registerTileEntity(TEPlayerDetector.class, Names.TileEntities.PLAYER_DETECTOR);
        }

        if (ConfigurationHandler.loadAdvancedDetector) {
            GameRegistry.registerBlock(advancedDetector, Names.Blocks.ADVANCED_DETECTOR);
            GameRegistry.registerTileEntity(TileEntityAdvancedDetector.class, Names.TileEntities.ADVANCED_DETECTOR);
        }

        GameRegistry.registerBlock(blockTable, Names.Models.BLOCK_TABLE);
        GameRegistry.registerTileEntity(TileEntityBlockTable.class, Names.Models.BLOCK_TABLE);

        GameRegistry.registerBlock(lectern, Names.Models.LECTERN);
        GameRegistry.registerTileEntity(TileEntityLectern.class, Names.Models.LECTERN);
    }
}
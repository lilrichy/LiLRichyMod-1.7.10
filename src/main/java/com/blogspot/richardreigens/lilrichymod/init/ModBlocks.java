package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.*;
import com.blogspot.richardreigens.lilrichymod.blocks.type.concrete.*;
import com.blogspot.richardreigens.lilrichymod.blocks.type.stone.BlockArrangedStoneBricks;
import com.blogspot.richardreigens.lilrichymod.blocks.type.stone.BlockCrackedStone;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 11/19/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //Blocks
    public static final BlockLiLRichyMod concrete = new BlockConcrete();
    public static final BlockLiLRichyMod fancyConcreteBlocks = new BlockFancyConcreteBlocks();
    public static final BlockLiLRichyMod concreteBricks = new BlockConcreteBricks();
    public static final BlockLiLRichyMod concreteBricksDark = new BlockConcreteBricksDark();
    public static final BlockLiLRichyMod concreteRocks = new BlockConcreteRocks();
    public static final BlockLiLRichyMod concreteTexturedBlocks = new BlockConcreteTexturedBlocks();
    public static final BlockLiLRichyMod oldConcreteSquares = new BlockOldConcreteSquares();
    public static final BlockLiLRichyMod concreteSquares = new BlockConcreteSquares();
    public static final BlockLiLRichyMod smallConcreteBricks = new BlockSmallConcreteBricks();
    public static final BlockLiLRichyMod smallConcreteTexturedSquares = new BlockSmallConcreteTexturedSquares();
    public static final BlockLiLRichyMod arrangedConcreteBricks = new BlockArrangedConcreteBricks();
    public static final BlockLiLRichyMod crackedStone = new BlockCrackedStone();
    public static final BlockLiLRichyMod arrangedStoneBricks = new BlockArrangedStoneBricks();


    //Tile Entity Blocks
    public static final BlockTileEntityLiLRichyMod playerDetector = new BlockPlayerDetector();
    public static final BlockLiLRichyMod playerDetectorON = new BlockPlayerDetectorON();
    public static final BlockLiLRichyMod playerDetectorOFF = new BlockPlayerDetectorOFF();

    public static void init()
    {
        //Blocks
        GameRegistry.registerBlock(concrete, "concrete");
        GameRegistry.registerBlock(fancyConcreteBlocks, "fancyConcreteBlocks");
        GameRegistry.registerBlock(concreteBricks, "concreteBricks");
        GameRegistry.registerBlock(concreteBricksDark, "concreteBricksDark");
        GameRegistry.registerBlock(concreteRocks, "concreteRocks");
        GameRegistry.registerBlock(concreteTexturedBlocks, "concreteTexturedBlocks");
        GameRegistry.registerBlock(oldConcreteSquares, "oldConcreteSquares");
        GameRegistry.registerBlock(concreteSquares, "concreteSquares");
        GameRegistry.registerBlock(smallConcreteBricks, "smallConcreteBricks");
        GameRegistry.registerBlock(smallConcreteTexturedSquares, "smallConcreteTexturedSquares");
        GameRegistry.registerBlock(arrangedConcreteBricks, "arrangedConcreteBricks");
        GameRegistry.registerBlock(crackedStone, "crackedStone");
        GameRegistry.registerBlock(arrangedStoneBricks, "arrangedStoneBricks");

        //Tile Entity Blocks
        GameRegistry.registerBlock(playerDetector, Names.Blocks.PLAYER_DETECTOR);
        GameRegistry.registerBlock(playerDetectorON, Names.Blocks.PLAYER_DETECTOR_ON);
        GameRegistry.registerBlock(playerDetectorOFF, Names.Blocks.PLAYER_DETECTOR_OFF);
    }
}

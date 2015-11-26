package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.blocks.BlockPlayerDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.BlockTileEntityLiLRichyMod;
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
    public static final BlockTileEntityLiLRichyMod advancedDetector = new BlockAdvancedDetector();


    public static void init()
    {
        //Blocks
        GameRegistry.registerBlock(concrete, Names.Blocks.CONCRETE);
        GameRegistry.registerBlock(fancyConcreteBlocks, Names.Blocks.FANCY_CONCRETE_BLOCKS);
        GameRegistry.registerBlock(concreteBricks, Names.Blocks.CONCRETE_BRICKS);
        GameRegistry.registerBlock(concreteBricksDark, Names.Blocks.CONCRETE_BRICKS_DARK);
        GameRegistry.registerBlock(concreteRocks, Names.Blocks.CONCRETE_ROCKS);
        GameRegistry.registerBlock(concreteTexturedBlocks, Names.Blocks.CONCRETE_TEXTURED_BLOCKS);
        GameRegistry.registerBlock(oldConcreteSquares, Names.Blocks.OLD_CONCRETE_SQUARES);
        GameRegistry.registerBlock(concreteSquares, Names.Blocks.CONCRETE_SQUARES);
        GameRegistry.registerBlock(smallConcreteBricks, Names.Blocks.SMALL_CONCRETE_BRICKS);
        GameRegistry.registerBlock(smallConcreteTexturedSquares, Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES);
        GameRegistry.registerBlock(arrangedConcreteBricks, Names.Blocks.ARRANGED_CONCRETE_BRICKS);
        GameRegistry.registerBlock(crackedStone, Names.Blocks.CRACKED_STONE);
        GameRegistry.registerBlock(arrangedStoneBricks, Names.Blocks.ARRANGED_STONE_BRICKS);

        //Tile Entity Blocks
        GameRegistry.registerBlock(playerDetector, Names.Blocks.PLAYER_DETECTOR);
        GameRegistry.registerBlock(advancedDetector, Names.Blocks.ADVANCED_DETECTOR);

    }
}

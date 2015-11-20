package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.*;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 11/19/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLiLRichyMod concrete = new BlockConcrete();
    public static final BlockLiLRichyMod concreteBlocks = new BlockConcreteBlocks();
    public static final BlockLiLRichyMod concreteBricks = new BlockConcreteBricks();
    public static final BlockLiLRichyMod concreteBricksDark = new BlockConcreteBricksDark();
    public static final BlockLiLRichyMod concreteRocks = new BlockConcreteRocks();
    public static final BlockLiLRichyMod concreteTexturedBlocks = new BlockConcreteTexturedBlocks();
    public static final BlockLiLRichyMod oldConcreteSquares = new BlockOldConcreteSquares();
    public static final BlockLiLRichyMod concreteSquares = new BlockConcreteSquares();
    public static final BlockLiLRichyMod smallConcreteBricks = new BlockSmallConcreteBricks();
    public static final BlockLiLRichyMod smallConcreteTexturedSquares = new BlockSmallConcreteTexturedSquares();

    public static void init()
    {
        GameRegistry.registerBlock(concrete, "concrete");
        GameRegistry.registerBlock(concreteBlocks, "concreteBlocks");
        GameRegistry.registerBlock(concreteBricks, "concreteBricks");
        GameRegistry.registerBlock(concreteBricksDark, "concreteBricksDark");
        GameRegistry.registerBlock(concreteRocks, "concreteRocks");
        GameRegistry.registerBlock(concreteTexturedBlocks, "concreteTexturedBlocks");
        GameRegistry.registerBlock(oldConcreteSquares, "oldConcreteSquares");
        GameRegistry.registerBlock(concreteSquares, "concreteSquares");
        GameRegistry.registerBlock(smallConcreteBricks, "smallConcreteBricks");
        GameRegistry.registerBlock(smallConcreteTexturedSquares, "smallConcreteTexturedSquares");
    }
}

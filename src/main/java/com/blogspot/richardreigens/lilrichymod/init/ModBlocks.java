package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.*;
import com.blogspot.richardreigens.lilrichymod.blocks.type.stone.BlockArrangedStoneBricks;
import com.blogspot.richardreigens.lilrichymod.blocks.type.stone.BlockCrackedStone;
import com.blogspot.richardreigens.lilrichymod.blocks.type.concrete.*;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

/**
 * Created by Rich on 11/19/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
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


    public static void init()
    {

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
    }
}

package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.blocks.BlockConcreteBlocks;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 11/19/2015.
 */
public class ModBlocks
{
    public static final BlockLiLRichyMod concreteBlocks = new BlockConcreteBlocks();

    public static void init()
    {
        GameRegistry.registerBlock(concreteBlocks, "concreteBlocks");
    }
}

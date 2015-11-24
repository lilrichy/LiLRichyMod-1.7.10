package com.blogspot.richardreigens.lilrichymod.blocks.type.concrete;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockFancyConcreteBlocks extends BlockLiLRichyMod
{
    public BlockFancyConcreteBlocks()
    {
        super();
        this.setBlockName(Names.Blocks.FANCY_CONCRETE_BLOCKS);
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);

    }
}

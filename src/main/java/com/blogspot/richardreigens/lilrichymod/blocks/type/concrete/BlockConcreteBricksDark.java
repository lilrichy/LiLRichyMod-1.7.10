package com.blogspot.richardreigens.lilrichymod.blocks.type.concrete;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockConcreteBricksDark extends BlockLiLRichyMod
{
    public BlockConcreteBricksDark()
    {
        super();
        this.setBlockName(Names.Blocks.CONCRETE_BRICKS_DARK);
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);

    }
}

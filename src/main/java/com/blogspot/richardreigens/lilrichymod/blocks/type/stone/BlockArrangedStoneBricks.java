package com.blogspot.richardreigens.lilrichymod.blocks.type.stone;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;

/**
 * Created by Rich on 11/20/2015.
 */
public class BlockArrangedStoneBricks extends BlockLiLRichyMod
{
    public BlockArrangedStoneBricks()
    {
        super();
        this.setBlockName(Names.Blocks.ARRANGED_STONE_BRICKS);
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
    }
}

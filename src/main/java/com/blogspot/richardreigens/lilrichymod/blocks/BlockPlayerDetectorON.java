package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.reference.Names;

/**
 * Created by Rich on 11/24/2015.
 */
public class BlockPlayerDetectorON extends BlockLiLRichyMod
{
    public BlockPlayerDetectorON()
    {
        super();
        this.setBlockName(Names.Blocks.PLAYER_DETECTOR_ON);
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
        this.setCreativeTab(null);
    }
}

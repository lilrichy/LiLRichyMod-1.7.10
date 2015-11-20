package com.blogspot.richardreigens.lilrichymod.blocks.type.concrete;

import com.blogspot.richardreigens.lilrichymod.blocks.BlockLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockConcrete extends BlockLiLRichyMod
{
    public BlockConcrete()
    {
        super();
        this.setBlockName("concrete");
        this.setHardness(2f);
        this.setStepSound(soundTypePiston);
    }

    //Overrides to drop different item then block
    @Override
    public int quantityDropped(Random p_149745_1_)
    {
        return 4;
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return ModItems.crushedConcrete;
    }
}
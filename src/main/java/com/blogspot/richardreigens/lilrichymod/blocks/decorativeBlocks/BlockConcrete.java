package com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks;


import com.blogspot.richardreigens.lilrichymod.creativeTab.CreativeTabLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Rich on 11/19/2015.
 */
public class BlockConcrete extends DecorativeBlocks {

    public BlockConcrete(String name, Material material) {
        super(name, material);
        this.setHardness(2f);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabLiLRichyMod.LR_Tab);
        this.setBlockName(name);
    }

    //Overrides to drop different item then block
    @Override
    public int quantityDropped(Random p_149745_1_) {
        return 4;
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ModItems.crushedConcrete;
    }
}
package com.blogspot.richardreigens.lilrichymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Rich on 12/5/2015.
 */
public class DecorativeItemBlock extends ItemBlock {
    Block block;

    public DecorativeItemBlock(Block block) {
        super(block);
        this.block = block;
    }

    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean show) {
        if (block != null && DecorativeBlocks.getToolTip(block) != null) list.add(DecorativeBlocks.getToolTip(block));
        list.add(DecorativeBlocks.getCraftWithTip(block));
    }
}

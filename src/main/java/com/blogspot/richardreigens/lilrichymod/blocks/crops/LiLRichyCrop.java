package com.blogspot.richardreigens.lilrichymod.blocks.crops;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by Rich on 12/1/2015.
 */
public class LiLRichyCrop extends BlockCrops implements IGrowable {
    protected int maxGrowthStage = 7;

    @SideOnly(Side.CLIENT)
    protected IIcon[] iIcon;

    public LiLRichyCrop(String name) {
        this.setBlockName(name);
        setTickRandomly(true);
        float f = 0.5F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        setHardness(0.0F);
        setStepSound(soundTypeGrass);
        disableStats();
    }

    //is the block grass, dirt or farmland
    @Override
    protected boolean canPlaceBlockOn(Block blockThatCanBePlantedOn) {
        return blockThatCanBePlantedOn == Blocks.farmland;
    }

    @Override
    public boolean canBlockStay(World world, int x, int y, int z) {
        return world.getBlock(x, y - 1, z) == Blocks.farmland;
    }

    @Override
    public int getRenderType() {
        return 1; // Cross like flowers
    }

    //Gets the block's texture. Args: side, meta
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int parSide, int parGrowthStage) {
        return iIcon[parGrowthStage];
    }
}

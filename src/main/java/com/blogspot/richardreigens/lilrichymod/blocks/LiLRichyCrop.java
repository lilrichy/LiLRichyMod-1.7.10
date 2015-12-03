package com.blogspot.richardreigens.lilrichymod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Rich on 12/1/2015.
 */
public class LiLRichyCrop extends BlockBush implements IGrowable
{
    protected int maxGrowthStage = 7;

    @SideOnly(Side.CLIENT)
    protected IIcon[] iIcon;

    public LiLRichyCrop(String name)
    {
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
    protected boolean canPlaceBlockOn(Block blockThatCanBePlantedOn)
    {
        return blockThatCanBePlantedOn == Blocks.farmland;
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        super.updateTick(world, x, y, z, random);
        int growStage = world.getBlockMetadata(x, y, z) + 1;

        if (growStage > 7) {
            growStage = 7;
        }

        world.setBlockMetadataWithNotify(x, y, z, growStage, 2);
    }

    public void incrementGrowStage(World world, Random random, int x, int y, int z)
    {
        int growStage = world.getBlockMetadata(x, y, z) +
                MathHelper.getRandomIntegerInRange(random, 2, 5);

        if (growStage > maxGrowthStage) {
            growStage = maxGrowthStage;
        }
        world.setBlockMetadataWithNotify(x, y, z, growStage, 2);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random parRand, int parFortune)
    {
        return Item.getItemFromBlock(this);
    }

    @Override
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        return world.getBlock(x, y - 1, z) == Blocks.farmland;
    }

    @Override
    public int getRenderType()
    {
        return 1; // Cross like flowers
    }

    //Gets the block's texture. Args: side, meta
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int parSide, int parGrowthStage)
    {
        return iIcon[parGrowthStage];
    }

    // checks if finished growing (a grow stage of 7 is final stage)
    //func_149851_a returns true if bonemeal is allowed, false otherwise.
    @Override
    public boolean func_149851_a(World world, int x, int y, int z, boolean p_149851_5_)
    {
        return true;
    }

    //func_149852_a returns true at the same time bonemeal is used if conditions for a growth-tick are acceptable.
    @Override
    public boolean func_149852_a(World world, Random rand, int x, int y, int z)
    {
        return true;
    }

    //func_149853_b processes the actual growth-tick logic, which is usually increasing metadata or replacing the block.
    @Override
    public void func_149853_b(World world, Random rand, int x, int y, int z)
    {
        incrementGrowStage(world, rand, x, y, z);
    }
}

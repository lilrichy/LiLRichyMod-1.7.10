package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityPlayerDetector;
import com.blogspot.richardreigens.lilrichymod.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Rich on 11/23/2015.
 */
public class BlockPlayerDetector extends BlockTileEntityLiLRichyMod
{
    IIcon sideOff;
    IIcon sideOn;
    IIcon topBottom;

    public BlockPlayerDetector()
    {
        setBlockName(Names.Blocks.PLAYER_DETECTOR);
        this.setHardness(3f);
        this.setStepSound(soundTypeMetal);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        sideOff = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "playerDetectorOff");
        sideOn = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "playerDetectorOn");
        topBottom = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + "playerDetectorTopBottom");
    }

    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side)
    {
        TileEntityPlayerDetector te = (TileEntityPlayerDetector) world.getTileEntity(x, y, z);
        ItemStack stack = te.getCamouflage();
        if (stack != null && stack.getItem() instanceof ItemBlock) {
            Block block = ((ItemBlock) stack.getItem()).field_150939_a;
            return block.getIcon(side, stack.getItemDamage());
        } else {
            IIcon side_icon;
            TileEntity tile = world.getTileEntity(x, y, z);
            if (tile != null && te.getActivated())
                side_icon = sideOn;
            else
                side_icon = sideOff;

            LogHelper.info(te.activated + te.getActivated().toString());
            if (side == 0)
                return topBottom;
            else if (side == 1)
                return topBottom;
            else
                return side_icon;
        }
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        if (side == 0)
            return topBottom;
        else if (side == 1)
            return topBottom;
        else
            return sideOn;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new TileEntityPlayerDetector();
    }

    @Override
    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side)
    {
        return true;
    }

    @Override
    public boolean canProvidePower()
    {
        return true;
    }

    @Override
    public boolean isBlockSolid(IBlockAccess world, int x, int y, int z, int p_149747_5_)
    {
        return true;
    }

    @Override
    public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side)
    {
        return true;
    }

    @Override
    public boolean hasTileEntity(int meta)
    {
        return true;
    }

    public int isProvidingWeakPower(IBlockAccess world, int x, int y, int z, int p_149709_5_)
    {
        TileEntity te = world.getTileEntity(x, y, z);
        TileEntityPlayerDetector detector = (te != null && te instanceof TileEntityPlayerDetector) ? (TileEntityPlayerDetector) te : null;
        if (detector != null)
            return detector.activated ? 15 : 0;
        else
            return 0;
    }

    @Override
    public int isProvidingStrongPower(IBlockAccess world, int x, int y, int z, int meta)
    {
        TileEntity te = world.getTileEntity(x, y, z);
        TileEntityPlayerDetector detector = (te != null && te instanceof TileEntityPlayerDetector) ? (TileEntityPlayerDetector) te : null;
        if (detector != null)
            return detector.activated ? 15 : 0;
        else
            return 0;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (!world.isRemote) {
            TileEntityPlayerDetector te = (TileEntityPlayerDetector) world.getTileEntity(x, y, z);
            if (player.isSneaking() && player.getCurrentEquippedItem() == null) {
                if (te.getCamouflage() != null) {
                    ItemStack camoItemStack = te.getCamouflage();
                    te.setCamouflage(null);
                    world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "random.click", 0.3F, .1f);
                    EntityItem itemEntity = new EntityItem(world, x, y, z, camoItemStack);
                    world.spawnEntityInWorld(itemEntity);
                }

            } else {
                ItemStack playerItem = player.getCurrentEquippedItem();
                if (playerItem != null && te.getCamouflage() == null) {
                    ItemStack camoStack = playerItem.splitStack(1);
                    te.setCamouflage(camoStack);
                    world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "random.click", 0.3F, 1f);
                }


            }
        }
        return true;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta)
    {
        super.breakBlock(world, x, y, z, block, meta);
        world.notifyBlocksOfNeighborChange(x - 1, y, z, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x + 1, y, z, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x, y - 1, z, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x, y + 1, z, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x, y, z - 1, world.getBlock(x, y, z));
        world.notifyBlocksOfNeighborChange(x, y, z + 1, world.getBlock(x, y, z));
    }
}

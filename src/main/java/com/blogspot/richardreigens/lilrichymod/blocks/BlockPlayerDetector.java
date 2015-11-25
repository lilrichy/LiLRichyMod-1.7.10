package com.blogspot.richardreigens.lilrichymod.blocks;

import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityPlayerDetector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Rich on 11/23/2015.
 */
public class BlockPlayerDetector extends BlockTileEntityLiLRichyMod
{
    boolean activated;
    private ByteBuf buf;

    public BlockPlayerDetector()
    {
        setBlockName(Names.Blocks.PLAYER_DETECTOR);
        setBlockTextureName(Reference.MOD_ID.toLowerCase() + ":" + Names.Blocks.PLAYER_DETECTOR);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new TileEntityPlayerDetector();
    }

    @Override
    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side)
    {
        return !(side == 0 || side == 1);
    }

    public boolean canProvidePower()
    {
        return true;
    }

    public int isProvidingWeakPower(IBlockAccess world, int x, int y, int z, int p_149709_5_)
    {
        TileEntityPlayerDetector te = (TileEntityPlayerDetector) world.getTileEntity(x, y, z);
        activated = te.getActivated();

        if (activated == true) {
            return 15;
        } else
            return 0;

    }





    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (!world.isRemote) {
            TileEntityPlayerDetector te = (TileEntityPlayerDetector) world.getTileEntity(x, y, z);
            if (player.isSneaking() && player.getCurrentEquippedItem() == null) {
                te.setCamouflage(null);
            } else {
                te.setCamouflage(player.getCurrentEquippedItem());
                world.playSoundEffect((double) x + 0.5D, (double) y + 0.5D, (double) z + 0.5D, "random.click", 0.3F, .5f);
            }
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side)
    {
        TileEntityPlayerDetector te = (TileEntityPlayerDetector) world.getTileEntity(x, y, z);

        ItemStack stack = te.getCamouflage();
        if (stack != null && stack.getItem() instanceof ItemBlock) {
            Block block = ((ItemBlock) stack.getItem()).field_150939_a;
            return block.getIcon(side, stack.getItemDamage());
        }
        return super.getIcon(world, x, y, z, side);
    }
}

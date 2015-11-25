package com.blogspot.richardreigens.lilrichymod.tileEntity;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;

import java.util.List;

/**
 * Created by Rich on 11/23/2015.
 */
public class TileEntityPlayerDetector extends TileEntityLiLRichyMod
{
    private boolean activated = false;
    private ItemStack camoStack;
    private NBTTagCompound tag = new NBTTagCompound();


    @Override
    public void updateEntity()
    {
        if (!worldObj.isRemote) {
            List<Entity> entities = worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox
                    (xCoord - 1, yCoord - 1, zCoord - 1, xCoord + 2, yCoord + 2, zCoord + 2));
            if (entities.size() > 0) {
                activated = true;
                worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
                updateBlocks();

            } else if (entities.size() < 1) {
                activated = false;
                worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
                updateBlocks();

            }
        }
    }

    private void updateBlocks()

    {
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord - 1, yCoord, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord + 1, yCoord, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord - 1, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord + 1, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord - 1, worldObj.getBlock(xCoord, yCoord, zCoord));
        worldObj.notifyBlocksOfNeighborChange(xCoord, yCoord, zCoord + 1, worldObj.getBlock(xCoord, yCoord, zCoord));
    }



    public ItemStack getCamouflage()
    {
        return camoStack;
    }

    public void setCamouflage(ItemStack stack)
    {
        this.camoStack = stack;
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    public Boolean getActivated()
    {
        return activated;
    }

    public void writeToPacket(ByteBuf buf)
    {
        ByteBufUtils.writeItemStack(buf, camoStack);

    }

    public void readFromPacket(ByteBuf buf)
    {
        camoStack = ByteBufUtils.readItemStack(buf);
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag)
    {
        super.readFromNBT(tag);
        if (tag.hasKey("camoStack")) {
            camoStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("camoStack"));
        } else {
            camoStack = null;
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound tag)
    {
        super.writeToNBT(tag);

        if (camoStack != null) {
            NBTTagCompound t = new NBTTagCompound();
            camoStack.writeToNBT(t);
            tag.setTag("camoStack", t);
        }
    }
}

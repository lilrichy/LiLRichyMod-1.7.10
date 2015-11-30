package com.blogspot.richardreigens.lilrichymod.tileEntity;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by Rich on 11/23/2015.
 */
public class TileEntityPlayerDetector extends TileEntityLiLRichyMod
{
    public boolean activated = false;
    private int tick = 0;
    private int rate = 5;
    private int range = 2;
    private ItemStack camoStack;
    private NBTTagCompound tag = new NBTTagCompound();

    @Override
    public void updateEntity()
    {
        {
            if (worldObj.isRemote)
                return;

            if (tick >= rate) {
                tick = 0;
                EntityPlayer player = worldObj.getClosestPlayer(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D, range + 0.5D);
                if (player != null) {
                    if (!activated)
                        setActivated(true);
                } else {
                    if (activated)
                        setActivated(false);
                }
            } else
                tick++;
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

    public int getRange()
    {
        return range;
    }

    public void setRange(int value)
    {
        this.range = value;
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

    private void setActivated(boolean output)
    {
        activated = output;
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        updateBlocks();
    }

    public void writeToPacket(ByteBuf buf)
    {
        ByteBufUtils.writeItemStack(buf, camoStack);
        buf.writeBoolean(activated);

    }

    public void readFromPacket(ByteBuf buf)
    {
        camoStack = ByteBufUtils.readItemStack(buf);
        activated = buf.readBoolean();
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);

    }

    @Override
    public void readFromNBT(NBTTagCompound tag)
    {
        activated = tag.getBoolean("activated");
        range = tag.getInteger("range");
        if (tag.hasKey("camoStack")) {
            camoStack = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("camoStack"));
        } else {
            camoStack = null;
        }
        super.readFromNBT(tag);
    }

    @Override
    public void writeToNBT(NBTTagCompound tag)
    {
        tag.setBoolean("activated", activated);
        tag.setInteger("range", range);
        if (camoStack != null) {
            NBTTagCompound t = new NBTTagCompound();
            camoStack.writeToNBT(t);
            tag.setTag("camoStack", t);
        }
        super.writeToNBT(tag);
    }
}

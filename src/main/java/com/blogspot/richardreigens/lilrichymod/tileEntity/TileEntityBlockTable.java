package com.blogspot.richardreigens.lilrichymod.tileEntity;

import com.blogspot.richardreigens.lilrichymod.handler.BlockTableRecipes;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

/**
 * Created by Rich on 12/8/2015.
 */
public class TileEntityBlockTable extends TileEntityLiLRichyMod implements IInventory
{
    public static final int PLAYER_SLOTS_TOTAL = 36;
    public static final int INPUT_SLOTS_COUNT = 2;
    public static final int OUTPUT_SLOTS_COUNT = 15;
    public static final int TOTAL_SLOTS_COUNT = PLAYER_SLOTS_TOTAL + INPUT_SLOTS_COUNT + OUTPUT_SLOTS_COUNT;

    public static final int FIRST_INPUT_SLOT = PLAYER_SLOTS_TOTAL;
    public static final int FIRST_OUTPUT_SLOT = FIRST_INPUT_SLOT + INPUT_SLOTS_COUNT;
    public int direction;
    private ItemStack[] resultItemStack = new ItemStack[0];
    private ItemStack[] itemStacks = new ItemStack[TOTAL_SLOTS_COUNT];
    private int update = 0;
    private ItemStack[] input = {getStackInSlot(FIRST_INPUT_SLOT), getStackInSlot(FIRST_INPUT_SLOT + 1)};
    private ItemStack[] resultOfLastCrafting;

    // Return true if the given stack is allowed to be inserted in the given slot
    // Unlike the vanilla furnace, we allow anything to be placed in the fuel slots
    static public boolean isItemValidForInputSlot(ItemStack itemStack)
    {
        return true;
    }

    static public boolean isItemValidForOutputSlot(ItemStack itemStack)
    {
        return false;
    }

    @Override
    public void writeToNBT(NBTTagCompound tag)
    {
        super.writeToNBT(tag);
        tag.setInteger("direction", direction);

        NBTTagList nbttaglist = new NBTTagList();

        if (getStackInSlot(FIRST_INPUT_SLOT) != null) {
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            getStackInSlot(FIRST_INPUT_SLOT).writeToNBT(nbttagcompound1);
            nbttaglist.appendTag(nbttagcompound1);
        }
        if (getStackInSlot(FIRST_INPUT_SLOT + 1) != null) {
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            getStackInSlot(FIRST_INPUT_SLOT + 1).writeToNBT(nbttagcompound1);
            nbttaglist.appendTag(nbttagcompound1);
        }

        tag.setTag("Items", nbttaglist);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag)
    {
        super.readFromNBT(tag);
        direction = tag.getInteger("direction");

        NBTTagList nbttaglist = (NBTTagList) tag.getTag("Items");
        NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(0);
        setInventorySlotContents(FIRST_INPUT_SLOT, ItemStack.loadItemStackFromNBT(nbttagcompound1));
        nbttagcompound1 = nbttaglist.getCompoundTagAt(1);
        setInventorySlotContents(FIRST_INPUT_SLOT + 1, ItemStack.loadItemStackFromNBT(nbttagcompound1));

    }

    @Override
    public Packet getDescriptionPacket()
    {
        NBTTagCompound var1 = new NBTTagCompound();
        writeToNBT(var1);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, var1);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
    {
        readFromNBT(pkt.func_148857_g());
    }

    // Gets the number of slots in the inventory
    @Override
    public int getSizeInventory()
    {
        return itemStacks.length;
    }

    // Gets the stack in the given slot
    @Override
    public ItemStack getStackInSlot(int i)
    {
//        LogHelper.info("Total: " + TOTAL_SLOTS_COUNT);
//        LogHelper.info("Slot i: " + i);
        return itemStacks[i];
    }

    // overwrites the stack in the given slotIndex with the given stack
    @Override
    public void setInventorySlotContents(int slotIndex, ItemStack itemstack)
    {
        itemStacks[slotIndex] = itemstack;
        if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
            itemstack.stackSize = getInventoryStackLimit();
        }
        markDirty();
    }

    // This is the maximum number if items allowed in each slot
    // This only affects things such as hoppers trying to insert items you need to use the container to enforce this for players
    // inserting items via the gui
    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    // Return true if the given player is able to use this block. In this case it checks that
    // 1) the world tileentity hasn't been replaced in the meantime, and
    // 2) the player isn't too far away from the centre of the block
    @Override
    public boolean isUseableByPlayer(EntityPlayer player)
    {
        if (this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this) return false;
        final double X_CENTRE_OFFSET = 0.5;
        final double Y_CENTRE_OFFSET = 0.5;
        final double Z_CENTRE_OFFSET = 0.5;
        final double MAXIMUM_DISTANCE_SQ = 8.0 * 8.0;
        return player.getDistanceSq(player.posX + X_CENTRE_OFFSET, player.posY + Y_CENTRE_OFFSET, player.posZ + Z_CENTRE_OFFSET) < MAXIMUM_DISTANCE_SQ;
    }


    //-----------------------------------------------------------------------------------------------------------
    //Trying to get working recipies

    /**
     * Removes some of the units from itemstack in the given slot, and returns as a separate itemstack
     *
     * @param slotIndex the slot number to remove the items from
     * @param count     the number of units to remove
     * @return a new itemstack containing the units removed from the slot
     */
    @Override
    public ItemStack decrStackSize(int slotIndex, int count)
    {
        ItemStack itemStackInSlot = getStackInSlot(slotIndex);
        if (itemStackInSlot == null) return null;

        ItemStack itemStackRemoved;
        if (itemStackInSlot.stackSize <= count) {
            itemStackRemoved = itemStackInSlot;
            setInventorySlotContents(slotIndex, null);
        } else {
            itemStackRemoved = itemStackInSlot.splitStack(count);
            if (itemStackInSlot.stackSize == 0) {
                setInventorySlotContents(slotIndex, null);
            }
        }
        markDirty();
        return itemStackRemoved;
    }

    @Override
    public String getInventoryName()
    {
        return ModBlocks.blockTable.getUnlocalizedName() + ".name";
    }

    @Override
    public boolean hasCustomInventoryName()
    {
        return false;
    }

    public void updateEntity()
    {
//        update++;
//        if (update > 20) {
//            update = 0;

        if (inputHasItems() && resultItemStack != resultOfLastCrafting) {
            resultOfLastCrafting = resultItemStack;
            clearOutput();
            for (int l = 0; l < resultItemStack.length; l++) {

                setInventorySlotContents(FIRST_OUTPUT_SLOT + l, resultItemStack[l]);
            }
        }

        //  }
    }


    public void clearOutput()
    {
        for (int i = FIRST_OUTPUT_SLOT; i < FIRST_OUTPUT_SLOT + OUTPUT_SLOTS_COUNT; i++) {
            setInventorySlotContents(i, null);

        }
        resultOfLastCrafting = null;
    }

    private boolean inputHasItems()
    {
        if (getStackInSlot(FIRST_INPUT_SLOT) != null && getStackInSlot(FIRST_INPUT_SLOT + 1) != null) {
            resultItemStack = getCurrentRecipe();
            return true;
        } else
            clearOutput();
        return false;
    }

    // If you have more than one output per recipe, this will return an ItemStack[] array instead
    public ItemStack[] getCurrentRecipe()
    {
        // resultItemStack = BlockTableRecipes.recipes().getCraftingResult(getStackInSlot(FIRST_INPUT_SLOT), getStackInSlot(FIRST_INPUT_SLOT + 1));

        return BlockTableRecipes.recipes().getCraftingResult(getStackInSlot(FIRST_INPUT_SLOT), getStackInSlot(FIRST_INPUT_SLOT + 1));
    }


    // -----------------------------------------------------------------------------------------------------------
    // The following methods are not needed for this example but are part of IInventory so they must be implemented

    // Unused unless your container specifically uses it.
    // Return true if the given stack is allowed to go in the given slot
    @Override
    public boolean isItemValidForSlot(int slotIndex, ItemStack itemstack)
    {
        return false;
    }

    /**
     * This method removes the entire contents of the given slot and returns it.
     * Used by containers such as crafting tables which return any items in their slots when you close the GUI
     *
     * @param slotIndex
     * @return
     */
    @Override
    public ItemStack getStackInSlotOnClosing(int slotIndex)
    {
        ItemStack itemStack = getStackInSlot(slotIndex);
        if (itemStack != null) setInventorySlotContents(slotIndex, null);
        return itemStack;
    }

    @Override
    public void closeInventory()
    {

    }

    @Override
    public void openInventory()
    {

    }

}

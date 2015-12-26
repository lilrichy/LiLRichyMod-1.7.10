package com.blogspot.richardreigens.lilrichymod.tileEntity;

import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.inventory.ContainerBlockTable;
import com.blogspot.richardreigens.lilrichymod.recipes.BlockTableRecipes;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
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
public class TileEntityBlockTable extends TileEntityLiLRichyMod implements IInventory {
    public static final int PLAYER_SLOTS_TOTAL = 36;
    public static final int INPUT_SLOTS_COUNT = 2;
    public static final int OUTPUT_SLOTS_COUNT = 15;
    public static final int TOTAL_SLOTS_COUNT = PLAYER_SLOTS_TOTAL + INPUT_SLOTS_COUNT + OUTPUT_SLOTS_COUNT;
    public static final int FIRST_INPUT_SLOT = ContainerBlockTable.INPUT_CONCRETE_1;
    public static final int FIRST_OUTPUT_SLOT = FIRST_INPUT_SLOT + 2;

    public int direction;
    public ItemStack[] input;
    private int decreaseAmt = 0;
    private ItemStack[] itemStacks = new ItemStack[TOTAL_SLOTS_COUNT];
    private ItemStack[] resultItemStack = new ItemStack[0];

    // Return true if the given stack is allowed to be inserted in the given slot
    static public boolean isItemValidForBlockInputSlot(ItemStack itemStack) {
        return BlockTableRecipes.isCraftableBlock(itemStack);
    }

    static public boolean isItemValidForModifierInputSlot(ItemStack itemStack) {
        return BlockTableRecipes.isMaterial(itemStack);
    }

    static public boolean isItemValidForOutputSlot(ItemStack itemStack) {
        return false;
    }

    //-----------------------------------------------------------------------------------------------------------
    //Main Recipe, tileEntity, and other Methods.
    //-----------------------------------------------------------------------------------------------------------
    public void updateEntity() {
        getInput();
        resultItemStack = getCurrentRecipe();
        if (resultItemStack != null) {
            updateOutputSlots();
        } else {
            clearOutput();
        }
        if (!inputHasItems()) {
            clearOutput();
        }
    }

// -----------------------------------------------------------------------------------------------------------
// NBT, Packets, and slot methods.
// -----------------------------------------------------------------------------------------------------------

    public ItemStack[] getCurrentRecipe() {
        if (inputHasItems()) {
            if (BlockTableRecipes.recipes().getCraftingResult(getStackInSlot(FIRST_INPUT_SLOT), getStackInSlot(FIRST_INPUT_SLOT + 1)) != null) {
                return BlockTableRecipes.recipes().getCraftingResult(getStackInSlot(FIRST_INPUT_SLOT), getStackInSlot(FIRST_INPUT_SLOT + 1));
            }
        }
        return null;
    }

    public void doCrafting(int slot, int clickButton, int clickID, EntityPlayer player) {
        if (inputHasItems() && getCurrentRecipe() != null && getStackInSlot(slot) != null) {
            this.decrStackSize(0, decreaseAmt);
            this.decrStackSize(1, decreaseAmt);
            player.inventory.addItemStackToInventory(getStackInSlot(slot));
            worldObj.playSoundEffect((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D,
                    (double) this.zCoord + 0.5D, Reference.MOD_ID + ":" + "blockTableCraftSound", 0.3F, .1f);
            this.markDirty();
        }
    }

    public void getInput() {
        this.input = new ItemStack[]{getStackInSlot(FIRST_INPUT_SLOT), getStackInSlot(FIRST_INPUT_SLOT + 1)};
        if (inputHasItems()) {
            if (getStackInSlot(FIRST_INPUT_SLOT).stackSize >= getStackInSlot(FIRST_INPUT_SLOT + 1).stackSize) {
                this.decreaseAmt = this.getStackInSlot(FIRST_INPUT_SLOT + 1).stackSize;
            } else if (getStackInSlot(FIRST_INPUT_SLOT).stackSize < getStackInSlot(FIRST_INPUT_SLOT + 1).stackSize) {
                this.decreaseAmt = this.getStackInSlot(FIRST_INPUT_SLOT).stackSize;
            }
        } else this.decreaseAmt = 0;
    }

    @Override
    public ItemStack decrStackSize(int slotIndex, int count) {
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

    public void updateOutputSlots() {
        clearOutput();
        for (int i = 0; i < resultItemStack.length; i++) {
            ItemStack stack = new ItemStack(resultItemStack[i].getItem());
            stack.stackSize = getStackInSlot(0).stackSize;
            setInventorySlotContents(FIRST_OUTPUT_SLOT + i, stack);
        }
    }

    public void clearOutput() {
        for (int i = FIRST_OUTPUT_SLOT; i < FIRST_OUTPUT_SLOT + OUTPUT_SLOTS_COUNT; i++) {
            setInventorySlotContents(i, null);
        }
    }

    public boolean inputHasItems() {
        return getStackInSlot(FIRST_INPUT_SLOT) != null && getStackInSlot(FIRST_INPUT_SLOT + 1) != null;
    }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
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
    public void readFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);
        direction = tag.getInteger("direction");
        NBTTagList nbttaglist = (NBTTagList) tag.getTag("Items");
        NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(0);
        setInventorySlotContents(FIRST_INPUT_SLOT, ItemStack.loadItemStackFromNBT(nbttagcompound1));
        nbttagcompound1 = nbttaglist.getCompoundTagAt(1);
        setInventorySlotContents(FIRST_INPUT_SLOT + 1, ItemStack.loadItemStackFromNBT(nbttagcompound1));
    }

    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound var1 = new NBTTagCompound();
        writeToNBT(var1);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, var1);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        readFromNBT(pkt.func_148857_g());
    }

// -----------------------------------------------------------------------------------------------------------
// The following methods must be implemented but don't really affect the way the table works
// -----------------------------------------------------------------------------------------------------------

    // Gets the number of slots in the inventory
    @Override
    public int getSizeInventory() {
        return itemStacks.length;
    }

    // Gets the stack in the given slot
    @Override
    public ItemStack getStackInSlot(int i) {
        return itemStacks[i];
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        if (index < 0 || index >= this.getSizeInventory())
            return;
        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
            stack.stackSize = this.getInventoryStackLimit();
        if (stack != null && stack.stackSize == 0)
            stack = null;
        this.itemStacks[index] = stack;
        this.markDirty();
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        if (this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this) return false;
        final double X_CENTRE_OFFSET = 0.5;
        final double Y_CENTRE_OFFSET = 0.5;
        final double Z_CENTRE_OFFSET = 0.5;
        final double MAXIMUM_DISTANCE_SQ = 8.0 * 8.0;
        return player.getDistanceSq(player.posX + X_CENTRE_OFFSET, player.posY + Y_CENTRE_OFFSET, player.posZ + Z_CENTRE_OFFSET) < MAXIMUM_DISTANCE_SQ;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public String getInventoryName() {
        return ModBlocks.blockTable.getUnlocalizedName() + ".name";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public boolean isItemValidForSlot(int slotIndex, ItemStack itemstack) {
        return false;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slotIndex) {
        ItemStack itemStack = getStackInSlot(slotIndex);
        if (itemStack != null) setInventorySlotContents(slotIndex, null);
        return itemStack;
    }

    @Override
    public void closeInventory() {
    }

    @Override
    public void openInventory() {
    }
}

package com.blogspot.richardreigens.lilrichymod.inventory;

import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityBlockTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created by Rich on 12/10/2015.
 */
public class ContainerBlockTable extends ContainerLiLRichyMod
{
    private TileEntityBlockTable te;

    public ContainerBlockTable(InventoryPlayer playerInventory, TileEntityBlockTable te)
    {
        this.te = te;

        //Player inventory and hot bar slots
        this.addPlayerSlots(playerInventory, 8, 84);

        //crafting slots
        this.addSlotToContainer(new SlotInput(te, TileEntityBlockTable.FIRST_INPUT_SLOT, 8, 33));
        this.addSlotToContainer(new SlotInput(te, TileEntityBlockTable.FIRST_INPUT_SLOT + 1, 45, 33));

        //Results Grid
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {
                this.addSlotToContainer(new SlotOutput(te, j + i * 5 + TileEntityBlockTable.FIRST_OUTPUT_SLOT, j * 18 + 80, i * 18 + 16));
            }
        }
    }

    // Checks each tick to make sure the player is still able to access the inventory and if not closes the gui
    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return te.isUseableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex)
    {
        return null;
    }

    @Override
    public void addCraftingToCrafters(ICrafting p_75132_1_)
    {
        super.addCraftingToCrafters(p_75132_1_);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i) {
            ICrafting icrafting = (ICrafting) this.crafters.get(i);
        }
    }

    // SlotInput is a slot for input items
    public class SlotInput extends Slot
    {
        public SlotInput(IInventory inventoryIn, int index, int xPosition, int yPosition)
        {
            super(inventoryIn, index, xPosition, yPosition);
        }

        // if this function returns false, the player won't be able to insert the given item into this slot
        @Override
        public boolean isItemValid(ItemStack stack)
        {
            return TileEntityBlockTable.isItemValidForInputSlot(stack);
        }
    }

    // SlotOutput is a slot that will not accept any items
    public class SlotOutput extends Slot
    {
        public SlotOutput(IInventory inventoryIn, int index, int xPosition, int yPosition)
        {
            super(inventoryIn, index, xPosition, yPosition);
        }

        // if this function returns false, the player won't be able to insert the given item into this slot
        @Override
        public boolean isItemValid(ItemStack stack)
        {
            return TileEntityBlockTable.isItemValidForOutputSlot(stack);
        }
    }
}


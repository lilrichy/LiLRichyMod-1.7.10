package com.blogspot.richardreigens.lilrichymod.inventory;

import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityAdvancedDetector;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by Rich on 11/26/2015.
 */
public class ContainerAdvancedDetector extends ContainerLiLRichyMod
{
    private final TileEntityAdvancedDetector te;

    public ContainerAdvancedDetector(InventoryPlayer playerInventory, TileEntityAdvancedDetector te)
    {
        //Inventory slot for Camo
        this.addSlotToContainer(new Slot(te, 0, 9, 11));

        this.addPlayerSlots(playerInventory, 8, 84);
        this.te = te;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return te.isUseableByPlayer(player);
    }

    //Shift Click Support
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot) this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            //slotIndex<"Number of slots added to container"
            if (slotIndex < 1) {
                //Change par2 to the number of slots added, change par3 to 36+"number of added slots"
                if (!this.mergeItemStack(itemstack1, 1, 37, true)) {
                    return null;
                }
            }
            //Change par3 to number of slots added.
            //stack size number is to check so only that number go into slot
            else if (te.getCamouflage(0) == null && itemstack.getItem() instanceof
                    ItemBlock && itemstack.stackSize == 1 && !this.mergeItemStack(itemstack1, 0, 1, false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack(null);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }

}

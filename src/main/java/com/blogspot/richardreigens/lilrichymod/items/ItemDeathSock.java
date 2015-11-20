package com.blogspot.richardreigens.lilrichymod.items;

import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import com.blogspot.richardreigens.lilrichymod.utility.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

/**
 * Created by Rich on 11/19/2015.
 */
public class ItemDeathSock extends ItemLiLRichyMod
{
    public ItemDeathSock()
    {
        super();
        this.setUnlocalizedName("deathSock");
        this.maxStackSize = 1;

    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {

        if (player.isSneaking()) {
            //code if shift-right clicking
            player.setHealth(-player.getHealth());
            player.inventory.dropAllItems();
            player.addChatComponentMessage(new ChatComponentText(Reference.DEATH_SOCK_PROCCED_MESSAGE));
            LogHelper.info("Shift Right Click");
        } else {
            //code if right clicking
            LogHelper.info("Right Clicking");
        }

        return itemStack;
    }


}


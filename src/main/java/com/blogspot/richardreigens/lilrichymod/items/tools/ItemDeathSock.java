package com.blogspot.richardreigens.lilrichymod.items.tools;

import com.blogspot.richardreigens.lilrichymod.items.ItemLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
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
        this.setUnlocalizedName(Names.Items.DEATH_SOCK);
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
        } else {
            //code if right clicking
        }
        return itemStack;
    }
}


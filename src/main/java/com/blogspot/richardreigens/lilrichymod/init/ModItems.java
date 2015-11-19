package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.items.ItemDeathSock;
import com.blogspot.richardreigens.lilrichymod.items.ItemLiLRichyMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 11/19/2015.
 */
public class ModItems
{
    public static final ItemLiLRichyMod deathSock = new ItemDeathSock();

    public static void init()
    {
        GameRegistry.registerItem(deathSock, "deathSock");
    }
}

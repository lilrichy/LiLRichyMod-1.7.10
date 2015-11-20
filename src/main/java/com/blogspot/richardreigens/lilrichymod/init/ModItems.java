package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.items.ItemConcreteMix;
import com.blogspot.richardreigens.lilrichymod.items.ItemDeathSock;
import com.blogspot.richardreigens.lilrichymod.items.ItemLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.items.ItemShadowmourne;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Rich on 11/19/2015.
 */
public class ModItems
{
    public static final ItemLiLRichyMod deathSock = new ItemDeathSock();
    public static final ItemLiLRichyMod concreteMix = new ItemConcreteMix();
    public static final ItemLiLRichyMod shadowmourne = new ItemShadowmourne();


    public static void init()
    {
        GameRegistry.registerItem(deathSock, "deathSock");
        GameRegistry.registerItem(concreteMix, "concreteMix");
        GameRegistry.registerItem(shadowmourne, "shadowmourn");
    }
}

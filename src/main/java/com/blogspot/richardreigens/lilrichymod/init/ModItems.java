package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.items.ItemConcreteMix;
import com.blogspot.richardreigens.lilrichymod.items.ItemCrushedConcrete;
import com.blogspot.richardreigens.lilrichymod.items.tools.ItemDeathSock;
import com.blogspot.richardreigens.lilrichymod.items.ItemLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.items.tools.ItemShadowmourne;
import com.blogspot.richardreigens.lilrichymod.items.tools.ItemSwordLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Rich on 11/19/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLiLRichyMod deathSock = new ItemDeathSock();
    public static final ItemLiLRichyMod concreteMix = new ItemConcreteMix();
    public static final ItemLiLRichyMod crushedConcrete = new ItemCrushedConcrete();
    public static final ItemSwordLiLRichyMod shadowmourne = new ItemShadowmourne(Item.ToolMaterial.EMERALD, 93f);


    public static void init()
    {
        GameRegistry.registerItem(deathSock, "deathSock");
        GameRegistry.registerItem(concreteMix, "concreteMix");
        GameRegistry.registerItem(crushedConcrete, "crushedConcrete");
        GameRegistry.registerItem(shadowmourne, "shadowmourn");
    }
}

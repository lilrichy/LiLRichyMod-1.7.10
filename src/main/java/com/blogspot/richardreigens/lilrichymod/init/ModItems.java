package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.handler.ConfigurationHandler;
import com.blogspot.richardreigens.lilrichymod.items.ItemLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.items.ItemLiLRichySeedFood;
import com.blogspot.richardreigens.lilrichymod.items.seeds.SeedBeardedAzalea;
import com.blogspot.richardreigens.lilrichymod.items.tools.ItemDeathSock;
import com.blogspot.richardreigens.lilrichymod.items.tools.ItemShadowmourne;
import com.blogspot.richardreigens.lilrichymod.items.tools.ItemSwordLiLRichyMod;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
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
    public static final ItemLiLRichyMod concreteMix = new ItemLiLRichyMod(Names.Items.CONCRETE_MIX, 64);
    public static final ItemLiLRichyMod crushedConcrete = new ItemLiLRichyMod(Names.Items.CRUSHED_CONCRETE, 64);
    public static final ItemSwordLiLRichyMod shadowmourne = new ItemShadowmourne(Item.ToolMaterial.EMERALD, 93f);
    public static final ItemLiLRichySeedFood seedBearedAzailia = new SeedBeardedAzalea(Names.Crops.BEARDED_AZALEA_SEED);
    public static final ItemLiLRichyMod essanceOfBeared = new ItemLiLRichyMod(Names.Items.ESSENCE_OF_BEARED, 64);

    public static void init()
    {
        GameRegistry.registerItem(deathSock, Names.Items.DEATH_SOCK);
        GameRegistry.registerItem(concreteMix, Names.Items.CONCRETE_MIX);
        GameRegistry.registerItem(crushedConcrete, Names.Items.CRUSHED_CONCRETE);
        if (ConfigurationHandler.loadShadowmourne) GameRegistry.registerItem(shadowmourne, Names.Items.SHADOWMOURNE);
        GameRegistry.registerItem(seedBearedAzailia, Names.Crops.BEARDED_AZALEA_SEED);
        GameRegistry.registerItem(essanceOfBeared, Names.Items.ESSENCE_OF_BEARED);
    }
}

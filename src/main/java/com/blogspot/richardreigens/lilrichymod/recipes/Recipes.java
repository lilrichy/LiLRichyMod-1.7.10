package com.blogspot.richardreigens.lilrichymod.recipes;

import com.blogspot.richardreigens.lilrichymod.handler.ConfigurationHandler;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Rich on 11/20/2015.
 */
public class Recipes
{
    public static void init()
    {
        if (ConfigurationHandler.loadDecorativeBlockRecipes) {
            DecorativeBlockRecipes.init();
        }

        smeltingRecipes();
        ItemRecipes.init();
        PanelsRecipies.init();
        tileRecipes();
    }

    public static void smeltingRecipes()
    {
        //Concrete
        GameRegistry.addSmelting(new ItemStack(ModItems.concreteMix), new ItemStack(ModBlocks.concrete), 0.1f);
    }

    public static void tileRecipes()
    {
        //Player Detector
        GameRegistry.addRecipe(new ItemStack(ModBlocks.playerDetector, 1), "ici", "ctc", "ici",
                'i', new ItemStack(Items.iron_ingot), 'c', new ItemStack(Items.comparator), 't', new ItemStack(Blocks.redstone_torch));

        //Advanced Detector
        GameRegistry.addRecipe(new ItemStack(ModBlocks.advancedDetector, 1), "idi", "dtd", "idi",
                'i', new ItemStack(Items.gold_ingot), 'd', new ItemStack(Items.diamond), 't', new ItemStack(ModBlocks.playerDetector));

        //Block Table
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTable, 1), "www", "pwp", "p p",
                'w', new ItemStack(Blocks.heavy_weighted_pressure_plate), 'p', new ItemStack(Blocks.planks));
    }
}

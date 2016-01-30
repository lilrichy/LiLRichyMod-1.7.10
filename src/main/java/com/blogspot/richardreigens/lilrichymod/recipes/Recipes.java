package com.blogspot.richardreigens.lilrichymod.recipes;

import com.blogspot.richardreigens.lilrichymod.handler.ConfigurationHandler;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import com.blogspot.richardreigens.lilrichymod.init.ModTileEntity;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Rich on 11/20/2015.
 */
public class Recipes {
    public static void init() {

        blockRecipes();
        tileRecipes();
        StairsRecipes.init();
        PanesRecipes.init();

        if (ConfigurationHandler.smeltingRecipes) smeltingRecipes();
        if (ConfigurationHandler.itemRecipes) ItemRecipes.init();
        if (ConfigurationHandler.panelRecipes) PanelsRecipes.init();
        if (ConfigurationHandler.thermalExpansionRecipes) ModCompatRecipes.thermalExpansionRecipesInit();
        if (ConfigurationHandler.enderIORecipies) ModCompatRecipes.enderIORecipesInit();
    }

    public static void blockRecipes() {
        //Concrete
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concrete),
                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete),
                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete));
    }

    public static void smeltingRecipes() {
        //Concrete
        GameRegistry.addSmelting(new ItemStack(ModItems.concreteMix), new ItemStack(ModBlocks.concrete), 0.1f);

        //Smelt Blocks back to Concrete
        for (ItemStack aList : OreDictionary.getOres(Names.OreDicNames.SMELT_TO_CONCRETE)) {
            GameRegistry.addSmelting(new ItemStack(aList.getItem()), new ItemStack(ModBlocks.concrete), 0.1f);
        }
    }

    public static void tileRecipes() {
        //Player Detector
        GameRegistry.addRecipe(new ItemStack(ModTileEntity.playerDetector, 1), "ici", "ctc", "ici",
                'i', new ItemStack(Items.iron_ingot), 'c', new ItemStack(Items.comparator), 't', new ItemStack(Blocks.redstone_torch));

        //Advanced Detector
        GameRegistry.addRecipe(new ItemStack(ModTileEntity.advancedDetector, 1), "idi", "dtd", "idi",
                'i', new ItemStack(Items.gold_ingot), 'd', new ItemStack(Items.diamond), 't', new ItemStack(ModTileEntity.playerDetector));

        //Block Table
        GameRegistry.addRecipe(new ItemStack(ModTileEntity.blockTable, 1), "www", "pwp", "p p",
                'w', new ItemStack(Blocks.heavy_weighted_pressure_plate), 'p', new ItemStack(Blocks.planks));

        //Lectern
        GameRegistry.addRecipe(new ItemStack(ModTileEntity.lectern, 1), "sss", " p ", " s ",
                's', new ItemStack(Blocks.wooden_slab), 'p', new ItemStack(Blocks.planks));
    }
}

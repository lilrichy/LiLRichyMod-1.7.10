package com.blogspot.richardreigens.lilrichymod.handler;

import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import com.blogspot.richardreigens.lilrichymod.tileEntity.TileEntityBlockTable;
import com.blogspot.richardreigens.lilrichymod.utility.LogHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Rich on 12/10/2015.
 */
public class BlockTableRecipes
{
    private static final BlockTableRecipes recipes = new BlockTableRecipes();
    // This creates a HashMap whose Key is a specific, ordered List of Integers
    // If you want multiple outputs from one recipe, change the ItemStack to an ItemStack[]
    // (and of course adjust your TileEntity and Container code)
    private HashMap<List<Integer>, ItemStack[]> result = new HashMap<List<Integer>, ItemStack[]>();

    /**
     * Adds all recipes to the HashMap
     */
    private BlockTableRecipes()
    {
        // Output Lists for Crafting
        ItemStack[] concreteList = {new ItemStack(ModBlocks.concreteBricks),
                new ItemStack(ModBlocks.concreteRocks), new ItemStack(ModBlocks.concreteTexturedBlocks),
                new ItemStack(ModBlocks.concreteSquares), new ItemStack(ModBlocks.concreteBricksDark),
                new ItemStack(ModBlocks.arrangedConcreteBricks), new ItemStack(ModBlocks.fancyConcreteBlocks),
                new ItemStack(ModBlocks.oldConcreteSquares), new ItemStack(ModBlocks.smallConcreteBricks),
                new ItemStack(ModBlocks.smallConcreteTexturedSquares)};

        ItemStack[] metalsList = {new ItemStack(ModBlocks.metalStained),
                new ItemStack(ModBlocks.metalSeafoamTarnish), new ItemStack(ModBlocks.metalBubbleGrip),
                new ItemStack(ModBlocks.metalBatteredRobot), new ItemStack(ModBlocks.metalRustedIronGrip),
                new ItemStack(ModBlocks.metalNeedlepointSteel)};

        // Recipe Lists: output, slot 1 input, slot 2 input
        this.addRecipe(concreteList, new ItemStack(ModBlocks.concrete), new ItemStack(ModItems.crushedConcrete));
        this.addRecipe(metalsList, new ItemStack(ModBlocks.concrete), new ItemStack(Items.iron_ingot));
    }

    /**
     * Used to call methods addRecipe and getCraftingResult.
     */
    public static final BlockTableRecipes recipes()
    {
        return recipes;
    }

    public void addRecipe(ItemStack[] output, ItemStack... inputs)
    {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) {
            inputData.add(stack.getItem().getIdFromItem(stack.getItem()));
        }
        result.put(inputData, output);
    }


    public ItemStack[] getCraftingResult(ItemStack... inputs)
    {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) {
            inputData.add(stack.getItem().getIdFromItem(stack.getItem()));
        }

        return result.get(inputData);
        // return result.get(Arrays.asList(inputData));
    }

    public ItemStack[] getResult(ItemStack[] resultKey)
    {
// count the recipe length so we can make the appropriate sized array
        int recipeLength = 2;
        for (int i = 0; i < resultKey.length && resultKey[i] != null && i < TileEntityBlockTable.OUTPUT_SLOTS_COUNT; ++i) {
// +1 for metadata value of itemstack, add another +1 if you also need the itemID
            ++recipeLength;
        }
// make the array and fill it with the integer values from the passed in ItemStacks
// Note that I'm only using the metadata value as all my resultKey have the same itemID
        Integer[] idIndex = new Integer[recipeLength];
        for (int i = 0; i < recipeLength; ++i) {
// if you need itemID as well put this:
// idIndex[i] = (Integer.valueOf(resultKey[i].itemID));
// be sure to increment i before you do the metadata if you added an itemID
            idIndex[i] = (Integer.valueOf(resultKey[i].getItem().getIdFromItem(resultKey[i].getItem())));
        }
// And use it as the key to get the correct result from the HashMap:
        LogHelper.info("getResult: " + result.get(Arrays.asList(idIndex)));
        return result.get(Arrays.asList(idIndex));
    }

}


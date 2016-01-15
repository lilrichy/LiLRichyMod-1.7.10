package com.blogspot.richardreigens.lilrichymod.recipes;

import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Rich on 12/10/2015.
 */
public class BlockTableRecipes {
    private static final BlockTableRecipes recipes = new BlockTableRecipes();
    private HashMap<List<Integer>, ItemStack[]> result = new HashMap<List<Integer>, ItemStack[]>();

    public BlockTableRecipes() {
        // Output Lists "also add to isCraftableBlock": these lists are what is displayed in the output
        //slots of the Block Table.
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

        ItemStack[] marbleList = {new ItemStack(ModBlocks.marbleBlancoNafin), new ItemStack(ModBlocks.marbleSpottedBianco),
                new ItemStack(ModBlocks.marbleBlancoAurora), new ItemStack(ModBlocks.marbleBlack)};

        ItemStack[] cottageList = {new ItemStack(ModBlocks.cottageWall), new ItemStack(ModBlocks.cottageWallDark),
                new ItemStack(ModBlocks.cottageWallArchedBeam), new ItemStack(ModBlocks.cottageWallArchedBeamDark),
                new ItemStack(ModBlocks.cottageWallPanelLight), new ItemStack(ModBlocks.cottageWallPanelDark),
                new ItemStack(ModBlocks.cottageWallXLight), new ItemStack(ModBlocks.cottageWallXDark),
                new ItemStack(ModBlocks.cottageWindowLight), new ItemStack(ModBlocks.cottageWindowDark)};

        // Recipe Lists: (output, slot 1 input, slot 2 input) this is the recipes for the Block table results
        this.addRecipe(concreteList, new ItemStack(ModBlocks.concrete), new ItemStack(ModItems.crushedConcrete));
        this.addRecipe(metalsList, new ItemStack(ModBlocks.concrete), new ItemStack(Items.iron_ingot));
        this.addRecipe(marbleList, new ItemStack(ModBlocks.concrete), new ItemStack(Blocks.sandstone));
        this.addRecipe(cottageList, new ItemStack(ModBlocks.concrete), new ItemStack(Blocks.planks));

        // Altered Blocks Recipe List "to change any block into any other block in same group"
        for (ItemStack aConcreteList : concreteList) {
            this.addRecipe(concreteList, aConcreteList, new ItemStack(ModItems.crushedConcrete));
        }
        for (ItemStack aMetalsList : metalsList) {
            this.addRecipe(metalsList, aMetalsList, new ItemStack(Items.iron_ingot));
        }
        for (ItemStack aMarbleList : marbleList) {
            this.addRecipe(marbleList, aMarbleList, new ItemStack(Blocks.sandstone));
        }
        for (ItemStack aCottageList : cottageList) {
            this.addRecipe(cottageList, aCottageList, new ItemStack(Blocks.planks));
        }
    }

    //This is used to check if the block can be placed in the first slot.
    public static boolean isCraftableBlock(ItemStack stack) {
        //Lists should be the same as the output lists.
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

        ItemStack[] marbleList = {new ItemStack(ModBlocks.marbleBlancoNafin), new ItemStack(ModBlocks.marbleSpottedBianco),
                new ItemStack(ModBlocks.marbleBlancoAurora), new ItemStack(ModBlocks.marbleBlack)};

        ItemStack[] cottageList = {new ItemStack(ModBlocks.cottageWall), new ItemStack(ModBlocks.cottageWallDark),
                new ItemStack(ModBlocks.cottageWallArchedBeam), new ItemStack(ModBlocks.cottageWallArchedBeamDark),
                new ItemStack(ModBlocks.cottageWallPanelLight), new ItemStack(ModBlocks.cottageWallPanelDark),
                new ItemStack(ModBlocks.cottageWallXLight), new ItemStack(ModBlocks.cottageWallXDark),
                new ItemStack(ModBlocks.cottageWindowLight), new ItemStack(ModBlocks.cottageWindowDark)};

        //Check if valid block
        if (stack != null) {
            if (stack.isItemEqual(new ItemStack(ModBlocks.concrete))) {
                return true;
            }
            for (ItemStack aConcreteList : concreteList) {
                if (stack.isItemEqual(aConcreteList)) {
                    return true;
                }
            }
            for (ItemStack aMetalList : metalsList) {
                if (stack.isItemEqual(aMetalList)) {
                    return true;
                }
            }
            for (ItemStack aMarbleList : marbleList) {
                if (stack.isItemEqual(aMarbleList)) {
                    return true;
                }
            }
            for (ItemStack aCottageList : cottageList) {
                if (stack.isItemEqual(aCottageList)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMaterial(ItemStack stack) {
        if (stack.isItemEqual(new ItemStack(ModItems.crushedConcrete))) {
            return true;
        } else if (stack.isItemEqual(new ItemStack(Items.iron_ingot))) {
            return true;
        } else if (stack.isItemEqual(new ItemStack(Blocks.sandstone))) {
            return true;
        } else return stack.isItemEqual(new ItemStack(Blocks.planks));
    }

    public static final BlockTableRecipes recipes() {
        return recipes;
    }

    public void addRecipe(ItemStack[] output, ItemStack... inputs) {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) {
            inputData.add(stack.getItem().getIdFromItem(stack.getItem()));
        }
        result.put(inputData, output);
    }

    public ItemStack[] getCraftingResult(ItemStack... inputs) {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) {
            inputData.add(stack.getItem().getIdFromItem(stack.getItem()));
        }

        return result.get(inputData);
    }
}
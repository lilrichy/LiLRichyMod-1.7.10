package com.blogspot.richardreigens.lilrichymod.recipes;

import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.init.ModBlocksGlass;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

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

        ItemStack[] metalRobotListColor = {new ItemStack(ModBlocks.metalBatteredRobotBlue),
                new ItemStack(ModBlocks.metalBatteredRobotOrange), new ItemStack(ModBlocks.metalBatteredRobotPurple)};

        ItemStack[] marbleList = {new ItemStack(ModBlocks.marbleBlancoNafin), new ItemStack(ModBlocks.marbleSpottedBianco),
                new ItemStack(ModBlocks.marbleBlancoAurora), new ItemStack(ModBlocks.marbleBlack)};

        ItemStack[] cottageList = {new ItemStack(ModBlocks.cottageWall), new ItemStack(ModBlocks.cottageWallDark),
                new ItemStack(ModBlocks.cottageWallArchedBeam), new ItemStack(ModBlocks.cottageWallArchedBeamDark),
                new ItemStack(ModBlocks.cottageWallPanelLight), new ItemStack(ModBlocks.cottageWallPanelDark),
                new ItemStack(ModBlocks.cottageWallXLight), new ItemStack(ModBlocks.cottageWallXDark),
                new ItemStack(ModBlocks.cottageWindowLight), new ItemStack(ModBlocks.cottageWindowDark)};

        ItemStack[] lavaList = {new ItemStack(ModBlocks.lavaBowl), new ItemStack(ModBlocks.lavaCracks),
                new ItemStack(ModBlocks.lavaDeepFire), new ItemStack(ModBlocks.lavaPelesLake),
                new ItemStack(ModBlocks.lavaSearingGorge), new ItemStack(ModBlocks.lavaVolcano)};

        ItemStack[] lavaBowlListColor = {new ItemStack(ModBlocks.lavaBowlBlue), new ItemStack(ModBlocks.lavaBowlGreen),
                new ItemStack(ModBlocks.lavaBowlPurple)};

        ItemStack[] stoneList = {new ItemStack(ModBlocks.arrangedStoneBricks), new ItemStack(ModBlocks.crackedStone),
                new ItemStack(ModBlocks.stoneBlocks), new ItemStack(ModBlocks.stoneMinerals), new ItemStack(ModBlocks.darkStoneBlocks)};

        ItemStack[] stoneMineralsListColors = {new ItemStack(ModBlocks.stoneMineralsBlue), new ItemStack(ModBlocks.stoneMineralsOrange),
                new ItemStack(ModBlocks.stoneMineralsPurple)};

        ItemStack[] glassList = {new ItemStack(ModBlocksGlass.CLEAR_GLASS_BLUE), new ItemStack(ModBlocksGlass.CLEAR_GLASS_GREEN),
                new ItemStack(ModBlocksGlass.CLEAR_GLASS_PINK), new ItemStack(ModBlocksGlass.CLEAR_GLASS_BROWN),
                new ItemStack(ModBlocksGlass.FROSTY_GLASS_BLUE), new ItemStack(ModBlocksGlass.FROSTY_GLASS_GREEN),
                new ItemStack(ModBlocksGlass.FROSTY_GLASS_PURPLE)};

        // Recipe Lists: (output, slot 1 input, slot 2 input) this is the Main recipes for the Block table
        this.addRecipe(concreteList, new ItemStack(ModBlocks.concrete), new ItemStack(ModItems.crushedConcrete));
        this.addRecipe(metalsList, new ItemStack(ModBlocks.concrete), new ItemStack(Items.iron_ingot));
        this.addRecipe(marbleList, new ItemStack(ModBlocks.concrete), new ItemStack(Blocks.sandstone));
        this.addRecipe(lavaList, new ItemStack(ModBlocks.concrete), new ItemStack(Blocks.netherrack));
        this.addRecipe(stoneList, new ItemStack(ModBlocks.concrete), new ItemStack(Blocks.stone));
        this.addRecipe(lavaBowlListColor, new ItemStack(ModBlocks.lavaBowl), new ItemStack(ModItems.essanceOfBeared));
        this.addRecipe(metalRobotListColor, new ItemStack(ModBlocks.metalBatteredRobot), new ItemStack(ModItems.essanceOfBeared));

        for (ItemStack aPlanks : OreDictionary.getOres("plankWood"))
            this.addRecipe(cottageList, new ItemStack(ModBlocks.concrete), new ItemStack(aPlanks.getItem()));

        //Ore Dictionary Recipes - Allow blocks to convert between similar types.
        for (ItemStack aConcrete : OreDictionary.getOres(Names.OreDicNames.CONCRETE))
            this.addRecipe(concreteList, new ItemStack(aConcrete.getItem()), new ItemStack(ModItems.crushedConcrete));
        for (ItemStack aMetal : OreDictionary.getOres(Names.OreDicNames.METAL))
            this.addRecipe(metalsList, new ItemStack(aMetal.getItem()), new ItemStack(Items.iron_ingot));
        for (ItemStack aMarble : OreDictionary.getOres(Names.OreDicNames.MARBLE))
            this.addRecipe(marbleList, new ItemStack(aMarble.getItem()), new ItemStack(Blocks.sandstone));
        for (ItemStack aLava : OreDictionary.getOres(Names.OreDicNames.LAVA))
            this.addRecipe(lavaList, new ItemStack(aLava.getItem()), new ItemStack(Blocks.netherrack));
        for (ItemStack aStone : OreDictionary.getOres(Names.OreDicNames.STONE))
            this.addRecipe(stoneList, new ItemStack(aStone.getItem()), new ItemStack(Blocks.stone));
        for (ItemStack aLavaBowl : OreDictionary.getOres(Names.OreDicNames.LAVA_BOWL))
            this.addRecipe(lavaBowlListColor, new ItemStack(aLavaBowl.getItem()), new ItemStack(ModItems.essanceOfBeared));
        for (ItemStack aMetalRobot : OreDictionary.getOres(Names.OreDicNames.METAL_ROBOT))
            this.addRecipe(metalRobotListColor, new ItemStack(aMetalRobot.getItem()), new ItemStack(ModItems.essanceOfBeared));
        for (ItemStack aMinerals : OreDictionary.getOres(Names.OreDicNames.STONE_MINERALS))
            this.addRecipe(stoneMineralsListColors, new ItemStack(aMinerals.getItem()), new ItemStack(ModItems.essanceOfBeared));
        for (ItemStack aGlass : OreDictionary.getOres("blockGlass"))
            this.addRecipe(glassList, new ItemStack(aGlass.getItem()), new ItemStack(ModItems.essanceOfBeared));

        for (ItemStack aCottage : OreDictionary.getOres(Names.OreDicNames.COTTAGE)) {
            for (ItemStack aPlanks : OreDictionary.getOres("plankWood"))
                this.addRecipe(cottageList, new ItemStack(aCottage.getItem()), new ItemStack(aPlanks.getItem()));
        }
    }

    //This is used to check if the block can be placed in the first slot.
    public static boolean isCraftableBlock(ItemStack stack) {
        //Check if valid block
        if (stack != null) {
            if (stack.isItemEqual(new ItemStack(ModBlocks.concrete))) return true;

            //Ore Dictionary usage
            for (ItemStack iStack : OreDictionary.getOres("blockGlass"))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.STONE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.STONE_MINERALS))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.CONCRETE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.METAL))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.MARBLE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.COTTAGE))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.LAVA))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.LAVA_BOWL))
                if (iStack.isItemEqual(stack)) return true;
            for (ItemStack iStack : OreDictionary.getOres(Names.OreDicNames.METAL_ROBOT))
                if (iStack.isItemEqual(stack)) return true;
        }
        return false;
    }

    public static boolean isMaterial(ItemStack stack) {
        //Lists of Materials that can be used in the 2nd Slot of the Block Table
        ItemStack[] materialList = {new ItemStack(ModItems.crushedConcrete), new ItemStack(Items.iron_ingot),
                new ItemStack(Blocks.sandstone), new ItemStack(Blocks.netherrack),
                new ItemStack(Blocks.stone), new ItemStack(ModItems.essanceOfBeared)};

        for (ItemStack aMatsList : materialList) if (stack.isItemEqual(aMatsList)) return true;

        for (ItemStack aPlanks : OreDictionary.getOres("plankWood"))
            if (stack.getItem() == aPlanks.getItem()) return true;

        return false;
    }

    public static final BlockTableRecipes recipes() {
        return recipes;
    }

    public void addRecipe(ItemStack[] output, ItemStack... inputs) {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) inputData.add(stack.getItem().getIdFromItem(stack.getItem()));

        result.put(inputData, output);
    }

    public ItemStack[] getCraftingResult(ItemStack... inputs) {
        List<Integer> inputData = new ArrayList<Integer>();
        for (ItemStack stack : inputs) inputData.add(stack.getItem().getIdFromItem(stack.getItem()));

        return result.get(inputData);
    }
}
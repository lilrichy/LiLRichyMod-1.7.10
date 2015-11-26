package com.blogspot.richardreigens.lilrichymod.init;

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
        //DeathSock
        GameRegistry.addRecipe(new ItemStack(ModItems.deathSock), "  w", "  w", "www", 'w', new ItemStack(Blocks.wool));
        GameRegistry.addRecipe(new ItemStack(ModItems.deathSock), "w  ", "w  ", "www", 'w', new ItemStack(Blocks.wool));

        //Fancy Concrete Blocks
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.fancyConcreteBlocks, 4),
                new ItemStack(ModBlocks.concreteBricks), new ItemStack(ModBlocks.concreteBricks),
                new ItemStack(ModBlocks.concreteBricks), new ItemStack(ModBlocks.concreteBricks));

        //Concrete Bricks
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concreteBricks),
                new ItemStack(ModBlocks.concrete), new ItemStack(ModBlocks.concrete),
                new ItemStack(ModBlocks.concrete), new ItemStack(ModBlocks.concrete));

        //Concrete Bricks Dark
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concreteBricksDark, 8), new ItemStack(Items.dye, 1, 0),
                new ItemStack(ModBlocks.smallConcreteBricks), new ItemStack(ModBlocks.smallConcreteBricks),
                new ItemStack(ModBlocks.smallConcreteBricks), new ItemStack(ModBlocks.smallConcreteBricks),
                new ItemStack(ModBlocks.smallConcreteBricks), new ItemStack(ModBlocks.smallConcreteBricks),
                new ItemStack(ModBlocks.smallConcreteBricks), new ItemStack(ModBlocks.smallConcreteBricks));

        //Concrete Rocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.concreteRocks), "cmc", "mcm", "cmc",
                'c', new ItemStack(ModItems.crushedConcrete), 'm', new ItemStack(ModItems.concreteMix));

        //Concrete Squares
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concreteSquares, 4),
                new ItemStack(ModBlocks.concrete), new ItemStack(ModBlocks.concrete), new ItemStack(ModBlocks.concrete),
                new ItemStack(ModBlocks.concrete), new ItemStack(ModBlocks.concrete), new ItemStack(ModBlocks.concrete),
                new ItemStack(ModBlocks.concrete), new ItemStack(ModBlocks.concrete), new ItemStack(ModBlocks.concrete));

        //Concrete Texture Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.concreteTexturedBlocks, 4), "ccc", "cbc", "ccc",
                'c', new ItemStack(ModItems.crushedConcrete), 'b', new ItemStack(ModBlocks.concreteBricks));

        //Old Concrete Squares
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.oldConcreteSquares, 4),
                new ItemStack(ModBlocks.concreteSquares), new ItemStack(ModBlocks.concreteSquares),
                new ItemStack(ModBlocks.concreteSquares), new ItemStack(ModBlocks.concreteSquares));

        //Small Concrete Bricks
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.smallConcreteBricks),
                new ItemStack(ModBlocks.concrete), new ItemStack(ModBlocks.concrete));

        //Small concrete Textured Squares
        GameRegistry.addRecipe(new ItemStack(ModBlocks.smallConcreteTexturedSquares, 4), "ccc", "cbc", "ccc",
                'c', new ItemStack(ModItems.crushedConcrete), 'b', new ItemStack(ModBlocks.concreteSquares));

        //Concrete Mix
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.concreteMix, 4),
                new ItemStack(Blocks.sand), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel),
                new ItemStack(Blocks.cobblestone));

        //Concrete
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concrete),
                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete),
                new ItemStack(ModItems.crushedConcrete), new ItemStack(ModItems.crushedConcrete));

        //Arranged Concrete Bricks
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.arrangedConcreteBricks, 4),
                new ItemStack(ModBlocks.smallConcreteBricks), new ItemStack(ModBlocks.smallConcreteBricks),
                new ItemStack(ModBlocks.smallConcreteBricks), new ItemStack(ModBlocks.smallConcreteBricks));

        //Cracked Stone
        GameRegistry.addRecipe(new ItemStack(ModBlocks.crackedStone, 4), "ccc", "csc", "ccc",
                'c', new ItemStack(Blocks.cobblestone), 's', new ItemStack(Blocks.stone));

        //Arranged Stone Bricks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.arrangedStoneBricks, 4), "bbb", "bsb", "bbb",
                'b', new ItemStack(Blocks.stonebrick), 's', new ItemStack(Blocks.stone));

        //Player Detector
        GameRegistry.addRecipe(new ItemStack(ModBlocks.playerDetector, 1), "ici", "ctc", "ici",
                'i', new ItemStack(Items.iron_ingot), 'c', new ItemStack(Items.comparator), 't', new ItemStack(Blocks.redstone_torch));

        //Advanced Detector
        GameRegistry.addRecipe(new ItemStack(ModBlocks.advancedDetector, 1), "idi", "dtd", "idi",
                'i', new ItemStack(Items.gold_ingot), 'd', new ItemStack(Items.diamond), 't', new ItemStack(ModBlocks.playerDetector));
    }
}

package com.blogspot.richardreigens.lilrichymod.recipes;

import com.blogspot.richardreigens.lilrichymod.init.ModBlocks;
import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Rich on 12/7/2015.
 */
public class DecorativeBlockRecipes {
    public static void init() {
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

        //Small Concrete Textured Squares
        GameRegistry.addRecipe(new ItemStack(ModBlocks.smallConcreteTexturedSquares, 4), "ccc", "cbc", "ccc",
                'c', new ItemStack(ModItems.crushedConcrete), 'b', new ItemStack(ModBlocks.concreteSquares));

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

        //Lava Bowl
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaBowl, 8), "ccc", "cbc", "ccc",
                'c', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Items.lava_bucket));

        //Lava Cracks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaCracks, 8), "ccc", "sbs", "ccc",
                'c', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Items.lava_bucket),
                's', new ItemStack(Blocks.stone));

        //Lava Deep Fire
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaDeepFire, 8), "scs", "cbc", "scs",
                's', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Items.lava_bucket),
                'c', new ItemStack(Blocks.cobblestone));

        //Lava Pele's Lake
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaPelesLake, 8), "csc", "sbs", "csc",
                's', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Items.lava_bucket),
                'c', new ItemStack(Blocks.cobblestone));

        //Lava Searing Gorge
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaSearingGorge, 8), "scs", "cbc", "scs",
                's', new ItemStack(Blocks.netherrack), 'b', new ItemStack(Items.lava_bucket),
                'c', new ItemStack(ModBlocks.concrete));

        //Lava Volcano
        GameRegistry.addRecipe(new ItemStack(ModBlocks.lavaVolcano, 8), "csc", "sbs", "csc",
                's', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Items.lava_bucket),
                'c', new ItemStack(Blocks.cobblestone));

        //Metal Battered Robot
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalBatteredRobot, 8), "scs", "cbc", "scs",
                's', new ItemStack(Blocks.stone), 'b', new ItemStack(Items.iron_ingot),
                'c', new ItemStack(ModBlocks.concrete));

        //Metal Bubble Grip
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalBubbleGrip, 8), "scs", "cbc", "scs",
                's', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Items.iron_ingot),
                'c', new ItemStack(Blocks.cobblestone));

        //Metal Needlepoint Steel
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalNeedlepointSteel, 8), "scs", "cbc", "scs",
                's', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Items.iron_ingot),
                'c', new ItemStack(Blocks.stone));

        //Metal Rusted Iron Grip
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalRustedIronGrip, 8), "scs", "cbc", "scs",
                's', new ItemStack(Blocks.cobblestone), 'b', new ItemStack(Items.iron_ingot),
                'c', new ItemStack(ModBlocks.concrete));

        //Metal Seafoam Tarnish
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalSeafoamTarnish, 8), "scs", "sbs", "scs",
                's', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Items.iron_ingot),
                'c', new ItemStack(Blocks.cobblestone));

        //Metal Stained
        GameRegistry.addRecipe(new ItemStack(ModBlocks.metalStained, 8), "scs", "sbs", "scs",
                's', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Items.iron_ingot),
                'c', new ItemStack(Blocks.stone));

        //Marble Black
        GameRegistry.addRecipe(new ItemStack(ModBlocks.marbleBlack, 8), "scs", "sbs", "scs",
                's', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Blocks.sandstone),
                'c', new ItemStack(Blocks.sand));

        //Marble Blanco Aurora
        GameRegistry.addRecipe(new ItemStack(ModBlocks.marbleBlancoAurora, 8), "scs", "sbs", "scs",
                's', new ItemStack(Blocks.sand), 'b', new ItemStack(Blocks.sandstone),
                'c', new ItemStack(ModBlocks.concrete));

        //Marble Blanco Nafin
        GameRegistry.addRecipe(new ItemStack(ModBlocks.marbleBlancoNafin, 8), "scs", "cbc", "scs",
                's', new ItemStack(Blocks.sand), 'b', new ItemStack(Blocks.sandstone),
                'c', new ItemStack(ModBlocks.concrete));

        //Marble Spotted Bianco
        GameRegistry.addRecipe(new ItemStack(ModBlocks.marbleSpottedBianco, 8), "scs", "cbc", "scs",
                's', new ItemStack(ModBlocks.concrete), 'b', new ItemStack(Blocks.sandstone),
                'c', new ItemStack(Blocks.sand));

        //Cottage wall
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWall, 8), "wcw", "wcw", "wcw",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.concrete));

        //Cottage wall dark
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWallDark, 8), "wcw", "wdw", "wcw",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.concrete),
                'd', new ItemStack(Items.dye, 1, 0));

        //Cottage wall arched beam
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWallArchedBeam, 8), "cwc", "wcw", "ccc",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.cottageWall));

        //Cottage wall arched beam dark
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWallArchedBeamDark, 8), "cwc", "wcw", "ccc",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.cottageWallDark));

        //Cottage wall panelDark
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWallPanelDark, 8), "ccc", "ccc", "www",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.cottageWallDark));

        //Cottage wall panel light
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWallPanelLight, 8), "ccc", "ccc", "www",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.cottageWall));

        //Cottage wall x dark
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWallXDark, 8), "wcw", "cwc", "wcw",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.cottageWallDark));

        //Cottage wall x light
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWallXLight, 8), "wcw", "cwc", "wcw",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.cottageWall));

        //Cottage window dark
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWindowDark, 8), "ccc", "wgw", "ccc",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.cottageWallDark),
                'g', new ItemStack(Blocks.glass_pane));

        //Cottage window light
        GameRegistry.addRecipe(new ItemStack(ModBlocks.cottageWindowLight, 8), "ccc", "wgw", "ccc",
                'w', new ItemStack(Blocks.planks), 'c', new ItemStack(ModBlocks.cottageWall),
                'g', new ItemStack(Blocks.glass_pane));
    }
}

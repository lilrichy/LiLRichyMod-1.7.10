package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.LiLRichyPanel;
import com.blogspot.richardreigens.lilrichymod.blocks.LiLRichyStairs;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.BeardedAzalea;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.CropItemBlock;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.LiLRichyCrop;
import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.BlockConcrete;
import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.DecorativeBlocks;
import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.DecorativeItemBlock;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Rich on 11/19/2015.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    //Crops
    public static final LiLRichyCrop beardedAzalea = new BeardedAzalea(Names.Crops.BEARDED_AZALEA);

    //Decorative Blocks ------------------------------------------------------------------------------------------------

    //LAVA_BOWL
    public static final DecorativeBlocks lavaBowl = new DecorativeBlocks(
            Names.Blocks.LAVA_BOWL, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final LiLRichyStairs lavaBowlStairs = new LiLRichyStairs(Names.Blocks.LAVA_BOWL + "Stairs", lavaBowl, 0);

    public static final DecorativeBlocks lavaBowlBlue = new DecorativeBlocks(
            Names.Blocks.LAVA_BOWL_BLUE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.LAVA_BOWL_COLORS);
    public static final LiLRichyStairs lavaBowlBlueStairs = new LiLRichyStairs(Names.Blocks.LAVA_BOWL_BLUE + "Stairs", lavaBowlBlue, 0);

    public static final DecorativeBlocks lavaBowlGreen = new DecorativeBlocks(
            Names.Blocks.LAVA_BOWL_GREEN, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.LAVA_BOWL_COLORS);
    public static final LiLRichyStairs lavaBowlGreenStairs = new LiLRichyStairs(Names.Blocks.LAVA_BOWL_GREEN + "Stairs", lavaBowlGreen, 0);

    public static final DecorativeBlocks lavaBowlPurple = new DecorativeBlocks(
            Names.Blocks.LAVA_BOWL_PURPLE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.LAVA_BOWL_COLORS);
    public static final LiLRichyStairs lavaBowlPurpleStairs = new LiLRichyStairs(Names.Blocks.LAVA_BOWL_PURPLE + "Stairs", lavaBowlPurple, 0);

    //LAVA_CRACKS
    public static final DecorativeBlocks lavaCracks = new DecorativeBlocks(
            Names.Blocks.LAVA_CRACKS, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final LiLRichyStairs lavaCracksStairs = new LiLRichyStairs(Names.Blocks.LAVA_CRACKS + "Stairs", lavaCracks, 0);

    //LAVA_DEEP_FIRE
    public static final DecorativeBlocks lavaDeepFire = new DecorativeBlocks(
            Names.Blocks.LAVA_DEEP_FIRE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final LiLRichyStairs lavaDeepFireStairs = new LiLRichyStairs(Names.Blocks.LAVA_DEEP_FIRE + "Stairs", lavaDeepFire, 0);

    //LAVA_PELES_LAKE
    public static final DecorativeBlocks lavaPelesLake = new DecorativeBlocks(
            Names.Blocks.LAVA_PELES_LAKE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final LiLRichyStairs lavaPelesLakeStairs = new LiLRichyStairs(Names.Blocks.LAVA_PELES_LAKE + "Stairs", lavaPelesLake, 0);

    //LAVA_SEARING_GORGE
    public static final DecorativeBlocks lavaSearingGorge = new DecorativeBlocks(
            Names.Blocks.LAVA_SEARING_GORGE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final LiLRichyStairs lavaSearingGorgeStairs = new LiLRichyStairs(Names.Blocks.LAVA_SEARING_GORGE + "Stairs", lavaSearingGorge, 0);

    //LAVA_SLUMBERING_VOLCANO
    public static final DecorativeBlocks lavaVolcano = new DecorativeBlocks(
            Names.Blocks.LAVA_SLUMBERING_VOLCANO, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final LiLRichyStairs lavaVolcanoStairs = new LiLRichyStairs(Names.Blocks.LAVA_SLUMBERING_VOLCANO + "Stairs", lavaVolcano, 0);

    //METAL_BATTERED_ROBOT
    public static final DecorativeBlocks metalBatteredRobot = new DecorativeBlocks(
            Names.Blocks.METAL_BATTERED_ROBOT, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final LiLRichyStairs metalBatteredRobotStairs = new LiLRichyStairs(Names.Blocks.METAL_BATTERED_ROBOT + "Stairs", metalBatteredRobot, 0);

    public static final DecorativeBlocks metalBatteredRobotBlue = new DecorativeBlocks(
            Names.Blocks.METAL_BATTERED_ROBOT_BLUE, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.METAL_ROBOT_COLORS);
    public static final LiLRichyStairs metalBatteredRobotBlueStairs = new LiLRichyStairs(Names.Blocks.METAL_BATTERED_ROBOT_BLUE + "Stairs", metalBatteredRobotBlue, 0);

    public static final DecorativeBlocks metalBatteredRobotOrange = new DecorativeBlocks(
            Names.Blocks.METAL_BATTERED_ROBOT_ORANGE, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.METAL_ROBOT_COLORS);
    public static final LiLRichyStairs metalBatteredRobotOrangeStairs = new LiLRichyStairs(Names.Blocks.METAL_BATTERED_ROBOT_ORANGE + "Stairs", metalBatteredRobotOrange, 0);

    public static final DecorativeBlocks metalBatteredRobotPurple = new DecorativeBlocks(
            Names.Blocks.METAL_BATTERED_ROBOT_PURPLE, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.METAL_ROBOT_COLORS);
    public static final LiLRichyStairs metalBatteredRobotPurpleStairs = new LiLRichyStairs(Names.Blocks.METAL_BATTERED_ROBOT_PURPLE + "Stairs", metalBatteredRobotPurple, 0);

    //METAL_BATTERED_ROBOT_BLUE
    public static final DecorativeBlocks metalBubbleGrip = new DecorativeBlocks(
            Names.Blocks.METAL_BUBBLE_GRIP, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final LiLRichyStairs metalBubbleGripStairs = new LiLRichyStairs(Names.Blocks.METAL_BUBBLE_GRIP + "Stairs", metalBubbleGrip, 0);

    //METAL_NEEDLEPOINT_STEEL
    public static final DecorativeBlocks metalNeedlepointSteel = new DecorativeBlocks(
            Names.Blocks.METAL_NEEDLEPOINT_STEEL, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final LiLRichyStairs metalNeedlepointSteelStairs = new LiLRichyStairs(Names.Blocks.METAL_NEEDLEPOINT_STEEL + "Stairs", metalNeedlepointSteel, 0);

    //METAL_RUSTED_IRON_GRIP
    public static final DecorativeBlocks metalRustedIronGrip = new DecorativeBlocks(
            Names.Blocks.METAL_RUSTED_IRON_GRIP, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final LiLRichyStairs metalRustedIronGripStairs = new LiLRichyStairs(Names.Blocks.METAL_RUSTED_IRON_GRIP + "Stairs", metalRustedIronGrip, 0);

    //METAL_SEAFOAM_TARNISH
    public static final DecorativeBlocks metalSeafoamTarnish = new DecorativeBlocks(
            Names.Blocks.METAL_SEAFOAM_TARNISH, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final LiLRichyStairs metalSeafoamTarnishStairs = new LiLRichyStairs(Names.Blocks.METAL_SEAFOAM_TARNISH + "Stairs", metalSeafoamTarnish, 0);

    //METAL_STAINED
    public static final DecorativeBlocks metalStained = new DecorativeBlocks(
            Names.Blocks.METAL_STAINED, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final LiLRichyStairs metalStainedStairs = new LiLRichyStairs(Names.Blocks.METAL_STAINED + "Stairs", metalStained, 0);

    //MARBLE_BLACK
    public static final DecorativeBlocks marbleBlack = new DecorativeBlocks(
            Names.Blocks.MARBLE_BLACK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.MARBLE_BLOCKS);
    public static final LiLRichyStairs marbleBlackStairs = new LiLRichyStairs(Names.Blocks.MARBLE_BLACK + "Stairs", marbleBlack, 0);

    //MARBLE_BLANCO_AURORA
    public static final DecorativeBlocks marbleBlancoAurora = new DecorativeBlocks(
            Names.Blocks.MARBLE_BLANCO_AURORA, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.MARBLE_BLOCKS);
    public static final LiLRichyStairs marbleBlancoAuroraStairs = new LiLRichyStairs(Names.Blocks.MARBLE_BLANCO_AURORA + "Stairs", marbleBlancoAurora, 0);

    //MARBLE_BLANCO_NAFIN
    public static final DecorativeBlocks marbleBlancoNafin = new DecorativeBlocks(
            Names.Blocks.MARBLE_BLANCO_NAFIN, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.MARBLE_BLOCKS);
    public static final LiLRichyStairs marbleBlancoNafinStairs = new LiLRichyStairs(Names.Blocks.MARBLE_BLANCO_NAFIN + "Stairs", marbleBlancoNafin, 0);

    //MARBLE_SPOTTED_BIANCO
    public static final DecorativeBlocks marbleSpottedBianco = new DecorativeBlocks(
            Names.Blocks.MARBLE_SPOTTED_BIANCO, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.MARBLE_BLOCKS);
    public static final LiLRichyStairs marbleSpottedBiancoStairs = new LiLRichyStairs(Names.Blocks.MARBLE_SPOTTED_BIANCO + "Stairs", marbleSpottedBianco, 0);

    //COTTAGE - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWall = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //COTTAGE_WALL_ARCHED_BEAM - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWallArchedBeam = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_ARCHED_BEAM, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //COTTAGE_WALL_ARCHED_BEAM_DARK - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWallArchedBeamDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_ARCHED_BEAM_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //COTTAGE_WALL_DARK - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWallDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //COTTAGE_WALL_PANEL_DARK - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWallPanelDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_PANEL_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //COTTAGE_WALL_PANEL_LIGHT - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWallPanelLight = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_PANEL_LIGHT, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //COTTAGE_WALL_X_DARK - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWallXDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_X_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //COTTAGE_WALL_X_LIGHT - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWallXLight = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_X_LIGHT, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //COTTAGE_WINDOW_DARK - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWindowDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WINDOW_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //COTTAGE_WINDOW_LIGHT - Skipping Stairs and slabs
    public static final DecorativeBlocks cottageWindowLight = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WINDOW_LIGHT, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //CONCRETE - Skipping Stairs and slabs
    public static final BlockConcrete concrete = new BlockConcrete(
            Names.Blocks.CONCRETE, Material.rock);

    //FANCY_CONCRETE_BLOCKS
    public static final DecorativeBlocks fancyConcreteBlocks = new DecorativeBlocks(
            Names.Blocks.FANCY_CONCRETE_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs fancyConcreteBlocksStairs = new LiLRichyStairs(Names.Blocks.FANCY_CONCRETE_BLOCKS + "Stairs", fancyConcreteBlocks, 0);

    //CONCRETE_BRICKS
    public static final DecorativeBlocks concreteBricks = new DecorativeBlocks(
            Names.Blocks.CONCRETE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs concreteBricksStairs = new LiLRichyStairs(Names.Blocks.CONCRETE_BRICKS + "Stairs", concreteBricks, 0);

    //CONCRETE_BRICKS_DARK
    public static final DecorativeBlocks concreteBricksDark = new DecorativeBlocks(
            Names.Blocks.CONCRETE_BRICKS_DARK, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs concreteBricksDarkStairs = new LiLRichyStairs(Names.Blocks.CONCRETE_BRICKS_DARK + "Stairs", concreteBricksDark, 0);

    //CONCRETE_ROCKS
    public static final DecorativeBlocks concreteRocks = new DecorativeBlocks(
            Names.Blocks.CONCRETE_ROCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs concreteRocksStairs = new LiLRichyStairs(Names.Blocks.CONCRETE_ROCKS + "Stairs", concreteRocks, 0);

    //CONCRETE_TEXTURED_BLOCKS
    public static final DecorativeBlocks concreteTexturedBlocks = new DecorativeBlocks(
            Names.Blocks.CONCRETE_TEXTURED_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs concreteTexturedBlocksStairs = new LiLRichyStairs(Names.Blocks.CONCRETE_TEXTURED_BLOCKS + "Stairs", concreteTexturedBlocks, 0);

    //OLD_CONCRETE_SQUARES
    public static final DecorativeBlocks oldConcreteSquares = new DecorativeBlocks(
            Names.Blocks.OLD_CONCRETE_SQUARES, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs oldConcreteSquaresStairs = new LiLRichyStairs(Names.Blocks.OLD_CONCRETE_SQUARES + "Stairs", oldConcreteSquares, 0);

    //CONCRETE_SQUARES
    public static final DecorativeBlocks concreteSquares = new DecorativeBlocks(
            Names.Blocks.CONCRETE_SQUARES, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs concreteSquaresStairs = new LiLRichyStairs(Names.Blocks.CONCRETE_SQUARES + "Stairs", concreteSquares, 0);

    //SMALL_CONCRETE_BRICKS
    public static final DecorativeBlocks smallConcreteBricks = new DecorativeBlocks(
            Names.Blocks.SMALL_CONCRETE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs smallConcreteBricksStairs = new LiLRichyStairs(Names.Blocks.SMALL_CONCRETE_BRICKS + "Stairs", smallConcreteBricks, 0);

    //SMALL_CONCRETE_TEXTURED_SQUARES
    public static final DecorativeBlocks smallConcreteTexturedSquares = new DecorativeBlocks(
            Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs smallConcreteTexturedSquaresStairs = new LiLRichyStairs(Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES + "Stairs", smallConcreteTexturedSquares, 0);

    //ARRANGED_CONCRETE_BRICKS
    public static final DecorativeBlocks arrangedConcreteBricks = new DecorativeBlocks(
            Names.Blocks.ARRANGED_CONCRETE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final LiLRichyStairs arrangedConcreteBricksStairs = new LiLRichyStairs(Names.Blocks.ARRANGED_CONCRETE_BRICKS + "Stairs", arrangedConcreteBricks, 0);

    //CRACKED_STONE
    public static final DecorativeBlocks crackedStone = new DecorativeBlocks(
            Names.Blocks.CRACKED_STONE, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);
    public static final LiLRichyStairs crackedStoneStairs = new LiLRichyStairs(Names.Blocks.CRACKED_STONE + "Stairs", crackedStone, 0);

    //ARRANGED_STONE_BRICKS
    public static final DecorativeBlocks arrangedStoneBricks = new DecorativeBlocks(
            Names.Blocks.ARRANGED_STONE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);
    public static final LiLRichyStairs arrangedStoneBricksStairs = new LiLRichyStairs(Names.Blocks.ARRANGED_STONE_BRICKS + "Stairs", arrangedStoneBricks, 0);

    //STONE_BLOCKS
    public static final DecorativeBlocks stoneBlocks = new DecorativeBlocks(
            Names.Blocks.STONE_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);
    public static final LiLRichyStairs stoneBlocksStairs = new LiLRichyStairs(Names.Blocks.STONE_BLOCKS + "Stairs", stoneBlocks, 0);

    //DARK_STONE_BLOCKS
    public static final DecorativeBlocks darkStoneBlocks = new DecorativeBlocks(
            Names.Blocks.DARK_STONE_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);
    public static final LiLRichyStairs darkStoneBlocksStairs = new LiLRichyStairs(Names.Blocks.DARK_STONE_BLOCKS + "Stairs", darkStoneBlocks, 0);

    //STONE_MINERALS
    public static final DecorativeBlocks stoneMinerals = new DecorativeBlocks(
            Names.Blocks.STONE_MINERALS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);
    public static final LiLRichyStairs stoneMineralsStairs = new LiLRichyStairs(Names.Blocks.STONE_MINERALS + "Stairs", stoneMinerals, 0);

    public static final DecorativeBlocks stoneMineralsBlue = new DecorativeBlocks(
            Names.Blocks.STONE_MINERALS_BLUE, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.STONE_MINERALS_COLORS_CRAFT);
    public static final LiLRichyStairs stoneMineralsBlueStairs = new LiLRichyStairs(Names.Blocks.STONE_MINERALS_BLUE + "Stairs", stoneMineralsBlue, 0);

    public static final DecorativeBlocks stoneMineralsOrange = new DecorativeBlocks(
            Names.Blocks.STONE_MINERALS_ORANGE, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.STONE_MINERALS_COLORS_CRAFT);
    public static final LiLRichyStairs stoneMineralsOrangeStairs = new LiLRichyStairs(Names.Blocks.STONE_MINERALS_ORANGE + "Stairs", stoneMineralsOrange, 0);

    public static final DecorativeBlocks stoneMineralsPurple = new DecorativeBlocks(
            Names.Blocks.STONE_MINERALS_PURPLE, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.STONE_MINERALS_COLORS_CRAFT);
    public static final LiLRichyStairs stoneMineralsPurpleStairs = new LiLRichyStairs(Names.Blocks.STONE_MINERALS_PURPLE + "Stairs", stoneMineralsPurple, 0);

    //Panels
    public static final LiLRichyPanel acaciaPanel = new LiLRichyPanel(Names.Panels.ACACIA_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel big_oakPanel = new LiLRichyPanel(Names.Panels.BIG_OAK_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel birchPanel = new LiLRichyPanel(Names.Panels.BIRCH_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel junglePanel = new LiLRichyPanel(Names.Panels.JUNGLE_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel oakPanel = new LiLRichyPanel(Names.Panels.OAK_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel sprucePanel = new LiLRichyPanel(Names.Panels.SPRUCE_PANEL, "Side", "Top", Material.wood, true);

    public static final LiLRichyPanel log_acaciaPanel = new LiLRichyPanel(Names.Panels.LOG_ACACIA_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_big_oakPanel = new LiLRichyPanel(Names.Panels.LOG_BIG_OAK_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_birchPanel = new LiLRichyPanel(Names.Panels.LOG_BIRCH_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_junglePanel = new LiLRichyPanel(Names.Panels.LOG_JUNGLE_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_oakPanel = new LiLRichyPanel(Names.Panels.LOG_OAK_PANEL, "Side", "Top", Material.wood, true);
    public static final LiLRichyPanel log_sprucePanel = new LiLRichyPanel(Names.Panels.LOG_SPRUCE_PANEL, "Side", "Top", Material.wood, true);

    public static void init() {
        //Crops
        GameRegistry.registerBlock(beardedAzalea, CropItemBlock.class, Names.Crops.BEARDED_AZALEA);

        //Decorative Blocks---------------------------------------------------------------------------------------------

        //LAVA_BOWL
        GameRegistry.registerBlock(lavaBowl, DecorativeItemBlock.class, Names.Blocks.LAVA_BOWL);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, lavaBowl);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaBowl);
        OreDictionary.registerOre(Names.OreDicNames.LAVA_BOWL, lavaBowl);
        GameRegistry.registerBlock(lavaBowlStairs, Names.Blocks.LAVA_BOWL + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, lavaBowlStairs);

        GameRegistry.registerBlock(lavaBowlBlue, DecorativeItemBlock.class, Names.Blocks.LAVA_BOWL_BLUE);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, lavaBowlBlue);
        OreDictionary.registerOre(Names.OreDicNames.LAVA_BOWL, lavaBowlBlue);
        GameRegistry.registerBlock(lavaBowlBlueStairs, Names.Blocks.LAVA_BOWL_BLUE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, lavaBowlBlueStairs);

        GameRegistry.registerBlock(lavaBowlGreen, DecorativeItemBlock.class, Names.Blocks.LAVA_BOWL_GREEN);
        OreDictionary.registerOre(Names.OreDicNames.LAVA_BOWL, lavaBowlGreen);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, lavaBowlGreen);
        GameRegistry.registerBlock(lavaBowlGreenStairs, Names.Blocks.LAVA_BOWL_GREEN + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, lavaBowlGreenStairs);

        GameRegistry.registerBlock(lavaBowlPurple, DecorativeItemBlock.class, Names.Blocks.LAVA_BOWL_PURPLE);
        OreDictionary.registerOre(Names.OreDicNames.LAVA_BOWL, lavaBowlPurple);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, lavaBowlPurple);
        GameRegistry.registerBlock(lavaBowlPurpleStairs, Names.Blocks.LAVA_BOWL_PURPLE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, lavaBowlPurpleStairs);

        //LAVA_CRACKS
        GameRegistry.registerBlock(lavaCracks, DecorativeItemBlock.class, Names.Blocks.LAVA_CRACKS);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaCracks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, lavaCracks);
        GameRegistry.registerBlock(lavaCracksStairs, Names.Blocks.LAVA_CRACKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, lavaCracksStairs);

        //LAVA_DEEP_FIRE
        GameRegistry.registerBlock(lavaDeepFire, DecorativeItemBlock.class, Names.Blocks.LAVA_DEEP_FIRE);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaDeepFire);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, lavaDeepFire);
        GameRegistry.registerBlock(lavaDeepFireStairs, Names.Blocks.LAVA_DEEP_FIRE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, lavaDeepFireStairs);

        //LAVA_PELES_LAKE
        GameRegistry.registerBlock(lavaPelesLake, DecorativeItemBlock.class, Names.Blocks.LAVA_PELES_LAKE);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaPelesLake);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, lavaPelesLake);
        GameRegistry.registerBlock(lavaPelesLakeStairs, Names.Blocks.LAVA_PELES_LAKE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, lavaPelesLakeStairs);

        //LAVA_SEARING_GORGE
        GameRegistry.registerBlock(lavaSearingGorge, DecorativeItemBlock.class, Names.Blocks.LAVA_SEARING_GORGE);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaSearingGorge);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, lavaSearingGorge);
        GameRegistry.registerBlock(lavaSearingGorgeStairs, Names.Blocks.LAVA_SEARING_GORGE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, lavaSearingGorgeStairs);

        //LAVA_SLUMBERING_VOLCANO
        GameRegistry.registerBlock(lavaVolcano, DecorativeItemBlock.class, Names.Blocks.LAVA_SLUMBERING_VOLCANO);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaVolcano);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, lavaVolcano);
        GameRegistry.registerBlock(lavaVolcanoStairs, Names.Blocks.LAVA_SLUMBERING_VOLCANO + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, lavaVolcanoStairs);

        //METAL_BATTERED_ROBOT
        GameRegistry.registerBlock(metalBatteredRobot, DecorativeItemBlock.class, Names.Blocks.METAL_BATTERED_ROBOT);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBatteredRobot);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, metalBatteredRobot);
        OreDictionary.registerOre(Names.OreDicNames.METAL_ROBOT, metalBatteredRobot);
        GameRegistry.registerBlock(metalBatteredRobotStairs, Names.Blocks.METAL_BATTERED_ROBOT + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, metalBatteredRobotStairs);

        GameRegistry.registerBlock(metalBatteredRobotBlue, DecorativeItemBlock.class, Names.Blocks.METAL_BATTERED_ROBOT_BLUE);
        OreDictionary.registerOre(Names.OreDicNames.METAL_ROBOT, metalBatteredRobotBlue);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, metalBatteredRobotBlue);
        GameRegistry.registerBlock(metalBatteredRobotBlueStairs, Names.Blocks.METAL_BATTERED_ROBOT_BLUE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, metalBatteredRobotBlueStairs);

        GameRegistry.registerBlock(metalBatteredRobotOrange, DecorativeItemBlock.class, Names.Blocks.METAL_BATTERED_ROBOT_ORANGE);
        OreDictionary.registerOre(Names.OreDicNames.METAL_ROBOT, metalBatteredRobotOrange);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, metalBatteredRobotOrange);
        GameRegistry.registerBlock(metalBatteredRobotOrangeStairs, Names.Blocks.METAL_BATTERED_ROBOT_ORANGE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, metalBatteredRobotOrangeStairs);

        GameRegistry.registerBlock(metalBatteredRobotPurple, DecorativeItemBlock.class, Names.Blocks.METAL_BATTERED_ROBOT_PURPLE);
        OreDictionary.registerOre(Names.OreDicNames.METAL_ROBOT, metalBatteredRobotPurple);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, metalBatteredRobotPurple);
        GameRegistry.registerBlock(metalBatteredRobotPurpleStairs, Names.Blocks.METAL_BATTERED_ROBOT_PURPLE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, metalBatteredRobotPurpleStairs);

        //METAL_BUBBLE_GRIP
        GameRegistry.registerBlock(metalBubbleGrip, DecorativeItemBlock.class, Names.Blocks.METAL_BUBBLE_GRIP);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBubbleGrip);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, metalBubbleGrip);
        GameRegistry.registerBlock(metalBubbleGripStairs, Names.Blocks.METAL_BUBBLE_GRIP + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, metalBubbleGripStairs);

        //METAL_NEEDLEPOINT_STEEL
        GameRegistry.registerBlock(metalNeedlepointSteel, DecorativeItemBlock.class, Names.Blocks.METAL_NEEDLEPOINT_STEEL);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalNeedlepointSteel);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, metalNeedlepointSteel);
        GameRegistry.registerBlock(metalNeedlepointSteelStairs, Names.Blocks.METAL_NEEDLEPOINT_STEEL + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, metalNeedlepointSteelStairs);

        //METAL_RUSTED_IRON_GRIP
        GameRegistry.registerBlock(metalRustedIronGrip, DecorativeItemBlock.class, Names.Blocks.METAL_RUSTED_IRON_GRIP);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalRustedIronGrip);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, metalRustedIronGrip);
        GameRegistry.registerBlock(metalRustedIronGripStairs, Names.Blocks.METAL_RUSTED_IRON_GRIP + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, metalRustedIronGripStairs);

        //METAL_SEAFOAM_TARNISH
        GameRegistry.registerBlock(metalSeafoamTarnish, DecorativeItemBlock.class, Names.Blocks.METAL_SEAFOAM_TARNISH);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalSeafoamTarnish);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, metalSeafoamTarnish);
        GameRegistry.registerBlock(metalSeafoamTarnishStairs, Names.Blocks.METAL_SEAFOAM_TARNISH + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, metalSeafoamTarnishStairs);

        //METAL_STAINED
        GameRegistry.registerBlock(metalStained, DecorativeItemBlock.class, Names.Blocks.METAL_STAINED);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalStained);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, metalStained);
        GameRegistry.registerBlock(metalStainedStairs, Names.Blocks.METAL_STAINED + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, metalStainedStairs);

        //Marble
        GameRegistry.registerBlock(marbleBlack, DecorativeItemBlock.class, Names.Blocks.MARBLE_BLACK);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleBlack);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, marbleBlack);
        GameRegistry.registerBlock(marbleBlackStairs, Names.Blocks.MARBLE_BLACK + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, marbleBlackStairs);

        //MARBLE_BLANCO_AURORA
        GameRegistry.registerBlock(marbleBlancoAurora, DecorativeItemBlock.class, Names.Blocks.MARBLE_BLANCO_AURORA);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleBlancoAurora);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, marbleBlancoAurora);
        GameRegistry.registerBlock(marbleBlancoAuroraStairs, Names.Blocks.MARBLE_BLANCO_AURORA + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, marbleBlancoAuroraStairs);

        //MARBLE_BLANCO_NAFIN
        GameRegistry.registerBlock(marbleBlancoNafin, DecorativeItemBlock.class, Names.Blocks.MARBLE_BLANCO_NAFIN);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleBlancoNafin);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, marbleBlancoNafin);
        GameRegistry.registerBlock(marbleBlancoNafinStairs, Names.Blocks.MARBLE_BLANCO_NAFIN + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, marbleBlancoNafinStairs);

        //MARBLE_SPOTTED_BIANCO
        GameRegistry.registerBlock(marbleSpottedBianco, DecorativeItemBlock.class, Names.Blocks.MARBLE_SPOTTED_BIANCO);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleSpottedBianco);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, marbleSpottedBianco);
        GameRegistry.registerBlock(marbleSpottedBiancoStairs, Names.Blocks.MARBLE_SPOTTED_BIANCO + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, marbleSpottedBiancoStairs);

        //COTTAGE_WALL
        GameRegistry.registerBlock(cottageWall, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWall);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWall);

        //COTTAGE_WALL_ARCHED_BEAM
        GameRegistry.registerBlock(cottageWallArchedBeam, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_ARCHED_BEAM);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallArchedBeam);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWallArchedBeam);

        //COTTAGE_WALL_ARCHED_BEAM_DARK
        GameRegistry.registerBlock(cottageWallArchedBeamDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_ARCHED_BEAM_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallArchedBeamDark);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWallArchedBeamDark);

        //COTTAGE_WALL_DARK
        GameRegistry.registerBlock(cottageWallDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallDark);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWallDark);

        //COTTAGE_WALL_PANEL_DARK
        GameRegistry.registerBlock(cottageWallPanelDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_PANEL_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallPanelDark);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWallPanelDark);

        //COTTAGE_WALL_PANEL_LIGHT
        GameRegistry.registerBlock(cottageWallPanelLight, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_PANEL_LIGHT);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallPanelLight);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWallPanelLight);

        //COTTAGE_WALL_X_DARK
        GameRegistry.registerBlock(cottageWallXDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_X_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallXDark);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWallXDark);

        //COTTAGE_WALL_X_LIGHT
        GameRegistry.registerBlock(cottageWallXLight, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_X_LIGHT);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallXLight);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWallXLight);

        //COTTAGE_WINDOW_DARK
        GameRegistry.registerBlock(cottageWindowDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WINDOW_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWindowDark);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWindowDark);

        //COTTAGE_WINDOW_LIGHT
        GameRegistry.registerBlock(cottageWindowLight, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WINDOW_LIGHT);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWindowLight);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, cottageWindowLight);

        //CONCRETE
        GameRegistry.registerBlock(concrete, DecorativeItemBlock.class, Names.Blocks.CONCRETE);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concrete);

        //FANCY_CONCRETE_BLOCKS
        GameRegistry.registerBlock(fancyConcreteBlocks, DecorativeItemBlock.class, Names.Blocks.FANCY_CONCRETE_BLOCKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, fancyConcreteBlocks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, fancyConcreteBlocks);
        GameRegistry.registerBlock(fancyConcreteBlocksStairs, Names.Blocks.FANCY_CONCRETE_BLOCKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, fancyConcreteBlocksStairs);

        //CONCRETE_BRICKS
        GameRegistry.registerBlock(concreteBricks, DecorativeItemBlock.class, Names.Blocks.CONCRETE_BRICKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteBricks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, concreteBricks);
        GameRegistry.registerBlock(concreteBricksStairs, Names.Blocks.CONCRETE_BRICKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, concreteBricksStairs);

        //CONCRETE_BRICKS_DARK
        GameRegistry.registerBlock(concreteBricksDark, DecorativeItemBlock.class, Names.Blocks.CONCRETE_BRICKS_DARK);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteBricksDark);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, concreteBricksDark);
        GameRegistry.registerBlock(concreteBricksDarkStairs, Names.Blocks.CONCRETE_BRICKS_DARK + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, concreteBricksDarkStairs);

        //CONCRETE_ROCKS
        GameRegistry.registerBlock(concreteRocks, DecorativeItemBlock.class, Names.Blocks.CONCRETE_ROCKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteRocks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, concreteRocks);
        GameRegistry.registerBlock(concreteRocksStairs, Names.Blocks.CONCRETE_ROCKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, concreteRocksStairs);

        //CONCRETE_TEXTURED_BLOCKS
        GameRegistry.registerBlock(concreteTexturedBlocks, DecorativeItemBlock.class, Names.Blocks.CONCRETE_TEXTURED_BLOCKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteTexturedBlocks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, concreteTexturedBlocks);
        GameRegistry.registerBlock(concreteTexturedBlocksStairs, Names.Blocks.CONCRETE_TEXTURED_BLOCKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, concreteTexturedBlocksStairs);

        //OLD_CONCRETE_SQUARES
        GameRegistry.registerBlock(oldConcreteSquares, DecorativeItemBlock.class, Names.Blocks.OLD_CONCRETE_SQUARES);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, oldConcreteSquares);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, oldConcreteSquares);
        GameRegistry.registerBlock(oldConcreteSquaresStairs, Names.Blocks.OLD_CONCRETE_SQUARES + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, oldConcreteSquaresStairs);

        //CONCRETE_SQUARES
        GameRegistry.registerBlock(concreteSquares, DecorativeItemBlock.class, Names.Blocks.CONCRETE_SQUARES);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteSquares);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, concreteSquares);
        GameRegistry.registerBlock(concreteSquaresStairs, Names.Blocks.CONCRETE_SQUARES + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, concreteSquaresStairs);

        //SMALL_CONCRETE_BRICKS
        GameRegistry.registerBlock(smallConcreteBricks, DecorativeItemBlock.class, Names.Blocks.SMALL_CONCRETE_BRICKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, smallConcreteBricks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, smallConcreteBricks);
        GameRegistry.registerBlock(smallConcreteBricksStairs, Names.Blocks.SMALL_CONCRETE_BRICKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, smallConcreteBricksStairs);

        //SMALL_CONCRETE_TEXTURED_SQUARES
        GameRegistry.registerBlock(smallConcreteTexturedSquares, DecorativeItemBlock.class, Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, smallConcreteTexturedSquares);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, smallConcreteTexturedSquares);
        GameRegistry.registerBlock(smallConcreteTexturedSquaresStairs, Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, smallConcreteTexturedSquaresStairs);

        //ARRANGED_CONCRETE_BRICKS
        GameRegistry.registerBlock(arrangedConcreteBricks, DecorativeItemBlock.class, Names.Blocks.ARRANGED_CONCRETE_BRICKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, arrangedConcreteBricks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, arrangedConcreteBricks);
        GameRegistry.registerBlock(arrangedConcreteBricksStairs, Names.Blocks.ARRANGED_CONCRETE_BRICKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, arrangedConcreteBricksStairs);

        //CRACKED_STONE
        GameRegistry.registerBlock(crackedStone, DecorativeItemBlock.class, Names.Blocks.CRACKED_STONE);
        OreDictionary.registerOre(Names.OreDicNames.STONE, crackedStone);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, crackedStone);
        GameRegistry.registerBlock(crackedStoneStairs, Names.Blocks.CRACKED_STONE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, crackedStoneStairs);

        //ARRANGED_STONE_BRICKS
        GameRegistry.registerBlock(arrangedStoneBricks, DecorativeItemBlock.class, Names.Blocks.ARRANGED_STONE_BRICKS);
        OreDictionary.registerOre(Names.OreDicNames.STONE, arrangedStoneBricks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, arrangedStoneBricks);
        GameRegistry.registerBlock(arrangedStoneBricksStairs, Names.Blocks.ARRANGED_STONE_BRICKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, arrangedStoneBricksStairs);

        //STONE_BLOCKS
        GameRegistry.registerBlock(stoneBlocks, DecorativeItemBlock.class, Names.Blocks.STONE_BLOCKS);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneBlocks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, stoneBlocks);
        GameRegistry.registerBlock(stoneBlocksStairs, Names.Blocks.STONE_BLOCKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, stoneBlocksStairs);

        //DARK_STONE_BLOCKS
        GameRegistry.registerBlock(darkStoneBlocks, DecorativeItemBlock.class, Names.Blocks.DARK_STONE_BLOCKS);
        OreDictionary.registerOre(Names.OreDicNames.STONE, darkStoneBlocks);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, darkStoneBlocks);
        GameRegistry.registerBlock(darkStoneBlocksStairs, Names.Blocks.DARK_STONE_BLOCKS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, darkStoneBlocksStairs);

        //STONE_MINERALS
        GameRegistry.registerBlock(stoneMinerals, DecorativeItemBlock.class, Names.Blocks.STONE_MINERALS);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneMinerals);
        OreDictionary.registerOre(Names.OreDicNames.STONE_MINERALS, stoneMinerals);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, stoneMinerals);
        GameRegistry.registerBlock(stoneMineralsStairs, Names.Blocks.STONE_MINERALS + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, stoneMineralsStairs);

        GameRegistry.registerBlock(stoneMineralsBlue, DecorativeItemBlock.class, Names.Blocks.STONE_MINERALS_BLUE);
        OreDictionary.registerOre(Names.OreDicNames.STONE_MINERALS, stoneMineralsBlue);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, stoneMineralsBlue);
        GameRegistry.registerBlock(stoneMineralsBlueStairs, Names.Blocks.STONE_MINERALS_BLUE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, stoneMineralsBlueStairs);

        GameRegistry.registerBlock(stoneMineralsOrange, DecorativeItemBlock.class, Names.Blocks.STONE_MINERALS_ORANGE);
        OreDictionary.registerOre(Names.OreDicNames.STONE_MINERALS, stoneMineralsOrange);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, stoneMineralsOrange);
        GameRegistry.registerBlock(stoneMineralsOrangeStairs, Names.Blocks.STONE_MINERALS_ORANGE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, stoneMineralsOrangeStairs);

        GameRegistry.registerBlock(stoneMineralsPurple, DecorativeItemBlock.class, Names.Blocks.STONE_MINERALS_PURPLE);
        OreDictionary.registerOre(Names.OreDicNames.STONE_MINERALS, stoneMineralsPurple);
        OreDictionary.registerOre(Names.OreDicNames.SMELT_TO_CONCRETE, stoneMineralsPurple);
        GameRegistry.registerBlock(stoneMineralsPurpleStairs, Names.Blocks.STONE_MINERALS_PURPLE + "Stairs");
        OreDictionary.registerOre(Names.OreDicNames.STAIRS, stoneMineralsPurpleStairs);

        //Panels Planks
        GameRegistry.registerBlock(acaciaPanel, Names.Panels.ACACIA_PANEL);
        GameRegistry.registerBlock(big_oakPanel, Names.Panels.BIG_OAK_PANEL);
        GameRegistry.registerBlock(birchPanel, Names.Panels.BIRCH_PANEL);
        GameRegistry.registerBlock(junglePanel, Names.Panels.JUNGLE_PANEL);
        GameRegistry.registerBlock(oakPanel, Names.Panels.OAK_PANEL);
        GameRegistry.registerBlock(sprucePanel, Names.Panels.SPRUCE_PANEL);

        //Panels Logs
        GameRegistry.registerBlock(log_acaciaPanel, Names.Panels.LOG_ACACIA_PANEL);
        GameRegistry.registerBlock(log_big_oakPanel, Names.Panels.LOG_BIG_OAK_PANEL);
        GameRegistry.registerBlock(log_birchPanel, Names.Panels.LOG_BIRCH_PANEL);
        GameRegistry.registerBlock(log_junglePanel, Names.Panels.LOG_JUNGLE_PANEL);
        GameRegistry.registerBlock(log_oakPanel, Names.Panels.LOG_OAK_PANEL);
        GameRegistry.registerBlock(log_sprucePanel, Names.Panels.LOG_SPRUCE_PANEL);
    }
}

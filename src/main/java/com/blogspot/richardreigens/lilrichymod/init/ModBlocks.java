package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.LiLRichyPanel;
import com.blogspot.richardreigens.lilrichymod.blocks.advancedPlayerDetector.BlockAdvancedDetector;
import com.blogspot.richardreigens.lilrichymod.blocks.blockTable.BlockTable;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.BeardedAzalea;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.CropItemBlock;
import com.blogspot.richardreigens.lilrichymod.blocks.crops.LiLRichyCrop;
import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.BlockConcrete;
import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.DecorativeBlocks;
import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.DecorativeItemBlock;
import com.blogspot.richardreigens.lilrichymod.blocks.playerDetector.BlockPlayerDetector;
import com.blogspot.richardreigens.lilrichymod.handler.ConfigurationHandler;
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

    //Custom Rendered Blocks
    public static final BlockTable blockTable = new BlockTable(Material.rock);

    //Decorative Blocks ------------------------------------------------------------------------------------------------

    //Lava
    public static final DecorativeBlocks lavaBowl = new DecorativeBlocks(
            Names.Blocks.LAVA_BOWL, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final DecorativeBlocks lavaBowlBlue = new DecorativeBlocks(
            Names.Blocks.LAVA_BOWL_BLUE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.LAVA_BOWL_COLORS);
    public static final DecorativeBlocks lavaBowlGreen = new DecorativeBlocks(
            Names.Blocks.LAVA_BOWL_GREEN, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.LAVA_BOWL_COLORS);
    public static final DecorativeBlocks lavaBowlPurple = new DecorativeBlocks(
            Names.Blocks.LAVA_BOWL_PURPLE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.LAVA_BOWL_COLORS);

    public static final DecorativeBlocks lavaCracks = new DecorativeBlocks(
            Names.Blocks.LAVA_CRACKS, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final DecorativeBlocks lavaDeepFire = new DecorativeBlocks(
            Names.Blocks.LAVA_DEEP_FIRE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final DecorativeBlocks lavaPelesLake = new DecorativeBlocks(
            Names.Blocks.LAVA_PELES_LAKE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final DecorativeBlocks lavaSearingGorge = new DecorativeBlocks(
            Names.Blocks.LAVA_SEARING_GORGE, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);
    public static final DecorativeBlocks lavaVolcano = new DecorativeBlocks(
            Names.Blocks.LAVA_SLUMBERING_VOLCANO, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.LAVA_BLOCKS);

    //Metal
    public static final DecorativeBlocks metalBatteredRobot = new DecorativeBlocks(
            Names.Blocks.METAL_BATTERED_ROBOT, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final DecorativeBlocks metalBatteredRobotBlue = new DecorativeBlocks(
            Names.Blocks.METAL_BATTERED_ROBOT_BLUE, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.METAL_ROBOT_COLORS);
    public static final DecorativeBlocks metalBatteredRobotOrange = new DecorativeBlocks(
            Names.Blocks.METAL_BATTERED_ROBOT_ORANGE, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.METAL_ROBOT_COLORS);
    public static final DecorativeBlocks metalBatteredRobotPurple = new DecorativeBlocks(
            Names.Blocks.METAL_BATTERED_ROBOT_PURPLE, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.METAL_ROBOT_COLORS);

    public static final DecorativeBlocks metalBubbleGrip = new DecorativeBlocks(
            Names.Blocks.METAL_BUBBLE_GRIP, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final DecorativeBlocks metalNeedlepointSteel = new DecorativeBlocks(
            Names.Blocks.METAL_NEEDLEPOINT_STEEL, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final DecorativeBlocks metalRustedIronGrip = new DecorativeBlocks(
            Names.Blocks.METAL_RUSTED_IRON_GRIP, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final DecorativeBlocks metalSeafoamTarnish = new DecorativeBlocks(
            Names.Blocks.METAL_SEAFOAM_TARNISH, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);
    public static final DecorativeBlocks metalStained = new DecorativeBlocks(
            Names.Blocks.METAL_STAINED, Material.iron, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.METAL_BLOCKS);

    //Marble
    public static final DecorativeBlocks marbleBlack = new DecorativeBlocks(
            Names.Blocks.MARBLE_BLACK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.MARBLE_BLOCKS);
    public static final DecorativeBlocks marbleBlancoAurora = new DecorativeBlocks(
            Names.Blocks.MARBLE_BLANCO_AURORA, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.MARBLE_BLOCKS);
    public static final DecorativeBlocks marbleBlancoNafin = new DecorativeBlocks(
            Names.Blocks.MARBLE_BLANCO_NAFIN, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.MARBLE_BLOCKS);
    public static final DecorativeBlocks marbleSpottedBianco = new DecorativeBlocks(
            Names.Blocks.MARBLE_SPOTTED_BIANCO, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.MARBLE_BLOCKS);

    //Cottage
    public static final DecorativeBlocks cottageWall = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);
    public static final DecorativeBlocks cottageWallArchedBeam = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_ARCHED_BEAM, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);
    public static final DecorativeBlocks cottageWallArchedBeamDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_ARCHED_BEAM_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);
    public static final DecorativeBlocks cottageWallDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);
    public static final DecorativeBlocks cottageWallPanelDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_PANEL_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);
    public static final DecorativeBlocks cottageWallPanelLight = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_PANEL_LIGHT, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);
    public static final DecorativeBlocks cottageWallXDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_X_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);
    public static final DecorativeBlocks cottageWallXLight = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WALL_X_LIGHT, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);
    public static final DecorativeBlocks cottageWindowDark = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WINDOW_DARK, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);
    public static final DecorativeBlocks cottageWindowLight = new DecorativeBlocks(
            Names.Blocks.COTTAGE_WINDOW_LIGHT, Material.rock, Reference.MADE_BY + Reference.SPIRAL_GRAPHICS, Reference.CRAFT_WITH + Reference.COTTAGE_BLOCKS);

    //Concrete
    public static final BlockConcrete concrete = new BlockConcrete(
            Names.Blocks.CONCRETE, Material.rock);
    public static final DecorativeBlocks fancyConcreteBlocks = new DecorativeBlocks(
            Names.Blocks.FANCY_CONCRETE_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final DecorativeBlocks concreteBricks = new DecorativeBlocks(
            Names.Blocks.CONCRETE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final DecorativeBlocks concreteBricksDark = new DecorativeBlocks(
            Names.Blocks.CONCRETE_BRICKS_DARK, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final DecorativeBlocks concreteRocks = new DecorativeBlocks(
            Names.Blocks.CONCRETE_ROCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final DecorativeBlocks concreteTexturedBlocks = new DecorativeBlocks(
            Names.Blocks.CONCRETE_TEXTURED_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final DecorativeBlocks oldConcreteSquares = new DecorativeBlocks(
            Names.Blocks.OLD_CONCRETE_SQUARES, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final DecorativeBlocks concreteSquares = new DecorativeBlocks(
            Names.Blocks.CONCRETE_SQUARES, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final DecorativeBlocks smallConcreteBricks = new DecorativeBlocks(
            Names.Blocks.SMALL_CONCRETE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final DecorativeBlocks smallConcreteTexturedSquares = new DecorativeBlocks(
            Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);
    public static final DecorativeBlocks arrangedConcreteBricks = new DecorativeBlocks(
            Names.Blocks.ARRANGED_CONCRETE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.CONCRETE_BLOCKS);

    //Stone
    public static final DecorativeBlocks crackedStone = new DecorativeBlocks(
            Names.Blocks.CRACKED_STONE, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);
    public static final DecorativeBlocks arrangedStoneBricks = new DecorativeBlocks(
            Names.Blocks.ARRANGED_STONE_BRICKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);
    public static final DecorativeBlocks stoneBlocks = new DecorativeBlocks(
            Names.Blocks.STONE_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);
    public static final DecorativeBlocks darkStoneBlocks = new DecorativeBlocks(
            Names.Blocks.DARK_STONE_BLOCKS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);
    public static final DecorativeBlocks stoneMinerals = new DecorativeBlocks(
            Names.Blocks.STONE_MINERALS, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_BLOCKS);

    public static final DecorativeBlocks stoneMineralsBlue = new DecorativeBlocks(
            Names.Blocks.STONE_MINERALS_BLUE, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_MINERALS_COLORS_CRAFT);
    public static final DecorativeBlocks stoneMineralsOrange = new DecorativeBlocks(
            Names.Blocks.STONE_MINERALS_ORANGE, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_MINERALS_COLORS_CRAFT);
    public static final DecorativeBlocks stoneMineralsPurple = new DecorativeBlocks(
            Names.Blocks.STONE_MINERALS_PURPLE, Material.rock, Reference.MADE_BY + Reference.LILRICHY, Reference.CRAFT_WITH + Reference.STONE_MINERALS_COLORS_CRAFT);


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

    //Tile Entity Blocks
    public static final BlockPlayerDetector playerDetector = new BlockPlayerDetector(Material.anvil);
    public static final BlockAdvancedDetector advancedDetector = new BlockAdvancedDetector(Material.anvil);

    public static void init() {
        //Custom Rendered Blocks
        GameRegistry.registerBlock(blockTable, Names.Models.BLOCK_TABLE);

        //Crops
        GameRegistry.registerBlock(beardedAzalea, CropItemBlock.class, Names.Crops.BEARDED_AZALEA);

        //Decorative Blocks---------------------------------------------------------------------------------------------

        //Lava
        GameRegistry.registerBlock(lavaBowl, DecorativeItemBlock.class, Names.Blocks.LAVA_BOWL);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaBowl);
        OreDictionary.registerOre(Names.OreDicNames.LAVA_BOWL, lavaBowl);
        GameRegistry.registerBlock(lavaBowlBlue, DecorativeItemBlock.class, Names.Blocks.LAVA_BOWL_BLUE);
        OreDictionary.registerOre(Names.OreDicNames.LAVA_BOWL, lavaBowlBlue);
        GameRegistry.registerBlock(lavaBowlGreen, DecorativeItemBlock.class, Names.Blocks.LAVA_BOWL_GREEN);
        OreDictionary.registerOre(Names.OreDicNames.LAVA_BOWL, lavaBowlGreen);
        GameRegistry.registerBlock(lavaBowlPurple, DecorativeItemBlock.class, Names.Blocks.LAVA_BOWL_PURPLE);
        OreDictionary.registerOre(Names.OreDicNames.LAVA_BOWL, lavaBowlPurple);

        GameRegistry.registerBlock(lavaCracks, DecorativeItemBlock.class, Names.Blocks.LAVA_CRACKS);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaCracks);
        GameRegistry.registerBlock(lavaDeepFire, DecorativeItemBlock.class, Names.Blocks.LAVA_DEEP_FIRE);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaDeepFire);
        GameRegistry.registerBlock(lavaPelesLake, DecorativeItemBlock.class, Names.Blocks.LAVA_PELES_LAKE);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaPelesLake);
        GameRegistry.registerBlock(lavaSearingGorge, DecorativeItemBlock.class, Names.Blocks.LAVA_SEARING_GORGE);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaSearingGorge);
        GameRegistry.registerBlock(lavaVolcano, DecorativeItemBlock.class, Names.Blocks.LAVA_SLUMBERING_VOLCANO);
        OreDictionary.registerOre(Names.OreDicNames.LAVA, lavaVolcano);

        //Metal
        GameRegistry.registerBlock(metalBatteredRobot, DecorativeItemBlock.class, Names.Blocks.METAL_BATTERED_ROBOT);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBatteredRobot);
        OreDictionary.registerOre(Names.OreDicNames.METAL_ROBOT, metalBatteredRobot);
        GameRegistry.registerBlock(metalBatteredRobotBlue, DecorativeItemBlock.class, Names.Blocks.METAL_BATTERED_ROBOT_BLUE);
        OreDictionary.registerOre(Names.OreDicNames.METAL_ROBOT, metalBatteredRobotBlue);
        GameRegistry.registerBlock(metalBatteredRobotOrange, DecorativeItemBlock.class, Names.Blocks.METAL_BATTERED_ROBOT_ORANGE);
        OreDictionary.registerOre(Names.OreDicNames.METAL_ROBOT, metalBatteredRobotOrange);
        GameRegistry.registerBlock(metalBatteredRobotPurple, DecorativeItemBlock.class, Names.Blocks.METAL_BATTERED_ROBOT_PURPLE);
        OreDictionary.registerOre(Names.OreDicNames.METAL_ROBOT, metalBatteredRobotPurple);

        GameRegistry.registerBlock(metalBubbleGrip, DecorativeItemBlock.class, Names.Blocks.METAL_BUBBLE_GRIP);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalBubbleGrip);
        GameRegistry.registerBlock(metalNeedlepointSteel, DecorativeItemBlock.class, Names.Blocks.METAL_NEEDLEPOINT_STEEL);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalNeedlepointSteel);
        GameRegistry.registerBlock(metalRustedIronGrip, DecorativeItemBlock.class, Names.Blocks.METAL_RUSTED_IRON_GRIP);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalRustedIronGrip);
        GameRegistry.registerBlock(metalSeafoamTarnish, DecorativeItemBlock.class, Names.Blocks.METAL_SEAFOAM_TARNISH);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalSeafoamTarnish);
        GameRegistry.registerBlock(metalStained, DecorativeItemBlock.class, Names.Blocks.METAL_STAINED);
        OreDictionary.registerOre(Names.OreDicNames.METAL, metalStained);

        //Marble
        GameRegistry.registerBlock(marbleBlack, DecorativeItemBlock.class, Names.Blocks.MARBLE_BLACK);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleBlack);
        GameRegistry.registerBlock(marbleBlancoAurora, DecorativeItemBlock.class, Names.Blocks.MARBLE_BLANCO_AURORA);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleBlancoAurora);
        GameRegistry.registerBlock(marbleBlancoNafin, DecorativeItemBlock.class, Names.Blocks.MARBLE_BLANCO_NAFIN);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleBlancoNafin);
        GameRegistry.registerBlock(marbleSpottedBianco, DecorativeItemBlock.class, Names.Blocks.MARBLE_SPOTTED_BIANCO);
        OreDictionary.registerOre(Names.OreDicNames.MARBLE, marbleSpottedBianco);

        //Cottage
        GameRegistry.registerBlock(cottageWall, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWall);
        GameRegistry.registerBlock(cottageWallArchedBeam, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_ARCHED_BEAM);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallArchedBeam);
        GameRegistry.registerBlock(cottageWallArchedBeamDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_ARCHED_BEAM_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallArchedBeamDark);
        GameRegistry.registerBlock(cottageWallDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallDark);
        GameRegistry.registerBlock(cottageWallPanelDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_PANEL_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallPanelDark);
        GameRegistry.registerBlock(cottageWallPanelLight, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_PANEL_LIGHT);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallPanelLight);
        GameRegistry.registerBlock(cottageWallXDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_X_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallXDark);
        GameRegistry.registerBlock(cottageWallXLight, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WALL_X_LIGHT);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWallXLight);
        GameRegistry.registerBlock(cottageWindowDark, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WINDOW_DARK);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWindowDark);
        GameRegistry.registerBlock(cottageWindowLight, DecorativeItemBlock.class, Names.Blocks.COTTAGE_WINDOW_LIGHT);
        OreDictionary.registerOre(Names.OreDicNames.COTTAGE, cottageWindowLight);

        //Concrete
        GameRegistry.registerBlock(concrete, DecorativeItemBlock.class, Names.Blocks.CONCRETE);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concrete);
        GameRegistry.registerBlock(fancyConcreteBlocks, DecorativeItemBlock.class, Names.Blocks.FANCY_CONCRETE_BLOCKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, fancyConcreteBlocks);
        GameRegistry.registerBlock(concreteBricks, DecorativeItemBlock.class, Names.Blocks.CONCRETE_BRICKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteBricks);
        GameRegistry.registerBlock(concreteBricksDark, DecorativeItemBlock.class, Names.Blocks.CONCRETE_BRICKS_DARK);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteBricksDark);
        GameRegistry.registerBlock(concreteRocks, DecorativeItemBlock.class, Names.Blocks.CONCRETE_ROCKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteRocks);
        GameRegistry.registerBlock(concreteTexturedBlocks, DecorativeItemBlock.class, Names.Blocks.CONCRETE_TEXTURED_BLOCKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteTexturedBlocks);
        GameRegistry.registerBlock(oldConcreteSquares, DecorativeItemBlock.class, Names.Blocks.OLD_CONCRETE_SQUARES);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, oldConcreteSquares);
        GameRegistry.registerBlock(concreteSquares, DecorativeItemBlock.class, Names.Blocks.CONCRETE_SQUARES);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, concreteSquares);
        GameRegistry.registerBlock(smallConcreteBricks, DecorativeItemBlock.class, Names.Blocks.SMALL_CONCRETE_BRICKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, smallConcreteBricks);
        GameRegistry.registerBlock(smallConcreteTexturedSquares, DecorativeItemBlock.class, Names.Blocks.SMALL_CONCRETE_TEXTURED_SQUARES);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, smallConcreteTexturedSquares);
        GameRegistry.registerBlock(arrangedConcreteBricks, DecorativeItemBlock.class, Names.Blocks.ARRANGED_CONCRETE_BRICKS);
        OreDictionary.registerOre(Names.OreDicNames.CONCRETE, arrangedConcreteBricks);

        //Stone
        GameRegistry.registerBlock(crackedStone, DecorativeItemBlock.class, Names.Blocks.CRACKED_STONE);
        OreDictionary.registerOre(Names.OreDicNames.STONE, crackedStone);
        GameRegistry.registerBlock(arrangedStoneBricks, DecorativeItemBlock.class, Names.Blocks.ARRANGED_STONE_BRICKS);
        OreDictionary.registerOre(Names.OreDicNames.STONE, arrangedStoneBricks);
        GameRegistry.registerBlock(stoneBlocks, DecorativeItemBlock.class, Names.Blocks.STONE_BLOCKS);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneBlocks);
        GameRegistry.registerBlock(darkStoneBlocks, DecorativeItemBlock.class, Names.Blocks.DARK_STONE_BLOCKS);
        OreDictionary.registerOre(Names.OreDicNames.STONE, darkStoneBlocks);

        GameRegistry.registerBlock(stoneMinerals, DecorativeItemBlock.class, Names.Blocks.STONE_MINERALS);
        OreDictionary.registerOre(Names.OreDicNames.STONE, stoneMinerals);
        OreDictionary.registerOre(Names.OreDicNames.STONE_MINERALS, stoneMinerals);
        GameRegistry.registerBlock(stoneMineralsBlue, DecorativeItemBlock.class, Names.Blocks.STONE_MINERALS_BLUE);
        OreDictionary.registerOre(Names.OreDicNames.STONE_MINERALS, stoneMineralsBlue);
        GameRegistry.registerBlock(stoneMineralsOrange, DecorativeItemBlock.class, Names.Blocks.STONE_MINERALS_ORANGE);
        OreDictionary.registerOre(Names.OreDicNames.STONE_MINERALS, stoneMineralsOrange);
        GameRegistry.registerBlock(stoneMineralsPurple, DecorativeItemBlock.class, Names.Blocks.STONE_MINERALS_PURPLE);
        OreDictionary.registerOre(Names.OreDicNames.STONE_MINERALS, stoneMineralsPurple);

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

        //Tile Entity Blocks
        if (ConfigurationHandler.loadPlayerDetector)
            GameRegistry.registerBlock(playerDetector, Names.Blocks.PLAYER_DETECTOR);
        if (ConfigurationHandler.loadAdvancedDetector)
            GameRegistry.registerBlock(advancedDetector, Names.Blocks.ADVANCED_DETECTOR);
    }
}

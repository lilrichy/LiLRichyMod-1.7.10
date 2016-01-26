package com.blogspot.richardreigens.lilrichymod.init;

import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.DecorativeItemBlock;
import com.blogspot.richardreigens.lilrichymod.blocks.decorativeBlocks.GlassBlocks;
import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by LiLRichy on 1/26/2016.
 */
public class ModBlocksGlass {
    public static final GlassBlocks CLEAR_GLASS_BLUE = new GlassBlocks(Names.Glass.CLEAR_GLASS_BLUE,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);
    public static final GlassBlocks CLEAR_GLASS_GREEN = new GlassBlocks(Names.Glass.CLEAR_GLASS_GREEN,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);
    public static final GlassBlocks CLEAR_GLASS_PINK = new GlassBlocks(Names.Glass.CLEAR_GLASS_PINK,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);

    public static final GlassBlocks FROSTY_GLASS_BLUE = new GlassBlocks(Names.Glass.FROSTY_GLASS_BLUE,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);
    public static final GlassBlocks FROSTY_GLASS_GREEN = new GlassBlocks(Names.Glass.FROSTY_GLASS_GREEN,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);
    public static final GlassBlocks FROSTY_GLASS_PURPLE = new GlassBlocks(Names.Glass.FROSTY_GLASS_PURPLE,
            Reference.MADE_BY + Reference.LILRICHY, Reference.GLASS_COLORS_CRAFT_TIP);

    public static void init() {
        GameRegistry.registerBlock(CLEAR_GLASS_BLUE, DecorativeItemBlock.class, Names.Glass.CLEAR_GLASS_BLUE);
        OreDictionary.registerOre("blockGlass", CLEAR_GLASS_BLUE);
        GameRegistry.registerBlock(CLEAR_GLASS_GREEN, DecorativeItemBlock.class, Names.Glass.CLEAR_GLASS_GREEN);
        OreDictionary.registerOre("blockGlass", CLEAR_GLASS_GREEN);
        GameRegistry.registerBlock(CLEAR_GLASS_PINK, DecorativeItemBlock.class, Names.Glass.CLEAR_GLASS_PINK);
        OreDictionary.registerOre("blockGlass", CLEAR_GLASS_PINK);

        GameRegistry.registerBlock(FROSTY_GLASS_BLUE, DecorativeItemBlock.class, Names.Glass.FROSTY_GLASS_BLUE);
        OreDictionary.registerOre("blockGlass", FROSTY_GLASS_BLUE);
        GameRegistry.registerBlock(FROSTY_GLASS_GREEN, DecorativeItemBlock.class, Names.Glass.FROSTY_GLASS_GREEN);
        OreDictionary.registerOre("blockGlass", FROSTY_GLASS_GREEN);
        GameRegistry.registerBlock(FROSTY_GLASS_PURPLE, DecorativeItemBlock.class, Names.Glass.FROSTY_GLASS_PURPLE);
        OreDictionary.registerOre("blockGlass", FROSTY_GLASS_PURPLE);
    }

}

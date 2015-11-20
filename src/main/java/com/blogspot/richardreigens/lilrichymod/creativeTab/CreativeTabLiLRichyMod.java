package com.blogspot.richardreigens.lilrichymod.creativeTab;

import com.blogspot.richardreigens.lilrichymod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.blogspot.richardreigens.lilrichymod.reference.Reference.MOD_ID;

/**
 * Created by Rich on 11/20/2015.
 */
public class CreativeTabLiLRichyMod
{
    public static final CreativeTabs LR_Tab = new CreativeTabs(MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.shadowmourne;
        }
    };
}

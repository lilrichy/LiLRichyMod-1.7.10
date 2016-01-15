package com.blogspot.richardreigens.lilrichymod.items;

import com.blogspot.richardreigens.lilrichymod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Rich on 12/2/2015.
 */
public class ItemLiLRichySeedFood extends ItemFood implements IPlantable {
    private final Block theBlockPlant;

    //Block ID of the soil this seed food should be planted on.
    private final Block soilId;

    public ItemLiLRichySeedFood(int healAmount, float saturationModifier,
                                Block blockPlant, Block blockRequiredToBePlanted) {
        super(healAmount, saturationModifier, false);
        theBlockPlant = blockPlant;
        soilId = blockRequiredToBePlanted;
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer,
                             World world, int x, int y, int z, int par7, float par8,
                             float par9, float par10) {
        // not sure what this parameter does, copied it from potato
        if (par7 != 1) {
            return false;
        }
        // check if player has capability to edit
        else if (entityPlayer.canPlayerEdit(x, y + 1, z, par7, itemStack)) {
            // check that the soil block can sustain the plant
            // and that block above is air so there is room for plant to grow
            if (world.getBlock(x, y, z).canSustainPlant(world,
                    x, y, z, ForgeDirection.UP, this) && world
                    .isAirBlock(x, y + 1, z)) {
                // place the plant block
                world.setBlock(x, y + 1, z, theBlockPlant);
                // decrement the stack of seed items
                --itemStack.stackSize;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
        return EnumPlantType.Crop;
    }

    @Override
    public Block getPlant(IBlockAccess world, int x, int y, int z) {
        return theBlockPlant;
    }

    @Override
    public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
        return 0;
    }

    public Block getSoilId() {
        return soilId;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":seeds/", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":seeds/", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iIconRegister) {
        itemIcon = iIconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
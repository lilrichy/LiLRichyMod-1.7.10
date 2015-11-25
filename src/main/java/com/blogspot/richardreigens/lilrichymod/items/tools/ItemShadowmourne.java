package com.blogspot.richardreigens.lilrichymod.items.tools;

import com.blogspot.richardreigens.lilrichymod.reference.Names;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;

/**
 * Created by Rich on 11/20/2015.
 */
public class ItemShadowmourne extends ItemSwordLiLRichyMod
{
    protected final float weaponDamage;

    public ItemShadowmourne(ToolMaterial material, float damage)
    {
        super(material);
        this.setUnlocalizedName(Names.Items.SHADOWMOURNE);
        this.weaponDamage = 4.0F + damage + material.getDamageVsEntity();
    }

    /**
     * Override to add custom weapon damage field rather than vanilla ItemSword's field
     */
    @Override
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = HashMultimap.create();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(),
                new AttributeModifier(field_111210_e, "Weapon modifier", (double) this.weaponDamage, 0));
        return multimap;
    }
}
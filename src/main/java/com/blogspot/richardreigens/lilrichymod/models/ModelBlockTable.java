package com.blogspot.richardreigens.lilrichymod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by Rich on 12/8/2015.
 */
public class ModelBlockTable extends ModelBase {
    //fields
    ModelRenderer Top;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Shelf;
    ModelRenderer toolHandel;
    ModelRenderer toolHead;
    ModelRenderer box;

    public ModelBlockTable() {
        textureWidth = 64;
        textureHeight = 64;

        Top = new ModelRenderer(this, 0, 47);
        Top.addBox(0F, 0F, 0F, 16, 1, 16);
        Top.setRotationPoint(-8F, 9F, -8F);
        Top.setTextureSize(64, 64);
        Top.mirror = true;
        setRotation(Top, 0F, 0F, 0F);
        Top.mirror = false;
        Leg1 = new ModelRenderer(this, 0, 0);
        Leg1.addBox(0F, 0F, 0F, 2, 14, 2);
        Leg1.setRotationPoint(6F, 10F, -8F);
        Leg1.setTextureSize(64, 64);
        Leg1.mirror = true;
        setRotation(Leg1, 0F, 0F, 0F);
        Leg1.mirror = false;
        Leg2 = new ModelRenderer(this, 0, 0);
        Leg2.addBox(0F, 0F, 0F, 2, 14, 2);
        Leg2.setRotationPoint(-8F, 10F, -8F);
        Leg2.setTextureSize(64, 64);
        Leg2.mirror = true;
        setRotation(Leg2, 0F, 0F, 0F);
        Leg2.mirror = false;
        Leg3 = new ModelRenderer(this, 0, 0);
        Leg3.addBox(-8F, 0F, 0F, 2, 14, 2);
        Leg3.setRotationPoint(0F, 10F, 6F);
        Leg3.setTextureSize(64, 64);
        Leg3.mirror = true;
        setRotation(Leg3, 0F, 0F, 0F);
        Leg3.mirror = false;
        Leg4 = new ModelRenderer(this, 0, 0);
        Leg4.addBox(0F, 0F, 0F, 2, 14, 2);
        Leg4.setRotationPoint(6F, 10F, 6F);
        Leg4.setTextureSize(64, 64);
        Leg4.mirror = true;
        setRotation(Leg4, 0F, 0F, 0F);
        Leg4.mirror = false;
        Shelf = new ModelRenderer(this, 0, 30);
        Shelf.addBox(0F, 0F, 0F, 14, 1, 14);
        Shelf.setRotationPoint(-7F, 15F, -7F);
        Shelf.setTextureSize(64, 64);
        Shelf.mirror = true;
        setRotation(Shelf, 0F, 0F, 0F);
        Shelf.mirror = false;
        toolHandel = new ModelRenderer(this, 9, 0);
        toolHandel.addBox(0F, 0F, 0F, 5, 1, 1);
        toolHandel.setRotationPoint(-5F, 8F, -3F);
        toolHandel.setTextureSize(64, 64);
        toolHandel.mirror = true;
        setRotation(toolHandel, 0F, -1.07818F, 0F);
        toolHead = new ModelRenderer(this, 9, 3);
        toolHead.addBox(0F, 0F, 0F, 2, 1, 1);
        toolHead.setRotationPoint(-4F, 8F, 1F);
        toolHead.setTextureSize(64, 64);
        toolHead.mirror = true;
        setRotation(toolHead, 0F, 0.4461433F, 0F);
        box = new ModelRenderer(this, 22, 0);
        box.addBox(0F, 0F, 0F, 4, 4, 4);
        box.setRotationPoint(-2F, 7F, -2F);
        box.setTextureSize(64, 64);
        box.mirror = true;
        setRotation(box, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Top.render(f5);
        Leg1.render(f5);
        Leg2.render(f5);
        Leg3.render(f5);
        Leg4.render(f5);
        Shelf.render(f5);
        toolHandel.render(f5);
        toolHead.render(f5);
        box.render(f5);
    }

    public void renderModel(float f5) {
        Top.render(f5);
        Leg1.render(f5);
        Leg2.render(f5);
        Leg3.render(f5);
        Leg4.render(f5);
        Shelf.render(f5);
        toolHandel.render(f5);
        toolHead.render(f5);
        box.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
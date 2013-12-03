package mtndewey.ninjamod.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNinjaStar extends ModelBase
{
  //fields
    ModelRenderer middle;
    ModelRenderer middle_2;
    ModelRenderer middle3;
    ModelRenderer middle4;
    ModelRenderer spike_1;
    ModelRenderer spike_3;
    ModelRenderer spike_2;
    ModelRenderer spike_4;
  
  public ModelNinjaStar()
  {
    textureWidth = 16;
    textureHeight = 16;
    
      middle = new ModelRenderer(this, 0, 0);
      middle.addBox(0F, -2F, -2F, 0, 1, 3);
      middle.setRotationPoint(0F, 0F, 0F);
      middle.setTextureSize(16, 16);
      middle.mirror = true;
      setRotation(middle, 0F, 0F, 0F);
      middle_2 = new ModelRenderer(this, 0, 0);
      middle_2.addBox(0F, 0F, 1F, 0, 3, 1);
      middle_2.setRotationPoint(0F, -1F, -1F);
      middle_2.setTextureSize(16, 16);
      middle_2.mirror = true;
      setRotation(middle_2, 0F, 0F, 0F);
      middle3 = new ModelRenderer(this, 0, 0);
      middle3.addBox(0F, 0F, 0F, 0, 1, 3);
      middle3.setRotationPoint(0F, 1F, -3F);
      middle3.setTextureSize(16, 16);
      middle3.mirror = true;
      setRotation(middle3, 0F, 0F, 0F);
      middle4 = new ModelRenderer(this, 0, 0);
      middle4.addBox(0F, 0F, 0F, 0, 3, 1);
      middle4.setRotationPoint(0F, -2F, -3F);
      middle4.setTextureSize(16, 16);
      middle4.mirror = true;
      setRotation(middle4, 0F, 0F, 0F);
      spike_1 = new ModelRenderer(this, 0, 0);
      spike_1.addBox(0F, 0F, 0F, 0, 2, 1);
      spike_1.setRotationPoint(0F, 0F, 1F);
      spike_1.setTextureSize(16, 16);
      spike_1.mirror = true;
      setRotation(spike_1, 0F, 0F, 0F);
      spike_3 = new ModelRenderer(this, 0, 0);
      spike_3.addBox(0F, 0F, 0F, 0, 1, 2);
      spike_3.setRotationPoint(0F, 2F, -3F);
      spike_3.setTextureSize(16, 16);
      spike_3.mirror = true;
      setRotation(spike_3, 0F, 0F, 0F);
      spike_2 = new ModelRenderer(this, 0, 0);
      spike_2.addBox(0F, 0F, 0F, 0, 1, 2);
      spike_2.setRotationPoint(0F, -3F, -1F);
      spike_2.setTextureSize(16, 16);
      spike_2.mirror = true;
      setRotation(spike_2, 0F, 0F, 0F);
      spike_4 = new ModelRenderer(this, 0, 0);
      spike_4.addBox(0F, 0F, 0F, 0, 2, 1);
      spike_4.setRotationPoint(0F, -2F, -4F);
      spike_4.setTextureSize(16, 16);
      spike_4.mirror = true;
      setRotation(spike_4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    middle.render(f5);
    middle_2.render(f5);
    middle3.render(f5);
    middle4.render(f5);
    spike_1.render(f5);
    spike_3.render(f5);
    spike_2.render(f5);
    spike_4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}

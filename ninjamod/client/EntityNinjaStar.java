package mtndewey.ninjamod.client;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
public class EntityNinjaStar extends EntityThrowable
{
public EntityNinjaStar(World par1World)
{
         super(par1World);
}
public EntityNinjaStar(World par1World, EntityLivingBase par2EntityLivingBase)
{
         super(par1World, par2EntityLivingBase);
}
public EntityNinjaStar(World par1World, double par2, double par4, double par6)
{
         super(par1World, par2, par4, par6);
}
/**
         * Called when this EntityThrowable hits a block or entity.
         */
@Override
protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
{
         if (par1MovingObjectPosition.entityHit != null)
         {
                 float starDamage = 4;
                 par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)starDamage);
         }
         for (int i = 0; i < 8; ++i)
         {
                 this.worldObj.spawnParticle("crit", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
         }
         if (!this.worldObj.isRemote)
         {
                 this.setDead();
         }
}
}
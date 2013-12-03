package mtndewey.ninjamod.client;

import mtndewey.ninjamod.ninjamod;
import mtndewey.ninjamod.items.ninjamoditems;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.projectile.EntitySnowball;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends ServerProxy {

	public void registerRenderers() {
		int modEntityID = 0;
		EntityRegistry.registerModEntity(EntityNinjaStar.class, "ninjaStar", ++modEntityID, ninjamod.instance, 64, 10, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityNinjaStar.class, new RenderSnowball(ninjamoditems.ninjaStar));
		}
		

	@Override
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}



package forestryextras.client;

import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import forestryextras.main.CommonProxy;

public class ClientProxy extends CommonProxy {

	@Override
	public void load()
	{
		render();
		registerParticles();
		}
	
	public void render()
    {
    }
	
	@Override
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }
	
	@Override
    public void registerParticles()
    {
    }
	}
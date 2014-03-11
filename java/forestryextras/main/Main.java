package forestryextras.main;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import forestryextras.main.init.Blocks;
import forestryextras.main.init.Items;
import forestryextras.main.init.Tabs;
import forestryextras.main.init.intergration.IntergrationLoader;

@Mod(modid = "ForestryExtras", name = "ForestryExtras", version = "2.1.1" ,dependencies = "required-after:Forestry;after:Thaumcraft")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Main {
    @SidedProxy(clientSide = "forestryextras.client.ClientProxy", serverSide = "forestryextras.main.CommonProxy")
    public static CommonProxy proxy;
 
    @Instance("ForestryExtras")
    public static Main instance;
    public static String version = "2.1.1";
    public static String modName = "ForestryExtras";
    public static String alias = "FE";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		Config config = new Config();
		Config.loadConfig(event);
    }

    
    @EventHandler
    public void init(FMLInitializationEvent evt)
    {
    	proxy.load();
    	Items.init();
    	Blocks.init();
    	Tabs.init();
    	IntergrationLoader.init();
    	
       // NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
       
        MinecraftForge.EVENT_BUS.register(this); 

    		//if(Loader.isModLoaded("NotEnoughItems")){
    		//if(evt.getSide() == Side.CLIENT){
    		//	NEI.init();}}
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent evt)
    {

    }
}
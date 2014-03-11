package forestryextras.main.init.intergration;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import forestryextras.main.init.Blocks;
import forestryextras.main.init.Items;



public class Thaumcraft {

	public static void init()
	{
		initOreClusters();
		initMaterialAspects();
	}
	
	public static void initOreClusters()
	{

	}
	
	public static void initMaterialAspects()
	{
		ThaumcraftApi.registerObjectTag(Items.draconicIngot.itemID, 0, new AspectList().add(Aspect.MAGIC, 1).add(Aspect.METAL, 1));
		ThaumcraftApi.registerObjectTag(Items.reinforcedIngot.itemID, 0, new AspectList().add(Aspect.ORDER, 1).add(Aspect.METAL, 1));
		ThaumcraftApi.registerObjectTag(Blocks.draconicBlock.blockID, 0, new AspectList().add(Aspect.MAGIC, 9).add(Aspect.METAL, 9));
		ThaumcraftApi.registerObjectTag(Blocks.reinforcedBlock.blockID, 0, new AspectList().add(Aspect.ORDER, 9).add(Aspect.METAL, 9));
	}
}

package forestryextras.main.init.intergration;

import cpw.mods.fml.common.Loader;

public class IntergrationLoader {

	public static void init()
	{
		if(Loader.isModLoaded("ForgeMultipart")){
			System.out.print("ForgeMultipart is installed, adding intergration" + '\n');
			ForgeMultipart.init();
		}
		
		if(Loader.isModLoaded("TinkersConstruct")){
			System.out.print("Tinkers Construct is installed, adding intergration" + '\n');
			TinkersConstruct.init();
		}
	}
	
}

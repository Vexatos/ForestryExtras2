package forestryextras.main;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {


	public static void loadConfig(FMLPreInitializationEvent e){
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());

	        coalFrameId = config.getItem("coalFrame", 4536).getInt();
	        diamondFrameId = config.getItem("diamondFrame", 4537).getInt();
	    	draconicFrameId = config.getItem("draconicFrame", 4538).getInt();
	    	emeraldFrameId = config.getItem("emeraldFrame", 4539).getInt();
	    	goldFrameId = config.getItem("goldFrame", 4540).getInt();
	    	ironFrameId = config.getItem("ironFrame", 4541).getInt();
	    	natureFrameId = config.getItem("natureFrame", 4542).getInt();
	    	obsidianFrameId = config.getItem("obsidianFrame", 4543).getInt();
	    	reinforcedFrameId = config.getItem("reinforcedFrame", 4544).getInt();
	    	uberFrameId = config.getItem("uberFrame", 4545).getInt();
	    	mutationFrameId = config.getItem("mutationFrame", 4551).getInt();	    	
	    	copperFrameId = config.getItem("copperFrame", 4552).getInt();
	    	tinFrameId = config.getItem("tinFrame", 4553).getInt();
	    	silverFrameId = config.getItem("silverFrame", 4554).getInt();
	    	manyullynFrameId = config.getItem("manyullynFrame", 4555).getInt();
	    	bronzeFrameId = config.getItem("bronzeFrame", 4556).getInt();
	    	steelFrameId = config.getItem("steelFrame", 4557).getInt();
	    	arditeFrameId = config.getItem("arditeFrame", 4558).getInt();
	    	cobaltFrameId = config.getItem("cobaltFrame", 4559).getInt();
	    	aluminiumFrameId = config.getItem("aluminiumFrame", 4560).getInt();
	    	leadFrameId = config.getItem("leadFrame", 4561).getInt();
	    	alumiteFrameId = config.getItem("alumiteFrame", 4562).getInt();
	    	apatiteFrameId = config.getItem("apatiteFrame", 4563).getInt();
	    	netherQuartzFrameId = config.getItem("quartzFrame", 4563).getInt();
	    	thaumiumFrameId = config.getItem("thaumiumFrame", 4564).getInt();
	    	darkThaumiumFrameId = config.getItem("darkThaumiumFrame", 4565).getInt();
	    	voidFrameId = config.getItem("voidFrame", 4566).getInt();
	    	pokefenniumFrameId = config.getItem("pokefenniumFrame", 4567).getInt();
	    	fairyFrameId = config.getItem("fairyFrame", 4568).getInt();
	    	alfiumFrameId = config.getItem("fairyAlfium", 4569).getInt();

	    	diamondStickId = config.getItem("diamondStick", 5536).getInt();
	    	draconicStickId = config.getItem("draconicStick", 5537).getInt();
	    	emeraldStickId = config.getItem("emeraldStick", 5538).getInt();
	    	goldStickId = config.getItem("goldStick", 5539).getInt();
	    	ironStickId = config.getItem("ironStick", 5540).getInt();
	    	reinforcedStickId = config.getItem("reinforcedStick", 5541).getInt();
	    	copperStickId = config.getItem("copperStick", 5542).getInt();
	    	tinStickId = config.getItem("tinStick", 5543).getInt();
	    	silverStickId = config.getItem("silverStick", 5544).getInt();
	    	manyullynStickId = config.getItem("manyullynStick", 5545).getInt();
	    	bronzeStickId = config.getItem("bronzeStick", 5546).getInt();
	    	steelStickId = config.getItem("steelStick", 5547).getInt();
	    	arditeStickId = config.getItem("arditeStick", 5548).getInt();
	    	cobaltStickId = config.getItem("cobaltStick", 5549).getInt();
	    	leadStickId = config.getItem("leadStick", 5551).getInt();
	    	alumiteStickId = config.getItem("alumiteStick", 5552).getInt();
	    	netherQuartzStickId = config.getItem("quartzStick", 5553).getInt();
	    	apatiteStickId = config.getItem("apatiteStick", 5554).getInt();
	    	coalStickId = config.getItem("coalStick", 5555).getInt();
	    	obsidianStickId = config.getItem("obsidianStick", 5556).getInt();
	    	mutationStickId = config.getItem("mutationStick", 5557).getInt();
	    	fairyStickId = config.getItem("fairyStick", 5558).getInt();
	    	pokefenniumStickId = config.getItem("pokefenniumStick", 5559).getInt();
	    	voidStickId = config.getItem("voidStick", 5560).getInt();
	    	thaumiumStickId = config.getItem("thaumiumStick", 5561).getInt();
	    	darkThaumiumStickId = config.getItem("darkThaumiumStick", 5562).getInt();
	    	alfiumStickId = config.getItem("alfiumStick", 5563).getInt();

	    	nuggetId = config.getItem("nugget", 6534).getInt();
	    	honeyCombId = config.getItem("honeyComb", 6535).getInt();
	    	draconicIngotId = config.getItem("ingotDraconic", 6536).getInt();
	    	reinforcedIngotId = config.getItem("ingotReinforced", 6537).getInt();
	    	alfiumIngotId = config.getItem("ingotAlfium", 6538).getInt();
	    	ryuIngotId = config.getItem("ingotRyu", 6539).getInt();

	    	reinforcedScoopId = config.getItem("reinforcedScoop", 6837).getInt();
	    	reinforcedGrafterId = config.getItem("reinforcedGrafter", 6840).getInt();
	    	uberGrafterId = config.getItem("uberGrafter", 6841).getInt();
	    	draconicGrafterId = config.getItem("DraconicGrafter", 6842).getInt();
	    	legendaryGrafterId = config.getItem("LegendaryGrafter", 6843).getInt();
	    	draconicScoopId = config.getItem("draconicScoop", 6844).getInt();
	    	uberScoopId = config.getItem("uberScoop", 6845).getInt();
	    	legendaryScoopId = config.getItem("legendaryScoop", 6846).getInt();

	    	
	    	draconicBlockId = config.getBlock("draconicBlock", 760).getInt();
	    	reinforcedBlockId = config.getBlock("reinforcedBlock", 761).getInt();
	    	draconicOreId = config.getBlock("draconicOre", 771).getInt();
	    	
	    	dragonEggRecipe = config.get(Configuration.CATEGORY_GENERAL, "dragonEggRecipe", false).getBoolean(dragonEggRecipe);
	    	config.save();
}
	
    public static int uberFrameId;
    public static int ironFrameId;
    public static int goldFrameId;
    public static int diamondFrameId;
    public static int reinforcedFrameId;
    public static int draconicFrameId;
    public static int coalFrameId;
    public static int natureFrameId;
    public static int emeraldFrameId;
    public static int obsidianFrameId;
    public static int mutationFrameId;
    public static int copperFrameId;
    public static int tinFrameId;
    public static int silverFrameId;
    public static int bronzeFrameId;
    public static int steelFrameId;
    public static int manyullynFrameId;
    public static int arditeFrameId;
    public static int cobaltFrameId;
    public static int aluminiumFrameId;
    public static int leadFrameId;
    public static int alumiteFrameId;
    public static int apatiteFrameId;
    public static int netherQuartzFrameId;
    public static int voidFrameId;
    public static int pokefenniumFrameId;
    public static int fairyFrameId;
    public static int darkThaumiumFrameId;
    public static int thaumiumFrameId;
    public static int alfiumFrameId;

    public static int ironStickId;
    public static int goldStickId;
    public static int diamondStickId;
    public static int reinforcedStickId;
    public static int draconicStickId;
    public static int emeraldStickId;
    public static int netherQuartzStickId;
    public static int apatiteStickId;
    public static int coalStickId;
	public static int mutationStickId;
	public static int obsidianStickId;
    public static int alfiumStickId;

    public static int copperStickId;
    public static int tinStickId;
    public static int silverStickId;
    public static int bronzeStickId;
    public static int steelStickId;
    public static int manyullynStickId;
    public static int arditeStickId;
    public static int cobaltStickId;
    public static int aluminiumStickId;
    public static int leadStickId;
    public static int alumiteStickId;
    public static int voidStickId;
    public static int pokefenniumStickId;
    public static int fairyStickId;
    public static int darkThaumiumStickId;
    public static int thaumiumStickId;

    public static int reinforcedIngotId;
    public static int draconicIngotId;
    public static int alfiumIngotId;
    public static int ryuIngotId;
    
    public static int honeyCombId;
    public static int nuggetId;

    public static int reinforcedScoopId;
    public static int draconicScoopId;
    public static int legendaryScoopId;
    public static int uberScoopId;

    public static int reinforcedGrafterId;   
    public static int draconicGrafterId;
    public static int legendaryGrafterId;
    public static int uberGrafterId;
    
    public static int draconicBlockId;
    public static int reinforcedBlockId;
    public static int draconicOreId;

    public static boolean dragonEggRecipe;
}

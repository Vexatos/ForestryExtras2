package forestryextras.main.init;

import java.util.HashMap;

import cpw.mods.fml.common.Loader;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import forestry.api.apiculture.IBeeRoot;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;
import forestry.api.genetics.AlleleManager;
import forestryextras.helpers.CombHelper;
import forestryextras.items.FEItemComb;
import forestryextras.items.bees.Allele;
import forestryextras.items.bees.BeeClassification;
import forestryextras.items.bees.BeeMutation;
import forestryextras.items.bees.GenomeManager;
import forestryextras.items.bees.Species;
import forestryextras.main.Config;

public class Bees {

	public static void init()
	{
		initCombs();
		initSpecies();
		initMutations();
	}
	public static IBeeRoot beeRoot;

	public static void initSpecies()
	{
		beeRoot = (IBeeRoot) AlleleManager.alleleRegistry.getSpeciesRoot("rootBees");
		
		draconicBee = new Species("draconic", "draconic", BeeClassification.DRACONIC, 0x990000, 0xCC0033, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
		draconicBee.addProduct(new ItemStack(Bees.comb, 1, 0), 12)
		.setGenome(GenomeManager.getDraconicTemplate())
		.register();
		
		reinforcedBee = new Species("reinforced", "reinforced", BeeClassification.REINFORCED, 0xCCCC99, 0xFFFFCC, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
		reinforcedBee.addProduct(new ItemStack(Bees.comb, 1, 1), 25)
		.setGenome(GenomeManager.getReinforcedTemplate())
		.register();
		
		if(Loader.isModLoaded("Thaumcraft") && OreDictionary.getOres("ingotThaumium").size() > 0){
		thaumiumBee = new Species("thaumium", "thaumium", BeeClassification.THAUMIUM, 0x000000, 0x9900FF, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
		thaumiumBee.addProduct(new ItemStack(Bees.comb, 1, 2), 25)
		.setGenome(GenomeManager.getThaumiumTemplate())
		.register();}
		
		if(Loader.isModLoaded("ThaumcraftExtras") && OreDictionary.getOres("ingotDarkThaumium").size() > 0){
		darkThaumiumBee = new Species("darkThaumium", "darkThaumium", BeeClassification.DARKTHAUMIUM, 0xafffb7, 0xafffb7, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
		darkThaumiumBee.addProduct(new ItemStack(Bees.comb, 1, 3), 25)
		.setGenome(GenomeManager.getDarkThaumiumTemplate())
		.register();}
		
		if(Loader.isModLoaded("ExtraTiC") && OreDictionary.getOres("ingotFairy").size() > 0){
			fairyBee = new Species("fairy", "fairy", BeeClassification.FAIRY, 0xFF66FF, 0xCC3333, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
			fairyBee.addProduct(new ItemStack(Bees.comb, 1, 4), 25)
			.setGenome(GenomeManager.getFairyTemplate())
			.register();}
		
		if(Loader.isModLoaded("ExtraTiC") && OreDictionary.getOres("ingotPokefennium").size() > 0){
			pokefenniumBee = new Species("pokefennium", "pokefennium", BeeClassification.POKEFENNIUM, 0x99CCFF, 0x9999FF, EnumTemperature.NORMAL, EnumHumidity.NORMAL, true, false, false, true);
			pokefenniumBee.addProduct(new ItemStack(Bees.comb, 1, 5), 25)
			.setGenome(GenomeManager.getPokefenniumTemplate())
			.register();}
	}
	public static Species draconicBee;
	public static Species reinforcedBee;
	public static Species darkThaumiumBee;
	public static Species thaumiumBee;
	public static Species pokefenniumBee;
	public static Species fairyBee;

	public static void initMutations()
	{
		new BeeMutation(Allele.getBaseSpecies("Industrious"), Allele.getBaseSpecies("Noble"), GenomeManager.getReinforcedTemplate(), 5);
		new BeeMutation(Allele.getBaseSpecies("Industrious"), Bees.reinforcedBee, GenomeManager.getDraconicTemplate(), 5);
		
		if(Loader.isModLoaded("Thaumcraft") && OreDictionary.getOres("ingotThaumium").size() > 0){
			new BeeMutation(Allele.getBaseSpecies("Industrious"), Allele.getBaseSpecies("Edenic"), GenomeManager.getThaumiumTemplate(), 5);}
		
		if(Loader.isModLoaded("ThaumcraftExtras") && OreDictionary.getOres("ingotDarkThaumium").size() > 0){
			new BeeMutation(Bees.thaumiumBee, Allele.getBaseSpecies("Edenic"), GenomeManager.getDarkThaumiumTemplate(), 5);}
	
		if(Loader.isModLoaded("ExtraTiC") && OreDictionary.getOres("ingotPokefennium").size() > 0){
			new BeeMutation(Bees.reinforcedBee, Allele.getBaseSpecies("Edenic"), GenomeManager.getPokefenniumTemplate(), 5);}
		
		if(Loader.isModLoaded("ExtraTiC") && OreDictionary.getOres("ingotFairy").size() > 0){
			new BeeMutation(Bees.reinforcedBee, Allele.getBaseSpecies("Heroic"), GenomeManager.getFairyTemplate(), 5);}
		
	}
	
	public static void initCombs()
	{
		//HashMap<ItemStack, Integer> products = new HashMap<ItemStack, Integer>();
		ItemStack[] products;
		int[] chance;
		
		products = new ItemStack[]{new ItemStack(Items.nugget, 1, 0), OreDictionary.getOres("dropHoney").get(0)};
		chance = new int[]{10, 75};
		CombHelper.addCombToMap(0, "Draconic", 0x990000, 0xCC0033, products, chance);
		products = new ItemStack[]{new ItemStack(Items.nugget, 1, 1), OreDictionary.getOres("dropHoney").get(0)};
		chance = new int[]{25, 75};
		CombHelper.addCombToMap(1, "Reinforced", 0xCCCC99, 0xFFFFCC, products, chance);
	
		if(Loader.isModLoaded("Thaumcraft") && OreDictionary.getOres("ingotThaumium").size() > 0){
		products = new ItemStack[]{new ItemStack(Items.nugget, 1, 2), OreDictionary.getOres("dropHoney").get(0)};
		chance = new int[]{25, 75};
		CombHelper.addCombToMap(2, "Thaumium", 0x000000, 0x9900FF, products, chance);}
	
		if(Loader.isModLoaded("ThaumcraftExtras") && OreDictionary.getOres("ingotDarkThaumium").size() > 0){
		products = new ItemStack[]{new ItemStack(Items.nugget, 1, 3), OreDictionary.getOres("dropHoney").get(0)};
		chance = new int[]{15, 75};
		CombHelper.addCombToMap(3, "Dark Thaumium", 0xafffb7, 0xafffb7, products, chance);}
		
		if(Loader.isModLoaded("ExtraTiC") && OreDictionary.getOres("ingotFairy").size() > 0){
		products = new ItemStack[]{new ItemStack(Items.nugget, 1, 4), OreDictionary.getOres("dropHoney").get(0)};
		chance = new int[]{15, 75};
		CombHelper.addCombToMap(3, "Fairy", 0xFF99CC, 0xFFCC00, products, chance);}
			
		if(Loader.isModLoaded("ExtraTiC") && OreDictionary.getOres("ingotPokefennium").size() > 0){
		products = new ItemStack[]{new ItemStack(Items.nugget, 1, 5), OreDictionary.getOres("dropHoney").get(0)};
		chance = new int[]{15, 75};
		CombHelper.addCombToMap(4, "Pokefennium", 0x9966CC, 0x99FFCC, products, chance);}
	
		comb = new FEItemComb(Config.honeyCombId);
		CombHelper.addRecipes();
	}
	public static FEItemComb comb;
}

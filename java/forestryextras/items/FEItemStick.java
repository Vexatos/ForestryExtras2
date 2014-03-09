package forestryextras.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestryextras.main.Main;
import forestryextras.main.init.Tabs;

public class FEItemStick extends Item{

	public FEItemStick(int id, String itemName, int itemColor, String oreDictName, ItemStack material) {
		super(id);
		setUnlocalizedName(Main.alias.toLowerCase() + "." + "item" + "." + itemName);
		setCreativeTab(Tabs.tabMain);
		name = itemName;
		color = itemColor;
		oreDict = oreDictName;
		mat = material;
		init();
	}
	String name;
	String oreDict;
	int color;
	ItemStack mat;
	
	public void init()
	{
		GameRegistry.registerItem(this, this.getUnlocalizedName());
		OreDictionary.registerOre(oreDict, this);
		
		recipes();
	}
	
	public void recipes()
	{
		GameRegistry.addShapedRecipe(new ItemStack(this, 4, 0), new Object[]{
			" X",
			"X ",
			'X', mat});
	}
	
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int id)
	{
		return color;
	}
	
	@Override
    public void registerIcons(IconRegister ir) 
	{
        itemIcon = ir.registerIcon(Main.modName.toLowerCase() + ":" + "stick");
	}
}

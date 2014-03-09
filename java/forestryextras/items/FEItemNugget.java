package forestryextras.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestryextras.helpers.CombHelper;
import forestryextras.helpers.NuggetHelper;
import forestryextras.main.Main;
import forestryextras.main.init.Tabs;

public class FEItemNugget extends Item{
	public FEItemNugget(int id) {
		super(id);
		setCreativeTab(Tabs.tabMain);
        setHasSubtypes(true);
        setUnlocalizedName(getUnlocalizedName());
		init();
	}
	
	//@Override
	//public String getItemDisplayName(ItemStack stack) {
	//	return "item.fe.nugget." + NuggetHelper.name.get(stack.getItemDamage()).toLowerCase() ;
	//}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item.fe.nugget." + CombHelper.name.get(stack.getItemDamage()).toLowerCase() ;
	}
	
	public void init()
	{
		GameRegistry.registerItem(this, this.getUnlocalizedName());
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int id, CreativeTabs creativeTab, List list) {
		for(int i = 0; i < NuggetHelper.nuggets.size(); i++) {
			list.add(new ItemStack(id, 1, i));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int pass)
	{		
			return NuggetHelper.color.get(stack.getItemDamage());
	}
	
	@Override
    public void registerIcons(IconRegister ir) 
	{
        itemIcon = ir.registerIcon(Main.modName.toLowerCase() + ":" + "nugget");
	}
}

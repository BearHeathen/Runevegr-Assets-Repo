package net.gloomshroud.runevegr.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase ingotMithril;
	public static ItemBase dustDwimmerdust;
	
	public static void init(){
		ingotMithril = register(new ItemBase("ingot_mithril").setCreativeTab(CreativeTabs.MATERIALS));
		dustDwimmerdust = register(new ItemBase("dust_dwimmerdust").setCreativeTab(CreativeTabs.MATERIALS));
		
	}
	
	public static <T extends Item> T register(T item){
		GameRegistry.register(item);
		
		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}
		return item;
		
	}

}

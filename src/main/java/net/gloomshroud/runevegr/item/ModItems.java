package net.gloomshroud.runevegr.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase ingotMithril;
	public static ItemBase dustDwimmerdust;
	
	// Crops
	public static ItemBarleySeed barleySeed;
	public static ItemBase barley;
	
	public static void init(){
		ingotMithril = register(new ItemOre("ingot_mithril", "ingotMithril"));
		dustDwimmerdust = register(new ItemBase("dust_dwimmerdust"));
		barleySeed = register(new ItemBarleySeed());
		barley = register(new ItemBase("barley"));
	}
	
	public static <T extends Item> T register(T item){
		GameRegistry.register(item);
		
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		if (item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}
		return item;
		
	}

}

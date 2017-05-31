package net.gloomshroud.runevegr.item;

import net.gloomshroud.runevegr.Runevegr;
import net.gloomshroud.runevegr.item.tool.ItemAxe;
import net.gloomshroud.runevegr.item.tool.ItemHoe;
import net.gloomshroud.runevegr.item.tool.ItemPickaxe;
import net.gloomshroud.runevegr.item.tool.ItemShovel;
import net.gloomshroud.runevegr.item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase ingotMithril;
	public static ItemBase dustDwimmerdust;
	public static ItemSword mithrilSword;
	public static ItemPickaxe mithrilPickaxe;
	public static ItemAxe mithrilAxe;
	public static ItemShovel mithrilShovel;
	public static ItemHoe mithrilHoe;
	
	// Crops
	public static ItemBarleySeed barleySeed;
	public static ItemBase barley;
	
	public static void init(){
		ingotMithril = register(new ItemOre("ingot_mithril", "ingotMithril"));
		dustDwimmerdust = register(new ItemBase("dust_dwimmerdust"));
		barleySeed = register(new ItemBarleySeed());
		barley = register(new ItemBase("barley"));
		mithrilSword = register(new ItemSword(Runevegr.mithrilToolMaterial, "mithril_sword"));
		mithrilPickaxe = register(new ItemPickaxe(Runevegr.mithrilToolMaterial, "mithril_pickaxe"));
		mithrilAxe = register(new ItemAxe(Runevegr.mithrilToolMaterial, "mithril_axe"));
		mithrilShovel = register(new ItemShovel(Runevegr.mithrilToolMaterial, "mithril_shovel"));
		mithrilHoe = register(new ItemHoe(Runevegr.mithrilToolMaterial, "mithril_hoe"));
		
		
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

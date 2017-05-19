package net.gloomshroud.runevegr.client;

import net.gloomshroud.runevegr.References;
import net.gloomshroud.runevegr.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RunevegrTab extends CreativeTabs {
	
	public RunevegrTab() {
		super(References.MOD_ID);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.dustDwimmerdust);
	}

}

package net.gloomshroud.runevegr.item;

import net.gloomshroud.runevegr.Runevegr;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModelProvider{
	
	protected String name;
	
	public ItemBase(String name){
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public void registerItemModel(Item item){
		Runevegr.proxy.registerItemRenderer(item, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
	
}

package net.gloomshroud.runevegr.item.tool;

import net.gloomshroud.runevegr.Runevegr;
import net.gloomshroud.runevegr.item.ItemModelProvider;
import net.minecraft.item.Item;

public class ItemHoe extends net.minecraft.item.ItemHoe implements ItemModelProvider{
	
	private String name;
	
	public ItemHoe(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		Runevegr.proxy.registerItemRenderer(this, 0, name);
		
	}

}

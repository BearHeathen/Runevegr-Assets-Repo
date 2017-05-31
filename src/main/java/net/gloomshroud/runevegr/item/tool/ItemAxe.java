package net.gloomshroud.runevegr.item.tool;

import net.gloomshroud.runevegr.Runevegr;
import net.gloomshroud.runevegr.item.ItemModelProvider;
import net.minecraft.item.Item;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {
	
	private String name;
	
	public ItemAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		
	}

	@Override
	public void registerItemModel(Item item) {
		Runevegr.proxy.registerItemRenderer(this, 0, name);
		
	}

}

package net.gloomshroud.runevegr.item;

import net.gloomshroud.runevegr.Runevegr;
import net.gloomshroud.runevegr.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemBarleySeed extends ItemSeeds implements ItemModelProvider{
	
	public ItemBarleySeed() {
		super(ModBlocks.cropBarley, Blocks.FARMLAND);
		setUnlocalizedName("barley_seed");
		setRegistryName("barley_seed");
	}

	@Override
	public void registerItemModel(Item item) {
		Runevegr.proxy.registerItemRenderer(item, 0, "barley_seed");
		
	}

}

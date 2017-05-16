package net.gloomshroud.runevegr.block;

import net.gloomshroud.runevegr.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropBarley extends BlockCrops {
	
	public BlockCropBarley() {
		setUnlocalizedName("crop_barley");
		setRegistryName("crop_barley");
	}
	
	@Override
	protected Item getSeed(){
		return ModItems.barleySeed;
	}
	
	@Override
	protected Item getCrop(){
		return ModItems.barley;
	}

}

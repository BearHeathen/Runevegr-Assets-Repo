package net.gloomshroud.runevegr.block;

import net.gloomshroud.runevegr.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockOre oreMithril;
	public static BlockCropBarley cropBarley;
	
	public static void init() {
		oreMithril = register(new BlockOre("ore_mithril"));
		cropBarley = register(new BlockCropBarley(), null);
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		if (itemBlock != null) {
			GameRegistry.register(itemBlock);
		}
		
		
		if (block instanceof ItemModelProvider) {
			((ItemModelProvider)block).registerItemModel(itemBlock);
		}
		return block;
		
	}
	
	private  static <T extends Block> T register(T block){
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}

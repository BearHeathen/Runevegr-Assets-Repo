package net.gloomshroud.runevegr.block;

import net.gloomshroud.runevegr.item.ItemModelProvider;
import net.gloomshroud.runevegr.item.ItemOreDict;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockOre oreMithril;
	public static BlockCropBarley cropBarley;
	
	public static void init() {
		oreMithril = register(new BlockOre("ore_mithril", "oreMithril"));
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
		if (block instanceof ItemOreDict){
			((ItemOreDict)block).initOreDict();
		}
		if (itemBlock instanceof ItemOreDict){
			((ItemOreDict)itemBlock).initOreDict();
		}
		return block;
		
	}
	
	private  static <T extends Block> T register(T block){
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}

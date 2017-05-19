package net.gloomshroud.runevegr.recipe;

import net.gloomshroud.runevegr.block.ModBlocks;
import net.gloomshroud.runevegr.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init(){
		
		// 1 Mithril ore = 1 Mithril ingot
		GameRegistry.addSmelting(ModBlocks.oreMithril, new ItemStack(ModItems.ingotMithril), 0.7f);
	}
}

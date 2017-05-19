package net.gloomshroud.runevegr.proxy;

import net.gloomshroud.runevegr.block.ModBlocks;
import net.gloomshroud.runevegr.item.ModItems;
import net.gloomshroud.runevegr.recipe.ModRecipes;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id){
		
	}
	public void preInit(FMLPreInitializationEvent event){
		ModBlocks.init();
		ModItems.init();
	}
	
	public void init(FMLInitializationEvent event){
		ModRecipes.init();
		
	}
	
	public void postInit(FMLPostInitializationEvent event){
		
	}

}

package net.gloomshroud.runevegr;

import net.gloomshroud.runevegr.item.ModItems;
import net.gloomshroud.runevegr.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MOD_ID, name = References.NAME, version = References.VERSION)
public class Runevegr {
	
	@Mod.Instance(References.MOD_ID)
	public static Runevegr instance;
	
	@SidedProxy(serverSide = References.SERVER_SIDE, clientSide = References.CLIENT_SIDE)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println(References.NAME + " is loading!");
		ModItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}

}

package net.gloomshroud.runevegr;

import net.gloomshroud.runevegr.client.RunevegrTab;
import net.gloomshroud.runevegr.proxy.CommonProxy;
import net.gloomshroud.runevegr.world.ModWorldGen;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = References.MOD_ID, name = References.NAME, version = References.VERSION)
public class Runevegr {
	
	public static final RunevegrTab creativeTab = new RunevegrTab();
	
	@Mod.Instance(References.MOD_ID)
	public static Runevegr instance;
	
	@SidedProxy(serverSide = References.SERVER_SIDE, clientSide = References.CLIENT_SIDE)
	public static CommonProxy proxy;
	
	// Tool materials
	public static final Item.ToolMaterial mithrilToolMaterial = EnumHelper.addToolMaterial("MITHRIL", 2, 500, 6, 2, 14);
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit(event);
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
		
	}

}

package net.gloomshroud.runevegr.block;

import net.gloomshroud.runevegr.item.ItemOreDict;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase implements ItemOreDict{
	
	private String oreName;
	
	public BlockOre(String name, String oreName) {
		super(Material.ROCK, name);
		this.oreName = oreName;
		setHardness(3f);
		setResistance(5f);
	}

	@Override
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
		
	}
	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}
	
}

package net.gloomshroud.runevegr.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockPedestal extends BlockBase {

	public BlockPedestal() {
		super(Material.ROCK, "pedestal");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state){
		return false;
	}
	
	
	@Override
	@Deprecated
	public boolean isFullCube(IBlockState state){
		return false;
	}

}

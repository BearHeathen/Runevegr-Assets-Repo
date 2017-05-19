package net.gloomshroud.runevegr.block;

import net.gloomshroud.runevegr.Runevegr;
import net.gloomshroud.runevegr.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class BlockCropBarley extends BlockCrops {
	
	public BlockCropBarley() {
		setUnlocalizedName("crop_barley");
		setRegistryName("crop_barley");
		setCreativeTab(Runevegr.creativeTab);
	}
	
	@Override
	protected Item getSeed(){
		return ModItems.barleySeed;
	}
	
	@Override
	protected Item getCrop(){
		return ModItems.barley;
	}
	
	@Override
	public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn) 
	{
		if(!worldIn.isRemote)
		{
			spawnAsEntity(worldIn, pos, new ItemStack(ModItems.barley));
		}
	}
	
	
	//Added per Elucent
	@Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos){
        return EnumPlantType.Crop;
    }

}

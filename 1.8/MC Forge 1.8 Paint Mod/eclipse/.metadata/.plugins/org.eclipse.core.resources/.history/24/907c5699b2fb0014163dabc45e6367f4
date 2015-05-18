package com.mp_Poder.item;

import java.util.List;

import com.mp_Poder.blocks.BlockRegistry;
import com.mp_Poder.paintmod.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BrushItem extends Item {
	
	int color = 0;
	int X;
	int Y;
	int Z;
	
	public BrushItem(int clr)
	{
		color = clr;
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		X = pos.getX();
		Y = pos.getY();
		Z = pos.getZ();
		
        return false;
    }

	public boolean HasIntEquivalence(int[] array, int id)
	{
		boolean eq = false;
		
		for (int i=1;i<array.length;i++)
		{
			if (array[i] == id)
			{
				eq = true;
				break;
			}
		}
		
		return eq;
	}
	
	public int[] GetModWoodIds()
	{
		int[] ids = {BlockRegistry.RedWood.getIdFromBlock(BlockRegistry.RedWood),
				BlockRegistry.BlackWood.getIdFromBlock(BlockRegistry.BlackWood),
				BlockRegistry.BlueWood.getIdFromBlock(BlockRegistry.BlueWood),
				BlockRegistry.BrownWood.getIdFromBlock(BlockRegistry.BrownWood),
				BlockRegistry.CamoWood.getIdFromBlock(BlockRegistry.CamoWood),
				BlockRegistry.DarkBlueWood.getIdFromBlock(BlockRegistry.DarkBlueWood),
				BlockRegistry.GreenWood.getIdFromBlock(BlockRegistry.GreenWood),
				BlockRegistry.LightRedWood.getIdFromBlock(BlockRegistry.LightRedWood),
				BlockRegistry.MagentaWood.getIdFromBlock(BlockRegistry.MagentaWood),
				BlockRegistry.OrangeWood.getIdFromBlock(BlockRegistry.OrangeWood),
				BlockRegistry.PurpleWood.getIdFromBlock(BlockRegistry.PurpleWood),
				BlockRegistry.VioletWood.getIdFromBlock(BlockRegistry.VioletWood),
				BlockRegistry.WhiteWood.getIdFromBlock(BlockRegistry.WhiteWood),
				BlockRegistry.YellowWood.getIdFromBlock(BlockRegistry.YellowWood),
				BlockRegistry.GrayWood.getIdFromBlock(BlockRegistry.GrayWood)};
		
		return ids;
	}
	
	public int[] GetModStoneIds()
	{
		int[] ids = {BlockRegistry.RedStone.getIdFromBlock(BlockRegistry.RedStone),
				BlockRegistry.GreenStone.getIdFromBlock(BlockRegistry.GreenStone)};
		
		return ids;
	}
	
	public IBlockState GetWoodStateByColor(int color)
	{
		return BlockRegistry.WoodStates[color];
	}
	
	public IBlockState GetStoneStateByColor(int color)
	{
		return BlockRegistry.StoneStates[color];
	}
	
	public int GetWoodColorByState(IBlockState block)
	{
		int stat = 0;
		
		for (int i=1;i<BlockRegistry.WoodStates.length;i++)
		{
			if (BlockRegistry.WoodStates[i] == block)
			{
				stat = i;
			}
		}
		
		return stat;
	}
	
	public int GetStoneColorByState(IBlockState block)
	{
		int stat = 0;
		
		for (int i=1;i<BlockRegistry.StoneStates.length;i++)
		{
			if (BlockRegistry.StoneStates[i] == block)
			{
				stat = i;
			}
		}
		
		return stat;
	}
	
	public boolean GetWoodBlockId(int id, Block block)
	{
		return HasIntEquivalence(GetModWoodIds(), id);
	}
	
	public boolean GetStoneBlockId(int id, Block block)
	{
		return HasIntEquivalence(GetModStoneIds(), id);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
		if (X == 0 && Y == 0 && Z == 0)
		{
			return itemStackIn;
		}
		else
		{
			Chunk entityC = worldIn.getChunkFromBlockCoords(new BlockPos(X, Y, Z));
			Block targetB = entityC.getBlock(X, Y, Z);
			boolean success = true;
			if (targetB.getIdFromBlock(targetB) == 5 || GetWoodBlockId(targetB.getIdFromBlock(targetB), targetB))
			{
				IBlockState state = GetWoodStateByColor(color);
				
				if (state == null || GetWoodColorByState(targetB.getDefaultState()) == color){return itemStackIn;}else{
				worldIn.destroyBlock(new BlockPos(X, Y, Z), false);
				worldIn.setBlockState(new BlockPos(X, Y, Z), state); }
			}
			else if (targetB.getIdFromBlock(targetB) == 1 || GetStoneBlockId(targetB.getIdFromBlock(targetB), targetB))
		    {
                IBlockState state = GetStoneStateByColor(color);
                
				if (state == null || GetStoneColorByState(targetB.getDefaultState()) == color){return itemStackIn;}else{
				worldIn.destroyBlock(new BlockPos(X, Y, Z), false);
				worldIn.setBlockState(new BlockPos(X, Y, Z), state); }
			}
			else
			{
				success = false;
			}
			
			if ((!playerIn.capabilities.isCreativeMode && success) && !MainRegistry.HackerMode){
					ItemStack newStack = new ItemStack(Brush.PaintBrush, 1);
					
					return newStack;
			}
		}
			return itemStackIn;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		
	}
}

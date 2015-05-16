package com.mp_Poder.blocks;

import com.mp_Poder.paintmod.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class PaintBlockStairs extends BlockStairs{

	public PaintBlockStairs(IBlockState model) {
		super(model);
		this.setCreativeTab(MainRegistry.tabBrush);
	}
	
}

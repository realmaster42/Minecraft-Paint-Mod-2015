package com.mp_Poder.blocks;

import com.mp_Poder.paintmod.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.util.BlockPos;

public class ModBlock extends Block{
	
	public ModBlock(Material materialIn) {
		super(materialIn);
		this.setCreativeTab(MainRegistry.tabBrush);
		if(materialIn == Material.wood)
		{
			this.setHardness(2F); 
			this.setStepSound(soundTypeWood);
		}
		else if(materialIn == Material.rock)
		{
			this.setHardness(1.5F);
			this.setStepSound(soundTypeMetal);
		}
	}
   
}
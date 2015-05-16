package com.mp_Poder.blocks;

import com.mp_Poder.paintmod.MainRegistry;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.ItemStack;

public class PaintBlockSlab extends BlockSlab{
    
	int color;
	boolean isdouble;
	
	public PaintBlockSlab(int id, boolean full, Material materialIn) {
		super(materialIn);
		this.setCreativeTab(MainRegistry.tabBrush);
		isdouble = full;
		color = id;
	}
	
	public String getFullSlabName(int id){
		return null;
	}

	@Override
	public String getUnlocalizedName(int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDouble() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IProperty getVariantProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getVariant(ItemStack stack) {
		// TODO Auto-generated method stub
		return null;
	}
}

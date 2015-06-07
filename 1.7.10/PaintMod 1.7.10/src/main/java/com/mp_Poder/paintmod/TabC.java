package com.mp_Poder.paintmod;

import com.mp_Poder.item.Brush;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabC extends CreativeTabs {

	public TabC(String label) {
		super(label);
	}
	
	@Override
	public Item getTabIconItem() {
		return Brush.PaintBrush;
	}
}

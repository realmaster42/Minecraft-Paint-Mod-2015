package com.mp_Poder.blocks;

import com.mp_Poder.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
//import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
//import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistry {
	//Wood
	public static Block RedWood;
	public static Block GreenWood;
	public static Block YellowWood;
	public static Block OrangeWood;
	public static Block MagentaWood;
	public static Block VioletWood;
	public static Block PurpleWood;
	public static Block LightRedWood;
	public static Block CamoWood;
	public static Block WhiteWood;
	public static Block BlackWood;
	public static Block BrownWood;
	public static Block DarkBlueWood;
	public static Block BlueWood;
	public static Block GrayWood;
	
	//Stones
	public static Block RedStoneBlock;
	public static Block GreenStone;
	public static Block YellowStone;
	public static Block OrangeStone;
	
	//States
	public static Block[] WoodStates;
	public static Block[] StoneStates;

	public static void initializeBlock(){
		RedWood = new ModBlock(Material.wood).setBlockName("RedWood");
		GreenWood = new ModBlock(Material.wood).setBlockName("GreenWood");
		YellowWood = new ModBlock(Material.wood).setBlockName("YellowWood");
		OrangeWood = new ModBlock(Material.wood).setBlockName("OrangeWood");
		MagentaWood = new ModBlock(Material.wood).setBlockName("MagentaWood");
		VioletWood = new ModBlock(Material.wood).setBlockName("VioletWood");
		PurpleWood = new ModBlock(Material.wood).setBlockName("PurpleWood");
		LightRedWood = new ModBlock(Material.wood).setBlockName("LightRedWood");
		CamoWood = new ModBlock(Material.wood).setBlockName("CamoWood");
		WhiteWood = new ModBlock(Material.wood).setBlockName("WhiteWood");
		BlackWood = new ModBlock(Material.wood).setBlockName("BlackWood");
		BrownWood = new ModBlock(Material.wood).setBlockName("BrownWood");
		DarkBlueWood = new ModBlock(Material.wood).setBlockName("DarkBlueWood");
		BlueWood = new ModBlock(Material.wood).setBlockName("BlueWood");
		GrayWood = new ModBlock(Material.wood).setBlockName("GrayWood");
		
		RedStoneBlock = new ModBlock(Material.rock).setBlockName("BlockStoneRed");
		GreenStone = new ModBlock(Material.rock).setBlockName("GreenStone");
		YellowStone = new ModBlock(Material.rock).setBlockName("YellowStone");
		OrangeStone = new ModBlock(Material.rock).setBlockName("OrangeStone");
		
		WoodStates = new Block[]{
				null,
				RedWood,
				GreenWood,
				YellowWood,
				OrangeWood,
				MagentaWood,
				VioletWood,
				PurpleWood,
				LightRedWood,
				CamoWood,
				WhiteWood,
				BlackWood,
				BrownWood,
				DarkBlueWood,
				BlueWood,
				GrayWood
		};
		StoneStates = new Block[]{
				null,
				RedStoneBlock,
				GreenStone,
				YellowStone,
				OrangeStone
		};
	}
    
	public static void register(){
		GameRegistry.registerBlock(RedWood, RedWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(GreenWood, GreenWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(YellowWood, YellowWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(OrangeWood, OrangeWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(MagentaWood, MagentaWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(VioletWood, VioletWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(PurpleWood, PurpleWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(LightRedWood, LightRedWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CamoWood, CamoWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(WhiteWood, WhiteWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlackWood, BlackWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BrownWood, BrownWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(DarkBlueWood, DarkBlueWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(BlueWood, BlueWood.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(GrayWood, GrayWood.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(RedStoneBlock, RedStoneBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(GreenStone, GreenStone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(YellowStone, YellowStone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(OrangeStone, OrangeStone.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(RedWood);
		registerRender(GreenWood);
		registerRender(YellowWood);
		registerRender(OrangeWood);
		registerRender(MagentaWood);
		registerRender(VioletWood);
		registerRender(PurpleWood);
		registerRender(LightRedWood);
		registerRender(CamoWood);
		registerRender(WhiteWood);
		registerRender(BlackWood);
		registerRender(BrownWood);
		registerRender(DarkBlueWood);
		registerRender(BlueWood);
		registerRender(GrayWood);
		registerRender(GreenWood);
		
		registerRender(RedStoneBlock);
		registerRender(GreenStone);
		registerRender(YellowStone);
		registerRender(OrangeStone);
	}
	
	public static void registerRender(Block block)
	{
		//Item item = Item.getItemFromBlock(block);
		
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RefStrings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		block.setBlockTextureName(RefStrings.MODID + ":" + block.getUnlocalizedName());
	}
}

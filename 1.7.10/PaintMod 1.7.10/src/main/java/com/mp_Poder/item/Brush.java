package com.mp_Poder.item;

import com.mp_Poder.lib.RefStrings;
import com.mp_Poder.paintmod.MainRegistry;

import net.minecraft.client.Minecraft;
//import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Brush {
	
	public static Item PaintBrush;
	public static Item RedPaintBrush;
	public static Item GreenPaintBrush;
	public static Item YellowPaintBrush;
	public static Item OrangePaintBrush;
	public static Item MagentaPaintBrush;
	public static Item VioletPaintBrush;
	public static Item PurplePaintBrush;
	public static Item LightRedPaintBrush;
	public static Item CamoPaintBrush;
	public static Item WhitePaintBrush;
	public static Item BlackPaintBrush;
	public static Item BrownPaintBrush;
	public static Item DarkBluePaintBrush;
	public static Item BluePaintBrush;
	public static Item GrayPaintBrush;
	
	public static Item PaintBrushString;
	public static Item WhiteDust;
	
	public static void initializeItem(){
		PaintBrush = new BrushItem(0).setUnlocalizedName("PaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":PaintBrush");
		//Colored Brush
		RedPaintBrush = new BrushItem(1).setUnlocalizedName("RedPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":RedPaintBrush");
		GreenPaintBrush = new BrushItem(2).setUnlocalizedName("GreenPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":GreenPaintBrush");
		YellowPaintBrush = new BrushItem(3).setUnlocalizedName("YellowPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":YellowPaintBrush");
		OrangePaintBrush = new BrushItem(4).setUnlocalizedName("OrangePaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":OrangePaintBrush");
		MagentaPaintBrush = new BrushItem(5).setUnlocalizedName("MagentaPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":MagentaPaintBrush");
		VioletPaintBrush = new BrushItem(6).setUnlocalizedName("VioletPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":VioletPaintBrush");
		PurplePaintBrush = new BrushItem(7).setUnlocalizedName("PurplePaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":PurplePaintBrush");
		LightRedPaintBrush = new BrushItem(8).setUnlocalizedName("LightRedPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":LightRedPaintBrush");
		CamoPaintBrush = new BrushItem(9).setUnlocalizedName("CamoPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":CamoPaintBrush");
		WhitePaintBrush = new BrushItem(10).setUnlocalizedName("WhitePaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":WhitePaintBrush");
		BlackPaintBrush = new BrushItem(11).setUnlocalizedName("BlackPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":BlackPaintBrush");
		BrownPaintBrush = new BrushItem(12).setUnlocalizedName("BrownPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":BrownPaintBrush");
		DarkBluePaintBrush = new BrushItem(13).setUnlocalizedName("DarkBluePaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":DarkBluePaintBrush");
		BluePaintBrush = new BrushItem(14).setUnlocalizedName("BluePaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":BluePaintBrush");
		GrayPaintBrush = new BrushItem(15).setUnlocalizedName("GrayPaintBrush").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":GrayPaintBrush");
		
		PaintBrushString = new Item().setUnlocalizedName("PaintBrushString").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":PaintBrushString");
		WhiteDust = new Item().setUnlocalizedName("WhiteDust").setCreativeTab(MainRegistry.tabBrush).setTextureName(RefStrings.MODID + ":WhiteDust");
	}
	
	public static void register(){
		GameRegistry.registerItem(PaintBrush, PaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(RedPaintBrush, RedPaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(GreenPaintBrush, GreenPaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(YellowPaintBrush, YellowPaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(OrangePaintBrush, OrangePaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MagentaPaintBrush, MagentaPaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(VioletPaintBrush, VioletPaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(PurplePaintBrush, PurplePaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(LightRedPaintBrush, LightRedPaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CamoPaintBrush, CamoPaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(WhitePaintBrush, WhitePaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BlackPaintBrush, BlackPaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BrownPaintBrush, BrownPaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DarkBluePaintBrush, DarkBluePaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BluePaintBrush, BluePaintBrush.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(GrayPaintBrush, GrayPaintBrush.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(PaintBrushString, PaintBrushString.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(WhiteDust, WhiteDust.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		//Colored Brush
		//TODO: Color stairs
		//TODO: Color slabs
		//TODO: Color double-slabs
		//TODO: Color stairs - make combatible recipes
		registerRender(PaintBrush);
		registerRender(RedPaintBrush);
		registerRender(GreenPaintBrush);
		registerRender(YellowPaintBrush);
		registerRender(OrangePaintBrush);
		registerRender(MagentaPaintBrush);
		registerRender(VioletPaintBrush);
		registerRender(PurplePaintBrush);
		registerRender(LightRedPaintBrush);
		registerRender(CamoPaintBrush);
		registerRender(WhitePaintBrush);
		registerRender(BlackPaintBrush);
		registerRender(BrownPaintBrush);
		registerRender(DarkBluePaintBrush);
		registerRender(BluePaintBrush);
		registerRender(GrayPaintBrush);
		
		registerRender(PaintBrushString);
		registerRender(WhiteDust);
	}
	
	public static void registerRender(Item item){
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RefStrings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	/*public static void registerItems(){
		GameRegistry.registerItem(PaintBrushString, PaintBrushString.getUnlocalizedName());
		GameRegistry.registerItem(WhiteDust, WhiteDust.getUnlocalizedName());
		GameRegistry.registerItem(PaintBrush, PaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(RedPaintBrush, RedPaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(GreenPaintBrush, GreenPaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(YellowPaintBrush, YellowPaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(OrangePaintBrush, OrangePaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(MagentaPaintBrush, MagentaPaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(VioletPaintBrush, VioletPaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(PurplePaintBrush, PurplePaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(LightRedPaintBrush, LightRedPaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(CamoPaintBrush, CamoPaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(WhitePaintBrush, WhitePaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(BlackPaintBrush, BlackPaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(BrownPaintBrush, BrownPaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(DarkBluePaintBrush, DarkBluePaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(BluePaintBrush, BluePaintBrush.getUnlocalizedName());
		GameRegistry.registerItem(GrayPaintBrush, GrayPaintBrush.getUnlocalizedName());
	}*/
}

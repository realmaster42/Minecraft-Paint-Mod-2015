package com.mp_Poder.paintmod;

import org.apache.logging.log4j.Level;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import com.mp_Poder.blocks.BlockRegistry;
import com.mp_Poder.item.Brush;
import com.mp_Poder.lib.RefStrings;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {

	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	public static final TabC tabBrush = new TabC("tabC");
	public static boolean HackerMode;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		FMLCommonHandler.instance().bus().register(PreEvent);
    	MinecraftForge.EVENT_BUS.register(PreEvent);
    	
    	Configuration config = new Configuration(PreEvent.getSuggestedConfigurationFile());
    	try{
    	config.load();
    	
    	Property HBoolean = config.get(Configuration.CATEGORY_GENERAL, "HackerMode", false);
    	
    	HBoolean.comment = "In adventure/survival modes, have infinite paint.";
    	HackerMode = config.get(Configuration.CATEGORY_GENERAL, "HackerMode", false).getBoolean(false);
    	
    	BlockRegistry.initializeBlock();
    	BlockRegistry.register();
		Brush.initializeItem();
		Brush.register();
		
		registerRecipes();
    	}
    	catch (Exception e)
    	{
    		FMLLog.log(Level.ERROR, e, RefStrings.MODID + " has failed to load configuration. Options will be default.");
    		HackerMode = false;
    	}
    	finally
    	{
		config.save();
    	}
	}
	@EventHandler
	public static void Load(FMLInitializationEvent event){
		proxy.registerRenders();
		/*if(event.getSide() == Side.CLIENT)
	    {
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
	   
			//blocks
			renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockRegistry.RedWood), 0, new ModelResourceLocation(RefStrings.MODID + ":RedWood", "inventory"));
				
			//items
	        renderItem.getItemModelMesher().register(Brush.PaintBrush, 0, new ModelResourceLocation(RefStrings.MODID + ":PaintBrush", "inventory"));
	        renderItem.getItemModelMesher().register(Brush.RedPaintBrush, 0, new ModelResourceLocation(RefStrings.MODID + ":RedPaintBrush", "inventory"));
	    }*/
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
	
	public static void registerRecipes(){
		GameRegistry.addRecipe(new ItemStack(Brush.PaintBrush, 1),
				"BBB",
				"AAA",
				" A ",
				'A', Items.stick, 'B', Brush.PaintBrushString
				);
		GameRegistry.addRecipe(new ItemStack(Brush.RedPaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 1)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.GreenPaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 10)
	            );
		GameRegistry.addRecipe(new ItemStack(Brush.YellowPaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 11)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.OrangePaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 14)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.MagentaPaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 9)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.VioletPaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 13)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.PurplePaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 5)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.LightRedPaintBrush, 1),
				"AB",
				'A', Brush.RedPaintBrush, 'B', Brush.WhiteDust
				);
		GameRegistry.addRecipe(new ItemStack(Brush.CamoPaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 2)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.WhitePaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', Brush.WhiteDust
				);
		GameRegistry.addRecipe(new ItemStack(Brush.BlackPaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', Items.dye
				);
		GameRegistry.addRecipe(new ItemStack(Brush.BrownPaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 2)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.DarkBluePaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 4)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.BluePaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 12)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.GrayPaintBrush, 1),
				"AB",
				'A', Brush.PaintBrush, 'B', new ItemStack(Items.dye, 1, 8)
				);
		
		GameRegistry.addRecipe(new ItemStack(Brush.PaintBrushString, 3),
				"A",
				'A', Items.string
				);
		GameRegistry.addRecipe(new ItemStack(Brush.WhiteDust, 2),
				"A",
				'A', Items.feather
				);
		
		GameRegistry.addRecipe(new ItemStack(Brush.CamoPaintBrush, 1),
				"AB",
				'A', Brush.GreenPaintBrush, 'B', Brush.WhiteDust
				);
		GameRegistry.addRecipe(new ItemStack(Brush.GreenPaintBrush, 1),
				"AB",
				'A', Brush.CamoPaintBrush, 'B', Items.dye
				);
		GameRegistry.addRecipe(new ItemStack(Brush.RedPaintBrush, 1),
				"AB",
				'A', Brush.LightRedPaintBrush, 'B', Items.dye
				);
		GameRegistry.addRecipe(new ItemStack(Brush.VioletPaintBrush, 1),
				"AB",
				'A', Brush.MagentaPaintBrush, 'B', Items.dye
				);
		GameRegistry.addRecipe(new ItemStack(Brush.PurplePaintBrush, 1),
				"AB",
				'A', Brush.VioletPaintBrush, 'B', Items.dye
				);
		GameRegistry.addRecipe(new ItemStack(Brush.VioletPaintBrush, 1),
				"AB",
				'A', Brush.PurplePaintBrush, 'B', Brush.WhiteDust
				);
		GameRegistry.addRecipe(new ItemStack(Brush.MagentaPaintBrush, 1),
				"AB",
				'A', Brush.VioletPaintBrush, 'B', Brush.WhiteDust
				);
		GameRegistry.addRecipe(new ItemStack(Brush.BrownPaintBrush, 1),
				"AB",
				'A', Brush.BlackPaintBrush, 'B', Brush.WhiteDust
				);
		GameRegistry.addRecipe(new ItemStack(Brush.BlackPaintBrush, 1),
				"AB",
				'A', Brush.BrownPaintBrush, 'B', Items.dye
				);
		GameRegistry.addRecipe(new ItemStack(Brush.BluePaintBrush, 1),
				"AB",
				'A', Brush.DarkBluePaintBrush, 'B', Brush.WhiteDust
				);
		GameRegistry.addRecipe(new ItemStack(Brush.DarkBluePaintBrush, 1),
				"AB",
				'A', Brush.BluePaintBrush, 'B', Items.dye
				);
		GameRegistry.addRecipe(new ItemStack(Brush.WhitePaintBrush, 1),
				"AB",
				'A', Brush.GrayPaintBrush, 'B', new ItemStack(Items.dye, 1, 15)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.GrayPaintBrush, 1),
				"AB",
				'A', Brush.BlackPaintBrush, 'B', new ItemStack(Items.dye, 1, 15)
				);
		GameRegistry.addRecipe(new ItemStack(Brush.BlackPaintBrush, 1),
				"AB",
				'A', Brush.GrayPaintBrush, 'B', Items.dye
				);
		GameRegistry.addRecipe(new ItemStack(Brush.GrayPaintBrush, 1),
				"AB",
				'A', Brush.WhitePaintBrush, 'B', Items.dye
				);
	}
}

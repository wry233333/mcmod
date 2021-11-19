package com.liangliangche.firstmod.Init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static final ItemStack xxx1 = new ItemStack(Items.DYE,1 , 4);
	public static final ItemStack xxx2 = new ItemStack(Items.DYE,1 , 1);
	//public static final ItemStack "name that you difined" = new ItemStack(Items.class,num of needed or outputed , identifier);
	//Then use "GameRegistry.addSmelting(xxx1, xxx2, 0.8f);" to achieve the same effect
	
	public static void init() {
		
		GameRegistry.addSmelting(ModBlocks.First_Block, new ItemStack(Blocks.DIAMOND_ORE), 0.8f);
		//GameRegistry.addSmelting (input block,output£¬xp number);
		
		GameRegistry.addSmelting(xxx1, xxx2, 0.8f);

	}

}

//vanilla blocks:	BLocks.BLOCKNAME
//vanilla items:	Items.ITEMNAME
//mod blocks:		ModBlocks.BLOCKNAME
//mod items:		ModItems.ITEMNAME

package com.liangliangche.firstmod.tabs;

import com.liangliangche.firstmod.Init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class modtab1 extends CreativeTabs{
	
	public modtab1() {
		
		super("mod_tab1_block");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(Item.getItemFromBlock(ModBlocks.First_Block));

	}

}

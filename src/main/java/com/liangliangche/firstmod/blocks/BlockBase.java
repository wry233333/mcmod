package com.liangliangche.firstmod.blocks;

import com.liangliangche.firstmod.Main;
import com.liangliangche.firstmod.Init.ModBlocks;
import com.liangliangche.firstmod.Init.ModItems;
import com.liangliangche.firstmod.Items.ItemBase;
import com.liangliangche.firstmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	public BlockBase(String name,Material material, CreativeTabs tab) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0 ,"inventory");

	}
}

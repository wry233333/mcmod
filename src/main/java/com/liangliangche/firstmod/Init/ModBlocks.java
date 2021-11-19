package com.liangliangche.firstmod.Init;

import java.util.ArrayList;
import java.util.List;

import com.liangliangche.firstmod.Main;
import com.liangliangche.firstmod.Items.ItemBase;
import com.liangliangche.firstmod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block First_Block =new BlockBase("first_block",Material.IRON,Main.MOD_TAB1);
	
	//If you want to creat a NEW tab of your items, use the code below.
	//public static final Block First_Block =new BlockBase("first_block",Material.IRON, Main.MOD_TAB1);
}

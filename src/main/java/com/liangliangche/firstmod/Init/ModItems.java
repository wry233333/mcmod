package com.liangliangche.firstmod.Init;

import java.util.ArrayList;
import java.util.List;

import com.liangliangche.firstmod.Main;
import com.liangliangche.firstmod.Items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {
	//添加物品的数组
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//新建的数组
	public static final Item Small_Shield_Battery = new ItemBase("small_shield_battery",Main.MOD_TAB1);
	public static final Item Big_Shield_Battery = new ItemBase("big_shield_battery",Main.MOD_TAB1);
	public static final Item Big_Yao = new ItemBase("big_yao",Main.MOD_TAB1);
	public static final Item Small_Yao = new ItemBase("small_yao",Main.MOD_TAB1);
	public static final Item Phoenix = new ItemBase("phoenix",Main.MOD_TAB1);
}

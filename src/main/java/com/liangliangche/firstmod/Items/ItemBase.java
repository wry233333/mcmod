package com.liangliangche.firstmod.Items;

import com.liangliangche.firstmod.Main;
import com.liangliangche.firstmod.Init.ModItems;
import com.liangliangche.firstmod.proxy.ClientProxy;
import com.liangliangche.firstmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item implements IHasModel {
	//物品创建方法
	public ItemBase(String name) {
		//设置物品名称
		setUnlocalizedName(name);
		setRegistryName(name);
		//设置物品存放位置
		setCreativeTab(wry333);
		//向mod物品里添加物品
		ModItems.ITEMS.add(this);
	}
	//创建一个创造模式的物品栏
	public static final CreativeTabs wry333 = new CreativeTabs("JBMod") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.DIAMOND);
		}
	};
	@Override
	public void registerModels() {
		//使用代理注册
		Main.proxy.registerItemRenderer(this, 0 ,"inventory");

	}

}

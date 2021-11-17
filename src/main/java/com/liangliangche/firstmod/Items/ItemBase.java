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
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(wry333);
		
		ModItems.ITEMS.add(this);
	}
	public static final CreativeTabs wry333 = new CreativeTabs("JBMod") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.DIAMOND);
		}
	};
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0 ,"inventory");

	}

}

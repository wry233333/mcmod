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
	//��Ʒ��������
	public ItemBase(String name, CreativeTabs tab) {
		//������Ʒ����
		setUnlocalizedName(name);
		setRegistryName(name);
		//������Ʒ���λ��
		setCreativeTab(tab);

		//��mod��Ʒ��������
		ModItems.ITEMS.add(this);
	}
	//����һ������ģʽ����Ʒ��
	public static final CreativeTabs wry333 = new CreativeTabs("JBMod") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.Big_Shield_Battery);
		}
	};
	@Override
	public void registerModels() {
		//ʹ�ô���ע��
		Main.proxy.registerItemRenderer(this, 0 ,"inventory");

	}

}

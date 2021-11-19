package com.liangliangche.firstmod.Init;

import java.util.ArrayList;
import java.util.List;

import com.liangliangche.firstmod.Main;
import com.liangliangche.firstmod.Items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {
	//�����Ʒ������
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//�½�������
	public static final Item Small_Shield_Battery = new ItemBase("small_shield_battery",ItemBase.wry333);
	public static final Item Big_Shield_Battery = new ItemBase("big_shield_battery",ItemBase.wry333);
	public static final Item Big_Yao = new ItemBase("big_yao",ItemBase.wry333);
	public static final Item Small_Yao = new ItemBase("small_yao",ItemBase.wry333);
	public static final Item Phoenix = new ItemBase("phoenix",ItemBase.wry333);
}

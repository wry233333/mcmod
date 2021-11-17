package com.liangliangche.firstmod;

import com.liangliangche.firstmod.proxy.CommonProxy;
import com.liangliangche.firstmod.util.Ref;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MOD_ID,name = Ref.NAME,version = Ref.VERSION)
public class Main {
	//初始化
	@Instance
	public static Main instance;
	//设置代理
	@SidedProxy(clientSide = Ref.CLIENT_PROXY_CLASS , serverSide = Ref.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	//事件处理预加载
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}

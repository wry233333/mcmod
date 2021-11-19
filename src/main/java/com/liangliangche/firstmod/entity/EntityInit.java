package com.liangliangche.firstmod.entity;

import com.liangliangche.firstmod.Main;
import com.liangliangche.firstmod.util.Ref;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	
	public static void registerEntities() {
	registerEntity("obsidian_ slime", EntityObsidianSlime.class, Ref.ENTITY_OBSIDIAN_SLIME, 50, 13870762, 0);
	}

	
	public static void registerEntity(String name, Class<? extends Entity> entity,int id ,int range ,int primaryColor,int secondaryColor) {
		
		EntityRegistry.registerModEntity(new ResourceLocation(Ref.MOD_ID + ":" + name), entity , name, id, Main.instance, range, 1, true, primaryColor, secondaryColor);
	}

}

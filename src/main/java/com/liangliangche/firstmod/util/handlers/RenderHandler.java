package com.liangliangche.firstmod.util.handlers;

import com.liangliangche.firstmod.entity.EntityObsidianSlime;
import com.liangliangche.firstmod.entity.render.RenderObsidianSlime;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler{
	
	public static void registerEntityRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityObsidianSlime.class, new IRenderFactory<EntityObsidianSlime>()
				
		{
			@Override
			public Render<? super EntityObsidianSlime> createRenderFor(RenderManager manager) {
				// TODO Auto-generated method stub
				return new RenderObsidianSlime(manager);
			}
		});
	}
}

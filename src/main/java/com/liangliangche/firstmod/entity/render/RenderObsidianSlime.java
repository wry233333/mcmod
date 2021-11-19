package com.liangliangche.firstmod.entity.render;

import com.liangliangche.firstmod.entity.EntityObsidianSlime;
import com.liangliangche.firstmod.util.Ref;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderObsidianSlime extends RenderLiving<EntityObsidianSlime>{
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Ref.MOD_ID + ":textures/entity//obsidian_slime.png") ;

	public RenderObsidianSlime(RenderManager manager) {
		super(manager, new ModelObsidianSlime, 0.5f);

	}

	@Override
	protected ResourceLocation getEntityTexture(EntityObsidianSlime entity) {
		// TODO Auto-generated method stub
		return TEXTURES;
	}

	/*public RenderObsidianSlime(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		// TODO Auto-generated constructor stub
	}
	*/
	

}

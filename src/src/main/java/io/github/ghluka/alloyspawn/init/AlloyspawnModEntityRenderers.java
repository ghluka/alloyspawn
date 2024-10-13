
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.ghluka.alloyspawn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.github.ghluka.alloyspawn.client.renderer.DiddyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AlloyspawnModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AlloyspawnModEntities.DIDDY.get(), DiddyRenderer::new);
	}
}

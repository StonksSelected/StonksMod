
package net.mcreator.stonks.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.stonks.ElementsStonks;

@ElementsStonks.ModElement.Tag
public class LootTableStonkblade extends ElementsStonks.ModElement {
	public LootTableStonkblade(ElementsStonks instance) {
		super(instance, 24);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("stonks", "stonkblade"));
	}
}

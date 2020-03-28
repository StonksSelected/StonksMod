
package net.mcreator.stonks.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.stonks.item.ItemStonkSteel;
import net.mcreator.stonks.ElementsStonks;

@ElementsStonks.ModElement.Tag
public class RecipeMakingStonkSteel extends ElementsStonks.ModElement {
	public RecipeMakingStonkSteel(ElementsStonks instance) {
		super(instance, 27);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Items.SLIME_BALL, (int) (1)), new ItemStack(ItemStonkSteel.block, (int) (1)), 1F);
	}
}

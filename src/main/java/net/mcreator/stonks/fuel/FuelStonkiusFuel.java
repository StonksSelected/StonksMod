
package net.mcreator.stonks.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.stonks.item.ItemStonkiusFUel1;
import net.mcreator.stonks.ElementsStonks;

@ElementsStonks.ModElement.Tag
public class FuelStonkiusFuel extends ElementsStonks.ModElement {
	public FuelStonkiusFuel(ElementsStonks instance) {
		super(instance, 42);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemStonkiusFUel1.block, (int) (1)).getItem())
			return 160000;
		return 0;
	}
}


package net.mcreator.stonks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.stonks.creativetab.TabStonksMod;
import net.mcreator.stonks.ElementsStonks;

@ElementsStonks.ModElement.Tag
public class ItemStonkSteelArmor extends ElementsStonks.ModElement {
	@GameRegistry.ObjectHolder("stonks:stonksteelarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("stonks:stonksteelarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("stonks:stonksteelarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("stonks:stonksteelarmorboots")
	public static final Item boots = null;
	public ItemStonkSteelArmor(ElementsStonks instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("STONKSTEELARMOR", "stonks:tonksrmour", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.anvil.fall")), 3.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("stonksteelarmorhelmet")
				.setRegistryName("stonksteelarmorhelmet").setCreativeTab(TabStonksMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("stonksteelarmorbody")
				.setRegistryName("stonksteelarmorbody").setCreativeTab(TabStonksMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("stonksteelarmorlegs")
				.setRegistryName("stonksteelarmorlegs").setCreativeTab(TabStonksMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("stonksteelarmorboots")
				.setRegistryName("stonksteelarmorboots").setCreativeTab(TabStonksMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("stonks:stonksteelarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("stonks:stonksteelarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("stonks:stonksteelarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("stonks:stonksteelarmorboots", "inventory"));
	}
}

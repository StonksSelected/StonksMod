package net.mcreator.stonks.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.stonks.ElementsStonks;

@ElementsStonks.ModElement.Tag
public class ProcedureBigBowStonkBowBulletHitsPlayer extends ElementsStonks.ModElement {
	public ProcedureBigBowStonkBowBulletHitsPlayer(ElementsStonks instance) {
		super(instance, 37);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BigBowStonkBowBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BigBowStonkBowBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BigBowStonkBowBulletHitsPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BigBowStonkBowBulletHitsPlayer!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.anvil.hit")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 6, true);
		}
	}
}

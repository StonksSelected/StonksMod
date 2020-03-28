package net.mcreator.stonks.procedure;

import net.minecraft.world.World;

import net.mcreator.stonks.ElementsStonks;

@ElementsStonks.ModElement.Tag
public class ProcedureBigBowStonkBowBulletHitsBlock extends ElementsStonks.ModElement {
	public ProcedureBigBowStonkBowBulletHitsBlock(ElementsStonks instance) {
		super(instance, 38);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BigBowStonkBowBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BigBowStonkBowBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BigBowStonkBowBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BigBowStonkBowBulletHitsBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 69, true);
		}
	}
}

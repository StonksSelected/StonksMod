package net.mcreator.stonks.procedure;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.stonks.ElementsStonks;

@ElementsStonks.ModElement.Tag
public class ProcedureMusicDiscAir extends ElementsStonks.ModElement {
	public ProcedureMusicDiscAir(ElementsStonks instance) {
		super(instance, 39);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MusicDiscAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperienceLevel((int) 5);
	}
}

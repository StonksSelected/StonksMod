package net.mcreator.stonks.procedure;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.stonks.ElementsStonks;

@ElementsStonks.ModElement.Tag
public class ProcedureStonkingHellCommandExecuted extends ElementsStonks.ModElement {
	public ProcedureStonkingHellCommandExecuted(ElementsStonks instance) {
		super(instance, 34);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure StonkingHellCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).setGameType(GameType.CREATIVE);
	}
}

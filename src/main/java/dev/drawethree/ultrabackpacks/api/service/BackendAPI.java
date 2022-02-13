package dev.drawethree.ultrabackpacks.api.service;

import dev.drawethree.ultrabackpacks.api.model.backpack.IBackpackData;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.List;

public abstract class BackendAPI {

	private static BackendAPI implementation;

	public static void setImplementation(BackendAPI implementation) {
		BackendAPI.implementation = implementation;
	}

	public static BackendAPI getImplementation() {
		if (implementation == null) {
			throw new IllegalStateException("No API implementation set. Is UltraBackpacks enabled?");
		}

		return implementation;
	}

	public abstract boolean hasBackpack(Player player);

	public abstract IBackpackData getBackpackData(Player player);

	public abstract void sellBackpack(Player player, boolean sellAll);

	public abstract void handleBlocksBroken(Player player, List<Block> blocks);
}

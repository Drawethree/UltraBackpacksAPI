package dev.drawethree.ultrabackpacks.api.service;

import dev.drawethree.ultrabackpacks.api.model.backpack.IBackpackData;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.List;

public abstract class BackendAPI {

	private static BackendAPI implementation;

	/**
	 * Returns true if player has backpack in his inventory
	 *
	 * @param player Player
	 * @return true if player has backpack in his inventory
	 */

	public abstract boolean hasBackpack(Player player);

	/**
	 * Get player BackpackData
	 *
	 * @param player Player
	 * @return BackpackData.class
	 */
	public abstract IBackpackData getBackpackData(Player player);

	/**
	 * Sells the contents of player backpack.
	 *
	 * @param player  Player
	 * @param sellAll If true, sells whole backpack. If false, sells only x amount of items based on AutoSell backpack enchant.
	 */
	public abstract void sellBackpack(Player player, boolean sellAll);

	/**
	 * Handles the specified broken blocks and tries to add them into backpack
	 *
	 * @param player Player
	 * @param blocks List of blocks that were broken and should be added to backpack
	 */
	public abstract void handleBlocksBroken(Player player, List<Block> blocks);

	public static void setImplementation(BackendAPI implementation) {
		BackendAPI.implementation = implementation;
	}

	public static BackendAPI getImplementation() {
		if (implementation == null) {
			throw new IllegalStateException("No API implementation set. Is UltraBackpacks enabled?");
		}

		return implementation;
	}
}

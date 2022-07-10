package dev.drawethree.ultrabackpacks.api;

import dev.drawethree.ultrabackpacks.api.exception.BackpackNotFoundException;
import dev.drawethree.ultrabackpacks.api.model.backpack.IBackpackData;
import dev.drawethree.ultrabackpacks.api.service.BackendAPI;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.List;

public final class UltraBackpacksAPI {

	private UltraBackpacksAPI() {
		throw new UnsupportedOperationException("Cannot instantiate UltraBackpacksAPI!");
	}

	/**
	 * Returns true if player has backpack in his inventory
	 *
	 * @param player Player
	 * @return true if player has backpack in his inventory
	 */
	public static boolean hasBackpack(Player player) {
		return BackendAPI.getImplementation().hasBackpack(player);
	}

	/**
	 * Get player BackpackData
	 *
	 * @param player Player
	 * @return BackpackData.class
	 */
	public static IBackpackData getBackpackData(Player player) throws BackpackNotFoundException {
		return BackendAPI.getImplementation().getBackpackData(player);
	}

	/**
	 * Sells the contents of player backpack.
	 *
	 * @param player  Player
	 * @param sellAll If true, sells whole backpack. If false, sells only x amount of items based on AutoSell backpack enchant.
	 */
	public static void sellBackpack(Player player, boolean sellAll) throws BackpackNotFoundException {
		BackendAPI.getImplementation().sellBackpack(player, sellAll);
	}

	/**
	 * Handles the specified broken blocks and tries to add them into backpack
	 *
	 * @param player Player
	 * @param blocks List of blocks that were broken and should be added to backpack
	 */
	public static void handleBlocksBroken(Player player, List<Block> blocks) {
		BackendAPI.getImplementation().handleBlocksBroken(player, blocks);
	}
}

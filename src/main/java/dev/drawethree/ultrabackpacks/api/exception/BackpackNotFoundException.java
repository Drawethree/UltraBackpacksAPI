package dev.drawethree.ultrabackpacks.api.exception;

import org.bukkit.entity.Player;

public final class BackpackNotFoundException extends Throwable {

	public BackpackNotFoundException(Player player) {
		super("Player " + player.getName() + " does not have backpack.");
	}
}

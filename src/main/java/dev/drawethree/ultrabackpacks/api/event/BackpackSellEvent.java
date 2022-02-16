package dev.drawethree.ultrabackpacks.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BackpackSellEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	private final Player player;
	private double moneyToDeposit;

	/**
	 * Event fired when player sells the backpack.
	 * @param player Player
	 * @param moneyToDeposit original amount to deposit
	 */
	public BackpackSellEvent(Player player, double moneyToDeposit) {
		this.player = player;
		this.moneyToDeposit = moneyToDeposit;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public void setMoneyToDeposit(double moneyToDeposit) {
		this.moneyToDeposit = moneyToDeposit;
	}

	public Player getPlayer() {
		return player;
	}

	public double getMoneyToDeposit() {
		return moneyToDeposit;
	}
}

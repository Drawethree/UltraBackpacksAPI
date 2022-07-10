package dev.drawethree.ultrabackpacks.api.model.backpack;

import org.bukkit.Material;

public interface IBackpackItem {

	/**
	 * Gets the type of item.
	 * @return {@link Material}
	 */
	Material getType();

	/**
	 * Gets the amount of item.
	 * @return amount
	 */
	long getAmount();

	/**
	 * Sets the amount of item
	 * @param amount amount
	 */
	void setAmount(long amount);
}

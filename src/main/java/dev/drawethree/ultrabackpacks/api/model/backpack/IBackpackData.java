package dev.drawethree.ultrabackpacks.api.model.backpack;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface IBackpackData {

	/**
	 * Returns List of backpack items {@link IBackpackItem}
	 *
	 * @return list of item in backpack
	 */
	List<? extends IBackpackItem> getItems();

	/**
	 * Adds an item to backpack. If item with type already exists, it adds the quantity to already existing item.
	 *
	 * @return Added / Updated {@link IBackpackItem}
	 */
	IBackpackItem addItem(ItemStack item);

	/**
	 * Removes an item from backpack.
	 *
	 * @return removed {@link IBackpackItem}, or null if not found.
	 */
	IBackpackItem removeItem(Material type);

	/**
	 * Sets the enchant level of given enchant
	 *
	 * @return removed {@link IBackpackItem}
	 */
	boolean setEnchantLevel(BackpackEnchantment enchantment, long level);

	/**
	 * Return the current enchant level
	 *
	 * @param enchantment {@link BackpackEnchantment}
	 * @return current level of enchant
	 */
	long getEnchantLevel(BackpackEnchantment enchantment);
}

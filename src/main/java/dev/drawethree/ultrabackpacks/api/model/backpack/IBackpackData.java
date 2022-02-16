package dev.drawethree.ultrabackpacks.api.model.backpack;

import java.util.Map;

public interface IBackpackData {

	/**
	 * Returns Map of enchants that player has in his backpack.
	 * Key - Id of enchant
	 * Value - Level of enchant
	 * @return Map of enchants belonging to player
	 */
	Map<Integer, Long> getEnchants();

	/**
	 * Returns Map
	 * Key - {@link CompMaterial}
	 * @return Map of backpack contents
	 */
	Map<?, Long> getItems();
}

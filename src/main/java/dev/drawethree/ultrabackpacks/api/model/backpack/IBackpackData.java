package dev.drawethree.ultrabackpacks.api.model.backpack;

import java.util.Map;

public interface IBackpackData {

	Map<Integer, Long> getEnchants();

	Map<?, Long> getItems();
}

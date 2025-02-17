package ediblemetals;

import ediblemetals.item.ModItemGroups;
import ediblemetals.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdibleMetals implements ModInitializer {
	public static final String MOD_ID = "ediblemetals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting Edible Metals!");

		ModItemGroups.load();
		ModItems.load();
	}
}
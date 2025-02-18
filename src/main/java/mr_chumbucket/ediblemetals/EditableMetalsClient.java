package mr_chumbucket.ediblemetals;

import mr_chumbucket.ediblemetals.item.ModItems;
import mr_chumbucket.ediblemetals.item.SnackItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class EditableMetalsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Snack Colours
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> SnackItem.compareTintIndex(tintIndex, 0xb6ed4f), ModItems.COPPER_SNACK);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> SnackItem.compareTintIndex(tintIndex, 0xea3a3b), ModItems.GOLD_SNACK);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> SnackItem.compareTintIndex(tintIndex, 0x5e8bf7), ModItems.IRON_SNACK);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> SnackItem.compareTintIndex(tintIndex, 0x7c2df3), ModItems.NETHERITE_SNACK);
	}
}

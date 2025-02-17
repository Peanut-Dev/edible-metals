package mr_chumbucket.ediblemetals;

import mr_chumbucket.ediblemetals.item.ModItems;
import mr_chumbucket.ediblemetals.item.SnackItem;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class EditableMetalsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Wrapper Colour
//		ColorProviderRegistry.ITEM.register(((stack, tintIndex) -> switch (tintIndex) {
//			case 0 -> ColorHelper.Argb.fullAlpha(0x88ff00);
//			case 1 -> ColorHelper.Argb.fullAlpha(0xa00f10);
//			case 2 -> ColorHelper.Argb.fullAlpha(0x37c3f2);
//			case 3 -> ColorHelper.Argb.fullAlpha(0x946794);
//			default -> -1;
//		}), ModItems.SNACK_WRAPPER);

		// Snack Colours
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> SnackItem.compareTintIndex(tintIndex, 0x88ff00), ModItems.COPPER_SNACK);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> SnackItem.compareTintIndex(tintIndex, 0xa00f10), ModItems.GOLD_SNACK);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> SnackItem.compareTintIndex(tintIndex, 0x37c3f2), ModItems.IRON_SNACK);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> SnackItem.compareTintIndex(tintIndex, 0x946794), ModItems.NETHERITE_SNACK);
	}
}

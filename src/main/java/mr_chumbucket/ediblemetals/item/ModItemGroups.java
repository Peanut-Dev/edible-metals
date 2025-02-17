package mr_chumbucket.ediblemetals.item;

import mr_chumbucket.ediblemetals.EdibleMetals;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	public static final ItemGroup EDIBLE_METALS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(EdibleMetals.MOD_ID, "advancement_book"),
			FabricItemGroup.builder()
					.displayName(Text.translatable("itemgroup." + EdibleMetals.MOD_ID + ".edible_metals"))
					.icon(() -> new ItemStack(ModItems.IRON_SNACK))
					.entries((displayContext, entries) -> {
						entries.add(ModItems.COPPER_SNACK);
						entries.add(ModItems.GOLD_SNACK);
						entries.add(ModItems.IRON_SNACK);
						entries.add(ModItems.NETHERITE_SNACK);
						entries.add(ModItems.SNACK_WRAPPER);
					})
					.build()
	);

	public static void load() {
		EdibleMetals.LOGGER.info("Registering mod items for" + EdibleMetals.MOD_ID);
	}
}

package ediblemetals.item;

import ediblemetals.EdibleMetals;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPER_SNACK = registerItem("copper_snack", new SnackItem(ModFoodComponents.COPPER_SNACK));
    public static final Item GOLD_SNACK = registerItem("gold_snack", new SnackItem(ModFoodComponents.GOLD_SNACK));
    public static final Item IRON_SNACK = registerItem("iron_snack", new SnackItem(ModFoodComponents.IRON_SNACK));
    public static final Item NETHERITE_SNACK = registerItem("netherite_snack", new SnackItem(ModFoodComponents.NETHERITE_SNACK));

    public static final Item SNACK_WRAPPER = registerItem("snack_wrapper", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(EdibleMetals.MOD_ID, name), item);
    }

    public static void load() {
        EdibleMetals.LOGGER.info("Registering mod items for" + EdibleMetals.MOD_ID);

        FuelRegistry.INSTANCE.add(SNACK_WRAPPER, 100);
    }
}

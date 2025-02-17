package ediblemetals.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class SnackItem extends Item {
	public SnackItem(FoodComponent foodComponent) {
		super(new Item.Settings().food(foodComponent));
	}

	@Override
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		PlayerEntity playerEntity = user instanceof PlayerEntity ? (PlayerEntity) user : null;
		boolean creativeMode = playerEntity != null && playerEntity.getAbilities().creativeMode;

		var newStack = super.finishUsing(stack, world, user);

		if (playerEntity == null || !creativeMode) {
			if (newStack.isEmpty()) {
				return new ItemStack(ModItems.SNACK_WRAPPER);
			}

			if (playerEntity != null) {
				playerEntity.getInventory().insertStack(new ItemStack(ModItems.SNACK_WRAPPER));
			}
		}

		return newStack;
	}

	@Override
	public SoundEvent getEatSound() {
		return SoundEvents.ITEM_AXE_SCRAPE;
	}
}

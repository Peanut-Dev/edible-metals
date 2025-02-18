package mr_chumbucket.ediblemetals.item;

import com.google.common.collect.Lists;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.world.World;

import java.util.List;

public class SnackItem extends Item {
	public SnackItem(FoodComponent foodComponent) {
		super(new Settings().food(foodComponent));
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

	@Override
	public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
		FoodComponent foodComponent = stack.get(DataComponentTypes.FOOD);

		if (foodComponent != null) {
			List<StatusEffectInstance> statusEffectInstances = Lists.newArrayList();

			for (FoodComponent.StatusEffectEntry statusEffectEntry : foodComponent.effects()) {
				statusEffectInstances.add(statusEffectEntry.effect());
			}

			PotionContentsComponent.buildTooltip(statusEffectInstances, tooltip::add, 1.0F, context.getUpdateTickRate());
		}
	}

	public static int compareTintIndex(int tintIndex, int argb) {
		return tintIndex != 1 ? -1 : ColorHelper.Argb.fullAlpha(argb);
	}
}

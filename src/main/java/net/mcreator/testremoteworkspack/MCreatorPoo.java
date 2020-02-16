package net.mcreator.testremoteworkspack;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@Elementstestremoteworkspack.ModElement.Tag
public class MCreatorPoo extends Elementstestremoteworkspack.ModElement {
	@ObjectHolder("testremoteworkspack:poo")
	public static final Item block = null;

	public MCreatorPoo(Elementstestremoteworkspack instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("poo");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}

package net.cathiemomrawr.kubejsbloodmagic.recipes;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.cathiemomrawr.kubejsbloodmagic.components.ItemComponentsExtra;

public interface SoulForgeRecipeJS
{
	RecipeKey<InputItem> input0 = ItemComponents.INPUT.key("input0");
	RecipeKey<InputItem> input2 = ItemComponents.INPUT.key("input1").optional(InputItem.EMPTY);
	RecipeKey<InputItem> input3 = ItemComponents.INPUT.key("input2").optional(InputItem.EMPTY);
	RecipeKey<InputItem> input1 = ItemComponents.INPUT.key("input3").optional(InputItem.EMPTY);
	RecipeKey<OutputItem> output = ItemComponents.OUTPUT.key("output");
	RecipeKey<Float> minimumDrain = NumberComponent.FLOAT.key("minimumDrain").optional(1f).alwaysWrite();
	RecipeKey<Float> drain = NumberComponent.FLOAT.key("drain").optional(2.5f).alwaysWrite();

	RecipeSchema SCHEMA = new RecipeSchema(output, input0, input1, input2, input3, minimumDrain, drain);
}

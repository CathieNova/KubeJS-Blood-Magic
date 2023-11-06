package net.cathiemomrawr.kubejsbloodmagic.recipes;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;
import net.cathiemomrawr.kubejsbloodmagic.components.ItemComponentsExtra;

public interface AlchemyTableRecipeJS
{
	RecipeKey<InputItem[]> input = ItemComponents.INPUT.asArray().key("input").noBuilders();
	RecipeKey<OutputItem> output = ItemComponents.OUTPUT.key("output").noBuilders();
	RecipeKey<Integer> syphon = NumberComponent.INT.key("syphon").optional(1000).alwaysWrite();
	RecipeKey<Integer> ticks = NumberComponent.INT.key("ticks").optional(100).alwaysWrite();
	RecipeKey<Integer> upgradeLevel = NumberComponent.INT.key("upgradeLevel").optional(0).alwaysWrite();

	RecipeSchema SCHEMA = new RecipeSchema(output, input, syphon, ticks, upgradeLevel);
}

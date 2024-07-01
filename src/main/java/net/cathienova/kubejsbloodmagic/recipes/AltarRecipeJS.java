package net.cathienova.kubejsbloodmagic.recipes;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

public interface AltarRecipeJS {
	RecipeKey<InputItem> input = ItemComponents.INPUT.key("input").noBuilders();
	RecipeKey<OutputItem> output = ItemComponents.OUTPUT.key("output").noBuilders();
	RecipeKey<Integer> minimumTier = NumberComponent.INT.key("upgradeLevel").optional(0).alwaysWrite();
	RecipeKey<Integer> syphon = NumberComponent.INT.key("altarSyphon").optional(1000).alwaysWrite();
	RecipeKey<Integer> consumeRate = NumberComponent.INT.key("consumptionRate").optional(5).alwaysWrite();
	RecipeKey<Integer> drainRate = NumberComponent.INT.key("drainRate").optional(5).alwaysWrite();

	RecipeSchema SCHEMA = new RecipeSchema(output, input, minimumTier, syphon,  consumeRate, drainRate);
}

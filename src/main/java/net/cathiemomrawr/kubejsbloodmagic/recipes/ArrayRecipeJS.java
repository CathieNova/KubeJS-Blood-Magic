package net.cathiemomrawr.kubejsbloodmagic.recipes;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.ItemComponents;
import dev.latvian.mods.kubejs.recipe.component.NumberComponent;
import dev.latvian.mods.kubejs.recipe.component.StringComponent;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

public interface ArrayRecipeJS
{
	RecipeKey<InputItem> baseinput = ItemComponents.INPUT.key("baseinput").noBuilders();
	RecipeKey<OutputItem> output = ItemComponents.OUTPUT.key("output").noBuilders();
	RecipeKey<InputItem> addedinput = ItemComponents.INPUT.key("addedinput").noBuilders();
	RecipeKey<String> texture = StringComponent.ANY.key("texture").optional("bloodmagic:textures/models/alchemyarrays/sunarray.png").alwaysWrite();

	RecipeSchema SCHEMA = new RecipeSchema(output, baseinput, addedinput, texture);
}

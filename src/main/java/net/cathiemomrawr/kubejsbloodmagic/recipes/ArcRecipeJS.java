package net.cathiemomrawr.kubejsbloodmagic.recipes;

import dev.latvian.mods.kubejs.item.InputItem;
import dev.latvian.mods.kubejs.item.OutputItem;
import dev.latvian.mods.kubejs.recipe.RecipeKey;
import dev.latvian.mods.kubejs.recipe.component.*;
import dev.latvian.mods.kubejs.recipe.schema.RecipeSchema;

public interface ArcRecipeJS
{
	RecipeKey<InputItem> input = ItemComponents.INPUT.key("input").noBuilders();
	RecipeKey<OutputItem> output = ItemComponents.OUTPUT.key("output").noBuilders();
	RecipeKey<Integer> inputsize = NumberComponent.INT.key("inputsize")
			.optional(1).alwaysWrite();
	RecipeKey<Boolean> consumeingredient = BooleanComponent.BOOLEAN.key("consumeingredient")
			.optional(true).alwaysWrite();

	RecipeKey<InputItem> tool = ItemComponents.INPUT.key("tool");
	RecipeComponentBuilder addedoutput =  RecipeComponent.builder()
			.add(ItemComponents.OUTPUT.key("type"))
			.add(NumberComponent.FLOAT.key("chance"))
			.add(NumberComponent.INT.key("mainchance").optional(0));

	RecipeKey<RecipeComponentBuilderMap[]> addedOutputs = addedoutput.asArray().key("addedoutput")
			.optional(new RecipeComponentBuilderMap[] {});

	RecipeComponentBuilder outputFluid =  RecipeComponent.builder()
			.add(StringComponent.ANY.key("fluid"))
			.add(NumberComponent.INT.key("amount"));

	RecipeKey<RecipeComponentBuilderMap[]> outputFluids = outputFluid.asArray().key("outputFluid")
			.optional(new RecipeComponentBuilderMap[] {});

	RecipeComponentBuilder inputFluid =  RecipeComponent.builder()
			.add(StringComponent.ANY.key("fluid"))
			.add(NumberComponent.INT.key("amount"));

	RecipeKey<RecipeComponentBuilderMap[]> inputFluids = inputFluid.asArray().key("inputFluid")
			.optional(new RecipeComponentBuilderMap[] {});

	RecipeSchema SCHEMA = new RecipeSchema(output, input, tool, inputFluids, addedOutputs, consumeingredient, inputsize, outputFluids);
}

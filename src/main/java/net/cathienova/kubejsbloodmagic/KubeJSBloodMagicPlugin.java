package net.cathienova.kubejsbloodmagic;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;
import net.cathienova.kubejsbloodmagic.recipes.*;
import net.minecraft.resources.ResourceLocation;

public class KubeJSBloodMagicPlugin extends KubeJSPlugin {
	@Override
	public void registerRecipeSchemas(RegisterRecipeSchemasEvent e) {
		e.register(new ResourceLocation("bloodmagic:altar"), AltarRecipeJS.SCHEMA);
		e.register(new ResourceLocation("bloodmagic:alchemytable"), AlchemyTableRecipeJS.SCHEMA);
		e.register(new ResourceLocation("bloodmagic:array"), ArrayRecipeJS.SCHEMA);
		e.register(new ResourceLocation("bloodmagic:arc"), ArcRecipeJS.SCHEMA);
		e.register(new ResourceLocation("bloodmagic:soulforge"), SoulForgeRecipeJS.SCHEMA);

	}
}

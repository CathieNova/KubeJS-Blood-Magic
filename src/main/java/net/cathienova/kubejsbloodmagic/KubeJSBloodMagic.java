package net.cathienova.kubejsbloodmagic;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KubeJSBloodMagic.MOD_ID)
public class KubeJSBloodMagic {
	public static final String MOD_ID = "kubejsbloodmagic";

	public KubeJSBloodMagic() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
	}
}

package sulfurtorches;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid=SulfurTorches.MODID, name=SulfurTorches.NAME, version=SulfurTorches.VERSION)
public class SulfurTorches {
	public static final String MODID = "sulfurtorches";
	public static final String NAME = "Sulfur Torches";
	public static final String VERSION = "0.1.0";

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Hello World!");
	}
}

package sulfurtorches;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config {

	public static int dropChance = 257;
	public static final String DROP_CHANCE_COMMENT = "Chance that a sulfur torch will drop goo on a random tick, results in a percentage of occurring of 1/chance. For example, 100 means a 1% chance. XyCraft uses 1/257 by default.";

	public static void load(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());

		config.load();

		dropChance = config.getInt("dropChance", Configuration.CATEGORY_GENERAL, 257, 1, 1000, DROP_CHANCE_COMMENT);

		config.save();
	}
}

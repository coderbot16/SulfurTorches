package sulfurtorches;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import sulfurtorches.init.ModObjects;
import sulfurtorches.proxy.CommonProxy;

@Mod(modid=SulfurTorches.MODID, name=SulfurTorches.NAME, version=SulfurTorches.VERSION)
public class SulfurTorches {
	public static final String MODID = "sulfurtorches";
	public static final String NAME = "Sulfur Torches";
	public static final String VERSION = "0.1.0";

	public static CreativeTabs TAB;

	@SidedProxy(clientSide="sulfurtorches.proxy.ClientProxy", serverSide="sulfurtorches.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.load(event);
		TAB = new CreativeTabs("sulfurtorches") {
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ModObjects.SULFUR_TORCH_ITEM);
			}
		};
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("dyeRed", ModObjects.SULFUR_GOO);
	}
}

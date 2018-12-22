package sulfurtorches.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import sulfurtorches.SulfurTorches;
import sulfurtorches.blocks.BlockSulfurTorch;

@Mod.EventBusSubscriber
public class ModObjects {
	public static BlockSulfurTorch SULFUR_TORCH;
	public static Item SULFUR_TORCH_ITEM;

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		SULFUR_TORCH = new BlockSulfurTorch();
		SULFUR_TORCH.setRegistryName(new ResourceLocation(SulfurTorches.MODID, "sulfur_torch"));
		SULFUR_TORCH.setUnlocalizedName(SulfurTorches.MODID+".sulfur_torch");
		SULFUR_TORCH.setHardness(0.0F);
		SULFUR_TORCH.setLightLevel(1.0F);

		event.getRegistry().register(SULFUR_TORCH);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		SULFUR_TORCH_ITEM = new ItemBlock(SULFUR_TORCH);
		SULFUR_TORCH_ITEM.setRegistryName(new ResourceLocation(SulfurTorches.MODID, "sulfur_torch"));
		SULFUR_TORCH_ITEM.setUnlocalizedName(SulfurTorches.MODID+".sulfur_torch");

		event.getRegistry().register(SULFUR_TORCH_ITEM);

		SulfurTorches.proxy.registerItemModels();
	}
}

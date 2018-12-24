package sulfurtorches.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import sulfurtorches.SulfurTorches;
import sulfurtorches.blocks.BlockMetalTorch;
import sulfurtorches.blocks.BlockSulfurTorch;
import sulfurtorches.items.ItemSulfurGoo;

@Mod.EventBusSubscriber
public class ModObjects {
	public static BlockSulfurTorch SULFUR_TORCH;
	public static Item SULFUR_TORCH_ITEM;

	public static BlockMetalTorch METAL_TORCH;
	public static Item METAL_TORCH_ITEM;

	public static Item SULFUR_GOO;

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		SULFUR_TORCH = new BlockSulfurTorch();
		SULFUR_TORCH.setRegistryName(new ResourceLocation(SulfurTorches.MODID, "sulfur_torch"));
		SULFUR_TORCH.setUnlocalizedName(SulfurTorches.MODID+".sulfur_torch");
		SULFUR_TORCH.setHardness(0.0F);
		SULFUR_TORCH.setLightLevel(1.0F);
		SULFUR_TORCH.setCreativeTab(SulfurTorches.TAB);

		event.getRegistry().register(SULFUR_TORCH);

		METAL_TORCH = new BlockMetalTorch();
		METAL_TORCH.setRegistryName(new ResourceLocation(SulfurTorches.MODID, "metal_torch"));
		METAL_TORCH.setUnlocalizedName(SulfurTorches.MODID+".metal_torch");
		METAL_TORCH.setHardness(0.0F);
		METAL_TORCH.setLightLevel(1.0F);
		METAL_TORCH.setCreativeTab(SulfurTorches.TAB);

		event.getRegistry().register(METAL_TORCH);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		SULFUR_TORCH_ITEM = new ItemBlock(SULFUR_TORCH);
		SULFUR_TORCH_ITEM.setRegistryName(new ResourceLocation(SulfurTorches.MODID, "sulfur_torch"));
		SULFUR_TORCH_ITEM.setUnlocalizedName(SulfurTorches.MODID+".sulfur_torch");

		event.getRegistry().register(SULFUR_TORCH_ITEM);

		METAL_TORCH_ITEM = new ItemBlock(METAL_TORCH);
		METAL_TORCH_ITEM.setRegistryName(new ResourceLocation(SulfurTorches.MODID, "metal_torch"));
		METAL_TORCH_ITEM.setUnlocalizedName(SulfurTorches.MODID+".metal_torch");

		event.getRegistry().register(METAL_TORCH_ITEM);

		SULFUR_GOO = new ItemSulfurGoo();
		SULFUR_GOO.setRegistryName(new ResourceLocation(SulfurTorches.MODID, "sulfur_goo"));
		SULFUR_GOO.setUnlocalizedName(SulfurTorches.MODID+".sulfur_goo");
		SULFUR_GOO.setCreativeTab(SulfurTorches.TAB);

		event.getRegistry().register(SULFUR_GOO);

		SulfurTorches.proxy.registerItemModels();
	}
}

package sulfurtorches.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import sulfurtorches.init.ModObjects;

public class ClientProxy extends CommonProxy {
	public void registerItemModels() {
		ModelLoader.setCustomModelResourceLocation(ModObjects.SULFUR_TORCH_ITEM, 0, new ModelResourceLocation(ModObjects.SULFUR_TORCH_ITEM.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(ModObjects.SULFUR_GOO, 0, new ModelResourceLocation(ModObjects.SULFUR_GOO.getRegistryName(), "inventory"));
	}
}

package sulfurtorches.blocks;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sulfurtorches.Config;
import sulfurtorches.client.ParticleSulfur;

import java.util.Random;

public class BlockSulfurTorch extends BlockTorch {

	public BlockSulfurTorch() {
		super();

		setSoundType(SoundType.WOOD);

		// TODO: separate creative tab
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		super.updateTick(worldIn, pos, state, random);

		if(random.nextInt(Config.dropChance) == 0) {
			spawnAsEntity(worldIn, pos, new ItemStack(Items.DIAMOND));
		}
	}

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		EnumFacing facing = stateIn.getValue(FACING);
		double x = pos.getX() + 0.5D;
		double y = pos.getY() + 0.7D;
		double z = pos.getZ() + 0.5D;

		if (facing.getAxis().isHorizontal())
		{
			EnumFacing opposite = facing.getOpposite();

			x += 0.27D * opposite.getFrontOffsetX();
			y += 0.22D;
			z += 0.27D * opposite.getFrontOffsetZ();
		}

		Minecraft.getMinecraft().effectRenderer.addEffect(new ParticleSulfur.Factory().createParticle(0, worldIn, x, y, z, 0.0D, 0.0D, 0.0D));
	}
}

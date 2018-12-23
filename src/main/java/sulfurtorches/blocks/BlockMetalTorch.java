package sulfurtorches.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockMetalTorch extends BlockSulfurTorch {
	public BlockMetalTorch() {
		super();

		setSoundType(SoundType.STONE);
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random random) {}
}

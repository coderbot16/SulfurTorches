package sulfurtorches.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemSulfurGoo extends Item {
	public ItemSulfurGoo() {
		super();
		setCreativeTab(CreativeTabs.MATERIALS);
	}

	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack itemstack = player.getHeldItem(hand);

		if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
		{
			return EnumActionResult.FAIL;
		}

		if(ItemDye.applyBonemeal(itemstack, worldIn, pos, player, hand)) {
			if(!worldIn.isRemote) {
				worldIn.playEvent(2005, pos, 0);
			}

			return EnumActionResult.SUCCESS;
		}

		return EnumActionResult.FAIL;
	}

	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {
		if (target instanceof EntitySheep) {
			EntitySheep sheep = (EntitySheep)target;

			if (!sheep.getSheared() && sheep.getFleeceColor() != EnumDyeColor.RED)
			{
				sheep.setFleeceColor(EnumDyeColor.RED);
				stack.shrink(1);
			}

			return true;
		} else {
			return false;
		}
	}
}

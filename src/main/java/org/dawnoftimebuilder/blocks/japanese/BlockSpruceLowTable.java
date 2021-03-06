package org.dawnoftimebuilder.blocks.japanese;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.dawnoftimebuilder.blocks.global.DoTBBlockDisplayer;
import org.dawnoftimebuilder.enums.EnumsBlock;
import org.dawnoftimebuilder.tileentity.DoTBTileEntityDisplayer;

public class BlockSpruceLowTable extends DoTBBlockDisplayer {

	private static final AxisAlignedBB X_AXIS_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.125D, 1.0D, 0.5D, 0.875D);
	private static final AxisAlignedBB Z_AXIS_AABB = new AxisAlignedBB(0.125D, 0.0D, 0.0D, 0.875D, 0.5D, 1.0D);
	private static final PropertyEnum<EnumsBlock.EnumHorizontalAxis> AXIS = PropertyEnum.create("axis", EnumsBlock.EnumHorizontalAxis.class);

	public BlockSpruceLowTable() {
		super("spruce_low_table" ,Material.WOOD);
		this.setBurnable();
		this.setDefaultState(this.blockState.getBaseState().withProperty(AXIS, EnumsBlock.EnumHorizontalAxis.AXIS_X));
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new DoTBTileEntityDisplayer();
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, AXIS);
	}

	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return state.getValue(AXIS) == EnumsBlock.EnumHorizontalAxis.AXIS_X ? X_AXIS_AABB : Z_AXIS_AABB;
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		return this.getDefaultState().withProperty(AXIS, (placer.getHorizontalFacing().getAxis() == EnumFacing.Axis.Z) ? EnumsBlock.EnumHorizontalAxis.AXIS_X : EnumsBlock.EnumHorizontalAxis.AXIS_Z);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isSideSolid(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side){
		return false;
	}

	@Override
	public double getDisplayerX(int meta){
		return (meta == 0) ? 0.1875D : 0.3125D;
	}

	@Override
	public double getDisplayerY(int meta){
		return 0.4375D;
	}

	@Override
	public double getDisplayerZ(int meta){
		return (meta == 0) ? 0.3125D : 0.1875D;
	}

	@Override
	public int getMetaFromState(IBlockState state){
		return (state.getValue(AXIS) == EnumsBlock.EnumHorizontalAxis.AXIS_X) ? 0 : 8;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(AXIS, (meta < 8) ? EnumsBlock.EnumHorizontalAxis.AXIS_X : EnumsBlock.EnumHorizontalAxis.AXIS_Z);
	}

	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot) {
		return (rot == Rotation.CLOCKWISE_180) ? state :  state.withProperty(AXIS, (state.getValue(AXIS) == EnumsBlock.EnumHorizontalAxis.AXIS_X) ? EnumsBlock.EnumHorizontalAxis.AXIS_Z : EnumsBlock.EnumHorizontalAxis.AXIS_X);
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess p_193383_1_, IBlockState p_193383_2_, BlockPos p_193383_3_, EnumFacing p_193383_4_) {
		return BlockFaceShape.UNDEFINED;
	}
}
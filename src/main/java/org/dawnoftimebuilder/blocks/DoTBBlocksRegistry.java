package org.dawnoftimebuilder.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import org.dawnoftimebuilder.DawnOfTimeBuilder;
import org.dawnoftimebuilder.DoTBConfigs;
import org.dawnoftimebuilder.blocks.french.*;
import org.dawnoftimebuilder.blocks.global.*;
import org.dawnoftimebuilder.blocks.japanese.*;
import org.dawnoftimebuilder.blocks.mayan.*;
import org.dawnoftimebuilder.blocks.roman.BlockSandstoneColumn;
import org.dawnoftimebuilder.enums.IEnumMetaVariants;
import org.dawnoftimebuilder.items.global.DoTBItemMetaBlock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoTBBlocksRegistry {

	public static List<Block> blocks_list = new ArrayList<>();
	private static void addToList(Block... blocks){
		Collections.addAll(blocks_list, blocks);
	}

	public static void init(){
		DoTBBlock thatch_bamboo = new DoTBBlock("thatch_bamboo", Material.CLOTH, 0.3F, SoundType.CLOTH);
		DoTBBlock thatch_wheat = new DoTBBlock("thatch_wheat", Material.CLOTH, 0.3F, SoundType.CLOTH);
		DoTBBlock flat_roof_tiles = new DoTBBlock("flat_roof_tiles", Material.ROCK,1.5F, SoundType.STONE);
		DoTBBlock limestone_brick = new DoTBBlock("limestone_brick", Material.ROCK,2.5F, SoundType.STONE);
		DoTBBlock oak_waxed_planks = new DoTBBlock("oak_waxed_planks", Material.WOOD);
		DoTBBlock grey_roof_tiles = new DoTBBlock("grey_roof_tiles", Material.ROCK,1.5F, SoundType.STONE);
		BlockPlasteredStone plastered_stone = new BlockPlasteredStone();

		addToList(
				//General
				new BlockIronChain(),
				new DoTBBlockPath("path_gravel"),
				new DoTBBlockPath("path_stepping_stones"),
				new DoTBBlockPath("path_cobbled"),
				new DoTBBlockPath("path_ochre_tiles"),
				new DoTBBlockPath("path_dirt"),
				new DoTBBlockSlabPath("path_gravel_slab"),
				new DoTBBlockSlabPath("path_stepping_stones_slab"),
				new DoTBBlockSlabPath("path_cobbled_slab"),
				new DoTBBlockSlabPath("path_ochre_tiles_slab"),
				new DoTBBlockSlabPath("path_dirt_slab"),
				new DoTBBlock("rammed_dirt", Material.GROUND, 0.5F, SoundType.GROUND),
				thatch_wheat.setBurnable(),
				new DoTBBlockStairs("thatch_wheat_stairs", thatch_wheat, 0.3F, SoundType.CLOTH).setBurnable(),
				new DoTBBlockSlab("thatch_wheat_slab", Material.CLOTH, 0.3F, SoundType.CLOTH).setBurnable(),
				new DoTBBlockEdge("thatch_wheat_edge", Material.CLOTH, 0.3F, SoundType.CLOTH).setBurnable(),
				thatch_bamboo.setBurnable(),
				new DoTBBlockStairs("thatch_bamboo_stairs", thatch_bamboo, 0.3F, SoundType.CLOTH).setBurnable(),
				new DoTBBlockSlab("thatch_bamboo_slab", Material.CLOTH, 0.3F, SoundType.CLOTH).setBurnable(),
				new DoTBBlockEdge("thatch_bamboo_edge", Material.CLOTH, 0.3F, SoundType.CLOTH).setBurnable(),
				new BlockFireplace(),

				//French
				new DoTBBlock("cobbled_limestone", Material.ROCK, 1.0F, SoundType.STONE),
				flat_roof_tiles,
				new DoTBBlockStairs("flat_roof_tiles_stairs", flat_roof_tiles, 2.0F, SoundType.STONE),
				new DoTBBlockSlab("flat_roof_tiles_slab", Material.ROCK, 2.0F, SoundType.STONE),
				new DoTBBlockEdge("flat_roof_tiles_edge", Material.ROCK, 1.5F, SoundType.STONE),
				new DoTBBlock("framed_rammed_dirt", Material.WOOD, 1.0F, SoundType.GROUND).setBurnable(),
				new DoTBBlockPortcullis("iron_portcullis", Material.IRON),
				new DoTBBlockGlassBlock("lattice_glass"),
				new BlockLatticeGlassPane(),
				new BlockLatticeOakWindow(),
				limestone_brick,
				new DoTBBlockStairs("limestone_brick_stairs", limestone_brick, 2.0F, SoundType.STONE),
				new DoTBBlockSlab("limestone_brick_slab", Material.ROCK, 2.0F, SoundType.STONE),
				new DoTBBlockEdge("limestone_brick_edge", Material.ROCK, 2.0F, SoundType.STONE),
				new DoTBBlockWall("limestone_brick_wall", Material.ROCK, 2.0F, SoundType.STONE),
				new BlockLimestoneChimney(),
				new BlockLimestoneFireplace(),
				new DoTBBlockEdge("oak_planks_edge", Material.WOOD, 1.5F, SoundType.WOOD),
				new BlockOakShutters(),
				new DoTBBlockBeam("oak_beam", Material.WOOD, 1.5F, SoundType.WOOD).setBurnable(),
				new DoTBBlockSupportBeam("oak_support_beam", Material.WOOD, 1.5F, SoundType.WOOD).setBurnable(),
				new DoTSupportSlab("oak_support_slab", Material.WOOD, 1.0F, SoundType.WOOD).setBurnable(),
				new BlockSmallOakShutters(),
				new DoTBBlock("oak_timber_frame", Material.WOOD, 2.0F, SoundType.WOOD).setBurnable(),
				new DoTBBlockRotatedPillar("oak_timber_frame_corner", Material.WOOD,2.0F,SoundType.WOOD).setBurnable(),
				new DoTBBlockRotatedPillar("oak_timber_frame_pillar", Material.WOOD,2.0F,SoundType.WOOD).setBurnable(),
				new DoTBBlockFence("oak_waxed_fence", Material.WOOD).setBurnable(),
				oak_waxed_planks.setBurnable(),
				new DoTBBlockStairs("oak_waxed_planks_stairs", oak_waxed_planks, 1.5F, SoundType.WOOD),
				new DoTBBlockSlab("oak_waxed_planks_slab", Material.WOOD, 1.5F, SoundType.WOOD),
				new DoTBBlockEdge("oak_waxed_planks_edge", Material.WOOD, 1.5F, SoundType.WOOD),

				//Japanese
				new DoTBBlockDryer("bamboo_drying_tray", Material.WOOD, 1.0F, SoundType.WOOD),
				new BlockCamellia(),
				new BlockCastIronTeapot(),
				new BlockCastIronTeacup(),
				new BlockFloweryPaperWall(),
				new BlockPaperLamp(),
				grey_roof_tiles,
				new DoTBBlockStairs("grey_roof_tiles_stairs", grey_roof_tiles, 2.0F, SoundType.STONE),
				new DoTBBlockSlab("grey_roof_tiles_slab", Material.ROCK, 2.0F, SoundType.STONE),
				new DoTBBlock("grey_roof_tiles_edge", Material.ROCK, 1.5F, SoundType.STONE),
				new DoTBBlockWall("grey_roof_tiles_wall", Material.ROCK, 2.0F, SoundType.STONE),
				new BlockIkebanaFlowerPot(),
				new BlockSpruceLeglessChair(),
				new BlockLittleFlag(),
				new BlockPaperDoor(),
				new BlockPaperLantern(),
				new BlockPaperWall("paper_wall"),
				new BlockPaperWall("paper_wall_flat"),
				new DoTBBlockPane("paper_wall_window", Material.CLOTH).setBurnable(),
				new BlockRedPaintedLog(),
				new BlockRice(),
				new BlockSmallTatamiMat(),
				new DoTBBlockBeam("spruce_beam", Material.WOOD, 1.5F, SoundType.WOOD).setBurnable(),
				new DoTBBlock("spruce_foundation", Material.WOOD, 1.0F, SoundType.WOOD).setBurnable(),
				new DoTBBlockFence("spruce_log_fence", Material.WOOD, 2.0F, SoundType.WOOD).setBurnable(),
				new DoTBBlockWall("spruce_log_wall", Material.WOOD, 2.0F, SoundType.WOOD).setBurnable(),
				new DoTBBlock("spruce_planks_edge", Material.WOOD, 1.5F, SoundType.WOOD),
				new BlockSpruceRailing(),
				new BlockSpruceRoofSupport(),
				new DoTBBlockSupportBeam("spruce_support_beam", Material.WOOD, 1.5F, SoundType.WOOD).setBurnable(),
				new DoTSupportSlab("spruce_support_slab", Material.WOOD, 1.0F, SoundType.WOOD).setBurnable(),
				new BlockSpruceLowTable(),
				new DoTBBlock("spruce_timber_frame", Material.WOOD, 2.0F, SoundType.WOOD).setBurnable(),
				new DoTBBlockRotatedPillar("spruce_timber_frame_pillar", Material.WOOD, 2.0F, SoundType.WOOD).setBurnable(),
				new BlockStoneFrieze(),
				new BlockStoneLantern(),
				new BlockTatamiMat(),
				new BlockFuton(),
				new DoTBBlock("tatami_floor", Material.WOOD).setBurnable(),
				new BlockFirepit(),
				new BlockSakeBottle(),
				new BlockSakeCup(),
				new DoTBBlockSlab("spruce_foundation_slab", Material.WOOD, 1.0F, SoundType.WOOD),

				//mayan
				new BlockChiseledPlasteredStone(),
				new BlockCommelina(),
				new BlockFeatheredSerpentSculpture(),
				new DoTBBlockPlate("green_ornamented_plastered_stone_frieze"),
				new DoTBBlockPlate("green_plastered_stone_frieze"),
				new BlockGreenSculptedPlasteredStoneFrieze(),
				new DoTBBlock("green_small_plastered_stone_frieze", Material.ROCK, 1.5F, SoundType.STONE),
				new BlockMaize(),
				plastered_stone,
				new BlockPlasteredStoneColumn(),
				new BlockPlasteredStoneCresset(),
				new DoTBBlockPlate("plastered_stone_frieze"),
				new DoTBBlockStairs("plastered_stone_stairs", plastered_stone, 2.0F, SoundType.STONE),
				new DoTBBlockSlab("plastered_stone_slab", Material.ROCK, 2.0F, SoundType.STONE),
				new BlockPlasteredStoneWindow(),
				new DoTBBlockPlate("red_ornamented_plastered_stone_frieze"),
				new DoTBBlockPlate("red_plastered_stone_frieze"),
				new DoTBBlockStairs("red_plastered_stone_stairs", plastered_stone, 1, 2.0F, SoundType.STONE),
				new DoTBBlockSlab("red_plastered_stone_slab", Material.ROCK, 2.0F, SoundType.STONE),
				new BlockRedSculptedPlasteredStoneFrieze(),
				new DoTBBlock("red_small_plastered_stone_frieze", Material.ROCK, 1.5F, SoundType.STONE),
				new BlockSerpentSculptedColumn(),

				//roman
				new DoTBBlock("ochre_roof_tiles", Material.ROCK, 2.0F, SoundType.STONE),
				new DoTBBlockSlab("ochre_roof_tiles_slab", Material.ROCK, 1.5F, SoundType.STONE),
				new BlockSandstoneColumn()
		);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		for(Block block : blocks_list){
			registry.register(block);
		}
	}

	@SubscribeEvent
	public static void registerBlockItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		for (Block block : blocks_list) {
			String blockName = block.getRegistryName().getPath();

			if(!DoTBConfigs.enabledMap.get(blockName)){
				//Disabled in the config file → skip registering the item
				continue;
			}

			Item item;
			if(block instanceof IBlockCustomItem){
				item = ((IBlockCustomItem)block).getCustomItemBlock().setCreativeTab(DawnOfTimeBuilder.DOTB_TAB);
				registry.register(item);
				setResourceLocation(item, 0);

			}else if(block instanceof IBlockMeta){
				IBlockMeta blockMeta = (IBlockMeta) block;
				item = new DoTBItemMetaBlock(blockMeta).setRegistryName(block.getRegistryName()).setTranslationKey(block.getTranslationKey()).setCreativeTab(DawnOfTimeBuilder.DOTB_TAB);
				registry.register(item);
				for(IEnumMetaVariants variant : blockMeta.getVariants()){
					setResourceLocation(item, variant.getMetadata(), variant.getName());
				}

			}else{
				item = new ItemBlock(block).setRegistryName(block.getRegistryName()).setTranslationKey(block.getTranslationKey()).setCreativeTab(DawnOfTimeBuilder.DOTB_TAB);
				registry.register(item);
				setResourceLocation(item, 0);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	private static void setResourceLocation(Item item, int meta){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
	}

	@SideOnly(Side.CLIENT)
	private static void setResourceLocation(Item item, int meta, String variant){
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName().toString() + "_" + variant, "inventory"));
	}
}
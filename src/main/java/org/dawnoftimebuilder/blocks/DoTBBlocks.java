package org.dawnoftimebuilder.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraft.block.Block;
import org.dawnoftimebuilder.blocks.global.DoTBBlockSoilCrops;

import static org.dawnoftimebuilder.DawnOfTimeBuilder.MOD_ID;

@ObjectHolder(MOD_ID)
public class DoTBBlocks {

	//general
	@ObjectHolder("path_dirt") public static Block path_dirt;
	@ObjectHolder("path_gravel") public static Block path_gravel;
	@ObjectHolder("path_stepping_stones") public static Block path_stepping_stones;
	@ObjectHolder("path_cobbled") public static Block path_cobbled;
	@ObjectHolder("path_ochre_tiles") public static Block path_ochre_tiles;
	@ObjectHolder("path_dirt_slab") public static Block path_dirt_slab;
	@ObjectHolder("path_gravel_slab") public static Block path_gravel_slab;
	@ObjectHolder("path_stepping_stones_slab") public static Block path_stepping_stones_slab;
	@ObjectHolder("path_cobbled_slab") public static Block path_cobbled_slab;
	@ObjectHolder("path_ochre_tiles_slab") public static Block path_ochre_tiles_slab;
	@ObjectHolder("rammed_dirt") public static Block rammed_dirt;
	@ObjectHolder("thatch_wheat") public static Block thatch_wheat;
	@ObjectHolder("thatch_wheat_stairs") public static Block thatch_wheat_stairs;
	@ObjectHolder("thatch_wheat_slab") public static Block thatch_wheat_slab;
	@ObjectHolder("thatch_wheat_edge") public static Block thatch_wheat_edge;
	@ObjectHolder("thatch_bamboo") public static Block thatch_bamboo;
	@ObjectHolder("thatch_bamboo_stairs") public static Block thatch_bamboo_stairs;
	@ObjectHolder("thatch_bamboo_slab") public static Block thatch_bamboo_slab;
	@ObjectHolder("thatch_bamboo_edge") public static Block thatch_bamboo_edge;
	@ObjectHolder("fireplace") public static Block fireplace;
	@ObjectHolder("iron_chain") public static Block iron_chain;

	//french
	@ObjectHolder("cobbled_limestone") public static Block cobbled_limestone;
	@ObjectHolder("limestone_brick") public static Block limestone_brick;
	@ObjectHolder("limestone_brick_stairs") public static Block limestone_brick_stairs;
	@ObjectHolder("limestone_brick_slab") public static Block limestone_brick_slab;
	@ObjectHolder("limestone_brick_edge") public static Block limestone_brick_edge;
	@ObjectHolder("limestone_brick_wall") public static Block limestone_brick_wall;
	@ObjectHolder("limestone_fireplace") public static Block limestone_fireplace;
	@ObjectHolder("limestone_chimney") public static Block limestone_chimney;
	@ObjectHolder("framed_rammed_dirt") public static Block framed_rammed_dirt;
	@ObjectHolder("iron_portcullis") public static Block iron_portcullis;
	@ObjectHolder("lattice_glass") public static Block lattice_glass;
	@ObjectHolder("lattice_glass_pane") public static Block lattice_glass_pane;
	@ObjectHolder("lattice_oak_window") public static Block lattice_oak_window;
	@ObjectHolder("oak_planks_edge") public static Block oak_planks_edge;
	@ObjectHolder("small_oak_shutters") public static Block small_oak_shutters;
	@ObjectHolder("oak_shutters") public static Block oak_shutters;
	@ObjectHolder("oak_beam") public static Block oak_beam;
	@ObjectHolder("oak_support_beam") public static Block oak_support_beam;
	@ObjectHolder("oak_support_slab") public static Block oak_support_slab;
	@ObjectHolder("oak_timber_frame") public static Block oak_timber_frame;
	@ObjectHolder("oak_timber_frame_corner") public static Block oak_timber_frame_corner;
	@ObjectHolder("oak_timber_frame_pillar") public static Block oak_timber_frame_pillar;
	@ObjectHolder("flat_roof_tiles") public static Block flat_roof_tiles;
	@ObjectHolder("oak_waxed_planks") public static Block oak_waxed_planks;
	@ObjectHolder("oak_waxed_planks_stairs") public static Block oak_waxed_planks_stairs;
	@ObjectHolder("oak_waxed_planks_slab") public static Block oak_waxed_planks_slab;
	@ObjectHolder("oak_waxed_planks_edge") public static Block oak_waxed_planks_edge;
	@ObjectHolder("oak_waxed_fence") public static Block oak_waxed_fence;
	@ObjectHolder("flat_roof_tiles_stairs") public static Block flat_roof_tiles_stairs;
	@ObjectHolder("flat_roof_tiles_slab") public static Block flat_roof_tiles_slab;
	@ObjectHolder("flat_roof_tiles_edge") public static Block flat_roof_tiles_edge;

	//japanese
	@ObjectHolder("cast_iron_teapot") public static Block cast_iron_teapot;
	@ObjectHolder("futon") public static Block futon;
	@ObjectHolder("grey_roof_tiles") public static Block grey_roof_tiles;
	@ObjectHolder("little_flag") public static Block little_flag;
	@ObjectHolder("paper_door") public static Block paper_door;
	@ObjectHolder("rice") public static DoTBBlockSoilCrops rice;
	@ObjectHolder("tatami_mat") public static Block tatami_mat;

	//mayan
	@ObjectHolder("plastered_stone") public static Block plastered_stone;

	//roman
	@ObjectHolder("ochre_roof_tiles") public static Block ochre_roof_tiles;
}
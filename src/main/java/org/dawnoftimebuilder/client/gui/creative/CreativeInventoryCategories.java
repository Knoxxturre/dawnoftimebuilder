package org.dawnoftimebuilder.client.gui.creative;

import net.minecraft.item.Item;
import org.dawnoftimebuilder.items.DoTBItems;
import org.dawnoftimebuilder.items.global.DoTBItem;

import java.util.ArrayList;
import java.util.Arrays;

import static org.dawnoftimebuilder.blocks.DoTBBlocks.*;
import static org.dawnoftimebuilder.items.DoTBItems.camellia_leaves;
import static org.dawnoftimebuilder.items.DoTBItems.commelina;

public enum CreativeInventoryCategories {

	GENERAL("General",
			Item.getItemFromBlock(path_dirt),
			Item.getItemFromBlock(path_dirt_slab),
			Item.getItemFromBlock(path_gravel),
			Item.getItemFromBlock(path_gravel_slab),
			Item.getItemFromBlock(path_stepping_stones),
			Item.getItemFromBlock(path_stepping_stones_slab),
			Item.getItemFromBlock(path_cobbled),
			Item.getItemFromBlock(path_cobbled_slab),
			Item.getItemFromBlock(path_ochre_tiles),
			Item.getItemFromBlock(path_ochre_tiles_slab),
			Item.getItemFromBlock(rammed_dirt),
			Item.getItemFromBlock(thatch_wheat),
			Item.getItemFromBlock(thatch_wheat_stairs),
			Item.getItemFromBlock(thatch_wheat_slab),
			Item.getItemFromBlock(thatch_wheat_edge),
			Item.getItemFromBlock(thatch_bamboo),
			Item.getItemFromBlock(thatch_bamboo_stairs),
			Item.getItemFromBlock(thatch_bamboo_slab),
			Item.getItemFromBlock(thatch_bamboo_edge),
			Item.getItemFromBlock(fireplace),
			Item.getItemFromBlock(iron_chain)
	),

	FRENCH("French",
			Item.getItemFromBlock(path_dirt),
			Item.getItemFromBlock(path_dirt_slab),
			Item.getItemFromBlock(path_gravel),
			Item.getItemFromBlock(path_gravel_slab),
			Item.getItemFromBlock(path_cobbled),
			Item.getItemFromBlock(path_cobbled_slab),
			Item.getItemFromBlock(thatch_wheat),
			Item.getItemFromBlock(thatch_wheat_stairs),
			Item.getItemFromBlock(thatch_wheat_slab),
			Item.getItemFromBlock(thatch_wheat_edge),
			Item.getItemFromBlock(rammed_dirt),
			Item.getItemFromBlock(framed_rammed_dirt),
			Item.getItemFromBlock(oak_timber_frame),
			Item.getItemFromBlock(oak_timber_frame_corner),
			Item.getItemFromBlock(oak_timber_frame_pillar),
			Item.getItemFromBlock(oak_waxed_planks),
			Item.getItemFromBlock(oak_waxed_planks_stairs),
			Item.getItemFromBlock(oak_waxed_planks_slab),
			Item.getItemFromBlock(oak_waxed_planks_edge),
			Item.getItemFromBlock(oak_waxed_fence),
			Item.getItemFromBlock(oak_planks_edge),
			Item.getItemFromBlock(oak_beam),
			Item.getItemFromBlock(oak_support_beam),
			Item.getItemFromBlock(oak_support_slab),
			Item.getItemFromBlock(small_oak_shutters),
			DoTBItems.oak_shutters,
			Item.getItemFromBlock(lattice_glass),
			Item.getItemFromBlock(lattice_glass_pane),
			Item.getItemFromBlock(lattice_oak_window),
			Item.getItemFromBlock(cobbled_limestone),
			Item.getItemFromBlock(limestone_brick),
			Item.getItemFromBlock(limestone_brick_stairs),
			Item.getItemFromBlock(limestone_brick_slab),
			Item.getItemFromBlock(limestone_brick_edge),
			Item.getItemFromBlock(limestone_brick_wall),
			Item.getItemFromBlock(fireplace),
			Item.getItemFromBlock(limestone_fireplace),
			Item.getItemFromBlock(limestone_chimney),
			Item.getItemFromBlock(flat_roof_tiles),
			Item.getItemFromBlock(flat_roof_tiles_stairs),
			Item.getItemFromBlock(flat_roof_tiles_slab),
			Item.getItemFromBlock(flat_roof_tiles_edge),
			Item.getItemFromBlock(iron_portcullis),
			Item.getItemFromBlock(iron_chain),
			DoTBItems.iron_plate_armor_head,
			DoTBItems.iron_plate_armor_chest,
			DoTBItems.iron_plate_armor_legs,
			DoTBItems.iron_plate_armor_feet
	),

	JAPANESE("Japanese",
			camellia_leaves),

	MAYAN("Mayan",
			commelina),

	ROMAN("Roman",
			Item.getItemFromBlock(ochre_roof_tiles));

	private String name;
	private ArrayList<Item> items = new ArrayList<>();

	CreativeInventoryCategories(String name, Item... items) {
		this.name = name;
		this.items.addAll(Arrays.asList(items));
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Item> getItems(){
		return this.items;
	}
}
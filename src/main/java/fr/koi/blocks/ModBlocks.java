package fr.koi.blocks;

import fr.koi.constants.ModConstants;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static final Block MY_FIRST_BLOCK = register(new MyFirstBlock(), "my_first_block", true);

    private static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(ModConstants.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {
        // Register your blocks here.

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.MY_FIRST_BLOCK.asItem());
        });
    }

}

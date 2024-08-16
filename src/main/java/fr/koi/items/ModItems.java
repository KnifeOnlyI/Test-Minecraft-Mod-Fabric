package fr.koi.items;

import fr.koi.constants.ModConstants;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static final Item MY_FIRST_ITEM = register(new MyFirstItem(), "my_first_item");

    private static Item register(Item item, String id) {
        return Registry.register(
            Registries.ITEM,
            Identifier.of(ModConstants.MOD_ID, id),
            item
        );
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
            .register((itemGroup) -> itemGroup.add(ModItems.MY_FIRST_ITEM));
    }

}

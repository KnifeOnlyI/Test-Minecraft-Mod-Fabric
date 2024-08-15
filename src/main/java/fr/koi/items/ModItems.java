package fr.koi.items;

import fr.koi.constants.ModConstants;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Optional;

public class ModItems {

    public static final Item MY_FIRST_ITEM = register(
        // Ignore the food component for now, we'll cover it later in the food section.
        new Item(new Item.Settings().food(new FoodComponent(1, 0.1f, false, 1.0f, Optional.empty(), new ArrayList<>()))),
        "my_first_item"
    );

    public static Item register(Item item, String id) {
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

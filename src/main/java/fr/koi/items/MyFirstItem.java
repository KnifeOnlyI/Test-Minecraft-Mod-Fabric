package fr.koi.items;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.Optional;

public class MyFirstItem extends Item {

    public MyFirstItem() {
        super(new Item.Settings()
            .food(new FoodComponent(
                1,
                0.1f,
                false,
                1.0f,
                Optional.empty(),
                new ArrayList<>()
            ))
        );
    }

}

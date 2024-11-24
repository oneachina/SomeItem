package cn.onea.SomeItem.Item;

import cn.onea.SomeItem.SomeItemMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Someitems {
    // 模组的食物是Food Enhancements mod的，非官方移植版，不保证与原版一致
    public static final Item fish_bones = register(
            new Item(new Item.Settings()),
            "fish_bones"
    );

    public static void init()
    {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(fish_bones));
    }

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(SomeItemMod.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }
}

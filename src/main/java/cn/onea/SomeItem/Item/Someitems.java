package cn.onea.SomeItem.Item;

import cn.onea.SomeItem.SomeItemMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Someitems {
    private Someitems() {}
    public static final FoodComponent Food = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(2.0F)
            .build();
    // 模组的食物是Food Enhancements mod的，非官方移植版，不保证与原版一致
    public static final Item fish_bones = register(new Item(new Item.Settings().maxCount(64)), "fish_bones");

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(SomeItemMod.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static void initialize() {
    }
}

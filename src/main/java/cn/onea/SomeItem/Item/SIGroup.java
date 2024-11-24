package cn.onea.SomeItem.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SIGroup {
    public static final ItemGroup MiteFood = Registry.register(Registries.ITEM_GROUP, Identifier.of("someitem", "someitem"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(Someitems.fish_bones))
            .displayName(Text.translatable("MiteFood"))
            .entries((context, entries) -> {
                entries.add(Someitems.fish_bones);
            })
            .build());
}

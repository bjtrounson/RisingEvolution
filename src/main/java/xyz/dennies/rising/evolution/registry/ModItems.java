package xyz.dennies.rising.evolution.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Items
    public static final Item COPPER_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
    
    // BlockItems
    public static final BlockItem COPPER_ORE = new BlockItem(ModBlocks.COPPER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem COAL_GENERATOR = new BlockItem(ModBlocks.COAL_GENERATOR, new FabricItemSettings().group(ItemGroup.REDSTONE));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("risingevolution", "copper_ingot"), COPPER_INGOT);
        Registry.register(Registry.ITEM, new Identifier("risingevolution", "copper_ore"), COPPER_ORE);
        Registry.register(Registry.ITEM, new Identifier("risingevolution", "coal_generator"), COAL_GENERATOR);
    }
}

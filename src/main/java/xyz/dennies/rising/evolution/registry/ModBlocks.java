package xyz.dennies.rising.evolution.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block COPPER_ORE = new Block(FabricBlockSettings
        .of(Material.METAL, MaterialColor.STONE)
        .breakByTool(FabricToolTags.PICKAXES, 1)
        .requiresTool()
        .strength(4.0f, 5.0f)
        .sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("risingevolution", "copper_ore"), COPPER_ORE);
    }
}

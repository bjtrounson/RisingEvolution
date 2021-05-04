package xyz.dennies.rising.evolution.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.dennies.rising.evolution.registry.block.CoalGenerator;
import xyz.dennies.rising.evolution.registry.block.CopperOre;
import xyz.dennies.rising.evolution.registry.block.entities.CoalGeneratorEntity;

public class ModBlocks {

    public static BlockEntityType<CoalGeneratorEntity> COAL_GENERATOR_ENTITY;
    public static final Block COAL_GENERATOR = new CoalGenerator(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(4.0f, 5.0f).sounds(BlockSoundGroup.METAL));
    public static final Block COPPER_ORE = new CopperOre(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(4.0f, 5.0f).sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("risingevolution", "coal_generator"), COAL_GENERATOR);
        COAL_GENERATOR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "risingevolution:coal_generator", BlockEntityType.Builder.create(CoalGeneratorEntity::new, COAL_GENERATOR).build(null));
        Registry.register(Registry.BLOCK, new Identifier("risingevolution", "copper_ore"), COPPER_ORE);
    }
}

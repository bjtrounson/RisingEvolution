package xyz.dennies.rising.evolution.registry.block.entities;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class CoalGeneratorScreen extends CottonInventoryScreen<CoalGeneratorDescription> {

    public CoalGeneratorScreen(CoalGeneratorDescription gui, PlayerEntity player, Text title) {
        super(gui, player, title);
    }
    
}

package xyz.dennies.rising.evolution;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import xyz.dennies.rising.evolution.registry.block.entities.CoalGeneratorDescription;
import xyz.dennies.rising.evolution.registry.block.entities.CoalGeneratorScreen;

public class RisingEvolutionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ScreenRegistry.<CoalGeneratorDescription, CoalGeneratorScreen>register(RisingEvolution.SCREEN_HANDLER_TYPE, (gui, inventory, title) -> new CoalGeneratorScreen(gui, inventory.player, title));
    }
    
}

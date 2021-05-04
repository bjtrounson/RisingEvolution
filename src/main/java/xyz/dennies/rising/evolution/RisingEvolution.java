package xyz.dennies.rising.evolution;

import xyz.dennies.rising.evolution.registry.*;
import xyz.dennies.rising.evolution.registry.block.CoalGenerator;
import xyz.dennies.rising.evolution.registry.block.entities.CoalGeneratorDescription;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;

public class RisingEvolution implements ModInitializer {

	public static ScreenHandlerType<CoalGeneratorDescription> SCREEN_HANDLER_TYPE;

	@Override
	public void onInitialize() {
		SCREEN_HANDLER_TYPE = ScreenHandlerRegistry.registerSimple(CoalGenerator.ID, (syncId, inventory) -> new CoalGeneratorDescription(SCREEN_HANDLER_TYPE, syncId, inventory, ScreenHandlerContext.EMPTY));;
		ModBlocks.registerBlocks();
		ModItems.registerItems();
		System.out.println("Initializing Rising Evolution!");
	}
}

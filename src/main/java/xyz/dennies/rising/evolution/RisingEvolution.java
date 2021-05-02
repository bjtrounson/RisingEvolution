package xyz.dennies.rising.evolution;

import xyz.dennies.rising.evolution.registry.*;
import net.fabricmc.api.ModInitializer;

public class RisingEvolution implements ModInitializer {


	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		System.out.println("Initializing Rising Evolution!");
	}
}

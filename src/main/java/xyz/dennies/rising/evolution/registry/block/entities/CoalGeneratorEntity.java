package xyz.dennies.rising.evolution.registry.block.entities;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import xyz.dennies.rising.evolution.RisingEvolution;
import xyz.dennies.rising.evolution.registry.ModBlocks;

public class CoalGeneratorEntity extends BlockEntity implements ImplementedInventory, NamedScreenHandlerFactory {
    static final int INVENTORY_SIZE = 1;

    DefaultedList<ItemStack> items = DefaultedList.ofSize(INVENTORY_SIZE, ItemStack.EMPTY);

    public CoalGeneratorEntity() {
        super(ModBlocks.COAL_GENERATOR_ENTITY);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return pos.isWithinDistance(player.getBlockPos(), 4.5);
    }

    @Override
	public Text getDisplayName() {
		return new LiteralText(""); // no title
	}

	@Nullable
	@Override
	public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
		return new CoalGeneratorDescription(RisingEvolution.SCREEN_HANDLER_TYPE, syncId, inv, ScreenHandlerContext.create(world, pos));
	}
    
}

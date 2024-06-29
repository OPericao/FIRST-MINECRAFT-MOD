package net.pericles.firstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pericles.firstmod.FirstMod;
import net.pericles.firstmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MODID);

    public static final RegistryObject<CreativeModeTab> FIRST_TAB = CREATIVE_MODE_TABS.register("first_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ZAFIRO.get()))
                    .title(Component.translatable("creativetab.first_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                         output.accept(ModItems.ZAFIRO.get());
                         output.accept(ModItems.ZAFIRO_CRUDO.get());
                         output.accept(ModBlocks.BLOQUE_ZAFIRO.get());

                         output.accept(ModItems.COMBINADO4.get());

                         output.accept(Items.EGG);
                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

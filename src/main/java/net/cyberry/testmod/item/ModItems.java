package net.cyberry.testmod.item;

import net.cyberry.testmod.TestMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new SwordItem(Tiers.STONE, 3, -2.4F, (new Item.Properties()).tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate",
            () -> new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModCreativeModeTab.TEST_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}

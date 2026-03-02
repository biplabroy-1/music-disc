package com.example.musicdisc.init;

import com.example.musicdisc.MusicDiscMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicDiscMod.MOD_ID);

    public static final RegistryObject<Item> CUSTOM_DISC =
            ITEMS.register("custom_disc",
                    () -> new RecordItem(
                            15,
                            ModSounds.CUSTOM_MUSIC,
                            new Item.Properties().stacksTo(1),
                            235));
}

package com.example.musicdisc;

import com.example.musicdisc.init.ModItems;
import com.example.musicdisc.init.ModSounds;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MusicDiscMod.MOD_ID)
public class MusicDiscMod {

    public static final String MOD_ID = "musicdisc";

    public MusicDiscMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModSounds.SOUNDS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
    }
}

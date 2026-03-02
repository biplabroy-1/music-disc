package com.example.musicdisc.init;

import com.example.musicdisc.MusicDiscMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MusicDiscMod.MOD_ID);

    public static final RegistryObject<SoundEvent> CUSTOM_MUSIC =
            SOUNDS.register("music.custom",
                    () -> SoundEvent.createVariableRangeEvent(
                            new ResourceLocation(MusicDiscMod.MOD_ID, "music.custom")));
}

# Music Disc Mod

A **Forge 1.20.1** mod that adds a custom music disc (`Custom Music Disc`) that can be played in a jukebox with a custom sound.

## Features

- **Custom Music Disc** item (`musicdisc:custom_disc`) that can be inserted into any jukebox
- **Custom Sound** (`musicdisc:music.custom`) — a 1-second placeholder audio track (replace with your own OGG file for real music)
- Redstone comparator output of **15** while the disc is playing

## Getting Started

### Prerequisites

- Java 17
- [Forge 1.20.1-47.2.20](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.20.1.html) (or later 47.x)
- Gradle 8.x (the Gradle wrapper is included)

### Building

```bash
./gradlew build
```

The compiled JAR will be output to `build/libs/musicdisc-1.20.1-1.0.0.jar`.

### Adding Your Own Music

1. Encode your audio file as OGG Vorbis (`.ogg`) — Minecraft requires OGG format.
2. Replace `src/main/resources/assets/musicdisc/sounds/music/custom.ogg` with your OGG file.
3. Rebuild the mod.

### Project Structure

```
src/main/
├── java/com/example/musicdisc/
│   ├── MusicDiscMod.java          # Main mod class
│   └── init/
│       ├── ModSounds.java         # Sound event registration
│       └── ModItems.java          # Item registration
└── resources/
    ├── META-INF/mods.toml         # Mod metadata
    ├── pack.mcmeta
    └── assets/musicdisc/
        ├── sounds.json            # Sound event definitions
        ├── lang/en_us.json        # Display names
        ├── models/item/
        │   └── custom_disc.json   # Item model
        ├── sounds/music/
        │   └── custom.ogg         # Audio file (replace with your own)
        └── textures/item/
            └── custom_disc.png    # Item texture
```

## Obtaining the Disc In-Game

Use the following command in creative mode or with cheats enabled:

```
/give @p musicdisc:custom_disc
```

Then right-click a jukebox while holding the disc to play the music.

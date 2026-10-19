# Revamped Phantoms — Unofficial Fabric 1.20.1 Backport

This is a community backport of [Revamped Phantoms by Luke Bemish](https://modrinth.com/mod/revamped_phantoms) for Minecraft 1.20.1 on Fabric. It is a separate, unofficial release and is not affiliated with the original author.

The backport keeps the original gameplay features: phantoms can hunt livestock and villagers, stun prey with a shockwave, grab and carry prey, and are frightened by cats. The original configuration options, textures, and effect icon are included. The mod ID remains `revamped_phantoms` for config compatibility.

## Compatibility

- Minecraft Java Edition 1.20.1
- Fabric Loader 0.16.10 or newer
- Fabric API 0.92.12 or newer for Minecraft 1.20.1

This build targets Minecraft 1.20.1 only. Install Fabric API alongside the mod.

## Build

Use Java 17 or newer and run:

```powershell
./gradlew.bat :fabric:build
```

The distributable JAR is written to `fabric/build/libs/`.

## Attribution and license

The original project and included artwork are by Luke Bemish. This backport is based on the original LGPL-3.0-or-later project and preserves its license; see [LICENSE](LICENSE) for the license text and [the upstream source](https://github.com/lukebemishprojects/RevampedPhantoms) for the original work.

AI assistance was used in adapting this unofficial backport; the code was built and smoke-tested on Minecraft 1.20.1 Fabric.

package dev.kikugie.crashpipe;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION, clientSideOnly = true, acceptableRemoteVersions = "*", dependencies = "required-after:mixinbooter@[8.0,)")
public class CrashPipe {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        SoundLoader.init();
    }
}

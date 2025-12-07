package dev.kikugie.crashpipe.mixin;

import dev.kikugie.crashpipe.SoundLoader;
import net.minecraft.crash.CrashReport;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CrashReport.class)
public class CrashReportMixin {
    @Inject(method = "getCompleteReport", at = @At("HEAD"))
    private void playTheFunny(CallbackInfoReturnable<String> cir) {
        SoundLoader.tryPlay();
    }
}
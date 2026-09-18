package com.example.ui.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/example/ui/theme/AppTheme;", "", "<init>", "()V", "colors", "Lcom/example/ui/theme/AppColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/example/ui/theme/AppColors;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppTheme {
    public static final int $stable = 0;
    public static final AppTheme INSTANCE = new AppTheme();

    private AppTheme() {
    }

    public final AppColors getColors(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -792753617, "C(<get-colors>)101@3305L7:Theme.kt#75kw8w");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-792753617, $changed, -1, "com.example.ui.theme.AppTheme.<get-colors> (Theme.kt:101)");
        }
        ProvidableCompositionLocal<AppColors> localAppColors = ThemeKt.getLocalAppColors();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = $composer.consume(localAppColors);
        ComposerKt.sourceInformationMarkerEnd($composer);
        AppColors appColors = (AppColors) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return appColors;
    }
}

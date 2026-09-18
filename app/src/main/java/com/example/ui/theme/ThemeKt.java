package com.example.ui.theme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.example.data.AppThemeMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"DarkAppColors", "Lcom/example/ui/theme/AppColors;", "getDarkAppColors", "()Lcom/example/ui/theme/AppColors;", "LightAppColors", "getLightAppColors", "LocalAppColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAppColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "MyApplicationTheme", "", "themeMode", "Lcom/example/data/AppThemeMode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/example/data/AppThemeMode;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeKt {
    private static final AppColors DarkAppColors = new AppColors(true, androidx.compose.ui.graphics.ColorKt.Color(4278717722L), androidx.compose.ui.graphics.ColorKt.Color(4279047463L), androidx.compose.ui.graphics.ColorKt.Color(4279311411L), androidx.compose.ui.graphics.ColorKt.Color(4279640895L), androidx.compose.ui.graphics.ColorKt.Color(4279377462L), androidx.compose.ui.graphics.ColorKt.Color(4279113515L), androidx.compose.ui.graphics.ColorKt.Color(4280496719L), androidx.compose.ui.graphics.ColorKt.Color(4281221220L), androidx.compose.ui.graphics.ColorKt.Color(4294507260L), androidx.compose.ui.graphics.ColorKt.Color(4287931320L), androidx.compose.ui.graphics.ColorKt.Color(4284773515L), androidx.compose.ui.graphics.ColorKt.Color(4287323382L), androidx.compose.ui.graphics.ColorKt.Color(4285343961L), androidx.compose.ui.graphics.ColorKt.Color(4281908728L), androidx.compose.ui.graphics.ColorKt.Color(4280640491L), androidx.compose.ui.graphics.ColorKt.Color(4284704497L), androidx.compose.ui.graphics.ColorKt.Color(4279286145L), androidx.compose.ui.graphics.ColorKt.Color(4293870660L), androidx.compose.ui.graphics.ColorKt.Color(4294286859L), Brush.Companion.m4108horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4149boximpl(androidx.compose.ui.graphics.ColorKt.Color(4287323382L)), Color.m4149boximpl(androidx.compose.ui.graphics.ColorKt.Color(4284704497L)), Color.m4149boximpl(androidx.compose.ui.graphics.ColorKt.Color(4281908728L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
    private static final AppColors LightAppColors = new AppColors(false, androidx.compose.ui.graphics.ColorKt.Color(4294507260L), androidx.compose.ui.graphics.ColorKt.Color(4294047225L), androidx.compose.ui.graphics.ColorKt.Color(4294967295L), androidx.compose.ui.graphics.ColorKt.Color(4294047225L), androidx.compose.ui.graphics.ColorKt.Color(4294967295L), androidx.compose.ui.graphics.ColorKt.Color(4294047225L), androidx.compose.ui.graphics.ColorKt.Color(4293060848L), androidx.compose.ui.graphics.ColorKt.Color(4291548641L), androidx.compose.ui.graphics.ColorKt.Color(4279179050L), androidx.compose.ui.graphics.ColorKt.Color(4282865001L), androidx.compose.ui.graphics.ColorKt.Color(4284773515L), androidx.compose.ui.graphics.ColorKt.Color(4286331629L), androidx.compose.ui.graphics.ColorKt.Color(4285343961L), androidx.compose.ui.graphics.ColorKt.Color(4278355143L), androidx.compose.ui.graphics.ColorKt.Color(4278413729L), androidx.compose.ui.graphics.ColorKt.Color(4283385573L), androidx.compose.ui.graphics.ColorKt.Color(4278556265L), androidx.compose.ui.graphics.ColorKt.Color(4292617766L), androidx.compose.ui.graphics.ColorKt.Color(4292441862L), Brush.Companion.m4108horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4149boximpl(androidx.compose.ui.graphics.ColorKt.Color(4286331629L)), Color.m4149boximpl(androidx.compose.ui.graphics.ColorKt.Color(4283385573L)), Color.m4149boximpl(androidx.compose.ui.graphics.ColorKt.Color(4278355143L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
    private static final ProvidableCompositionLocal<AppColors> LocalAppColors = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AppColors appColors;
            appColors = ThemeKt.DarkAppColors;
            return appColors;
        }
    });
    private static final ColorScheme DarkColorScheme = ColorSchemeKt.m1932darkColorSchemeCXl9yA$default(androidx.compose.ui.graphics.ColorKt.Color(4287323382L), androidx.compose.ui.graphics.ColorKt.Color(4294507260L), androidx.compose.ui.graphics.ColorKt.Color(4279640895L), androidx.compose.ui.graphics.ColorKt.Color(4294507260L), 0, androidx.compose.ui.graphics.ColorKt.Color(4281908728L), androidx.compose.ui.graphics.ColorKt.Color(4278717722L), androidx.compose.ui.graphics.ColorKt.Color(4279311411L), androidx.compose.ui.graphics.ColorKt.Color(4294507260L), androidx.compose.ui.graphics.ColorKt.Color(4284704497L), androidx.compose.ui.graphics.ColorKt.Color(4294507260L), 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4278717722L), androidx.compose.ui.graphics.ColorKt.Color(4294507260L), androidx.compose.ui.graphics.ColorKt.Color(4279311411L), androidx.compose.ui.graphics.ColorKt.Color(4294507260L), androidx.compose.ui.graphics.ColorKt.Color(4279377462L), androidx.compose.ui.graphics.ColorKt.Color(4287931320L), 0, 0, 0, 0, 0, 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4280496719L), androidx.compose.ui.graphics.ColorKt.Color(4281221220L), 0, 0, 0, 0, 0, 0, 0, 0, -201844720, 15, null);
    private static final ColorScheme LightColorScheme = ColorSchemeKt.m1936lightColorSchemeCXl9yA$default(androidx.compose.ui.graphics.ColorKt.Color(4286331629L), androidx.compose.ui.graphics.ColorKt.Color(4294967295L), androidx.compose.ui.graphics.ColorKt.Color(4293782014L), androidx.compose.ui.graphics.ColorKt.Color(4283178389L), 0, androidx.compose.ui.graphics.ColorKt.Color(4278355143L), androidx.compose.ui.graphics.ColorKt.Color(4294967295L), androidx.compose.ui.graphics.ColorKt.Color(4292932350L), androidx.compose.ui.graphics.ColorKt.Color(4278413729L), androidx.compose.ui.graphics.ColorKt.Color(4283385573L), androidx.compose.ui.graphics.ColorKt.Color(4294967295L), 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4294507260L), androidx.compose.ui.graphics.ColorKt.Color(4279179050L), androidx.compose.ui.graphics.ColorKt.Color(4294967295L), androidx.compose.ui.graphics.ColorKt.Color(4279179050L), androidx.compose.ui.graphics.ColorKt.Color(4294047225L), androidx.compose.ui.graphics.ColorKt.Color(4282865001L), 0, 0, 0, 0, 0, 0, 0, androidx.compose.ui.graphics.ColorKt.Color(4293060848L), androidx.compose.ui.graphics.ColorKt.Color(4291548641L), 0, 0, 0, 0, 0, 0, 0, 0, -201844720, 15, null);

    /* compiled from: Theme.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppThemeMode.values().length];
            try {
                iArr[AppThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[AppThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[AppThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MyApplicationTheme$lambda$4(AppThemeMode appThemeMode, Function2 function2, int i, int i2, Composer composer, int i3) {
        MyApplicationTheme(appThemeMode, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final AppColors getDarkAppColors() {
        return DarkAppColors;
    }

    public static final AppColors getLightAppColors() {
        return LightAppColors;
    }

    public static final ProvidableCompositionLocal<AppColors> getLocalAppColors() {
        return LocalAppColors;
    }

    public static final void MyApplicationTheme(AppThemeMode themeMode, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        final AppThemeMode themeMode2;
        final boolean isDark;
        Object obj;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(-684213550);
        ComposerKt.sourceInformation($composer2, "C(MyApplicationTheme)P(1)151@4932L21,161@5279L7,176@5907L148,174@5833L222:Theme.kt#75kw8w");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(themeMode == null ? -1 : themeMode.ordinal()) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            themeMode2 = themeMode;
        } else {
            if (i2 != 0) {
                themeMode2 = AppThemeMode.DARK;
            } else {
                themeMode2 = themeMode;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-684213550, $dirty, -1, "com.example.ui.theme.MyApplicationTheme (Theme.kt:150)");
            }
            boolean isSystemInDark = DarkThemeKt.isSystemInDarkTheme($composer2, 0);
            switch (WhenMappings.$EnumSwitchMapping$0[themeMode2.ordinal()]) {
                case 1:
                    isDark = true;
                    break;
                case 2:
                    isDark = false;
                    break;
                case 3:
                    isDark = isSystemInDark;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            AppColors appColors = isDark ? DarkAppColors : LightAppColors;
            final ColorScheme m3ColorScheme = isDark ? DarkColorScheme : LightColorScheme;
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localView);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final View view = (View) consume;
            if (view.isInEditMode()) {
                $composer2.startReplaceGroup(504174032);
            } else {
                $composer2.startReplaceGroup(509463376);
                ComposerKt.sourceInformation($composer2, "163@5336L485,163@5325L496");
                ComposerKt.sourceInformationMarkerStart($composer2, -399207049, "CC(remember):Theme.kt#9igjgp");
                boolean changedInstance = $composer2.changedInstance(view) | $composer2.changed(isDark);
                Object rememberedValue = $composer2.rememberedValue();
                if (!changedInstance && rememberedValue != Composer.INSTANCE.getEmpty()) {
                    obj = rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    EffectsKt.SideEffect((Function0) obj, $composer2, 0);
                }
                obj = new Function0() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ThemeKt.MyApplicationTheme$lambda$2$lambda$1(view, isDark);
                    }
                };
                $composer2.updateRememberedValue(obj);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                EffectsKt.SideEffect((Function0) obj, $composer2, 0);
            }
            $composer2.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(LocalAppColors.provides(appColors), ComposableLambdaKt.rememberComposableLambda(-1047478382, true, new Function2() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ThemeKt.MyApplicationTheme$lambda$3(ColorScheme.this, content, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.theme.ThemeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ThemeKt.MyApplicationTheme$lambda$4(AppThemeMode.this, content, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MyApplicationTheme$lambda$2$lambda$1(View $view, boolean $isDark) {
        Context context = $view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            WindowInsetsControllerCompat windowInsetsController = WindowCompat.getInsetsController(window, $view);
            Intrinsics.checkNotNullExpressionValue(windowInsetsController, "getInsetsController(...)");
            windowInsetsController.setAppearanceLightStatusBars(!$isDark);
            windowInsetsController.setAppearanceLightNavigationBars(!$isDark);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MyApplicationTheme$lambda$3(ColorScheme $m3ColorScheme, Function2 $content, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C177@5917L132:Theme.kt#75kw8w");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1047478382, $changed, -1, "com.example.ui.theme.MyApplicationTheme.<anonymous> (Theme.kt:177)");
            }
            MaterialThemeKt.MaterialTheme($m3ColorScheme, null, TypeKt.getTypography(), $content, $composer, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

package com.example.ui.tools;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.unit.Dp;
import com.example.data.AppThemeMode;
import com.example.data.ThemeStorage;
import com.example.ui.theme.AppColors;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FerramentasScreen.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a½\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0012H\u0003¢\u0006\u0002\u0010\u0018\u001aE\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010!\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\"\u001aQ\u0010#\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010(\u001a\u00020\u001bH\u0003¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"FerramentasScreen", "", "seriesList", "", "Lcom/example/model/Series;", "onOpenExportar", "Lkotlin/Function0;", "onOpenGooglePlanilhas", "onOpenSincronizacao", "onOpenTesteConexao", "onOpenLixeira", "onOpenPendencias", "onOpenApiConfig", "modifier", "Landroidx/compose/ui/Modifier;", "currentThemeMode", "Lcom/example/data/AppThemeMode;", "onThemeModeChange", "Lkotlin/Function1;", "onBack", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/example/data/AppThemeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "ThemeSelectorCard", "currentMode", "onSelectMode", "(Lcom/example/data/AppThemeMode;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ThemeOptionButton", "title", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "isSelected", "", "onClick", "testTag", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ToolItemCard", "subtitle", "iconTint", "Landroidx/compose/ui/graphics/Color;", "badgeText", "tag", "ToolItemCard-hYmLsZ8", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FerramentasScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FerramentasScreen$lambda$10(List list, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Modifier modifier, AppThemeMode appThemeMode, Function1 function1, Function0 function08, int i, int i2, int i3, Composer composer, int i4) {
        FerramentasScreen(list, function0, function02, function03, function04, function05, function06, function07, modifier, appThemeMode, function1, function08, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ThemeOptionButton$lambda$25(Modifier modifier, String str, ImageVector imageVector, boolean z, Function0 function0, String str2, int i, int i2, Composer composer, int i3) {
        ThemeOptionButton(modifier, str, imageVector, z, function0, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ThemeSelectorCard$lambda$20(AppThemeMode appThemeMode, Function1 function1, int i, Composer composer, int i2) {
        ThemeSelectorCard(appThemeMode, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ToolItemCard_hYmLsZ8$lambda$36(String str, String str2, ImageVector imageVector, long j, String str3, Function0 function0, String str4, int i, int i2, Composer composer, int i3) {
        m7100ToolItemCardhYmLsZ8(str, str2, imageVector, j, str3, function0, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0d67  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0689 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0454  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FerramentasScreen(final java.util.List<com.example.model.Series> r151, final kotlin.jvm.functions.Function0<kotlin.Unit> r152, final kotlin.jvm.functions.Function0<kotlin.Unit> r153, final kotlin.jvm.functions.Function0<kotlin.Unit> r154, final kotlin.jvm.functions.Function0<kotlin.Unit> r155, final kotlin.jvm.functions.Function0<kotlin.Unit> r156, final kotlin.jvm.functions.Function0<kotlin.Unit> r157, kotlin.jvm.functions.Function0<kotlin.Unit> r158, androidx.compose.ui.Modifier r159, com.example.data.AppThemeMode r160, kotlin.jvm.functions.Function1<? super com.example.data.AppThemeMode, kotlin.Unit> r161, kotlin.jvm.functions.Function0<kotlin.Unit> r162, androidx.compose.runtime.Composer r163, final int r164, final int r165, final int r166) {
        /*
            Method dump skipped, instructions count: 3488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.FerramentasScreenKt.FerramentasScreen(java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, com.example.data.AppThemeMode, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FerramentasScreen$lambda$9$lambda$5$lambda$3(AppColors $colors, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C111@4625L264:FerramentasScreen.kt#75g7xq");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1450459893, $changed, -1, "com.example.ui.tools.FerramentasScreen.<anonymous>.<anonymous>.<anonymous> (FerramentasScreen.kt:111)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), $colors.m7093getTextPrimary0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FerramentasScreen$lambda$9$lambda$8$lambda$7$lambda$6(Context $context, Function1 $onThemeModeChange, AppThemeMode newMode) {
        Intrinsics.checkNotNullParameter(newMode, "newMode");
        ThemeStorage.INSTANCE.saveThemeMode($context, newMode);
        if ($onThemeModeChange != null) {
            $onThemeModeChange.invoke(newMode);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0519 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0605 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ThemeSelectorCard(final com.example.data.AppThemeMode r118, final kotlin.jvm.functions.Function1<? super com.example.data.AppThemeMode, kotlin.Unit> r119, androidx.compose.runtime.Composer r120, final int r121) {
        /*
            Method dump skipped, instructions count: 1673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.FerramentasScreenKt.ThemeSelectorCard(com.example.data.AppThemeMode, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ThemeSelectorCard$lambda$19$lambda$18$lambda$17$lambda$12$lambda$11(Function1 $onSelectMode) {
        $onSelectMode.invoke(AppThemeMode.DARK);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ThemeSelectorCard$lambda$19$lambda$18$lambda$17$lambda$14$lambda$13(Function1 $onSelectMode) {
        $onSelectMode.invoke(AppThemeMode.LIGHT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ThemeSelectorCard$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15(Function1 $onSelectMode) {
        $onSelectMode.invoke(AppThemeMode.SYSTEM);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ThemeOptionButton(androidx.compose.ui.Modifier r111, final java.lang.String r112, final androidx.compose.ui.graphics.vector.ImageVector r113, final boolean r114, final kotlin.jvm.functions.Function0<kotlin.Unit> r115, final java.lang.String r116, androidx.compose.runtime.Composer r117, final int r118, final int r119) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.FerramentasScreenKt.ThemeOptionButton(androidx.compose.ui.Modifier, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, boolean, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ThemeOptionButton$lambda$22$lambda$21(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0d30  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0798 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x062b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0376 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04a7  */
    /* renamed from: ToolItemCard-hYmLsZ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7100ToolItemCardhYmLsZ8(final java.lang.String r201, final java.lang.String r202, final androidx.compose.ui.graphics.vector.ImageVector r203, final long r204, java.lang.String r206, final kotlin.jvm.functions.Function0<kotlin.Unit> r207, final java.lang.String r208, androidx.compose.runtime.Composer r209, final int r210, final int r211) {
        /*
            Method dump skipped, instructions count: 3412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.FerramentasScreenKt.m7100ToolItemCardhYmLsZ8(java.lang.String, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, long, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ToolItemCard_hYmLsZ8$lambda$27$lambda$26(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }
}

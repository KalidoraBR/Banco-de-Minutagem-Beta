package com.example.ui.season;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EpisodeLegendModal.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a0\u0010\u0007\u001a\u00020\u00012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"EpisodeLegendModal", "", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "(Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LegendItem", "icon", "Landroidx/compose/runtime/Composable;", "title", "", "description", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EpisodeLegendModalKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeLegendModal$lambda$4(SheetState sheetState, Function0 function0, int i, Composer composer, int i2) {
        EpisodeLegendModal(sheetState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LegendItem$lambda$7(Function2 function2, String str, String str2, int i, Composer composer, int i2) {
        LegendItem(function2, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EpisodeLegendModal(final SheetState sheetState, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(1910917434);
        ComposerKt.sourceInformation($composer3, "C(EpisodeLegendModal)P(1)59@2415L7193,53@2195L7413:EpisodeLegendModal.kt#98f12s");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(sheetState) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($dirty & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1910917434, $dirty, -1, "com.example.ui.season.EpisodeLegendModal (EpisodeLegendModal.kt:52)");
            }
            $composer2 = $composer3;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(onDismiss, TestTagKt.testTag(Modifier.INSTANCE, "episode_legend_modal"), sheetState, 0.0f, null, ColorKt.getNavySurface(), 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-753816041, true, new Function3() { // from class: com.example.ui.season.EpisodeLegendModalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return EpisodeLegendModalKt.EpisodeLegendModal$lambda$3(Function0.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty >> 3) & 14) | 805503024 | (($dirty << 6) & 896), 384, 3544);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.season.EpisodeLegendModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EpisodeLegendModalKt.EpisodeLegendModal$lambda$4(SheetState.this, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit EpisodeLegendModal$lambda$3(kotlin.jvm.functions.Function0 r114, androidx.compose.foundation.layout.ColumnScope r115, androidx.compose.runtime.Composer r116, int r117) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.EpisodeLegendModalKt.EpisodeLegendModal$lambda$3(kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void LegendItem(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r105, java.lang.String r106, java.lang.String r107, androidx.compose.runtime.Composer r108, final int r109) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.EpisodeLegendModalKt.LegendItem(kotlin.jvm.functions.Function2, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }
}

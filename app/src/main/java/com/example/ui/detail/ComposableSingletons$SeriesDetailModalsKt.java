package com.example.ui.detail;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeriesDetailModals.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$SeriesDetailModalsKt {
    public static final ComposableSingletons$SeriesDetailModalsKt INSTANCE = new ComposableSingletons$SeriesDetailModalsKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$614154928 = ComposableLambdaKt.composableLambdaInstance(614154928, false, new Function3() { // from class: com.example.ui.detail.ComposableSingletons$SeriesDetailModalsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SeriesDetailModalsKt.lambda_614154928$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1317936118 = ComposableLambdaKt.composableLambdaInstance(1317936118, false, new Function3() { // from class: com.example.ui.detail.ComposableSingletons$SeriesDetailModalsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SeriesDetailModalsKt.lambda_1317936118$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1317936118$app() {
        return lambda$1317936118;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$614154928$app() {
        return lambda$614154928;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_614154928$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C156@6019L155:SeriesDetailModals.kt#gbrlqe");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(614154928, $changed, -1, "com.example.ui.detail.ComposableSingletons$SeriesDetailModalsKt.lambda$614154928.<anonymous> (SeriesDetailModals.kt:156)");
            }
            TextKt.m2693Text4IGK_g("Entendido", (Modifier) null, ColorKt.getTextWhite(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1317936118$lambda$1(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C361@12675L165:SeriesDetailModals.kt#gbrlqe");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1317936118, $changed, -1, "com.example.ui.detail.ComposableSingletons$SeriesDetailModalsKt.lambda$1317936118.<anonymous> (SeriesDetailModals.kt:361)");
            }
            TextKt.m2693Text4IGK_g("Voltar para a série", (Modifier) null, ColorKt.getTextWhite(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196998, 0, 131034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

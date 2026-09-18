package com.example.ui.placeholder;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.unit.Dp;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProvisionalScreens.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$ProvisionalScreensKt {
    public static final ComposableSingletons$ProvisionalScreensKt INSTANCE = new ComposableSingletons$ProvisionalScreensKt();

    /* renamed from: lambda$-1072918242, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f110lambda$1072918242 = ComposableLambdaKt.composableLambdaInstance(-1072918242, false, new Function2() { // from class: com.example.ui.placeholder.ComposableSingletons$ProvisionalScreensKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ProvisionalScreensKt.lambda__1072918242$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1581807277, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f111lambda$1581807277 = ComposableLambdaKt.composableLambdaInstance(-1581807277, false, new Function3() { // from class: com.example.ui.placeholder.ComposableSingletons$ProvisionalScreensKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ProvisionalScreensKt.lambda__1581807277$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1072918242$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7026getLambda$1072918242$app() {
        return f110lambda$1072918242;
    }

    /* renamed from: getLambda$-1581807277$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7027getLambda$1581807277$app() {
        return f111lambda$1581807277;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1072918242$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C90@3628L265:ProvisionalScreens.kt#joux1y");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1072918242, $changed, -1, "com.example.ui.placeholder.ComposableSingletons$ProvisionalScreensKt.lambda$-1072918242.<anonymous> (ProvisionalScreens.kt:90)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar ao Início", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1581807277$lambda$1(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C206@8415L10,204@8304L311:ProvisionalScreens.kt#joux1y");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1581807277, $changed, -1, "com.example.ui.placeholder.ComposableSingletons$ProvisionalScreensKt.lambda$-1581807277.<anonymous> (ProvisionalScreens.kt:204)");
            }
            TextKt.m2693Text4IGK_g("Voltar ao Início", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), ColorKt.getTextWhite(), 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

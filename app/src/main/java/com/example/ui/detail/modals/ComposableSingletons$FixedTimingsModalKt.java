package com.example.ui.detail.modals;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FixedTimingsModal.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$FixedTimingsModalKt {
    public static final ComposableSingletons$FixedTimingsModalKt INSTANCE = new ComposableSingletons$FixedTimingsModalKt();
    private static Function2<Composer, Integer, Unit> lambda$1381482196 = ComposableLambdaKt.composableLambdaInstance(1381482196, false, new Function2() { // from class: com.example.ui.detail.modals.ComposableSingletons$FixedTimingsModalKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$FixedTimingsModalKt.lambda_1381482196$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-486618680, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f100lambda$486618680 = ComposableLambdaKt.composableLambdaInstance(-486618680, false, new Function3() { // from class: com.example.ui.detail.modals.ComposableSingletons$FixedTimingsModalKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FixedTimingsModalKt.lambda__486618680$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-835106806, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f101lambda$835106806 = ComposableLambdaKt.composableLambdaInstance(-835106806, false, new Function3() { // from class: com.example.ui.detail.modals.ComposableSingletons$FixedTimingsModalKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$FixedTimingsModalKt.lambda__835106806$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-486618680$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6999getLambda$486618680$app() {
        return f100lambda$486618680;
    }

    /* renamed from: getLambda$-835106806$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7000getLambda$835106806$app() {
        return f101lambda$835106806;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1381482196$app() {
        return lambda$1381482196;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1381482196$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C218@9533L253:FixedTimingsModal.kt#99r5nq");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1381482196, $changed, -1, "com.example.ui.detail.modals.ComposableSingletons$FixedTimingsModalKt.lambda$1381482196.<anonymous> (FixedTimingsModal.kt:218)");
            }
            IconKt.m2150Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Fechar modal", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), ColorKt.Color(4287931320L), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__486618680$lambda$1(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C518@23034L169:FixedTimingsModal.kt#99r5nq");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-486618680, $changed, -1, "com.example.ui.detail.modals.ComposableSingletons$FixedTimingsModalKt.lambda$-486618680.<anonymous> (FixedTimingsModal.kt:518)");
            }
            TextKt.m2693Text4IGK_g("Cancelar", (Modifier) null, 0L, TextUnitKt.getSp(13.5d), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__835106806$lambda$2(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C556@24689L165:FixedTimingsModal.kt#99r5nq");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-835106806, $changed, -1, "com.example.ui.detail.modals.ComposableSingletons$FixedTimingsModalKt.lambda$-835106806.<anonymous> (FixedTimingsModal.kt:556)");
            }
            TextKt.m2693Text4IGK_g("Salvar", (Modifier) null, 0L, TextUnitKt.getSp(13.5d), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

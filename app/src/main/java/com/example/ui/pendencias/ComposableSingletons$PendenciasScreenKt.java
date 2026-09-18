package com.example.ui.pendencias;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.material.icons.filled.VisibilityKt;
import androidx.compose.material.icons.filled.VisibilityOffKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PendenciasScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PendenciasScreenKt {
    public static final ComposableSingletons$PendenciasScreenKt INSTANCE = new ComposableSingletons$PendenciasScreenKt();

    /* renamed from: lambda$-503953448, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f108lambda$503953448 = ComposableLambdaKt.composableLambdaInstance(-503953448, false, new Function2() { // from class: com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PendenciasScreenKt.lambda__503953448$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2060927081, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f107lambda$2060927081 = ComposableLambdaKt.composableLambdaInstance(-2060927081, false, new Function2() { // from class: com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PendenciasScreenKt.lambda__2060927081$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-574931422, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f109lambda$574931422 = ComposableLambdaKt.composableLambdaInstance(-574931422, false, new Function2() { // from class: com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PendenciasScreenKt.lambda__574931422$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$855237327 = ComposableLambdaKt.composableLambdaInstance(855237327, false, new Function3() { // from class: com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PendenciasScreenKt.lambda_855237327$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1135313263, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f106lambda$1135313263 = ComposableLambdaKt.composableLambdaInstance(-1135313263, false, new Function3() { // from class: com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PendenciasScreenKt.lambda__1135313263$lambda$6((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1135313263$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7022getLambda$1135313263$app() {
        return f106lambda$1135313263;
    }

    /* renamed from: getLambda$-2060927081$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7023getLambda$2060927081$app() {
        return f107lambda$2060927081;
    }

    /* renamed from: getLambda$-503953448$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7024getLambda$503953448$app() {
        return f108lambda$503953448;
    }

    /* renamed from: getLambda$-574931422$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7025getLambda$574931422$app() {
        return f109lambda$574931422;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$855237327$app() {
        return lambda$855237327;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__503953448$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C218@9160L255:PendenciasScreen.kt#6wqi8l");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-503953448, $changed, -1, "com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt.lambda$-503953448.<anonymous> (PendenciasScreen.kt:218)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__2060927081$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C273@11639L282:PendenciasScreen.kt#6wqi8l");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2060927081, $changed, -1, "com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt.lambda$-2060927081.<anonymous> (PendenciasScreen.kt:273)");
            }
            IconKt.m2150Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), "Opções", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__574931422$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C298@12919L321:PendenciasScreen.kt#6wqi8l");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-574931422, $changed, -1, "com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt.lambda$-574931422.<anonymous> (PendenciasScreen.kt:298)");
            }
            IconKt.m2150Iconww6aTOc(VisibilityKt.getVisibility(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), ColorKt.getAccentBlue(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_855237327$lambda$3(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C600@25976L247,606@26244L39,609@26398L10,607@26304L275:PendenciasScreen.kt#6wqi8l");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(855237327, $changed, -1, "com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt.lambda$855237327.<anonymous> (PendenciasScreen.kt:600)");
            }
            IconKt.m2150Iconww6aTOc(VisibilityOffKt.getVisibilityOff(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(15)), ColorKt.getTextSecondary(), $composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.m720width3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(6)), $composer, 6);
            TextKt.m2693Text4IGK_g("Ignorar", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), 0L, TextUnitKt.getSp(13), FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777209, null), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__1135313263$lambda$6(androidx.compose.foundation.layout.RowScope r104, androidx.compose.runtime.Composer r105, int r106) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.pendencias.ComposableSingletons$PendenciasScreenKt.lambda__1135313263$lambda$6(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}

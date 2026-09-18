package com.example.ui.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.ClearKt;
import androidx.compose.material3.IconKt;
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

/* compiled from: TmdbSearchDialog.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$TmdbSearchDialogKt {
    public static final ComposableSingletons$TmdbSearchDialogKt INSTANCE = new ComposableSingletons$TmdbSearchDialogKt();
    private static Function2<Composer, Integer, Unit> lambda$1445716746 = ComposableLambdaKt.composableLambdaInstance(1445716746, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$TmdbSearchDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TmdbSearchDialogKt.lambda_1445716746$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-292153268, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f96lambda$292153268 = ComposableLambdaKt.composableLambdaInstance(-292153268, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$TmdbSearchDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TmdbSearchDialogKt.lambda__292153268$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-701423249, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f97lambda$701423249 = ComposableLambdaKt.composableLambdaInstance(-701423249, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$TmdbSearchDialogKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TmdbSearchDialogKt.lambda__701423249$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-292153268$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6993getLambda$292153268$app() {
        return f96lambda$292153268;
    }

    /* renamed from: getLambda$-701423249$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6994getLambda$701423249$app() {
        return f97lambda$701423249;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1445716746$app() {
        return lambda$1445716746;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1445716746$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C346@13496L275:TmdbSearchDialog.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445716746, $changed, -1, "com.example.ui.components.ComposableSingletons$TmdbSearchDialogKt.lambda$1445716746.<anonymous> (TmdbSearchDialog.kt:346)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__292153268$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C414@16398L223:TmdbSearchDialog.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-292153268, $changed, -1, "com.example.ui.components.ComposableSingletons$TmdbSearchDialogKt.lambda$-292153268.<anonymous> (TmdbSearchDialog.kt:414)");
            }
            TextKt.m2693Text4IGK_g("Digite o título da série (ex: Arquivo X)...", (Modifier) null, ColorKt.getTextMuted(), TextUnitKt.getSp(13.5d), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__701423249$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C443@17897L329:TmdbSearchDialog.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-701423249, $changed, -1, "com.example.ui.components.ComposableSingletons$TmdbSearchDialogKt.lambda$-701423249.<anonymous> (TmdbSearchDialog.kt:443)");
            }
            IconKt.m2150Iconww6aTOc(ClearKt.getClear(Icons.INSTANCE.getDefault()), "Limpar busca", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), ColorKt.getTextSecondary(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

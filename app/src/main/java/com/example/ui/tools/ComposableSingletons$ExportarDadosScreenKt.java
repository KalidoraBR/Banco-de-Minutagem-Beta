package com.example.ui.tools;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ExportarDadosScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ExportarDadosScreenKt {
    public static final ComposableSingletons$ExportarDadosScreenKt INSTANCE = new ComposableSingletons$ExportarDadosScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$358167496 = ComposableLambdaKt.composableLambdaInstance(358167496, false, new Function2() { // from class: com.example.ui.tools.ComposableSingletons$ExportarDadosScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ExportarDadosScreenKt.lambda_358167496$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$358167496$app() {
        return lambda$358167496;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_358167496$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C124@5147L235:ExportarDadosScreen.kt#75g7xq");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(358167496, $changed, -1, "com.example.ui.tools.ComposableSingletons$ExportarDadosScreenKt.lambda$358167496.<anonymous> (ExportarDadosScreen.kt:124)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

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

/* compiled from: TesteConexaoScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$TesteConexaoScreenKt {
    public static final ComposableSingletons$TesteConexaoScreenKt INSTANCE = new ComposableSingletons$TesteConexaoScreenKt();

    /* renamed from: lambda$-1349606172, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f137lambda$1349606172 = ComposableLambdaKt.composableLambdaInstance(-1349606172, false, new Function2() { // from class: com.example.ui.tools.ComposableSingletons$TesteConexaoScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TesteConexaoScreenKt.lambda__1349606172$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1349606172$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7097getLambda$1349606172$app() {
        return f137lambda$1349606172;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1349606172$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C131@5278L235:TesteConexaoScreen.kt#75g7xq");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1349606172, $changed, -1, "com.example.ui.tools.ComposableSingletons$TesteConexaoScreenKt.lambda$-1349606172.<anonymous> (TesteConexaoScreen.kt:131)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

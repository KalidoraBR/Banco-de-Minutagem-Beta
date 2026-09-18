package com.example.ui.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AppTopBar.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$AppTopBarKt {
    public static final ComposableSingletons$AppTopBarKt INSTANCE = new ComposableSingletons$AppTopBarKt();
    private static Function2<Composer, Integer, Unit> lambda$480221976 = ComposableLambdaKt.composableLambdaInstance(480221976, false, new Function2() { // from class: com.example.ui.components.ComposableSingletons$AppTopBarKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AppTopBarKt.lambda_480221976$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$480221976$app() {
        return lambda$480221976;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_480221976$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C99@3733L205:AppTopBar.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(480221976, $changed, -1, "com.example.ui.components.ComposableSingletons$AppTopBarKt.lambda$480221976.<anonymous> (AppTopBar.kt:99)");
            }
            IconKt.m2150Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "Pesquisar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), Color.INSTANCE.m4196getWhite0d7_KjU(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

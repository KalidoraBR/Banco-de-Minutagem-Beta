package com.example.ui.detail.modals;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ModalComponents.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ModalComponentsKt {
    public static final ComposableSingletons$ModalComponentsKt INSTANCE = new ComposableSingletons$ModalComponentsKt();
    private static Function2<Composer, Integer, Unit> lambda$415849561 = ComposableLambdaKt.composableLambdaInstance(415849561, false, new Function2() { // from class: com.example.ui.detail.modals.ComposableSingletons$ModalComponentsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ModalComponentsKt.lambda_415849561$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$415849561$app() {
        return lambda$415849561;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_415849561$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C102@3781L213:ModalComponents.kt#99r5nq");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(415849561, $changed, -1, "com.example.ui.detail.modals.ComposableSingletons$ModalComponentsKt.lambda$415849561.<anonymous> (ModalComponents.kt:102)");
            }
            IconKt.m2150Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Fechar modal", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), ColorKt.Color(4287931320L), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

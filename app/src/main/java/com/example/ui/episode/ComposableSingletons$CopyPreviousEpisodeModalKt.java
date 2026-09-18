package com.example.ui.episode;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CopyPreviousEpisodeModal.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$CopyPreviousEpisodeModalKt {
    public static final ComposableSingletons$CopyPreviousEpisodeModalKt INSTANCE = new ComposableSingletons$CopyPreviousEpisodeModalKt();
    private static Function2<Composer, Integer, Unit> lambda$826631281 = ComposableLambdaKt.composableLambdaInstance(826631281, false, new Function2() { // from class: com.example.ui.episode.ComposableSingletons$CopyPreviousEpisodeModalKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CopyPreviousEpisodeModalKt.lambda_826631281$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1548529147 = ComposableLambdaKt.composableLambdaInstance(1548529147, false, new Function3() { // from class: com.example.ui.episode.ComposableSingletons$CopyPreviousEpisodeModalKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CopyPreviousEpisodeModalKt.lambda_1548529147$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1548529147$app() {
        return lambda$1548529147;
    }

    public final Function2<Composer, Integer, Unit> getLambda$826631281$app() {
        return lambda$826631281;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_826631281$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C139@6076L182:CopyPreviousEpisodeModal.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(826631281, $changed, -1, "com.example.ui.episode.ComposableSingletons$CopyPreviousEpisodeModalKt.lambda$826631281.<anonymous> (CopyPreviousEpisodeModal.kt:139)");
            }
            IconKt.m2150Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Fechar", (Modifier) null, ColorKt.getTextMuted(), $composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1548529147$lambda$1(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C255@10833L34:CopyPreviousEpisodeModal.kt#at6o8i");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548529147, $changed, -1, "com.example.ui.episode.ComposableSingletons$CopyPreviousEpisodeModalKt.lambda$1548529147.<anonymous> (CopyPreviousEpisodeModal.kt:255)");
            }
            TextKt.m2693Text4IGK_g("Cancelar", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

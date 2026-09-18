package com.example.ui.detail;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.MoreVertKt;
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

/* compiled from: SeriesHeaderSection.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$SeriesHeaderSectionKt {
    public static final ComposableSingletons$SeriesHeaderSectionKt INSTANCE = new ComposableSingletons$SeriesHeaderSectionKt();

    /* renamed from: lambda$-1548685133, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f98lambda$1548685133 = ComposableLambdaKt.composableLambdaInstance(-1548685133, false, new Function2() { // from class: com.example.ui.detail.ComposableSingletons$SeriesHeaderSectionKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SeriesHeaderSectionKt.lambda__1548685133$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2080790372, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f99lambda$2080790372 = ComposableLambdaKt.composableLambdaInstance(-2080790372, false, new Function2() { // from class: com.example.ui.detail.ComposableSingletons$SeriesHeaderSectionKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SeriesHeaderSectionKt.lambda__2080790372$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1548685133$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6995getLambda$1548685133$app() {
        return f98lambda$1548685133;
    }

    /* renamed from: getLambda$-2080790372$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6996getLambda$2080790372$app() {
        return f99lambda$2080790372;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1548685133$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C148@5626L277:SeriesHeaderSection.kt#gbrlqe");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548685133, $changed, -1, "com.example.ui.detail.ComposableSingletons$SeriesHeaderSectionKt.lambda$-1548685133.<anonymous> (SeriesHeaderSection.kt:148)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar para a página inicial", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__2080790372$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C167@6441L256:SeriesHeaderSection.kt#gbrlqe");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2080790372, $changed, -1, "com.example.ui.detail.ComposableSingletons$SeriesHeaderSectionKt.lambda$-2080790372.<anonymous> (SeriesHeaderSection.kt:167)");
            }
            IconKt.m2150Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), "Mais opções da série", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

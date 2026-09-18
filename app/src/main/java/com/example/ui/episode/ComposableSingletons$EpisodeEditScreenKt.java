package com.example.ui.episode;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.MoreVertKt;
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

/* compiled from: EpisodeEditScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$EpisodeEditScreenKt {
    public static final ComposableSingletons$EpisodeEditScreenKt INSTANCE = new ComposableSingletons$EpisodeEditScreenKt();

    /* renamed from: lambda$-1511309911, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f104lambda$1511309911 = ComposableLambdaKt.composableLambdaInstance(-1511309911, false, new Function2() { // from class: com.example.ui.episode.ComposableSingletons$EpisodeEditScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EpisodeEditScreenKt.lambda__1511309911$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$191124899 = ComposableLambdaKt.composableLambdaInstance(191124899, false, new Function2() { // from class: com.example.ui.episode.ComposableSingletons$EpisodeEditScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EpisodeEditScreenKt.lambda_191124899$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1402819107 = ComposableLambdaKt.composableLambdaInstance(1402819107, false, new Function2() { // from class: com.example.ui.episode.ComposableSingletons$EpisodeEditScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EpisodeEditScreenKt.lambda_1402819107$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1470214426, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f103lambda$1470214426 = ComposableLambdaKt.composableLambdaInstance(-1470214426, false, new Function2() { // from class: com.example.ui.episode.ComposableSingletons$EpisodeEditScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EpisodeEditScreenKt.lambda__1470214426$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1470214426$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7016getLambda$1470214426$app() {
        return f103lambda$1470214426;
    }

    /* renamed from: getLambda$-1511309911$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7017getLambda$1511309911$app() {
        return f104lambda$1511309911;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1402819107$app() {
        return lambda$1402819107;
    }

    public final Function2<Composer, Integer, Unit> getLambda$191124899$app() {
        return lambda$191124899;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1511309911$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C179@7659L279:EpisodeEditScreen.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1511309911, $changed, -1, "com.example.ui.episode.ComposableSingletons$EpisodeEditScreenKt.lambda$-1511309911.<anonymous> (EpisodeEditScreen.kt:179)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar para grade da temporada", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_191124899$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C202@8678L267:EpisodeEditScreen.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(191124899, $changed, -1, "com.example.ui.episode.ComposableSingletons$EpisodeEditScreenKt.lambda$191124899.<anonymous> (EpisodeEditScreen.kt:202)");
            }
            IconKt.m2150Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), "Mais opções", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1402819107$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C272@12164L210:EpisodeEditScreen.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1402819107, $changed, -1, "com.example.ui.episode.ComposableSingletons$EpisodeEditScreenKt.lambda$1402819107.<anonymous> (EpisodeEditScreen.kt:272)");
            }
            TextKt.m2693Text4IGK_g("Legenda dos episódios", (Modifier) null, ColorKt.getTextWhite(), TextUnitKt.getSp(13.5d), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1470214426$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C279@12482L298:EpisodeEditScreen.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1470214426, $changed, -1, "com.example.ui.episode.ComposableSingletons$EpisodeEditScreenKt.lambda$-1470214426.<anonymous> (EpisodeEditScreen.kt:279)");
            }
            IconKt.m2150Iconww6aTOc(InfoKt.getInfo(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), ColorKt.getTextSecondary(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

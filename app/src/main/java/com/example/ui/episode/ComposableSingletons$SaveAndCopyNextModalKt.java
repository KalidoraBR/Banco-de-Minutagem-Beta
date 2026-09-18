package com.example.ui.episode;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveAndCopyNextModal.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$SaveAndCopyNextModalKt {
    public static final ComposableSingletons$SaveAndCopyNextModalKt INSTANCE = new ComposableSingletons$SaveAndCopyNextModalKt();
    private static Function2<Composer, Integer, Unit> lambda$1537083857 = ComposableLambdaKt.composableLambdaInstance(1537083857, false, new Function2() { // from class: com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SaveAndCopyNextModalKt.lambda_1537083857$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2115732133, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f105lambda$2115732133 = ComposableLambdaKt.composableLambdaInstance(-2115732133, false, new Function3() { // from class: com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SaveAndCopyNextModalKt.lambda__2115732133$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1419714002 = ComposableLambdaKt.composableLambdaInstance(1419714002, false, new Function3() { // from class: com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SaveAndCopyNextModalKt.lambda_1419714002$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1472368020 = ComposableLambdaKt.composableLambdaInstance(1472368020, false, new Function3() { // from class: com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SaveAndCopyNextModalKt.lambda_1472368020$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$812083491 = ComposableLambdaKt.composableLambdaInstance(812083491, false, new Function3() { // from class: com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SaveAndCopyNextModalKt.lambda_812083491$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-2115732133$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7018getLambda$2115732133$app() {
        return f105lambda$2115732133;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1419714002$app() {
        return lambda$1419714002;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1472368020$app() {
        return lambda$1472368020;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1537083857$app() {
        return lambda$1537083857;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$812083491$app() {
        return lambda$812083491;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1537083857$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C141@6159L243:SaveAndCopyNextModal.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1537083857, $changed, -1, "com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt.lambda$1537083857.<anonymous> (SaveAndCopyNextModal.kt:141)");
            }
            IconKt.m2150Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Fechar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextSecondary(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__2115732133$lambda$1(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C245@10306L34:SaveAndCopyNextModal.kt#at6o8i");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2115732133, $changed, -1, "com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt.lambda$-2115732133.<anonymous> (SaveAndCopyNextModal.kt:245)");
            }
            TextKt.m2693Text4IGK_g("Cancelar", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1419714002$lambda$2(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C269@11335L193,274@11549L39,275@11609L75:SaveAndCopyNextModal.kt#at6o8i");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1419714002, $changed, -1, "com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt.lambda$1419714002.<anonymous> (SaveAndCopyNextModal.kt:269)");
            }
            IconKt.m2150Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m720width3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(6)), $composer, 6);
            TextKt.m2693Text4IGK_g("Salvar e copiar", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1472368020$lambda$3(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C321@13595L78:SaveAndCopyNextModal.kt#at6o8i");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1472368020, $changed, -1, "com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt.lambda$1472368020.<anonymous> (SaveAndCopyNextModal.kt:321)");
            }
            TextKt.m2693Text4IGK_g("Substituir e continuar", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_812083491$lambda$4(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C329@13969L57:SaveAndCopyNextModal.kt#at6o8i");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(812083491, $changed, -1, "com.example.ui.episode.ComposableSingletons$SaveAndCopyNextModalKt.lambda$812083491.<anonymous> (SaveAndCopyNextModal.kt:329)");
            }
            TextKt.m2693Text4IGK_g("Cancelar", (Modifier) null, ColorKt.getTextSecondary(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

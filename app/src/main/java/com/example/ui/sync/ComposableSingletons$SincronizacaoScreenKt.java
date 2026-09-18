package com.example.ui.sync;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.SettingsKt;
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

/* compiled from: SincronizacaoScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SincronizacaoScreenKt {
    public static final ComposableSingletons$SincronizacaoScreenKt INSTANCE = new ComposableSingletons$SincronizacaoScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$245655628 = ComposableLambdaKt.composableLambdaInstance(245655628, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$SincronizacaoScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SincronizacaoScreenKt.lambda_245655628$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-482380855, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f134lambda$482380855 = ComposableLambdaKt.composableLambdaInstance(-482380855, false, new Function3() { // from class: com.example.ui.sync.ComposableSingletons$SincronizacaoScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SincronizacaoScreenKt.lambda__482380855$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-482380855$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7053getLambda$482380855$app() {
        return f134lambda$482380855;
    }

    public final Function2<Composer, Integer, Unit> getLambda$245655628$app() {
        return lambda$245655628;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_245655628$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C206@8350L255:SincronizacaoScreen.kt#9e9lx8");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(245655628, $changed, -1, "com.example.ui.sync.ComposableSingletons$SincronizacaoScreenKt.lambda$245655628.<anonymous> (SincronizacaoScreen.kt:206)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__482380855$lambda$1(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C333@14370L286,339@14685L39,342@14888L10,340@14753L409:SincronizacaoScreen.kt#9e9lx8");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-482380855, $changed, -1, "com.example.ui.sync.ComposableSingletons$SincronizacaoScreenKt.lambda$-482380855.<anonymous> (SincronizacaoScreen.kt:333)");
            }
            IconKt.m2150Iconww6aTOc(SettingsKt.getSettings(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), androidx.compose.ui.graphics.ColorKt.Color(4294688548L), $composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.m720width3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(8)), $composer, 6);
            TextKt.m2693Text4IGK_g("Inserir / Configurar Credenciais", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), androidx.compose.ui.graphics.ColorKt.Color(4294688548L), TextUnitKt.getSp(13), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777208, null), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

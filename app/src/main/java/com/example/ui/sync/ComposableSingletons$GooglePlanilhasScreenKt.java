package com.example.ui.sync;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.CloudSyncKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePlanilhasScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$GooglePlanilhasScreenKt {
    public static final ComposableSingletons$GooglePlanilhasScreenKt INSTANCE = new ComposableSingletons$GooglePlanilhasScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$787229860 = ComposableLambdaKt.composableLambdaInstance(787229860, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda_787229860$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$277079070 = ComposableLambdaKt.composableLambdaInstance(277079070, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda_277079070$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1266271526 = ComposableLambdaKt.composableLambdaInstance(1266271526, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda_1266271526$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-663204195, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f132lambda$663204195 = ComposableLambdaKt.composableLambdaInstance(-663204195, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda__663204195$lambda$5((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$774848670 = ComposableLambdaKt.composableLambdaInstance(774848670, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda_774848670$lambda$7((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1031007612 = ComposableLambdaKt.composableLambdaInstance(1031007612, false, new Function3() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda_1031007612$lambda$9((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$801720155 = ComposableLambdaKt.composableLambdaInstance(801720155, false, new Function3() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda_801720155$lambda$11((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-600542700, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f131lambda$600542700 = ComposableLambdaKt.composableLambdaInstance(-600542700, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda__600542700$lambda$12((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1046602436, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f125lambda$1046602436 = ComposableLambdaKt.composableLambdaInstance(-1046602436, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda__1046602436$lambda$13((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-466175181, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f129lambda$466175181 = ComposableLambdaKt.composableLambdaInstance(-466175181, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda__466175181$lambda$14((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-542013742, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f130lambda$542013742 = ComposableLambdaKt.composableLambdaInstance(-542013742, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda__542013742$lambda$15((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1922588236, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f127lambda$1922588236 = ComposableLambdaKt.composableLambdaInstance(-1922588236, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda__1922588236$lambda$16((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1998426797, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f128lambda$1998426797 = ComposableLambdaKt.composableLambdaInstance(-1998426797, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda__1998426797$lambda$17((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$915966005 = ComposableLambdaKt.composableLambdaInstance(915966005, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda_915966005$lambda$18((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$840127444 = ComposableLambdaKt.composableLambdaInstance(840127444, false, new Function2() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda_840127444$lambda$19((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-841808074, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f133lambda$841808074 = ComposableLambdaKt.composableLambdaInstance(-841808074, false, new Function3() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda__841808074$lambda$20((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1512198220, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f126lambda$1512198220 = ComposableLambdaKt.composableLambdaInstance(-1512198220, false, new Function3() { // from class: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GooglePlanilhasScreenKt.lambda__1512198220$lambda$21((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1046602436$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7044getLambda$1046602436$app() {
        return f125lambda$1046602436;
    }

    /* renamed from: getLambda$-1512198220$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7045getLambda$1512198220$app() {
        return f126lambda$1512198220;
    }

    /* renamed from: getLambda$-1922588236$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7046getLambda$1922588236$app() {
        return f127lambda$1922588236;
    }

    /* renamed from: getLambda$-1998426797$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7047getLambda$1998426797$app() {
        return f128lambda$1998426797;
    }

    /* renamed from: getLambda$-466175181$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7048getLambda$466175181$app() {
        return f129lambda$466175181;
    }

    /* renamed from: getLambda$-542013742$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7049getLambda$542013742$app() {
        return f130lambda$542013742;
    }

    /* renamed from: getLambda$-600542700$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7050getLambda$600542700$app() {
        return f131lambda$600542700;
    }

    /* renamed from: getLambda$-663204195$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7051getLambda$663204195$app() {
        return f132lambda$663204195;
    }

    /* renamed from: getLambda$-841808074$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7052getLambda$841808074$app() {
        return f133lambda$841808074;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1031007612$app() {
        return lambda$1031007612;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1266271526$app() {
        return lambda$1266271526;
    }

    public final Function2<Composer, Integer, Unit> getLambda$277079070$app() {
        return lambda$277079070;
    }

    public final Function2<Composer, Integer, Unit> getLambda$774848670$app() {
        return lambda$774848670;
    }

    public final Function2<Composer, Integer, Unit> getLambda$787229860$app() {
        return lambda$787229860;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$801720155$app() {
        return lambda$801720155;
    }

    public final Function2<Composer, Integer, Unit> getLambda$840127444$app() {
        return lambda$840127444;
    }

    public final Function2<Composer, Integer, Unit> getLambda$915966005$app() {
        return lambda$915966005;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_787229860$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C264@10842L255:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(787229860, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$787229860.<anonymous> (GooglePlanilhasScreen.kt:264)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_277079070$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C317@13202L267:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(277079070, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$277079070.<anonymous> (GooglePlanilhasScreen.kt:317)");
            }
            IconKt.m2150Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), "Mais opções", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), ColorKt.getTextWhite(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda_1266271526$lambda$3(androidx.compose.runtime.Composer r49, int r50) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda_1266271526$lambda$3(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__663204195$lambda$5(androidx.compose.runtime.Composer r49, int r50) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda__663204195$lambda$5(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda_774848670$lambda$7(androidx.compose.runtime.Composer r49, int r50) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda_774848670$lambda$7(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1031007612$lambda$9(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C611@28564L541:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1031007612, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$1031007612.<anonymous> (GooglePlanilhasScreen.kt:611)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal m550spacedBy0680j_4 = Arrangement.INSTANCE.m550spacedBy0680j_4(Dp.m6622constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m550spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer m3652constructorimpl = Updater.m3652constructorimpl($composer);
            Updater.m3659setimpl(m3652constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3659setimpl(m3652constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3652constructorimpl.getInserting() || !Intrinsics.areEqual(m3652constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3652constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3652constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 913483220, "C615@28828L105,616@28974L93:GooglePlanilhasScreen.kt#9e9lx8");
            IconKt.m2150Iconww6aTOc(EditKt.getEdit(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(14)), ColorKt.getAccentPurple(), $composer, 3504, 0);
            TextKt.m2693Text4IGK_g("Editar ID da Planilha e Webhook", (Modifier) null, 0L, TextUnitKt.getSp(12.5d), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_801720155$lambda$11(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C635@30104L553:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(801720155, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$801720155.<anonymous> (GooglePlanilhasScreen.kt:635)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal m550spacedBy0680j_4 = Arrangement.INSTANCE.m550spacedBy0680j_4(Dp.m6622constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m550spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer m3652constructorimpl = Updater.m3652constructorimpl($composer);
            Updater.m3659setimpl(m3652constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3659setimpl(m3652constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3652constructorimpl.getInserting() || !Intrinsics.areEqual(m3652constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3652constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3652constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -791147255, "C639@30368L115,640@30524L95:GooglePlanilhasScreen.kt#9e9lx8");
            IconKt.m2150Iconww6aTOc(CloudSyncKt.getCloudSync(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(14)), androidx.compose.ui.graphics.ColorKt.Color(4281652121L), $composer, 3504, 0);
            TextKt.m2693Text4IGK_g("Importar Dados da Planilha (TMDB)", (Modifier) null, 0L, TextUnitKt.getSp(12.5d), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__600542700$lambda$12(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C834@39879L247:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-600542700, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$-600542700.<anonymous> (GooglePlanilhasScreen.kt:834)");
            }
            IconKt.m2150Iconww6aTOc(EditKt.getEdit(Icons.INSTANCE.getDefault()), "Editar Conexão", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), ColorKt.getAccentBlue(), $composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1046602436$lambda$13(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1113@50682L43:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1046602436, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$-1046602436.<anonymous> (GooglePlanilhasScreen.kt:1113)");
            }
            TextKt.m2693Text4IGK_g("Nome da Planilha", (Modifier) null, ColorKt.getTextMuted(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__466175181$lambda$14(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1130@51490L59:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-466175181, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$-466175181.<anonymous> (GooglePlanilhasScreen.kt:1130)");
            }
            TextKt.m2693Text4IGK_g("ID ou Link da Planilha do Google", (Modifier) null, ColorKt.getTextMuted(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__542013742$lambda$15(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1131@51589L69:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-542013742, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$-542013742.<anonymous> (GooglePlanilhasScreen.kt:1131)");
            }
            TextKt.m2693Text4IGK_g("Ex: 1BxiMVs0XRmH... ou cole o link do Docs", (Modifier) null, ColorKt.getTextMuted(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1922588236$lambda$16(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1149@52462L61:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1922588236, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$-1922588236.<anonymous> (GooglePlanilhasScreen.kt:1149)");
            }
            TextKt.m2693Text4IGK_g("URL do Apps Script (Web App /exec)", (Modifier) null, ColorKt.getTextMuted(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1998426797$lambda$17(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1150@52563L70:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1998426797, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$-1998426797.<anonymous> (GooglePlanilhasScreen.kt:1150)");
            }
            TextKt.m2693Text4IGK_g("https://script.google.com/macros/s/.../exec", (Modifier) null, ColorKt.getTextMuted(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_915966005$lambda$18(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1168@53439L65:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(915966005, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$915966005.<anonymous> (GooglePlanilhasScreen.kt:1168)");
            }
            TextKt.m2693Text4IGK_g("Chave Secreta (SYNC_SECRET) - Opcional", (Modifier) null, ColorKt.getTextMuted(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_840127444$lambda$19(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1169@53544L54:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(840127444, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$840127444.<anonymous> (GooglePlanilhasScreen.kt:1169)");
            }
            TextKt.m2693Text4IGK_g("Chave configurada no script", (Modifier) null, ColorKt.getTextMuted(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 390, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__841808074$lambda$20(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C1199@54967L34:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841808074, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$-841808074.<anonymous> (GooglePlanilhasScreen.kt:1199)");
            }
            TextKt.m2693Text4IGK_g("Cancelar", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1512198220$lambda$21(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C1220@55848L62:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1512198220, $changed, -1, "com.example.ui.sync.ComposableSingletons$GooglePlanilhasScreenKt.lambda$-1512198220.<anonymous> (GooglePlanilhasScreen.kt:1220)");
            }
            TextKt.m2693Text4IGK_g("Salvar", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

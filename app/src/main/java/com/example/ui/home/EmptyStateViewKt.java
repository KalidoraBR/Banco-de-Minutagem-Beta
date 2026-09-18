package com.example.ui.home;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.vector.ImageVector;
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
import com.example.ui.theme.AppColors;
import com.example.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmptyStateView.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"EmptyStateView", "", "onAddSeriesClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FeaturePill", "label", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmptyStateViewKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EmptyStateView$lambda$9(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EmptyStateView(function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FeaturePill$lambda$11(String str, ImageVector imageVector, int i, Composer composer, int i2) {
        FeaturePill(str, imageVector, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0c5c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0b3b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x053a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0ae0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmptyStateView(kotlin.jvm.functions.Function0<kotlin.Unit> r162, androidx.compose.ui.Modifier r163, androidx.compose.runtime.Composer r164, final int r165, final int r166) {
        /*
            Method dump skipped, instructions count: 3566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.home.EmptyStateViewKt.EmptyStateView(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void FeaturePill(String label, final ImageVector icon, Composer $composer, final int $changed) {
        Composer $composer2;
        final String str = label;
        Composer $composer3 = $composer.startRestartGroup(559212241);
        ComposerKt.sourceInformation($composer3, "C(FeaturePill)P(1)184@7206L6,185@7217L756:EmptyStateView.kt#9egu7s");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(str) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(icon) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(559212241, $dirty2, -1, "com.example.ui.home.FeaturePill (EmptyStateView.kt:183)");
            }
            AppColors colors = AppTheme.INSTANCE.getColors($composer3, 6);
            Modifier m671paddingVpY3zN4 = PaddingKt.m671paddingVpY3zN4(BorderKt.m236borderxT4_qwU(BackgroundKt.m225backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m953RoundedCornerShape0680j_4(Dp.m6622constructorimpl(8))), colors.m7090getSurface0d7_KjU(), null, 2, null), Dp.m6622constructorimpl((float) 0.8d), colors.m7086getBorder0d7_KjU(), RoundedCornerShapeKt.m953RoundedCornerShape0680j_4(Dp.m6622constructorimpl(8))), Dp.m6622constructorimpl(8), Dp.m6622constructorimpl(4));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal m550spacedBy0680j_4 = Arrangement.INSTANCE.m550spacedBy0680j_4(Dp.m6622constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m550spacedBy0680j_4, centerVertically, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, m671paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer m3652constructorimpl = Updater.m3652constructorimpl($composer3);
            Updater.m3659setimpl(m3652constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3659setimpl(m3652constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3652constructorimpl.getInserting() || !Intrinsics.areEqual(m3652constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3652constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3652constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1450358815, "C194@7592L170,202@7837L10,200@7771L196:EmptyStateView.kt#9egu7s");
            IconKt.m2150Iconww6aTOc(icon, (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(12)), colors.m7081getAccentPurple0d7_KjU(), $composer3, (($dirty2 >> 3) & 14) | 432, 0);
            $composer2 = $composer3;
            str = label;
            TextKt.m2693Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelSmall(), colors.m7094getTextSecondary0d7_KjU(), TextUnitKt.getSp(10), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777212, null), $composer3, $dirty2 & 14, 0, 65534);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.home.EmptyStateViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmptyStateViewKt.FeaturePill$lambda$11(str, icon, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

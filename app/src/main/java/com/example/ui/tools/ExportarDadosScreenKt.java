package com.example.ui.tools;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloudUploadKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
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
import com.example.data.ExportFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExportarDadosScreen.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a3\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001aU\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\f\u0010$\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002"}, d2 = {"ExportarDadosScreen", "", "seriesList", "", "Lcom/example/model/Series;", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FormatOptionCard", "format", "Lcom/example/data/ExportFormat;", "title", "", "subtitle", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconTint", "Landroidx/compose/ui/graphics/Color;", "isSelected", "", "onSelect", "tag", "FormatOptionCard-3f6hBDE", "(Lcom/example/data/ExportFormat;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SummaryMetricPill", "label", "value", "valueColor", "SummaryMetricPill-ww6aTOc", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "app", "selectedFormat", "isExporting", "isSendingToSheets", "exportCompletedMessage"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExportarDadosScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ExportarDadosScreen$lambda$43(List list, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExportarDadosScreen(list, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FormatOptionCard_3f6hBDE$lambda$50(ExportFormat exportFormat, String str, String str2, ImageVector imageVector, long j, boolean z, Function0 function0, String str3, int i, Composer composer, int i2) {
        m7098FormatOptionCard3f6hBDE(exportFormat, str, str2, imageVector, j, z, function0, str3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SummaryMetricPill_ww6aTOc$lambda$53(String str, String str2, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m7099SummaryMetricPillww6aTOc(str, str2, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0b83  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0bc8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0cb1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0cbd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0dd6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0de2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0fdf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x1024  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x11b8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x11c4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x11fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x12ea  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x13c3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x13cf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x1408  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x1629  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x19e4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x1b3b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x1beb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x1634  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1836  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x1842  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x1848  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x141e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x13d5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x12f4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x1213 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x11ca  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x103a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0ff1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0e31 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0de8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0d0c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0cc3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0bde A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0836  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ExportarDadosScreen(final java.util.List<com.example.model.Series> r197, final kotlin.jvm.functions.Function0<kotlin.Unit> r198, androidx.compose.ui.Modifier r199, androidx.compose.runtime.Composer r200, final int r201, final int r202) {
        /*
            Method dump skipped, instructions count: 7175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.ExportarDadosScreenKt.ExportarDadosScreen(java.util.List, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExportFormat ExportarDadosScreen$lambda$1(MutableState<ExportFormat> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ExportarDadosScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExportarDadosScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ExportarDadosScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExportarDadosScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ExportarDadosScreen$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ExportarDadosScreen$lambda$42$lambda$41$lambda$16$lambda$15(MutableState $selectedFormat$delegate) {
        $selectedFormat$delegate.setValue(ExportFormat.CSV);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ExportarDadosScreen$lambda$42$lambda$41$lambda$18$lambda$17(MutableState $selectedFormat$delegate) {
        $selectedFormat$delegate.setValue(ExportFormat.JSON);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ExportarDadosScreen$lambda$42$lambda$41$lambda$20$lambda$19(MutableState $selectedFormat$delegate) {
        $selectedFormat$delegate.setValue(ExportFormat.SPREADSHEET);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ExportarDadosScreen$lambda$42$lambda$41$lambda$31$lambda$30(CoroutineScope $coroutineScope, MutableState $isExporting$delegate, MutableState $exportCompletedMessage$delegate, List $seriesList, Context $context, MutableState $selectedFormat$delegate) {
        if (!ExportarDadosScreen$lambda$4($isExporting$delegate)) {
            ExportarDadosScreen$lambda$5($isExporting$delegate, true);
            $exportCompletedMessage$delegate.setValue(null);
            BuildersKt.launch$default($coroutineScope, null, null, new ExportarDadosScreenKt$ExportarDadosScreen$1$2$6$1$1($seriesList, $context, $selectedFormat$delegate, $isExporting$delegate, $exportCompletedMessage$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ExportarDadosScreen$lambda$42$lambda$41$lambda$35(androidx.compose.runtime.MutableState r79, androidx.compose.foundation.layout.RowScope r80, androidx.compose.runtime.Composer r81, int r82) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.ExportarDadosScreenKt.ExportarDadosScreen$lambda$42$lambda$41$lambda$35(androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ExportarDadosScreen$lambda$42$lambda$41$lambda$37$lambda$36(CoroutineScope $coroutineScope, MutableState $isSendingToSheets$delegate, MutableState $isExporting$delegate, MutableState $exportCompletedMessage$delegate, Context $context, List $seriesList) {
        if (!ExportarDadosScreen$lambda$7($isSendingToSheets$delegate) && !ExportarDadosScreen$lambda$4($isExporting$delegate)) {
            ExportarDadosScreen$lambda$8($isSendingToSheets$delegate, true);
            $exportCompletedMessage$delegate.setValue(null);
            BuildersKt.launch$default($coroutineScope, null, null, new ExportarDadosScreenKt$ExportarDadosScreen$1$2$8$1$1($context, $seriesList, $isSendingToSheets$delegate, $exportCompletedMessage$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ExportarDadosScreen$lambda$42$lambda$41$lambda$40(MutableState $isSendingToSheets$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Composer composer;
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C:ExportarDadosScreen.kt#75g7xq");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1269458223, $changed, -1, "com.example.ui.tools.ExportarDadosScreen.<anonymous>.<anonymous>.<anonymous> (ExportarDadosScreen.kt:480)");
            }
            if (ExportarDadosScreen$lambda$7($isSendingToSheets$delegate)) {
                $composer.startReplaceGroup(1242946641);
                ComposerKt.sourceInformation($composer, "481@21417L794");
                Arrangement.Horizontal m550spacedBy0680j_4 = Arrangement.INSTANCE.m550spacedBy0680j_4(Dp.m6622constructorimpl(10));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
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
                if (!m3652constructorimpl.getInserting() && Intrinsics.areEqual(m3652constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i2 = (i >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i3 = ((432 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1021199128, "C485@21618L215,492@21986L10,490@21858L331:ExportarDadosScreen.kt#75g7xq");
                    ProgressIndicatorKt.m2367CircularProgressIndicatorLxG7B9w(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), ColorKt.Color(4281652121L), Dp.m6622constructorimpl(2), 0L, 0, $composer, 438, 24);
                    TextKt.m2693Text4IGK_g("Enviando dados para a planilha...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), ColorKt.Color(4281652121L), 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), $composer, 6, 0, 65534);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                }
                m3652constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3652constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i22 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i32 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1021199128, "C485@21618L215,492@21986L10,490@21858L331:ExportarDadosScreen.kt#75g7xq");
                ProgressIndicatorKt.m2367CircularProgressIndicatorLxG7B9w(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), ColorKt.Color(4281652121L), Dp.m6622constructorimpl(2), 0L, 0, $composer, 438, 24);
                TextKt.m2693Text4IGK_g("Enviando dados para a planilha...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), ColorKt.Color(4281652121L), 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null), $composer, 6, 0, 65534);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1243783114);
                ComposerKt.sourceInformation($composer, "499@22257L897");
                Arrangement.Horizontal m550spacedBy0680j_42 = Arrangement.INSTANCE.m550spacedBy0680j_4(Dp.m6622constructorimpl(10));
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m550spacedBy0680j_42, centerVertically2, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier2);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((432 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    $composer.createNode(constructor2);
                } else {
                    $composer.useNode();
                }
                Composer m3652constructorimpl2 = Updater.m3652constructorimpl($composer);
                Updater.m3659setimpl(m3652constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3659setimpl(m3652constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3652constructorimpl2.getInserting()) {
                    composer = $composer;
                } else {
                    composer = $composer;
                    if (Intrinsics.areEqual(m3652constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Updater.m3659setimpl(m3652constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i5 = (i4 >> 6) & 14;
                        Composer composer2 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        int i6 = ((432 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, 350163418, "C503@22458L269,511@22877L10,509@22752L380:ExportarDadosScreen.kt#75g7xq");
                        IconKt.m2150Iconww6aTOc(CloudUploadKt.getCloudUpload(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), ColorKt.Color(4281652121L), composer2, 3504, 0);
                        TextKt.m2693Text4IGK_g("Enviar para o Google Planilhas", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), ColorKt.Color(4281652121L), TextUnitKt.getSp(14.5d), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777208, null), composer2, 6, 0, 65534);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        $composer.endReplaceGroup();
                    }
                }
                m3652constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3652constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                Updater.m3659setimpl(m3652constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                int i62 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer22, 350163418, "C503@22458L269,511@22877L10,509@22752L380:ExportarDadosScreen.kt#75g7xq");
                IconKt.m2150Iconww6aTOc(CloudUploadKt.getCloudUpload(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), ColorKt.Color(4281652121L), composer22, 3504, 0);
                TextKt.m2693Text4IGK_g("Enviar para o Google Planilhas", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer22, MaterialTheme.$stable).getBodyMedium(), ColorKt.Color(4281652121L), TextUnitKt.getSp(14.5d), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777208, null), composer22, 6, 0, 65534);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0687 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0525 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04ca  */
    /* renamed from: FormatOptionCard-3f6hBDE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7098FormatOptionCard3f6hBDE(final com.example.data.ExportFormat r132, final java.lang.String r133, final java.lang.String r134, final androidx.compose.ui.graphics.vector.ImageVector r135, final long r136, final boolean r138, final kotlin.jvm.functions.Function0<kotlin.Unit> r139, final java.lang.String r140, androidx.compose.runtime.Composer r141, final int r142) {
        /*
            Method dump skipped, instructions count: 2121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.ExportarDadosScreenKt.m7098FormatOptionCard3f6hBDE(com.example.data.ExportFormat, java.lang.String, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, long, boolean, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FormatOptionCard_3f6hBDE$lambda$45$lambda$44(Function0 $onSelect) {
        $onSelect.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0298  */
    /* renamed from: SummaryMetricPill-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7099SummaryMetricPillww6aTOc(final java.lang.String r112, final java.lang.String r113, androidx.compose.ui.Modifier r114, long r115, androidx.compose.runtime.Composer r117, final int r118, final int r119) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.ExportarDadosScreenKt.m7099SummaryMetricPillww6aTOc(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }
}

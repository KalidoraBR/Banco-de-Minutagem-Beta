package com.example.ui.episode;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.model.Episode;
import com.example.model.TimingSection;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CopyPreviousEpisodeModal.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0080\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u0011\u001aI\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001d²\u0006\n\u0010\u000e\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u000bX\u008a\u008e\u0002"}, d2 = {"CopyPreviousEpisodeModal", "", "previousEpisode", "Lcom/example/model/Episode;", "currentEpisode", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "onConfirmCopy", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "copyOpening", "copyRecap", "copyEnding", "(Lcom/example/model/Episode;Lcom/example/model/Episode;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "CopySectionOptionCard", "title", "", "previousTiming", "Lcom/example/model/TimingSection;", "currentTiming", "isChecked", "onCheckedChange", "Lkotlin/Function1;", "testTag", "(Ljava/lang/String;Lcom/example/model/TimingSection;Lcom/example/model/TimingSection;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app", "userConfirmedOverwrite"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CopyPreviousEpisodeModalKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CopyPreviousEpisodeModal$lambda$31(Episode episode, Episode episode2, SheetState sheetState, Function0 function0, Function3 function3, int i, Composer composer, int i2) {
        CopyPreviousEpisodeModal(episode, episode2, sheetState, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CopySectionOptionCard$lambda$40(String str, TimingSection timingSection, TimingSection timingSection2, boolean z, Function1 function1, String str2, int i, Composer composer, int i2) {
        CopySectionOptionCard(str, timingSection, timingSection2, z, function1, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CopyPreviousEpisodeModal(final Episode previousEpisode, final Episode currentEpisode, final SheetState sheetState, final Function0<Unit> onDismiss, final Function3<? super Boolean, ? super Boolean, ? super Boolean, Unit> onConfirmCopy, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        MutableState copyRecap$delegate;
        Object obj3;
        boolean z;
        Object obj4;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(previousEpisode, "previousEpisode");
        Intrinsics.checkNotNullParameter(currentEpisode, "currentEpisode");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirmCopy, "onConfirmCopy");
        Composer $composer3 = $composer.startRestartGroup(731867575);
        ComposerKt.sourceInformation($composer3, "C(CopyPreviousEpisodeModal)P(3!1,4,2)67@2853L64,68@2939L62,69@3024L63,70@3122L34,85@3749L8492,79@3530L8711:CopyPreviousEpisodeModal.kt#at6o8i");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(previousEpisode) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(currentEpisode) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(sheetState) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onConfirmCopy) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(731867575, $dirty2, -1, "com.example.ui.episode.CopyPreviousEpisodeModal (CopyPreviousEpisodeModal.kt:66)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1049886857, "CC(remember):CopyPreviousEpisodeModal.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(previousEpisode.getOpening().isCompleted()), null, 2, null);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            final MutableState copyOpening$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1049884107, "CC(remember):CopyPreviousEpisodeModal.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(previousEpisode.getRecap().isCompleted()), null, 2, null);
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            MutableState copyRecap$delegate2 = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1049881386, "CC(remember):CopyPreviousEpisodeModal.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                copyRecap$delegate = copyRecap$delegate2;
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(previousEpisode.getEnding().isCompleted()), null, 2, null);
                $composer3.updateRememberedValue(obj3);
            } else {
                copyRecap$delegate = copyRecap$delegate2;
                obj3 = rememberedValue3;
            }
            final MutableState copyEnding$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1049878279, "CC(remember):CopyPreviousEpisodeModal.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                z = false;
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(obj4);
            } else {
                z = false;
                obj4 = rememberedValue4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final boolean hasOverwriteRisk = ((CopyPreviousEpisodeModal$lambda$1(copyOpening$delegate) && currentEpisode.getOpening().isCompleted()) || (CopyPreviousEpisodeModal$lambda$4(copyRecap$delegate) && currentEpisode.getRecap().isCompleted()) || (CopyPreviousEpisodeModal$lambda$7(copyEnding$delegate) && currentEpisode.getEnding().isCompleted())) ? true : z;
            final boolean anySelected = (CopyPreviousEpisodeModal$lambda$1(copyOpening$delegate) || CopyPreviousEpisodeModal$lambda$4(copyRecap$delegate) || CopyPreviousEpisodeModal$lambda$7(copyEnding$delegate)) ? true : z;
            final MutableState copyRecap$delegate3 = copyRecap$delegate;
            $composer2 = $composer3;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(onDismiss, TestTagKt.testTag(Modifier.INSTANCE, "copy_previous_modal"), sheetState, 0.0f, null, ColorKt.getNavySurface(), 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(117732922, true, new Function3() { // from class: com.example.ui.episode.CopyPreviousEpisodeModalKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    return CopyPreviousEpisodeModalKt.CopyPreviousEpisodeModal$lambda$30(Episode.this, previousEpisode, hasOverwriteRisk, onDismiss, copyOpening$delegate, copyRecap$delegate3, copyEnding$delegate, anySelected, onConfirmCopy, (ColumnScope) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty2 >> 9) & 14) | 805503024 | ($dirty2 & 896), 384, 3544);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.episode.CopyPreviousEpisodeModalKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return CopyPreviousEpisodeModalKt.CopyPreviousEpisodeModal$lambda$31(Episode.this, currentEpisode, sheetState, onDismiss, onConfirmCopy, $changed, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    private static final boolean CopyPreviousEpisodeModal$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void CopyPreviousEpisodeModal$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean CopyPreviousEpisodeModal$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void CopyPreviousEpisodeModal$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean CopyPreviousEpisodeModal$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void CopyPreviousEpisodeModal$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0d06  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0d3f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0f6e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0f7a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0fb1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x110d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x11a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0fc7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0f80  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0d55 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0ed4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0625 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0368 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0b94  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0ba0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit CopyPreviousEpisodeModal$lambda$30(com.example.model.Episode r163, com.example.model.Episode r164, final boolean r165, kotlin.jvm.functions.Function0 r166, final androidx.compose.runtime.MutableState r167, final androidx.compose.runtime.MutableState r168, final androidx.compose.runtime.MutableState r169, final boolean r170, final kotlin.jvm.functions.Function3 r171, androidx.compose.foundation.layout.ColumnScope r172, androidx.compose.runtime.Composer r173, int r174) {
        /*
            Method dump skipped, instructions count: 4520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.CopyPreviousEpisodeModalKt.CopyPreviousEpisodeModal$lambda$30(com.example.model.Episode, com.example.model.Episode, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, boolean, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CopyPreviousEpisodeModal$lambda$30$lambda$29$lambda$17$lambda$16(MutableState $copyOpening$delegate, boolean it) {
        CopyPreviousEpisodeModal$lambda$2($copyOpening$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CopyPreviousEpisodeModal$lambda$30$lambda$29$lambda$19$lambda$18(MutableState $copyRecap$delegate, boolean it) {
        CopyPreviousEpisodeModal$lambda$5($copyRecap$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CopyPreviousEpisodeModal$lambda$30$lambda$29$lambda$21$lambda$20(MutableState $copyEnding$delegate, boolean it) {
        CopyPreviousEpisodeModal$lambda$8($copyEnding$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CopyPreviousEpisodeModal$lambda$30$lambda$29$lambda$28$lambda$26$lambda$25(boolean $anySelected, Function3 $onConfirmCopy, MutableState $copyOpening$delegate, MutableState $copyRecap$delegate, MutableState $copyEnding$delegate) {
        if ($anySelected) {
            $onConfirmCopy.invoke(Boolean.valueOf(CopyPreviousEpisodeModal$lambda$1($copyOpening$delegate)), Boolean.valueOf(CopyPreviousEpisodeModal$lambda$4($copyRecap$delegate)), Boolean.valueOf(CopyPreviousEpisodeModal$lambda$7($copyEnding$delegate)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CopyPreviousEpisodeModal$lambda$30$lambda$29$lambda$28$lambda$27(boolean $hasOverwriteRisk, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C276@11696L193,281@11910L39,282@11970L223:CopyPreviousEpisodeModal.kt#at6o8i");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2043222158, $changed, -1, "com.example.ui.episode.CopyPreviousEpisodeModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CopyPreviousEpisodeModal.kt:276)");
            }
            IconKt.m2150Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m720width3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(6)), $composer, 6);
            TextKt.m2693Text4IGK_g($hasOverwriteRisk ? "Substituir e copiar" : "Confirmar cópia", (Modifier) null, 0L, TextUnitKt.getSp(13.5d), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x066b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0548 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void CopySectionOptionCard(final java.lang.String r159, final com.example.model.TimingSection r160, final com.example.model.TimingSection r161, final boolean r162, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r163, final java.lang.String r164, androidx.compose.runtime.Composer r165, final int r166) {
        /*
            Method dump skipped, instructions count: 2767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.CopyPreviousEpisodeModalKt.CopySectionOptionCard(java.lang.String, com.example.model.TimingSection, com.example.model.TimingSection, boolean, kotlin.jvm.functions.Function1, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CopySectionOptionCard$lambda$34$lambda$33(Function1 $onCheckedChange, boolean $isChecked) {
        $onCheckedChange.invoke(Boolean.valueOf(!$isChecked));
        return Unit.INSTANCE;
    }
}

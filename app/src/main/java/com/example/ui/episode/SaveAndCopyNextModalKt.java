package com.example.ui.episode;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
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

/* compiled from: SaveAndCopyNextModal.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0080\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0019\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u000e\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000bX\u008a\u008e\u0002"}, d2 = {"SaveAndCopyNextModal", "", "currentEpisode", "Lcom/example/model/Episode;", "nextEpisode", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "onConfirmSaveAndCopy", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "copyOpening", "copyRecap", "copyEnding", "(Lcom/example/model/Episode;Lcom/example/model/Episode;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "SelectableCopySegmentRow", "title", "", "timing", "Lcom/example/model/TimingSection;", "isSelected", "onToggle", "testTag", "(Ljava/lang/String;Lcom/example/model/TimingSection;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app", "showOverwriteConfirmationDialog"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SaveAndCopyNextModalKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$39(Episode episode, Episode episode2, SheetState sheetState, Function0 function0, Function3 function3, int i, Composer composer, int i2) {
        SaveAndCopyNextModal(episode, episode2, sheetState, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SelectableCopySegmentRow$lambda$45(String str, TimingSection timingSection, boolean z, Function0 function0, String str2, int i, Composer composer, int i2) {
        SelectableCopySegmentRow(str, timingSection, z, function0, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SaveAndCopyNextModal(final Episode currentEpisode, final Episode nextEpisode, final SheetState sheetState, final Function0<Unit> onDismiss, final Function3<? super Boolean, ? super Boolean, ? super Boolean, Unit> onConfirmSaveAndCopy, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        MutableState copyEnding$delegate;
        MutableState copyOpening$delegate;
        Object obj4;
        Composer $composer2;
        final MutableState showOverwriteConfirmationDialog$delegate;
        Object obj5;
        Intrinsics.checkNotNullParameter(currentEpisode, "currentEpisode");
        Intrinsics.checkNotNullParameter(nextEpisode, "nextEpisode");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirmSaveAndCopy, "onConfirmSaveAndCopy");
        Composer $composer3 = $composer.startRestartGroup(1931261207);
        ComposerKt.sourceInformation($composer3, "C(SaveAndCopyNextModal)P(!2,4,3)70@2982L63,71@3067L61,72@3151L62,73@3257L34,88@3870L7862,82@3646L8086:SaveAndCopyNextModal.kt#at6o8i");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(currentEpisode) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(nextEpisode) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(sheetState) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onConfirmSaveAndCopy) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1931261207, $dirty2, -1, "com.example.ui.episode.SaveAndCopyNextModal (SaveAndCopyNextModal.kt:69)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 516158134, "CC(remember):SaveAndCopyNextModal.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(currentEpisode.getOpening().isCompleted()), null, 2, null);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            MutableState copyOpening$delegate2 = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 516160852, "CC(remember):SaveAndCopyNextModal.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(currentEpisode.getRecap().isCompleted()), null, 2, null);
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState copyRecap$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 516163541, "CC(remember):SaveAndCopyNextModal.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(currentEpisode.getEnding().isCompleted()), null, 2, null);
                $composer3.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            MutableState copyEnding$delegate2 = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 516166905, "CC(remember):SaveAndCopyNextModal.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                copyEnding$delegate = copyEnding$delegate2;
                copyOpening$delegate = copyOpening$delegate2;
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(obj4);
            } else {
                copyEnding$delegate = copyEnding$delegate2;
                copyOpening$delegate = copyOpening$delegate2;
                obj4 = rememberedValue4;
            }
            final MutableState showOverwriteConfirmationDialog$delegate2 = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final boolean hasOverwriteRisk = (SaveAndCopyNextModal$lambda$1(copyOpening$delegate) && nextEpisode.getOpening().isCompleted()) || (SaveAndCopyNextModal$lambda$4(copyRecap$delegate) && nextEpisode.getRecap().isCompleted()) || (SaveAndCopyNextModal$lambda$7(copyEnding$delegate) && nextEpisode.getEnding().isCompleted());
            final boolean anySelected = SaveAndCopyNextModal$lambda$1(copyOpening$delegate) || SaveAndCopyNextModal$lambda$4(copyRecap$delegate) || SaveAndCopyNextModal$lambda$7(copyEnding$delegate);
            final MutableState copyEnding$delegate3 = copyEnding$delegate;
            final MutableState copyOpening$delegate3 = copyOpening$delegate;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(onDismiss, TestTagKt.testTag(Modifier.INSTANCE, "save_and_copy_next_modal"), sheetState, 0.0f, null, ColorKt.getNavySurface(), 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(388756634, true, new Function3() { // from class: com.example.ui.episode.SaveAndCopyNextModalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    return SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$28(Episode.this, nextEpisode, hasOverwriteRisk, onDismiss, copyOpening$delegate3, copyRecap$delegate, copyEnding$delegate3, onConfirmSaveAndCopy, anySelected, showOverwriteConfirmationDialog$delegate2, (ColumnScope) obj6, (Composer) obj7, ((Integer) obj8).intValue());
                }
            }, $composer3, 54), $composer3, (($dirty2 >> 9) & 14) | 805503024 | ($dirty2 & 896), 384, 3544);
            if (SaveAndCopyNextModal$lambda$10(showOverwriteConfirmationDialog$delegate2)) {
                $composer3.startReplaceGroup(-1170106422);
                ComposerKt.sourceInformation($composer3, "284@11898L43,308@12995L710,324@13735L323,287@12049L454,298@12524L441,283@11854L2289");
                long navyCard = ColorKt.getNavyCard();
                RoundedCornerShape m953RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m953RoundedCornerShape0680j_4(Dp.m6622constructorimpl(14));
                Modifier testTag = TestTagKt.testTag(Modifier.INSTANCE, "save_and_copy_overwrite_dialog");
                ComposerKt.sourceInformationMarkerStart($composer3, 516443426, "CC(remember):SaveAndCopyNextModal.kt#9igjgp");
                Object rememberedValue5 = $composer3.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    showOverwriteConfirmationDialog$delegate = showOverwriteConfirmationDialog$delegate2;
                    obj5 = new Function0() { // from class: com.example.ui.episode.SaveAndCopyNextModalKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$30$lambda$29(MutableState.this);
                        }
                    };
                    $composer3.updateRememberedValue(obj5);
                } else {
                    showOverwriteConfirmationDialog$delegate = showOverwriteConfirmationDialog$delegate2;
                    obj5 = rememberedValue5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                final MutableState showOverwriteConfirmationDialog$delegate3 = showOverwriteConfirmationDialog$delegate;
                AndroidAlertDialog_androidKt.m1762AlertDialogOix01E0((Function0) obj5, ComposableLambdaKt.rememberComposableLambda(-142900828, true, new Function2() { // from class: com.example.ui.episode.SaveAndCopyNextModalKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        return SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$33(Function3.this, showOverwriteConfirmationDialog$delegate3, copyOpening$delegate3, copyRecap$delegate, copyEnding$delegate3, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, $composer3, 54), testTag, ComposableLambdaKt.rememberComposableLambda(1260968358, true, new Function2() { // from class: com.example.ui.episode.SaveAndCopyNextModalKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        return SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$36(MutableState.this, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1630129752, true, new Function2() { // from class: com.example.ui.episode.SaveAndCopyNextModalKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        return SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$37(Episode.this, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(-928195159, true, new Function2() { // from class: com.example.ui.episode.SaveAndCopyNextModalKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        return SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$38(Episode.this, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, $composer3, 54), m953RoundedCornerShape0680j_4, navyCard, 0L, 0L, 0L, 0.0f, null, $composer3, 102436278, 0, 15888);
                $composer2 = $composer3;
            } else {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-1181928117);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.episode.SaveAndCopyNextModalKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$39(Episode.this, nextEpisode, sheetState, onDismiss, onConfirmSaveAndCopy, $changed, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    private static final boolean SaveAndCopyNextModal$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SaveAndCopyNextModal$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SaveAndCopyNextModal$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SaveAndCopyNextModal$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SaveAndCopyNextModal$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SaveAndCopyNextModal$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SaveAndCopyNextModal$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SaveAndCopyNextModal$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0de2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0dee  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0e20  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0f72  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x100d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0e36 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0df2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x061b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0ac8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SaveAndCopyNextModal$lambda$28(com.example.model.Episode r164, com.example.model.Episode r165, final boolean r166, kotlin.jvm.functions.Function0 r167, final androidx.compose.runtime.MutableState r168, final androidx.compose.runtime.MutableState r169, final androidx.compose.runtime.MutableState r170, final kotlin.jvm.functions.Function3 r171, boolean r172, final androidx.compose.runtime.MutableState r173, androidx.compose.foundation.layout.ColumnScope r174, androidx.compose.runtime.Composer r175, int r176) {
        /*
            Method dump skipped, instructions count: 4115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$28(com.example.model.Episode, com.example.model.Episode, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function3, boolean, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$28$lambda$27$lambda$22$lambda$17$lambda$16(MutableState $copyOpening$delegate) {
        SaveAndCopyNextModal$lambda$2($copyOpening$delegate, !SaveAndCopyNextModal$lambda$1($copyOpening$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$28$lambda$27$lambda$22$lambda$19$lambda$18(MutableState $copyRecap$delegate) {
        SaveAndCopyNextModal$lambda$5($copyRecap$delegate, !SaveAndCopyNextModal$lambda$4($copyRecap$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$28$lambda$27$lambda$22$lambda$21$lambda$20(MutableState $copyEnding$delegate) {
        SaveAndCopyNextModal$lambda$8($copyEnding$delegate, !SaveAndCopyNextModal$lambda$7($copyEnding$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24(boolean $hasOverwriteRisk, Function3 $onConfirmSaveAndCopy, MutableState $showOverwriteConfirmationDialog$delegate, MutableState $copyOpening$delegate, MutableState $copyRecap$delegate, MutableState $copyEnding$delegate) {
        if ($hasOverwriteRisk) {
            SaveAndCopyNextModal$lambda$11($showOverwriteConfirmationDialog$delegate, true);
        } else {
            $onConfirmSaveAndCopy.invoke(Boolean.valueOf(SaveAndCopyNextModal$lambda$1($copyOpening$delegate)), Boolean.valueOf(SaveAndCopyNextModal$lambda$4($copyRecap$delegate)), Boolean.valueOf(SaveAndCopyNextModal$lambda$7($copyEnding$delegate)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$30$lambda$29(MutableState $showOverwriteConfirmationDialog$delegate) {
        SaveAndCopyNextModal$lambda$11($showOverwriteConfirmationDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$37(Episode $nextEpisode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C290@12202L10,288@12067L422:SaveAndCopyNextModal.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1630129752, $changed, -1, "com.example.ui.episode.SaveAndCopyNextModal.<anonymous> (SaveAndCopyNextModal.kt:288)");
            }
            TextKt.m2693Text4IGK_g("Substituir minutagens de " + $nextEpisode.getFormattedNumber() + "?", TestTagKt.testTag(Modifier.INSTANCE, "overwrite_confirmation_title"), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), ColorKt.getTextWhite(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777208, null), $composer, 48, 0, 65532);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$38(Episode $nextEpisode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C301@12750L10,299@12542L409:SaveAndCopyNextModal.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-928195159, $changed, -1, "com.example.ui.episode.SaveAndCopyNextModal.<anonymous> (SaveAndCopyNextModal.kt:299)");
            }
            TextKt.m2693Text4IGK_g("O " + $nextEpisode.getFormattedNumber() + " já possui dados preenchidos nos segmentos selecionados. Tem certeza de que deseja substituí-los?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m6101copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), ColorKt.getTextSecondary(), TextUnitKt.getSp(13.5d), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(18), null, null, null, 0, 0, null, 16646140, null), $composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$33(final Function3 $onConfirmSaveAndCopy, final MutableState $showOverwriteConfirmationDialog$delegate, final MutableState $copyOpening$delegate, final MutableState $copyRecap$delegate, final MutableState $copyEnding$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C314@13265L144,310@13051L168,309@13013L678:SaveAndCopyNextModal.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-142900828, $changed, -1, "com.example.ui.episode.SaveAndCopyNextModal.<anonymous> (SaveAndCopyNextModal.kt:309)");
            }
            ButtonColors m1809buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1809buttonColorsro_MJ88(androidx.compose.ui.graphics.ColorKt.Color(4293870660L), ColorKt.getTextWhite(), 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 54, 12);
            RoundedCornerShape m953RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m953RoundedCornerShape0680j_4(Dp.m6622constructorimpl(8));
            Modifier testTag = TestTagKt.testTag(Modifier.INSTANCE, "save_and_copy_overwrite_confirm_button");
            ComposerKt.sourceInformationMarkerStart($composer, 111259724, "CC(remember):SaveAndCopyNextModal.kt#9igjgp");
            boolean changed = $composer.changed($onConfirmSaveAndCopy);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.episode.SaveAndCopyNextModalKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$33$lambda$32$lambda$31(Function3.this, $showOverwriteConfirmationDialog$delegate, $copyOpening$delegate, $copyRecap$delegate, $copyEnding$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) obj, testTag, false, m953RoundedCornerShape0680j_4, m1809buttonColorsro_MJ88, null, null, null, null, ComposableSingletons$SaveAndCopyNextModalKt.INSTANCE.getLambda$1472368020$app(), $composer, 805306416, 484);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$33$lambda$32$lambda$31(Function3 $onConfirmSaveAndCopy, MutableState $showOverwriteConfirmationDialog$delegate, MutableState $copyOpening$delegate, MutableState $copyRecap$delegate, MutableState $copyEnding$delegate) {
        SaveAndCopyNextModal$lambda$11($showOverwriteConfirmationDialog$delegate, false);
        $onConfirmSaveAndCopy.invoke(Boolean.valueOf(SaveAndCopyNextModal$lambda$1($copyOpening$delegate)), Boolean.valueOf(SaveAndCopyNextModal$lambda$4($copyRecap$delegate)), Boolean.valueOf(SaveAndCopyNextModal$lambda$7($copyEnding$delegate)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$36(final MutableState $showOverwriteConfirmationDialog$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C326@13795L43,325@13753L291:SaveAndCopyNextModal.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1260968358, $changed, -1, "com.example.ui.episode.SaveAndCopyNextModal.<anonymous> (SaveAndCopyNextModal.kt:325)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 609816529, "CC(remember):SaveAndCopyNextModal.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.episode.SaveAndCopyNextModalKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SaveAndCopyNextModalKt.SaveAndCopyNextModal$lambda$36$lambda$35$lambda$34(MutableState.this);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) obj, TestTagKt.testTag(Modifier.INSTANCE, "save_and_copy_overwrite_cancel_button"), false, null, null, null, null, null, null, ComposableSingletons$SaveAndCopyNextModalKt.INSTANCE.getLambda$812083491$app(), $composer, 805306422, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SaveAndCopyNextModal$lambda$36$lambda$35$lambda$34(MutableState $showOverwriteConfirmationDialog$delegate) {
        SaveAndCopyNextModal$lambda$11($showOverwriteConfirmationDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0598  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void SelectableCopySegmentRow(final java.lang.String r128, final com.example.model.TimingSection r129, final boolean r130, final kotlin.jvm.functions.Function0<kotlin.Unit> r131, final java.lang.String r132, androidx.compose.runtime.Composer r133, final int r134) {
        /*
            Method dump skipped, instructions count: 1862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.SaveAndCopyNextModalKt.SelectableCopySegmentRow(java.lang.String, com.example.model.TimingSection, boolean, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SelectableCopySegmentRow$lambda$44$lambda$43$lambda$41$lambda$40(Function0 $onToggle, boolean it) {
        $onToggle.invoke();
        return Unit.INSTANCE;
    }
}

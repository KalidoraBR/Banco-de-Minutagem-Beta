package com.example.ui.detail.modals;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.example.model.Series;
import com.example.model.SeriesStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatusModal.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b\u001aU\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aE\u0010\u001b\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"StatusModal", "", "series", "Lcom/example/model/Series;", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "onSaveStatus", "Lkotlin/Function1;", "Lcom/example/model/SeriesStatus;", "(Lcom/example/model/Series;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "StatusOptionCard", "title", "", "explanation", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconColor", "Landroidx/compose/ui/graphics/Color;", "iconBgColor", "isSelected", "", "onClick", "testTag", "StatusOptionCard-vRFhKjU", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JJZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SecondaryChoiceRow", "subtitle", "indicatorColor", "SecondaryChoiceRow-uDo3WH8", "(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "selectedMain", "Lcom/example/ui/detail/modals/MainStatusSelection;", "selectedCompletedType"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StatusModalKt {

    /* compiled from: StatusModal.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SeriesStatus.values().length];
            try {
                iArr[SeriesStatus.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[SeriesStatus.COMPLETED_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[SeriesStatus.COMPLETED_INCOMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[SeriesStatus.UPCOMING.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MainStatusSelection.values().length];
            try {
                iArr2[MainStatusSelection.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr2[MainStatusSelection.UPCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr2[MainStatusSelection.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SecondaryChoiceRow_uDo3WH8$lambda$32(String str, String str2, boolean z, long j, String str3, Function0 function0, int i, Composer composer, int i2) {
        m7003SecondaryChoiceRowuDo3WH8(str, str2, z, j, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusModal$lambda$22(Series series, SheetState sheetState, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        StatusModal(series, sheetState, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusOptionCard_vRFhKjU$lambda$28(String str, String str2, ImageVector imageVector, long j, long j2, boolean z, Function0 function0, String str3, int i, Composer composer, int i2) {
        m7004StatusOptionCardvRFhKjU(str, str2, imageVector, j, j2, z, function0, str3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void StatusModal(final Series series, final SheetState sheetState, final Function0<Unit> onDismiss, final Function1<? super SeriesStatus, Unit> onSaveStatus, Composer $composer, final int $changed) {
        MainStatusSelection mainStatusSelection;
        Object obj;
        Object obj2;
        long m4157copywmQWz5c;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(series, "series");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSaveStatus, "onSaveStatus");
        Composer $composer3 = $composer.startRestartGroup(2028440320);
        ComposerKt.sourceInformation($composer3, "C(StatusModal)P(2,3)83@3381L40,84@3455L49,86@3528L21,95@3808L6192,88@3555L6445:StatusModal.kt#99r5nq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(series) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(sheetState) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onSaveStatus) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2028440320, $dirty2, -1, "com.example.ui.detail.modals.StatusModal (StatusModal.kt:70)");
            }
            switch (WhenMappings.$EnumSwitchMapping$0[series.getStatus().ordinal()]) {
                case 1:
                    mainStatusSelection = MainStatusSelection.IN_PROGRESS;
                    break;
                case 2:
                case 3:
                    mainStatusSelection = MainStatusSelection.COMPLETED;
                    break;
                case 4:
                    mainStatusSelection = MainStatusSelection.UPCOMING;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            MainStatusSelection initialMain = mainStatusSelection;
            SeriesStatus initialCompletedType = WhenMappings.$EnumSwitchMapping$0[series.getStatus().ordinal()] == 3 ? SeriesStatus.COMPLETED_INCOMPLETE : SeriesStatus.COMPLETED_FULL;
            ComposerKt.sourceInformationMarkerStart($composer3, -583980984, "CC(remember):StatusModal.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialMain, null, 2, null);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            final MutableState selectedMain$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -583978607, "CC(remember):StatusModal.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialCompletedType, null, 2, null);
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState selectedCompletedType$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final ScrollState scrollState = ScrollKt.rememberScrollState(0, $composer3, 0, 1);
            long Color = ColorKt.Color(4279179050L);
            long textWhite = com.example.ui.theme.ColorKt.getTextWhite();
            m4157copywmQWz5c = Color.m4157copywmQWz5c(r17, (r12 & 1) != 0 ? Color.m4161getAlphaimpl(r17) : 0.65f, (r12 & 2) != 0 ? Color.m4165getRedimpl(r17) : 0.0f, (r12 & 4) != 0 ? Color.m4164getGreenimpl(r17) : 0.0f, (r12 & 8) != 0 ? Color.m4162getBlueimpl(Color.INSTANCE.m4185getBlack0d7_KjU()) : 0.0f);
            $composer2 = $composer3;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(onDismiss, null, sheetState, 0.0f, null, Color, textWhite, 0.0f, m4157copywmQWz5c, null, null, null, ComposableLambdaKt.rememberComposableLambda(2140422045, true, new Function3() { // from class: com.example.ui.detail.modals.StatusModalKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return StatusModalKt.StatusModal$lambda$21(ScrollState.this, onDismiss, onSaveStatus, selectedMain$delegate, selectedCompletedType$delegate, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty2 >> 6) & 14) | 907739136 | (($dirty2 << 3) & 896), 384, 3226);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.detail.modals.StatusModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return StatusModalKt.StatusModal$lambda$22(Series.this, sheetState, onDismiss, onSaveStatus, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final MainStatusSelection StatusModal$lambda$1(MutableState<MainStatusSelection> mutableState) {
        return mutableState.getValue();
    }

    private static final SeriesStatus StatusModal$lambda$4(MutableState<SeriesStatus> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StatusModal$lambda$21(androidx.compose.foundation.ScrollState r46, kotlin.jvm.functions.Function0 r47, final kotlin.jvm.functions.Function1 r48, final androidx.compose.runtime.MutableState r49, final androidx.compose.runtime.MutableState r50, androidx.compose.foundation.layout.ColumnScope r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.StatusModalKt.StatusModal$lambda$21(androidx.compose.foundation.ScrollState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusModal$lambda$21$lambda$20$lambda$7$lambda$6(MutableState $selectedMain$delegate) {
        $selectedMain$delegate.setValue(MainStatusSelection.IN_PROGRESS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusModal$lambda$21$lambda$20$lambda$9$lambda$8(MutableState $selectedMain$delegate) {
        $selectedMain$delegate.setValue(MainStatusSelection.COMPLETED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit StatusModal$lambda$21$lambda$20$lambda$15(final androidx.compose.runtime.MutableState r86, androidx.compose.animation.AnimatedVisibilityScope r87, androidx.compose.runtime.Composer r88, int r89) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.StatusModalKt.StatusModal$lambda$21$lambda$20$lambda$15(androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusModal$lambda$21$lambda$20$lambda$15$lambda$14$lambda$11$lambda$10(MutableState $selectedCompletedType$delegate) {
        $selectedCompletedType$delegate.setValue(SeriesStatus.COMPLETED_FULL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusModal$lambda$21$lambda$20$lambda$15$lambda$14$lambda$13$lambda$12(MutableState $selectedCompletedType$delegate) {
        $selectedCompletedType$delegate.setValue(SeriesStatus.COMPLETED_INCOMPLETE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusModal$lambda$21$lambda$20$lambda$17$lambda$16(MutableState $selectedMain$delegate) {
        $selectedMain$delegate.setValue(MainStatusSelection.UPCOMING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusModal$lambda$21$lambda$20$lambda$19$lambda$18(Function1 $onSaveStatus, MutableState $selectedMain$delegate, MutableState $selectedCompletedType$delegate) {
        SeriesStatus finalStatus;
        switch (WhenMappings.$EnumSwitchMapping$1[StatusModal$lambda$1($selectedMain$delegate).ordinal()]) {
            case 1:
                finalStatus = SeriesStatus.IN_PROGRESS;
                break;
            case 2:
                finalStatus = SeriesStatus.UPCOMING;
                break;
            case 3:
                finalStatus = StatusModal$lambda$4($selectedCompletedType$delegate);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        $onSaveStatus.invoke(finalStatus);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x087c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0616 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x044b  */
    /* renamed from: StatusOptionCard-vRFhKjU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7004StatusOptionCardvRFhKjU(final java.lang.String r140, final java.lang.String r141, final androidx.compose.ui.graphics.vector.ImageVector r142, final long r143, final long r145, final boolean r147, final kotlin.jvm.functions.Function0<kotlin.Unit> r148, final java.lang.String r149, androidx.compose.runtime.Composer r150, final int r151) {
        /*
            Method dump skipped, instructions count: 2433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.StatusModalKt.m7004StatusOptionCardvRFhKjU(java.lang.String, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, long, long, boolean, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04e6  */
    /* renamed from: SecondaryChoiceRow-uDo3WH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7003SecondaryChoiceRowuDo3WH8(final java.lang.String r108, final java.lang.String r109, final boolean r110, final long r111, final java.lang.String r113, final kotlin.jvm.functions.Function0<kotlin.Unit> r114, androidx.compose.runtime.Composer r115, final int r116) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.StatusModalKt.m7003SecondaryChoiceRowuDo3WH8(java.lang.String, java.lang.String, boolean, long, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}

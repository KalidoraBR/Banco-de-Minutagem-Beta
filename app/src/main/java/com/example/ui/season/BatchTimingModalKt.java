package com.example.ui.season;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.TestTagKt;
import coil.disk.DiskLruCache;
import com.example.model.Episode;
import com.example.model.EpisodeStatus;
import com.example.model.Season;
import com.example.model.TimingSection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BatchTimingModal.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0018\u001aS\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0011H\u0003¢\u0006\u0004\b#\u0010$\u001aE\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020!2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010)\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010*¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u000206X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020!X\u008a\u008e\u0002"}, d2 = {"BatchTimingModal", "", "season", "Lcom/example/model/Season;", "episodes", "", "Lcom/example/model/Episode;", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "onApplyBatch", "Lkotlin/Function1;", "Lcom/example/ui/season/BatchApplyConfig;", "(Lcom/example/model/Season;Ljava/util/List;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SegmentBadgePreview", "label", "", "timing", "Lcom/example/model/TimingSection;", "(Ljava/lang/String;Lcom/example/model/TimingSection;Landroidx/compose/runtime/Composer;I)V", "QuickPresetChip", "onClick", "testTag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SegmentCheckboxItem", "name", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconTint", "Landroidx/compose/ui/graphics/Color;", "sourceTiming", "isChecked", "", "onCheckedChange", "SegmentCheckboxItem-FU0evQE", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLcom/example/model/TimingSection;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ModeRadioOption", "title", "subtitle", "isSelected", "isDestructive", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app", "currentStep", "", "selectedSourceEpisode", "sourceDropdownExpanded", "startEpisodeText", "endEpisodeText", "copyOpening", "copyRecap", "copyEnding", "selectedMode", "Lcom/example/ui/season/BatchApplyMode;", "showOverwriteConfirmation"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BatchTimingModalKt {

    /* compiled from: BatchTimingModal.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EpisodeStatus.values().length];
            try {
                iArr[EpisodeStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EpisodeStatus.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$120(Season season, List list, SheetState sheetState, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        BatchTimingModal(season, list, sheetState, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ModeRadioOption$lambda$139(String str, String str2, boolean z, Function0 function0, boolean z2, String str3, int i, int i2, Composer composer, int i3) {
        ModeRadioOption(str, str2, z, function0, z2, str3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuickPresetChip$lambda$125(String str, Function0 function0, String str2, int i, Composer composer, int i2) {
        QuickPresetChip(str, function0, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SegmentBadgePreview$lambda$123(String str, TimingSection timingSection, int i, Composer composer, int i2) {
        SegmentBadgePreview(str, timingSection, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SegmentCheckboxItem_FU0evQE$lambda$134(String str, ImageVector imageVector, long j, TimingSection timingSection, boolean z, Function1 function1, String str2, int i, Composer composer, int i2) {
        m7028SegmentCheckboxItemFU0evQE(str, imageVector, j, timingSection, z, function1, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0334  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BatchTimingModal(final com.example.model.Season r53, final java.util.List<com.example.model.Episode> r54, final androidx.compose.material3.SheetState r55, final kotlin.jvm.functions.Function0<kotlin.Unit> r56, final kotlin.jvm.functions.Function1<? super com.example.ui.season.BatchApplyConfig, kotlin.Unit> r57, androidx.compose.runtime.Composer r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.BatchTimingModalKt.BatchTimingModal(com.example.model.Season, java.util.List, androidx.compose.material3.SheetState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    private static final int BatchTimingModal$lambda$1(MutableIntState $currentStep$delegate) {
        return $currentStep$delegate.getIntValue();
    }

    private static final Episode BatchTimingModal$lambda$6(MutableState<Episode> mutableState) {
        return mutableState.getValue();
    }

    private static final void BatchTimingModal$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BatchTimingModal$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final String BatchTimingModal$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String BatchTimingModal$lambda$15(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BatchTimingModal$lambda$18(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BatchTimingModal$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BatchTimingModal$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BatchTimingModal$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BatchTimingModal$lambda$24(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BatchTimingModal$lambda$25(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final BatchApplyMode BatchTimingModal$lambda$27(MutableState<BatchApplyMode> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BatchTimingModal$lambda$30(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BatchTimingModal$lambda$31(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0d1a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0d95  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0e3f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0e68  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0e7a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0eaf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0f4d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0f86  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x1070  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x107c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x10b3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x1127  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x113e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x1221  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x12b9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x122c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x1143  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x112e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x10c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x1082  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0f9c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0f53  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0e7f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0e70  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0e54  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0e18  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0dd8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0d1f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0cbe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0b8f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x09a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0664 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0b40  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit BatchTimingModal$lambda$119(androidx.compose.foundation.ScrollState r150, final kotlin.jvm.functions.Function0 r151, com.example.model.Season r152, final boolean r153, final androidx.compose.runtime.MutableIntState r154, final boolean r155, final int r156, final boolean r157, final boolean r158, final androidx.compose.runtime.MutableState r159, final androidx.compose.runtime.MutableState r160, final java.util.List r161, final androidx.compose.runtime.MutableState r162, final androidx.compose.runtime.MutableState r163, final boolean r164, final androidx.compose.runtime.MutableState r165, final androidx.compose.runtime.MutableState r166, final androidx.compose.runtime.MutableState r167, final androidx.compose.runtime.MutableState r168, final java.lang.String r169, final java.util.List r170, final androidx.compose.runtime.MutableState r171, final kotlin.jvm.functions.Function1 r172, final java.lang.Integer r173, final java.lang.Integer r174, final boolean r175, androidx.compose.foundation.layout.ColumnScope r176, androidx.compose.runtime.Composer r177, int r178) {
        /*
            Method dump skipped, instructions count: 4799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.BatchTimingModalKt.BatchTimingModal$lambda$119(androidx.compose.foundation.ScrollState, kotlin.jvm.functions.Function0, com.example.model.Season, boolean, androidx.compose.runtime.MutableIntState, boolean, int, boolean, boolean, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, boolean, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.lang.String, java.util.List, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function1, java.lang.Integer, java.lang.Integer, boolean, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$45$lambda$38$lambda$37(MutableIntState $currentStep$delegate) {
        $currentStep$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$45$lambda$42$lambda$41(boolean $isRangeValid, MutableIntState $currentStep$delegate) {
        if ($isRangeValid) {
            $currentStep$delegate.setIntValue(2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform BatchTimingModal$lambda$119$lambda$118$lambda$51$lambda$50(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Number) AnimatedContent.getTargetState()).intValue() > ((Number) AnimatedContent.getInitialState()).intValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.example.ui.season.BatchTimingModalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(BatchTimingModalKt.BatchTimingModal$lambda$119$lambda$118$lambda$51$lambda$50$lambda$46(((Integer) obj).intValue()));
                }
            }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.example.ui.season.BatchTimingModalKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(BatchTimingModalKt.BatchTimingModal$lambda$119$lambda$118$lambda$51$lambda$50$lambda$47(((Integer) obj).intValue()));
                }
            }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.example.ui.season.BatchTimingModalKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(BatchTimingModalKt.BatchTimingModal$lambda$119$lambda$118$lambda$51$lambda$50$lambda$48(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.example.ui.season.BatchTimingModalKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(BatchTimingModalKt.BatchTimingModal$lambda$119$lambda$118$lambda$51$lambda$50$lambda$49(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int BatchTimingModal$lambda$119$lambda$118$lambda$51$lambda$50$lambda$46(int width) {
        return width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int BatchTimingModal$lambda$119$lambda$118$lambda$51$lambda$50$lambda$47(int width) {
        return -width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int BatchTimingModal$lambda$119$lambda$118$lambda$51$lambda$50$lambda$48(int width) {
        return -width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int BatchTimingModal$lambda$119$lambda$118$lambda$51$lambda$50$lambda$49(int width) {
        return width;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x28f5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.rememberedValue(), java.lang.Integer.valueOf(r23)) == false) goto L398;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0e34  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0e40  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0e79  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0f99  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0fac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1074  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x1165  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x1171  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x11aa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x12ca  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x12dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x13a5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x1431  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x15c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x15cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x1608  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x169c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x171d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x17f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x17fd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1834  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x1999  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x19ab  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x1803  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x172b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x16ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x161e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x15d5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1526  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x13b7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x12e2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x12d0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x11c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1177  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1086  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0fb1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0f9f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0e8f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0e46  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0d65 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0d1c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0a5b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x059a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x1c34  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x1c40  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x1d18  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x1d7e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x1de6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x1e2b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x1fff  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x200b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x2044  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x20b3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x20d4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x2111  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x2132  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x225f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x226b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x22a4  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x237d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x2389  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x23c2  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x24ab  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x24b7  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x24f0  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x26a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x2826  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x2b27  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x2769  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x2506 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x24bd  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x23d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x238f  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x22ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x2271  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x2140  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x2114  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x20e6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x20b6  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x205a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x2011  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x1ed5  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x1dfa  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x1d92  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x1d2a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x1c46  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0d0a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0d16  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit BatchTimingModal$lambda$119$lambda$118$lambda$117(boolean r217, boolean r218, final int r219, boolean r220, boolean r221, final androidx.compose.runtime.MutableState r222, final androidx.compose.runtime.MutableState r223, final java.util.List r224, final androidx.compose.runtime.MutableState r225, final androidx.compose.runtime.MutableState r226, final kotlin.jvm.functions.Function0 r227, final androidx.compose.runtime.MutableIntState r228, boolean r229, final androidx.compose.runtime.MutableState r230, final androidx.compose.runtime.MutableState r231, final androidx.compose.runtime.MutableState r232, final androidx.compose.runtime.MutableState r233, final java.lang.String r234, java.util.List r235, final androidx.compose.runtime.MutableState r236, final kotlin.jvm.functions.Function1 r237, final java.lang.Integer r238, final java.lang.Integer r239, boolean r240, androidx.compose.animation.AnimatedContentScope r241, int r242, androidx.compose.runtime.Composer r243, int r244) {
        /*
            Method dump skipped, instructions count: 11094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.BatchTimingModalKt.BatchTimingModal$lambda$119$lambda$118$lambda$117(boolean, boolean, int, boolean, boolean, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableIntState, boolean, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.lang.String, java.util.List, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function1, java.lang.Integer, java.lang.Integer, boolean, androidx.compose.animation.AnimatedContentScope, int, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$68$lambda$53$lambda$52(MutableState $sourceDropdownExpanded$delegate) {
        BatchTimingModal$lambda$10($sourceDropdownExpanded$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$68$lambda$60$lambda$59(MutableState $sourceDropdownExpanded$delegate) {
        BatchTimingModal$lambda$10($sourceDropdownExpanded$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$68$lambda$67(List $episodes, final MutableState $selectedSourceEpisode$delegate, final MutableState $sourceDropdownExpanded$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*440@20445L1925,465@22422L189,439@20380L2375:BatchTimingModal.kt#98f12s");
        if (($changed & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1857873827, $changed, -1, "com.example.ui.season.BatchTimingModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BatchTimingModal.kt:438)");
            }
            Iterator it = $episodes.iterator();
            while (it.hasNext()) {
                final Episode episode = (Episode) it.next();
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1044385641, true, new Function2() { // from class: com.example.ui.season.BatchTimingModalKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return BatchTimingModalKt.BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$68$lambda$67$lambda$66$lambda$63(Episode.this, $selectedSourceEpisode$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1024323466, "CC(remember):BatchTimingModal.kt#9igjgp");
                boolean changed = composer.changed(episode);
                Object rememberedValue = $composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function0() { // from class: com.example.ui.season.BatchTimingModalKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BatchTimingModalKt.BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64(Episode.this, $selectedSourceEpisode$delegate, $sourceDropdownExpanded$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) obj, TestTagKt.testTag(Modifier.INSTANCE, "source_option_" + episode.getEpisodeNumber()), null, null, false, null, null, null, composer, 6, 504);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$68$lambda$67$lambda$66$lambda$63(com.example.model.Episode r50, androidx.compose.runtime.MutableState r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.BatchTimingModalKt.BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$68$lambda$67$lambda$66$lambda$63(com.example.model.Episode, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64(Episode $ep, MutableState $selectedSourceEpisode$delegate, MutableState $sourceDropdownExpanded$delegate) {
        $selectedSourceEpisode$delegate.setValue($ep);
        BatchTimingModal$lambda$10($sourceDropdownExpanded$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$77$lambda$72$lambda$71$lambda$70(MutableState $startEpisodeText$delegate, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = input;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String clean = StringsKt.take(((StringBuilder) sb).toString(), 4);
        $startEpisodeText$delegate.setValue(clean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$77$lambda$76$lambda$75$lambda$74(MutableState $endEpisodeText$delegate, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = input;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String clean = StringsKt.take(((StringBuilder) sb).toString(), 4);
        $endEpisodeText$delegate.setValue(clean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$82$lambda$79$lambda$78(int $totalEpisodes, MutableState $startEpisodeText$delegate, MutableState $endEpisodeText$delegate) {
        $startEpisodeText$delegate.setValue(DiskLruCache.VERSION);
        $endEpisodeText$delegate.setValue(String.valueOf($totalEpisodes));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$82$lambda$81$lambda$80(int $nextAfterSource, int $totalEpisodes, MutableState $startEpisodeText$delegate, MutableState $endEpisodeText$delegate) {
        $startEpisodeText$delegate.setValue(String.valueOf($nextAfterSource));
        $endEpisodeText$delegate.setValue(String.valueOf($totalEpisodes));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$86$lambda$85$lambda$84$lambda$83(MutableIntState $currentStep$delegate) {
        $currentStep$delegate.setIntValue(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$93$lambda$88$lambda$87(MutableState $copyOpening$delegate, boolean it) {
        BatchTimingModal$lambda$19($copyOpening$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$93$lambda$90$lambda$89(MutableState $copyRecap$delegate, boolean it) {
        BatchTimingModal$lambda$22($copyRecap$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$93$lambda$92$lambda$91(MutableState $copyEnding$delegate, boolean it) {
        BatchTimingModal$lambda$25($copyEnding$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$98$lambda$95$lambda$94(MutableState $selectedMode$delegate) {
        $selectedMode$delegate.setValue(BatchApplyMode.ONLY_EMPTY);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$98$lambda$97$lambda$96(MutableState $selectedMode$delegate) {
        $selectedMode$delegate.setValue(BatchApplyMode.OVERWRITE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$110(androidx.compose.runtime.MutableState r116, androidx.compose.runtime.MutableState r117, final kotlin.jvm.functions.Function1 r118, final java.lang.Integer r119, final java.lang.Integer r120, final int r121, final java.lang.String r122, final kotlin.jvm.functions.Function0 r123, final androidx.compose.runtime.MutableState r124, final androidx.compose.runtime.MutableState r125, final androidx.compose.runtime.MutableState r126, final androidx.compose.runtime.MutableState r127, final androidx.compose.runtime.MutableState r128, final androidx.compose.runtime.MutableState r129, androidx.compose.animation.AnimatedVisibilityScope r130, androidx.compose.runtime.Composer r131, int r132) {
        /*
            Method dump skipped, instructions count: 2240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.BatchTimingModalKt.BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$110(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function1, java.lang.Integer, java.lang.Integer, int, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$110$lambda$109$lambda$108$lambda$107$lambda$104$lambda$103(MutableState $showOverwriteConfirmation$delegate) {
        BatchTimingModal$lambda$31($showOverwriteConfirmation$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$110$lambda$109$lambda$108$lambda$107$lambda$106$lambda$105(Function1 $onApplyBatch, Integer $startEpisodeInt, Integer $endEpisodeInt, int $totalEpisodes, String $summaryText, Function0 $onDismiss, MutableState $showOverwriteConfirmation$delegate, MutableState $selectedSourceEpisode$delegate, MutableState $copyOpening$delegate, MutableState $copyRecap$delegate, MutableState $copyEnding$delegate, MutableState $selectedMode$delegate) {
        BatchTimingModal$lambda$31($showOverwriteConfirmation$delegate, false);
        $onApplyBatch.invoke(new BatchApplyConfig(BatchTimingModal$lambda$6($selectedSourceEpisode$delegate), $startEpisodeInt != null ? $startEpisodeInt.intValue() : 1, $endEpisodeInt != null ? $endEpisodeInt.intValue() : $totalEpisodes, BatchTimingModal$lambda$18($copyOpening$delegate), BatchTimingModal$lambda$21($copyRecap$delegate), BatchTimingModal$lambda$24($copyEnding$delegate), BatchTimingModal$lambda$27($selectedMode$delegate), $summaryText));
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$115$lambda$112$lambda$111(MutableIntState $currentStep$delegate) {
        $currentStep$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BatchTimingModal$lambda$119$lambda$118$lambda$117$lambda$116$lambda$115$lambda$114$lambda$113(Function1 $onApplyBatch, Integer $startEpisodeInt, Integer $endEpisodeInt, int $totalEpisodes, String $summaryText, Function0 $onDismiss, MutableState $selectedMode$delegate, MutableState $showOverwriteConfirmation$delegate, MutableState $selectedSourceEpisode$delegate, MutableState $copyOpening$delegate, MutableState $copyRecap$delegate, MutableState $copyEnding$delegate) {
        if (BatchTimingModal$lambda$27($selectedMode$delegate) == BatchApplyMode.OVERWRITE) {
            BatchTimingModal$lambda$31($showOverwriteConfirmation$delegate, true);
        } else {
            $onApplyBatch.invoke(new BatchApplyConfig(BatchTimingModal$lambda$6($selectedSourceEpisode$delegate), $startEpisodeInt != null ? $startEpisodeInt.intValue() : 1, $endEpisodeInt != null ? $endEpisodeInt.intValue() : $totalEpisodes, BatchTimingModal$lambda$18($copyOpening$delegate), BatchTimingModal$lambda$21($copyRecap$delegate), BatchTimingModal$lambda$24($copyEnding$delegate), BatchTimingModal$lambda$27($selectedMode$delegate), $summaryText));
            $onDismiss.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void SegmentBadgePreview(final java.lang.String r85, final com.example.model.TimingSection r86, androidx.compose.runtime.Composer r87, final int r88) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.BatchTimingModalKt.SegmentBadgePreview(java.lang.String, com.example.model.TimingSection, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void QuickPresetChip(java.lang.String r69, final kotlin.jvm.functions.Function0<kotlin.Unit> r70, final java.lang.String r71, androidx.compose.runtime.Composer r72, final int r73) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.BatchTimingModalKt.QuickPresetChip(java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033f  */
    /* renamed from: SegmentCheckboxItem-FU0evQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7028SegmentCheckboxItemFU0evQE(final java.lang.String r148, final androidx.compose.ui.graphics.vector.ImageVector r149, final long r150, final com.example.model.TimingSection r152, final boolean r153, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r154, final java.lang.String r155, androidx.compose.runtime.Composer r156, final int r157) {
        /*
            Method dump skipped, instructions count: 2461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.BatchTimingModalKt.m7028SegmentCheckboxItemFU0evQE(java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, long, com.example.model.TimingSection, boolean, kotlin.jvm.functions.Function1, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SegmentCheckboxItem_FU0evQE$lambda$128$lambda$127(Function1 $onCheckedChange, boolean $isChecked) {
        $onCheckedChange.invoke(Boolean.valueOf(!$isChecked));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0573 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x055d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ModeRadioOption(final java.lang.String r155, final java.lang.String r156, final boolean r157, final kotlin.jvm.functions.Function0<kotlin.Unit> r158, boolean r159, final java.lang.String r160, androidx.compose.runtime.Composer r161, final int r162, final int r163) {
        /*
            Method dump skipped, instructions count: 1969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.BatchTimingModalKt.ModeRadioOption(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, boolean, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }
}

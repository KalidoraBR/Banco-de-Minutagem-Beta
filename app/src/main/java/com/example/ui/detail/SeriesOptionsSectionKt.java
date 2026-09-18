package com.example.ui.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.example.model.Series;
import com.example.model.SeriesStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: SeriesOptionsSection.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001aM\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"SeriesOptionsSection", "", "series", "Lcom/example/model/Series;", "onOptionClick", "Lkotlin/Function1;", "Lcom/example/ui/detail/DetailOptionType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/model/Series;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OptionCard", "title", "", "secondaryInfo", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconContainerColor", "Landroidx/compose/ui/graphics/Color;", "iconTintColor", "testTag", "onClick", "Lkotlin/Function0;", "OptionCard-jB83MbM", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JJLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SeriesOptionsSectionKt {

    /* compiled from: SeriesOptionsSection.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit OptionCard_jB83MbM$lambda$13(String str, String str2, ImageVector imageVector, long j, long j2, String str3, Function0 function0, int i, Composer composer, int i2) {
        m6997OptionCardjB83MbM(str, str2, imageVector, j, j2, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesOptionsSection$lambda$7(Series series, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeriesOptionsSection(series, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeriesOptionsSection(final com.example.model.Series r51, final kotlin.jvm.functions.Function1<? super com.example.ui.detail.DetailOptionType, kotlin.Unit> r52, androidx.compose.ui.Modifier r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeriesOptionsSectionKt.SeriesOptionsSection(com.example.model.Series, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesOptionsSection$lambda$6$lambda$1$lambda$0(Function1 $onOptionClick) {
        $onOptionClick.invoke(DetailOptionType.STATUS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesOptionsSection$lambda$6$lambda$3$lambda$2(Function1 $onOptionClick) {
        $onOptionClick.invoke(DetailOptionType.IDENTIFIERS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesOptionsSection$lambda$6$lambda$5$lambda$4(Function1 $onOptionClick) {
        $onOptionClick.invoke(DetailOptionType.FIXED_TIMINGS);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x058f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0453 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0579  */
    /* renamed from: OptionCard-jB83MbM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m6997OptionCardjB83MbM(final java.lang.String r149, final java.lang.String r150, final androidx.compose.ui.graphics.vector.ImageVector r151, final long r152, final long r154, final java.lang.String r156, final kotlin.jvm.functions.Function0<kotlin.Unit> r157, androidx.compose.runtime.Composer r158, final int r159) {
        /*
            Method dump skipped, instructions count: 2263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeriesOptionsSectionKt.m6997OptionCardjB83MbM(java.lang.String, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, long, long, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}

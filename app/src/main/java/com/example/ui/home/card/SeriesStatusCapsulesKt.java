package com.example.ui.home.card;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.NotificationCompat;
import com.example.model.SeriesStatus;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: SeriesStatusCapsules.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001f\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a9\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001f"}, d2 = {"GreenContainer", "Landroidx/compose/ui/graphics/Color;", "J", "GreenBorder", "GreenText", "YellowContainer", "YellowBorder", "YellowText", "BlueContainer", "BlueBorder", "BlueText", "CapsuleShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "CapsuleHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SeriesStatusCapsules", "", NotificationCompat.CATEGORY_STATUS, "Lcom/example/model/SeriesStatus;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/model/SeriesStatus;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatusBadge", "text", "", "containerColor", "borderColor", "textColor", "StatusBadge-Jy8F4Js", "(Ljava/lang/String;JJJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SeriesStatusCapsulesKt {
    private static final long GreenContainer = ColorKt.Color(605075841);
    private static final long GreenBorder = ColorKt.Color(1494268289);
    private static final long GreenText = ColorKt.Color(4281652121L);
    private static final long YellowContainer = ColorKt.Color(653630987);
    private static final long YellowBorder = ColorKt.Color(1509269003);
    private static final long YellowText = ColorKt.Color(4294688548L);
    private static final long BlueContainer = ColorKt.Color(644048625);
    private static final long BlueBorder = ColorKt.Color(1499686641);
    private static final long BlueText = ColorKt.Color(4286680312L);
    private static final RoundedCornerShape CapsuleShape = RoundedCornerShapeKt.m953RoundedCornerShape0680j_4(Dp.m6622constructorimpl(6));
    private static final float CapsuleHeight = Dp.m6622constructorimpl(22);

    /* compiled from: SeriesStatusCapsules.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
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
    public static final Unit SeriesStatusCapsules$lambda$1(SeriesStatus seriesStatus, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeriesStatusCapsules(seriesStatus, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusBadge_Jy8F4Js$lambda$3(String str, long j, long j2, long j3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m7021StatusBadgeJy8F4Js(str, j, j2, j3, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x01a1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeriesStatusCapsules(final com.example.model.SeriesStatus r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.home.card.SeriesStatusCapsulesKt.SeriesStatusCapsules(com.example.model.SeriesStatus, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x02f4  */
    /* renamed from: StatusBadge-Jy8F4Js, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7021StatusBadgeJy8F4Js(final java.lang.String r61, final long r62, final long r64, final long r66, androidx.compose.ui.Modifier r68, androidx.compose.runtime.Composer r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.home.card.SeriesStatusCapsulesKt.m7021StatusBadgeJy8F4Js(java.lang.String, long, long, long, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

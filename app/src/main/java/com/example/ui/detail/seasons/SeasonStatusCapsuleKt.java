package com.example.ui.detail.seasons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.core.app.NotificationCompat;
import com.example.model.SeasonStatus;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: SeasonStatusCapsule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"SeasonStatusCapsule", "", NotificationCompat.CATEGORY_STATUS, "Lcom/example/model/SeasonStatus;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/model/SeasonStatus;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeasonStatusCapsuleKt {

    /* compiled from: SeasonStatusCapsule.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SeasonStatus.values().length];
            try {
                iArr[SeasonStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[SeasonStatus.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[SeasonStatus.NOT_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[SeasonStatus.NO_EPISODES.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonStatusCapsule$lambda$2(SeasonStatus seasonStatus, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeasonStatusCapsule(seasonStatus, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeasonStatusCapsule(final com.example.model.SeasonStatus r115, androidx.compose.ui.Modifier r116, androidx.compose.runtime.Composer r117, final int r118, final int r119) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.seasons.SeasonStatusCapsuleKt.SeasonStatusCapsule(com.example.model.SeasonStatus, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

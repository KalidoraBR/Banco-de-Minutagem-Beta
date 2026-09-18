package com.example.ui.detail;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.example.model.Season;
import com.example.model.SeasonStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: SeasonCard.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"SeasonCard", "", "season", "Lcom/example/model/Season;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/model/Season;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SeasonPoster", "posterShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "(Lcom/example/model/Season;Landroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SeasonCardKt {

    /* compiled from: SeasonCard.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonCard$lambda$8(Season season, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeasonCard(season, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonPoster$lambda$14(Season season, RoundedCornerShape roundedCornerShape, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeasonPoster(season, roundedCornerShape, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0bd0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0d88  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0e2e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0f7d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0f0e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c16  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0be4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0ab1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0880 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0348 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x08d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeasonCard(final com.example.model.Season r167, final kotlin.jvm.functions.Function0<kotlin.Unit> r168, androidx.compose.ui.Modifier r169, androidx.compose.runtime.Composer r170, final int r171, final int r172) {
        /*
            Method dump skipped, instructions count: 4008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeasonCardKt.SeasonCard(com.example.model.Season, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void SeasonPoster(final com.example.model.Season r98, final androidx.compose.foundation.shape.RoundedCornerShape r99, androidx.compose.ui.Modifier r100, androidx.compose.runtime.Composer r101, final int r102, final int r103) {
        /*
            Method dump skipped, instructions count: 2025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeasonCardKt.SeasonPoster(com.example.model.Season, androidx.compose.foundation.shape.RoundedCornerShape, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

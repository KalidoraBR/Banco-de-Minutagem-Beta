package com.example.ui.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.example.model.Series;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: SeriesHeaderSection.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"SeriesHeaderSection", "", "series", "Lcom/example/model/Series;", "onBack", "Lkotlin/Function0;", "onMoreOptions", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/model/Series;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SeriesHeaderSectionKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesHeaderSection$lambda$12(Series series, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeriesHeaderSection(series, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0d36  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0e2b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0ecf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x1138  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x10fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0e4a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x08ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x067f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeriesHeaderSection(final com.example.model.Series r188, final kotlin.jvm.functions.Function0<kotlin.Unit> r189, final kotlin.jvm.functions.Function0<kotlin.Unit> r190, androidx.compose.ui.Modifier r191, androidx.compose.runtime.Composer r192, final int r193, final int r194) {
        /*
            Method dump skipped, instructions count: 4437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeriesHeaderSectionKt.SeriesHeaderSection(com.example.model.Series, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

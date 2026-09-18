package com.example.ui.detail.seasons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.example.model.Season;
import com.example.model.Series;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: SeasonsSection.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a%\u0010\r\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"SeasonsSection", "", "series", "Lcom/example/model/Series;", "onSeasonClick", "Lkotlin/Function1;", "Lcom/example/model/Season;", "onSyncTmdbSeasons", "Lkotlin/Function0;", "onAddSeason", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/model/Series;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SeasonsEmptyState", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeasonsSectionKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonsEmptyState$lambda$16(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeasonsEmptyState(function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonsSection$lambda$12(Series series, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeasonsSection(series, function1, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0ccd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0421 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeasonsSection(final com.example.model.Series r146, final kotlin.jvm.functions.Function1<? super com.example.model.Season, kotlin.Unit> r147, final kotlin.jvm.functions.Function0<kotlin.Unit> r148, final kotlin.jvm.functions.Function0<kotlin.Unit> r149, androidx.compose.ui.Modifier r150, androidx.compose.runtime.Composer r151, final int r152, final int r153) {
        /*
            Method dump skipped, instructions count: 3370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.seasons.SeasonsSectionKt.SeasonsSection(com.example.model.Series, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonsSection$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7(Function1 $onSeasonClick, Season $season) {
        $onSeasonClick.invoke($season);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeasonsEmptyState(kotlin.jvm.functions.Function0<kotlin.Unit> r121, androidx.compose.ui.Modifier r122, androidx.compose.runtime.Composer r123, final int r124, final int r125) {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.seasons.SeasonsSectionKt.SeasonsEmptyState(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

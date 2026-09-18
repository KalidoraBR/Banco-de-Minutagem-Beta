package com.example.ui.season;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: SeasonFiltersRow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"SeasonFiltersRow", "", "selectedFilter", "Lcom/example/ui/season/EpisodeFilter;", "onFilterSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/season/EpisodeFilter;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SeasonFiltersRowKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonFiltersRow$lambda$5(EpisodeFilter episodeFilter, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeasonFiltersRow(episodeFilter, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeasonFiltersRow(final com.example.ui.season.EpisodeFilter r118, final kotlin.jvm.functions.Function1<? super com.example.ui.season.EpisodeFilter, kotlin.Unit> r119, androidx.compose.ui.Modifier r120, androidx.compose.runtime.Composer r121, final int r122, final int r123) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.SeasonFiltersRowKt.SeasonFiltersRow(com.example.ui.season.EpisodeFilter, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonFiltersRow$lambda$4$lambda$3$lambda$1$lambda$0(Function1 $onFilterSelected, EpisodeFilter $filter) {
        $onFilterSelected.invoke($filter);
        return Unit.INSTANCE;
    }
}

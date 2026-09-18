package com.example.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: FilterChipRow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"FilterChipRow", "", "selectedFilter", "Lcom/example/ui/components/SeriesFilter;", "onFilterSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/components/SeriesFilter;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterChipRowKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FilterChipRow$lambda$6(SeriesFilter seriesFilter, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FilterChipRow(seriesFilter, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0538  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FilterChipRow(final com.example.ui.components.SeriesFilter r122, final kotlin.jvm.functions.Function1<? super com.example.ui.components.SeriesFilter, kotlin.Unit> r123, androidx.compose.ui.Modifier r124, androidx.compose.runtime.Composer r125, final int r126, final int r127) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.FilterChipRowKt.FilterChipRow(com.example.ui.components.SeriesFilter, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FilterChipRow$lambda$5$lambda$4$lambda$2$lambda$1(Function1 $onFilterSelected, SeriesFilter $filter) {
        $onFilterSelected.invoke($filter);
        return Unit.INSTANCE;
    }
}

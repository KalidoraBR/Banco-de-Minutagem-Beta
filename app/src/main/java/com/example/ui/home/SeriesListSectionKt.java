package com.example.ui.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.example.model.Series;
import com.example.ui.components.SeriesFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: SeriesListSection.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ak\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a-\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u008a\u0084\u0002"}, d2 = {"SeriesListSection", "", "seriesList", "", "Lcom/example/model/Series;", "searchQuery", "", "selectedFilter", "Lcom/example/ui/components/SeriesFilter;", "onOpenSeries", "Lkotlin/Function1;", "onContinueSeries", "onResetFilters", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Ljava/lang/String;Lcom/example/ui/components/SeriesFilter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NoSearchResultsCard", "query", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "filteredSeries"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SeriesListSectionKt {

    /* compiled from: SeriesListSection.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SeriesFilter.values().length];
            try {
                iArr[SeriesFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[SeriesFilter.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[SeriesFilter.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[SeriesFilter.UPCOMING.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit NoSearchResultsCard$lambda$13(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NoSearchResultsCard(str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesListSection$lambda$7(List list, String str, SeriesFilter seriesFilter, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SeriesListSection(list, str, seriesFilter, function1, function12, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeriesListSection(final java.util.List<com.example.model.Series> r37, final java.lang.String r38, final com.example.ui.components.SeriesFilter r39, final kotlin.jvm.functions.Function1<? super com.example.model.Series, kotlin.Unit> r40, final kotlin.jvm.functions.Function1<? super com.example.model.Series, kotlin.Unit> r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, androidx.compose.ui.Modifier r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.home.SeriesListSectionKt.SeriesListSection(java.util.List, java.lang.String, com.example.ui.components.SeriesFilter, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List<Series> SeriesListSection$lambda$4(State<? extends List<Series>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List SeriesListSection$lambda$3$lambda$2(java.lang.String r17, java.util.List r18, com.example.ui.components.SeriesFilter r19) {
        /*
            r0 = r17
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = r18
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L2a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.example.model.Series r9 = (com.example.model.Series) r9
            r10 = 0
            int[] r11 = com.example.ui.home.SeriesListSectionKt.WhenMappings.$EnumSwitchMapping$0
            int r12 = r19.ordinal()
            r11 = r11[r12]
            r12 = 0
            switch(r11) {
                case 1: goto L79;
                case 2: goto L6d;
                case 3: goto L58;
                case 4: goto L4c;
                default: goto L44;
            }
        L44:
            r16 = r0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L4c:
            com.example.model.SeriesStatus r11 = r9.getStatus()
            com.example.model.SeriesStatus r14 = com.example.model.SeriesStatus.UPCOMING
            if (r11 != r14) goto L56
            r11 = 1
            goto L7a
        L56:
            r11 = r12
            goto L7a
        L58:
            com.example.model.SeriesStatus r11 = r9.getStatus()
            com.example.model.SeriesStatus r14 = com.example.model.SeriesStatus.COMPLETED_FULL
            if (r11 == r14) goto L6b
            com.example.model.SeriesStatus r11 = r9.getStatus()
            com.example.model.SeriesStatus r14 = com.example.model.SeriesStatus.COMPLETED_INCOMPLETE
            if (r11 != r14) goto L69
            goto L6b
        L69:
            r11 = r12
            goto L7a
        L6b:
            r11 = 1
            goto L7a
        L6d:
            com.example.model.SeriesStatus r11 = r9.getStatus()
            com.example.model.SeriesStatus r14 = com.example.model.SeriesStatus.IN_PROGRESS
            if (r11 != r14) goto L77
            r11 = 1
            goto L7a
        L77:
            r11 = r12
            goto L7a
        L79:
            r11 = 1
        L7a:
            r14 = r0
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            int r14 = r14.length()
            if (r14 != 0) goto L86
            r14 = 1
            goto L87
        L86:
            r14 = r12
        L87:
            if (r14 != 0) goto La8
            java.lang.String r14 = r9.getTitle()
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r15)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r1)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r15 = r0
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r13 = 2
            r16 = r0
            r0 = 0
            boolean r0 = kotlin.text.StringsKt.contains$default(r14, r15, r12, r13, r0)
            if (r0 == 0) goto La6
            goto Laa
        La6:
            r0 = r12
            goto Lab
        La8:
            r16 = r0
        Laa:
            r0 = 1
        Lab:
            if (r11 == 0) goto Lb0
            if (r0 == 0) goto Lb0
            r12 = 1
        Lb0:
            if (r12 == 0) goto Lb5
            r4.add(r8)
        Lb5:
            r0 = r16
            goto L2a
        Lb9:
            r16 = r0
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            com.example.ui.home.SeriesListSectionKt$SeriesListSection$lambda$3$lambda$2$$inlined$sortedByDescending$1 r2 = new com.example.ui.home.SeriesListSectionKt$SeriesListSection$lambda$3$lambda$2$$inlined$sortedByDescending$1
            r2.<init>()
            java.util.Comparator r2 = (java.util.Comparator) r2
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.home.SeriesListSectionKt.SeriesListSection$lambda$3$lambda$2(java.lang.String, java.util.List, com.example.ui.components.SeriesFilter):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0727 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void NoSearchResultsCard(final java.lang.String r130, final kotlin.jvm.functions.Function0<kotlin.Unit> r131, androidx.compose.ui.Modifier r132, androidx.compose.runtime.Composer r133, final int r134, final int r135) {
        /*
            Method dump skipped, instructions count: 2130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.home.SeriesListSectionKt.NoSearchResultsCard(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

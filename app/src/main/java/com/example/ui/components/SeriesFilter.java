package com.example.ui.components;

import com.example.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: FilterChipRow.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/example/ui/components/SeriesFilter;", "", "labelRes", "", "testTag", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getLabelRes", "()I", "getTestTag", "()Ljava/lang/String;", "ALL", "IN_PROGRESS", "COMPLETED", "UPCOMING", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum SeriesFilter {
    ALL(R.string.filter_all, "filter_all"),
    IN_PROGRESS(R.string.filter_in_progress, "filter_in_progress"),
    COMPLETED(R.string.filter_completed, "filter_completed"),
    UPCOMING(R.string.filter_upcoming, "filter_upcoming");

    private final int labelRes;
    private final String testTag;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<SeriesFilter> getEntries() {
        return $ENTRIES;
    }

    SeriesFilter(int labelRes, String testTag) {
        this.labelRes = labelRes;
        this.testTag = testTag;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final String getTestTag() {
        return this.testTag;
    }
}

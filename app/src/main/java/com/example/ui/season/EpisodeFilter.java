package com.example.ui.season;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: SeasonFiltersRow.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/example/ui/season/EpisodeFilter;", "", "label", "", "testTagId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getTestTagId", "ALL", "PENDING", "PARTIAL", "COMPLETED", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum EpisodeFilter {
    ALL("Todos", "filter_all"),
    PENDING("Pendentes", "filter_pending"),
    PARTIAL("Parciais", "filter_partial"),
    COMPLETED("Concluídos", "filter_completed");

    private final String label;
    private final String testTagId;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<EpisodeFilter> getEntries() {
        return $ENTRIES;
    }

    EpisodeFilter(String label, String testTagId) {
        this.label = label;
        this.testTagId = testTagId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getTestTagId() {
        return this.testTagId;
    }
}

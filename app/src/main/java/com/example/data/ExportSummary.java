package com.example.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExportManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/example/data/ExportSummary;", "", "seriesCount", "", "seasonsCount", "completedEpisodesCount", "pendingEpisodesCount", "format", "Lcom/example/data/ExportFormat;", "<init>", "(IIIILcom/example/data/ExportFormat;)V", "getSeriesCount", "()I", "getSeasonsCount", "getCompletedEpisodesCount", "getPendingEpisodesCount", "getFormat", "()Lcom/example/data/ExportFormat;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ExportSummary {
    public static final int $stable = 0;
    private final int completedEpisodesCount;
    private final ExportFormat format;
    private final int pendingEpisodesCount;
    private final int seasonsCount;
    private final int seriesCount;

    public static /* synthetic */ ExportSummary copy$default(ExportSummary exportSummary, int i, int i2, int i3, int i4, ExportFormat exportFormat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = exportSummary.seriesCount;
        }
        if ((i5 & 2) != 0) {
            i2 = exportSummary.seasonsCount;
        }
        if ((i5 & 4) != 0) {
            i3 = exportSummary.completedEpisodesCount;
        }
        if ((i5 & 8) != 0) {
            i4 = exportSummary.pendingEpisodesCount;
        }
        if ((i5 & 16) != 0) {
            exportFormat = exportSummary.format;
        }
        ExportFormat exportFormat2 = exportFormat;
        int i6 = i3;
        return exportSummary.copy(i, i2, i6, i4, exportFormat2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSeriesCount() {
        return this.seriesCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeasonsCount() {
        return this.seasonsCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCompletedEpisodesCount() {
        return this.completedEpisodesCount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPendingEpisodesCount() {
        return this.pendingEpisodesCount;
    }

    /* renamed from: component5, reason: from getter */
    public final ExportFormat getFormat() {
        return this.format;
    }

    public final ExportSummary copy(int seriesCount, int seasonsCount, int completedEpisodesCount, int pendingEpisodesCount, ExportFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return new ExportSummary(seriesCount, seasonsCount, completedEpisodesCount, pendingEpisodesCount, format);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExportSummary)) {
            return false;
        }
        ExportSummary exportSummary = (ExportSummary) other;
        return this.seriesCount == exportSummary.seriesCount && this.seasonsCount == exportSummary.seasonsCount && this.completedEpisodesCount == exportSummary.completedEpisodesCount && this.pendingEpisodesCount == exportSummary.pendingEpisodesCount && this.format == exportSummary.format;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.seriesCount) * 31) + Integer.hashCode(this.seasonsCount)) * 31) + Integer.hashCode(this.completedEpisodesCount)) * 31) + Integer.hashCode(this.pendingEpisodesCount)) * 31) + this.format.hashCode();
    }

    public String toString() {
        return "ExportSummary(seriesCount=" + this.seriesCount + ", seasonsCount=" + this.seasonsCount + ", completedEpisodesCount=" + this.completedEpisodesCount + ", pendingEpisodesCount=" + this.pendingEpisodesCount + ", format=" + this.format + ")";
    }

    public ExportSummary(int seriesCount, int seasonsCount, int completedEpisodesCount, int pendingEpisodesCount, ExportFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.seriesCount = seriesCount;
        this.seasonsCount = seasonsCount;
        this.completedEpisodesCount = completedEpisodesCount;
        this.pendingEpisodesCount = pendingEpisodesCount;
        this.format = format;
    }

    public final int getSeriesCount() {
        return this.seriesCount;
    }

    public final int getSeasonsCount() {
        return this.seasonsCount;
    }

    public final int getCompletedEpisodesCount() {
        return this.completedEpisodesCount;
    }

    public final int getPendingEpisodesCount() {
        return this.pendingEpisodesCount;
    }

    public final ExportFormat getFormat() {
        return this.format;
    }
}

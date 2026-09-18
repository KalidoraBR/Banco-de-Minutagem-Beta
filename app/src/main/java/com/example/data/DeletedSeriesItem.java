package com.example.data;

import com.example.model.Series;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrashStorage.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/example/data/DeletedSeriesItem;", "", "series", "Lcom/example/model/Series;", "deletedAtMillis", "", "formattedDate", "", "<init>", "(Lcom/example/model/Series;JLjava/lang/String;)V", "getSeries", "()Lcom/example/model/Series;", "getDeletedAtMillis", "()J", "getFormattedDate", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeletedSeriesItem {
    public static final int $stable = 8;
    private final long deletedAtMillis;
    private final String formattedDate;
    private final Series series;

    public static /* synthetic */ DeletedSeriesItem copy$default(DeletedSeriesItem deletedSeriesItem, Series series, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            series = deletedSeriesItem.series;
        }
        if ((i & 2) != 0) {
            j = deletedSeriesItem.deletedAtMillis;
        }
        if ((i & 4) != 0) {
            str = deletedSeriesItem.formattedDate;
        }
        return deletedSeriesItem.copy(series, j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Series getSeries() {
        return this.series;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDeletedAtMillis() {
        return this.deletedAtMillis;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormattedDate() {
        return this.formattedDate;
    }

    public final DeletedSeriesItem copy(Series series, long deletedAtMillis, String formattedDate) {
        Intrinsics.checkNotNullParameter(series, "series");
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        return new DeletedSeriesItem(series, deletedAtMillis, formattedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeletedSeriesItem)) {
            return false;
        }
        DeletedSeriesItem deletedSeriesItem = (DeletedSeriesItem) other;
        return Intrinsics.areEqual(this.series, deletedSeriesItem.series) && this.deletedAtMillis == deletedSeriesItem.deletedAtMillis && Intrinsics.areEqual(this.formattedDate, deletedSeriesItem.formattedDate);
    }

    public int hashCode() {
        return (((this.series.hashCode() * 31) + Long.hashCode(this.deletedAtMillis)) * 31) + this.formattedDate.hashCode();
    }

    public String toString() {
        return "DeletedSeriesItem(series=" + this.series + ", deletedAtMillis=" + this.deletedAtMillis + ", formattedDate=" + this.formattedDate + ")";
    }

    public DeletedSeriesItem(Series series, long deletedAtMillis, String formattedDate) {
        Intrinsics.checkNotNullParameter(series, "series");
        Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
        this.series = series;
        this.deletedAtMillis = deletedAtMillis;
        this.formattedDate = formattedDate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DeletedSeriesItem(com.example.model.Series r1, long r2, java.lang.String r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L8
            long r2 = java.lang.System.currentTimeMillis()
        L8:
            r5 = r5 & 4
            if (r5 == 0) goto L25
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "dd/MM/yyyy 'às' HH:mm"
            java.util.Locale r6 = java.util.Locale.getDefault()
            r4.<init>(r5, r6)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r2)
            java.lang.String r4 = r4.format(r5)
            java.lang.String r5 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
        L25:
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.DeletedSeriesItem.<init>(com.example.model.Series, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Series getSeries() {
        return this.series;
    }

    public final long getDeletedAtMillis() {
        return this.deletedAtMillis;
    }

    public final String getFormattedDate() {
        return this.formattedDate;
    }
}

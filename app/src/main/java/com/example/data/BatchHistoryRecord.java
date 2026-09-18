package com.example.data;

import com.example.model.Episode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchTimingHistoryStorage.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017¨\u0006$"}, d2 = {"Lcom/example/data/BatchHistoryRecord;", "", "id", "", "seasonId", "timestamp", "", "description", "previousEpisodes", "", "Lcom/example/model/Episode;", "isPendingSync", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Z)V", "getId", "()Ljava/lang/String;", "getSeasonId", "getTimestamp", "()J", "getDescription", "getPreviousEpisodes", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BatchHistoryRecord {
    public static final int $stable = 8;
    private final String description;
    private final String id;
    private final boolean isPendingSync;
    private final List<Episode> previousEpisodes;
    private final String seasonId;
    private final long timestamp;

    public static /* synthetic */ BatchHistoryRecord copy$default(BatchHistoryRecord batchHistoryRecord, String str, String str2, long j, String str3, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchHistoryRecord.id;
        }
        if ((i & 2) != 0) {
            str2 = batchHistoryRecord.seasonId;
        }
        if ((i & 4) != 0) {
            j = batchHistoryRecord.timestamp;
        }
        if ((i & 8) != 0) {
            str3 = batchHistoryRecord.description;
        }
        if ((i & 16) != 0) {
            list = batchHistoryRecord.previousEpisodes;
        }
        if ((i & 32) != 0) {
            z = batchHistoryRecord.isPendingSync;
        }
        boolean z2 = z;
        String str4 = str3;
        long j2 = j;
        return batchHistoryRecord.copy(str, str2, j2, str4, list, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSeasonId() {
        return this.seasonId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<Episode> component5() {
        return this.previousEpisodes;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPendingSync() {
        return this.isPendingSync;
    }

    public final BatchHistoryRecord copy(String id, String seasonId, long timestamp, String description, List<Episode> previousEpisodes, boolean isPendingSync) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(previousEpisodes, "previousEpisodes");
        return new BatchHistoryRecord(id, seasonId, timestamp, description, previousEpisodes, isPendingSync);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchHistoryRecord)) {
            return false;
        }
        BatchHistoryRecord batchHistoryRecord = (BatchHistoryRecord) other;
        return Intrinsics.areEqual(this.id, batchHistoryRecord.id) && Intrinsics.areEqual(this.seasonId, batchHistoryRecord.seasonId) && this.timestamp == batchHistoryRecord.timestamp && Intrinsics.areEqual(this.description, batchHistoryRecord.description) && Intrinsics.areEqual(this.previousEpisodes, batchHistoryRecord.previousEpisodes) && this.isPendingSync == batchHistoryRecord.isPendingSync;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.seasonId.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.description.hashCode()) * 31) + this.previousEpisodes.hashCode()) * 31) + Boolean.hashCode(this.isPendingSync);
    }

    public String toString() {
        return "BatchHistoryRecord(id=" + this.id + ", seasonId=" + this.seasonId + ", timestamp=" + this.timestamp + ", description=" + this.description + ", previousEpisodes=" + this.previousEpisodes + ", isPendingSync=" + this.isPendingSync + ")";
    }

    public BatchHistoryRecord(String id, String seasonId, long timestamp, String description, List<Episode> previousEpisodes, boolean isPendingSync) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(previousEpisodes, "previousEpisodes");
        this.id = id;
        this.seasonId = seasonId;
        this.timestamp = timestamp;
        this.description = description;
        this.previousEpisodes = previousEpisodes;
        this.isPendingSync = isPendingSync;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BatchHistoryRecord(java.lang.String r10, java.lang.String r11, long r12, java.lang.String r14, java.util.List r15, boolean r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 1
            if (r0 == 0) goto L13
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r2 = r10
            goto L14
        L13:
            r2 = r10
        L14:
            r10 = r17 & 4
            if (r10 == 0) goto L1e
            long r12 = java.lang.System.currentTimeMillis()
            r4 = r12
            goto L1f
        L1e:
            r4 = r12
        L1f:
            r10 = r17 & 32
            if (r10 == 0) goto L26
            r10 = 1
            r8 = r10
            goto L28
        L26:
            r8 = r16
        L28:
            r1 = r9
            r3 = r11
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.BatchHistoryRecord.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return this.id;
    }

    public final String getSeasonId() {
        return this.seasonId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<Episode> getPreviousEpisodes() {
        return this.previousEpisodes;
    }

    public final boolean isPendingSync() {
        return this.isPendingSync;
    }
}

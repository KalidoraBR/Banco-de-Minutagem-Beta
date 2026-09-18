package com.example.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoogleSheetsSyncService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/example/network/SyncOperationResult;", "", "success", "", "isOffline", "httpCode", "", "message", "", "rowsWritten", "tabsCount", "timestamp", "", "<init>", "(ZZLjava/lang/Integer;Ljava/lang/String;IIJ)V", "getSuccess", "()Z", "getHttpCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "getRowsWritten", "()I", "getTabsCount", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZZLjava/lang/Integer;Ljava/lang/String;IIJ)Lcom/example/network/SyncOperationResult;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SyncOperationResult {
    public static final int $stable = 0;
    private final Integer httpCode;
    private final boolean isOffline;
    private final String message;
    private final int rowsWritten;
    private final boolean success;
    private final int tabsCount;
    private final long timestamp;

    public static /* synthetic */ SyncOperationResult copy$default(SyncOperationResult syncOperationResult, boolean z, boolean z2, Integer num, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = syncOperationResult.success;
        }
        if ((i3 & 2) != 0) {
            z2 = syncOperationResult.isOffline;
        }
        if ((i3 & 4) != 0) {
            num = syncOperationResult.httpCode;
        }
        if ((i3 & 8) != 0) {
            str = syncOperationResult.message;
        }
        if ((i3 & 16) != 0) {
            i = syncOperationResult.rowsWritten;
        }
        if ((i3 & 32) != 0) {
            i2 = syncOperationResult.tabsCount;
        }
        if ((i3 & 64) != 0) {
            j = syncOperationResult.timestamp;
        }
        long j2 = j;
        int i4 = i;
        int i5 = i2;
        return syncOperationResult.copy(z, z2, num, str, i4, i5, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsOffline() {
        return this.isOffline;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getHttpCode() {
        return this.httpCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRowsWritten() {
        return this.rowsWritten;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTabsCount() {
        return this.tabsCount;
    }

    /* renamed from: component7, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final SyncOperationResult copy(boolean success, boolean isOffline, Integer httpCode, String message, int rowsWritten, int tabsCount, long timestamp) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new SyncOperationResult(success, isOffline, httpCode, message, rowsWritten, tabsCount, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncOperationResult)) {
            return false;
        }
        SyncOperationResult syncOperationResult = (SyncOperationResult) other;
        return this.success == syncOperationResult.success && this.isOffline == syncOperationResult.isOffline && Intrinsics.areEqual(this.httpCode, syncOperationResult.httpCode) && Intrinsics.areEqual(this.message, syncOperationResult.message) && this.rowsWritten == syncOperationResult.rowsWritten && this.tabsCount == syncOperationResult.tabsCount && this.timestamp == syncOperationResult.timestamp;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.isOffline)) * 31) + (this.httpCode == null ? 0 : this.httpCode.hashCode())) * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.rowsWritten)) * 31) + Integer.hashCode(this.tabsCount)) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "SyncOperationResult(success=" + this.success + ", isOffline=" + this.isOffline + ", httpCode=" + this.httpCode + ", message=" + this.message + ", rowsWritten=" + this.rowsWritten + ", tabsCount=" + this.tabsCount + ", timestamp=" + this.timestamp + ")";
    }

    public SyncOperationResult(boolean success, boolean isOffline, Integer httpCode, String message, int rowsWritten, int tabsCount, long timestamp) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.success = success;
        this.isOffline = isOffline;
        this.httpCode = httpCode;
        this.message = message;
        this.rowsWritten = rowsWritten;
        this.tabsCount = tabsCount;
        this.timestamp = timestamp;
    }

    public /* synthetic */ SyncOperationResult(boolean z, boolean z2, Integer num, String str, int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? null : num, str, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? System.currentTimeMillis() : j);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean isOffline() {
        return this.isOffline;
    }

    public final Integer getHttpCode() {
        return this.httpCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getRowsWritten() {
        return this.rowsWritten;
    }

    public final int getTabsCount() {
        return this.tabsCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}

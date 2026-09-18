package com.example.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoogleSheetsSyncService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0018JR\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/example/network/RemoteQueryResult;", "", "success", "", "isOffline", "message", "", "remoteTabs", "", "remoteSeriesCount", "", "lastModified", "", "<init>", "(ZZLjava/lang/String;Ljava/util/List;ILjava/lang/Long;)V", "getSuccess", "()Z", "getMessage", "()Ljava/lang/String;", "getRemoteTabs", "()Ljava/util/List;", "getRemoteSeriesCount", "()I", "getLastModified", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZLjava/lang/String;Ljava/util/List;ILjava/lang/Long;)Lcom/example/network/RemoteQueryResult;", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RemoteQueryResult {
    public static final int $stable = 8;
    private final boolean isOffline;
    private final Long lastModified;
    private final String message;
    private final int remoteSeriesCount;
    private final List<String> remoteTabs;
    private final boolean success;

    public static /* synthetic */ RemoteQueryResult copy$default(RemoteQueryResult remoteQueryResult, boolean z, boolean z2, String str, List list, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = remoteQueryResult.success;
        }
        if ((i2 & 2) != 0) {
            z2 = remoteQueryResult.isOffline;
        }
        if ((i2 & 4) != 0) {
            str = remoteQueryResult.message;
        }
        if ((i2 & 8) != 0) {
            list = remoteQueryResult.remoteTabs;
        }
        if ((i2 & 16) != 0) {
            i = remoteQueryResult.remoteSeriesCount;
        }
        if ((i2 & 32) != 0) {
            l = remoteQueryResult.lastModified;
        }
        int i3 = i;
        Long l2 = l;
        return remoteQueryResult.copy(z, z2, str, list, i3, l2);
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
    public final String getMessage() {
        return this.message;
    }

    public final List<String> component4() {
        return this.remoteTabs;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRemoteSeriesCount() {
        return this.remoteSeriesCount;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getLastModified() {
        return this.lastModified;
    }

    public final RemoteQueryResult copy(boolean success, boolean isOffline, String message, List<String> remoteTabs, int remoteSeriesCount, Long lastModified) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(remoteTabs, "remoteTabs");
        return new RemoteQueryResult(success, isOffline, message, remoteTabs, remoteSeriesCount, lastModified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteQueryResult)) {
            return false;
        }
        RemoteQueryResult remoteQueryResult = (RemoteQueryResult) other;
        return this.success == remoteQueryResult.success && this.isOffline == remoteQueryResult.isOffline && Intrinsics.areEqual(this.message, remoteQueryResult.message) && Intrinsics.areEqual(this.remoteTabs, remoteQueryResult.remoteTabs) && this.remoteSeriesCount == remoteQueryResult.remoteSeriesCount && Intrinsics.areEqual(this.lastModified, remoteQueryResult.lastModified);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.isOffline)) * 31) + this.message.hashCode()) * 31) + this.remoteTabs.hashCode()) * 31) + Integer.hashCode(this.remoteSeriesCount)) * 31) + (this.lastModified == null ? 0 : this.lastModified.hashCode());
    }

    public String toString() {
        return "RemoteQueryResult(success=" + this.success + ", isOffline=" + this.isOffline + ", message=" + this.message + ", remoteTabs=" + this.remoteTabs + ", remoteSeriesCount=" + this.remoteSeriesCount + ", lastModified=" + this.lastModified + ")";
    }

    public RemoteQueryResult(boolean success, boolean isOffline, String message, List<String> remoteTabs, int remoteSeriesCount, Long lastModified) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(remoteTabs, "remoteTabs");
        this.success = success;
        this.isOffline = isOffline;
        this.message = message;
        this.remoteTabs = remoteTabs;
        this.remoteSeriesCount = remoteSeriesCount;
        this.lastModified = lastModified;
    }

    public /* synthetic */ RemoteQueryResult(boolean z, boolean z2, String str, List list, int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? false : z2, str, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : l);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean isOffline() {
        return this.isOffline;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getRemoteTabs() {
        return this.remoteTabs;
    }

    public final int getRemoteSeriesCount() {
        return this.remoteSeriesCount;
    }

    public final Long getLastModified() {
        return this.lastModified;
    }
}

package com.example.ui.detail.modals;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdentifiersModal.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/example/ui/detail/modals/UpdatedIdentifiers;", "", "tmdbId", "", "imdbId", "tvdbId", "summary", "hasTmdb", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getTmdbId", "()Ljava/lang/String;", "getImdbId", "getTvdbId", "getSummary", "getHasTmdb", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatedIdentifiers {
    public static final int $stable = 0;
    private final boolean hasTmdb;
    private final String imdbId;
    private final String summary;
    private final String tmdbId;
    private final String tvdbId;

    public static /* synthetic */ UpdatedIdentifiers copy$default(UpdatedIdentifiers updatedIdentifiers, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updatedIdentifiers.tmdbId;
        }
        if ((i & 2) != 0) {
            str2 = updatedIdentifiers.imdbId;
        }
        if ((i & 4) != 0) {
            str3 = updatedIdentifiers.tvdbId;
        }
        if ((i & 8) != 0) {
            str4 = updatedIdentifiers.summary;
        }
        if ((i & 16) != 0) {
            z = updatedIdentifiers.hasTmdb;
        }
        boolean z2 = z;
        String str5 = str3;
        return updatedIdentifiers.copy(str, str2, str5, str4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTmdbId() {
        return this.tmdbId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImdbId() {
        return this.imdbId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTvdbId() {
        return this.tvdbId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasTmdb() {
        return this.hasTmdb;
    }

    public final UpdatedIdentifiers copy(String tmdbId, String imdbId, String tvdbId, String summary, boolean hasTmdb) {
        Intrinsics.checkNotNullParameter(tmdbId, "tmdbId");
        Intrinsics.checkNotNullParameter(imdbId, "imdbId");
        Intrinsics.checkNotNullParameter(tvdbId, "tvdbId");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new UpdatedIdentifiers(tmdbId, imdbId, tvdbId, summary, hasTmdb);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatedIdentifiers)) {
            return false;
        }
        UpdatedIdentifiers updatedIdentifiers = (UpdatedIdentifiers) other;
        return Intrinsics.areEqual(this.tmdbId, updatedIdentifiers.tmdbId) && Intrinsics.areEqual(this.imdbId, updatedIdentifiers.imdbId) && Intrinsics.areEqual(this.tvdbId, updatedIdentifiers.tvdbId) && Intrinsics.areEqual(this.summary, updatedIdentifiers.summary) && this.hasTmdb == updatedIdentifiers.hasTmdb;
    }

    public int hashCode() {
        return (((((((this.tmdbId.hashCode() * 31) + this.imdbId.hashCode()) * 31) + this.tvdbId.hashCode()) * 31) + this.summary.hashCode()) * 31) + Boolean.hashCode(this.hasTmdb);
    }

    public String toString() {
        return "UpdatedIdentifiers(tmdbId=" + this.tmdbId + ", imdbId=" + this.imdbId + ", tvdbId=" + this.tvdbId + ", summary=" + this.summary + ", hasTmdb=" + this.hasTmdb + ")";
    }

    public UpdatedIdentifiers(String tmdbId, String imdbId, String tvdbId, String summary, boolean hasTmdb) {
        Intrinsics.checkNotNullParameter(tmdbId, "tmdbId");
        Intrinsics.checkNotNullParameter(imdbId, "imdbId");
        Intrinsics.checkNotNullParameter(tvdbId, "tvdbId");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.tmdbId = tmdbId;
        this.imdbId = imdbId;
        this.tvdbId = tvdbId;
        this.summary = summary;
        this.hasTmdb = hasTmdb;
    }

    public final String getTmdbId() {
        return this.tmdbId;
    }

    public final String getImdbId() {
        return this.imdbId;
    }

    public final String getTvdbId() {
        return this.tvdbId;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final boolean getHasTmdb() {
        return this.hasTmdb;
    }
}

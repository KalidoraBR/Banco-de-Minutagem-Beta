package com.example.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/example/model/TmdbSeasonInfo;", "", "id", "", "seasonNumber", "name", "", "episodeCount", "posterPath", "<init>", "(IILjava/lang/String;ILjava/lang/String;)V", "getId", "()I", "getSeasonNumber", "getName", "()Ljava/lang/String;", "getEpisodeCount", "getPosterPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TmdbSeasonInfo {
    public static final int $stable = 0;
    private final int episodeCount;
    private final int id;
    private final String name;
    private final String posterPath;
    private final int seasonNumber;

    public static /* synthetic */ TmdbSeasonInfo copy$default(TmdbSeasonInfo tmdbSeasonInfo, int i, int i2, String str, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tmdbSeasonInfo.id;
        }
        if ((i4 & 2) != 0) {
            i2 = tmdbSeasonInfo.seasonNumber;
        }
        if ((i4 & 4) != 0) {
            str = tmdbSeasonInfo.name;
        }
        if ((i4 & 8) != 0) {
            i3 = tmdbSeasonInfo.episodeCount;
        }
        if ((i4 & 16) != 0) {
            str2 = tmdbSeasonInfo.posterPath;
        }
        String str3 = str2;
        String str4 = str;
        return tmdbSeasonInfo.copy(i, i2, str4, i3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeasonNumber() {
        return this.seasonNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEpisodeCount() {
        return this.episodeCount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPosterPath() {
        return this.posterPath;
    }

    public final TmdbSeasonInfo copy(int id, int seasonNumber, String name, int episodeCount, String posterPath) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new TmdbSeasonInfo(id, seasonNumber, name, episodeCount, posterPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TmdbSeasonInfo)) {
            return false;
        }
        TmdbSeasonInfo tmdbSeasonInfo = (TmdbSeasonInfo) other;
        return this.id == tmdbSeasonInfo.id && this.seasonNumber == tmdbSeasonInfo.seasonNumber && Intrinsics.areEqual(this.name, tmdbSeasonInfo.name) && this.episodeCount == tmdbSeasonInfo.episodeCount && Intrinsics.areEqual(this.posterPath, tmdbSeasonInfo.posterPath);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.seasonNumber)) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.episodeCount)) * 31) + (this.posterPath == null ? 0 : this.posterPath.hashCode());
    }

    public String toString() {
        return "TmdbSeasonInfo(id=" + this.id + ", seasonNumber=" + this.seasonNumber + ", name=" + this.name + ", episodeCount=" + this.episodeCount + ", posterPath=" + this.posterPath + ")";
    }

    public TmdbSeasonInfo(int id, int seasonNumber, String name, int episodeCount, String posterPath) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.seasonNumber = seasonNumber;
        this.name = name;
        this.episodeCount = episodeCount;
        this.posterPath = posterPath;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TmdbSeasonInfo(int r7, int r8, java.lang.String r9, int r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L7
            r11 = 0
            r5 = r11
            goto L8
        L7:
            r5 = r11
        L8:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.model.TmdbSeasonInfo.<init>(int, int, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getId() {
        return this.id;
    }

    public final int getSeasonNumber() {
        return this.seasonNumber;
    }

    public final String getName() {
        return this.name;
    }

    public final int getEpisodeCount() {
        return this.episodeCount;
    }

    public final String getPosterPath() {
        return this.posterPath;
    }
}

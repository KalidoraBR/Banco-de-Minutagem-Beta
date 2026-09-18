package com.example.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiConfig.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/example/model/TmdbEpisodeInfo;", "", "episodeNumber", "", "name", "", "airDate", "overview", "stillPath", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEpisodeNumber", "()I", "getName", "()Ljava/lang/String;", "getAirDate", "getOverview", "getStillPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TmdbEpisodeInfo {
    public static final int $stable = 0;
    private final String airDate;
    private final int episodeNumber;
    private final String name;
    private final String overview;
    private final String stillPath;

    public static /* synthetic */ TmdbEpisodeInfo copy$default(TmdbEpisodeInfo tmdbEpisodeInfo, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tmdbEpisodeInfo.episodeNumber;
        }
        if ((i2 & 2) != 0) {
            str = tmdbEpisodeInfo.name;
        }
        if ((i2 & 4) != 0) {
            str2 = tmdbEpisodeInfo.airDate;
        }
        if ((i2 & 8) != 0) {
            str3 = tmdbEpisodeInfo.overview;
        }
        if ((i2 & 16) != 0) {
            str4 = tmdbEpisodeInfo.stillPath;
        }
        String str5 = str4;
        String str6 = str2;
        return tmdbEpisodeInfo.copy(i, str, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAirDate() {
        return this.airDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOverview() {
        return this.overview;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStillPath() {
        return this.stillPath;
    }

    public final TmdbEpisodeInfo copy(int episodeNumber, String name, String airDate, String overview, String stillPath) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(airDate, "airDate");
        Intrinsics.checkNotNullParameter(overview, "overview");
        return new TmdbEpisodeInfo(episodeNumber, name, airDate, overview, stillPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TmdbEpisodeInfo)) {
            return false;
        }
        TmdbEpisodeInfo tmdbEpisodeInfo = (TmdbEpisodeInfo) other;
        return this.episodeNumber == tmdbEpisodeInfo.episodeNumber && Intrinsics.areEqual(this.name, tmdbEpisodeInfo.name) && Intrinsics.areEqual(this.airDate, tmdbEpisodeInfo.airDate) && Intrinsics.areEqual(this.overview, tmdbEpisodeInfo.overview) && Intrinsics.areEqual(this.stillPath, tmdbEpisodeInfo.stillPath);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.episodeNumber) * 31) + this.name.hashCode()) * 31) + this.airDate.hashCode()) * 31) + this.overview.hashCode()) * 31) + (this.stillPath == null ? 0 : this.stillPath.hashCode());
    }

    public String toString() {
        return "TmdbEpisodeInfo(episodeNumber=" + this.episodeNumber + ", name=" + this.name + ", airDate=" + this.airDate + ", overview=" + this.overview + ", stillPath=" + this.stillPath + ")";
    }

    public TmdbEpisodeInfo(int episodeNumber, String name, String airDate, String overview, String stillPath) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(airDate, "airDate");
        Intrinsics.checkNotNullParameter(overview, "overview");
        this.episodeNumber = episodeNumber;
        this.name = name;
        this.airDate = airDate;
        this.overview = overview;
        this.stillPath = stillPath;
    }

    public /* synthetic */ TmdbEpisodeInfo(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : str4);
    }

    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAirDate() {
        return this.airDate;
    }

    public final String getOverview() {
        return this.overview;
    }

    public final String getStillPath() {
        return this.stillPath;
    }
}

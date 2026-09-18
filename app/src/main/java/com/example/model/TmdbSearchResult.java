package com.example.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiConfig.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/example/model/TmdbSearchResult;", "", "id", "", "name", "", "originalName", "firstAirDate", "overview", "posterPath", "backdropPath", "voteAverage", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getOriginalName", "getFirstAirDate", "getOverview", "getPosterPath", "getBackdropPath", "getVoteAverage", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TmdbSearchResult {
    public static final int $stable = 0;
    private final String backdropPath;
    private final String firstAirDate;
    private final int id;
    private final String name;
    private final String originalName;
    private final String overview;
    private final String posterPath;
    private final double voteAverage;

    public static /* synthetic */ TmdbSearchResult copy$default(TmdbSearchResult tmdbSearchResult, int i, String str, String str2, String str3, String str4, String str5, String str6, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tmdbSearchResult.id;
        }
        if ((i2 & 2) != 0) {
            str = tmdbSearchResult.name;
        }
        if ((i2 & 4) != 0) {
            str2 = tmdbSearchResult.originalName;
        }
        if ((i2 & 8) != 0) {
            str3 = tmdbSearchResult.firstAirDate;
        }
        if ((i2 & 16) != 0) {
            str4 = tmdbSearchResult.overview;
        }
        if ((i2 & 32) != 0) {
            str5 = tmdbSearchResult.posterPath;
        }
        if ((i2 & 64) != 0) {
            str6 = tmdbSearchResult.backdropPath;
        }
        if ((i2 & 128) != 0) {
            d = tmdbSearchResult.voteAverage;
        }
        double d2 = d;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return tmdbSearchResult.copy(i, str, str10, str3, str9, str7, str8, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginalName() {
        return this.originalName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFirstAirDate() {
        return this.firstAirDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOverview() {
        return this.overview;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPosterPath() {
        return this.posterPath;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackdropPath() {
        return this.backdropPath;
    }

    /* renamed from: component8, reason: from getter */
    public final double getVoteAverage() {
        return this.voteAverage;
    }

    public final TmdbSearchResult copy(int id, String name, String originalName, String firstAirDate, String overview, String posterPath, String backdropPath, double voteAverage) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(originalName, "originalName");
        Intrinsics.checkNotNullParameter(firstAirDate, "firstAirDate");
        Intrinsics.checkNotNullParameter(overview, "overview");
        return new TmdbSearchResult(id, name, originalName, firstAirDate, overview, posterPath, backdropPath, voteAverage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TmdbSearchResult)) {
            return false;
        }
        TmdbSearchResult tmdbSearchResult = (TmdbSearchResult) other;
        return this.id == tmdbSearchResult.id && Intrinsics.areEqual(this.name, tmdbSearchResult.name) && Intrinsics.areEqual(this.originalName, tmdbSearchResult.originalName) && Intrinsics.areEqual(this.firstAirDate, tmdbSearchResult.firstAirDate) && Intrinsics.areEqual(this.overview, tmdbSearchResult.overview) && Intrinsics.areEqual(this.posterPath, tmdbSearchResult.posterPath) && Intrinsics.areEqual(this.backdropPath, tmdbSearchResult.backdropPath) && Double.compare(this.voteAverage, tmdbSearchResult.voteAverage) == 0;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.originalName.hashCode()) * 31) + this.firstAirDate.hashCode()) * 31) + this.overview.hashCode()) * 31) + (this.posterPath == null ? 0 : this.posterPath.hashCode())) * 31) + (this.backdropPath != null ? this.backdropPath.hashCode() : 0)) * 31) + Double.hashCode(this.voteAverage);
    }

    public String toString() {
        return "TmdbSearchResult(id=" + this.id + ", name=" + this.name + ", originalName=" + this.originalName + ", firstAirDate=" + this.firstAirDate + ", overview=" + this.overview + ", posterPath=" + this.posterPath + ", backdropPath=" + this.backdropPath + ", voteAverage=" + this.voteAverage + ")";
    }

    public TmdbSearchResult(int id, String name, String originalName, String firstAirDate, String overview, String posterPath, String backdropPath, double voteAverage) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(originalName, "originalName");
        Intrinsics.checkNotNullParameter(firstAirDate, "firstAirDate");
        Intrinsics.checkNotNullParameter(overview, "overview");
        this.id = id;
        this.name = name;
        this.originalName = originalName;
        this.firstAirDate = firstAirDate;
        this.overview = overview;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
        this.voteAverage = voteAverage;
    }

    public /* synthetic */ TmdbSearchResult(int i, String str, String str2, String str3, String str4, String str5, String str6, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? 0.0d : d);
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginalName() {
        return this.originalName;
    }

    public final String getFirstAirDate() {
        return this.firstAirDate;
    }

    public final String getOverview() {
        return this.overview;
    }

    public final String getPosterPath() {
        return this.posterPath;
    }

    public final String getBackdropPath() {
        return this.backdropPath;
    }

    public final double getVoteAverage() {
        return this.voteAverage;
    }
}

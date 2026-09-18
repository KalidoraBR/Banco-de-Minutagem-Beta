package com.example.model;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiConfig.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0003J\u0091\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 ¨\u00065"}, d2 = {"Lcom/example/model/TmdbSeriesDetails;", "", "id", "", "name", "", "originalName", "firstAirDate", "overview", "posterPath", "backdropPath", "numberOfSeasons", "numberOfEpisodes", "genres", "", NotificationCompat.CATEGORY_STATUS, "seasons", "Lcom/example/model/TmdbSeasonInfo;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getOriginalName", "getFirstAirDate", "getOverview", "getPosterPath", "getBackdropPath", "getNumberOfSeasons", "getNumberOfEpisodes", "getGenres", "()Ljava/util/List;", "getStatus", "getSeasons", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TmdbSeriesDetails {
    public static final int $stable = 8;
    private final String backdropPath;
    private final String firstAirDate;
    private final List<String> genres;
    private final int id;
    private final String name;
    private final int numberOfEpisodes;
    private final int numberOfSeasons;
    private final String originalName;
    private final String overview;
    private final String posterPath;
    private final List<TmdbSeasonInfo> seasons;
    private final String status;

    public static /* synthetic */ TmdbSeriesDetails copy$default(TmdbSeriesDetails tmdbSeriesDetails, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, List list, String str7, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tmdbSeriesDetails.id;
        }
        if ((i4 & 2) != 0) {
            str = tmdbSeriesDetails.name;
        }
        if ((i4 & 4) != 0) {
            str2 = tmdbSeriesDetails.originalName;
        }
        if ((i4 & 8) != 0) {
            str3 = tmdbSeriesDetails.firstAirDate;
        }
        if ((i4 & 16) != 0) {
            str4 = tmdbSeriesDetails.overview;
        }
        if ((i4 & 32) != 0) {
            str5 = tmdbSeriesDetails.posterPath;
        }
        if ((i4 & 64) != 0) {
            str6 = tmdbSeriesDetails.backdropPath;
        }
        if ((i4 & 128) != 0) {
            i2 = tmdbSeriesDetails.numberOfSeasons;
        }
        if ((i4 & 256) != 0) {
            i3 = tmdbSeriesDetails.numberOfEpisodes;
        }
        if ((i4 & 512) != 0) {
            list = tmdbSeriesDetails.genres;
        }
        if ((i4 & 1024) != 0) {
            str7 = tmdbSeriesDetails.status;
        }
        if ((i4 & 2048) != 0) {
            list2 = tmdbSeriesDetails.seasons;
        }
        String str8 = str7;
        List list3 = list2;
        int i5 = i3;
        List list4 = list;
        String str9 = str6;
        int i6 = i2;
        String str10 = str4;
        String str11 = str5;
        return tmdbSeriesDetails.copy(i, str, str2, str3, str10, str11, str9, i6, i5, list4, str8, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.genres;
    }

    /* renamed from: component11, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final List<TmdbSeasonInfo> component12() {
        return this.seasons;
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
    public final int getNumberOfSeasons() {
        return this.numberOfSeasons;
    }

    /* renamed from: component9, reason: from getter */
    public final int getNumberOfEpisodes() {
        return this.numberOfEpisodes;
    }

    public final TmdbSeriesDetails copy(int id, String name, String originalName, String firstAirDate, String overview, String posterPath, String backdropPath, int numberOfSeasons, int numberOfEpisodes, List<String> genres, String status, List<TmdbSeasonInfo> seasons) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(originalName, "originalName");
        Intrinsics.checkNotNullParameter(firstAirDate, "firstAirDate");
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(genres, "genres");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(seasons, "seasons");
        return new TmdbSeriesDetails(id, name, originalName, firstAirDate, overview, posterPath, backdropPath, numberOfSeasons, numberOfEpisodes, genres, status, seasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TmdbSeriesDetails)) {
            return false;
        }
        TmdbSeriesDetails tmdbSeriesDetails = (TmdbSeriesDetails) other;
        return this.id == tmdbSeriesDetails.id && Intrinsics.areEqual(this.name, tmdbSeriesDetails.name) && Intrinsics.areEqual(this.originalName, tmdbSeriesDetails.originalName) && Intrinsics.areEqual(this.firstAirDate, tmdbSeriesDetails.firstAirDate) && Intrinsics.areEqual(this.overview, tmdbSeriesDetails.overview) && Intrinsics.areEqual(this.posterPath, tmdbSeriesDetails.posterPath) && Intrinsics.areEqual(this.backdropPath, tmdbSeriesDetails.backdropPath) && this.numberOfSeasons == tmdbSeriesDetails.numberOfSeasons && this.numberOfEpisodes == tmdbSeriesDetails.numberOfEpisodes && Intrinsics.areEqual(this.genres, tmdbSeriesDetails.genres) && Intrinsics.areEqual(this.status, tmdbSeriesDetails.status) && Intrinsics.areEqual(this.seasons, tmdbSeriesDetails.seasons);
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.originalName.hashCode()) * 31) + this.firstAirDate.hashCode()) * 31) + this.overview.hashCode()) * 31) + (this.posterPath == null ? 0 : this.posterPath.hashCode())) * 31) + (this.backdropPath != null ? this.backdropPath.hashCode() : 0)) * 31) + Integer.hashCode(this.numberOfSeasons)) * 31) + Integer.hashCode(this.numberOfEpisodes)) * 31) + this.genres.hashCode()) * 31) + this.status.hashCode()) * 31) + this.seasons.hashCode();
    }

    public String toString() {
        return "TmdbSeriesDetails(id=" + this.id + ", name=" + this.name + ", originalName=" + this.originalName + ", firstAirDate=" + this.firstAirDate + ", overview=" + this.overview + ", posterPath=" + this.posterPath + ", backdropPath=" + this.backdropPath + ", numberOfSeasons=" + this.numberOfSeasons + ", numberOfEpisodes=" + this.numberOfEpisodes + ", genres=" + this.genres + ", status=" + this.status + ", seasons=" + this.seasons + ")";
    }

    public TmdbSeriesDetails(int id, String name, String originalName, String firstAirDate, String overview, String posterPath, String backdropPath, int numberOfSeasons, int numberOfEpisodes, List<String> genres, String status, List<TmdbSeasonInfo> seasons) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(originalName, "originalName");
        Intrinsics.checkNotNullParameter(firstAirDate, "firstAirDate");
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(genres, "genres");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(seasons, "seasons");
        this.id = id;
        this.name = name;
        this.originalName = originalName;
        this.firstAirDate = firstAirDate;
        this.overview = overview;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genres = genres;
        this.status = status;
        this.seasons = seasons;
    }

    public /* synthetic */ TmdbSeriesDetails(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, List list, String str7, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? null : str6, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? 0 : i3, (i4 & 512) != 0 ? CollectionsKt.emptyList() : list, (i4 & 1024) != 0 ? "" : str7, (i4 & 2048) != 0 ? CollectionsKt.emptyList() : list2);
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

    public final int getNumberOfSeasons() {
        return this.numberOfSeasons;
    }

    public final int getNumberOfEpisodes() {
        return this.numberOfEpisodes;
    }

    public final List<String> getGenres() {
        return this.genres;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<TmdbSeasonInfo> getSeasons() {
        return this.seasons;
    }
}

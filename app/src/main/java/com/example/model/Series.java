package com.example.model;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Series.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\rHÆ\u0003J\t\u0010M\u001a\u00020\rHÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0015HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020 HÆ\u0003Jû\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020 HÆ\u0001J\u0013\u0010[\u001a\u00020\u00152\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\u0006HÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010$R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bB\u0010'¨\u0006_"}, d2 = {"Lcom/example/model/Series;", "", "id", "", "title", "releaseYear", "", NotificationCompat.CATEGORY_STATUS, "Lcom/example/model/SeriesStatus;", "totalEpisodes", "completedEpisodes", "nextEpisodeToFill", "lastModifiedTimestamp", "", "categoryBadge", "primaryColorHex", "secondaryColorHex", "synopsis", "posterUrl", "backdropUrl", "hasTmdb", "", "identifiersSummary", "fixedTimingsActiveCount", "fixedTimingsTotalCount", "seasons", "", "Lcom/example/model/Season;", "tmdbId", "imdbId", "tvdbId", "fixedTimings", "Lcom/example/model/FixedTimingsConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/example/model/SeriesStatus;IILjava/lang/String;JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/model/FixedTimingsConfig;)V", "getId", "()Ljava/lang/String;", "getTitle", "getReleaseYear", "()I", "getStatus", "()Lcom/example/model/SeriesStatus;", "getTotalEpisodes", "getCompletedEpisodes", "getNextEpisodeToFill", "getLastModifiedTimestamp", "()J", "getCategoryBadge", "getPrimaryColorHex", "getSecondaryColorHex", "getSynopsis", "getPosterUrl", "getBackdropUrl", "getHasTmdb", "()Z", "getIdentifiersSummary", "getFixedTimingsActiveCount", "getFixedTimingsTotalCount", "getSeasons", "()Ljava/util/List;", "getTmdbId", "getImdbId", "getTvdbId", "getFixedTimings", "()Lcom/example/model/FixedTimingsConfig;", "progressPercentage", "getProgressPercentage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Series {
    public static final int $stable = 8;
    private final String backdropUrl;
    private final String categoryBadge;
    private final int completedEpisodes;
    private final FixedTimingsConfig fixedTimings;
    private final int fixedTimingsActiveCount;
    private final int fixedTimingsTotalCount;
    private final boolean hasTmdb;
    private final String id;
    private final String identifiersSummary;
    private final String imdbId;
    private final long lastModifiedTimestamp;
    private final String nextEpisodeToFill;
    private final String posterUrl;
    private final long primaryColorHex;
    private final int releaseYear;
    private final List<Season> seasons;
    private final long secondaryColorHex;
    private final SeriesStatus status;
    private final String synopsis;
    private final String title;
    private final String tmdbId;
    private final int totalEpisodes;
    private final String tvdbId;

    public static /* synthetic */ Series copy$default(Series series, String str, String str2, int i, SeriesStatus seriesStatus, int i2, int i3, String str3, long j, String str4, long j2, long j3, String str5, String str6, String str7, boolean z, String str8, int i4, int i5, List list, String str9, String str10, String str11, FixedTimingsConfig fixedTimingsConfig, int i6, Object obj) {
        FixedTimingsConfig fixedTimingsConfig2;
        String str12;
        String str13 = (i6 & 1) != 0 ? series.id : str;
        String str14 = (i6 & 2) != 0 ? series.title : str2;
        int i7 = (i6 & 4) != 0 ? series.releaseYear : i;
        SeriesStatus seriesStatus2 = (i6 & 8) != 0 ? series.status : seriesStatus;
        int i8 = (i6 & 16) != 0 ? series.totalEpisodes : i2;
        int i9 = (i6 & 32) != 0 ? series.completedEpisodes : i3;
        String str15 = (i6 & 64) != 0 ? series.nextEpisodeToFill : str3;
        long j4 = (i6 & 128) != 0 ? series.lastModifiedTimestamp : j;
        String str16 = (i6 & 256) != 0 ? series.categoryBadge : str4;
        long j5 = (i6 & 512) != 0 ? series.primaryColorHex : j2;
        long j6 = (i6 & 1024) != 0 ? series.secondaryColorHex : j3;
        String str17 = str13;
        String str18 = (i6 & 2048) != 0 ? series.synopsis : str5;
        String str19 = (i6 & 4096) != 0 ? series.posterUrl : str6;
        String str20 = (i6 & 8192) != 0 ? series.backdropUrl : str7;
        boolean z2 = (i6 & 16384) != 0 ? series.hasTmdb : z;
        String str21 = (i6 & 32768) != 0 ? series.identifiersSummary : str8;
        int i10 = (i6 & 65536) != 0 ? series.fixedTimingsActiveCount : i4;
        int i11 = (i6 & 131072) != 0 ? series.fixedTimingsTotalCount : i5;
        List list2 = (i6 & 262144) != 0 ? series.seasons : list;
        String str22 = (i6 & 524288) != 0 ? series.tmdbId : str9;
        String str23 = (i6 & 1048576) != 0 ? series.imdbId : str10;
        String str24 = (i6 & 2097152) != 0 ? series.tvdbId : str11;
        if ((i6 & 4194304) != 0) {
            str12 = str24;
            fixedTimingsConfig2 = series.fixedTimings;
        } else {
            fixedTimingsConfig2 = fixedTimingsConfig;
            str12 = str24;
        }
        return series.copy(str17, str14, i7, seriesStatus2, i8, i9, str15, j4, str16, j5, j6, str18, str19, str20, z2, str21, i10, i11, list2, str22, str23, str12, fixedTimingsConfig2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getPrimaryColorHex() {
        return this.primaryColorHex;
    }

    /* renamed from: component11, reason: from getter */
    public final long getSecondaryColorHex() {
        return this.secondaryColorHex;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSynopsis() {
        return this.synopsis;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPosterUrl() {
        return this.posterUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final String getBackdropUrl() {
        return this.backdropUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getHasTmdb() {
        return this.hasTmdb;
    }

    /* renamed from: component16, reason: from getter */
    public final String getIdentifiersSummary() {
        return this.identifiersSummary;
    }

    /* renamed from: component17, reason: from getter */
    public final int getFixedTimingsActiveCount() {
        return this.fixedTimingsActiveCount;
    }

    /* renamed from: component18, reason: from getter */
    public final int getFixedTimingsTotalCount() {
        return this.fixedTimingsTotalCount;
    }

    public final List<Season> component19() {
        return this.seasons;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component20, reason: from getter */
    public final String getTmdbId() {
        return this.tmdbId;
    }

    /* renamed from: component21, reason: from getter */
    public final String getImdbId() {
        return this.imdbId;
    }

    /* renamed from: component22, reason: from getter */
    public final String getTvdbId() {
        return this.tvdbId;
    }

    /* renamed from: component23, reason: from getter */
    public final FixedTimingsConfig getFixedTimings() {
        return this.fixedTimings;
    }

    /* renamed from: component3, reason: from getter */
    public final int getReleaseYear() {
        return this.releaseYear;
    }

    /* renamed from: component4, reason: from getter */
    public final SeriesStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalEpisodes() {
        return this.totalEpisodes;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCompletedEpisodes() {
        return this.completedEpisodes;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNextEpisodeToFill() {
        return this.nextEpisodeToFill;
    }

    /* renamed from: component8, reason: from getter */
    public final long getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCategoryBadge() {
        return this.categoryBadge;
    }

    public final Series copy(String id, String title, int releaseYear, SeriesStatus status, int totalEpisodes, int completedEpisodes, String nextEpisodeToFill, long lastModifiedTimestamp, String categoryBadge, long primaryColorHex, long secondaryColorHex, String synopsis, String posterUrl, String backdropUrl, boolean hasTmdb, String identifiersSummary, int fixedTimingsActiveCount, int fixedTimingsTotalCount, List<Season> seasons, String tmdbId, String imdbId, String tvdbId, FixedTimingsConfig fixedTimings) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(categoryBadge, "categoryBadge");
        Intrinsics.checkNotNullParameter(synopsis, "synopsis");
        Intrinsics.checkNotNullParameter(identifiersSummary, "identifiersSummary");
        Intrinsics.checkNotNullParameter(seasons, "seasons");
        Intrinsics.checkNotNullParameter(tmdbId, "tmdbId");
        Intrinsics.checkNotNullParameter(imdbId, "imdbId");
        Intrinsics.checkNotNullParameter(tvdbId, "tvdbId");
        Intrinsics.checkNotNullParameter(fixedTimings, "fixedTimings");
        return new Series(id, title, releaseYear, status, totalEpisodes, completedEpisodes, nextEpisodeToFill, lastModifiedTimestamp, categoryBadge, primaryColorHex, secondaryColorHex, synopsis, posterUrl, backdropUrl, hasTmdb, identifiersSummary, fixedTimingsActiveCount, fixedTimingsTotalCount, seasons, tmdbId, imdbId, tvdbId, fixedTimings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Series)) {
            return false;
        }
        Series series = (Series) other;
        return Intrinsics.areEqual(this.id, series.id) && Intrinsics.areEqual(this.title, series.title) && this.releaseYear == series.releaseYear && this.status == series.status && this.totalEpisodes == series.totalEpisodes && this.completedEpisodes == series.completedEpisodes && Intrinsics.areEqual(this.nextEpisodeToFill, series.nextEpisodeToFill) && this.lastModifiedTimestamp == series.lastModifiedTimestamp && Intrinsics.areEqual(this.categoryBadge, series.categoryBadge) && this.primaryColorHex == series.primaryColorHex && this.secondaryColorHex == series.secondaryColorHex && Intrinsics.areEqual(this.synopsis, series.synopsis) && Intrinsics.areEqual(this.posterUrl, series.posterUrl) && Intrinsics.areEqual(this.backdropUrl, series.backdropUrl) && this.hasTmdb == series.hasTmdb && Intrinsics.areEqual(this.identifiersSummary, series.identifiersSummary) && this.fixedTimingsActiveCount == series.fixedTimingsActiveCount && this.fixedTimingsTotalCount == series.fixedTimingsTotalCount && Intrinsics.areEqual(this.seasons, series.seasons) && Intrinsics.areEqual(this.tmdbId, series.tmdbId) && Intrinsics.areEqual(this.imdbId, series.imdbId) && Intrinsics.areEqual(this.tvdbId, series.tvdbId) && Intrinsics.areEqual(this.fixedTimings, series.fixedTimings);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.releaseYear)) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.totalEpisodes)) * 31) + Integer.hashCode(this.completedEpisodes)) * 31) + (this.nextEpisodeToFill == null ? 0 : this.nextEpisodeToFill.hashCode())) * 31) + Long.hashCode(this.lastModifiedTimestamp)) * 31) + this.categoryBadge.hashCode()) * 31) + Long.hashCode(this.primaryColorHex)) * 31) + Long.hashCode(this.secondaryColorHex)) * 31) + this.synopsis.hashCode()) * 31) + (this.posterUrl == null ? 0 : this.posterUrl.hashCode())) * 31) + (this.backdropUrl != null ? this.backdropUrl.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasTmdb)) * 31) + this.identifiersSummary.hashCode()) * 31) + Integer.hashCode(this.fixedTimingsActiveCount)) * 31) + Integer.hashCode(this.fixedTimingsTotalCount)) * 31) + this.seasons.hashCode()) * 31) + this.tmdbId.hashCode()) * 31) + this.imdbId.hashCode()) * 31) + this.tvdbId.hashCode()) * 31) + this.fixedTimings.hashCode();
    }

    public String toString() {
        return "Series(id=" + this.id + ", title=" + this.title + ", releaseYear=" + this.releaseYear + ", status=" + this.status + ", totalEpisodes=" + this.totalEpisodes + ", completedEpisodes=" + this.completedEpisodes + ", nextEpisodeToFill=" + this.nextEpisodeToFill + ", lastModifiedTimestamp=" + this.lastModifiedTimestamp + ", categoryBadge=" + this.categoryBadge + ", primaryColorHex=" + this.primaryColorHex + ", secondaryColorHex=" + this.secondaryColorHex + ", synopsis=" + this.synopsis + ", posterUrl=" + this.posterUrl + ", backdropUrl=" + this.backdropUrl + ", hasTmdb=" + this.hasTmdb + ", identifiersSummary=" + this.identifiersSummary + ", fixedTimingsActiveCount=" + this.fixedTimingsActiveCount + ", fixedTimingsTotalCount=" + this.fixedTimingsTotalCount + ", seasons=" + this.seasons + ", tmdbId=" + this.tmdbId + ", imdbId=" + this.imdbId + ", tvdbId=" + this.tvdbId + ", fixedTimings=" + this.fixedTimings + ")";
    }

    public Series(String id, String title, int releaseYear, SeriesStatus status, int totalEpisodes, int completedEpisodes, String nextEpisodeToFill, long lastModifiedTimestamp, String categoryBadge, long primaryColorHex, long secondaryColorHex, String synopsis, String posterUrl, String backdropUrl, boolean hasTmdb, String identifiersSummary, int fixedTimingsActiveCount, int fixedTimingsTotalCount, List<Season> seasons, String tmdbId, String imdbId, String tvdbId, FixedTimingsConfig fixedTimings) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(categoryBadge, "categoryBadge");
        Intrinsics.checkNotNullParameter(synopsis, "synopsis");
        Intrinsics.checkNotNullParameter(identifiersSummary, "identifiersSummary");
        Intrinsics.checkNotNullParameter(seasons, "seasons");
        Intrinsics.checkNotNullParameter(tmdbId, "tmdbId");
        Intrinsics.checkNotNullParameter(imdbId, "imdbId");
        Intrinsics.checkNotNullParameter(tvdbId, "tvdbId");
        Intrinsics.checkNotNullParameter(fixedTimings, "fixedTimings");
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.status = status;
        this.totalEpisodes = totalEpisodes;
        this.completedEpisodes = completedEpisodes;
        this.nextEpisodeToFill = nextEpisodeToFill;
        this.lastModifiedTimestamp = lastModifiedTimestamp;
        this.categoryBadge = categoryBadge;
        this.primaryColorHex = primaryColorHex;
        this.secondaryColorHex = secondaryColorHex;
        this.synopsis = synopsis;
        this.posterUrl = posterUrl;
        this.backdropUrl = backdropUrl;
        this.hasTmdb = hasTmdb;
        this.identifiersSummary = identifiersSummary;
        this.fixedTimingsActiveCount = fixedTimingsActiveCount;
        this.fixedTimingsTotalCount = fixedTimingsTotalCount;
        this.seasons = seasons;
        this.tmdbId = tmdbId;
        this.imdbId = imdbId;
        this.tvdbId = tvdbId;
        this.fixedTimings = fixedTimings;
    }

    public /* synthetic */ Series(String str, String str2, int i, SeriesStatus seriesStatus, int i2, int i3, String str3, long j, String str4, long j2, long j3, String str5, String str6, String str7, boolean z, String str8, int i4, int i5, List list, String str9, String str10, String str11, FixedTimingsConfig fixedTimingsConfig, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, seriesStatus, i2, i3, (i6 & 64) != 0 ? null : str3, (i6 & 128) != 0 ? System.currentTimeMillis() : j, (i6 & 256) != 0 ? "Tokusatsu / Ação" : str4, (i6 & 512) != 0 ? 4286331629L : j2, (i6 & 1024) != 0 ? 4280640491L : j3, (i6 & 2048) != 0 ? "" : str5, (i6 & 4096) != 0 ? null : str6, (i6 & 8192) != 0 ? null : str7, (i6 & 16384) != 0 ? true : z, (32768 & i6) != 0 ? "TMDB · IMDb · TVDB" : str8, (65536 & i6) != 0 ? 0 : i4, (131072 & i6) != 0 ? 3 : i5, (262144 & i6) != 0 ? CollectionsKt.emptyList() : list, (524288 & i6) != 0 ? "" : str9, (1048576 & i6) != 0 ? "" : str10, (2097152 & i6) != 0 ? "" : str11, (i6 & 4194304) != 0 ? new FixedTimingsConfig(null, null, null, 7, null) : fixedTimingsConfig);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getReleaseYear() {
        return this.releaseYear;
    }

    public final SeriesStatus getStatus() {
        return this.status;
    }

    public final int getTotalEpisodes() {
        return this.totalEpisodes;
    }

    public final int getCompletedEpisodes() {
        return this.completedEpisodes;
    }

    public final String getNextEpisodeToFill() {
        return this.nextEpisodeToFill;
    }

    public final long getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    public final String getCategoryBadge() {
        return this.categoryBadge;
    }

    public final long getPrimaryColorHex() {
        return this.primaryColorHex;
    }

    public final long getSecondaryColorHex() {
        return this.secondaryColorHex;
    }

    public final String getSynopsis() {
        return this.synopsis;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final String getBackdropUrl() {
        return this.backdropUrl;
    }

    public final boolean getHasTmdb() {
        return this.hasTmdb;
    }

    public final String getIdentifiersSummary() {
        return this.identifiersSummary;
    }

    public final int getFixedTimingsActiveCount() {
        return this.fixedTimingsActiveCount;
    }

    public final int getFixedTimingsTotalCount() {
        return this.fixedTimingsTotalCount;
    }

    public final List<Season> getSeasons() {
        return this.seasons;
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

    public final FixedTimingsConfig getFixedTimings() {
        return this.fixedTimings;
    }

    public final int getProgressPercentage() {
        if (this.totalEpisodes > 0) {
            return (int) ((this.completedEpisodes / this.totalEpisodes) * 100.0d);
        }
        return 0;
    }
}

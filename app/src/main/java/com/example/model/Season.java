package com.example.model;

import androidx.core.app.NotificationCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: Series.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003Ju\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001J\u0013\u00108\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0006HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0011\u0010%\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006<"}, d2 = {"Lcom/example/model/Season;", "", "id", "", "title", "seasonNumber", "", "totalEpisodes", "completedEpisodes", "noTimingEpisodesCount", "hasTmdb", "", "posterColorHex", "", "posterUrl", "episodes", "", "Lcom/example/model/Episode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIIZJLjava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSeasonNumber", "()I", "getTotalEpisodes", "getCompletedEpisodes", "getNoTimingEpisodesCount", "getHasTmdb", "()Z", "getPosterColorHex", "()J", "getPosterUrl", "getEpisodes", "()Ljava/util/List;", "effectiveCompletedEpisodes", "getEffectiveCompletedEpisodes", "progressedEpisodes", "getProgressedEpisodes", "progressPercentage", "getProgressPercentage", NotificationCompat.CATEGORY_STATUS, "Lcom/example/model/SeasonStatus;", "getStatus", "()Lcom/example/model/SeasonStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Season {
    public static final int $stable = 8;
    private final int completedEpisodes;
    private final List<Episode> episodes;
    private final boolean hasTmdb;
    private final String id;
    private final int noTimingEpisodesCount;
    private final long posterColorHex;
    private final String posterUrl;
    private final int seasonNumber;
    private final String title;
    private final int totalEpisodes;

    public static /* synthetic */ Season copy$default(Season season, String str, String str2, int i, int i2, int i3, int i4, boolean z, long j, String str3, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = season.id;
        }
        if ((i5 & 2) != 0) {
            str2 = season.title;
        }
        if ((i5 & 4) != 0) {
            i = season.seasonNumber;
        }
        if ((i5 & 8) != 0) {
            i2 = season.totalEpisodes;
        }
        if ((i5 & 16) != 0) {
            i3 = season.completedEpisodes;
        }
        if ((i5 & 32) != 0) {
            i4 = season.noTimingEpisodesCount;
        }
        if ((i5 & 64) != 0) {
            z = season.hasTmdb;
        }
        if ((i5 & 128) != 0) {
            j = season.posterColorHex;
        }
        if ((i5 & 256) != 0) {
            str3 = season.posterUrl;
        }
        if ((i5 & 512) != 0) {
            list = season.episodes;
        }
        long j2 = j;
        int i6 = i4;
        boolean z2 = z;
        int i7 = i2;
        int i8 = i3;
        int i9 = i;
        return season.copy(str, str2, i9, i7, i8, i6, z2, j2, str3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<Episode> component10() {
        return this.episodes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSeasonNumber() {
        return this.seasonNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalEpisodes() {
        return this.totalEpisodes;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCompletedEpisodes() {
        return this.completedEpisodes;
    }

    /* renamed from: component6, reason: from getter */
    public final int getNoTimingEpisodesCount() {
        return this.noTimingEpisodesCount;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasTmdb() {
        return this.hasTmdb;
    }

    /* renamed from: component8, reason: from getter */
    public final long getPosterColorHex() {
        return this.posterColorHex;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final Season copy(String id, String title, int seasonNumber, int totalEpisodes, int completedEpisodes, int noTimingEpisodesCount, boolean hasTmdb, long posterColorHex, String posterUrl, List<Episode> episodes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(episodes, "episodes");
        return new Season(id, title, seasonNumber, totalEpisodes, completedEpisodes, noTimingEpisodesCount, hasTmdb, posterColorHex, posterUrl, episodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Season)) {
            return false;
        }
        Season season = (Season) other;
        return Intrinsics.areEqual(this.id, season.id) && Intrinsics.areEqual(this.title, season.title) && this.seasonNumber == season.seasonNumber && this.totalEpisodes == season.totalEpisodes && this.completedEpisodes == season.completedEpisodes && this.noTimingEpisodesCount == season.noTimingEpisodesCount && this.hasTmdb == season.hasTmdb && this.posterColorHex == season.posterColorHex && Intrinsics.areEqual(this.posterUrl, season.posterUrl) && Intrinsics.areEqual(this.episodes, season.episodes);
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.seasonNumber)) * 31) + Integer.hashCode(this.totalEpisodes)) * 31) + Integer.hashCode(this.completedEpisodes)) * 31) + Integer.hashCode(this.noTimingEpisodesCount)) * 31) + Boolean.hashCode(this.hasTmdb)) * 31) + Long.hashCode(this.posterColorHex)) * 31) + (this.posterUrl == null ? 0 : this.posterUrl.hashCode())) * 31) + this.episodes.hashCode();
    }

    public String toString() {
        return "Season(id=" + this.id + ", title=" + this.title + ", seasonNumber=" + this.seasonNumber + ", totalEpisodes=" + this.totalEpisodes + ", completedEpisodes=" + this.completedEpisodes + ", noTimingEpisodesCount=" + this.noTimingEpisodesCount + ", hasTmdb=" + this.hasTmdb + ", posterColorHex=" + this.posterColorHex + ", posterUrl=" + this.posterUrl + ", episodes=" + this.episodes + ")";
    }

    public Season(String id, String title, int seasonNumber, int totalEpisodes, int completedEpisodes, int noTimingEpisodesCount, boolean hasTmdb, long posterColorHex, String posterUrl, List<Episode> episodes) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(episodes, "episodes");
        this.id = id;
        this.title = title;
        this.seasonNumber = seasonNumber;
        this.totalEpisodes = totalEpisodes;
        this.completedEpisodes = completedEpisodes;
        this.noTimingEpisodesCount = noTimingEpisodesCount;
        this.hasTmdb = hasTmdb;
        this.posterColorHex = posterColorHex;
        this.posterUrl = posterUrl;
        this.episodes = episodes;
    }

    public /* synthetic */ Season(String str, String str2, int i, int i2, int i3, int i4, boolean z, long j, String str3, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i5 & 4) != 0 ? 1 : i, (i5 & 8) != 0 ? 60 : i2, (i5 & 16) != 0 ? 1 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? true : z, (i5 & 128) != 0 ? 4292617766L : j, (i5 & 256) != 0 ? null : str3, (i5 & 512) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getSeasonNumber() {
        return this.seasonNumber;
    }

    public final int getTotalEpisodes() {
        return this.totalEpisodes;
    }

    public final int getCompletedEpisodes() {
        return this.completedEpisodes;
    }

    public final int getNoTimingEpisodesCount() {
        return this.noTimingEpisodesCount;
    }

    public final boolean getHasTmdb() {
        return this.hasTmdb;
    }

    public final long getPosterColorHex() {
        return this.posterColorHex;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final List<Episode> getEpisodes() {
        return this.episodes;
    }

    public final int getEffectiveCompletedEpisodes() {
        if (!this.episodes.isEmpty()) {
            Iterable iterable = this.episodes;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return 0;
            }
            int i = 0;
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if ((((Episode) it.next()).getStatus() == EpisodeStatus.COMPLETED) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            return i;
        }
        return this.completedEpisodes;
    }

    public final int getProgressedEpisodes() {
        return RangesKt.coerceAtMost(getEffectiveCompletedEpisodes() + this.noTimingEpisodesCount, this.totalEpisodes);
    }

    public final int getProgressPercentage() {
        if (this.totalEpisodes > 0) {
            return MathKt.roundToInt((getProgressedEpisodes() / this.totalEpisodes) * 100.0d);
        }
        return 0;
    }

    public final SeasonStatus getStatus() {
        return this.totalEpisodes <= 0 ? SeasonStatus.NO_EPISODES : getProgressedEpisodes() >= this.totalEpisodes ? SeasonStatus.COMPLETED : getProgressedEpisodes() > 0 ? SeasonStatus.IN_PROGRESS : SeasonStatus.NOT_STARTED;
    }
}

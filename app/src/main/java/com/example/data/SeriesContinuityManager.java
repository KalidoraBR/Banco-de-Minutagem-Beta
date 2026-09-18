package com.example.data;

import com.example.model.Episode;
import com.example.model.EpisodeStatus;
import com.example.model.Season;
import com.example.model.Series;
import com.example.model.SeriesStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SeriesContinuityManager.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¨\u0006\u0016"}, d2 = {"Lcom/example/data/SeriesContinuityManager;", "", "<init>", "()V", "isEpisodePreenchidoOrVisitado", "", "episode", "Lcom/example/model/Episode;", "getAllEpisodesOrdered", "", "Lcom/example/data/SeriesContinuityManager$EpisodeRef;", "series", "Lcom/example/model/Series;", "areAllEpisodesCompleted", "getContinuityTarget", "Lcom/example/data/ContinuityTarget;", "formatEpisodeCode", "", "seasonNumber", "", "episodeNumber", "EpisodeRef", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SeriesContinuityManager {
    public static final int $stable = 0;
    public static final SeriesContinuityManager INSTANCE = new SeriesContinuityManager();

    private SeriesContinuityManager() {
    }

    /* compiled from: SeriesContinuityManager.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/example/data/SeriesContinuityManager$EpisodeRef;", "", "seasonIndex", "", "seasonNumber", "seasonId", "", "episodeNumber", "episodeId", "episode", "Lcom/example/model/Episode;", "<init>", "(IILjava/lang/String;ILjava/lang/String;Lcom/example/model/Episode;)V", "getSeasonIndex", "()I", "getSeasonNumber", "getSeasonId", "()Ljava/lang/String;", "getEpisodeNumber", "getEpisodeId", "getEpisode", "()Lcom/example/model/Episode;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class EpisodeRef {
        public static final int $stable = 0;
        private final Episode episode;
        private final String episodeId;
        private final int episodeNumber;
        private final String seasonId;
        private final int seasonIndex;
        private final int seasonNumber;

        public static /* synthetic */ EpisodeRef copy$default(EpisodeRef episodeRef, int i, int i2, String str, int i3, String str2, Episode episode, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = episodeRef.seasonIndex;
            }
            if ((i4 & 2) != 0) {
                i2 = episodeRef.seasonNumber;
            }
            if ((i4 & 4) != 0) {
                str = episodeRef.seasonId;
            }
            if ((i4 & 8) != 0) {
                i3 = episodeRef.episodeNumber;
            }
            if ((i4 & 16) != 0) {
                str2 = episodeRef.episodeId;
            }
            if ((i4 & 32) != 0) {
                episode = episodeRef.episode;
            }
            String str3 = str2;
            Episode episode2 = episode;
            return episodeRef.copy(i, i2, str, i3, str3, episode2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSeasonIndex() {
            return this.seasonIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSeasonNumber() {
            return this.seasonNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSeasonId() {
            return this.seasonId;
        }

        /* renamed from: component4, reason: from getter */
        public final int getEpisodeNumber() {
            return this.episodeNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEpisodeId() {
            return this.episodeId;
        }

        /* renamed from: component6, reason: from getter */
        public final Episode getEpisode() {
            return this.episode;
        }

        public final EpisodeRef copy(int seasonIndex, int seasonNumber, String seasonId, int episodeNumber, String episodeId, Episode episode) {
            Intrinsics.checkNotNullParameter(seasonId, "seasonId");
            Intrinsics.checkNotNullParameter(episodeId, "episodeId");
            Intrinsics.checkNotNullParameter(episode, "episode");
            return new EpisodeRef(seasonIndex, seasonNumber, seasonId, episodeNumber, episodeId, episode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EpisodeRef)) {
                return false;
            }
            EpisodeRef episodeRef = (EpisodeRef) other;
            return this.seasonIndex == episodeRef.seasonIndex && this.seasonNumber == episodeRef.seasonNumber && Intrinsics.areEqual(this.seasonId, episodeRef.seasonId) && this.episodeNumber == episodeRef.episodeNumber && Intrinsics.areEqual(this.episodeId, episodeRef.episodeId) && Intrinsics.areEqual(this.episode, episodeRef.episode);
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.seasonIndex) * 31) + Integer.hashCode(this.seasonNumber)) * 31) + this.seasonId.hashCode()) * 31) + Integer.hashCode(this.episodeNumber)) * 31) + this.episodeId.hashCode()) * 31) + this.episode.hashCode();
        }

        public String toString() {
            return "EpisodeRef(seasonIndex=" + this.seasonIndex + ", seasonNumber=" + this.seasonNumber + ", seasonId=" + this.seasonId + ", episodeNumber=" + this.episodeNumber + ", episodeId=" + this.episodeId + ", episode=" + this.episode + ")";
        }

        public EpisodeRef(int seasonIndex, int seasonNumber, String seasonId, int episodeNumber, String episodeId, Episode episode) {
            Intrinsics.checkNotNullParameter(seasonId, "seasonId");
            Intrinsics.checkNotNullParameter(episodeId, "episodeId");
            Intrinsics.checkNotNullParameter(episode, "episode");
            this.seasonIndex = seasonIndex;
            this.seasonNumber = seasonNumber;
            this.seasonId = seasonId;
            this.episodeNumber = episodeNumber;
            this.episodeId = episodeId;
            this.episode = episode;
        }

        public final int getSeasonIndex() {
            return this.seasonIndex;
        }

        public final int getSeasonNumber() {
            return this.seasonNumber;
        }

        public final String getSeasonId() {
            return this.seasonId;
        }

        public final int getEpisodeNumber() {
            return this.episodeNumber;
        }

        public final String getEpisodeId() {
            return this.episodeId;
        }

        public final Episode getEpisode() {
            return this.episode;
        }
    }

    public final boolean isEpisodePreenchidoOrVisitado(Episode episode) {
        Intrinsics.checkNotNullParameter(episode, "episode");
        return episode.getStatus() == EpisodeStatus.COMPLETED || episode.getStatus() == EpisodeStatus.PARTIAL || episode.getOpening().isCompleted() || episode.getRecap().isCompleted() || episode.getEnding().isCompleted() || !StringsKt.isBlank(episode.getOpening().getStartTime()) || !StringsKt.isBlank(episode.getOpening().getEndTime()) || !StringsKt.isBlank(episode.getRecap().getStartTime()) || !StringsKt.isBlank(episode.getRecap().getEndTime()) || !StringsKt.isBlank(episode.getEnding().getStartTime()) || !StringsKt.isBlank(episode.getEnding().getEndTime()) || episode.isLastEdited();
    }

    public final List<EpisodeRef> getAllEpisodesOrdered(Series series) {
        Iterable emptyList;
        Intrinsics.checkNotNullParameter(series, "series");
        if (series.getSeasons().isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Iterable<Season> sortedWith = CollectionsKt.sortedWith(series.getSeasons(), new Comparator() { // from class: com.example.data.SeriesContinuityManager$getAllEpisodesOrdered$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((Season) t).getSeasonNumber()), Integer.valueOf(((Season) t2).getSeasonNumber()));
            }
        });
        List result = new ArrayList();
        int i = 0;
        for (Season season : sortedWith) {
            int sIdx = i;
            i++;
            if (!season.getEpisodes().isEmpty()) {
                emptyList = season.getEpisodes();
            } else if (season.getTotalEpisodes() > 0) {
                emptyList = EpisodeDataGenerator.INSTANCE.generateEpisodes(season.getId(), season.getTotalEpisodes(), season.getCompletedEpisodes());
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            Iterable episodes = emptyList;
            for (Episode ep : CollectionsKt.sortedWith(episodes, new Comparator() { // from class: com.example.data.SeriesContinuityManager$getAllEpisodesOrdered$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((Episode) t).getEpisodeNumber()), Integer.valueOf(((Episode) t2).getEpisodeNumber()));
                }
            })) {
                result.add(new EpisodeRef(sIdx, season.getSeasonNumber(), season.getId(), ep.getEpisodeNumber(), ep.getId(), ep));
            }
        }
        return result;
    }

    public final boolean areAllEpisodesCompleted(Series series) {
        Intrinsics.checkNotNullParameter(series, "series");
        if (series.getStatus() == SeriesStatus.COMPLETED_FULL) {
            return true;
        }
        List allEpisodes = getAllEpisodesOrdered(series);
        if (allEpisodes.isEmpty()) {
            return false;
        }
        List list = allEpisodes;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((EpisodeRef) it.next()).getEpisode().getStatus() == EpisodeStatus.COMPLETED ? 1 : null) == null) {
                return false;
            }
        }
        return true;
    }

    public final ContinuityTarget getContinuityTarget(Series series) {
        Iterable iterable;
        Object obj;
        ContinuityTarget continuityTarget;
        Object obj2;
        EpisodeRef target;
        EpisodeRef episodeRef;
        String str;
        Intrinsics.checkNotNullParameter(series, "series");
        List allEpisodes = getAllEpisodesOrdered(series);
        if (allEpisodes.isEmpty()) {
            Season firstSeason = (Season) CollectionsKt.firstOrNull((List) series.getSeasons());
            if (firstSeason == null || (str = firstSeason.getId()) == null) {
                str = "";
            }
            return new ContinuityTarget("S01E01", 1, 1, str, "", null, 32, null);
        }
        List list = allEpisodes;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ((((EpisodeRef) it.next()).getEpisode().getStatus() == EpisodeStatus.COMPLETED ? 1 : null) == null) {
                        iterable = null;
                        break;
                    }
                } else {
                    iterable = 1;
                    break;
                }
            }
        } else {
            iterable = 1;
        }
        if (iterable != null || series.getStatus() == SeriesStatus.COMPLETED_FULL) {
            return null;
        }
        Iterator<T> it2 = allEpisodes.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            EpisodeRef episodeRef2 = (EpisodeRef) obj;
            if (((episodeRef2.getEpisode().isLastEdited() && INSTANCE.isEpisodePreenchidoOrVisitado(episodeRef2.getEpisode())) ? 1 : null) != null) {
                break;
            }
        }
        EpisodeRef lastWorkedRef = (EpisodeRef) obj;
        if (lastWorkedRef == null) {
            ListIterator<EpisodeRef> listIterator = allEpisodes.listIterator(allEpisodes.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    episodeRef = null;
                    break;
                }
                episodeRef = listIterator.previous();
                if (INSTANCE.isEpisodePreenchidoOrVisitado(episodeRef.getEpisode())) {
                    break;
                }
            }
            lastWorkedRef = episodeRef;
        }
        if (lastWorkedRef == null) {
            EpisodeRef first = (EpisodeRef) CollectionsKt.first(allEpisodes);
            String code = formatEpisodeCode(first.getSeasonNumber(), first.getEpisodeNumber());
            return new ContinuityTarget(code, first.getSeasonNumber(), first.getEpisodeNumber(), first.getSeasonId(), first.getEpisodeId(), first.getEpisode());
        }
        int currentIndex = allEpisodes.indexOf(lastWorkedRef);
        int nextIndex = currentIndex + 1;
        if (nextIndex >= 0 && nextIndex < allEpisodes.size()) {
            target = allEpisodes.get(nextIndex);
            continuityTarget = null;
        } else {
            Iterator it3 = allEpisodes.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj2 = it3.next();
                    continuityTarget = null;
                    if (((EpisodeRef) obj2).getEpisode().getStatus() != EpisodeStatus.COMPLETED) {
                        break;
                    }
                } else {
                    continuityTarget = null;
                    obj2 = null;
                    break;
                }
            }
            target = (EpisodeRef) obj2;
        }
        if (target == null) {
            return continuityTarget;
        }
        String code2 = formatEpisodeCode(target.getSeasonNumber(), target.getEpisodeNumber());
        return new ContinuityTarget(code2, target.getSeasonNumber(), target.getEpisodeNumber(), target.getSeasonId(), target.getEpisodeId(), target.getEpisode());
    }

    public final String formatEpisodeCode(int seasonNumber, int episodeNumber) {
        String format = String.format("S%02dE%02d", Arrays.copyOf(new Object[]{Integer.valueOf(seasonNumber), Integer.valueOf(episodeNumber)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}

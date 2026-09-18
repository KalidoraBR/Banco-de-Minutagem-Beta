package com.example.data;

import com.example.model.Episode;
import com.example.model.PendencyItem;
import com.example.model.PendencyType;
import com.example.model.Season;
import com.example.model.Series;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PendencyScanner.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¨\u0006\t"}, d2 = {"Lcom/example/data/PendencyScanner;", "", "<init>", "()V", "scan", "", "Lcom/example/model/PendencyItem;", "seriesList", "Lcom/example/model/Series;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PendencyScanner {
    public static final int $stable = 0;
    public static final PendencyScanner INSTANCE = new PendencyScanner();

    private PendencyScanner() {
    }

    public final List<PendencyItem> scan(List<Series> seriesList) {
        List episodes;
        Intrinsics.checkNotNullParameter(seriesList, "seriesList");
        List items = new ArrayList();
        for (Series series : seriesList) {
            boolean hasMissingSeriesIdentifiers = !series.getHasTmdb() || StringsKt.isBlank(series.getTmdbId()) || StringsKt.isBlank(series.getImdbId()) || StringsKt.isBlank(series.getTvdbId()) || StringsKt.contains((CharSequence) series.getIdentifiersSummary(), (CharSequence) "Sem vínculo", true) || StringsKt.contains((CharSequence) series.getIdentifiersSummary(), (CharSequence) "Não vinculada", true) || StringsKt.isBlank(series.getIdentifiersSummary());
            if (hasMissingSeriesIdentifiers) {
                items.add(new PendencyItem("series_" + series.getId() + "_identifiers", series.getId(), series.getTitle(), null, null, null, null, null, PendencyType.IDENTIFIERS, "Série sem IMDb ou TVDB"));
            }
            int seriesPendenciesAdded = 0;
            int maxPerSeries = items.size() < 2 ? 2 : 1;
            for (Season season : series.getSeasons()) {
                if (seriesPendenciesAdded >= maxPerSeries) {
                    break;
                }
                if (!season.getEpisodes().isEmpty()) {
                    episodes = season.getEpisodes();
                } else if (season.getTotalEpisodes() > 0) {
                    episodes = EpisodeDataGenerator.INSTANCE.generateEpisodes(season.getId(), season.getTotalEpisodes(), season.getCompletedEpisodes());
                } else {
                    episodes = CollectionsKt.emptyList();
                }
                for (Episode episode : episodes) {
                    if (seriesPendenciesAdded < maxPerSeries) {
                        if (!episode.getOpening().isCompleted()) {
                            String str = "ep_" + episode.getId() + "_opening";
                            String id = series.getId();
                            String title = series.getTitle();
                            String id2 = season.getId();
                            Integer valueOf = Integer.valueOf(season.getSeasonNumber());
                            String id3 = episode.getId();
                            Integer valueOf2 = Integer.valueOf(episode.getEpisodeNumber());
                            String title2 = episode.getTitle();
                            if (StringsKt.isBlank(title2)) {
                                title2 = null;
                            }
                            items.add(new PendencyItem(str, id, title, id2, valueOf, id3, valueOf2, title2, PendencyType.OPENING, "Abertura ainda não preenchida"));
                            seriesPendenciesAdded++;
                        }
                        if (seriesPendenciesAdded < maxPerSeries && !episode.getEnding().isCompleted()) {
                            String str2 = "ep_" + episode.getId() + "_ending";
                            String id4 = series.getId();
                            String title3 = series.getTitle();
                            String id5 = season.getId();
                            Integer valueOf3 = Integer.valueOf(season.getSeasonNumber());
                            String id6 = episode.getId();
                            Integer valueOf4 = Integer.valueOf(episode.getEpisodeNumber());
                            String title4 = episode.getTitle();
                            if (StringsKt.isBlank(title4)) {
                                title4 = null;
                            }
                            items.add(new PendencyItem(str2, id4, title3, id5, valueOf3, id6, valueOf4, title4, PendencyType.ENDING, "Encerramento ainda não preenchido"));
                            seriesPendenciesAdded++;
                        }
                        if (seriesPendenciesAdded < maxPerSeries && !episode.getRecap().isCompleted()) {
                            String str3 = "ep_" + episode.getId() + "_recap";
                            String id7 = series.getId();
                            String title5 = series.getTitle();
                            String id8 = season.getId();
                            Integer valueOf5 = Integer.valueOf(season.getSeasonNumber());
                            String id9 = episode.getId();
                            Integer valueOf6 = Integer.valueOf(episode.getEpisodeNumber());
                            String title6 = episode.getTitle();
                            items.add(new PendencyItem(str3, id7, title5, id8, valueOf5, id9, valueOf6, StringsKt.isBlank(title6) ? null : title6, PendencyType.RECAP, "Recap ainda não preenchido"));
                            seriesPendenciesAdded++;
                        }
                    }
                }
            }
            if (items.size() >= 3) {
                break;
            }
        }
        return CollectionsKt.take(items, 3);
    }
}

package com.example.data;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.example.model.Episode;
import com.example.model.EpisodeStatus;
import com.example.model.FixedTimingsConfig;
import com.example.model.Season;
import com.example.model.Series;
import com.example.model.SeriesStatus;
import com.example.model.TimingItemConfig;
import com.example.model.TimingSection;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SeriesStorage.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/example/data/SeriesStorage;", "", "<init>", "()V", "FILE_NAME", "", "loadSeries", "", "Lcom/example/model/Series;", "context", "Landroid/content/Context;", "saveSeries", "", "seriesList", "serializeSeries", "Lorg/json/JSONObject;", "series", "parseSeries", "obj", "serializeSeason", "season", "Lcom/example/model/Season;", "parseSeason", "serializeEpisode", "ep", "Lcom/example/model/Episode;", "parseEpisode", "serializeTiming", "t", "Lcom/example/model/TimingSection;", "parseTiming", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SeriesStorage {
    public static final int $stable = 0;
    private static final String FILE_NAME = "banco_minutagens_series.json";
    public static final SeriesStorage INSTANCE = new SeriesStorage();

    private SeriesStorage() {
    }

    public final synchronized List<Series> loadSeries(Context context) {
        List list;
        String nextEpisodeToFill;
        String code;
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir(), FILE_NAME);
        if (!file.exists() || file.length() == 0) {
            return CollectionsKt.emptyList();
        }
        try {
            String jsonStr = FilesKt.readText(file, Charsets.UTF_8);
            JSONArray jsonArray = new JSONArray(jsonStr);
            list = new ArrayList();
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                Intrinsics.checkNotNull(obj);
                Series parsed = parseSeries(obj);
                if (!Intrinsics.areEqual(parsed.getId(), "power_rangers") && !Intrinsics.areEqual(parsed.getId(), "kamen_rider_wizard")) {
                    ContinuityTarget continuity = SeriesContinuityManager.INSTANCE.getContinuityTarget(parsed);
                    if (continuity != null && (code = continuity.getCode()) != null) {
                        nextEpisodeToFill = code;
                        list.add(Series.copy$default(parsed, null, null, 0, null, 0, 0, nextEpisodeToFill, 0L, null, 0L, 0L, null, null, null, false, null, 0, 0, null, null, null, null, null, 8388543, null));
                    }
                    nextEpisodeToFill = parsed.getNextEpisodeToFill();
                    list.add(Series.copy$default(parsed, null, null, 0, null, 0, 0, nextEpisodeToFill, 0L, null, 0L, 0L, null, null, null, false, null, 0, 0, null, null, null, null, null, 8388543, null));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            list = CollectionsKt.emptyList();
        }
        return list;
    }

    public final synchronized void saveSeries(Context context, List<Series> seriesList) {
        String content;
        File tempFile;
        FileOutputStream fileOutputStream;
        String nextEpisodeToFill;
        String code;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(seriesList, "seriesList");
        try {
            JSONArray jsonArray = new JSONArray();
            for (Series series : seriesList) {
                ContinuityTarget continuityTarget = SeriesContinuityManager.INSTANCE.getContinuityTarget(series);
                if (continuityTarget != null && (code = continuityTarget.getCode()) != null) {
                    nextEpisodeToFill = code;
                    jsonArray.put(INSTANCE.serializeSeries(Series.copy$default(series, null, null, 0, null, 0, 0, nextEpisodeToFill, 0L, null, 0L, 0L, null, null, null, false, null, 0, 0, null, null, null, null, null, 8388543, null)));
                }
                nextEpisodeToFill = series.getNextEpisodeToFill();
                jsonArray.put(INSTANCE.serializeSeries(Series.copy$default(series, null, null, 0, null, 0, 0, nextEpisodeToFill, 0L, null, 0L, 0L, null, null, null, false, null, 0, 0, null, null, null, null, null, 8388543, null)));
            }
            content = jsonArray.toString(2);
            tempFile = new File(context.getFilesDir(), "banco_minutagens_series.json.tmp");
            fileOutputStream = new FileOutputStream(tempFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fileOutputStream2 = fileOutputStream;
            Intrinsics.checkNotNull(content);
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream2.write(bytes);
            fileOutputStream2.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            File targetFile = new File(context.getFilesDir(), FILE_NAME);
            if (tempFile.exists()) {
                tempFile.renameTo(targetFile);
            }
        } finally {
        }
    }

    private final JSONObject serializeSeries(Series series) {
        JSONObject obj = new JSONObject();
        obj.put("id", series.getId());
        obj.put("title", series.getTitle());
        obj.put("releaseYear", series.getReleaseYear());
        obj.put(NotificationCompat.CATEGORY_STATUS, series.getStatus().name());
        obj.put("totalEpisodes", series.getTotalEpisodes());
        obj.put("completedEpisodes", series.getCompletedEpisodes());
        Object nextEpisodeToFill = series.getNextEpisodeToFill();
        if (nextEpisodeToFill == null) {
            nextEpisodeToFill = "";
        }
        obj.put("nextEpisodeToFill", nextEpisodeToFill);
        obj.put("lastModifiedTimestamp", series.getLastModifiedTimestamp());
        obj.put("categoryBadge", series.getCategoryBadge());
        obj.put("primaryColorHex", series.getPrimaryColorHex());
        obj.put("secondaryColorHex", series.getSecondaryColorHex());
        obj.put("synopsis", series.getSynopsis());
        Object posterUrl = series.getPosterUrl();
        if (posterUrl == null) {
            posterUrl = "";
        }
        obj.put("posterUrl", posterUrl);
        Object backdropUrl = series.getBackdropUrl();
        obj.put("backdropUrl", backdropUrl != null ? backdropUrl : "");
        obj.put("hasTmdb", series.getHasTmdb());
        obj.put("identifiersSummary", series.getIdentifiersSummary());
        obj.put("fixedTimingsActiveCount", series.getFixedTimingsActiveCount());
        obj.put("fixedTimingsTotalCount", series.getFixedTimingsTotalCount());
        obj.put("tmdbId", series.getTmdbId());
        obj.put("imdbId", series.getImdbId());
        obj.put("tvdbId", series.getTvdbId());
        JSONObject ftObj = new JSONObject();
        ftObj.put("opening_name", series.getFixedTimings().getOpening().getName());
        ftObj.put("opening_enabled", series.getFixedTimings().getOpening().isEnabled());
        ftObj.put("opening_duration", series.getFixedTimings().getOpening().getDurationFormatted());
        ftObj.put("recap_name", series.getFixedTimings().getRecap().getName());
        ftObj.put("recap_enabled", series.getFixedTimings().getRecap().isEnabled());
        ftObj.put("recap_duration", series.getFixedTimings().getRecap().getDurationFormatted());
        ftObj.put("ending_name", series.getFixedTimings().getEnding().getName());
        ftObj.put("ending_enabled", series.getFixedTimings().getEnding().isEnabled());
        ftObj.put("ending_duration", series.getFixedTimings().getEnding().getDurationFormatted());
        obj.put("fixedTimings", ftObj);
        JSONArray seasonsArray = new JSONArray();
        Iterator it = series.getSeasons().iterator();
        while (it.hasNext()) {
            seasonsArray.put(INSTANCE.serializeSeason((Season) it.next()));
        }
        obj.put("seasons", seasonsArray);
        return obj;
    }

    private final Series parseSeries(JSONObject obj) {
        SeriesStatus seriesStatus;
        FixedTimingsConfig fixedTimings;
        String statusStr = obj.optString(NotificationCompat.CATEGORY_STATUS, "IN_PROGRESS");
        try {
            Intrinsics.checkNotNull(statusStr);
            seriesStatus = SeriesStatus.valueOf(statusStr);
        } catch (Exception e) {
            seriesStatus = SeriesStatus.IN_PROGRESS;
        }
        SeriesStatus status = seriesStatus;
        JSONObject ftObj = obj.optJSONObject("fixedTimings");
        if (ftObj != null) {
            String optString = ftObj.optString("opening_name", "Abertura");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            boolean optBoolean = ftObj.optBoolean("opening_enabled", false);
            String optString2 = ftObj.optString("opening_duration", "01:00");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            TimingItemConfig timingItemConfig = new TimingItemConfig(optString, optBoolean, optString2);
            String optString3 = ftObj.optString("recap_name", "Recap");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
            boolean optBoolean2 = ftObj.optBoolean("recap_enabled", false);
            String optString4 = ftObj.optString("recap_duration", "00:30");
            Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
            TimingItemConfig timingItemConfig2 = new TimingItemConfig(optString3, optBoolean2, optString4);
            String optString5 = ftObj.optString("ending_name", "Encerramento");
            Intrinsics.checkNotNullExpressionValue(optString5, "optString(...)");
            boolean optBoolean3 = ftObj.optBoolean("ending_enabled", false);
            String optString6 = ftObj.optString("ending_duration", "00:45");
            Intrinsics.checkNotNullExpressionValue(optString6, "optString(...)");
            fixedTimings = new FixedTimingsConfig(timingItemConfig, timingItemConfig2, new TimingItemConfig(optString5, optBoolean3, optString6));
        } else {
            fixedTimings = new FixedTimingsConfig(null, null, null, 7, null);
        }
        List seasonsList = new ArrayList();
        JSONArray seasonsArray = obj.optJSONArray("seasons");
        if (seasonsArray != null) {
            int length = seasonsArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject sObj = seasonsArray.getJSONObject(i);
                Intrinsics.checkNotNull(sObj);
                seasonsList.add(parseSeason(sObj));
            }
        }
        String optString7 = obj.optString("id");
        Intrinsics.checkNotNullExpressionValue(optString7, "optString(...)");
        String optString8 = obj.optString("title");
        Intrinsics.checkNotNullExpressionValue(optString8, "optString(...)");
        int optInt = obj.optInt("releaseYear", 2024);
        int optInt2 = obj.optInt("totalEpisodes", 0);
        int optInt3 = obj.optInt("completedEpisodes", 0);
        String optString9 = obj.optString("nextEpisodeToFill");
        Intrinsics.checkNotNull(optString9);
        if (StringsKt.isBlank(optString9)) {
            optString9 = null;
        }
        long optLong = obj.optLong("lastModifiedTimestamp", System.currentTimeMillis());
        String optString10 = obj.optString("categoryBadge", "Geral");
        Intrinsics.checkNotNullExpressionValue(optString10, "optString(...)");
        long optLong2 = obj.optLong("primaryColorHex", 4286331629L);
        long optLong3 = obj.optLong("secondaryColorHex", 4280640491L);
        String optString11 = obj.optString("synopsis", "");
        Intrinsics.checkNotNullExpressionValue(optString11, "optString(...)");
        String optString12 = obj.optString("posterUrl");
        Intrinsics.checkNotNull(optString12);
        if (StringsKt.isBlank(optString12)) {
            optString12 = null;
        }
        String str = optString12;
        String optString13 = obj.optString("backdropUrl");
        Intrinsics.checkNotNull(optString13);
        String str2 = !StringsKt.isBlank(optString13) ? optString13 : null;
        boolean optBoolean4 = obj.optBoolean("hasTmdb", true);
        String optString14 = obj.optString("identifiersSummary", "TMDB · IMDb · TVDB");
        Intrinsics.checkNotNullExpressionValue(optString14, "optString(...)");
        int optInt4 = obj.optInt("fixedTimingsActiveCount", 0);
        int optInt5 = obj.optInt("fixedTimingsTotalCount", 3);
        String optString15 = obj.optString("tmdbId", "");
        Intrinsics.checkNotNullExpressionValue(optString15, "optString(...)");
        String optString16 = obj.optString("imdbId", "");
        Intrinsics.checkNotNullExpressionValue(optString16, "optString(...)");
        String optString17 = obj.optString("tvdbId", "");
        Intrinsics.checkNotNullExpressionValue(optString17, "optString(...)");
        return new Series(optString7, optString8, optInt, status, optInt2, optInt3, optString9, optLong, optString10, optLong2, optLong3, optString11, str, str2, optBoolean4, optString14, optInt4, optInt5, seasonsList, optString15, optString16, optString17, fixedTimings);
    }

    private final JSONObject serializeSeason(Season season) {
        JSONObject obj = new JSONObject();
        obj.put("id", season.getId());
        obj.put("title", season.getTitle());
        obj.put("seasonNumber", season.getSeasonNumber());
        obj.put("totalEpisodes", season.getTotalEpisodes());
        obj.put("completedEpisodes", season.getCompletedEpisodes());
        obj.put("noTimingEpisodesCount", season.getNoTimingEpisodesCount());
        obj.put("hasTmdb", season.getHasTmdb());
        obj.put("posterColorHex", season.getPosterColorHex());
        Object posterUrl = season.getPosterUrl();
        if (posterUrl == null) {
            posterUrl = "";
        }
        obj.put("posterUrl", posterUrl);
        JSONArray epArray = new JSONArray();
        Iterator it = season.getEpisodes().iterator();
        while (it.hasNext()) {
            epArray.put(INSTANCE.serializeEpisode((Episode) it.next()));
        }
        obj.put("episodes", epArray);
        return obj;
    }

    private final Season parseSeason(JSONObject obj) {
        int i;
        List epList = new ArrayList();
        JSONArray epArray = obj.optJSONArray("episodes");
        if (epArray != null) {
            int length = epArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject epObj = epArray.getJSONObject(i2);
                Intrinsics.checkNotNull(epObj);
                epList.add(parseEpisode(epObj));
            }
        }
        String optString = obj.optString("id");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = obj.optString("title");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        int optInt = obj.optInt("seasonNumber", 1);
        int optInt2 = obj.optInt("totalEpisodes", epList.size());
        List list = epList;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Episode) it.next()).getStatus() == EpisodeStatus.COMPLETED) {
                    i++;
                    if (i < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        int optInt3 = obj.optInt("completedEpisodes", i);
        int optInt4 = obj.optInt("noTimingEpisodesCount", 0);
        boolean optBoolean = obj.optBoolean("hasTmdb", true);
        long optLong = obj.optLong("posterColorHex", 4292617766L);
        String optString3 = obj.optString("posterUrl");
        Intrinsics.checkNotNull(optString3);
        if (StringsKt.isBlank(optString3)) {
            optString3 = null;
        }
        return new Season(optString, optString2, optInt, optInt2, optInt3, optInt4, optBoolean, optLong, optString3, epList);
    }

    private final JSONObject serializeEpisode(Episode ep) {
        JSONObject obj = new JSONObject();
        obj.put("id", ep.getId());
        obj.put("seasonId", ep.getSeasonId());
        obj.put("episodeNumber", ep.getEpisodeNumber());
        obj.put("title", ep.getTitle());
        obj.put("airDate", ep.getAirDate());
        obj.put("isLastEdited", ep.isLastEdited());
        String note = ep.getNote();
        if (note == null) {
            note = "";
        }
        obj.put("note", note);
        obj.put("opening", serializeTiming(ep.getOpening()));
        obj.put("recap", serializeTiming(ep.getRecap()));
        obj.put("ending", serializeTiming(ep.getEnding()));
        return obj;
    }

    private final Episode parseEpisode(JSONObject obj) {
        String optString = obj.optString("id");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = obj.optString("seasonId");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        int optInt = obj.optInt("episodeNumber", 1);
        String optString3 = obj.optString("title");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        String optString4 = obj.optString("airDate");
        Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
        boolean optBoolean = obj.optBoolean("isLastEdited", false);
        String optString5 = obj.optString("note");
        Intrinsics.checkNotNull(optString5);
        if (StringsKt.isBlank(optString5)) {
            optString5 = null;
        }
        return new Episode(optString, optString2, optInt, optString3, optString4, parseTiming(obj.optJSONObject("opening")), parseTiming(obj.optJSONObject("recap")), parseTiming(obj.optJSONObject("ending")), optBoolean, optString5);
    }

    private final JSONObject serializeTiming(TimingSection t) {
        JSONObject obj = new JSONObject();
        obj.put("isFilled", t.isFilled());
        obj.put("hasNot", t.getHasNot());
        obj.put("startTime", t.getStartTime());
        obj.put("endTime", t.getEndTime());
        obj.put("durationFormatted", t.getDurationFormatted());
        return obj;
    }

    private final TimingSection parseTiming(JSONObject obj) {
        if (obj == null) {
            return new TimingSection(false, false, null, null, null, 31, null);
        }
        boolean optBoolean = obj.optBoolean("isFilled", false);
        boolean optBoolean2 = obj.optBoolean("hasNot", false);
        String optString = obj.optString("startTime", "");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = obj.optString("endTime", "");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        String optString3 = obj.optString("durationFormatted", "");
        Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
        return new TimingSection(optBoolean, optBoolean2, optString, optString2, optString3);
    }
}

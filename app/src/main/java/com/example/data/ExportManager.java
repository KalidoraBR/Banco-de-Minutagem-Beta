package com.example.data;

import android.content.Context;
import android.content.Intent;
import com.example.model.Episode;
import com.example.model.Season;
import com.example.model.Series;
import com.example.model.TimingSection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: ExportManager.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n¨\u0006\u0018"}, d2 = {"Lcom/example/data/ExportManager;", "", "<init>", "()V", "calculateSummary", "Lcom/example/data/ExportSummary;", "seriesList", "", "Lcom/example/model/Series;", "format", "Lcom/example/data/ExportFormat;", "parseTimeToSeconds", "", "timeStr", "", "generateExportContent", "generateCsv", "generateJson", "generateSpreadsheet", "shareExportContent", "", "context", "Landroid/content/Context;", "content", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExportManager {
    public static final int $stable = 0;
    public static final ExportManager INSTANCE = new ExportManager();

    /* compiled from: ExportManager.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExportFormat.values().length];
            try {
                iArr[ExportFormat.CSV.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ExportFormat.JSON.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ExportFormat.SPREADSHEET.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ExportManager() {
    }

    public final ExportSummary calculateSummary(List<Series> seriesList, ExportFormat format) {
        List episodes;
        Intrinsics.checkNotNullParameter(seriesList, "seriesList");
        Intrinsics.checkNotNullParameter(format, "format");
        int seriesCount = seriesList.size();
        int completedEpisodes = 0;
        int pendingEpisodes = 0;
        int pendingEpisodes2 = 0;
        for (Series series : seriesList) {
            pendingEpisodes2 += series.getSeasons().size();
            for (Season season : series.getSeasons()) {
                if (!season.getEpisodes().isEmpty()) {
                    episodes = season.getEpisodes();
                } else if (season.getTotalEpisodes() > 0) {
                    episodes = EpisodeDataGenerator.INSTANCE.generateEpisodes(season.getId(), season.getTotalEpisodes(), season.getCompletedEpisodes());
                } else {
                    episodes = CollectionsKt.emptyList();
                }
                for (Episode ep : episodes) {
                    if (ep.getOpening().isCompleted() && ep.getRecap().isCompleted() && ep.getEnding().isCompleted()) {
                        completedEpisodes++;
                    } else {
                        pendingEpisodes++;
                    }
                }
            }
        }
        return new ExportSummary(seriesCount, pendingEpisodes2, completedEpisodes, pendingEpisodes, format);
    }

    private final int parseTimeToSeconds(String timeStr) {
        int i = 0;
        if (StringsKt.isBlank(timeStr) || Intrinsics.areEqual(timeStr, "NA")) {
            return 0;
        }
        List parts = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) timeStr).toString(), new String[]{ServerSentEventKt.COLON}, false, 0, 6, (Object) null);
        try {
            switch (parts.size()) {
                case 1:
                    i = Integer.parseInt((String) parts.get(0));
                    break;
                case 2:
                    i = (Integer.parseInt((String) parts.get(0)) * 60) + Integer.parseInt((String) parts.get(1));
                    break;
                case 3:
                    i = (Integer.parseInt((String) parts.get(0)) * 3600) + (Integer.parseInt((String) parts.get(1)) * 60) + Integer.parseInt((String) parts.get(2));
                    break;
            }
        } catch (Exception e) {
        }
        return i;
    }

    public final String generateExportContent(List<Series> seriesList, ExportFormat format) {
        Intrinsics.checkNotNullParameter(seriesList, "seriesList");
        Intrinsics.checkNotNullParameter(format, "format");
        switch (WhenMappings.$EnumSwitchMapping$0[format.ordinal()]) {
            case 1:
                return generateCsv(seriesList);
            case 2:
                return generateJson(seriesList);
            case 3:
                return generateSpreadsheet(seriesList);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String generateCsv(List<Series> seriesList) {
        String opStart;
        String opEnd;
        String recapStart;
        String str;
        String endStart;
        StringBuilder sb = new StringBuilder();
        sb.append("imdb_id,segment_type,season,episode,start,end,tvdb_id\n");
        Iterator<Series> it = seriesList.iterator();
        while (it.hasNext()) {
            Series series = it.next();
            String imdbId = series.getImdbId();
            if (StringsKt.isBlank(imdbId)) {
                imdbId = "tt0000000";
            }
            String imdb = imdbId;
            String tvdbId = series.getTvdbId();
            if (StringsKt.isBlank(tvdbId)) {
                tvdbId = "00000";
            }
            String tvdb = tvdbId;
            Iterator<Season> it2 = series.getSeasons().iterator();
            while (it2.hasNext()) {
                Season season = it2.next();
                List episodes = !season.getEpisodes().isEmpty() ? season.getEpisodes() : season.getTotalEpisodes() > 0 ? EpisodeDataGenerator.INSTANCE.generateEpisodes(season.getId(), season.getTotalEpisodes(), season.getCompletedEpisodes()) : CollectionsKt.emptyList();
                for (Episode ep : episodes) {
                    int sNum = season.getSeasonNumber();
                    int eNum = ep.getEpisodeNumber();
                    String str2 = "00:00:00";
                    String endEnd = "NA";
                    if (ep.getOpening().getHasNot()) {
                        opStart = "NA";
                    } else {
                        String startTime = ep.getOpening().getStartTime();
                        if (StringsKt.isBlank(startTime)) {
                            startTime = "00:00:00";
                        }
                        opStart = startTime;
                    }
                    if (ep.getOpening().getHasNot()) {
                        opEnd = "NA";
                    } else {
                        String endTime = ep.getOpening().getEndTime();
                        if (StringsKt.isBlank(endTime)) {
                            endTime = "00:00:00";
                        }
                        opEnd = endTime;
                    }
                    Iterator<Series> it3 = it;
                    Series series2 = series;
                    Iterator<Season> it4 = it2;
                    sb.append(imdb + ",opening," + sNum + "," + eNum + "," + opStart + "," + opEnd + "," + tvdb + "\n");
                    if (ep.getRecap().getHasNot()) {
                        recapStart = "NA";
                    } else {
                        String startTime2 = ep.getRecap().getStartTime();
                        if (StringsKt.isBlank(startTime2)) {
                            startTime2 = "00:00:00";
                        }
                        recapStart = startTime2;
                    }
                    if (ep.getRecap().getHasNot()) {
                        str = "NA";
                    } else {
                        String endTime2 = ep.getRecap().getEndTime();
                        if (StringsKt.isBlank(endTime2)) {
                            endTime2 = "00:00:00";
                        }
                        str = endTime2;
                    }
                    String recapEnd = str;
                    Season season2 = season;
                    List episodes2 = episodes;
                    sb.append(imdb + ",recap," + sNum + "," + eNum + "," + recapStart + "," + recapEnd + "," + tvdb + "\n");
                    if (ep.getEnding().getHasNot()) {
                        endStart = "NA";
                    } else {
                        String startTime3 = ep.getEnding().getStartTime();
                        if (StringsKt.isBlank(startTime3)) {
                            startTime3 = "00:00:00";
                        }
                        endStart = startTime3;
                    }
                    if (!ep.getEnding().getHasNot()) {
                        String endTime3 = ep.getEnding().getEndTime();
                        if (!StringsKt.isBlank(endTime3)) {
                            str2 = endTime3;
                        }
                        endEnd = str2;
                    }
                    sb.append(imdb + ",ending," + sNum + "," + eNum + "," + endStart + "," + endEnd + "," + tvdb + "\n");
                    it = it3;
                    series = series2;
                    it2 = it4;
                    season = season2;
                    episodes = episodes2;
                }
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final String generateJson(List<Series> seriesList) {
        List emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        Ref.BooleanRef first = new Ref.BooleanRef();
        first.element = true;
        for (Series series : seriesList) {
            String imdbId = series.getImdbId();
            if (StringsKt.isBlank(imdbId)) {
                imdbId = "tt0000000";
            }
            String imdb = imdbId;
            String tvdbId = series.getTvdbId();
            if (StringsKt.isBlank(tvdbId)) {
                tvdbId = "00000";
            }
            String tvdb = tvdbId;
            for (Season season : series.getSeasons()) {
                if (!season.getEpisodes().isEmpty()) {
                    emptyList = season.getEpisodes();
                } else if (season.getTotalEpisodes() > 0) {
                    emptyList = EpisodeDataGenerator.INSTANCE.generateEpisodes(season.getId(), season.getTotalEpisodes(), season.getCompletedEpisodes());
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                List episodes = emptyList;
                for (Episode ep : episodes) {
                    int sNum = season.getSeasonNumber();
                    int eNum = ep.getEpisodeNumber();
                    generateJson$appendSegment(first, sb, imdb, sNum, eNum, tvdb, "opening", ep.getOpening());
                    generateJson$appendSegment(first, sb, imdb, sNum, eNum, tvdb, "recap", ep.getRecap());
                    generateJson$appendSegment(first, sb, imdb, sNum, eNum, tvdb, "ending", ep.getEnding());
                }
            }
        }
        sb.append("\n]");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final void generateJson$appendSegment(Ref.BooleanRef first, StringBuilder sb, String imdb, int sNum, int eNum, String tvdb, String type, TimingSection sec) {
        if (!first.element) {
            sb.append(",\n");
        }
        boolean isNullRecap = false;
        first.element = false;
        int startSec = sec.getHasNot() ? 0 : INSTANCE.parseTimeToSeconds(sec.getStartTime());
        int endSec = sec.getHasNot() ? 0 : INSTANCE.parseTimeToSeconds(sec.getEndTime());
        if (Intrinsics.areEqual(type, "recap") && sec.getHasNot()) {
            isNullRecap = true;
        }
        sb.append("  {\n");
        sb.append("    \"imdb_id\": \"" + imdb + "\",\n");
        sb.append("    \"segment_type\": \"" + type + "\",\n");
        sb.append("    \"season\": " + sNum + ",\n");
        sb.append("    \"episode\": " + eNum + ",\n");
        if (isNullRecap) {
            sb.append("    \"start_sec\": null,\n");
            sb.append("    \"end_sec\": null,\n");
        } else {
            sb.append("    \"start_sec\": " + startSec + ",\n");
            sb.append("    \"end_sec\": " + endSec + ",\n");
        }
        sb.append("    \"tvdb_id\": \"" + tvdb + "\"\n");
        sb.append("  }");
    }

    private final String generateSpreadsheet(List<Series> seriesList) {
        String opStart;
        String opEnd;
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("# BANCO DE MINUTAGENS - PLANILHA CONSOLIDADA\n");
        sb.append("# Formato: Uma aba/seção para cada série cadastrada\n\n");
        Iterator<Series> it = seriesList.iterator();
        while (it.hasNext()) {
            Series series = it.next();
            sb.append("================================================================================\n");
            String upperCase = series.getTitle().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append("[ABA DA PLANILHA: " + upperCase + "]\n");
            sb.append("Série: " + series.getTitle() + " | Ano: " + series.getReleaseYear() + " | Status: " + series.getStatus().name() + " | Total Episódios: " + series.getTotalEpisodes() + "\n");
            String imdbId = series.getImdbId();
            String str4 = "N/A";
            if (StringsKt.isBlank(imdbId)) {
                imdbId = "N/A";
            }
            String tmdbId = series.getTmdbId();
            if (StringsKt.isBlank(tmdbId)) {
                tmdbId = "N/A";
            }
            String tvdbId = series.getTvdbId();
            if (!StringsKt.isBlank(tvdbId)) {
                str4 = tvdbId;
            }
            sb.append("IMDb ID: " + ((Object) imdbId) + " | TMDB ID: " + ((Object) tmdbId) + " | TVDB ID: " + ((Object) str4) + " | ID Interno: " + series.getId() + "\n");
            sb.append("--------------------------------------------------------------------------------\n");
            sb.append("Temporada\tEpisódio\tTítulo\tAbertura Início\tAbertura Fim\tRecap Início\tRecap Fim\tEncerramento Início\tEncerramento Fim\tStatus\tNotas\n");
            Iterator<Season> it2 = series.getSeasons().iterator();
            while (it2.hasNext()) {
                Season season = it2.next();
                List episodes = !season.getEpisodes().isEmpty() ? season.getEpisodes() : season.getTotalEpisodes() > 0 ? EpisodeDataGenerator.INSTANCE.generateEpisodes(season.getId(), season.getTotalEpisodes(), season.getCompletedEpisodes()) : CollectionsKt.emptyList();
                for (Episode ep : episodes) {
                    String sNum = "T" + StringsKt.padStart(String.valueOf(season.getSeasonNumber()), 2, '0');
                    String eNum = ExifInterface.LONGITUDE_EAST + StringsKt.padStart(String.valueOf(ep.getEpisodeNumber()), 2, '0');
                    String title = ep.getTitle();
                    if (StringsKt.isBlank(title)) {
                        title = "Episódio " + ep.getEpisodeNumber();
                    }
                    String epTitle = title;
                    String str5 = "--:--:--";
                    String endEnd = "Não possui";
                    if (ep.getOpening().getHasNot()) {
                        opStart = "Não possui";
                    } else {
                        String startTime = ep.getOpening().getStartTime();
                        if (StringsKt.isBlank(startTime)) {
                            startTime = "--:--:--";
                        }
                        opStart = startTime;
                    }
                    if (ep.getOpening().getHasNot()) {
                        opEnd = "Não possui";
                    } else {
                        String endTime = ep.getOpening().getEndTime();
                        if (StringsKt.isBlank(endTime)) {
                            endTime = "--:--:--";
                        }
                        opEnd = endTime;
                    }
                    if (ep.getRecap().getHasNot()) {
                        str = "Não possui";
                    } else {
                        String startTime2 = ep.getRecap().getStartTime();
                        if (StringsKt.isBlank(startTime2)) {
                            startTime2 = "--:--:--";
                        }
                        str = startTime2;
                    }
                    String recStart = str;
                    if (ep.getRecap().getHasNot()) {
                        str2 = "Não possui";
                    } else {
                        String endTime2 = ep.getRecap().getEndTime();
                        if (StringsKt.isBlank(endTime2)) {
                            endTime2 = "--:--:--";
                        }
                        str2 = endTime2;
                    }
                    String recEnd = str2;
                    if (ep.getEnding().getHasNot()) {
                        str3 = "Não possui";
                    } else {
                        String startTime3 = ep.getEnding().getStartTime();
                        if (StringsKt.isBlank(startTime3)) {
                            startTime3 = "--:--:--";
                        }
                        str3 = startTime3;
                    }
                    String endStart = str3;
                    if (!ep.getEnding().getHasNot()) {
                        String endTime3 = ep.getEnding().getEndTime();
                        if (!StringsKt.isBlank(endTime3)) {
                            str5 = endTime3;
                        }
                        endEnd = str5;
                    }
                    String epStatus = ep.getStatus().getLabel();
                    sb.append(sNum + "\t" + eNum + "\t" + epTitle + "\t" + opStart + "\t" + opEnd + "\t" + recStart + "\t" + recEnd + "\t" + endStart + "\t" + endEnd + "\t" + epStatus + "\n");
                    it = it;
                    series = series;
                    it2 = it2;
                }
            }
            sb.append("\n\n");
            it = it;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final void shareExportContent(Context context, String content, ExportFormat format) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(format, "format");
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        String fileName = "minutagens_export_" + timeStamp + "." + format.getExtension();
        Intent intent = new Intent("android.intent.action.SEND");
        switch (WhenMappings.$EnumSwitchMapping$0[format.ordinal()]) {
            case 1:
                str = "text/csv";
                break;
            case 2:
                str = "application/json";
                break;
            case 3:
                str = "text/plain";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        intent.setType(str);
        intent.putExtra("android.intent.extra.SUBJECT", "Banco de Minutagens - Exportação (" + fileName + ")");
        intent.putExtra("android.intent.extra.TEXT", content);
        Intent chooser = Intent.createChooser(intent, "Compartilhar ou Salvar Minutagens");
        chooser.addFlags(268435456);
        context.startActivity(chooser);
    }
}

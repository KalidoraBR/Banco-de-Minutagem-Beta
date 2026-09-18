package com.example.network;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.example.data.EpisodeDataGenerator;
import com.example.model.ApiConfig;
import com.example.model.Episode;
import com.example.model.Season;
import com.example.model.Series;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GoogleSheetsSyncService.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\tJ,\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/example/network/GoogleSheetsSyncService;", "", "<init>", "()V", "client", "Lokhttp3/OkHttpClient;", "JSON_MEDIA_TYPE", "Lokhttp3/MediaType;", "APPS_SCRIPT_TEMPLATE", "", "buildSpreadsheetPayload", "Lorg/json/JSONObject;", "spreadsheetId", "seriesList", "", "Lcom/example/model/Series;", "secret", "syncAll", "Lcom/example/network/SyncOperationResult;", "context", "Landroid/content/Context;", "config", "Lcom/example/model/ApiConfig;", "(Landroid/content/Context;Ljava/util/List;Lcom/example/model/ApiConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchExistingData", "Lcom/example/network/RemoteQueryResult;", "(Landroid/content/Context;Lcom/example/model/ApiConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "testConnection", "Lcom/example/network/DiagnosticReport;", "(Lcom/example/model/ApiConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendTestPing", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GoogleSheetsSyncService {
    public static final String APPS_SCRIPT_TEMPLATE = "// Google Apps Script para sincronização do Banco de Minutagens\nconst SUMMARY_SHEET = 'Resumo';\n\nfunction doGet(e) {\n  return jsonOutput({\n    ok: true,\n    success: true,\n    service: 'Banco de Minutagens · Google Planilhas',\n    status: 'online',\n    timestamp: new Date().toISOString()\n  });\n}\n\nfunction doPost(e) {\n  try {\n    if (!e || !e.postData || !e.postData.contents) {\n      return jsonOutput({ ok: false, success: false, error: 'Nenhum dado recebido no postData.' });\n    }\n\n    const body = JSON.parse(e.postData.contents || '{}');\n    const expected = PropertiesService.getScriptProperties().getProperty('SYNC_SECRET');\n    if (expected && body.secret !== expected) {\n      return jsonOutput({ ok: false, success: false, error: 'Não autorizado. A chave secreta (SYNC_SECRET) não confere.' });\n    }\n\n    // 1. Tenta abrir por ID se informado no body (garante gravar na planilha configurada)\n    let ss = null;\n    const spreadsheetId = body.spreadsheetId;\n    if (spreadsheetId) {\n      try {\n        const cleanId = String(spreadsheetId).replace(/\\/d\\/([a-zA-Z0-9_-]+)/, '$1').trim();\n        if (cleanId.length > 5) {\n          ss = SpreadsheetApp.openById(cleanId);\n        }\n      } catch (errOpen) {}\n    }\n\n    // 2. Se não abriu por ID, tenta abrir a planilha vinculada ao script\n    if (!ss) {\n      try {\n        ss = SpreadsheetApp.getActiveSpreadsheet();\n      } catch (errAct) {}\n    }\n\n    if (!ss) {\n      return jsonOutput({\n        ok: false,\n        success: false,\n        error: \"Planilha não encontrada pelo ID: '\" + (spreadsheetId || \"vazio\") + \"'. Verifique se o ID está correto ou crie o script dentro da própria planilha em Extensões > Apps Script.\"\n      });\n    }\n\n    // Modo 1: Estrutura completa em árvore (body.data.series ou body.series)\n    const seriesList = (body.data && Array.isArray(body.data.series)) ? body.data.series : (Array.isArray(body.series) ? body.series : []);\n    \n    if (seriesList.length > 0) {\n      syncSummary(ss, seriesList);\n      seriesList.forEach(series => syncSeriesSheet(ss, series));\n      \n      return jsonOutput({\n        ok: true,\n        success: true,\n        message: \"Planilha '\" + ss.getName() + \"' sincronizada com sucesso!\",\n        spreadsheetName: ss.getName(),\n        spreadsheetId: ss.getId(),\n        spreadsheetUrl: ss.getUrl(),\n        syncedAt: new Date().toISOString(),\n        series: seriesList.length,\n        seriesCount: seriesList.length\n      });\n    }\n\n    // Modo 2: Estrutura por abas já montadas (body.sheets)\n    if (body.sheets && Array.isArray(body.sheets) && body.sheets.length > 0) {\n      let totalRows = 0;\n      for (let i = 0; i < body.sheets.length; i++) {\n        const item = body.sheets[i];\n        const tabTitle = safeSheetName(item.tabTitle || ('Série ' + (i + 1)));\n        const sheet = getOrCreateSheet(ss, tabTitle);\n        sheet.clear();\n        if (item.rows && Array.isArray(item.rows) && item.rows.length > 0) {\n          sheet.getRange(1, 1, item.rows.length, item.rows[0].length).setValues(item.rows);\n          totalRows += item.rows.length;\n        }\n      }\n      return jsonOutput({\n        ok: true,\n        success: true,\n        message: \"Planilha '\" + ss.getName() + \"' atualizada com sucesso!\",\n        spreadsheetName: ss.getName(),\n        spreadsheetId: ss.getId(),\n        rowsWritten: totalRows,\n        tabsCount: body.sheets.length\n      });\n    }\n\n    return jsonOutput({ ok: false, success: false, error: 'Nenhum dado de séries ou minutagens foi recebido para gravar.' });\n\n  } catch (error) {\n    return jsonOutput({ ok: false, success: false, error: 'Erro no Apps Script: ' + String(error && error.message || error) });\n  }\n}\n\nfunction jsonOutput(value) {\n  return ContentService.createTextOutput(JSON.stringify(value)).setMimeType(ContentService.MimeType.JSON);\n}\n\nfunction safeSheetName(name, id) {\n  const clean = String(name || 'Série').replace(/[\\\\\\/\\?\\*\\[\\]:]/g, ' ').replace(/\\s+/g, ' ').trim().slice(0, 85) || 'Série';\n  return clean === SUMMARY_SHEET ? clean + ' · Série' : clean;\n}\n\nfunction getOrCreateSheet(ss, name) {\n  return ss.getSheetByName(name) || ss.insertSheet(name);\n}\n\nfunction prepareSheet(sheet, rows, widths) {\n  if (sheet.getFilter()) {\n    try { sheet.getFilter().remove(); } catch (e) {}\n  }\n  sheet.clear();\n  if (!rows || !rows.length) return;\n  sheet.getRange(1, 1, rows.length, rows[0].length).setValues(rows);\n  sheet.setFrozenRows(1);\n  sheet.getRange(1, 1, 1, rows[0].length).setBackground('#16a34a').setFontColor('#ffffff').setFontWeight('bold');\n  if (rows.length > 1) {\n    try { sheet.getRange(1, 1, rows.length, rows[0].length).createFilter(); } catch (e) {}\n  }\n  rows[0].forEach((_, index) => sheet.setColumnWidth(index + 1, widths[index] || 120));\n  sheet.getDataRange().setVerticalAlignment('middle').setWrap(true);\n  for (let row = 2; row <= rows.length; row++) {\n    if (row % 2 === 0) sheet.getRange(row, 1, 1, rows[0].length).setBackground('#f0fdf4');\n  }\n}\n\nfunction syncSummary(ss, seriesList) {\n  const rows = [['Série','IMDb','TVDB','Temporadas','Episódios','Acompanhados','Progresso','Status','Última atualização']];\n  seriesList.forEach(series => {\n    const episodes = (series.seasons || []).reduce((all, season) => all.concat(season.episodes || []), []);\n    const complete = episodes.filter(ep => ['opening','recap','ending'].every(key => isComplete(ep[key]))).length;\n    rows.push([\n      series.name || series.title || '',\n      series.imdbId || '',\n      series.tvdbId || '',\n      (series.seasons || []).length,\n      episodes.length,\n      complete,\n      episodes.length ? Math.round(complete / episodes.length * 100) / 100 : 0,\n      statusLabel(series.status),\n      series.lastActivityAt || new Date().toLocaleString('pt-BR')\n    ]);\n  });\n  const sheet = getOrCreateSheet(ss, SUMMARY_SHEET);\n  prepareSheet(sheet, rows, [220, 110, 100, 95, 90, 105, 90, 110, 160]);\n  if (rows.length > 1) {\n    try { sheet.getRange(2, 7, rows.length - 1, 1).setNumberFormat('0%'); } catch (e) {}\n  }\n}\n\nfunction syncSeriesSheet(ss, series) {\n  const rows = [['Temporada','Episódio','Título','Abertura início','Abertura fim','Recap início','Recap fim','Encerramento início','Encerramento fim','IMDb','TVDB','Atualizado em']];\n  (series.seasons || []).forEach(season => (season.episodes || []).forEach(ep => rows.push([\n    season.number || ('T' + String(season.seasonNumber || 1).padStart(2, '0')),\n    ep.number || ('E' + String(ep.episodeNumber || 1).padStart(2, '0')),\n    ep.name || ep.title || '',\n    value(ep.opening, 'start'),\n    value(ep.opening, 'end'),\n    value(ep.recap, 'start'),\n    value(ep.recap, 'end'),\n    value(ep.ending, 'start'),\n    value(ep.ending, 'end'),\n    series.imdbId || '',\n    series.tvdbId || '',\n    ep.updatedAt || series.lastActivityAt || new Date().toLocaleString('pt-BR')\n  ])));\n  const sheet = getOrCreateSheet(ss, safeSheetName(series.name || series.title, series.id));\n  prepareSheet(sheet, rows, [85, 80, 220, 115, 115, 105, 105, 135, 135, 105, 90, 160]);\n}\n\nfunction value(segment, side) {\n  if (!segment) return '';\n  if (segment.status === 'none' || segment.hasNot === true) return 'Não possui';\n  return segment[side] || (side === 'start' ? segment.startTime : segment.endTime) || '';\n}\n\nfunction isComplete(segment) {\n  if (!segment) return false;\n  return Boolean(segment.status === 'none' || segment.hasNot === true || (segment.start && segment.end) || (segment.startTime && segment.endTime));\n}\n\nfunction statusLabel(status) {\n  return ({ ongoing: 'Em andamento', finished: 'Finalizada', upcoming: 'Em breve', ONGOING: 'Em andamento', FINISHED: 'Finalizada', COMPLETED: 'Finalizada', DROPPED: 'Abandonada', PAUSED: 'Pausada' })[status] || status || '';\n}";
    public static final GoogleSheetsSyncService INSTANCE = new GoogleSheetsSyncService();
    private static final OkHttpClient client = new OkHttpClient.Builder().followRedirects(true).followSslRedirects(true).connectTimeout(15, TimeUnit.SECONDS).readTimeout(25, TimeUnit.SECONDS).writeTimeout(25, TimeUnit.SECONDS).build();
    private static final MediaType JSON_MEDIA_TYPE = MediaType.INSTANCE.get("application/json; charset=utf-8");
    public static final int $stable = 8;

    private GoogleSheetsSyncService() {
    }

    public static /* synthetic */ JSONObject buildSpreadsheetPayload$default(GoogleSheetsSyncService googleSheetsSyncService, String str, List list, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return googleSheetsSyncService.buildSpreadsheetPayload(str, list, str2);
    }

    public final JSONObject buildSpreadsheetPayload(String spreadsheetId, List<Series> seriesList, String secret) {
        Iterator<Season> it;
        Series series;
        JSONObject jSONObject;
        List<Episode> emptyList;
        Object obj;
        String str;
        Iterator<Season> it2;
        List<Episode> emptyList2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        Intrinsics.checkNotNullParameter(spreadsheetId, "spreadsheetId");
        Intrinsics.checkNotNullParameter(seriesList, "seriesList");
        Intrinsics.checkNotNullParameter(secret, "secret");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("action", "sync_sheets");
        jSONObject4.put("secret", StringsKt.trim((CharSequence) secret).toString());
        jSONObject4.put("spreadsheetId", ApiConfig.INSTANCE.extractSpreadsheetId(spreadsheetId));
        jSONObject4.put("timestamp", System.currentTimeMillis());
        jSONObject4.put("totalSeries", seriesList.size());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm", new Locale("pt", "BR"));
        Object format = simpleDateFormat.format(new Date());
        JSONObject jSONObject5 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<Series> it3 = seriesList.iterator();
        JSONObject jSONObject6 = jSONObject4;
        JSONObject jSONObject7 = jSONObject5;
        JSONArray jSONArray2 = jSONArray;
        while (true) {
            boolean hasNext = it3.hasNext();
            String str2 = "Episódio ";
            String str3 = "title";
            String str4 = "name";
            if (!hasNext) {
                break;
            }
            Series next = it3.next();
            JSONObject jSONObject8 = new JSONObject();
            String str5 = "id";
            jSONObject8.put("id", next.getId());
            jSONObject8.put("name", next.getTitle());
            jSONObject8.put("title", next.getTitle());
            jSONObject8.put("imdbId", next.getImdbId());
            jSONObject8.put("tvdbId", next.getTvdbId());
            jSONObject8.put("tmdbId", next.getTmdbId());
            Object lowerCase = next.getStatus().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            jSONObject8.put(NotificationCompat.CATEGORY_STATUS, lowerCase);
            jSONObject8.put("releaseYear", next.getReleaseYear());
            jSONObject8.put("totalEpisodes", next.getTotalEpisodes());
            jSONObject8.put("completedEpisodes", next.getCompletedEpisodes());
            jSONObject8.put("categoryBadge", next.getCategoryBadge());
            jSONObject8.put("lastActivityAt", format);
            JSONObject jSONObject9 = jSONObject8;
            JSONArray jSONArray3 = new JSONArray();
            Iterator<Season> it4 = next.getSeasons().iterator();
            JSONObject jSONObject10 = jSONObject6;
            JSONObject jSONObject11 = jSONObject7;
            JSONArray jSONArray4 = jSONArray2;
            while (it4.hasNext()) {
                Season next2 = it4.next();
                JSONObject jSONObject12 = new JSONObject();
                SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
                jSONObject12.put(str5, next2.getId());
                Iterator<Series> it5 = it3;
                Series series2 = next;
                jSONObject12.put("number", "T" + StringsKt.padStart(String.valueOf(next2.getSeasonNumber()), 2, '0'));
                jSONObject12.put("seasonNumber", next2.getSeasonNumber());
                if (!next2.getEpisodes().isEmpty()) {
                    emptyList2 = next2.getEpisodes();
                    it2 = it4;
                } else if (next2.getTotalEpisodes() > 0) {
                    it2 = it4;
                    emptyList2 = EpisodeDataGenerator.INSTANCE.generateEpisodes(next2.getId(), next2.getTotalEpisodes(), next2.getCompletedEpisodes());
                } else {
                    it2 = it4;
                    emptyList2 = CollectionsKt.emptyList();
                }
                JSONArray jSONArray5 = new JSONArray();
                Iterator<Episode> it6 = emptyList2.iterator();
                JSONObject jSONObject13 = jSONObject9;
                JSONObject jSONObject14 = jSONObject10;
                JSONObject jSONObject15 = jSONObject11;
                JSONArray jSONArray6 = jSONArray4;
                while (it6.hasNext()) {
                    Episode next3 = it6.next();
                    JSONObject jSONObject16 = new JSONObject();
                    List<Episode> list = emptyList2;
                    Iterator<Episode> it7 = it6;
                    jSONObject16.put(str5, next3.getId());
                    String str6 = str5;
                    jSONObject16.put("number", ExifInterface.LONGITUDE_EAST + StringsKt.padStart(String.valueOf(next3.getEpisodeNumber()), 2, '0'));
                    jSONObject16.put("episodeNumber", next3.getEpisodeNumber());
                    String title = next3.getTitle();
                    if (StringsKt.isBlank(title)) {
                        title = str2 + next3.getEpisodeNumber();
                    }
                    jSONObject16.put(str4, title);
                    String title2 = next3.getTitle();
                    if (StringsKt.isBlank(title2)) {
                        title2 = str2 + next3.getEpisodeNumber();
                    }
                    jSONObject16.put(str3, title2);
                    JSONObject jSONObject17 = new JSONObject();
                    String str7 = str4;
                    String str8 = str3;
                    String str9 = str2;
                    JSONObject jSONObject18 = jSONObject14;
                    JSONObject jSONObject19 = jSONObject15;
                    JSONArray jSONArray7 = jSONArray6;
                    String str10 = "";
                    if (next3.getOpening().getHasNot()) {
                        jSONObject17.put(NotificationCompat.CATEGORY_STATUS, "none");
                        jSONObject2 = jSONObject13;
                        jSONObject17.put("hasNot", true);
                        jSONObject17.put("start", "");
                        jSONObject17.put("end", "");
                        jSONObject17.put("startTime", "");
                        jSONObject17.put("endTime", "");
                    } else {
                        jSONObject2 = jSONObject13;
                        jSONObject17.put(NotificationCompat.CATEGORY_STATUS, "normal");
                        jSONObject17.put("hasNot", false);
                        jSONObject17.put("start", next3.getOpening().getStartTime());
                        jSONObject17.put("end", next3.getOpening().getEndTime());
                        jSONObject17.put("startTime", next3.getOpening().getStartTime());
                        jSONObject17.put("endTime", next3.getOpening().getEndTime());
                    }
                    jSONObject16.put("opening", jSONObject17);
                    JSONObject jSONObject20 = new JSONObject();
                    if (next3.getRecap().getHasNot()) {
                        jSONObject20.put(NotificationCompat.CATEGORY_STATUS, "none");
                        jSONObject3 = jSONObject20;
                        jSONObject20.put("hasNot", true);
                        jSONObject20.put("start", "");
                        jSONObject20.put("end", "");
                        jSONObject20.put("startTime", "");
                        jSONObject20.put("endTime", "");
                    } else {
                        jSONObject3 = jSONObject20;
                        jSONObject20.put(NotificationCompat.CATEGORY_STATUS, "normal");
                        jSONObject20.put("hasNot", false);
                        jSONObject20.put("start", next3.getRecap().getStartTime());
                        jSONObject20.put("end", next3.getRecap().getEndTime());
                        jSONObject20.put("startTime", next3.getRecap().getStartTime());
                        jSONObject20.put("endTime", next3.getRecap().getEndTime());
                    }
                    jSONObject16.put("recap", jSONObject3);
                    JSONObject jSONObject21 = new JSONObject();
                    if (next3.getEnding().getHasNot()) {
                        jSONObject21.put(NotificationCompat.CATEGORY_STATUS, "none");
                        jSONObject21.put("hasNot", true);
                        jSONObject21.put("start", "");
                        jSONObject21.put("end", "");
                        jSONObject21.put("startTime", "");
                        jSONObject21.put("endTime", "");
                    } else {
                        jSONObject21.put(NotificationCompat.CATEGORY_STATUS, "normal");
                        jSONObject21.put("hasNot", false);
                        jSONObject21.put("start", next3.getEnding().getStartTime());
                        jSONObject21.put("end", next3.getEnding().getEndTime());
                        jSONObject21.put("startTime", next3.getEnding().getStartTime());
                        jSONObject21.put("endTime", next3.getEnding().getEndTime());
                    }
                    jSONObject16.put("ending", jSONObject21);
                    jSONObject16.put(NotificationCompat.CATEGORY_STATUS, next3.getStatus().getLabel());
                    String note = next3.getNote();
                    if (note != null) {
                        str10 = note;
                    }
                    jSONObject16.put("note", str10);
                    jSONObject16.put("updatedAt", format);
                    jSONArray5.put(jSONObject16);
                    str5 = str6;
                    emptyList2 = list;
                    it6 = it7;
                    jSONObject13 = jSONObject2;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    jSONObject14 = jSONObject18;
                    jSONObject15 = jSONObject19;
                    jSONArray6 = jSONArray7;
                }
                jSONObject12.put("episodes", jSONArray5);
                jSONArray3.put(jSONObject12);
                it4 = it2;
                it3 = it5;
                simpleDateFormat = simpleDateFormat2;
                next = series2;
                str5 = str5;
                jSONObject9 = jSONObject13;
                jSONObject10 = jSONObject14;
                jSONObject11 = jSONObject15;
                jSONArray4 = jSONArray6;
            }
            jSONObject9.put("seasons", jSONArray3);
            jSONArray4.put(jSONObject9);
            jSONObject6 = jSONObject10;
            jSONObject7 = jSONObject11;
            jSONArray2 = jSONArray4;
        }
        String str11 = "Episódio ";
        jSONObject7.put("series", jSONArray2);
        jSONObject6.put("data", jSONObject7);
        JSONArray jSONArray8 = new JSONArray();
        Iterator<Series> it8 = seriesList.iterator();
        JSONObject jSONObject22 = jSONObject7;
        JSONArray jSONArray9 = jSONArray2;
        while (it8.hasNext()) {
            Series next4 = it8.next();
            JSONObject jSONObject23 = new JSONObject();
            String take = StringsKt.take(StringsKt.trim((CharSequence) new Regex("[\\[\\]*?:/\\\\]").replace(next4.getTitle(), ServerSentEventKt.SPACE)).toString(), 85);
            if (StringsKt.isBlank(take)) {
                take = "Série " + next4.getId();
            }
            String str12 = take;
            jSONObject23.put("tabTitle", str12);
            jSONObject23.put("seriesId", next4.getId());
            JSONArray jSONArray10 = new JSONArray();
            JSONArray jSONArray11 = new JSONArray();
            Iterator<Series> it9 = it8;
            jSONArray11.put("Temporada");
            jSONArray11.put("Episódio");
            jSONArray11.put("Título");
            jSONArray11.put("Abertura início");
            jSONArray11.put("Abertura fim");
            jSONArray11.put("Recap início");
            jSONArray11.put("Recap fim");
            jSONArray11.put("Encerramento início");
            jSONArray11.put("Encerramento fim");
            jSONArray11.put("IMDb");
            jSONArray11.put("TVDB");
            jSONArray11.put("Atualizado em");
            jSONArray10.put(jSONArray11);
            Iterator<Season> it10 = next4.getSeasons().iterator();
            JSONObject jSONObject24 = jSONObject22;
            JSONArray jSONArray12 = jSONArray9;
            while (it10.hasNext()) {
                Season next5 = it10.next();
                if (!next5.getEpisodes().isEmpty()) {
                    emptyList = next5.getEpisodes();
                    it = it10;
                    series = next4;
                    jSONObject = jSONObject24;
                } else if (next5.getTotalEpisodes() > 0) {
                    it = it10;
                    series = next4;
                    jSONObject = jSONObject24;
                    emptyList = EpisodeDataGenerator.INSTANCE.generateEpisodes(next5.getId(), next5.getTotalEpisodes(), next5.getCompletedEpisodes());
                } else {
                    it = it10;
                    series = next4;
                    jSONObject = jSONObject24;
                    emptyList = CollectionsKt.emptyList();
                }
                Iterator<Episode> it11 = emptyList.iterator();
                JSONArray jSONArray13 = jSONArray12;
                while (it11.hasNext()) {
                    Episode next6 = it11.next();
                    Iterator<Episode> it12 = it11;
                    String str13 = "T" + StringsKt.padStart(String.valueOf(next5.getSeasonNumber()), 2, '0');
                    JSONArray jSONArray14 = jSONArray13;
                    String str14 = ExifInterface.LONGITUDE_EAST + StringsKt.padStart(String.valueOf(next6.getEpisodeNumber()), 2, '0');
                    String title3 = next6.getTitle();
                    if (StringsKt.isBlank(title3)) {
                        obj = str12;
                        str = str11;
                        title3 = str + next6.getEpisodeNumber();
                    } else {
                        obj = str12;
                        str = str11;
                    }
                    String str15 = title3;
                    String str16 = "Não possui";
                    String startTime = next6.getOpening().getHasNot() ? "Não possui" : next6.getOpening().getStartTime();
                    String endTime = next6.getOpening().getHasNot() ? "Não possui" : next6.getOpening().getEndTime();
                    String startTime2 = next6.getRecap().getHasNot() ? "Não possui" : next6.getRecap().getStartTime();
                    String endTime2 = next6.getRecap().getHasNot() ? "Não possui" : next6.getRecap().getEndTime();
                    String startTime3 = next6.getEnding().getHasNot() ? "Não possui" : next6.getEnding().getStartTime();
                    if (!next6.getEnding().getHasNot()) {
                        str16 = next6.getEnding().getEndTime();
                    }
                    String str17 = str16;
                    JSONArray jSONArray15 = new JSONArray();
                    str11 = str;
                    jSONArray15.put(str13);
                    jSONArray15.put(str14);
                    jSONArray15.put(str15);
                    jSONArray15.put(startTime);
                    jSONArray15.put(endTime);
                    jSONArray15.put(startTime2);
                    jSONArray15.put(endTime2);
                    jSONArray15.put(startTime3);
                    jSONArray15.put(str17);
                    jSONArray15.put(series.getImdbId());
                    jSONArray15.put(series.getTvdbId());
                    jSONArray15.put(format);
                    jSONArray10.put(jSONArray15);
                    it11 = it12;
                    str12 = obj;
                    jSONArray13 = jSONArray14;
                }
                it10 = it;
                next4 = series;
                jSONObject24 = jSONObject;
                jSONArray12 = jSONArray13;
            }
            jSONObject23.put("rows", jSONArray10);
            jSONArray8.put(jSONObject23);
            it8 = it9;
            jSONObject22 = jSONObject24;
            jSONArray9 = jSONArray12;
        }
        jSONObject6.put("sheets", jSONArray8);
        JSONArray jSONArray16 = new JSONArray();
        for (Series series3 : seriesList) {
            JSONObject jSONObject25 = new JSONObject();
            jSONObject25.put("title", series3.getTitle());
            jSONObject25.put("name", series3.getTitle());
            jSONObject25.put("category", series3.getCategoryBadge());
            jSONObject25.put(NotificationCompat.CATEGORY_STATUS, series3.getStatus().name());
            jSONObject25.put("imdbId", series3.getImdbId());
            jSONObject25.put("tvdbId", series3.getTvdbId());
            jSONObject25.put("tmdbId", series3.getTmdbId());
            jSONObject25.put("totalEpisodes", series3.getTotalEpisodes());
            jSONArray16.put(jSONObject25);
        }
        jSONObject6.put("series", jSONArray16);
        return jSONObject6;
    }

    public final Object syncAll(Context context, List<Series> list, ApiConfig config, Continuation<? super SyncOperationResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GoogleSheetsSyncService$syncAll$2(context, config, list, null), continuation);
    }

    public final Object fetchExistingData(Context context, ApiConfig config, Continuation<? super RemoteQueryResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GoogleSheetsSyncService$fetchExistingData$2(context, config, null), continuation);
    }

    public final Object testConnection(ApiConfig config, Continuation<? super DiagnosticReport> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GoogleSheetsSyncService$testConnection$2(config, null), continuation);
    }

    public final Object sendTestPing(Context context, ApiConfig config, Continuation<? super SyncOperationResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GoogleSheetsSyncService$sendTestPing$2(context, config, null), continuation);
    }
}

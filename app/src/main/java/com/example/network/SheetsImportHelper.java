package com.example.network;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.core.app.NotificationCompat;
import com.example.data.SeriesStorage;
import com.example.model.Series;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted:
  classes5.dex
 */
/* loaded from: classes.dex */
public class SheetsImportHelper {
    private static final String FILE_NAME = "banco_minutagens_series.json";
    private static final String TAG = "SheetsImportHelper";
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{2})(?::(\\d{2}))?");
    public static volatile MutableState<List<Series>> activeSeriesState = null;

    public static void registerState(MutableState<List<Series>> mutableState) {
        activeSeriesState = mutableState;
        Log.i(TAG, "[UI_SYNC] activeSeriesState registered successfully!");
    }

    public static void notifyDataChanged(Context context) {
        if (context == null) {
            return;
        }
        try {
            final List<Series> loadSeries = SeriesStorage.INSTANCE.loadSeries(context);
            if (activeSeriesState == null) {
                Log.w(TAG, "[UI_SYNC] activeSeriesState is null, state will be refreshed when screen opens");
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.example.network.SheetsImportHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            SheetsImportHelper.activeSeriesState.setValue(loadSeries);
                            Log.i(SheetsImportHelper.TAG, "[UI_SYNC] activeSeriesState successfully updated with " + loadSeries.size() + " series! Live Compose recomposition triggered.");
                        } catch (Exception e) {
                            Log.e(SheetsImportHelper.TAG, "[UI_SYNC] Failed to set activeSeriesState value", e);
                        }
                    }
                });
            }
        } catch (Exception e) {
            Log.e(TAG, "[UI_SYNC] Error in notifyDataChanged", e);
        }
    }

    public static String performImport(Context context, JSONObject jSONObject, List<String> list) {
        int i;
        long j;
        FileInputStream fileInputStream;
        int i2;
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("series");
                if (optJSONArray == null) {
                    i = 0;
                } else if (optJSONArray.length() == 0) {
                    i = 0;
                } else {
                    File file = new File(context.getFilesDir(), FILE_NAME);
                    Log.i(TAG, "[IMPORT_START] Starting import from spreadsheet. Target file: " + file.getAbsolutePath());
                    Log.i(TAG, "[IMPORT_START] Series count in response: " + optJSONArray.length());
                    JSONArray jSONArray = new JSONArray();
                    long j2 = 0;
                    if (file.exists() && file.length() > 0) {
                        try {
                            fileInputStream = new FileInputStream(file);
                        } catch (Exception e) {
                            Log.e(TAG, "[LOCAL_LOAD] Error reading local JSON, starting fresh array", e);
                            jSONArray = new JSONArray();
                        }
                        try {
                            byte[] bArr = new byte[(int) file.length()];
                            fileInputStream.read(bArr);
                            jSONArray = new JSONArray(new String(bArr, StandardCharsets.UTF_8));
                            Log.i(TAG, "[LOCAL_LOAD] Loaded existing local JSON with " + jSONArray.length() + " series.");
                            fileInputStream.close();
                        } finally {
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } else {
                        Log.i(TAG, "[LOCAL_LOAD] Local file does not exist yet. Will create new.");
                    }
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        j = j2;
                        if (i3 >= optJSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i3);
                        String normalizeTmdbId = normalizeTmdbId(jSONObject3.opt("tmdbId"));
                        String trim = jSONObject3.optString("title", "").trim();
                        JSONArray jSONArray2 = optJSONArray;
                        int optInt = jSONObject3.optInt("releaseYear", 2024);
                        int i7 = i3;
                        String trim2 = jSONObject3.optString("imdbId", "").trim();
                        int i8 = i6;
                        JSONArray optJSONArray2 = jSONObject3.optJSONArray("episodes");
                        if (optJSONArray2 == null) {
                            optJSONArray2 = new JSONArray();
                        }
                        int i9 = i7 + 1;
                        int i10 = i5;
                        int i11 = i4;
                        File file2 = file;
                        Log.i(TAG, "[SERIES_MATCH] Processing series #" + i9 + ": '" + trim + "' | incoming TMDB ID: '" + normalizeTmdbId + "' | episodes incoming: " + optJSONArray2.length());
                        int i12 = 0;
                        while (i12 < jSONArray.length()) {
                            JSONObject jSONObject4 = jSONArray.getJSONObject(i12);
                            String normalizeTmdbId2 = normalizeTmdbId(jSONObject4.opt("tmdbId"));
                            int i13 = i12;
                            String trim3 = jSONObject4.optString("title", "").trim();
                            if (normalizeTmdbId.isEmpty() || normalizeTmdbId2.isEmpty()) {
                                i2 = i9;
                                if (!trim.isEmpty() && normalizeTitle(trim).equalsIgnoreCase(normalizeTitle(trim3))) {
                                    Log.i(TAG, "[SERIES_MATCH] Matched series by Title: '" + trim + "' -> '" + trim3 + "'");
                                    jSONObject2 = jSONObject4;
                                    break;
                                }
                                i12 = i13 + 1;
                                i9 = i2;
                            } else if (!normalizeTmdbId.equals(normalizeTmdbId2)) {
                                i2 = i9;
                                i12 = i13 + 1;
                                i9 = i2;
                            } else {
                                i2 = i9;
                                Log.i(TAG, "[SERIES_MATCH] Matched series by TMDB ID: " + normalizeTmdbId + " -> '" + trim3 + "'");
                                jSONObject2 = jSONObject4;
                                break;
                            }
                        }
                        i2 = i9;
                        jSONObject2 = null;
                        if (jSONObject2 != null) {
                            if (normalizeTmdbId(jSONObject2.opt("tmdbId")).isEmpty() && !normalizeTmdbId.isEmpty()) {
                                jSONObject2.put("tmdbId", normalizeTmdbId);
                            }
                            if (jSONObject2.optString("imdbId", "").trim().isEmpty() && !trim2.isEmpty()) {
                                jSONObject2.put("imdbId", trim2);
                            }
                            if (jSONObject2.optInt("releaseYear", 0) <= 0 && optInt > 0) {
                                jSONObject2.put("releaseYear", optInt);
                            }
                            int mergeEpisodesPreservingExisting = mergeEpisodesPreservingExisting(jSONObject2, optJSONArray2);
                            i6 = i8 + mergeEpisodesPreservingExisting;
                            Log.i(TAG, "[SERIES_UPDATED] Series '" + jSONObject2.optString("title") + "' updated. Merged " + mergeEpisodesPreservingExisting + " episodes.");
                            i4 = i11 + 1;
                            i5 = i10;
                        } else {
                            jSONArray.put(createNewSeries(normalizeTmdbId, trim, optInt, trim2, optJSONArray2));
                            i6 = i8 + optJSONArray2.length();
                            i5 = i10 + 1;
                            Log.i(TAG, "[SERIES_CREATED] Created new series: '" + trim + "' with TMDB ID " + normalizeTmdbId);
                            i4 = i11;
                        }
                        j2 = j;
                        optJSONArray = jSONArray2;
                        file = file2;
                        i3 = i2;
                    }
                    File file3 = file;
                    int i14 = i4;
                    int i15 = i5;
                    int i16 = i6;
                    File file4 = new File(context.getFilesDir(), "banco_minutagens_series.json.tmp");
                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                    try {
                        fileOutputStream.write(jSONArray.toString(2).getBytes(StandardCharsets.UTF_8));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        if (file4.exists() && file4.length() > j) {
                            if (file3.exists()) {
                                file3.delete();
                            }
                            Log.i(TAG, "[FILE_SAVE] Atomic write to target file succeeded: " + file4.renameTo(file3) + " (" + file3.length() + " bytes)");
                            if (file3.exists() && file3.length() > j) {
                                try {
                                    fileInputStream = new FileInputStream(file3);
                                    try {
                                        byte[] bArr2 = new byte[(int) file3.length()];
                                        fileInputStream.read(bArr2);
                                        Log.i(TAG, "[VERIFICATION_OK] File verified successfully on disk! Total series in file: " + new JSONArray(new String(bArr2, StandardCharsets.UTF_8)).length() + " | Path: " + file3.getAbsolutePath());
                                        fileInputStream.close();
                                    } finally {
                                    }
                                } catch (Exception e2) {
                                    Log.e(TAG, "[VERIFICATION_ERR] Error verifying saved file", e2);
                                }
                            }
                            notifyDataChanged(context);
                            String str = "Sincronização concluída: " + i14 + " atualizadas, " + i15 + " novas, " + i16 + " episódios processados.";
                            Log.i(TAG, "[IMPORT_COMPLETE] " + str);
                            return str;
                        }
                        Log.e(TAG, "[FILE_SAVE] Temp file creation failed or empty!");
                        return "Erro ao gravar dados no armazenamento local.";
                    } finally {
                    }
                }
                int size = list != null ? list.size() : i;
                Log.w(TAG, "[IMPORT] No series in rootJson, tabsCount=" + size);
                return "Consulta concluída: Nenhuma série encontrada na planilha (" + size + " abas).";
            } catch (Exception e3) {
                Log.e(TAG, "[IMPORT_ERR] Exception during import", e3);
                return "Erro durante importação: " + e3.getMessage();
            }
        }
        Log.e(TAG, "[IMPORT] Root JSON is null");
        return "Erro: Resposta vazia da planilha.";
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static int mergeEpisodesPreservingExisting(org.json.JSONObject r29, org.json.JSONArray r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.network.SheetsImportHelper.mergeEpisodesPreservingExisting(org.json.JSONObject, org.json.JSONArray):int");
    }

    private static JSONObject mergeTimingSection(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        String trim = jSONObject != null ? jSONObject.optString("start", "").trim() : "";
        String trim2 = jSONObject != null ? jSONObject.optString("end", "").trim() : "";
        if (isNaoPossui(trim) || isNaoPossui(trim2)) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("isFilled", true);
            jSONObject3.put("hasNot", true);
            jSONObject3.put(NotificationCompat.CATEGORY_STATUS, "none");
            jSONObject3.put("startTime", "");
            jSONObject3.put("endTime", "");
            jSONObject3.put("durationFormatted", "Não possui");
            return jSONObject3;
        }
        String extractTime = extractTime(trim);
        String extractTime2 = extractTime(trim2);
        boolean z = jSONObject2 != null && jSONObject2.optBoolean("hasNot", false);
        String trim3 = jSONObject2 != null ? jSONObject2.optString("startTime", "").trim() : "";
        String trim4 = jSONObject2 != null ? jSONObject2.optString("endTime", "").trim() : "";
        if (trim.isEmpty() && trim2.isEmpty()) {
            return (jSONObject2 == null || (!z && trim3.isEmpty() && trim4.isEmpty())) ? createEmptyTimingJson() : jSONObject2;
        }
        if (extractTime == null) {
            extractTime = (trim.isEmpty() && !z) ? trim3 : "";
        }
        if (extractTime2 == null) {
            extractTime2 = (trim2.isEmpty() && !z) ? trim4 : "";
        }
        if (extractTime == null) {
            extractTime = "";
        }
        String str = extractTime2 != null ? extractTime2 : "";
        if (extractTime.isEmpty() && str.isEmpty()) {
            return (jSONObject2 == null || !z) ? createEmptyTimingJson() : jSONObject2;
        }
        String calculateDuration = calculateDuration(extractTime, str);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("isFilled", true);
        jSONObject4.put("hasNot", false);
        jSONObject4.put(NotificationCompat.CATEGORY_STATUS, "normal");
        jSONObject4.put("startTime", extractTime);
        jSONObject4.put("endTime", str);
        jSONObject4.put("durationFormatted", calculateDuration);
        return jSONObject4;
    }

    private static JSONObject createEmptyTimingJson() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isFilled", false);
        jSONObject.put("hasNot", false);
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, "pending");
        jSONObject.put("startTime", "");
        jSONObject.put("endTime", "");
        jSONObject.put("durationFormatted", "");
        return jSONObject;
    }

    private static boolean isTimingCompleted(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("isFilled", false) || jSONObject.optBoolean("hasNot", false);
    }

    public static String extractTime(String str) {
        int parseSafeInt;
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String trim = str.trim();
        if (isNaoPossui(trim)) {
            return null;
        }
        try {
            Matcher matcher = TIME_PATTERN.matcher(trim);
            if (matcher.find()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                if (group != null && group2 != null && group3 != null) {
                    return String.format(Locale.US, "%02d:%02d", Integer.valueOf((parseSafeInt(group, 0) * 60) + parseSafeInt(group2, 0)), Integer.valueOf(parseSafeInt(group3, 0)));
                }
                if (group != null && group2 != null) {
                    return String.format(Locale.US, "%02d:%02d", Integer.valueOf(parseSafeInt(group, 0)), Integer.valueOf(parseSafeInt(group2, 0)));
                }
            }
            String replaceAll = trim.replaceAll("[^0-9]", "");
            if (!replaceAll.isEmpty() && replaceAll.length() <= 6 && (parseSafeInt = parseSafeInt(replaceAll, -1)) >= 0) {
                return String.format(Locale.US, "%02d:%02d", Integer.valueOf(parseSafeInt / 60), Integer.valueOf(parseSafeInt % 60));
            }
        } catch (Exception e) {
            Log.w(TAG, "[EXTRACT_TIME] Error parsing time string '" + str + "'", e);
        }
        return null;
    }

    private static int parseSafeInt(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            String replaceAll = str.trim().replaceAll("[^0-9-]", "");
            if (!replaceAll.isEmpty() && !replaceAll.equals("-")) {
                return Integer.parseInt(replaceAll);
            }
        } catch (Exception e) {
        }
        return i;
    }

    private static boolean isNaoPossui(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        String lowerCase = Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").trim().toLowerCase();
        return lowerCase.contains("nao possui") || lowerCase.equals("nao") || lowerCase.equals("nenhum") || lowerCase.equals("none") || lowerCase.equals("-") || lowerCase.equals("n/a") || lowerCase.equals(AbstractJsonLexerKt.NULL);
    }

    private static String calculateDuration(String str, String str2) {
        int parseSeconds = parseSeconds(str);
        int parseSeconds2 = parseSeconds(str2);
        if (parseSeconds < 0 || parseSeconds2 < parseSeconds) {
            return (parseSeconds < 0 || parseSeconds2 >= 0) ? (parseSeconds >= 0 || parseSeconds2 < 0 || str2 == null) ? "" : str2 : str != null ? str : "";
        }
        int i = parseSeconds2 - parseSeconds;
        return String.format(Locale.US, "%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }

    private static int parseSeconds(String str) {
        String extractTime;
        if (str == null || str.trim().isEmpty() || (extractTime = extractTime(str)) == null || extractTime.trim().isEmpty()) {
            return -1;
        }
        try {
            String[] split = extractTime.split(ServerSentEventKt.COLON);
            if (split.length == 2 && split[0] != null && split[1] != null) {
                int parseSafeInt = parseSafeInt(split[0], -1);
                int parseSafeInt2 = parseSafeInt(split[1], -1);
                if (parseSafeInt >= 0 && parseSafeInt2 >= 0) {
                    return (parseSafeInt * 60) + parseSafeInt2;
                }
            }
        } catch (Exception e) {
        }
        return -1;
    }

    private static JSONObject createNewSeries(String str, String str2, int i, String str3, JSONArray jSONArray) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", UUID.randomUUID().toString());
        if (str2.isEmpty()) {
            str2 = "Série TMDB " + str;
        }
        jSONObject.put("title", str2);
        if (i <= 0) {
            i = 2024;
        }
        jSONObject.put("releaseYear", i);
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, "IN_PROGRESS");
        jSONObject.put("totalEpisodes", 0);
        jSONObject.put("completedEpisodes", 0);
        jSONObject.put("nextEpisodeToFill", "");
        jSONObject.put("lastModifiedTimestamp", System.currentTimeMillis());
        jSONObject.put("categoryBadge", "Geral");
        jSONObject.put("primaryColorHex", 4286331629L);
        jSONObject.put("secondaryColorHex", 4280640491L);
        jSONObject.put("synopsis", "");
        jSONObject.put("posterUrl", "");
        jSONObject.put("backdropUrl", "");
        jSONObject.put("hasTmdb", true);
        jSONObject.put("identifiersSummary", "TMDB: " + str + (!str3.isEmpty() ? " · IMDb: " + str3 : ""));
        jSONObject.put("fixedTimingsActiveCount", 0);
        jSONObject.put("fixedTimingsTotalCount", 3);
        jSONObject.put("tmdbId", str);
        jSONObject.put("imdbId", str3);
        jSONObject.put("tvdbId", "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("opening_name", "Abertura");
        jSONObject2.put("opening_enabled", false);
        jSONObject2.put("opening_duration", "01:00");
        jSONObject2.put("recap_name", "Recap");
        jSONObject2.put("recap_enabled", false);
        jSONObject2.put("recap_duration", "00:30");
        jSONObject2.put("ending_name", "Encerramento");
        jSONObject2.put("ending_enabled", false);
        jSONObject2.put("ending_duration", "00:45");
        jSONObject.put("fixedTimings", jSONObject2);
        jSONObject.put("seasons", new JSONArray());
        mergeEpisodesPreservingExisting(jSONObject, jSONArray);
        return jSONObject;
    }

    public static String normalizeTmdbId(Object obj) {
        if (obj == null) {
            return "";
        }
        String trim = String.valueOf(obj).trim();
        if (trim.endsWith(".0")) {
            trim = trim.substring(0, trim.length() - 2);
        }
        return trim.replaceAll("[^0-9]", "").trim();
    }

    public static String normalizeTitle(String str) {
        if (str == null) {
            return "";
        }
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
    }

    public static int extractNumber(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            String replaceAll = str.replaceAll("[^0-9]", "");
            if (!replaceAll.isEmpty()) {
                return Integer.parseInt(replaceAll);
            }
        } catch (Exception e) {
        }
        return i;
    }
}

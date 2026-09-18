package com.example.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.model.Episode;
import com.example.model.TimingSection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BatchTimingHistoryStorage.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0005J\u0018\u0010\u0013\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0005J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018H\u0002J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/example/data/BatchTimingHistoryStorage;", "", "<init>", "()V", "PREFS_NAME", "", "memoryHistory", "", "Lkotlin/collections/ArrayDeque;", "Lcom/example/data/BatchHistoryRecord;", "recordOperation", "context", "Landroid/content/Context;", "seasonId", "description", "previousEpisodes", "", "Lcom/example/model/Episode;", "popLastOperation", "hasHistory", "", "saveToPreferences", "", "stack", "", "loadFromPreferences", "serializeEpisode", "Lorg/json/JSONObject;", "ep", "serializeTiming", "timing", "Lcom/example/model/TimingSection;", "deserializeEpisode", "obj", "deserializeTiming", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BatchTimingHistoryStorage {
    private static final String PREFS_NAME = "banco_minutagens_batch_history";
    public static final BatchTimingHistoryStorage INSTANCE = new BatchTimingHistoryStorage();
    private static final Map<String, ArrayDeque<BatchHistoryRecord>> memoryHistory = new LinkedHashMap();
    public static final int $stable = 8;

    private BatchTimingHistoryStorage() {
    }

    public final BatchHistoryRecord recordOperation(Context context, String seasonId, String description, List<Episode> previousEpisodes) {
        ArrayDeque arrayDeque;
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(previousEpisodes, "previousEpisodes");
        BatchHistoryRecord record = new BatchHistoryRecord(null, seasonId, 0L, description, previousEpisodes, true, 5, null);
        Map map = memoryHistory;
        ArrayDeque<BatchHistoryRecord> arrayDeque2 = map.get(seasonId);
        if (arrayDeque2 == null) {
            arrayDeque = new ArrayDeque();
            map.put(seasonId, arrayDeque);
        } else {
            arrayDeque = arrayDeque2;
        }
        ArrayDeque stack = arrayDeque;
        stack.addLast(record);
        if (context != null) {
            saveToPreferences(context, seasonId, stack);
        }
        return record;
    }

    public final BatchHistoryRecord popLastOperation(Context context, String seasonId) {
        BatchHistoryRecord record;
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        ArrayDeque stack = memoryHistory.get(seasonId);
        if (stack != null && !stack.isEmpty()) {
            record = stack.removeLast();
        } else {
            record = null;
            if (context != null) {
                List loaded = loadFromPreferences(context, seasonId);
                if (!loaded.isEmpty()) {
                    record = (BatchHistoryRecord) CollectionsKt.last(loaded);
                    List remaining = CollectionsKt.dropLast(loaded, 1);
                    ArrayDeque deque = new ArrayDeque(remaining);
                    memoryHistory.put(seasonId, deque);
                    saveToPreferences(context, seasonId, deque);
                }
            }
        }
        if (context != null && stack != null) {
            saveToPreferences(context, seasonId, stack);
        }
        return record;
    }

    public final boolean hasHistory(Context context, String seasonId) {
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        ArrayDeque<BatchHistoryRecord> arrayDeque = memoryHistory.get(seasonId);
        boolean inMemory = arrayDeque != null && (arrayDeque.isEmpty() ^ true);
        if (inMemory) {
            return true;
        }
        if (context != null) {
            return !loadFromPreferences(context, seasonId).isEmpty();
        }
        return false;
    }

    private final void saveToPreferences(Context context, String seasonId, Collection<BatchHistoryRecord> stack) {
        try {
            SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
            JSONArray jSONArray = new JSONArray();
            for (BatchHistoryRecord batchHistoryRecord : CollectionsKt.takeLast(CollectionsKt.toList(stack), 10)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", batchHistoryRecord.getId());
                jSONObject.put("seasonId", batchHistoryRecord.getSeasonId());
                jSONObject.put("timestamp", batchHistoryRecord.getTimestamp());
                jSONObject.put("description", batchHistoryRecord.getDescription());
                jSONObject.put("isPendingSync", batchHistoryRecord.isPendingSync());
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = batchHistoryRecord.getPreviousEpisodes().iterator();
                while (it.hasNext()) {
                    jSONArray2.put(INSTANCE.serializeEpisode((Episode) it.next()));
                    prefs = prefs;
                }
                jSONObject.put("episodes", jSONArray2);
                jSONArray.put(jSONObject);
                prefs = prefs;
            }
            try {
                prefs.edit().putString(seasonId, jSONArray.toString()).apply();
            } catch (Exception e) {
            }
        } catch (Exception e2) {
        }
    }

    private final List<BatchHistoryRecord> loadFromPreferences(Context context, String seasonId) {
        try {
            SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
            try {
                String raw = prefs.getString(seasonId, null);
                if (raw == null) {
                    return CollectionsKt.emptyList();
                }
                JSONArray array = new JSONArray(raw);
                List result = new ArrayList();
                int i = 0;
                int length = array.length();
                while (i < length) {
                    JSONObject obj = array.getJSONObject(i);
                    JSONArray epArray = obj.getJSONArray("episodes");
                    List episodes = new ArrayList();
                    int length2 = epArray.length();
                    for (int j = 0; j < length2; j++) {
                        try {
                            JSONObject jSONObject = epArray.getJSONObject(j);
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                            episodes.add(deserializeEpisode(jSONObject));
                        } catch (Exception e) {
                            return CollectionsKt.emptyList();
                        }
                    }
                    String optString = obj.optString("id", UUID.randomUUID().toString());
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    String string = obj.getString("seasonId");
                    SharedPreferences prefs2 = prefs;
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String raw2 = raw;
                    long optLong = obj.optLong("timestamp", System.currentTimeMillis());
                    String optString2 = obj.optString("description", "");
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    result.add(new BatchHistoryRecord(optString, string, optLong, optString2, episodes, obj.optBoolean("isPendingSync", true)));
                    i++;
                    prefs = prefs2;
                    raw = raw2;
                }
                return result;
            } catch (Exception e2) {
            }
        } catch (Exception e3) {
        }
    }

    private final JSONObject serializeEpisode(Episode ep) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", ep.getId());
        jSONObject.put("seasonId", ep.getSeasonId());
        jSONObject.put("episodeNumber", ep.getEpisodeNumber());
        jSONObject.put("title", ep.getTitle());
        jSONObject.put("airDate", ep.getAirDate());
        jSONObject.put("isLastEdited", ep.isLastEdited());
        if (ep.getNote() != null) {
            jSONObject.put("note", ep.getNote());
        }
        jSONObject.put("opening", INSTANCE.serializeTiming(ep.getOpening()));
        jSONObject.put("recap", INSTANCE.serializeTiming(ep.getRecap()));
        jSONObject.put("ending", INSTANCE.serializeTiming(ep.getEnding()));
        return jSONObject;
    }

    private final JSONObject serializeTiming(TimingSection timing) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isFilled", timing.isFilled());
        jSONObject.put("hasNot", timing.getHasNot());
        jSONObject.put("startTime", timing.getStartTime());
        jSONObject.put("endTime", timing.getEndTime());
        jSONObject.put("durationFormatted", timing.getDurationFormatted());
        return jSONObject;
    }

    private final Episode deserializeEpisode(JSONObject obj) {
        String string = obj.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = obj.getString("seasonId");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i = obj.getInt("episodeNumber");
        String optString = obj.optString("title", "");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        String optString2 = obj.optString("airDate", "");
        Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
        boolean optBoolean = obj.optBoolean("isLastEdited", false);
        String string3 = obj.has("note") ? obj.getString("note") : null;
        JSONObject jSONObject = obj.getJSONObject("opening");
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        TimingSection deserializeTiming = deserializeTiming(jSONObject);
        JSONObject jSONObject2 = obj.getJSONObject("recap");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
        TimingSection deserializeTiming2 = deserializeTiming(jSONObject2);
        JSONObject jSONObject3 = obj.getJSONObject("ending");
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "getJSONObject(...)");
        return new Episode(string, string2, i, optString, optString2, deserializeTiming, deserializeTiming2, deserializeTiming(jSONObject3), optBoolean, string3);
    }

    private final TimingSection deserializeTiming(JSONObject obj) {
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

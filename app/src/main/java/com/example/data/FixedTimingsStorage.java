package com.example.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.model.FixedTimingsConfig;
import com.example.model.TimingItemConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: FixedTimingsStorage.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/example/data/FixedTimingsStorage;", "", "<init>", "()V", "PREFS_NAME", "", "saveFixedTimings", "", "context", "Landroid/content/Context;", "seriesId", "config", "Lcom/example/model/FixedTimingsConfig;", "loadFixedTimings", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FixedTimingsStorage {
    public static final int $stable = 0;
    public static final FixedTimingsStorage INSTANCE = new FixedTimingsStorage();
    private static final String PREFS_NAME = "banco_minutagens_fixed_timings";

    private FixedTimingsStorage() {
    }

    public final void saveFixedTimings(Context context, String seriesId, FixedTimingsConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
            JSONObject json = new JSONObject();
            json.put("opening_enabled", config.getOpening().isEnabled());
            json.put("opening_duration", config.getOpening().getDurationFormatted());
            json.put("recap_enabled", config.getRecap().isEnabled());
            json.put("recap_duration", config.getRecap().getDurationFormatted());
            json.put("ending_enabled", config.getEnding().isEnabled());
            json.put("ending_duration", config.getEnding().getDurationFormatted());
            prefs.edit().putString(seriesId, json.toString()).apply();
        } catch (Exception e) {
        }
    }

    public final FixedTimingsConfig loadFixedTimings(Context context, String seriesId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        try {
            SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
            String raw = prefs.getString(seriesId, null);
            if (raw == null) {
                return null;
            }
            JSONObject json = new JSONObject(raw);
            boolean optBoolean = json.optBoolean("opening_enabled", false);
            String optString = json.optString("opening_duration", "01:00");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            TimingItemConfig timingItemConfig = new TimingItemConfig("Abertura", optBoolean, optString);
            boolean optBoolean2 = json.optBoolean("recap_enabled", false);
            String optString2 = json.optString("recap_duration", "00:30");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            TimingItemConfig timingItemConfig2 = new TimingItemConfig("Recap", optBoolean2, optString2);
            boolean optBoolean3 = json.optBoolean("ending_enabled", false);
            String optString3 = json.optString("ending_duration", "00:45");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
            return new FixedTimingsConfig(timingItemConfig, timingItemConfig2, new TimingItemConfig("Encerramento", optBoolean3, optString3));
        } catch (Exception e) {
            return null;
        }
    }
}

package com.example.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.model.ApiConfig;
import com.example.model.SheetsIntegrationState;
import com.example.model.SyncConfig;
import com.example.model.SyncConnectionState;
import com.example.network.NetworkMonitor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SyncStorage.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fJ\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/example/data/SyncStorage;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_PENDING_COUNT", "KEY_LAST_SYNC_TIME", "KEY_SHEETS_NAME", "KEY_SHEETS_STATE", "KEY_AUTO_SYNC", "loadSyncConfig", "Lcom/example/model/SyncConfig;", "context", "Landroid/content/Context;", "seriesTitles", "", "saveSyncConfig", "", "config", "incrementPendingCount", "amount", "", "resetPendingCount", "markSyncError", "formatLastSyncTime", "timestamp", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SyncStorage {
    public static final int $stable = 0;
    public static final SyncStorage INSTANCE = new SyncStorage();
    private static final String KEY_AUTO_SYNC = "auto_sync_enabled";
    private static final String KEY_LAST_SYNC_TIME = "last_sync_timestamp";
    private static final String KEY_PENDING_COUNT = "pending_changes_count";
    private static final String KEY_SHEETS_NAME = "spreadsheet_name";
    private static final String KEY_SHEETS_STATE = "sheets_state";
    private static final String PREFS_NAME = "banco_minutagens_sync";

    private SyncStorage() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncConfig loadSyncConfig$default(SyncStorage syncStorage, Context context, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return syncStorage.loadSyncConfig(context, list);
    }

    public final SyncConfig loadSyncConfig(Context context, List<String> seriesTitles) {
        SheetsIntegrationState sheetsIntegrationState;
        SheetsIntegrationState sheetsState;
        SyncConnectionState connectionState;
        String maskedId;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean isConfigured = false;
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        int pendingCount = prefs.getInt(KEY_PENDING_COUNT, 0);
        long lastSync = prefs.getLong(KEY_LAST_SYNC_TIME, 0L);
        String string = prefs.getString(KEY_SHEETS_NAME, "Banco de Minutagens - Oficial");
        String sheetsName = string == null ? "Banco de Minutagens - Oficial" : string;
        String sheetsStateStr = prefs.getString(KEY_SHEETS_STATE, null);
        boolean autoSync = prefs.getBoolean(KEY_AUTO_SYNC, true);
        ApiConfig apiConfig = AppConfigStorage.INSTANCE.loadConfig(context);
        String rawId = StringsKt.trim((CharSequence) apiConfig.getSheetsSpreadsheetId()).toString();
        if (!StringsKt.isBlank(rawId) && !StringsKt.contains((CharSequence) rawId, (CharSequence) "SampleSpreadsheetId", true)) {
            isConfigured = true;
        }
        if (!isConfigured) {
            sheetsState = SheetsIntegrationState.NOT_CONFIGURED;
        } else if (sheetsStateStr != null) {
            try {
                sheetsIntegrationState = SheetsIntegrationState.valueOf(sheetsStateStr);
            } catch (Exception e) {
                sheetsIntegrationState = pendingCount > 0 ? SheetsIntegrationState.CONFIGURED : SheetsIntegrationState.CONNECTED;
            }
            sheetsState = sheetsIntegrationState;
        } else {
            sheetsState = pendingCount > 0 ? SheetsIntegrationState.CONFIGURED : SheetsIntegrationState.CONNECTED;
        }
        if (NetworkMonitor.INSTANCE.isCurrentlyOnline(context)) {
            connectionState = sheetsState == SheetsIntegrationState.ERROR ? SyncConnectionState.ERROR : SyncConnectionState.CONNECTED;
        } else {
            connectionState = SyncConnectionState.OFFLINE;
        }
        if (!StringsKt.isBlank(rawId)) {
            if (rawId.length() > 12) {
                maskedId = StringsKt.take(rawId, 6) + "..." + StringsKt.takeLast(rawId, 5);
            } else {
                maskedId = rawId;
            }
        } else {
            maskedId = "Não configurado";
        }
        List tabs = seriesTitles == null ? CollectionsKt.emptyList() : seriesTitles;
        return new SyncConfig(connectionState, sheetsState, pendingCount, lastSync, sheetsName, maskedId, autoSync, tabs);
    }

    public final void saveSyncConfig(Context context, SyncConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        prefs.edit().putInt(KEY_PENDING_COUNT, config.getPendingChangesCount()).putLong(KEY_LAST_SYNC_TIME, config.getLastSyncTimestamp()).putString(KEY_SHEETS_NAME, config.getSpreadsheetName()).putString(KEY_SHEETS_STATE, config.getSheetsState().name()).putBoolean(KEY_AUTO_SYNC, config.getAutoSyncEnabled()).apply();
    }

    public static /* synthetic */ void incrementPendingCount$default(SyncStorage syncStorage, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        syncStorage.incrementPendingCount(context, i);
    }

    public final void incrementPendingCount(Context context, int amount) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        int current = prefs.getInt(KEY_PENDING_COUNT, 0);
        prefs.edit().putInt(KEY_PENDING_COUNT, current + amount).putString(KEY_SHEETS_STATE, "CONFIGURED").apply();
    }

    public final void resetPendingCount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        prefs.edit().putInt(KEY_PENDING_COUNT, 0).putLong(KEY_LAST_SYNC_TIME, System.currentTimeMillis()).putString(KEY_SHEETS_STATE, "CONNECTED").apply();
    }

    public final void markSyncError(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        prefs.edit().putString(KEY_SHEETS_STATE, "ERROR").apply();
    }

    public final String formatLastSyncTime(long timestamp) {
        if (timestamp <= 0) {
            return "Ainda não sincronizado";
        }
        long now = System.currentTimeMillis();
        long diffMinutes = (now - timestamp) / 60000;
        if (diffMinutes < 1) {
            return "Agora há pouco";
        }
        if (diffMinutes < 60) {
            return "Há " + diffMinutes + " min";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm", new Locale("pt", "BR"));
        String format = sdf.format(new Date(timestamp));
        Intrinsics.checkNotNull(format);
        return format;
    }
}

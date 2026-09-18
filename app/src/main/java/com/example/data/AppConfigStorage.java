package com.example.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.model.ApiConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AppConfigStorage.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rJ\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/data/AppConfigStorage;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_SHEETS_ID", "KEY_SHEETS_WEBHOOK_URL", "KEY_SYNC_SECRET", "KEY_TMDB_KEY", "KEY_FIRST_ACCESS_DONE", "KEY_AUTO_SYNC_STARTUP", "loadConfig", "Lcom/example/model/ApiConfig;", "context", "Landroid/content/Context;", "saveConfig", "", "config", "setFirstAccessCompleted", "completed", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppConfigStorage {
    public static final int $stable = 0;
    public static final AppConfigStorage INSTANCE = new AppConfigStorage();
    private static final String KEY_AUTO_SYNC_STARTUP = "auto_sync_startup";
    private static final String KEY_FIRST_ACCESS_DONE = "first_access_completed";
    private static final String KEY_SHEETS_ID = "sheets_spreadsheet_id";
    private static final String KEY_SHEETS_WEBHOOK_URL = "sheets_webhook_url";
    private static final String KEY_SYNC_SECRET = "sync_secret";
    private static final String KEY_TMDB_KEY = "tmdb_api_key";
    private static final String PREFS_NAME = "banco_minutagens_api_config";

    private AppConfigStorage() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(60:1|(2:2|3)|(2:5|(57:7|(1:9)|(1:11)|12|13|14|(2:16|(50:18|(1:20)|(1:22)|23|24|25|(2:27|(43:29|(1:31)|(1:33)|34|35|(2:37|(1:39))|(1:42)|(1:44)|45|(1:47)|48|(1:50)|51|(1:53)|54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(2:68|(17:70|71|(12:75|76|(7:80|81|(1:83)|84|(3:86|(1:88)|89)|90|91)|93|(1:95)|96|81|(0)|84|(0)|90|91)|98|(1:100)|101|76|(1:97)(8:78|80|81|(0)|84|(0)|90|91)|93|(0)|96|81|(0)|84|(0)|90|91)(1:103))(1:108)|104|(1:106)|107|71|(1:102)(13:73|75|76|(0)(0)|93|(0)|96|81|(0)|84|(0)|90|91)|98|(0)|101|76|(0)(0)|93|(0)|96|81|(0)|84|(0)|90|91))|112|(0)|(0)|34|35|(0)|(0)|(0)|45|(0)|48|(0)|51|(0)|54|(0)|57|(0)|60|(0)|63|(0)|66|(0)(0)|104|(0)|107|71|(0)(0)|98|(0)|101|76|(0)(0)|93|(0)|96|81|(0)|84|(0)|90|91))|116|(0)|(0)|23|24|25|(0)|112|(0)|(0)|34|35|(0)|(0)|(0)|45|(0)|48|(0)|51|(0)|54|(0)|57|(0)|60|(0)|63|(0)|66|(0)(0)|104|(0)|107|71|(0)(0)|98|(0)|101|76|(0)(0)|93|(0)|96|81|(0)|84|(0)|90|91))|120|(0)|(0)|12|13|14|(0)|116|(0)|(0)|23|24|25|(0)|112|(0)|(0)|34|35|(0)|(0)|(0)|45|(0)|48|(0)|51|(0)|54|(0)|57|(0)|60|(0)|63|(0)|66|(0)(0)|104|(0)|107|71|(0)(0)|98|(0)|101|76|(0)(0)|93|(0)|96|81|(0)|84|(0)|90|91) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x009a, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0079, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0059, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: Exception -> 0x0058, TRY_LEAVE, TryCatch #2 {Exception -> 0x0058, blocks: (B:14:0x0038, B:16:0x0044), top: B:13:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: Exception -> 0x0078, TRY_LEAVE, TryCatch #1 {Exception -> 0x0078, blocks: (B:25:0x005e, B:27:0x0064), top: B:24:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[Catch: Exception -> 0x0099, TRY_LEAVE, TryCatch #0 {Exception -> 0x0099, blocks: (B:35:0x007c, B:37:0x0088), top: B:34:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.example.model.ApiConfig loadConfig(android.content.Context r30) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.AppConfigStorage.loadConfig(android.content.Context):com.example.model.ApiConfig");
    }

    public final void saveConfig(Context context, ApiConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        String cleanId = ApiConfig.INSTANCE.extractSpreadsheetId(config.getSheetsSpreadsheetId());
        String webUrl = config.getEffectiveWebHookUrl();
        prefs.edit().putString(KEY_SHEETS_ID, cleanId).putString(KEY_SHEETS_WEBHOOK_URL, webUrl).putString("sheets_api_key", webUrl).putString(KEY_SYNC_SECRET, config.getEffectiveSecret()).putString(KEY_TMDB_KEY, StringsKt.trim((CharSequence) config.getTmdbApiKey()).toString()).putBoolean(KEY_FIRST_ACCESS_DONE, config.isFirstAccessCompleted()).putBoolean(KEY_AUTO_SYNC_STARTUP, config.getAutoSyncOnStartup()).remove("worker_base_url").remove("worker_auth_token").remove("d1_database_name").remove("use_worker_tmdb").remove("use_worker_sheets").apply();
    }

    public static /* synthetic */ void setFirstAccessCompleted$default(AppConfigStorage appConfigStorage, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        appConfigStorage.setFirstAccessCompleted(context, z);
    }

    public final void setFirstAccessCompleted(Context context, boolean completed) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        prefs.edit().putBoolean(KEY_FIRST_ACCESS_DONE, completed).apply();
    }
}

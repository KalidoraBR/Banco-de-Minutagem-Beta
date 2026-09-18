package com.example.data;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemeStorage.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/data/ThemeStorage;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_THEME_MODE", "getPrefs", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "getThemeMode", "Lcom/example/data/AppThemeMode;", "saveThemeMode", "", "mode", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThemeStorage {
    public static final int $stable = 0;
    public static final ThemeStorage INSTANCE = new ThemeStorage();
    private static final String KEY_THEME_MODE = "key_theme_mode";
    private static final String PREFS_NAME = "app_theme_prefs";

    private ThemeStorage() {
    }

    private final SharedPreferences getPrefs(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final AppThemeMode getThemeMode(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String savedName = getPrefs(context).getString(KEY_THEME_MODE, "DARK");
        try {
            return AppThemeMode.valueOf(savedName != null ? savedName : "DARK");
        } catch (Exception e) {
            return AppThemeMode.DARK;
        }
    }

    public final void saveThemeMode(Context context, AppThemeMode mode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        getPrefs(context).edit().putString(KEY_THEME_MODE, mode.name()).apply();
    }
}

package com.example.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ApiConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000e¨\u0006)"}, d2 = {"Lcom/example/model/ApiConfig;", "", "sheetsSpreadsheetId", "", "sheetsWebHookUrl", "sheetsApiKey", "syncSecret", "tmdbApiKey", "isFirstAccessCompleted", "", "autoSyncOnStartup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getSheetsSpreadsheetId", "()Ljava/lang/String;", "getSheetsWebHookUrl", "getSheetsApiKey", "getSyncSecret", "getTmdbApiKey", "()Z", "getAutoSyncOnStartup", "cleanSpreadsheetId", "getCleanSpreadsheetId", "effectiveWebHookUrl", "getEffectiveWebHookUrl", "effectiveSecret", "getEffectiveSecret", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean autoSyncOnStartup;
    private final boolean isFirstAccessCompleted;
    private final String sheetsApiKey;
    private final String sheetsSpreadsheetId;
    private final String sheetsWebHookUrl;
    private final String syncSecret;
    private final String tmdbApiKey;

    public ApiConfig() {
        this(null, null, null, null, null, false, false, 127, null);
    }

    public static /* synthetic */ ApiConfig copy$default(ApiConfig apiConfig, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiConfig.sheetsSpreadsheetId;
        }
        if ((i & 2) != 0) {
            str2 = apiConfig.sheetsWebHookUrl;
        }
        if ((i & 4) != 0) {
            str3 = apiConfig.sheetsApiKey;
        }
        if ((i & 8) != 0) {
            str4 = apiConfig.syncSecret;
        }
        if ((i & 16) != 0) {
            str5 = apiConfig.tmdbApiKey;
        }
        if ((i & 32) != 0) {
            z = apiConfig.isFirstAccessCompleted;
        }
        if ((i & 64) != 0) {
            z2 = apiConfig.autoSyncOnStartup;
        }
        boolean z3 = z;
        boolean z4 = z2;
        String str6 = str5;
        String str7 = str3;
        return apiConfig.copy(str, str2, str7, str4, str6, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSheetsSpreadsheetId() {
        return this.sheetsSpreadsheetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSheetsWebHookUrl() {
        return this.sheetsWebHookUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSheetsApiKey() {
        return this.sheetsApiKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSyncSecret() {
        return this.syncSecret;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTmdbApiKey() {
        return this.tmdbApiKey;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsFirstAccessCompleted() {
        return this.isFirstAccessCompleted;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAutoSyncOnStartup() {
        return this.autoSyncOnStartup;
    }

    public final ApiConfig copy(String sheetsSpreadsheetId, String sheetsWebHookUrl, String sheetsApiKey, String syncSecret, String tmdbApiKey, boolean isFirstAccessCompleted, boolean autoSyncOnStartup) {
        Intrinsics.checkNotNullParameter(sheetsSpreadsheetId, "sheetsSpreadsheetId");
        Intrinsics.checkNotNullParameter(sheetsWebHookUrl, "sheetsWebHookUrl");
        Intrinsics.checkNotNullParameter(sheetsApiKey, "sheetsApiKey");
        Intrinsics.checkNotNullParameter(syncSecret, "syncSecret");
        Intrinsics.checkNotNullParameter(tmdbApiKey, "tmdbApiKey");
        return new ApiConfig(sheetsSpreadsheetId, sheetsWebHookUrl, sheetsApiKey, syncSecret, tmdbApiKey, isFirstAccessCompleted, autoSyncOnStartup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiConfig)) {
            return false;
        }
        ApiConfig apiConfig = (ApiConfig) other;
        return Intrinsics.areEqual(this.sheetsSpreadsheetId, apiConfig.sheetsSpreadsheetId) && Intrinsics.areEqual(this.sheetsWebHookUrl, apiConfig.sheetsWebHookUrl) && Intrinsics.areEqual(this.sheetsApiKey, apiConfig.sheetsApiKey) && Intrinsics.areEqual(this.syncSecret, apiConfig.syncSecret) && Intrinsics.areEqual(this.tmdbApiKey, apiConfig.tmdbApiKey) && this.isFirstAccessCompleted == apiConfig.isFirstAccessCompleted && this.autoSyncOnStartup == apiConfig.autoSyncOnStartup;
    }

    public int hashCode() {
        return (((((((((((this.sheetsSpreadsheetId.hashCode() * 31) + this.sheetsWebHookUrl.hashCode()) * 31) + this.sheetsApiKey.hashCode()) * 31) + this.syncSecret.hashCode()) * 31) + this.tmdbApiKey.hashCode()) * 31) + Boolean.hashCode(this.isFirstAccessCompleted)) * 31) + Boolean.hashCode(this.autoSyncOnStartup);
    }

    public String toString() {
        return "ApiConfig(sheetsSpreadsheetId=" + this.sheetsSpreadsheetId + ", sheetsWebHookUrl=" + this.sheetsWebHookUrl + ", sheetsApiKey=" + this.sheetsApiKey + ", syncSecret=" + this.syncSecret + ", tmdbApiKey=" + this.tmdbApiKey + ", isFirstAccessCompleted=" + this.isFirstAccessCompleted + ", autoSyncOnStartup=" + this.autoSyncOnStartup + ")";
    }

    public ApiConfig(String sheetsSpreadsheetId, String sheetsWebHookUrl, String sheetsApiKey, String syncSecret, String tmdbApiKey, boolean isFirstAccessCompleted, boolean autoSyncOnStartup) {
        Intrinsics.checkNotNullParameter(sheetsSpreadsheetId, "sheetsSpreadsheetId");
        Intrinsics.checkNotNullParameter(sheetsWebHookUrl, "sheetsWebHookUrl");
        Intrinsics.checkNotNullParameter(sheetsApiKey, "sheetsApiKey");
        Intrinsics.checkNotNullParameter(syncSecret, "syncSecret");
        Intrinsics.checkNotNullParameter(tmdbApiKey, "tmdbApiKey");
        this.sheetsSpreadsheetId = sheetsSpreadsheetId;
        this.sheetsWebHookUrl = sheetsWebHookUrl;
        this.sheetsApiKey = sheetsApiKey;
        this.syncSecret = syncSecret;
        this.tmdbApiKey = tmdbApiKey;
        this.isFirstAccessCompleted = isFirstAccessCompleted;
        this.autoSyncOnStartup = autoSyncOnStartup;
    }

    public /* synthetic */ ApiConfig(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "e2832a818c1d5333f2c25eb42abce207" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? true : z2);
    }

    public final String getSheetsSpreadsheetId() {
        return this.sheetsSpreadsheetId;
    }

    public final String getSheetsWebHookUrl() {
        return this.sheetsWebHookUrl;
    }

    public final String getSheetsApiKey() {
        return this.sheetsApiKey;
    }

    public final String getSyncSecret() {
        return this.syncSecret;
    }

    public final String getTmdbApiKey() {
        return this.tmdbApiKey;
    }

    public final boolean isFirstAccessCompleted() {
        return this.isFirstAccessCompleted;
    }

    public final boolean getAutoSyncOnStartup() {
        return this.autoSyncOnStartup;
    }

    public final String getCleanSpreadsheetId() {
        return INSTANCE.extractSpreadsheetId(this.sheetsSpreadsheetId);
    }

    public final String getEffectiveWebHookUrl() {
        String str = this.sheetsWebHookUrl;
        if (StringsKt.isBlank(str)) {
            str = StringsKt.startsWith$default(this.sheetsApiKey, "http", false, 2, (Object) null) ? this.sheetsApiKey : "";
        }
        return StringsKt.trim((CharSequence) str).toString();
    }

    public final String getEffectiveSecret() {
        String str = this.syncSecret;
        if (StringsKt.isBlank(str)) {
            str = !StringsKt.startsWith$default(this.sheetsApiKey, "http", false, 2, (Object) null) ? this.sheetsApiKey : "";
        }
        return StringsKt.trim((CharSequence) str).toString();
    }

    /* compiled from: ApiConfig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/model/ApiConfig$Companion;", "", "<init>", "()V", "extractSpreadsheetId", "", "input", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String extractSpreadsheetId(String input) {
            Intrinsics.checkNotNullParameter(input, "input");
            String trimmed = StringsKt.trim((CharSequence) input).toString();
            if (StringsKt.isBlank(trimmed)) {
                return "";
            }
            MatchResult match = Regex.find$default(new Regex("/spreadsheets/d/([a-zA-Z0-9-_]+)"), trimmed, 0, 2, null);
            if (match != null) {
                return match.getGroupValues().get(1);
            }
            return StringsKt.trim((CharSequence) StringsKt.substringBefore$default(StringsKt.substringBefore$default(StringsKt.substringBefore$default(trimmed, "/", (String) null, 2, (Object) null), "?", (String) null, 2, (Object) null), "#", (String) null, 2, (Object) null)).toString();
        }
    }
}

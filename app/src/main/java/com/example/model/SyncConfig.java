package com.example.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SyncModels.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010HÆ\u0003J_\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006/"}, d2 = {"Lcom/example/model/SyncConfig;", "", "connectionState", "Lcom/example/model/SyncConnectionState;", "sheetsState", "Lcom/example/model/SheetsIntegrationState;", "pendingChangesCount", "", "lastSyncTimestamp", "", "spreadsheetName", "", "spreadsheetIdMasked", "autoSyncEnabled", "", "configuredSeriesTabs", "", "<init>", "(Lcom/example/model/SyncConnectionState;Lcom/example/model/SheetsIntegrationState;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getConnectionState", "()Lcom/example/model/SyncConnectionState;", "getSheetsState", "()Lcom/example/model/SheetsIntegrationState;", "getPendingChangesCount", "()I", "getLastSyncTimestamp", "()J", "getSpreadsheetName", "()Ljava/lang/String;", "getSpreadsheetIdMasked", "getAutoSyncEnabled", "()Z", "getConfiguredSeriesTabs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SyncConfig {
    public static final int $stable = 8;
    private final boolean autoSyncEnabled;
    private final List<String> configuredSeriesTabs;
    private final SyncConnectionState connectionState;
    private final long lastSyncTimestamp;
    private final int pendingChangesCount;
    private final SheetsIntegrationState sheetsState;
    private final String spreadsheetIdMasked;
    private final String spreadsheetName;

    public SyncConfig() {
        this(null, null, 0, 0L, null, null, false, null, 255, null);
    }

    public static /* synthetic */ SyncConfig copy$default(SyncConfig syncConfig, SyncConnectionState syncConnectionState, SheetsIntegrationState sheetsIntegrationState, int i, long j, String str, String str2, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            syncConnectionState = syncConfig.connectionState;
        }
        if ((i2 & 2) != 0) {
            sheetsIntegrationState = syncConfig.sheetsState;
        }
        if ((i2 & 4) != 0) {
            i = syncConfig.pendingChangesCount;
        }
        if ((i2 & 8) != 0) {
            j = syncConfig.lastSyncTimestamp;
        }
        if ((i2 & 16) != 0) {
            str = syncConfig.spreadsheetName;
        }
        if ((i2 & 32) != 0) {
            str2 = syncConfig.spreadsheetIdMasked;
        }
        if ((i2 & 64) != 0) {
            z = syncConfig.autoSyncEnabled;
        }
        if ((i2 & 128) != 0) {
            list = syncConfig.configuredSeriesTabs;
        }
        long j2 = j;
        int i3 = i;
        return syncConfig.copy(syncConnectionState, sheetsIntegrationState, i3, j2, str, str2, z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final SyncConnectionState getConnectionState() {
        return this.connectionState;
    }

    /* renamed from: component2, reason: from getter */
    public final SheetsIntegrationState getSheetsState() {
        return this.sheetsState;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPendingChangesCount() {
        return this.pendingChangesCount;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLastSyncTimestamp() {
        return this.lastSyncTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSpreadsheetName() {
        return this.spreadsheetName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSpreadsheetIdMasked() {
        return this.spreadsheetIdMasked;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAutoSyncEnabled() {
        return this.autoSyncEnabled;
    }

    public final List<String> component8() {
        return this.configuredSeriesTabs;
    }

    public final SyncConfig copy(SyncConnectionState connectionState, SheetsIntegrationState sheetsState, int pendingChangesCount, long lastSyncTimestamp, String spreadsheetName, String spreadsheetIdMasked, boolean autoSyncEnabled, List<String> configuredSeriesTabs) {
        Intrinsics.checkNotNullParameter(connectionState, "connectionState");
        Intrinsics.checkNotNullParameter(sheetsState, "sheetsState");
        Intrinsics.checkNotNullParameter(spreadsheetName, "spreadsheetName");
        Intrinsics.checkNotNullParameter(spreadsheetIdMasked, "spreadsheetIdMasked");
        Intrinsics.checkNotNullParameter(configuredSeriesTabs, "configuredSeriesTabs");
        return new SyncConfig(connectionState, sheetsState, pendingChangesCount, lastSyncTimestamp, spreadsheetName, spreadsheetIdMasked, autoSyncEnabled, configuredSeriesTabs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncConfig)) {
            return false;
        }
        SyncConfig syncConfig = (SyncConfig) other;
        return this.connectionState == syncConfig.connectionState && this.sheetsState == syncConfig.sheetsState && this.pendingChangesCount == syncConfig.pendingChangesCount && this.lastSyncTimestamp == syncConfig.lastSyncTimestamp && Intrinsics.areEqual(this.spreadsheetName, syncConfig.spreadsheetName) && Intrinsics.areEqual(this.spreadsheetIdMasked, syncConfig.spreadsheetIdMasked) && this.autoSyncEnabled == syncConfig.autoSyncEnabled && Intrinsics.areEqual(this.configuredSeriesTabs, syncConfig.configuredSeriesTabs);
    }

    public int hashCode() {
        return (((((((((((((this.connectionState.hashCode() * 31) + this.sheetsState.hashCode()) * 31) + Integer.hashCode(this.pendingChangesCount)) * 31) + Long.hashCode(this.lastSyncTimestamp)) * 31) + this.spreadsheetName.hashCode()) * 31) + this.spreadsheetIdMasked.hashCode()) * 31) + Boolean.hashCode(this.autoSyncEnabled)) * 31) + this.configuredSeriesTabs.hashCode();
    }

    public String toString() {
        return "SyncConfig(connectionState=" + this.connectionState + ", sheetsState=" + this.sheetsState + ", pendingChangesCount=" + this.pendingChangesCount + ", lastSyncTimestamp=" + this.lastSyncTimestamp + ", spreadsheetName=" + this.spreadsheetName + ", spreadsheetIdMasked=" + this.spreadsheetIdMasked + ", autoSyncEnabled=" + this.autoSyncEnabled + ", configuredSeriesTabs=" + this.configuredSeriesTabs + ")";
    }

    public SyncConfig(SyncConnectionState connectionState, SheetsIntegrationState sheetsState, int pendingChangesCount, long lastSyncTimestamp, String spreadsheetName, String spreadsheetIdMasked, boolean autoSyncEnabled, List<String> configuredSeriesTabs) {
        Intrinsics.checkNotNullParameter(connectionState, "connectionState");
        Intrinsics.checkNotNullParameter(sheetsState, "sheetsState");
        Intrinsics.checkNotNullParameter(spreadsheetName, "spreadsheetName");
        Intrinsics.checkNotNullParameter(spreadsheetIdMasked, "spreadsheetIdMasked");
        Intrinsics.checkNotNullParameter(configuredSeriesTabs, "configuredSeriesTabs");
        this.connectionState = connectionState;
        this.sheetsState = sheetsState;
        this.pendingChangesCount = pendingChangesCount;
        this.lastSyncTimestamp = lastSyncTimestamp;
        this.spreadsheetName = spreadsheetName;
        this.spreadsheetIdMasked = spreadsheetIdMasked;
        this.autoSyncEnabled = autoSyncEnabled;
        this.configuredSeriesTabs = configuredSeriesTabs;
    }

    public /* synthetic */ SyncConfig(SyncConnectionState syncConnectionState, SheetsIntegrationState sheetsIntegrationState, int i, long j, String str, String str2, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? SyncConnectionState.CONNECTED : syncConnectionState, (i2 & 2) != 0 ? SheetsIntegrationState.CONNECTED : sheetsIntegrationState, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? System.currentTimeMillis() - 900000 : j, (i2 & 16) != 0 ? "Banco de Minutagens - Oficial" : str, (i2 & 32) != 0 ? "1BxiMVs0XRA5n...8K9qZ" : str2, (i2 & 64) != 0 ? true : z, (i2 & 128) != 0 ? CollectionsKt.listOf((Object[]) new String[]{"Power Rangers", "Kamen Rider Wizard"}) : list);
    }

    public final SyncConnectionState getConnectionState() {
        return this.connectionState;
    }

    public final SheetsIntegrationState getSheetsState() {
        return this.sheetsState;
    }

    public final int getPendingChangesCount() {
        return this.pendingChangesCount;
    }

    public final long getLastSyncTimestamp() {
        return this.lastSyncTimestamp;
    }

    public final String getSpreadsheetName() {
        return this.spreadsheetName;
    }

    public final String getSpreadsheetIdMasked() {
        return this.spreadsheetIdMasked;
    }

    public final boolean getAutoSyncEnabled() {
        return this.autoSyncEnabled;
    }

    public final List<String> getConfiguredSeriesTabs() {
        return this.configuredSeriesTabs;
    }
}

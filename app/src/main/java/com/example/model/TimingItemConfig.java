package com.example.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Series.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/example/model/TimingItemConfig;", "", "name", "", "isEnabled", "", "durationFormatted", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "()Z", "getDurationFormatted", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TimingItemConfig {
    public static final int $stable = 0;
    private final String durationFormatted;
    private final boolean isEnabled;
    private final String name;

    public static /* synthetic */ TimingItemConfig copy$default(TimingItemConfig timingItemConfig, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timingItemConfig.name;
        }
        if ((i & 2) != 0) {
            z = timingItemConfig.isEnabled;
        }
        if ((i & 4) != 0) {
            str2 = timingItemConfig.durationFormatted;
        }
        return timingItemConfig.copy(str, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDurationFormatted() {
        return this.durationFormatted;
    }

    public final TimingItemConfig copy(String name, boolean isEnabled, String durationFormatted) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(durationFormatted, "durationFormatted");
        return new TimingItemConfig(name, isEnabled, durationFormatted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimingItemConfig)) {
            return false;
        }
        TimingItemConfig timingItemConfig = (TimingItemConfig) other;
        return Intrinsics.areEqual(this.name, timingItemConfig.name) && this.isEnabled == timingItemConfig.isEnabled && Intrinsics.areEqual(this.durationFormatted, timingItemConfig.durationFormatted);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.durationFormatted.hashCode();
    }

    public String toString() {
        return "TimingItemConfig(name=" + this.name + ", isEnabled=" + this.isEnabled + ", durationFormatted=" + this.durationFormatted + ")";
    }

    public TimingItemConfig(String name, boolean isEnabled, String durationFormatted) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(durationFormatted, "durationFormatted");
        this.name = name;
        this.isEnabled = isEnabled;
        this.durationFormatted = durationFormatted;
    }

    public /* synthetic */ TimingItemConfig(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "00:00" : str2);
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final String getDurationFormatted() {
        return this.durationFormatted;
    }
}

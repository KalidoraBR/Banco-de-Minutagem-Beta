package com.example.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Episode.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/example/model/TimingSection;", "", "isFilled", "", "hasNot", "startTime", "", "endTime", "durationFormatted", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getHasNot", "getStartTime", "()Ljava/lang/String;", "getEndTime", "getDurationFormatted", "isCompleted", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TimingSection {
    public static final int $stable = 0;
    private final String durationFormatted;
    private final String endTime;
    private final boolean hasNot;
    private final boolean isFilled;
    private final String startTime;

    public TimingSection() {
        this(false, false, null, null, null, 31, null);
    }

    public static /* synthetic */ TimingSection copy$default(TimingSection timingSection, boolean z, boolean z2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = timingSection.isFilled;
        }
        if ((i & 2) != 0) {
            z2 = timingSection.hasNot;
        }
        if ((i & 4) != 0) {
            str = timingSection.startTime;
        }
        if ((i & 8) != 0) {
            str2 = timingSection.endTime;
        }
        if ((i & 16) != 0) {
            str3 = timingSection.durationFormatted;
        }
        String str4 = str3;
        String str5 = str;
        return timingSection.copy(z, z2, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFilled() {
        return this.isFilled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasNot() {
        return this.hasNot;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDurationFormatted() {
        return this.durationFormatted;
    }

    public final TimingSection copy(boolean isFilled, boolean hasNot, String startTime, String endTime, String durationFormatted) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(durationFormatted, "durationFormatted");
        return new TimingSection(isFilled, hasNot, startTime, endTime, durationFormatted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimingSection)) {
            return false;
        }
        TimingSection timingSection = (TimingSection) other;
        return this.isFilled == timingSection.isFilled && this.hasNot == timingSection.hasNot && Intrinsics.areEqual(this.startTime, timingSection.startTime) && Intrinsics.areEqual(this.endTime, timingSection.endTime) && Intrinsics.areEqual(this.durationFormatted, timingSection.durationFormatted);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isFilled) * 31) + Boolean.hashCode(this.hasNot)) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.durationFormatted.hashCode();
    }

    public String toString() {
        return "TimingSection(isFilled=" + this.isFilled + ", hasNot=" + this.hasNot + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", durationFormatted=" + this.durationFormatted + ")";
    }

    public TimingSection(boolean isFilled, boolean hasNot, String startTime, String endTime, String durationFormatted) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(durationFormatted, "durationFormatted");
        this.isFilled = isFilled;
        this.hasNot = hasNot;
        this.startTime = startTime;
        this.endTime = endTime;
        this.durationFormatted = durationFormatted;
    }

    public /* synthetic */ TimingSection(boolean z, boolean z2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }

    public final boolean isFilled() {
        return this.isFilled;
    }

    public final boolean getHasNot() {
        return this.hasNot;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getDurationFormatted() {
        return this.durationFormatted;
    }

    public final boolean isCompleted() {
        return this.isFilled || this.hasNot;
    }
}

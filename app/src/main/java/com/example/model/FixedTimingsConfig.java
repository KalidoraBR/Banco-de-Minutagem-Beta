package com.example.model;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Series.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\rHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/example/model/FixedTimingsConfig;", "", "opening", "Lcom/example/model/TimingItemConfig;", "recap", "ending", "<init>", "(Lcom/example/model/TimingItemConfig;Lcom/example/model/TimingItemConfig;Lcom/example/model/TimingItemConfig;)V", "getOpening", "()Lcom/example/model/TimingItemConfig;", "getRecap", "getEnding", "activeCount", "", "getActiveCount", "()I", "totalCount", "getTotalCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FixedTimingsConfig {
    public static final int $stable = 0;
    private final TimingItemConfig ending;
    private final TimingItemConfig opening;
    private final TimingItemConfig recap;

    public FixedTimingsConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ FixedTimingsConfig copy$default(FixedTimingsConfig fixedTimingsConfig, TimingItemConfig timingItemConfig, TimingItemConfig timingItemConfig2, TimingItemConfig timingItemConfig3, int i, Object obj) {
        if ((i & 1) != 0) {
            timingItemConfig = fixedTimingsConfig.opening;
        }
        if ((i & 2) != 0) {
            timingItemConfig2 = fixedTimingsConfig.recap;
        }
        if ((i & 4) != 0) {
            timingItemConfig3 = fixedTimingsConfig.ending;
        }
        return fixedTimingsConfig.copy(timingItemConfig, timingItemConfig2, timingItemConfig3);
    }

    /* renamed from: component1, reason: from getter */
    public final TimingItemConfig getOpening() {
        return this.opening;
    }

    /* renamed from: component2, reason: from getter */
    public final TimingItemConfig getRecap() {
        return this.recap;
    }

    /* renamed from: component3, reason: from getter */
    public final TimingItemConfig getEnding() {
        return this.ending;
    }

    public final FixedTimingsConfig copy(TimingItemConfig opening, TimingItemConfig recap, TimingItemConfig ending) {
        Intrinsics.checkNotNullParameter(opening, "opening");
        Intrinsics.checkNotNullParameter(recap, "recap");
        Intrinsics.checkNotNullParameter(ending, "ending");
        return new FixedTimingsConfig(opening, recap, ending);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FixedTimingsConfig)) {
            return false;
        }
        FixedTimingsConfig fixedTimingsConfig = (FixedTimingsConfig) other;
        return Intrinsics.areEqual(this.opening, fixedTimingsConfig.opening) && Intrinsics.areEqual(this.recap, fixedTimingsConfig.recap) && Intrinsics.areEqual(this.ending, fixedTimingsConfig.ending);
    }

    public int hashCode() {
        return (((this.opening.hashCode() * 31) + this.recap.hashCode()) * 31) + this.ending.hashCode();
    }

    public String toString() {
        return "FixedTimingsConfig(opening=" + this.opening + ", recap=" + this.recap + ", ending=" + this.ending + ")";
    }

    public FixedTimingsConfig(TimingItemConfig opening, TimingItemConfig recap, TimingItemConfig ending) {
        Intrinsics.checkNotNullParameter(opening, "opening");
        Intrinsics.checkNotNullParameter(recap, "recap");
        Intrinsics.checkNotNullParameter(ending, "ending");
        this.opening = opening;
        this.recap = recap;
        this.ending = ending;
    }

    public /* synthetic */ FixedTimingsConfig(TimingItemConfig timingItemConfig, TimingItemConfig timingItemConfig2, TimingItemConfig timingItemConfig3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TimingItemConfig("Abertura", false, null, 6, null) : timingItemConfig, (i & 2) != 0 ? new TimingItemConfig("Recap", false, null, 6, null) : timingItemConfig2, (i & 4) != 0 ? new TimingItemConfig("Encerramento", false, null, 6, null) : timingItemConfig3);
    }

    public final TimingItemConfig getOpening() {
        return this.opening;
    }

    public final TimingItemConfig getRecap() {
        return this.recap;
    }

    public final TimingItemConfig getEnding() {
        return this.ending;
    }

    public final int getActiveCount() {
        int i = 0;
        Iterable listOf = CollectionsKt.listOf((Object[]) new TimingItemConfig[]{this.opening, this.recap, this.ending});
        if (!(listOf instanceof Collection) || !((Collection) listOf).isEmpty()) {
            i = 0;
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (((TimingItemConfig) it.next()).isEnabled() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i;
    }

    public final int getTotalCount() {
        return 3;
    }
}

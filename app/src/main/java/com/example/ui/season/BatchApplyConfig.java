package com.example.ui.season;

import com.example.model.Episode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchTimingModal.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/example/ui/season/BatchApplyConfig;", "", "sourceEpisode", "Lcom/example/model/Episode;", "startEpisode", "", "endEpisode", "copyOpening", "", "copyRecap", "copyEnding", "mode", "Lcom/example/ui/season/BatchApplyMode;", "summaryText", "", "<init>", "(Lcom/example/model/Episode;IIZZZLcom/example/ui/season/BatchApplyMode;Ljava/lang/String;)V", "getSourceEpisode", "()Lcom/example/model/Episode;", "getStartEpisode", "()I", "getEndEpisode", "getCopyOpening", "()Z", "getCopyRecap", "getCopyEnding", "getMode", "()Lcom/example/ui/season/BatchApplyMode;", "getSummaryText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BatchApplyConfig {
    public static final int $stable = 0;
    private final boolean copyEnding;
    private final boolean copyOpening;
    private final boolean copyRecap;
    private final int endEpisode;
    private final BatchApplyMode mode;
    private final Episode sourceEpisode;
    private final int startEpisode;
    private final String summaryText;

    public static /* synthetic */ BatchApplyConfig copy$default(BatchApplyConfig batchApplyConfig, Episode episode, int i, int i2, boolean z, boolean z2, boolean z3, BatchApplyMode batchApplyMode, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            episode = batchApplyConfig.sourceEpisode;
        }
        if ((i3 & 2) != 0) {
            i = batchApplyConfig.startEpisode;
        }
        if ((i3 & 4) != 0) {
            i2 = batchApplyConfig.endEpisode;
        }
        if ((i3 & 8) != 0) {
            z = batchApplyConfig.copyOpening;
        }
        if ((i3 & 16) != 0) {
            z2 = batchApplyConfig.copyRecap;
        }
        if ((i3 & 32) != 0) {
            z3 = batchApplyConfig.copyEnding;
        }
        if ((i3 & 64) != 0) {
            batchApplyMode = batchApplyConfig.mode;
        }
        if ((i3 & 128) != 0) {
            str = batchApplyConfig.summaryText;
        }
        BatchApplyMode batchApplyMode2 = batchApplyMode;
        String str2 = str;
        boolean z4 = z2;
        boolean z5 = z3;
        return batchApplyConfig.copy(episode, i, i2, z, z4, z5, batchApplyMode2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Episode getSourceEpisode() {
        return this.sourceEpisode;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartEpisode() {
        return this.startEpisode;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEndEpisode() {
        return this.endEpisode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCopyOpening() {
        return this.copyOpening;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCopyRecap() {
        return this.copyRecap;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCopyEnding() {
        return this.copyEnding;
    }

    /* renamed from: component7, reason: from getter */
    public final BatchApplyMode getMode() {
        return this.mode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSummaryText() {
        return this.summaryText;
    }

    public final BatchApplyConfig copy(Episode sourceEpisode, int startEpisode, int endEpisode, boolean copyOpening, boolean copyRecap, boolean copyEnding, BatchApplyMode mode, String summaryText) {
        Intrinsics.checkNotNullParameter(sourceEpisode, "sourceEpisode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        return new BatchApplyConfig(sourceEpisode, startEpisode, endEpisode, copyOpening, copyRecap, copyEnding, mode, summaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchApplyConfig)) {
            return false;
        }
        BatchApplyConfig batchApplyConfig = (BatchApplyConfig) other;
        return Intrinsics.areEqual(this.sourceEpisode, batchApplyConfig.sourceEpisode) && this.startEpisode == batchApplyConfig.startEpisode && this.endEpisode == batchApplyConfig.endEpisode && this.copyOpening == batchApplyConfig.copyOpening && this.copyRecap == batchApplyConfig.copyRecap && this.copyEnding == batchApplyConfig.copyEnding && this.mode == batchApplyConfig.mode && Intrinsics.areEqual(this.summaryText, batchApplyConfig.summaryText);
    }

    public int hashCode() {
        return (((((((((((((this.sourceEpisode.hashCode() * 31) + Integer.hashCode(this.startEpisode)) * 31) + Integer.hashCode(this.endEpisode)) * 31) + Boolean.hashCode(this.copyOpening)) * 31) + Boolean.hashCode(this.copyRecap)) * 31) + Boolean.hashCode(this.copyEnding)) * 31) + this.mode.hashCode()) * 31) + this.summaryText.hashCode();
    }

    public String toString() {
        return "BatchApplyConfig(sourceEpisode=" + this.sourceEpisode + ", startEpisode=" + this.startEpisode + ", endEpisode=" + this.endEpisode + ", copyOpening=" + this.copyOpening + ", copyRecap=" + this.copyRecap + ", copyEnding=" + this.copyEnding + ", mode=" + this.mode + ", summaryText=" + this.summaryText + ")";
    }

    public BatchApplyConfig(Episode sourceEpisode, int startEpisode, int endEpisode, boolean copyOpening, boolean copyRecap, boolean copyEnding, BatchApplyMode mode, String summaryText) {
        Intrinsics.checkNotNullParameter(sourceEpisode, "sourceEpisode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        this.sourceEpisode = sourceEpisode;
        this.startEpisode = startEpisode;
        this.endEpisode = endEpisode;
        this.copyOpening = copyOpening;
        this.copyRecap = copyRecap;
        this.copyEnding = copyEnding;
        this.mode = mode;
        this.summaryText = summaryText;
    }

    public final Episode getSourceEpisode() {
        return this.sourceEpisode;
    }

    public final int getStartEpisode() {
        return this.startEpisode;
    }

    public final int getEndEpisode() {
        return this.endEpisode;
    }

    public final boolean getCopyOpening() {
        return this.copyOpening;
    }

    public final boolean getCopyRecap() {
        return this.copyRecap;
    }

    public final boolean getCopyEnding() {
        return this.copyEnding;
    }

    public final BatchApplyMode getMode() {
        return this.mode;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }
}

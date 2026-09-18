package com.example.data;

import com.example.model.Episode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeriesContinuityManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/example/data/ContinuityTarget;", "", "code", "", "seasonNumber", "", "episodeNumber", "seasonId", "episodeId", "episode", "Lcom/example/model/Episode;", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/example/model/Episode;)V", "getCode", "()Ljava/lang/String;", "getSeasonNumber", "()I", "getEpisodeNumber", "getSeasonId", "getEpisodeId", "getEpisode", "()Lcom/example/model/Episode;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ContinuityTarget {
    public static final int $stable = 0;
    private final String code;
    private final Episode episode;
    private final String episodeId;
    private final int episodeNumber;
    private final String seasonId;
    private final int seasonNumber;

    public static /* synthetic */ ContinuityTarget copy$default(ContinuityTarget continuityTarget, String str, int i, int i2, String str2, String str3, Episode episode, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = continuityTarget.code;
        }
        if ((i3 & 2) != 0) {
            i = continuityTarget.seasonNumber;
        }
        if ((i3 & 4) != 0) {
            i2 = continuityTarget.episodeNumber;
        }
        if ((i3 & 8) != 0) {
            str2 = continuityTarget.seasonId;
        }
        if ((i3 & 16) != 0) {
            str3 = continuityTarget.episodeId;
        }
        if ((i3 & 32) != 0) {
            episode = continuityTarget.episode;
        }
        String str4 = str3;
        Episode episode2 = episode;
        return continuityTarget.copy(str, i, i2, str2, str4, episode2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeasonNumber() {
        return this.seasonNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSeasonId() {
        return this.seasonId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEpisodeId() {
        return this.episodeId;
    }

    /* renamed from: component6, reason: from getter */
    public final Episode getEpisode() {
        return this.episode;
    }

    public final ContinuityTarget copy(String code, int seasonNumber, int episodeNumber, String seasonId, String episodeId, Episode episode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        Intrinsics.checkNotNullParameter(episodeId, "episodeId");
        return new ContinuityTarget(code, seasonNumber, episodeNumber, seasonId, episodeId, episode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContinuityTarget)) {
            return false;
        }
        ContinuityTarget continuityTarget = (ContinuityTarget) other;
        return Intrinsics.areEqual(this.code, continuityTarget.code) && this.seasonNumber == continuityTarget.seasonNumber && this.episodeNumber == continuityTarget.episodeNumber && Intrinsics.areEqual(this.seasonId, continuityTarget.seasonId) && Intrinsics.areEqual(this.episodeId, continuityTarget.episodeId) && Intrinsics.areEqual(this.episode, continuityTarget.episode);
    }

    public int hashCode() {
        return (((((((((this.code.hashCode() * 31) + Integer.hashCode(this.seasonNumber)) * 31) + Integer.hashCode(this.episodeNumber)) * 31) + this.seasonId.hashCode()) * 31) + this.episodeId.hashCode()) * 31) + (this.episode == null ? 0 : this.episode.hashCode());
    }

    public String toString() {
        return "ContinuityTarget(code=" + this.code + ", seasonNumber=" + this.seasonNumber + ", episodeNumber=" + this.episodeNumber + ", seasonId=" + this.seasonId + ", episodeId=" + this.episodeId + ", episode=" + this.episode + ")";
    }

    public ContinuityTarget(String code, int seasonNumber, int episodeNumber, String seasonId, String episodeId, Episode episode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        Intrinsics.checkNotNullParameter(episodeId, "episodeId");
        this.code = code;
        this.seasonNumber = seasonNumber;
        this.episodeNumber = episodeNumber;
        this.seasonId = seasonId;
        this.episodeId = episodeId;
        this.episode = episode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ContinuityTarget(java.lang.String r8, int r9, int r10, java.lang.String r11, java.lang.String r12, com.example.model.Episode r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r14 = r14 & 32
            if (r14 == 0) goto L7
            r13 = 0
            r6 = r13
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.ContinuityTarget.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, com.example.model.Episode, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCode() {
        return this.code;
    }

    public final int getSeasonNumber() {
        return this.seasonNumber;
    }

    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final String getSeasonId() {
        return this.seasonId;
    }

    public final String getEpisodeId() {
        return this.episodeId;
    }

    public final Episode getEpisode() {
        return this.episode;
    }
}

package com.example.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pendency.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J|\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\bHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"}, d2 = {"Lcom/example/model/PendencyItem;", "", "id", "", "seriesId", "seriesTitle", "seasonId", "seasonNumber", "", "episodeId", "episodeNumber", "episodeTitle", LinkHeader.Parameters.Type, "Lcom/example/model/PendencyType;", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/example/model/PendencyType;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSeriesId", "getSeriesTitle", "getSeasonId", "getSeasonNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEpisodeId", "getEpisodeNumber", "getEpisodeTitle", "getType", "()Lcom/example/model/PendencyType;", "getReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/example/model/PendencyType;Ljava/lang/String;)Lcom/example/model/PendencyItem;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PendencyItem {
    public static final int $stable = 0;
    private final String episodeId;
    private final Integer episodeNumber;
    private final String episodeTitle;
    private final String id;
    private final String reason;
    private final String seasonId;
    private final Integer seasonNumber;
    private final String seriesId;
    private final String seriesTitle;
    private final PendencyType type;

    public static /* synthetic */ PendencyItem copy$default(PendencyItem pendencyItem, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, String str6, PendencyType pendencyType, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendencyItem.id;
        }
        if ((i & 2) != 0) {
            str2 = pendencyItem.seriesId;
        }
        if ((i & 4) != 0) {
            str3 = pendencyItem.seriesTitle;
        }
        if ((i & 8) != 0) {
            str4 = pendencyItem.seasonId;
        }
        if ((i & 16) != 0) {
            num = pendencyItem.seasonNumber;
        }
        if ((i & 32) != 0) {
            str5 = pendencyItem.episodeId;
        }
        if ((i & 64) != 0) {
            num2 = pendencyItem.episodeNumber;
        }
        if ((i & 128) != 0) {
            str6 = pendencyItem.episodeTitle;
        }
        if ((i & 256) != 0) {
            pendencyType = pendencyItem.type;
        }
        if ((i & 512) != 0) {
            str7 = pendencyItem.reason;
        }
        PendencyType pendencyType2 = pendencyType;
        String str8 = str7;
        Integer num3 = num2;
        String str9 = str6;
        Integer num4 = num;
        String str10 = str5;
        return pendencyItem.copy(str, str2, str3, str4, num4, str10, num3, str9, pendencyType2, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSeriesId() {
        return this.seriesId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSeriesTitle() {
        return this.seriesTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSeasonId() {
        return this.seasonId;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getSeasonNumber() {
        return this.seasonNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEpisodeId() {
        return this.episodeId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getEpisodeNumber() {
        return this.episodeNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEpisodeTitle() {
        return this.episodeTitle;
    }

    /* renamed from: component9, reason: from getter */
    public final PendencyType getType() {
        return this.type;
    }

    public final PendencyItem copy(String id, String seriesId, String seriesTitle, String seasonId, Integer seasonNumber, String episodeId, Integer episodeNumber, String episodeTitle, PendencyType type, String reason) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        Intrinsics.checkNotNullParameter(seriesTitle, "seriesTitle");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new PendencyItem(id, seriesId, seriesTitle, seasonId, seasonNumber, episodeId, episodeNumber, episodeTitle, type, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendencyItem)) {
            return false;
        }
        PendencyItem pendencyItem = (PendencyItem) other;
        return Intrinsics.areEqual(this.id, pendencyItem.id) && Intrinsics.areEqual(this.seriesId, pendencyItem.seriesId) && Intrinsics.areEqual(this.seriesTitle, pendencyItem.seriesTitle) && Intrinsics.areEqual(this.seasonId, pendencyItem.seasonId) && Intrinsics.areEqual(this.seasonNumber, pendencyItem.seasonNumber) && Intrinsics.areEqual(this.episodeId, pendencyItem.episodeId) && Intrinsics.areEqual(this.episodeNumber, pendencyItem.episodeNumber) && Intrinsics.areEqual(this.episodeTitle, pendencyItem.episodeTitle) && this.type == pendencyItem.type && Intrinsics.areEqual(this.reason, pendencyItem.reason);
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.seriesId.hashCode()) * 31) + this.seriesTitle.hashCode()) * 31) + (this.seasonId == null ? 0 : this.seasonId.hashCode())) * 31) + (this.seasonNumber == null ? 0 : this.seasonNumber.hashCode())) * 31) + (this.episodeId == null ? 0 : this.episodeId.hashCode())) * 31) + (this.episodeNumber == null ? 0 : this.episodeNumber.hashCode())) * 31) + (this.episodeTitle != null ? this.episodeTitle.hashCode() : 0)) * 31) + this.type.hashCode()) * 31) + this.reason.hashCode();
    }

    public String toString() {
        return "PendencyItem(id=" + this.id + ", seriesId=" + this.seriesId + ", seriesTitle=" + this.seriesTitle + ", seasonId=" + this.seasonId + ", seasonNumber=" + this.seasonNumber + ", episodeId=" + this.episodeId + ", episodeNumber=" + this.episodeNumber + ", episodeTitle=" + this.episodeTitle + ", type=" + this.type + ", reason=" + this.reason + ")";
    }

    public PendencyItem(String id, String seriesId, String seriesTitle, String seasonId, Integer seasonNumber, String episodeId, Integer episodeNumber, String episodeTitle, PendencyType type, String reason) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        Intrinsics.checkNotNullParameter(seriesTitle, "seriesTitle");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.id = id;
        this.seriesId = seriesId;
        this.seriesTitle = seriesTitle;
        this.seasonId = seasonId;
        this.seasonNumber = seasonNumber;
        this.episodeId = episodeId;
        this.episodeNumber = episodeNumber;
        this.episodeTitle = episodeTitle;
        this.type = type;
        this.reason = reason;
    }

    public /* synthetic */ PendencyItem(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, String str6, PendencyType pendencyType, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str6, pendencyType, str7);
    }

    public final String getId() {
        return this.id;
    }

    public final String getSeriesId() {
        return this.seriesId;
    }

    public final String getSeriesTitle() {
        return this.seriesTitle;
    }

    public final String getSeasonId() {
        return this.seasonId;
    }

    public final Integer getSeasonNumber() {
        return this.seasonNumber;
    }

    public final String getEpisodeId() {
        return this.episodeId;
    }

    public final Integer getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final String getEpisodeTitle() {
        return this.episodeTitle;
    }

    public final PendencyType getType() {
        return this.type;
    }

    public final String getReason() {
        return this.reason;
    }
}

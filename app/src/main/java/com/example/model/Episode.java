package com.example.model;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Episode.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00100\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013¨\u00064"}, d2 = {"Lcom/example/model/Episode;", "", "id", "", "seasonId", "episodeNumber", "", "title", "airDate", "opening", "Lcom/example/model/TimingSection;", "recap", "ending", "isLastEdited", "", "note", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/example/model/TimingSection;Lcom/example/model/TimingSection;Lcom/example/model/TimingSection;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSeasonId", "getEpisodeNumber", "()I", "getTitle", "getAirDate", "getOpening", "()Lcom/example/model/TimingSection;", "getRecap", "getEnding", "()Z", "getNote", NotificationCompat.CATEGORY_STATUS, "Lcom/example/model/EpisodeStatus;", "getStatus", "()Lcom/example/model/EpisodeStatus;", "formattedNumber", "getFormattedNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Episode {
    public static final int $stable = 0;
    private final String airDate;
    private final TimingSection ending;
    private final int episodeNumber;
    private final String id;
    private final boolean isLastEdited;
    private final String note;
    private final TimingSection opening;
    private final TimingSection recap;
    private final String seasonId;
    private final String title;

    public static /* synthetic */ Episode copy$default(Episode episode, String str, String str2, int i, String str3, String str4, TimingSection timingSection, TimingSection timingSection2, TimingSection timingSection3, boolean z, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = episode.id;
        }
        if ((i2 & 2) != 0) {
            str2 = episode.seasonId;
        }
        if ((i2 & 4) != 0) {
            i = episode.episodeNumber;
        }
        if ((i2 & 8) != 0) {
            str3 = episode.title;
        }
        if ((i2 & 16) != 0) {
            str4 = episode.airDate;
        }
        if ((i2 & 32) != 0) {
            timingSection = episode.opening;
        }
        if ((i2 & 64) != 0) {
            timingSection2 = episode.recap;
        }
        if ((i2 & 128) != 0) {
            timingSection3 = episode.ending;
        }
        if ((i2 & 256) != 0) {
            z = episode.isLastEdited;
        }
        if ((i2 & 512) != 0) {
            str5 = episode.note;
        }
        boolean z2 = z;
        String str6 = str5;
        TimingSection timingSection4 = timingSection2;
        TimingSection timingSection5 = timingSection3;
        String str7 = str4;
        TimingSection timingSection6 = timingSection;
        return episode.copy(str, str2, i, str3, str7, timingSection6, timingSection4, timingSection5, z2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSeasonId() {
        return this.seasonId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAirDate() {
        return this.airDate;
    }

    /* renamed from: component6, reason: from getter */
    public final TimingSection getOpening() {
        return this.opening;
    }

    /* renamed from: component7, reason: from getter */
    public final TimingSection getRecap() {
        return this.recap;
    }

    /* renamed from: component8, reason: from getter */
    public final TimingSection getEnding() {
        return this.ending;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLastEdited() {
        return this.isLastEdited;
    }

    public final Episode copy(String id, String seasonId, int episodeNumber, String title, String airDate, TimingSection opening, TimingSection recap, TimingSection ending, boolean isLastEdited, String note) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(airDate, "airDate");
        Intrinsics.checkNotNullParameter(opening, "opening");
        Intrinsics.checkNotNullParameter(recap, "recap");
        Intrinsics.checkNotNullParameter(ending, "ending");
        return new Episode(id, seasonId, episodeNumber, title, airDate, opening, recap, ending, isLastEdited, note);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) other;
        return Intrinsics.areEqual(this.id, episode.id) && Intrinsics.areEqual(this.seasonId, episode.seasonId) && this.episodeNumber == episode.episodeNumber && Intrinsics.areEqual(this.title, episode.title) && Intrinsics.areEqual(this.airDate, episode.airDate) && Intrinsics.areEqual(this.opening, episode.opening) && Intrinsics.areEqual(this.recap, episode.recap) && Intrinsics.areEqual(this.ending, episode.ending) && this.isLastEdited == episode.isLastEdited && Intrinsics.areEqual(this.note, episode.note);
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.seasonId.hashCode()) * 31) + Integer.hashCode(this.episodeNumber)) * 31) + this.title.hashCode()) * 31) + this.airDate.hashCode()) * 31) + this.opening.hashCode()) * 31) + this.recap.hashCode()) * 31) + this.ending.hashCode()) * 31) + Boolean.hashCode(this.isLastEdited)) * 31) + (this.note == null ? 0 : this.note.hashCode());
    }

    public String toString() {
        return "Episode(id=" + this.id + ", seasonId=" + this.seasonId + ", episodeNumber=" + this.episodeNumber + ", title=" + this.title + ", airDate=" + this.airDate + ", opening=" + this.opening + ", recap=" + this.recap + ", ending=" + this.ending + ", isLastEdited=" + this.isLastEdited + ", note=" + this.note + ")";
    }

    public Episode(String id, String seasonId, int episodeNumber, String title, String airDate, TimingSection opening, TimingSection recap, TimingSection ending, boolean isLastEdited, String note) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(airDate, "airDate");
        Intrinsics.checkNotNullParameter(opening, "opening");
        Intrinsics.checkNotNullParameter(recap, "recap");
        Intrinsics.checkNotNullParameter(ending, "ending");
        this.id = id;
        this.seasonId = seasonId;
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.airDate = airDate;
        this.opening = opening;
        this.recap = recap;
        this.ending = ending;
        this.isLastEdited = isLastEdited;
        this.note = note;
    }

    public /* synthetic */ Episode(String str, String str2, int i, String str3, String str4, TimingSection timingSection, TimingSection timingSection2, TimingSection timingSection3, boolean z, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? new TimingSection(false, false, null, null, null, 31, null) : timingSection, (i2 & 64) != 0 ? new TimingSection(false, false, null, null, null, 31, null) : timingSection2, (i2 & 128) != 0 ? new TimingSection(false, false, null, null, null, 31, null) : timingSection3, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? null : str5);
    }

    public final String getId() {
        return this.id;
    }

    public final String getSeasonId() {
        return this.seasonId;
    }

    public final int getEpisodeNumber() {
        return this.episodeNumber;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAirDate() {
        return this.airDate;
    }

    public final TimingSection getOpening() {
        return this.opening;
    }

    public final TimingSection getRecap() {
        return this.recap;
    }

    public final TimingSection getEnding() {
        return this.ending;
    }

    public final boolean isLastEdited() {
        return this.isLastEdited;
    }

    public final String getNote() {
        return this.note;
    }

    public final EpisodeStatus getStatus() {
        if (this.opening.isCompleted() && this.recap.isCompleted() && this.ending.isCompleted()) {
            return EpisodeStatus.COMPLETED;
        }
        if (this.opening.isCompleted() || this.recap.isCompleted() || this.ending.isCompleted()) {
            return EpisodeStatus.PARTIAL;
        }
        return EpisodeStatus.PENDING;
    }

    public final String getFormattedNumber() {
        return "EP " + StringsKt.padStart(String.valueOf(this.episodeNumber), 2, '0');
    }
}

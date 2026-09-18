package com.example.ui.episode;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.MovieKt;
import androidx.compose.material.icons.filled.MusicNoteKt;
import androidx.compose.material.icons.filled.ReplayKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: TimingSectionCard.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/example/ui/episode/SectionType;", "", "title", "", "testTagKey", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconTint", "Landroidx/compose/ui/graphics/Color;", "iconBg", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JJ)V", "getTitle", "()Ljava/lang/String;", "getTestTagKey", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getIconTint-0d7_KjU", "()J", "J", "getIconBg-0d7_KjU", "OPENING", "RECAP", "ENDING", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum SectionType {
    OPENING("Abertura", "opening", MusicNoteKt.getMusicNote(Icons.INSTANCE.getDefault()), ColorKt.Color(4289222135L), ColorKt.Color(4281208933L)),
    RECAP("Recap", "recap", ReplayKt.getReplay(Icons.INSTANCE.getDefault()), ColorKt.Color(4294688548L), ColorKt.Color(4282718723L)),
    ENDING("Encerramento", "ending", MovieKt.getMovie(Icons.INSTANCE.getDefault()), ColorKt.Color(4284524026L), ColorKt.Color(4279706964L));

    private final ImageVector icon;
    private final long iconBg;
    private final long iconTint;
    private final String testTagKey;
    private final String title;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<SectionType> getEntries() {
        return $ENTRIES;
    }

    SectionType(String title, String testTagKey, ImageVector icon, long iconTint, long iconBg) {
        this.title = title;
        this.testTagKey = testTagKey;
        this.icon = icon;
        this.iconTint = iconTint;
        this.iconBg = iconBg;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTestTagKey() {
        return this.testTagKey;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    /* renamed from: getIconTint-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconTint() {
        return this.iconTint;
    }

    /* renamed from: getIconBg-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconBg() {
        return this.iconBg;
    }
}

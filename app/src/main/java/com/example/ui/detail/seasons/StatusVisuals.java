package com.example.ui.detail.seasons;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SeasonStatusCapsule.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\nJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/example/ui/detail/seasons/StatusVisuals;", "", "background", "Landroidx/compose/ui/graphics/Color;", OutlinedTextFieldKt.BorderId, "text", "dot", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBorder-0d7_KjU", "getText-0d7_KjU", "getDot-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "copy", "copy-jRlVdoo", "(JJJJ)Lcom/example/ui/detail/seasons/StatusVisuals;", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class StatusVisuals {
    private final long background;
    private final long border;
    private final long dot;
    private final long text;

    public /* synthetic */ StatusVisuals(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ StatusVisuals m7006copyjRlVdoo$default(StatusVisuals statusVisuals, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = statusVisuals.background;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = statusVisuals.border;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = statusVisuals.text;
        }
        return statusVisuals.m7011copyjRlVdoo(j5, j6, j3, (i & 8) != 0 ? statusVisuals.dot : j4);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorder() {
        return this.border;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getText() {
        return this.text;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getDot() {
        return this.dot;
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final StatusVisuals m7011copyjRlVdoo(long background, long border, long text, long dot) {
        return new StatusVisuals(background, border, text, dot, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusVisuals)) {
            return false;
        }
        StatusVisuals statusVisuals = (StatusVisuals) other;
        return Color.m4160equalsimpl0(this.background, statusVisuals.background) && Color.m4160equalsimpl0(this.border, statusVisuals.border) && Color.m4160equalsimpl0(this.text, statusVisuals.text) && Color.m4160equalsimpl0(this.dot, statusVisuals.dot);
    }

    public int hashCode() {
        return (((((Color.m4166hashCodeimpl(this.background) * 31) + Color.m4166hashCodeimpl(this.border)) * 31) + Color.m4166hashCodeimpl(this.text)) * 31) + Color.m4166hashCodeimpl(this.dot);
    }

    public String toString() {
        return "StatusVisuals(background=" + Color.m4167toStringimpl(this.background) + ", border=" + Color.m4167toStringimpl(this.border) + ", text=" + Color.m4167toStringimpl(this.text) + ", dot=" + Color.m4167toStringimpl(this.dot) + ")";
    }

    private StatusVisuals(long background, long border, long text, long dot) {
        this.background = background;
        this.border = border;
        this.text = text;
        this.dot = dot;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m7012getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m7013getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getText-0d7_KjU, reason: not valid java name */
    public final long m7015getText0d7_KjU() {
        return this.text;
    }

    /* renamed from: getDot-0d7_KjU, reason: not valid java name */
    public final long m7014getDot0d7_KjU() {
        return this.dot;
    }
}

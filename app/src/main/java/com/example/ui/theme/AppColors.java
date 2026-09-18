package com.example.ui.theme;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u0010\u00105\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b6\u0010\u001eJ\u0010\u00107\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b8\u0010\u001eJ\u0010\u00109\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b:\u0010\u001eJ\u0010\u0010;\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b<\u0010\u001eJ\u0010\u0010=\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b>\u0010\u001eJ\u0010\u0010?\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b@\u0010\u001eJ\u0010\u0010A\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bB\u0010\u001eJ\u0010\u0010C\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bD\u0010\u001eJ\u0010\u0010E\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bF\u0010\u001eJ\u0010\u0010G\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bH\u0010\u001eJ\u0010\u0010I\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bJ\u0010\u001eJ\u0010\u0010K\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bL\u0010\u001eJ\u0010\u0010M\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bN\u0010\u001eJ\u0010\u0010O\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bP\u0010\u001eJ\u0010\u0010Q\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bR\u0010\u001eJ\u0010\u0010S\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bT\u0010\u001eJ\u0010\u0010U\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bV\u0010\u001eJ\u0010\u0010W\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bX\u0010\u001eJ\u0010\u0010Y\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bZ\u0010\u001eJ\t\u0010[\u001a\u00020\u0019HÆ\u0003Jâ\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\u00020\u00032\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020bHÖ\u0001J\t\u0010c\u001a\u00020dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001cR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0007\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0013\u0010\b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b#\u0010\u001eR\u0013\u0010\n\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001eR\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b%\u0010\u001eR\u0013\u0010\f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b&\u0010\u001eR\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b'\u0010\u001eR\u0013\u0010\u000e\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b(\u0010\u001eR\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u0010\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0012\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b,\u0010\u001eR\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b-\u0010\u001eR\u0013\u0010\u0014\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b.\u0010\u001eR\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u0016\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b0\u0010\u001eR\u0013\u0010\u0017\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b1\u0010\u001eR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006e"}, d2 = {"Lcom/example/ui/theme/AppColors;", "", "isDark", "", "background", "Landroidx/compose/ui/graphics/Color;", "backgroundSecondary", "surface", "surfaceVariant", "card", "field", OutlinedTextFieldKt.BorderId, "borderLight", "textPrimary", "textSecondary", "textMuted", "accentPurple", "accentPurpleDeep", "accentBlue", "accentBlueDeep", "accentIndigo", "accentGreen", "accentRed", "accentAmber", "purpleBlueGradient", "Landroidx/compose/ui/graphics/Brush;", "<init>", "(ZJJJJJJJJJJJJJJJJJJJLandroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "()Z", "getBackground-0d7_KjU", "()J", "J", "getBackgroundSecondary-0d7_KjU", "getSurface-0d7_KjU", "getSurfaceVariant-0d7_KjU", "getCard-0d7_KjU", "getField-0d7_KjU", "getBorder-0d7_KjU", "getBorderLight-0d7_KjU", "getTextPrimary-0d7_KjU", "getTextSecondary-0d7_KjU", "getTextMuted-0d7_KjU", "getAccentPurple-0d7_KjU", "getAccentPurpleDeep-0d7_KjU", "getAccentBlue-0d7_KjU", "getAccentBlueDeep-0d7_KjU", "getAccentIndigo-0d7_KjU", "getAccentGreen-0d7_KjU", "getAccentRed-0d7_KjU", "getAccentAmber-0d7_KjU", "getPurpleBlueGradient", "()Landroidx/compose/ui/graphics/Brush;", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component6-0d7_KjU", "component7", "component7-0d7_KjU", "component8", "component8-0d7_KjU", "component9", "component9-0d7_KjU", "component10", "component10-0d7_KjU", "component11", "component11-0d7_KjU", "component12", "component12-0d7_KjU", "component13", "component13-0d7_KjU", "component14", "component14-0d7_KjU", "component15", "component15-0d7_KjU", "component16", "component16-0d7_KjU", "component17", "component17-0d7_KjU", "component18", "component18-0d7_KjU", "component19", "component19-0d7_KjU", "component20", "component20-0d7_KjU", "component21", "copy", "copy-vb9IqTI", "(ZJJJJJJJJJJJJJJJJJJJLandroidx/compose/ui/graphics/Brush;)Lcom/example/ui/theme/AppColors;", "equals", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AppColors {
    public static final int $stable = 0;
    private final long accentAmber;
    private final long accentBlue;
    private final long accentBlueDeep;
    private final long accentGreen;
    private final long accentIndigo;
    private final long accentPurple;
    private final long accentPurpleDeep;
    private final long accentRed;
    private final long background;
    private final long backgroundSecondary;
    private final long border;
    private final long borderLight;
    private final long card;
    private final long field;
    private final boolean isDark;
    private final Brush purpleBlueGradient;
    private final long surface;
    private final long surfaceVariant;
    private final long textMuted;
    private final long textPrimary;
    private final long textSecondary;

    public /* synthetic */ AppColors(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Brush brush, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, brush);
    }

    /* renamed from: copy-vb9IqTI$default, reason: not valid java name */
    public static /* synthetic */ AppColors m7055copyvb9IqTI$default(AppColors appColors, boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Brush brush, int i, Object obj) {
        long j20;
        long j21;
        Brush brush2;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        boolean z2 = (i & 1) != 0 ? appColors.isDark : z;
        long j40 = (i & 2) != 0 ? appColors.background : j;
        long j41 = (i & 4) != 0 ? appColors.backgroundSecondary : j2;
        long j42 = (i & 8) != 0 ? appColors.surface : j3;
        long j43 = (i & 16) != 0 ? appColors.surfaceVariant : j4;
        long j44 = (i & 32) != 0 ? appColors.card : j5;
        long j45 = (i & 64) != 0 ? appColors.field : j6;
        boolean z3 = z2;
        if ((i & 128) != 0) {
            j20 = j40;
            j21 = appColors.border;
        } else {
            j20 = j40;
            j21 = j7;
        }
        long j46 = j21;
        long j47 = (i & 256) != 0 ? appColors.borderLight : j8;
        long j48 = (i & 512) != 0 ? appColors.textPrimary : j9;
        long j49 = (i & 1024) != 0 ? appColors.textSecondary : j10;
        long j50 = (i & 2048) != 0 ? appColors.textMuted : j11;
        long j51 = (i & 4096) != 0 ? appColors.accentPurple : j12;
        long j52 = (i & 8192) != 0 ? appColors.accentPurpleDeep : j13;
        long j53 = (i & 16384) != 0 ? appColors.accentBlue : j14;
        long j54 = (i & 32768) != 0 ? appColors.accentBlueDeep : j15;
        long j55 = j53;
        long j56 = (i & 65536) != 0 ? appColors.accentIndigo : j16;
        long j57 = (i & 131072) != 0 ? appColors.accentGreen : j17;
        long j58 = (i & 262144) != 0 ? appColors.accentRed : j18;
        long j59 = (i & 524288) != 0 ? appColors.accentAmber : j19;
        if ((i & 1048576) != 0) {
            j22 = j59;
            brush2 = appColors.purpleBlueGradient;
            j24 = j52;
            j25 = j55;
            j26 = j56;
            j27 = j57;
            j28 = j58;
            j29 = j54;
            j31 = j46;
            j32 = j47;
            j33 = j48;
            j34 = j49;
            j35 = j50;
            j23 = j51;
            j36 = j41;
            j37 = j42;
            j38 = j43;
            j39 = j44;
            j30 = j45;
        } else {
            brush2 = brush;
            j22 = j59;
            j23 = j51;
            j24 = j52;
            j25 = j55;
            j26 = j56;
            j27 = j57;
            j28 = j58;
            j29 = j54;
            j30 = j45;
            j31 = j46;
            j32 = j47;
            j33 = j48;
            j34 = j49;
            j35 = j50;
            j36 = j41;
            j37 = j42;
            j38 = j43;
            j39 = j44;
        }
        return appColors.m7075copyvb9IqTI(z3, j20, j36, j37, j38, j39, j30, j31, j32, j33, j34, j35, j23, j24, j25, j29, j26, j27, j28, j22, brush2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDark() {
        return this.isDark;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextPrimary() {
        return this.textPrimary;
    }

    /* renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextSecondary() {
        return this.textSecondary;
    }

    /* renamed from: component12-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextMuted() {
        return this.textMuted;
    }

    /* renamed from: component13-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentPurple() {
        return this.accentPurple;
    }

    /* renamed from: component14-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentPurpleDeep() {
        return this.accentPurpleDeep;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentBlue() {
        return this.accentBlue;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentBlueDeep() {
        return this.accentBlueDeep;
    }

    /* renamed from: component17-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentIndigo() {
        return this.accentIndigo;
    }

    /* renamed from: component18-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentGreen() {
        return this.accentGreen;
    }

    /* renamed from: component19-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentRed() {
        return this.accentRed;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component20-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentAmber() {
        return this.accentAmber;
    }

    /* renamed from: component21, reason: from getter */
    public final Brush getPurpleBlueGradient() {
        return this.purpleBlueGradient;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundSecondary() {
        return this.backgroundSecondary;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurface() {
        return this.surface;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getCard() {
        return this.card;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getField() {
        return this.field;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorder() {
        return this.border;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderLight() {
        return this.borderLight;
    }

    /* renamed from: copy-vb9IqTI, reason: not valid java name */
    public final AppColors m7075copyvb9IqTI(boolean isDark, long background, long backgroundSecondary, long surface, long surfaceVariant, long card, long field, long border, long borderLight, long textPrimary, long textSecondary, long textMuted, long accentPurple, long accentPurpleDeep, long accentBlue, long accentBlueDeep, long accentIndigo, long accentGreen, long accentRed, long accentAmber, Brush purpleBlueGradient) {
        Intrinsics.checkNotNullParameter(purpleBlueGradient, "purpleBlueGradient");
        return new AppColors(isDark, background, backgroundSecondary, surface, surfaceVariant, card, field, border, borderLight, textPrimary, textSecondary, textMuted, accentPurple, accentPurpleDeep, accentBlue, accentBlueDeep, accentIndigo, accentGreen, accentRed, accentAmber, purpleBlueGradient, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppColors)) {
            return false;
        }
        AppColors appColors = (AppColors) other;
        return this.isDark == appColors.isDark && Color.m4160equalsimpl0(this.background, appColors.background) && Color.m4160equalsimpl0(this.backgroundSecondary, appColors.backgroundSecondary) && Color.m4160equalsimpl0(this.surface, appColors.surface) && Color.m4160equalsimpl0(this.surfaceVariant, appColors.surfaceVariant) && Color.m4160equalsimpl0(this.card, appColors.card) && Color.m4160equalsimpl0(this.field, appColors.field) && Color.m4160equalsimpl0(this.border, appColors.border) && Color.m4160equalsimpl0(this.borderLight, appColors.borderLight) && Color.m4160equalsimpl0(this.textPrimary, appColors.textPrimary) && Color.m4160equalsimpl0(this.textSecondary, appColors.textSecondary) && Color.m4160equalsimpl0(this.textMuted, appColors.textMuted) && Color.m4160equalsimpl0(this.accentPurple, appColors.accentPurple) && Color.m4160equalsimpl0(this.accentPurpleDeep, appColors.accentPurpleDeep) && Color.m4160equalsimpl0(this.accentBlue, appColors.accentBlue) && Color.m4160equalsimpl0(this.accentBlueDeep, appColors.accentBlueDeep) && Color.m4160equalsimpl0(this.accentIndigo, appColors.accentIndigo) && Color.m4160equalsimpl0(this.accentGreen, appColors.accentGreen) && Color.m4160equalsimpl0(this.accentRed, appColors.accentRed) && Color.m4160equalsimpl0(this.accentAmber, appColors.accentAmber) && Intrinsics.areEqual(this.purpleBlueGradient, appColors.purpleBlueGradient);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.isDark) * 31) + Color.m4166hashCodeimpl(this.background)) * 31) + Color.m4166hashCodeimpl(this.backgroundSecondary)) * 31) + Color.m4166hashCodeimpl(this.surface)) * 31) + Color.m4166hashCodeimpl(this.surfaceVariant)) * 31) + Color.m4166hashCodeimpl(this.card)) * 31) + Color.m4166hashCodeimpl(this.field)) * 31) + Color.m4166hashCodeimpl(this.border)) * 31) + Color.m4166hashCodeimpl(this.borderLight)) * 31) + Color.m4166hashCodeimpl(this.textPrimary)) * 31) + Color.m4166hashCodeimpl(this.textSecondary)) * 31) + Color.m4166hashCodeimpl(this.textMuted)) * 31) + Color.m4166hashCodeimpl(this.accentPurple)) * 31) + Color.m4166hashCodeimpl(this.accentPurpleDeep)) * 31) + Color.m4166hashCodeimpl(this.accentBlue)) * 31) + Color.m4166hashCodeimpl(this.accentBlueDeep)) * 31) + Color.m4166hashCodeimpl(this.accentIndigo)) * 31) + Color.m4166hashCodeimpl(this.accentGreen)) * 31) + Color.m4166hashCodeimpl(this.accentRed)) * 31) + Color.m4166hashCodeimpl(this.accentAmber)) * 31) + this.purpleBlueGradient.hashCode();
    }

    public String toString() {
        return "AppColors(isDark=" + this.isDark + ", background=" + Color.m4167toStringimpl(this.background) + ", backgroundSecondary=" + Color.m4167toStringimpl(this.backgroundSecondary) + ", surface=" + Color.m4167toStringimpl(this.surface) + ", surfaceVariant=" + Color.m4167toStringimpl(this.surfaceVariant) + ", card=" + Color.m4167toStringimpl(this.card) + ", field=" + Color.m4167toStringimpl(this.field) + ", border=" + Color.m4167toStringimpl(this.border) + ", borderLight=" + Color.m4167toStringimpl(this.borderLight) + ", textPrimary=" + Color.m4167toStringimpl(this.textPrimary) + ", textSecondary=" + Color.m4167toStringimpl(this.textSecondary) + ", textMuted=" + Color.m4167toStringimpl(this.textMuted) + ", accentPurple=" + Color.m4167toStringimpl(this.accentPurple) + ", accentPurpleDeep=" + Color.m4167toStringimpl(this.accentPurpleDeep) + ", accentBlue=" + Color.m4167toStringimpl(this.accentBlue) + ", accentBlueDeep=" + Color.m4167toStringimpl(this.accentBlueDeep) + ", accentIndigo=" + Color.m4167toStringimpl(this.accentIndigo) + ", accentGreen=" + Color.m4167toStringimpl(this.accentGreen) + ", accentRed=" + Color.m4167toStringimpl(this.accentRed) + ", accentAmber=" + Color.m4167toStringimpl(this.accentAmber) + ", purpleBlueGradient=" + this.purpleBlueGradient + ")";
    }

    private AppColors(boolean isDark, long background, long backgroundSecondary, long surface, long surfaceVariant, long card, long field, long border, long borderLight, long textPrimary, long textSecondary, long textMuted, long accentPurple, long accentPurpleDeep, long accentBlue, long accentBlueDeep, long accentIndigo, long accentGreen, long accentRed, long accentAmber, Brush purpleBlueGradient) {
        Intrinsics.checkNotNullParameter(purpleBlueGradient, "purpleBlueGradient");
        this.isDark = isDark;
        this.background = background;
        this.backgroundSecondary = backgroundSecondary;
        this.surface = surface;
        this.surfaceVariant = surfaceVariant;
        this.card = card;
        this.field = field;
        this.border = border;
        this.borderLight = borderLight;
        this.textPrimary = textPrimary;
        this.textSecondary = textSecondary;
        this.textMuted = textMuted;
        this.accentPurple = accentPurple;
        this.accentPurpleDeep = accentPurpleDeep;
        this.accentBlue = accentBlue;
        this.accentBlueDeep = accentBlueDeep;
        this.accentIndigo = accentIndigo;
        this.accentGreen = accentGreen;
        this.accentRed = accentRed;
        this.accentAmber = accentAmber;
        this.purpleBlueGradient = purpleBlueGradient;
    }

    public final boolean isDark() {
        return this.isDark;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m7084getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBackgroundSecondary-0d7_KjU, reason: not valid java name */
    public final long m7085getBackgroundSecondary0d7_KjU() {
        return this.backgroundSecondary;
    }

    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m7090getSurface0d7_KjU() {
        return this.surface;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m7091getSurfaceVariant0d7_KjU() {
        return this.surfaceVariant;
    }

    /* renamed from: getCard-0d7_KjU, reason: not valid java name */
    public final long m7088getCard0d7_KjU() {
        return this.card;
    }

    /* renamed from: getField-0d7_KjU, reason: not valid java name */
    public final long m7089getField0d7_KjU() {
        return this.field;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m7086getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getBorderLight-0d7_KjU, reason: not valid java name */
    public final long m7087getBorderLight0d7_KjU() {
        return this.borderLight;
    }

    /* renamed from: getTextPrimary-0d7_KjU, reason: not valid java name */
    public final long m7093getTextPrimary0d7_KjU() {
        return this.textPrimary;
    }

    /* renamed from: getTextSecondary-0d7_KjU, reason: not valid java name */
    public final long m7094getTextSecondary0d7_KjU() {
        return this.textSecondary;
    }

    /* renamed from: getTextMuted-0d7_KjU, reason: not valid java name */
    public final long m7092getTextMuted0d7_KjU() {
        return this.textMuted;
    }

    /* renamed from: getAccentPurple-0d7_KjU, reason: not valid java name */
    public final long m7081getAccentPurple0d7_KjU() {
        return this.accentPurple;
    }

    /* renamed from: getAccentPurpleDeep-0d7_KjU, reason: not valid java name */
    public final long m7082getAccentPurpleDeep0d7_KjU() {
        return this.accentPurpleDeep;
    }

    /* renamed from: getAccentBlue-0d7_KjU, reason: not valid java name */
    public final long m7077getAccentBlue0d7_KjU() {
        return this.accentBlue;
    }

    /* renamed from: getAccentBlueDeep-0d7_KjU, reason: not valid java name */
    public final long m7078getAccentBlueDeep0d7_KjU() {
        return this.accentBlueDeep;
    }

    /* renamed from: getAccentIndigo-0d7_KjU, reason: not valid java name */
    public final long m7080getAccentIndigo0d7_KjU() {
        return this.accentIndigo;
    }

    /* renamed from: getAccentGreen-0d7_KjU, reason: not valid java name */
    public final long m7079getAccentGreen0d7_KjU() {
        return this.accentGreen;
    }

    /* renamed from: getAccentRed-0d7_KjU, reason: not valid java name */
    public final long m7083getAccentRed0d7_KjU() {
        return this.accentRed;
    }

    /* renamed from: getAccentAmber-0d7_KjU, reason: not valid java name */
    public final long m7076getAccentAmber0d7_KjU() {
        return this.accentAmber;
    }

    public final Brush getPurpleBlueGradient() {
        return this.purpleBlueGradient;
    }
}

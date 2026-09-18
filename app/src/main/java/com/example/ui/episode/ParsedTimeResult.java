package com.example.ui.episode;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeEditorModal.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/example/ui/episode/ParsedTimeResult;", "", "formatted", "", "totalSeconds", "", "isValid", "", "errorMessage", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", "getFormatted", "()Ljava/lang/String;", "getTotalSeconds", "()I", "()Z", "getErrorMessage", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ParsedTimeResult {
    public static final int $stable = 0;
    private final String errorMessage;
    private final String formatted;
    private final boolean isValid;
    private final int totalSeconds;

    public static /* synthetic */ ParsedTimeResult copy$default(ParsedTimeResult parsedTimeResult, String str, int i, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = parsedTimeResult.formatted;
        }
        if ((i2 & 2) != 0) {
            i = parsedTimeResult.totalSeconds;
        }
        if ((i2 & 4) != 0) {
            z = parsedTimeResult.isValid;
        }
        if ((i2 & 8) != 0) {
            str2 = parsedTimeResult.errorMessage;
        }
        return parsedTimeResult.copy(str, i, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormatted() {
        return this.formatted;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalSeconds() {
        return this.totalSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final ParsedTimeResult copy(String formatted, int totalSeconds, boolean isValid, String errorMessage) {
        Intrinsics.checkNotNullParameter(formatted, "formatted");
        return new ParsedTimeResult(formatted, totalSeconds, isValid, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedTimeResult)) {
            return false;
        }
        ParsedTimeResult parsedTimeResult = (ParsedTimeResult) other;
        return Intrinsics.areEqual(this.formatted, parsedTimeResult.formatted) && this.totalSeconds == parsedTimeResult.totalSeconds && this.isValid == parsedTimeResult.isValid && Intrinsics.areEqual(this.errorMessage, parsedTimeResult.errorMessage);
    }

    public int hashCode() {
        return (((((this.formatted.hashCode() * 31) + Integer.hashCode(this.totalSeconds)) * 31) + Boolean.hashCode(this.isValid)) * 31) + (this.errorMessage == null ? 0 : this.errorMessage.hashCode());
    }

    public String toString() {
        return "ParsedTimeResult(formatted=" + this.formatted + ", totalSeconds=" + this.totalSeconds + ", isValid=" + this.isValid + ", errorMessage=" + this.errorMessage + ")";
    }

    public ParsedTimeResult(String formatted, int totalSeconds, boolean isValid, String errorMessage) {
        Intrinsics.checkNotNullParameter(formatted, "formatted");
        this.formatted = formatted;
        this.totalSeconds = totalSeconds;
        this.isValid = isValid;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ ParsedTimeResult(String str, int i, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, z, (i2 & 8) != 0 ? null : str2);
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public final int getTotalSeconds() {
        return this.totalSeconds;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}

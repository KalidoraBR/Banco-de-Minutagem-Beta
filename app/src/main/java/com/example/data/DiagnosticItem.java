package com.example.data;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectionTestManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/example/data/DiagnosticItem;", "", "id", "", "title", "description", NotificationCompat.CATEGORY_STATUS, "Lcom/example/data/DiagnosticStatus;", "latencyMs", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/DiagnosticStatus;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getStatus", "()Lcom/example/data/DiagnosticStatus;", "getLatencyMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/DiagnosticStatus;Ljava/lang/Long;Ljava/lang/String;)Lcom/example/data/DiagnosticItem;", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DiagnosticItem {
    public static final int $stable = 0;
    private final String description;
    private final String id;
    private final Long latencyMs;
    private final String message;
    private final DiagnosticStatus status;
    private final String title;

    public static /* synthetic */ DiagnosticItem copy$default(DiagnosticItem diagnosticItem, String str, String str2, String str3, DiagnosticStatus diagnosticStatus, Long l, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diagnosticItem.id;
        }
        if ((i & 2) != 0) {
            str2 = diagnosticItem.title;
        }
        if ((i & 4) != 0) {
            str3 = diagnosticItem.description;
        }
        if ((i & 8) != 0) {
            diagnosticStatus = diagnosticItem.status;
        }
        if ((i & 16) != 0) {
            l = diagnosticItem.latencyMs;
        }
        if ((i & 32) != 0) {
            str4 = diagnosticItem.message;
        }
        Long l2 = l;
        String str5 = str4;
        return diagnosticItem.copy(str, str2, str3, diagnosticStatus, l2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final DiagnosticStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getLatencyMs() {
        return this.latencyMs;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final DiagnosticItem copy(String id, String title, String description, DiagnosticStatus status, Long latencyMs, String message) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        return new DiagnosticItem(id, title, description, status, latencyMs, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiagnosticItem)) {
            return false;
        }
        DiagnosticItem diagnosticItem = (DiagnosticItem) other;
        return Intrinsics.areEqual(this.id, diagnosticItem.id) && Intrinsics.areEqual(this.title, diagnosticItem.title) && Intrinsics.areEqual(this.description, diagnosticItem.description) && this.status == diagnosticItem.status && Intrinsics.areEqual(this.latencyMs, diagnosticItem.latencyMs) && Intrinsics.areEqual(this.message, diagnosticItem.message);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.status.hashCode()) * 31) + (this.latencyMs == null ? 0 : this.latencyMs.hashCode())) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "DiagnosticItem(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", status=" + this.status + ", latencyMs=" + this.latencyMs + ", message=" + this.message + ")";
    }

    public DiagnosticItem(String id, String title, String description, DiagnosticStatus status, Long latencyMs, String message) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.latencyMs = latencyMs;
        this.message = message;
    }

    public /* synthetic */ DiagnosticItem(String str, String str2, String str3, DiagnosticStatus diagnosticStatus, Long l, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? DiagnosticStatus.IDLE : diagnosticStatus, (i & 16) != 0 ? null : l, (i & 32) != 0 ? "" : str4);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DiagnosticStatus getStatus() {
        return this.status;
    }

    public final Long getLatencyMs() {
        return this.latencyMs;
    }

    public final String getMessage() {
        return this.message;
    }
}

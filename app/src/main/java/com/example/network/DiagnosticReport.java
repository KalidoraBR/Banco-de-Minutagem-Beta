package com.example.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoogleSheetsSyncService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/example/network/DiagnosticReport;", "", "isGoogleSheetsConnected", "", "isTmdbConnected", "latencyMs", "", "detailsMessage", "", "isWorkerConnected", "isD1DatabaseConnected", "<init>", "(ZZJLjava/lang/String;ZZ)V", "()Z", "getLatencyMs", "()J", "getDetailsMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DiagnosticReport {
    public static final int $stable = 0;
    private final String detailsMessage;
    private final boolean isD1DatabaseConnected;
    private final boolean isGoogleSheetsConnected;
    private final boolean isTmdbConnected;
    private final boolean isWorkerConnected;
    private final long latencyMs;

    public static /* synthetic */ DiagnosticReport copy$default(DiagnosticReport diagnosticReport, boolean z, boolean z2, long j, String str, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = diagnosticReport.isGoogleSheetsConnected;
        }
        if ((i & 2) != 0) {
            z2 = diagnosticReport.isTmdbConnected;
        }
        if ((i & 4) != 0) {
            j = diagnosticReport.latencyMs;
        }
        if ((i & 8) != 0) {
            str = diagnosticReport.detailsMessage;
        }
        if ((i & 16) != 0) {
            z3 = diagnosticReport.isWorkerConnected;
        }
        if ((i & 32) != 0) {
            z4 = diagnosticReport.isD1DatabaseConnected;
        }
        boolean z5 = z4;
        String str2 = str;
        long j2 = j;
        return diagnosticReport.copy(z, z2, j2, str2, z3, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsGoogleSheetsConnected() {
        return this.isGoogleSheetsConnected;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTmdbConnected() {
        return this.isTmdbConnected;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLatencyMs() {
        return this.latencyMs;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDetailsMessage() {
        return this.detailsMessage;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsWorkerConnected() {
        return this.isWorkerConnected;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsD1DatabaseConnected() {
        return this.isD1DatabaseConnected;
    }

    public final DiagnosticReport copy(boolean isGoogleSheetsConnected, boolean isTmdbConnected, long latencyMs, String detailsMessage, boolean isWorkerConnected, boolean isD1DatabaseConnected) {
        Intrinsics.checkNotNullParameter(detailsMessage, "detailsMessage");
        return new DiagnosticReport(isGoogleSheetsConnected, isTmdbConnected, latencyMs, detailsMessage, isWorkerConnected, isD1DatabaseConnected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiagnosticReport)) {
            return false;
        }
        DiagnosticReport diagnosticReport = (DiagnosticReport) other;
        return this.isGoogleSheetsConnected == diagnosticReport.isGoogleSheetsConnected && this.isTmdbConnected == diagnosticReport.isTmdbConnected && this.latencyMs == diagnosticReport.latencyMs && Intrinsics.areEqual(this.detailsMessage, diagnosticReport.detailsMessage) && this.isWorkerConnected == diagnosticReport.isWorkerConnected && this.isD1DatabaseConnected == diagnosticReport.isD1DatabaseConnected;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isGoogleSheetsConnected) * 31) + Boolean.hashCode(this.isTmdbConnected)) * 31) + Long.hashCode(this.latencyMs)) * 31) + this.detailsMessage.hashCode()) * 31) + Boolean.hashCode(this.isWorkerConnected)) * 31) + Boolean.hashCode(this.isD1DatabaseConnected);
    }

    public String toString() {
        return "DiagnosticReport(isGoogleSheetsConnected=" + this.isGoogleSheetsConnected + ", isTmdbConnected=" + this.isTmdbConnected + ", latencyMs=" + this.latencyMs + ", detailsMessage=" + this.detailsMessage + ", isWorkerConnected=" + this.isWorkerConnected + ", isD1DatabaseConnected=" + this.isD1DatabaseConnected + ")";
    }

    public DiagnosticReport(boolean isGoogleSheetsConnected, boolean isTmdbConnected, long latencyMs, String detailsMessage, boolean isWorkerConnected, boolean isD1DatabaseConnected) {
        Intrinsics.checkNotNullParameter(detailsMessage, "detailsMessage");
        this.isGoogleSheetsConnected = isGoogleSheetsConnected;
        this.isTmdbConnected = isTmdbConnected;
        this.latencyMs = latencyMs;
        this.detailsMessage = detailsMessage;
        this.isWorkerConnected = isWorkerConnected;
        this.isD1DatabaseConnected = isD1DatabaseConnected;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DiagnosticReport(boolean r2, boolean r3, long r4, java.lang.String r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 16
            r0 = 1
            if (r10 == 0) goto L6
            r7 = r0
        L6:
            r9 = r9 & 32
            if (r9 == 0) goto Lc
            r9 = r0
            goto Ld
        Lc:
            r9 = r8
        Ld:
            r8 = r7
            r7 = r6
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.network.DiagnosticReport.<init>(boolean, boolean, long, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isGoogleSheetsConnected() {
        return this.isGoogleSheetsConnected;
    }

    public final boolean isTmdbConnected() {
        return this.isTmdbConnected;
    }

    public final long getLatencyMs() {
        return this.latencyMs;
    }

    public final String getDetailsMessage() {
        return this.detailsMessage;
    }

    public final boolean isWorkerConnected() {
        return this.isWorkerConnected;
    }

    public final boolean isD1DatabaseConnected() {
        return this.isD1DatabaseConnected;
    }
}

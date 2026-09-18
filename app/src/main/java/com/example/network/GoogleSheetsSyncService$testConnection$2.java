package com.example.network;

import com.example.model.ApiConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GoogleSheetsSyncService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/network/DiagnosticReport;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.network.GoogleSheetsSyncService$testConnection$2", f = "GoogleSheetsSyncService.kt", i = {0, 0, 0, 0, 0, 0}, l = {777}, m = "invokeSuspend", n = {"cleanSpreadsheetId", "webHookUrl", "startTime", "sheetsOk", "tmdbOk", "hasSpreadsheetId"}, s = {"L$0", "L$1", "J$0", "I$0", "I$1", "I$2"})
/* loaded from: classes5.dex */
public final class GoogleSheetsSyncService$testConnection$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DiagnosticReport>, Object> {
    final /* synthetic */ ApiConfig $config;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleSheetsSyncService$testConnection$2(ApiConfig apiConfig, Continuation<? super GoogleSheetsSyncService$testConnection$2> continuation) {
        super(2, continuation);
        this.$config = apiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleSheetsSyncService$testConnection$2(this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DiagnosticReport> continuation) {
        return ((GoogleSheetsSyncService$testConnection$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174 A[ADDED_TO_REGION] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.network.GoogleSheetsSyncService$testConnection$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

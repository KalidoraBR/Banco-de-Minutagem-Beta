package com.example.network;

import android.content.Context;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/network/SyncOperationResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.network.GoogleSheetsSyncService$sendTestPing$2", f = "GoogleSheetsSyncService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class GoogleSheetsSyncService$sendTestPing$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SyncOperationResult>, Object> {
    final /* synthetic */ ApiConfig $config;
    final /* synthetic */ Context $context;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleSheetsSyncService$sendTestPing$2(Context context, ApiConfig apiConfig, Continuation<? super GoogleSheetsSyncService$sendTestPing$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$config = apiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleSheetsSyncService$sendTestPing$2(this.$context, this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SyncOperationResult> continuation) {
        return ((GoogleSheetsSyncService$sendTestPing$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x032a, code lost:
    
        if (r8 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0386 A[Catch: Exception -> 0x032d, TRY_LEAVE, TryCatch #2 {Exception -> 0x032d, blocks: (B:124:0x031a, B:126:0x0320, B:29:0x033f, B:31:0x034f, B:33:0x035f, B:35:0x036f, B:40:0x0386), top: B:123:0x031a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a2 A[Catch: Exception -> 0x0581, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0581, blocks: (B:24:0x0304, B:27:0x0334, B:56:0x03a2), top: B:23:0x0304 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.network.GoogleSheetsSyncService$sendTestPing$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.example.network;

import android.content.Context;
import com.example.model.ApiConfig;
import com.example.model.Series;
import java.util.List;
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
@DebugMetadata(c = "com.example.network.GoogleSheetsSyncService$syncAll$2", f = "GoogleSheetsSyncService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class GoogleSheetsSyncService$syncAll$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SyncOperationResult>, Object> {
    final /* synthetic */ ApiConfig $config;
    final /* synthetic */ Context $context;
    final /* synthetic */ List<Series> $seriesList;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleSheetsSyncService$syncAll$2(Context context, ApiConfig apiConfig, List<Series> list, Continuation<? super GoogleSheetsSyncService$syncAll$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$config = apiConfig;
        this.$seriesList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleSheetsSyncService$syncAll$2(this.$context, this.$config, this.$seriesList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SyncOperationResult> continuation) {
        return ((GoogleSheetsSyncService$syncAll$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0187, code lost:
    
        if (r17 == null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff A[Catch: Exception -> 0x0451, IOException -> 0x0453, TryCatch #3 {IOException -> 0x0453, blocks: (B:58:0x01c1, B:60:0x01c7, B:62:0x01d6, B:64:0x01e5, B:69:0x01ff, B:71:0x021b, B:76:0x0233, B:78:0x023e, B:81:0x0261, B:83:0x0267, B:84:0x0291, B:88:0x02cc, B:92:0x02d9, B:95:0x02e9, B:100:0x0327, B:102:0x0332, B:103:0x034b, B:105:0x0354, B:106:0x0397, B:108:0x0368, B:109:0x031f, B:110:0x03b5, B:113:0x0273, B:115:0x0279, B:117:0x0288, B:118:0x0244, B:120:0x024a, B:121:0x0250, B:127:0x03e3, B:128:0x0419, B:132:0x0405, B:134:0x0411, B:135:0x0417), top: B:57:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021b A[Catch: Exception -> 0x0451, IOException -> 0x0453, TRY_LEAVE, TryCatch #3 {IOException -> 0x0453, blocks: (B:58:0x01c1, B:60:0x01c7, B:62:0x01d6, B:64:0x01e5, B:69:0x01ff, B:71:0x021b, B:76:0x0233, B:78:0x023e, B:81:0x0261, B:83:0x0267, B:84:0x0291, B:88:0x02cc, B:92:0x02d9, B:95:0x02e9, B:100:0x0327, B:102:0x0332, B:103:0x034b, B:105:0x0354, B:106:0x0397, B:108:0x0368, B:109:0x031f, B:110:0x03b5, B:113:0x0273, B:115:0x0279, B:117:0x0288, B:118:0x0244, B:120:0x024a, B:121:0x0250, B:127:0x03e3, B:128:0x0419, B:132:0x0405, B:134:0x0411, B:135:0x0417), top: B:57:0x01c1 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.network.GoogleSheetsSyncService$syncAll$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.example.ui;

import android.content.Context;
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
/* compiled from: MinutagensApp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.MinutagensAppKt$MinutagensAppContent$persistSeries$1", f = "MinutagensApp.kt", i = {0}, l = {178}, m = "invokeSuspend", n = {"apiCfg"}, s = {"L$0"})
/* loaded from: classes11.dex */
public final class MinutagensAppKt$MinutagensAppContent$persistSeries$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<Series> $updatedList;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinutagensAppKt$MinutagensAppContent$persistSeries$1(Context context, List<Series> list, Continuation<? super MinutagensAppKt$MinutagensAppContent$persistSeries$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$updatedList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MinutagensAppKt$MinutagensAppContent$persistSeries$1(this.$context, this.$updatedList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MinutagensAppKt$MinutagensAppContent$persistSeries$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            switch(r1) {
                case 0: goto L1a;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Object r0 = r7.L$0
            com.example.model.ApiConfig r0 = (com.example.model.ApiConfig) r0
            kotlin.ResultKt.throwOnFailure(r8)
            r2 = r8
            goto L4b
        L1a:
            kotlin.ResultKt.throwOnFailure(r8)
            com.example.data.AppConfigStorage r1 = com.example.data.AppConfigStorage.INSTANCE
            android.content.Context r2 = r7.$context
            com.example.model.ApiConfig r1 = r1.loadConfig(r2)
            java.lang.String r2 = r1.getEffectiveWebHookUrl()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 != 0) goto L5c
            com.example.network.GoogleSheetsSyncService r2 = com.example.network.GoogleSheetsSyncService.INSTANCE
            android.content.Context r3 = r7.$context
            java.util.List<com.example.model.Series> r4 = r7.$updatedList
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r7.L$0 = r6
            r6 = 1
            r7.label = r6
            java.lang.Object r2 = r2.syncAll(r3, r4, r1, r5)
            if (r2 != r0) goto L4a
            return r0
        L4a:
            r0 = r1
        L4b:
            r1 = r2
            com.example.network.SyncOperationResult r1 = (com.example.network.SyncOperationResult) r1
            boolean r2 = r1.getSuccess()
            if (r2 == 0) goto L5b
            com.example.data.SyncStorage r2 = com.example.data.SyncStorage.INSTANCE
            android.content.Context r3 = r7.$context
            r2.resetPendingCount(r3)
        L5b:
            r1 = r0
        L5c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.MinutagensAppKt$MinutagensAppContent$persistSeries$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

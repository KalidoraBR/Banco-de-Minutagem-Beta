package com.example.ui.components;

import androidx.compose.runtime.MutableState;
import com.example.model.ApiConfig;
import com.example.model.Series;
import com.example.model.TmdbSearchResult;
import com.example.model.TmdbSeriesDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TmdbSearchDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$2$1$1$5$1$2$triggerImport$1", f = "TmdbSearchDialog.kt", i = {1}, l = {582, 586}, m = "invokeSuspend", n = {"details"}, s = {"L$0"})
/* loaded from: classes11.dex */
public final class TmdbSearchDialogKt$TmdbSearchDialog$2$1$1$5$1$2$triggerImport$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiConfig $apiConfig;
    final /* synthetic */ MutableState<Integer> $importingItemId$delegate;
    final /* synthetic */ TmdbSearchResult $item;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<Series, Unit> $onImportCompleteSeries;
    final /* synthetic */ Function2<TmdbSearchResult, TmdbSeriesDetails, Unit> $onSelectSeries;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TmdbSearchDialogKt$TmdbSearchDialog$2$1$1$5$1$2$triggerImport$1(TmdbSearchResult tmdbSearchResult, ApiConfig apiConfig, Function1<? super Series, Unit> function1, Function2<? super TmdbSearchResult, ? super TmdbSeriesDetails, Unit> function2, Function0<Unit> function0, MutableState<Integer> mutableState, Continuation<? super TmdbSearchDialogKt$TmdbSearchDialog$2$1$1$5$1$2$triggerImport$1> continuation) {
        super(2, continuation);
        this.$item = tmdbSearchResult;
        this.$apiConfig = apiConfig;
        this.$onImportCompleteSeries = function1;
        this.$onSelectSeries = function2;
        this.$onDismiss = function0;
        this.$importingItemId$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TmdbSearchDialogKt$TmdbSearchDialog$2$1$1$5$1$2$triggerImport$1(this.$item, this.$apiConfig, this.$onImportCompleteSeries, this.$onSelectSeries, this.$onDismiss, this.$importingItemId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TmdbSearchDialogKt$TmdbSearchDialog$2$1$1$5$1$2$triggerImport$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            switch(r1) {
                case 0: goto L1f;
                case 1: goto L1a;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Object r0 = r6.L$0
            com.example.model.TmdbSeriesDetails r0 = (com.example.model.TmdbSeriesDetails) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r7
            goto L6b
        L1a:
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r7
            goto L50
        L1f:
            kotlin.ResultKt.throwOnFailure(r7)
            androidx.compose.runtime.MutableState<java.lang.Integer> r1 = r6.$importingItemId$delegate
            com.example.model.TmdbSearchResult r2 = r6.$item
            int r2 = r2.getId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            com.example.ui.components.TmdbSearchDialogKt.access$TmdbSearchDialog$lambda$29(r1, r2)
            com.example.network.TmdbService r1 = com.example.network.TmdbService.INSTANCE
            com.example.model.TmdbSearchResult r2 = r6.$item
            int r2 = r2.getId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.example.model.ApiConfig r3 = r6.$apiConfig
            java.lang.String r3 = r3.getTmdbApiKey()
            r4 = r6
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 1
            r6.label = r5
            java.lang.Object r1 = r1.getSeriesDetails(r2, r3, r4)
            if (r1 != r0) goto L50
            return r0
        L50:
            com.example.model.TmdbSeriesDetails r1 = (com.example.model.TmdbSeriesDetails) r1
            com.example.model.TmdbSearchResult r2 = r6.$item
            com.example.model.ApiConfig r3 = r6.$apiConfig
            java.lang.String r3 = r3.getTmdbApiKey()
            r4 = r6
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r6.L$0 = r1
            r5 = 2
            r6.label = r5
            java.lang.Object r2 = com.example.ui.components.TmdbSearchDialogKt.buildSeriesFromTmdb(r2, r1, r3, r4)
            if (r2 != r0) goto L6a
            return r0
        L6a:
            r0 = r1
        L6b:
            r1 = r2
            com.example.model.Series r1 = (com.example.model.Series) r1
            androidx.compose.runtime.MutableState<java.lang.Integer> r2 = r6.$importingItemId$delegate
            r3 = 0
            com.example.ui.components.TmdbSearchDialogKt.access$TmdbSearchDialog$lambda$29(r2, r3)
            kotlin.jvm.functions.Function1<com.example.model.Series, kotlin.Unit> r2 = r6.$onImportCompleteSeries
            if (r2 == 0) goto L7e
            kotlin.jvm.functions.Function1<com.example.model.Series, kotlin.Unit> r2 = r6.$onImportCompleteSeries
            r2.invoke(r1)
            goto L85
        L7e:
            kotlin.jvm.functions.Function2<com.example.model.TmdbSearchResult, com.example.model.TmdbSeriesDetails, kotlin.Unit> r2 = r6.$onSelectSeries
            com.example.model.TmdbSearchResult r3 = r6.$item
            r2.invoke(r3, r0)
        L85:
            kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r6.$onDismiss
            r2.invoke()
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$2$1$1$5$1$2$triggerImport$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.example.ui.components;

import androidx.compose.runtime.MutableState;
import com.example.model.ApiConfig;
import com.example.model.TmdbSearchResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TmdbSearchDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$doSearch$1", f = "TmdbSearchDialog.kt", i = {}, l = {293, 294}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class TmdbSearchDialogKt$TmdbSearchDialog$doSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiConfig $apiConfig;
    final /* synthetic */ MutableState<Boolean> $isSearching$delegate;
    final /* synthetic */ String $query;
    final /* synthetic */ MutableState<List<TmdbSearchResult>> $searchResults$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmdbSearchDialogKt$TmdbSearchDialog$doSearch$1(String str, ApiConfig apiConfig, MutableState<Boolean> mutableState, MutableState<List<TmdbSearchResult>> mutableState2, Continuation<? super TmdbSearchDialogKt$TmdbSearchDialog$doSearch$1> continuation) {
        super(2, continuation);
        this.$query = str;
        this.$apiConfig = apiConfig;
        this.$isSearching$delegate = mutableState;
        this.$searchResults$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TmdbSearchDialogKt$TmdbSearchDialog$doSearch$1(this.$query, this.$apiConfig, this.$isSearching$delegate, this.$searchResults$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TmdbSearchDialogKt$TmdbSearchDialog$doSearch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[RETURN] */
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
                case 0: goto L1a;
                case 1: goto L16;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r7
            goto L48
        L16:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L31
        L1a:
            kotlin.ResultKt.throwOnFailure(r7)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r6.$isSearching$delegate
            r2 = 1
            com.example.ui.components.TmdbSearchDialogKt.access$TmdbSearchDialog$lambda$26(r1, r2)
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r6.label = r2
            r2 = 250(0xfa, double:1.235E-321)
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r2, r1)
            if (r1 != r0) goto L31
            return r0
        L31:
            com.example.network.TmdbService r1 = com.example.network.TmdbService.INSTANCE
            java.lang.String r2 = r6.$query
            com.example.model.ApiConfig r3 = r6.$apiConfig
            java.lang.String r3 = r3.getTmdbApiKey()
            r4 = r6
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 2
            r6.label = r5
            java.lang.Object r1 = r1.searchTvSeries(r2, r3, r4)
            if (r1 != r0) goto L48
            return r0
        L48:
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            androidx.compose.runtime.MutableState<java.util.List<com.example.model.TmdbSearchResult>> r1 = r6.$searchResults$delegate
            com.example.ui.components.TmdbSearchDialogKt.access$TmdbSearchDialog$lambda$23(r1, r0)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r6.$isSearching$delegate
            r2 = 0
            com.example.ui.components.TmdbSearchDialogKt.access$TmdbSearchDialog$lambda$26(r1, r2)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$doSearch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

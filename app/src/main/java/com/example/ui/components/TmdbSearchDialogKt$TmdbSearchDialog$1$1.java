package com.example.ui.components;

import androidx.compose.runtime.MutableState;
import com.example.model.ApiConfig;
import com.example.model.TmdbSearchResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TmdbSearchDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$1$1", f = "TmdbSearchDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class TmdbSearchDialogKt$TmdbSearchDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiConfig $apiConfig;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ String $initialQuery;
    final /* synthetic */ MutableState<Boolean> $isSearching$delegate;
    final /* synthetic */ MutableState<Job> $searchJob$delegate;
    final /* synthetic */ MutableState<List<TmdbSearchResult>> $searchResults$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmdbSearchDialogKt$TmdbSearchDialog$1$1(String str, CoroutineScope coroutineScope, MutableState<Job> mutableState, MutableState<List<TmdbSearchResult>> mutableState2, MutableState<Boolean> mutableState3, ApiConfig apiConfig, Continuation<? super TmdbSearchDialogKt$TmdbSearchDialog$1$1> continuation) {
        super(2, continuation);
        this.$initialQuery = str;
        this.$coroutineScope = coroutineScope;
        this.$searchJob$delegate = mutableState;
        this.$searchResults$delegate = mutableState2;
        this.$isSearching$delegate = mutableState3;
        this.$apiConfig = apiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TmdbSearchDialogKt$TmdbSearchDialog$1$1(this.$initialQuery, this.$coroutineScope, this.$searchJob$delegate, this.$searchResults$delegate, this.$isSearching$delegate, this.$apiConfig, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TmdbSearchDialogKt$TmdbSearchDialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!StringsKt.isBlank(this.$initialQuery)) {
                    TmdbSearchDialogKt.TmdbSearchDialog$doSearch(this.$coroutineScope, this.$searchJob$delegate, this.$searchResults$delegate, this.$isSearching$delegate, this.$apiConfig, this.$initialQuery);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

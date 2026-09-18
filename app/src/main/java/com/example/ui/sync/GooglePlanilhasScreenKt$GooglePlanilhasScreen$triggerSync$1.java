package com.example.ui.sync;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.data.AppConfigStorage;
import com.example.data.SeriesStorage;
import com.example.data.SyncStorage;
import com.example.model.ApiConfig;
import com.example.model.Series;
import com.example.model.SyncConfig;
import com.example.network.GoogleSheetsSyncService;
import com.example.network.SyncOperationResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GooglePlanilhasScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.sync.GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerSync$1", f = "GooglePlanilhasScreen.kt", i = {0, 0}, l = {174}, m = "invokeSuspend", n = {"activeSeries", "currentApi"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<ApiConfig> $apiConfig$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableState<Boolean> $isSyncing$delegate;
    final /* synthetic */ MutableState<SyncOperationResult> $lastSyncResult$delegate;
    final /* synthetic */ List<Series> $seriesList;
    final /* synthetic */ MutableState<SyncConfig> $syncConfig$delegate;
    final /* synthetic */ MutableState<String> $toastMessage$delegate;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerSync$1(List<Series> list, Context context, MutableState<Boolean> mutableState, MutableState<ApiConfig> mutableState2, MutableState<SyncOperationResult> mutableState3, MutableState<SyncConfig> mutableState4, CoroutineScope coroutineScope, MutableState<String> mutableState5, Continuation<? super GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerSync$1> continuation) {
        super(2, continuation);
        this.$seriesList = list;
        this.$context = context;
        this.$isSyncing$delegate = mutableState;
        this.$apiConfig$delegate = mutableState2;
        this.$lastSyncResult$delegate = mutableState3;
        this.$syncConfig$delegate = mutableState4;
        this.$coroutineScope = coroutineScope;
        this.$toastMessage$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerSync$1(this.$seriesList, this.$context, this.$isSyncing$delegate, this.$apiConfig$delegate, this.$lastSyncResult$delegate, this.$syncConfig$delegate, this.$coroutineScope, this.$toastMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerSync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        List activeSeries;
        Object syncAll;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$15(this.$isSyncing$delegate, true);
                activeSeries = !this.$seriesList.isEmpty() ? this.$seriesList : SeriesStorage.INSTANCE.loadSeries(this.$context);
                ApiConfig currentApi = AppConfigStorage.INSTANCE.loadConfig(this.$context);
                this.$apiConfig$delegate.setValue(currentApi);
                this.L$0 = activeSeries;
                this.L$1 = SpillingKt.nullOutSpilledVariable(currentApi);
                this.label = 1;
                syncAll = GoogleSheetsSyncService.INSTANCE.syncAll(this.$context, activeSeries, currentApi, this);
                if (syncAll != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                activeSeries = (List) this.L$0;
                ResultKt.throwOnFailure($result);
                syncAll = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SyncOperationResult result = (SyncOperationResult) syncAll;
        GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$15(this.$isSyncing$delegate, false);
        this.$lastSyncResult$delegate.setValue(result);
        if (result.getSuccess()) {
            SyncStorage.INSTANCE.resetPendingCount(this.$context);
            MutableState<SyncConfig> mutableState = this.$syncConfig$delegate;
            SyncStorage syncStorage = SyncStorage.INSTANCE;
            Context context = this.$context;
            Iterable iterable = activeSeries;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((Series) it.next()).getTitle());
            }
            mutableState.setValue(syncStorage.loadSyncConfig(context, (List) arrayList));
            GooglePlanilhasScreenKt.GooglePlanilhasScreen$showToast(this.$coroutineScope, this.$toastMessage$delegate, result.getMessage());
        } else {
            SyncStorage.INSTANCE.markSyncError(this.$context);
            MutableState<SyncConfig> mutableState2 = this.$syncConfig$delegate;
            SyncStorage syncStorage2 = SyncStorage.INSTANCE;
            Context context2 = this.$context;
            Iterable iterable2 = activeSeries;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Series) it2.next()).getTitle());
            }
            mutableState2.setValue(syncStorage2.loadSyncConfig(context2, (List) arrayList2));
            GooglePlanilhasScreenKt.GooglePlanilhasScreen$showToast(this.$coroutineScope, this.$toastMessage$delegate, "Erro na sincronização");
        }
        return Unit.INSTANCE;
    }
}

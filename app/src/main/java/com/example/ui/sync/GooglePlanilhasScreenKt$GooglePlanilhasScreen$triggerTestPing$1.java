package com.example.ui.sync;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.data.AppConfigStorage;
import com.example.model.ApiConfig;
import com.example.network.GoogleSheetsSyncService;
import com.example.network.SyncOperationResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(c = "com.example.ui.sync.GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerTestPing$1", f = "GooglePlanilhasScreen.kt", i = {0}, l = {195}, m = "invokeSuspend", n = {"currentApi"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerTestPing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<ApiConfig> $apiConfig$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableState<Boolean> $isTestingPing$delegate;
    final /* synthetic */ MutableState<SyncOperationResult> $lastSyncResult$delegate;
    final /* synthetic */ MutableState<String> $toastMessage$delegate;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerTestPing$1(Context context, MutableState<Boolean> mutableState, MutableState<ApiConfig> mutableState2, MutableState<SyncOperationResult> mutableState3, CoroutineScope coroutineScope, MutableState<String> mutableState4, Continuation<? super GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerTestPing$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$isTestingPing$delegate = mutableState;
        this.$apiConfig$delegate = mutableState2;
        this.$lastSyncResult$delegate = mutableState3;
        this.$coroutineScope = coroutineScope;
        this.$toastMessage$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerTestPing$1(this.$context, this.$isTestingPing$delegate, this.$apiConfig$delegate, this.$lastSyncResult$delegate, this.$coroutineScope, this.$toastMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerTestPing$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object sendTestPing;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$18(this.$isTestingPing$delegate, true);
                ApiConfig currentApi = AppConfigStorage.INSTANCE.loadConfig(this.$context);
                this.$apiConfig$delegate.setValue(currentApi);
                this.L$0 = SpillingKt.nullOutSpilledVariable(currentApi);
                this.label = 1;
                sendTestPing = GoogleSheetsSyncService.INSTANCE.sendTestPing(this.$context, currentApi, this);
                if (sendTestPing != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                sendTestPing = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SyncOperationResult result = (SyncOperationResult) sendTestPing;
        GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$18(this.$isTestingPing$delegate, false);
        this.$lastSyncResult$delegate.setValue(result);
        GooglePlanilhasScreenKt.GooglePlanilhasScreen$showToast(this.$coroutineScope, this.$toastMessage$delegate, result.getSuccess() ? "Teste gravado na planilha com sucesso!" : "Falha no teste");
        return Unit.INSTANCE;
    }
}

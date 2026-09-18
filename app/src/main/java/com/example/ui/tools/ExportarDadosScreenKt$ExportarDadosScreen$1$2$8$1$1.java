package com.example.ui.tools;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.data.AppConfigStorage;
import com.example.data.SyncStorage;
import com.example.model.ApiConfig;
import com.example.model.Series;
import com.example.network.GoogleSheetsSyncService;
import com.example.network.SyncOperationResult;
import java.util.List;
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
/* compiled from: ExportarDadosScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.ExportarDadosScreenKt$ExportarDadosScreen$1$2$8$1$1", f = "ExportarDadosScreen.kt", i = {0}, l = {456}, m = "invokeSuspend", n = {"apiConfig"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class ExportarDadosScreenKt$ExportarDadosScreen$1$2$8$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $exportCompletedMessage$delegate;
    final /* synthetic */ MutableState<Boolean> $isSendingToSheets$delegate;
    final /* synthetic */ List<Series> $seriesList;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExportarDadosScreenKt$ExportarDadosScreen$1$2$8$1$1(Context context, List<Series> list, MutableState<Boolean> mutableState, MutableState<String> mutableState2, Continuation<? super ExportarDadosScreenKt$ExportarDadosScreen$1$2$8$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$seriesList = list;
        this.$isSendingToSheets$delegate = mutableState;
        this.$exportCompletedMessage$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExportarDadosScreenKt$ExportarDadosScreen$1$2$8$1$1(this.$context, this.$seriesList, this.$isSendingToSheets$delegate, this.$exportCompletedMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExportarDadosScreenKt$ExportarDadosScreen$1$2$8$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object syncAll;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ApiConfig apiConfig = AppConfigStorage.INSTANCE.loadConfig(this.$context);
                this.L$0 = SpillingKt.nullOutSpilledVariable(apiConfig);
                this.label = 1;
                syncAll = GoogleSheetsSyncService.INSTANCE.syncAll(this.$context, this.$seriesList, apiConfig, this);
                if (syncAll != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                syncAll = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SyncOperationResult result = (SyncOperationResult) syncAll;
        ExportarDadosScreenKt.ExportarDadosScreen$lambda$8(this.$isSendingToSheets$delegate, false);
        if (result.getSuccess()) {
            SyncStorage.INSTANCE.resetPendingCount(this.$context);
            this.$exportCompletedMessage$delegate.setValue(result.getMessage());
            Toast.makeText(this.$context, "Sincronização com Google Planilhas concluída!", 0).show();
        } else {
            SyncStorage.INSTANCE.markSyncError(this.$context);
            this.$exportCompletedMessage$delegate.setValue("Falha ao sincronizar: " + result.getMessage());
            Toast.makeText(this.$context, result.getMessage(), 1).show();
        }
        return Unit.INSTANCE;
    }
}

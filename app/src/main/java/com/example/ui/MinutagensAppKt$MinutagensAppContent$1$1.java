package com.example.ui;

import android.content.Context;
import com.example.data.AppConfigStorage;
import com.example.data.SeriesStorage;
import com.example.data.SyncStorage;
import com.example.model.ApiConfig;
import com.example.model.SyncConfig;
import com.example.network.GoogleSheetsSyncService;
import com.example.network.NetworkMonitor;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MinutagensApp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.MinutagensAppKt$MinutagensAppContent$1$1", f = "MinutagensApp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class MinutagensAppKt$MinutagensAppContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineScope $coroutineScope;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinutagensAppKt$MinutagensAppContent$1$1(Context context, CoroutineScope coroutineScope, Continuation<? super MinutagensAppKt$MinutagensAppContent$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$coroutineScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MinutagensAppKt$MinutagensAppContent$1$1(this.$context, this.$coroutineScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MinutagensAppKt$MinutagensAppContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                NetworkMonitor networkMonitor = NetworkMonitor.INSTANCE;
                Context context = this.$context;
                final Context context2 = this.$context;
                final CoroutineScope coroutineScope = this.$coroutineScope;
                networkMonitor.init(context, new Function0() { // from class: com.example.ui.MinutagensAppKt$MinutagensAppContent$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MinutagensAppKt$MinutagensAppContent$1$1.invokeSuspend$lambda$0(context2, coroutineScope);
                    }
                });
                SyncConfig syncCfg = SyncStorage.loadSyncConfig$default(SyncStorage.INSTANCE, this.$context, null, 2, null);
                if (syncCfg.getAutoSyncEnabled() && syncCfg.getPendingChangesCount() > 0 && NetworkMonitor.INSTANCE.isCurrentlyOnline(this.$context)) {
                    BuildersKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass2(this.$context, null), 3, null);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit invokeSuspend$lambda$0(Context $context, CoroutineScope $coroutineScope) {
        SyncConfig syncCfg = SyncStorage.loadSyncConfig$default(SyncStorage.INSTANCE, $context, null, 2, null);
        if (syncCfg.getAutoSyncEnabled() && syncCfg.getPendingChangesCount() > 0) {
            BuildersKt.launch$default($coroutineScope, null, null, new MinutagensAppKt$MinutagensAppContent$1$1$1$1($context, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MinutagensApp.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.example.ui.MinutagensAppKt$MinutagensAppContent$1$1$2", f = "MinutagensApp.kt", i = {0, 0}, l = {209}, m = "invokeSuspend", n = {"currentSeries", "apiCfg"}, s = {"L$0", "L$1"})
    /* renamed from: com.example.ui.MinutagensAppKt$MinutagensAppContent$1$1$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object syncAll;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    List currentSeries = SeriesStorage.INSTANCE.loadSeries(this.$context);
                    ApiConfig apiCfg = AppConfigStorage.INSTANCE.loadConfig(this.$context);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(currentSeries);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(apiCfg);
                    this.label = 1;
                    syncAll = GoogleSheetsSyncService.INSTANCE.syncAll(this.$context, currentSeries, apiCfg, this);
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
            SyncOperationResult res = (SyncOperationResult) syncAll;
            if (res.getSuccess()) {
                SyncStorage.INSTANCE.resetPendingCount(this.$context);
            }
            return Unit.INSTANCE;
        }
    }
}

package com.example.ui.sync;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SincronizacaoScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.sync.SincronizacaoScreenKt$SincronizacaoScreen$showToast$1", f = "SincronizacaoScreen.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class SincronizacaoScreenKt$SincronizacaoScreen$showToast$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $msg;
    final /* synthetic */ MutableState<String> $toastMessage$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SincronizacaoScreenKt$SincronizacaoScreen$showToast$1(String str, MutableState<String> mutableState, Continuation<? super SincronizacaoScreenKt$SincronizacaoScreen$showToast$1> continuation) {
        super(2, continuation);
        this.$msg = str;
        this.$toastMessage$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SincronizacaoScreenKt$SincronizacaoScreen$showToast$1(this.$msg, this.$toastMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SincronizacaoScreenKt$SincronizacaoScreen$showToast$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        String SincronizacaoScreen$lambda$13;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$toastMessage$delegate.setValue(this.$msg);
                this.label = 1;
                if (DelayKt.delay(4000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SincronizacaoScreen$lambda$13 = SincronizacaoScreenKt.SincronizacaoScreen$lambda$13(this.$toastMessage$delegate);
        if (Intrinsics.areEqual(SincronizacaoScreen$lambda$13, this.$msg)) {
            this.$toastMessage$delegate.setValue(null);
        }
        return Unit.INSTANCE;
    }
}

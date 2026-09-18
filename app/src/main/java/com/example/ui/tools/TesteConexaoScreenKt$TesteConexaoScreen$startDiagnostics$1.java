package com.example.ui.tools;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.data.ConnectionTestManager;
import com.example.data.DiagnosticItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TesteConexaoScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.TesteConexaoScreenKt$TesteConexaoScreen$startDiagnostics$1", f = "TesteConexaoScreen.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class TesteConexaoScreenKt$TesteConexaoScreen$startDiagnostics$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<List<DiagnosticItem>> $diagnostics$delegate;
    final /* synthetic */ MutableState<Boolean> $hasRunAtLeastOnce$delegate;
    final /* synthetic */ MutableState<Boolean> $isRunningTests$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TesteConexaoScreenKt$TesteConexaoScreen$startDiagnostics$1(Context context, MutableState<List<DiagnosticItem>> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super TesteConexaoScreenKt$TesteConexaoScreen$startDiagnostics$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$diagnostics$delegate = mutableState;
        this.$isRunningTests$delegate = mutableState2;
        this.$hasRunAtLeastOnce$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TesteConexaoScreenKt$TesteConexaoScreen$startDiagnostics$1(this.$context, this.$diagnostics$delegate, this.$isRunningTests$delegate, this.$hasRunAtLeastOnce$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TesteConexaoScreenKt$TesteConexaoScreen$startDiagnostics$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ConnectionTestManager connectionTestManager = ConnectionTestManager.INSTANCE;
                Context context = this.$context;
                final MutableState<List<DiagnosticItem>> mutableState = this.$diagnostics$delegate;
                this.label = 1;
                if (connectionTestManager.runDiagnostics(context, new Function1() { // from class: com.example.ui.tools.TesteConexaoScreenKt$TesteConexaoScreen$startDiagnostics$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TesteConexaoScreenKt$TesteConexaoScreen$startDiagnostics$1.invokeSuspend$lambda$0(MutableState.this, (List) obj);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TesteConexaoScreenKt.TesteConexaoScreen$lambda$5(this.$isRunningTests$delegate, false);
        TesteConexaoScreenKt.TesteConexaoScreen$lambda$8(this.$hasRunAtLeastOnce$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit invokeSuspend$lambda$0(MutableState $diagnostics$delegate, List updatedList) {
        $diagnostics$delegate.setValue(updatedList);
        return Unit.INSTANCE;
    }
}

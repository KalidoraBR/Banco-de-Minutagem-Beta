package com.example.ui.tools;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.data.DiagnosticItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TesteConexaoScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.TesteConexaoScreenKt$TesteConexaoScreen$1$1", f = "TesteConexaoScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class TesteConexaoScreenKt$TesteConexaoScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ MutableState<List<DiagnosticItem>> $diagnostics$delegate;
    final /* synthetic */ MutableState<Boolean> $hasRunAtLeastOnce$delegate;
    final /* synthetic */ MutableState<Boolean> $isRunningTests$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TesteConexaoScreenKt$TesteConexaoScreen$1$1(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, Context context, MutableState<List<DiagnosticItem>> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super TesteConexaoScreenKt$TesteConexaoScreen$1$1> continuation) {
        super(2, continuation);
        this.$coroutineScope = coroutineScope;
        this.$isRunningTests$delegate = mutableState;
        this.$context = context;
        this.$diagnostics$delegate = mutableState2;
        this.$hasRunAtLeastOnce$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TesteConexaoScreenKt$TesteConexaoScreen$1$1(this.$coroutineScope, this.$isRunningTests$delegate, this.$context, this.$diagnostics$delegate, this.$hasRunAtLeastOnce$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TesteConexaoScreenKt$TesteConexaoScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                TesteConexaoScreenKt.TesteConexaoScreen$startDiagnostics(this.$coroutineScope, this.$isRunningTests$delegate, this.$context, this.$diagnostics$delegate, this.$hasRunAtLeastOnce$delegate);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

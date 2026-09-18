package com.example.ui.setup;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.model.ApiConfig;
import com.example.network.DiagnosticReport;
import com.example.network.GoogleSheetsSyncService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirstAccessSetupScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.setup.FirstAccessSetupScreenKt$FirstAccessSetupScreen$executeTest$1", f = "FirstAccessSetupScreen.kt", i = {0}, l = {124}, m = "invokeSuspend", n = {"currentConfig"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class FirstAccessSetupScreenKt$FirstAccessSetupScreen$executeTest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<String> $cleanId$delegate;
    final /* synthetic */ MutableState<DiagnosticReport> $diagnosticResult$delegate;
    final /* synthetic */ MutableState<Boolean> $isTesting$delegate;
    final /* synthetic */ MutableState<String> $sheetsWebHookUrl$delegate;
    final /* synthetic */ MutableState<String> $tmdbKey$delegate;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstAccessSetupScreenKt$FirstAccessSetupScreen$executeTest$1(MutableState<Boolean> mutableState, State<String> state, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<DiagnosticReport> mutableState4, Continuation<? super FirstAccessSetupScreenKt$FirstAccessSetupScreen$executeTest$1> continuation) {
        super(2, continuation);
        this.$isTesting$delegate = mutableState;
        this.$cleanId$delegate = state;
        this.$sheetsWebHookUrl$delegate = mutableState2;
        this.$tmdbKey$delegate = mutableState3;
        this.$diagnosticResult$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FirstAccessSetupScreenKt$FirstAccessSetupScreen$executeTest$1(this.$isTesting$delegate, this.$cleanId$delegate, this.$sheetsWebHookUrl$delegate, this.$tmdbKey$delegate, this.$diagnosticResult$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FirstAccessSetupScreenKt$FirstAccessSetupScreen$executeTest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        String FirstAccessSetupScreen$lambda$15;
        String FirstAccessSetupScreen$lambda$5;
        String FirstAccessSetupScreen$lambda$8;
        Object testConnection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                FirstAccessSetupScreenKt.FirstAccessSetupScreen$lambda$18(this.$isTesting$delegate, true);
                FirstAccessSetupScreen$lambda$15 = FirstAccessSetupScreenKt.FirstAccessSetupScreen$lambda$15(this.$cleanId$delegate);
                FirstAccessSetupScreen$lambda$5 = FirstAccessSetupScreenKt.FirstAccessSetupScreen$lambda$5(this.$sheetsWebHookUrl$delegate);
                String obj = StringsKt.trim((CharSequence) FirstAccessSetupScreen$lambda$5).toString();
                FirstAccessSetupScreen$lambda$8 = FirstAccessSetupScreenKt.FirstAccessSetupScreen$lambda$8(this.$tmdbKey$delegate);
                ApiConfig currentConfig = new ApiConfig(FirstAccessSetupScreen$lambda$15, obj, null, null, StringsKt.trim((CharSequence) FirstAccessSetupScreen$lambda$8).toString(), false, false, 108, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(currentConfig);
                this.label = 1;
                testConnection = GoogleSheetsSyncService.INSTANCE.testConnection(currentConfig, this);
                if (testConnection != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                testConnection = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        DiagnosticReport result = (DiagnosticReport) testConnection;
        this.$diagnosticResult$delegate.setValue(result);
        FirstAccessSetupScreenKt.FirstAccessSetupScreen$lambda$18(this.$isTesting$delegate, false);
        return Unit.INSTANCE;
    }
}

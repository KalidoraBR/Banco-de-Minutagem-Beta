package com.example.ui.season;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeasonScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.season.SeasonScreenKt$SeasonScreen$showDiscreetConfirmation$1", f = "SeasonScreen.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class SeasonScreenKt$SeasonScreen$showDiscreetConfirmation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $actionLabel;
    final /* synthetic */ MutableState<String> $confirmationToastActionLabel$delegate;
    final /* synthetic */ MutableState<String> $confirmationToastMessage$delegate;
    final /* synthetic */ MutableState<Function0<Unit>> $confirmationToastOnAction$delegate;
    final /* synthetic */ String $msg;
    final /* synthetic */ Function0<Unit> $onAction;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeasonScreenKt$SeasonScreen$showDiscreetConfirmation$1(String str, String str2, Function0<Unit> function0, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Function0<Unit>> mutableState3, Continuation<? super SeasonScreenKt$SeasonScreen$showDiscreetConfirmation$1> continuation) {
        super(2, continuation);
        this.$msg = str;
        this.$actionLabel = str2;
        this.$onAction = function0;
        this.$confirmationToastMessage$delegate = mutableState;
        this.$confirmationToastActionLabel$delegate = mutableState2;
        this.$confirmationToastOnAction$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SeasonScreenKt$SeasonScreen$showDiscreetConfirmation$1(this.$msg, this.$actionLabel, this.$onAction, this.$confirmationToastMessage$delegate, this.$confirmationToastActionLabel$delegate, this.$confirmationToastOnAction$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SeasonScreenKt$SeasonScreen$showDiscreetConfirmation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        String SeasonScreen$lambda$36;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$confirmationToastMessage$delegate.setValue(this.$msg);
                this.$confirmationToastActionLabel$delegate.setValue(this.$actionLabel);
                this.$confirmationToastOnAction$delegate.setValue(this.$onAction);
                this.label = 1;
                if (DelayKt.delay(3500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SeasonScreen$lambda$36 = SeasonScreenKt.SeasonScreen$lambda$36(this.$confirmationToastMessage$delegate);
        if (Intrinsics.areEqual(SeasonScreen$lambda$36, this.$msg)) {
            this.$confirmationToastMessage$delegate.setValue(null);
            this.$confirmationToastActionLabel$delegate.setValue(null);
            this.$confirmationToastOnAction$delegate.setValue(null);
        }
        return Unit.INSTANCE;
    }
}

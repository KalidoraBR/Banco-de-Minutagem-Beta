package com.example.ui.tools;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.data.ExportFormat;
import com.example.data.ExportManager;
import com.example.model.Series;
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
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExportarDadosScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.tools.ExportarDadosScreenKt$ExportarDadosScreen$1$2$6$1$1", f = "ExportarDadosScreen.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class ExportarDadosScreenKt$ExportarDadosScreen$1$2$6$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $exportCompletedMessage$delegate;
    final /* synthetic */ MutableState<Boolean> $isExporting$delegate;
    final /* synthetic */ MutableState<ExportFormat> $selectedFormat$delegate;
    final /* synthetic */ List<Series> $seriesList;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExportarDadosScreenKt$ExportarDadosScreen$1$2$6$1$1(List<Series> list, Context context, MutableState<ExportFormat> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, Continuation<? super ExportarDadosScreenKt$ExportarDadosScreen$1$2$6$1$1> continuation) {
        super(2, continuation);
        this.$seriesList = list;
        this.$context = context;
        this.$selectedFormat$delegate = mutableState;
        this.$isExporting$delegate = mutableState2;
        this.$exportCompletedMessage$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExportarDadosScreenKt$ExportarDadosScreen$1$2$6$1$1(this.$seriesList, this.$context, this.$selectedFormat$delegate, this.$isExporting$delegate, this.$exportCompletedMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExportarDadosScreenKt$ExportarDadosScreen$1$2$6$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        ExportFormat ExportarDadosScreen$lambda$1;
        ExportFormat ExportarDadosScreen$lambda$12;
        ExportFormat ExportarDadosScreen$lambda$13;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (DelayKt.delay(400L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ExportManager exportManager = ExportManager.INSTANCE;
        List<Series> list = this.$seriesList;
        ExportarDadosScreen$lambda$1 = ExportarDadosScreenKt.ExportarDadosScreen$lambda$1(this.$selectedFormat$delegate);
        String content = exportManager.generateExportContent(list, ExportarDadosScreen$lambda$1);
        ExportarDadosScreenKt.ExportarDadosScreen$lambda$5(this.$isExporting$delegate, false);
        MutableState<String> mutableState = this.$exportCompletedMessage$delegate;
        ExportarDadosScreen$lambda$12 = ExportarDadosScreenKt.ExportarDadosScreen$lambda$1(this.$selectedFormat$delegate);
        mutableState.setValue("Exportação em formato " + ExportarDadosScreen$lambda$12.getTitle() + " gerada com sucesso! Compartilhando com o sistema...");
        Toast.makeText(this.$context, "Exportação concluída com sucesso!", 0).show();
        ExportManager exportManager2 = ExportManager.INSTANCE;
        Context context = this.$context;
        ExportarDadosScreen$lambda$13 = ExportarDadosScreenKt.ExportarDadosScreen$lambda$1(this.$selectedFormat$delegate);
        exportManager2.shareExportContent(context, content, ExportarDadosScreen$lambda$13);
        return Unit.INSTANCE;
    }
}

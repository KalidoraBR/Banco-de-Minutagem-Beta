package com.example.ui.detail;

import android.content.Context;
import com.example.data.FixedTimingsStorage;
import com.example.model.FixedTimingsConfig;
import com.example.model.Series;
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

/* compiled from: SeriesDetailScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.detail.SeriesDetailScreenKt$SeriesDetailScreen$3$1", f = "SeriesDetailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SeriesDetailScreenKt$SeriesDetailScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<Series, Unit> $onUpdateSeries;
    final /* synthetic */ Series $series;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SeriesDetailScreenKt$SeriesDetailScreen$3$1(Context context, Series series, Function1<? super Series, Unit> function1, Continuation<? super SeriesDetailScreenKt$SeriesDetailScreen$3$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$series = series;
        this.$onUpdateSeries = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SeriesDetailScreenKt$SeriesDetailScreen$3$1(this.$context, this.$series, this.$onUpdateSeries, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SeriesDetailScreenKt$SeriesDetailScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                FixedTimingsConfig savedConfig = FixedTimingsStorage.INSTANCE.loadFixedTimings(this.$context, this.$series.getId());
                if (savedConfig != null && this.$series.getFixedTimingsActiveCount() == 0 && savedConfig.getActiveCount() > 0) {
                    this.$onUpdateSeries.invoke(Series.copy$default(this.$series, null, null, 0, null, 0, 0, null, 0L, null, 0L, 0L, null, null, null, false, null, savedConfig.getActiveCount(), savedConfig.getTotalCount(), null, null, null, null, savedConfig, 3997695, null));
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

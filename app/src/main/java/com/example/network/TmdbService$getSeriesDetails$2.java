package com.example.network;

import com.example.model.TmdbSeriesDetails;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TmdbService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/model/TmdbSeriesDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.network.TmdbService$getSeriesDetails$2", f = "TmdbService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class TmdbService$getSeriesDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TmdbSeriesDetails>, Object> {
    final /* synthetic */ String $apiKey;
    final /* synthetic */ String $tmdbId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmdbService$getSeriesDetails$2(String str, String str2, Continuation<? super TmdbService$getSeriesDetails$2> continuation) {
        super(2, continuation);
        this.$tmdbId = str;
        this.$apiKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TmdbService$getSeriesDetails$2(this.$tmdbId, this.$apiKey, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TmdbSeriesDetails> continuation) {
        return ((TmdbService$getSeriesDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        String effectiveKey;
        boolean isBearerToken;
        OkHttpClient okHttpClient;
        String responseBody;
        TmdbSeriesDetails parseSeriesDetails;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (StringsKt.isBlank(this.$tmdbId)) {
                    return null;
                }
                try {
                    effectiveKey = TmdbService.INSTANCE.getEffectiveKey(this.$apiKey);
                    isBearerToken = TmdbService.INSTANCE.isBearer(effectiveKey);
                    String str = this.$tmdbId;
                    String directUrl = isBearerToken ? "https://api.themoviedb.org/3/tv/" + str + "?language=pt-BR" : "https://api.themoviedb.org/3/tv/" + str + "?api_key=" + effectiveKey + "&language=pt-BR";
                    Request.Builder requestBuilder = new Request.Builder().url(directUrl).get();
                    if (isBearerToken) {
                        requestBuilder.header("Authorization", "Bearer " + effectiveKey);
                    }
                    okHttpClient = TmdbService.client;
                    Response response = okHttpClient.newCall(requestBuilder.build()).execute();
                    if (response.isSuccessful()) {
                        ResponseBody body = response.body();
                        if (body == null || (responseBody = body.string()) == null) {
                            responseBody = "";
                        }
                        parseSeriesDetails = TmdbService.INSTANCE.parseSeriesDetails(responseBody, this.$tmdbId);
                        return parseSeriesDetails;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

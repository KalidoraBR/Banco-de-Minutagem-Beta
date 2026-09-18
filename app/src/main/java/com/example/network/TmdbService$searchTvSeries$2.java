package com.example.network;

import com.example.model.TmdbSearchResult;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/model/TmdbSearchResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.network.TmdbService$searchTvSeries$2", f = "TmdbService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class TmdbService$searchTvSeries$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends TmdbSearchResult>>, Object> {
    final /* synthetic */ String $apiKey;
    final /* synthetic */ String $query;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmdbService$searchTvSeries$2(String str, String str2, Continuation<? super TmdbService$searchTvSeries$2> continuation) {
        super(2, continuation);
        this.$query = str;
        this.$apiKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TmdbService$searchTvSeries$2(this.$query, this.$apiKey, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends TmdbSearchResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<TmdbSearchResult>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<TmdbSearchResult>> continuation) {
        return ((TmdbService$searchTvSeries$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        List fallbackSearchResults;
        String effectiveKey;
        boolean isBearerToken;
        OkHttpClient okHttpClient;
        String responseBody;
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (StringsKt.isBlank(this.$query)) {
                    return CollectionsKt.emptyList();
                }
                try {
                    String encodedQuery = URLEncoder.encode(StringsKt.trim((CharSequence) this.$query).toString(), "UTF-8");
                    effectiveKey = TmdbService.INSTANCE.getEffectiveKey(this.$apiKey);
                    isBearerToken = TmdbService.INSTANCE.isBearer(effectiveKey);
                    String directUrl = isBearerToken ? "https://api.themoviedb.org/3/search/tv?query=" + encodedQuery + "&language=pt-BR&include_adult=false" : "https://api.themoviedb.org/3/search/tv?api_key=" + effectiveKey + "&query=" + encodedQuery + "&language=pt-BR&include_adult=false";
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
                        list = TmdbService.INSTANCE.parseSearchResults(responseBody);
                        if (!list.isEmpty()) {
                            return list;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                fallbackSearchResults = TmdbService.INSTANCE.getFallbackSearchResults(this.$query);
                return fallbackSearchResults;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

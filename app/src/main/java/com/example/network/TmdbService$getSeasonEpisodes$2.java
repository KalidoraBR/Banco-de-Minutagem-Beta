package com.example.network;

import com.example.model.TmdbEpisodeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TmdbService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/model/TmdbEpisodeInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.network.TmdbService$getSeasonEpisodes$2", f = "TmdbService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class TmdbService$getSeasonEpisodes$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends TmdbEpisodeInfo>>, Object> {
    final /* synthetic */ String $apiKey;
    final /* synthetic */ int $seasonNumber;
    final /* synthetic */ String $tmdbId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmdbService$getSeasonEpisodes$2(String str, int i, String str2, Continuation<? super TmdbService$getSeasonEpisodes$2> continuation) {
        super(2, continuation);
        this.$tmdbId = str;
        this.$seasonNumber = i;
        this.$apiKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TmdbService$getSeasonEpisodes$2(this.$tmdbId, this.$seasonNumber, this.$apiKey, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends TmdbEpisodeInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<TmdbEpisodeInfo>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<TmdbEpisodeInfo>> continuation) {
        return ((TmdbService$getSeasonEpisodes$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4 A[Catch: Exception -> 0x0239, TryCatch #0 {Exception -> 0x0239, blocks: (B:11:0x0026, B:14:0x003d, B:15:0x008a, B:17:0x009a, B:18:0x00b2, B:20:0x00c8, B:23:0x00d0, B:25:0x00d7, B:27:0x00e4, B:29:0x00e9, B:31:0x00f7, B:34:0x0140, B:35:0x0194, B:37:0x01b0, B:43:0x01c6, B:45:0x01d4, B:47:0x01e2, B:49:0x01fc, B:59:0x021a, B:66:0x005f), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.network.TmdbService$getSeasonEpisodes$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.example.data;

import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.OkHttpClient;

/* compiled from: ConnectionTestManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J4\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\n0\u000eH\u0086@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/data/ConnectionTestManager;", "", "<init>", "()V", "client", "Lokhttp3/OkHttpClient;", "getInitialDiagnostics", "", "Lcom/example/data/DiagnosticItem;", "runDiagnostics", "", "context", "Landroid/content/Context;", "onUpdate", "Lkotlin/Function1;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConnectionTestManager {
    public static final ConnectionTestManager INSTANCE = new ConnectionTestManager();
    private static final OkHttpClient client = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS).readTimeout(5, TimeUnit.SECONDS).build();
    public static final int $stable = 8;

    private ConnectionTestManager() {
    }

    public final List<DiagnosticItem> getInitialDiagnostics() {
        return CollectionsKt.listOf((Object[]) new DiagnosticItem[]{new DiagnosticItem("internet", "Internet", "Conectividade de rede do dispositivo e resolução DNS", null, null, null, 56, null), new DiagnosticItem("sync_service", "Sincronização com Google Sheets", "Comunicação direta com o Google Planilhas e Apps Script", null, null, null, 56, null), new DiagnosticItem("database", "Banco de Dados Local", "Integridade do armazenamento persistente de séries e minutagens", null, null, null, 56, null), new DiagnosticItem("tmdb", "TMDB (The Movie Database)", "Acesso à API de metadados, títulos e pôsteres de séries", null, null, null, 56, null), new DiagnosticItem("google_sheets", "Google Planilhas", "Autorização e vinculação da planilha integrada", null, null, null, 56, null)});
    }

    public static /* synthetic */ Object runDiagnostics$default(ConnectionTestManager connectionTestManager, Context context, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return connectionTestManager.runDiagnostics(context, function1, continuation);
    }

    public final Object runDiagnostics(Context context, Function1<? super List<DiagnosticItem>, Unit> function1, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new ConnectionTestManager$runDiagnostics$2(context, function1, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}

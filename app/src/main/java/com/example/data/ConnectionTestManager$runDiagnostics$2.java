package com.example.data;

import android.content.Context;
import com.example.model.ApiConfig;
import com.example.network.NetworkMonitor;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConnectionTestManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.data.ConnectionTestManager$runDiagnostics$2", f = "ConnectionTestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class ConnectionTestManager$runDiagnostics$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<List<DiagnosticItem>, Unit> $onUpdate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionTestManager$runDiagnostics$2(Context context, Function1<? super List<DiagnosticItem>, Unit> function1, Continuation<? super ConnectionTestManager$runDiagnostics$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$onUpdate = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConnectionTestManager$runDiagnostics$2(this.$context, this.$onUpdate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConnectionTestManager$runDiagnostics$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x007d. Please report as an issue. */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        String str;
        String str2;
        DiagnosticItem resultItem;
        OkHttpClient okHttpClient;
        String tmdbApiKey;
        String sheetsSpreadsheetId;
        String obj;
        OkHttpClient okHttpClient2;
        DiagnosticItem copy$default;
        OkHttpClient okHttpClient3;
        String effectiveWebHookUrl;
        String obj2;
        List series;
        String str3 = "?";
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                List items = CollectionsKt.toMutableList((Collection) ConnectionTestManager.INSTANCE.getInitialDiagnostics());
                Context context = this.$context;
                ApiConfig apiConfig = context != null ? AppConfigStorage.INSTANCE.loadConfig(context) : null;
                int size = items.size();
                int i = 0;
                while (i < size) {
                    items.set(i, DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.CHECKING, null, "Verificando...", 23, null));
                    this.$onUpdate.invoke(CollectionsKt.toList(items));
                    long startTime = System.currentTimeMillis();
                    String id = ((DiagnosticItem) items.get(i)).getId();
                    String webHookUrl = "";
                    boolean isConfigured = false;
                    switch (id.hashCode()) {
                        case 3563703:
                            str = str3;
                            if (id.equals("tmdb")) {
                                if (apiConfig == null || (tmdbApiKey = apiConfig.getTmdbApiKey()) == null || (str2 = StringsKt.trim((CharSequence) tmdbApiKey).toString()) == null) {
                                    str2 = "e2832a818c1d5333f2c25eb42abce207";
                                }
                                String key = str2;
                                if (!StringsKt.isBlank(key)) {
                                    try {
                                        Request req = new Request.Builder().url("https://api.themoviedb.org/3/configuration?api_key=" + key).get().build();
                                        okHttpClient = ConnectionTestManager.client;
                                        Response resp = okHttpClient.newCall(req).execute();
                                        long elapsed = System.currentTimeMillis() - startTime;
                                        resultItem = resp.isSuccessful() ? DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, Boxing.boxLong(elapsed), "API do TMDB operacional e respondendo (" + elapsed + "ms)", 7, null) : DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.WARNING, Boxing.boxLong(elapsed), "TMDB retornou código " + resp.code() + " (verifique a chave nas configurações)", 7, null);
                                        break;
                                    } catch (Exception e) {
                                        resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.WARNING, Boxing.boxLong(System.currentTimeMillis() - startTime), "TMDB indisponível no momento: " + e.getLocalizedMessage(), 7, null);
                                        break;
                                    }
                                } else {
                                    resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.WARNING, Boxing.boxLong(0L), "Chave da API do TMDB não configurada", 7, null);
                                    break;
                                }
                            }
                            resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, null, "OK", 23, null);
                            break;
                        case 432024506:
                            str = str3;
                            if (id.equals("google_sheets")) {
                                if (apiConfig != null && (sheetsSpreadsheetId = apiConfig.getSheetsSpreadsheetId()) != null && (obj = StringsKt.trim((CharSequence) sheetsSpreadsheetId).toString()) != null) {
                                    webHookUrl = obj;
                                }
                                if (!StringsKt.isBlank(webHookUrl) && !StringsKt.contains((CharSequence) webHookUrl, (CharSequence) "SampleSpreadsheetId", true)) {
                                    isConfigured = true;
                                }
                                long elapsed2 = System.currentTimeMillis() - startTime;
                                if (!isConfigured) {
                                    resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.WARNING, Boxing.boxLong(elapsed2), "ID da Planilha pendente. Configure em Ferramentas > Configurar Credenciais.", 7, null);
                                    break;
                                } else {
                                    resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, Boxing.boxLong(elapsed2), "Planilha vinculada com ID '" + (webHookUrl.length() > 8 ? StringsKt.take(webHookUrl, 6) + "..." : webHookUrl) + "'", 7, null);
                                    break;
                                }
                            }
                            resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, null, "OK", 23, null);
                            break;
                        case 570410817:
                            str = str3;
                            if (id.equals("internet")) {
                                Context context2 = this.$context;
                                boolean isOnline = context2 != null ? NetworkMonitor.INSTANCE.isCurrentlyOnline(context2) : true;
                                if (!isOnline) {
                                    resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.ERROR, Boxing.boxLong(0L), "Dispositivo sem acesso à internet", 7, null);
                                    break;
                                } else {
                                    Request req2 = new Request.Builder().url("https://clients3.google.com/generate_204").get().build();
                                    try {
                                        okHttpClient2 = ConnectionTestManager.client;
                                        Response resp2 = okHttpClient2.newCall(req2).execute();
                                        long elapsed3 = System.currentTimeMillis() - startTime;
                                        if (!resp2.isSuccessful() && resp2.code() != 204) {
                                            copy$default = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, Boxing.boxLong(elapsed3), "Rede conectada via Wi-Fi/Dados Móveis", 7, null);
                                            resultItem = copy$default;
                                            break;
                                        }
                                        copy$default = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, Boxing.boxLong(elapsed3), "Rede ativa e conectada à internet (" + elapsed3 + "ms)", 7, null);
                                        resultItem = copy$default;
                                    } catch (Exception e2) {
                                        resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.WARNING, Boxing.boxLong(System.currentTimeMillis() - startTime), "Conexão instável ou limitada", 7, null);
                                        break;
                                    }
                                }
                            }
                            resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, null, "OK", 23, null);
                            break;
                        case 633257233:
                            if (id.equals("sync_service")) {
                                if (apiConfig != null && (effectiveWebHookUrl = apiConfig.getEffectiveWebHookUrl()) != null && (obj2 = StringsKt.trim((CharSequence) effectiveWebHookUrl).toString()) != null) {
                                    webHookUrl = obj2;
                                }
                                boolean hasWebHook = !StringsKt.isBlank(webHookUrl) && StringsKt.startsWith$default(webHookUrl, "http", false, 2, (Object) null);
                                if (hasWebHook) {
                                    try {
                                        str = str3;
                                    } catch (Exception e3) {
                                        e = e3;
                                        str = str3;
                                    }
                                    try {
                                        String sep = StringsKt.contains$default((CharSequence) webHookUrl, (CharSequence) str3, false, 2, (Object) null) ? "&" : str;
                                        Request req3 = new Request.Builder().url(webHookUrl + sep + "action=ping").get().build();
                                        okHttpClient3 = ConnectionTestManager.client;
                                        Response resp3 = okHttpClient3.newCall(req3).execute();
                                        long elapsed4 = System.currentTimeMillis() - startTime;
                                        resultItem = resp3.isSuccessful() ? DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, Boxing.boxLong(elapsed4), "Google Apps Script Web App ativo e respondendo (" + elapsed4 + "ms)", 7, null) : DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.WARNING, Boxing.boxLong(elapsed4), "Apps Script retornou HTTP " + resp3.code(), 7, null);
                                    } catch (Exception e4) {
                                        e = e4;
                                        resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.WARNING, Boxing.boxLong(System.currentTimeMillis() - startTime), "Apps Script inacessível: " + e.getLocalizedMessage(), 7, null);
                                        items.set(i, resultItem);
                                        this.$onUpdate.invoke(CollectionsKt.toList(items));
                                        i++;
                                        str3 = str;
                                    }
                                } else {
                                    str = str3;
                                    resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, Boxing.boxLong(System.currentTimeMillis() - startTime), "Sincronização direta isolada com Google Planilhas ativa", 7, null);
                                }
                            }
                            str = str3;
                            resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, null, "OK", 23, null);
                            break;
                        case 1789464955:
                            if (id.equals("database")) {
                                try {
                                    Context context3 = this.$context;
                                    if (context3 == null || (series = SeriesStorage.INSTANCE.loadSeries(context3)) == null) {
                                        series = CollectionsKt.emptyList();
                                    }
                                    resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, Boxing.boxLong(System.currentTimeMillis() - startTime), "Base local íntegra (" + series.size() + " séries carregadas do disco)", 7, null);
                                } catch (Exception e5) {
                                    resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.ERROR, Boxing.boxLong(System.currentTimeMillis() - startTime), "Falha ao acessar armazenamento local: " + e5.getMessage(), 7, null);
                                }
                                str = str3;
                                break;
                            }
                            str = str3;
                            resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, null, "OK", 23, null);
                            break;
                        default:
                            str = str3;
                            resultItem = DiagnosticItem.copy$default((DiagnosticItem) items.get(i), null, null, null, DiagnosticStatus.SUCCESS, null, "OK", 23, null);
                            break;
                    }
                    items.set(i, resultItem);
                    this.$onUpdate.invoke(CollectionsKt.toList(items));
                    i++;
                    str3 = str;
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

package com.example.network;

import android.content.Context;
import com.example.model.ApiConfig;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GoogleSheetsSyncService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/network/RemoteQueryResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.network.GoogleSheetsSyncService$fetchExistingData$2", f = "GoogleSheetsSyncService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class GoogleSheetsSyncService$fetchExistingData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RemoteQueryResult>, Object> {
    final /* synthetic */ ApiConfig $config;
    final /* synthetic */ Context $context;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleSheetsSyncService$fetchExistingData$2(Context context, ApiConfig apiConfig, Continuation<? super GoogleSheetsSyncService$fetchExistingData$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$config = apiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoogleSheetsSyncService$fetchExistingData$2(this.$context, this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RemoteQueryResult> continuation) {
        return ((GoogleSheetsSyncService$fetchExistingData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        OkHttpClient okHttpClient;
        String string;
        OkHttpClient okHttpClient2;
        String bodyString;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!NetworkMonitor.INSTANCE.isCurrentlyOnline(this.$context)) {
                    return new RemoteQueryResult(false, true, "Dispositivo offline. Não é possível consultar a planilha no momento.", null, 0, null, 56, null);
                }
                String cleanSpreadsheetId = ApiConfig.INSTANCE.extractSpreadsheetId(this.$config.getSheetsSpreadsheetId());
                if (StringsKt.isBlank(cleanSpreadsheetId) || StringsKt.contains((CharSequence) cleanSpreadsheetId, (CharSequence) "SampleSpreadsheetId", true)) {
                    return new RemoteQueryResult(false, false, "ID da Planilha não configurado.", null, 0, null, 58, null);
                }
                String webHookUrl = this.$config.getEffectiveWebHookUrl();
                String body = "";
                if (!StringsKt.isBlank(webHookUrl)) {
                    String sep = StringsKt.contains$default((CharSequence) webHookUrl, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?";
                    String targetUrl = webHookUrl + sep + "action=import_to_app&spreadsheetId=" + cleanSpreadsheetId;
                    Request request = new Request.Builder().url(targetUrl).get().build();
                    try {
                        okHttpClient2 = GoogleSheetsSyncService.client;
                        Response response = okHttpClient2.newCall(request).execute();
                        ResponseBody body2 = response.body();
                        if (body2 == null || (bodyString = body2.string()) == null) {
                            bodyString = "";
                        }
                        if (response.isSuccessful()) {
                            JSONObject json = new JSONObject(bodyString);
                            JSONArray tabsArray = json.optJSONArray("tabs");
                            List tabsList = new ArrayList();
                            if (tabsArray != null) {
                                int length = tabsArray.length();
                                for (int i = 0; i < length; i++) {
                                    String string2 = tabsArray.getString(i);
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    tabsList.add(string2);
                                }
                            }
                            return new RemoteQueryResult(true, false, SheetsImportHelper.performImport(this.$context, json, tabsList), tabsList, json.optInt("seriesCount", tabsList.size()), Boxing.boxLong(json.optLong("lastModified", System.currentTimeMillis())), 2, null);
                        }
                    } catch (Exception e) {
                    }
                }
                try {
                    String gvizUrl = "https://docs.google.com/spreadsheets/d/" + cleanSpreadsheetId + "/gviz/tq?tqx=out:json";
                    Request request2 = new Request.Builder().url(gvizUrl).get().build();
                    okHttpClient = GoogleSheetsSyncService.client;
                    Response response2 = okHttpClient.newCall(request2).execute();
                    ResponseBody body3 = response2.body();
                    if (body3 != null && (string = body3.string()) != null) {
                        body = string;
                    }
                    if (response2.isSuccessful() && StringsKt.contains$default((CharSequence) body, (CharSequence) "google.visualization.Query.setResponse", false, 2, (Object) null)) {
                        return new RemoteQueryResult(true, false, "Planilha localizada no Google com sucesso!", CollectionsKt.listOf("Principal"), 1, Boxing.boxLong(System.currentTimeMillis()), 2, null);
                    }
                    return new RemoteQueryResult(false, false, "Planilha inacessível no Google. Verifique se o ID está correto e as permissões de acesso da planilha.", null, 0, null, 58, null);
                } catch (Exception e2) {
                    String localizedMessage = e2.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = "Falha de rede";
                    }
                    return new RemoteQueryResult(false, false, "Erro ao acessar o Google Planilhas: " + localizedMessage, null, 0, null, 58, null);
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

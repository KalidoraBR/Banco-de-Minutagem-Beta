package com.example.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: NetworkMonitor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/example/network/NetworkMonitor;", "", "<init>", "()V", "_isOnline", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isOnline", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isInitialized", "onRestoreAction", "Lkotlin/Function0;", "", "init", "context", "Landroid/content/Context;", "onConnectionRestored", "isCurrentlyOnline", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkMonitor {
    private static boolean isInitialized;
    private static Function0<Unit> onRestoreAction;
    public static final NetworkMonitor INSTANCE = new NetworkMonitor();
    private static final MutableStateFlow<Boolean> _isOnline = StateFlowKt.MutableStateFlow(true);
    private static final StateFlow<Boolean> isOnline = FlowKt.asStateFlow(_isOnline);
    public static final int $stable = 8;

    private NetworkMonitor() {
    }

    public final StateFlow<Boolean> isOnline() {
        return isOnline;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void init$default(NetworkMonitor networkMonitor, Context context, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        networkMonitor.init(context, function0);
    }

    public final void init(Context context, Function0<Unit> onConnectionRestored) {
        Intrinsics.checkNotNullParameter(context, "context");
        onRestoreAction = onConnectionRestored;
        if (isInitialized) {
            return;
        }
        isInitialized = true;
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        boolean initialConnected = capabilities != null && capabilities.hasCapability(12);
        _isOnline.setValue(Boolean.valueOf(initialConnected));
        NetworkRequest request = new NetworkRequest.Builder().addCapability(12).build();
        connectivityManager.registerNetworkCallback(request, new ConnectivityManager.NetworkCallback() { // from class: com.example.network.NetworkMonitor$init$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                Intrinsics.checkNotNullParameter(network, "network");
                mutableStateFlow = NetworkMonitor._isOnline;
                boolean wasOffline = !((Boolean) mutableStateFlow.getValue()).booleanValue();
                mutableStateFlow2 = NetworkMonitor._isOnline;
                mutableStateFlow2.setValue(true);
                if (wasOffline) {
                    BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new NetworkMonitor$init$1$onAvailable$1(null), 3, null);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                MutableStateFlow mutableStateFlow;
                Intrinsics.checkNotNullParameter(network, "network");
                mutableStateFlow = NetworkMonitor._isOnline;
                mutableStateFlow.setValue(false);
            }
        });
    }

    public final boolean isCurrentlyOnline(Context context) {
        Network activeNetwork;
        NetworkCapabilities capabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (capabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return capabilities.hasCapability(12);
    }
}

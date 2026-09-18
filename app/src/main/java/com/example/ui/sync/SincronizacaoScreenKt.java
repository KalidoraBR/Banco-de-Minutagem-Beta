package com.example.ui.sync;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.example.model.Series;
import com.example.model.SheetsIntegrationState;
import com.example.model.SyncConfig;
import com.example.model.SyncConnectionState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SincronizacaoScreen.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\u001aS\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a/\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0013\u001a5\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020#X\u008a\u0084\u0002"}, d2 = {"SincronizacaoScreen", "", "seriesList", "", "Lcom/example/model/Series;", "onBack", "Lkotlin/Function0;", "onOpenGooglePlanilhas", "onOpenApiConfig", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatusOverviewCard", "connectionState", "Lcom/example/model/SyncConnectionState;", "pendingCount", "", "lastSyncFormatted", "", "(Lcom/example/model/SyncConnectionState;ILjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GoogleSheetsSummaryCard", "sheetsState", "Lcom/example/model/SheetsIntegrationState;", "spreadsheetName", "onClickOpen", "(Lcom/example/model/SheetsIntegrationState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SyncInfoBox", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "syncConfig", "Lcom/example/model/SyncConfig;", "isSyncing", "", "toastMessage", "angle", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SincronizacaoScreenKt {

    /* compiled from: SincronizacaoScreen.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SyncConnectionState.values().length];
            try {
                iArr[SyncConnectionState.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[SyncConnectionState.OFFLINE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[SyncConnectionState.SYNCING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[SyncConnectionState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SheetsIntegrationState.values().length];
            try {
                iArr2[SheetsIntegrationState.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr2[SheetsIntegrationState.CONFIGURED.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr2[SheetsIntegrationState.NOT_CONFIGURED.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr2[SheetsIntegrationState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GoogleSheetsSummaryCard$lambda$62(SheetsIntegrationState sheetsIntegrationState, String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoogleSheetsSummaryCard(sheetsIntegrationState, str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SincronizacaoScreen$lambda$39(List list, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SincronizacaoScreen(list, function0, function02, function03, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusOverviewCard$lambda$51(SyncConnectionState syncConnectionState, int i, String str, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        StatusOverviewCard(syncConnectionState, i, str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SyncInfoBox$lambda$64(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SyncInfoBox(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0cc9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0dbe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0df7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0ee0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0eec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0f25  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x1036  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x107b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x11a0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x11ac  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x11e3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x14a7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x155a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x157e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x15b8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x163f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x15c3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x158b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x155d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x14be  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x11f9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x11b2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1091 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1048  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0f3b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0e0d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0cdf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0c96  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x054c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SincronizacaoScreen(java.util.List<com.example.model.Series> r206, final kotlin.jvm.functions.Function0<kotlin.Unit> r207, final kotlin.jvm.functions.Function0<kotlin.Unit> r208, kotlin.jvm.functions.Function0<kotlin.Unit> r209, androidx.compose.ui.Modifier r210, androidx.compose.runtime.Composer r211, final int r212, final int r213) {
        /*
            Method dump skipped, instructions count: 5726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.SincronizacaoScreenKt.SincronizacaoScreen(java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SincronizacaoScreen$lambda$3$lambda$2(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final SyncConfig SincronizacaoScreen$lambda$7(MutableState<SyncConfig> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean SincronizacaoScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SincronizacaoScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SincronizacaoScreen$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SincronizacaoScreen$showToast(CoroutineScope coroutineScope, MutableState<String> mutableState, String msg) {
        BuildersKt.launch$default(coroutineScope, null, null, new SincronizacaoScreenKt$SincronizacaoScreen$showToast$1(msg, mutableState, null), 3, null);
    }

    private static final void SincronizacaoScreen$triggerSync(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, List<Series> list, Context context, MutableState<SyncConfig> mutableState2, MutableState<String> mutableState3) {
        if (SincronizacaoScreen$lambda$10(mutableState)) {
            return;
        }
        BuildersKt.launch$default(coroutineScope, null, null, new SincronizacaoScreenKt$SincronizacaoScreen$triggerSync$1(list, context, mutableState, mutableState2, coroutineScope, mutableState3, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SincronizacaoScreen$lambda$38$lambda$30$lambda$29$lambda$24$lambda$23(CoroutineScope $coroutineScope, MutableState $isSyncing$delegate, List $seriesList, Context $context, MutableState $syncConfig$delegate, MutableState $toastMessage$delegate) {
        SincronizacaoScreen$triggerSync($coroutineScope, $isSyncing$delegate, $seriesList, $context, $syncConfig$delegate, $toastMessage$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SincronizacaoScreen$lambda$38$lambda$30$lambda$29$lambda$28(androidx.compose.runtime.MutableState r109, androidx.compose.foundation.layout.RowScope r110, androidx.compose.runtime.Composer r111, int r112) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.SincronizacaoScreenKt.SincronizacaoScreen$lambda$38$lambda$30$lambda$29$lambda$28(androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final float SincronizacaoScreen$lambda$38$lambda$30$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int SincronizacaoScreen$lambda$38$lambda$32$lambda$31(int it) {
        return it / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int SincronizacaoScreen$lambda$38$lambda$34$lambda$33(int it) {
        return it / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SincronizacaoScreen$lambda$38$lambda$37(androidx.compose.runtime.MutableState r103, androidx.compose.animation.AnimatedVisibilityScope r104, androidx.compose.runtime.Composer r105, int r106) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.SincronizacaoScreenKt.SincronizacaoScreen$lambda$38$lambda$37(androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0c81  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0e11  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0e3d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0f8c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0fd1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x10ae  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x10ba  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x10f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x11d0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x11dc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x1213  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x1469  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x1229  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x11e2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x1109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x10c0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0f9e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0e47  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0e14  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0cd0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0bb0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0a92 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x052c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0916  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void StatusOverviewCard(final com.example.model.SyncConnectionState r219, final int r220, final java.lang.String r221, androidx.compose.ui.Modifier r222, androidx.compose.runtime.Composer r223, final int r224, final int r225) {
        /*
            Method dump skipped, instructions count: 5268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.SincronizacaoScreenKt.StatusOverviewCard(com.example.model.SyncConnectionState, int, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0c91  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0cd4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0cea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0b78 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0922 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x07c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x064a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x076a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void GoogleSheetsSummaryCard(final com.example.model.SheetsIntegrationState r193, final java.lang.String r194, final kotlin.jvm.functions.Function0<kotlin.Unit> r195, androidx.compose.ui.Modifier r196, androidx.compose.runtime.Composer r197, final int r198, final int r199) {
        /*
            Method dump skipped, instructions count: 3778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.SincronizacaoScreenKt.GoogleSheetsSummaryCard(com.example.model.SheetsIntegrationState, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GoogleSheetsSummaryCard$lambda$53$lambda$52(Function0 $onClickOpen) {
        $onClickOpen.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void SyncInfoBox(androidx.compose.ui.Modifier r84, androidx.compose.runtime.Composer r85, final int r86, final int r87) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.SincronizacaoScreenKt.SyncInfoBox(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

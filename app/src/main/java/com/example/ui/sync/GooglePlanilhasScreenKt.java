package com.example.ui.sync;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.example.data.AppConfigStorage;
import com.example.data.SyncStorage;
import com.example.model.ApiConfig;
import com.example.model.Series;
import com.example.model.SheetsIntegrationState;
import com.example.model.SyncConfig;
import com.example.network.SyncOperationResult;
import com.example.ui.theme.ColorKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GooglePlanilhasScreen.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aE\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001aE\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0013\u001a9\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010!\u001a\u009f\u0001\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00062`\u0010'\u001a\\\u0012\u0013\u0012\u00110\r¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\r¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\r¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\r¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00010(H\u0003¢\u0006\u0002\u0010.¨\u0006/²\u0006\n\u00100\u001a\u000201X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u000203X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u000205X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u000205X\u008a\u008e\u0002²\u0006\f\u00107\u001a\u0004\u0018\u00010\u001fX\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000205X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u000205X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u000205X\u008a\u008e\u0002²\u0006\f\u0010;\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020=X\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"GooglePlanilhasScreen", "", "seriesList", "", "Lcom/example/model/Series;", "onBack", "Lkotlin/Function0;", "onOpenApiConfig", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CompactIntegrationStatusCard", "spreadsheetName", "", "spreadsheetIdMasked", "pendingCount", "", "lastSyncFormatted", "onEditConfig", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SummaryMiniCard", "title", "value", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "accentColor", "Landroidx/compose/ui/graphics/Color;", "SummaryMiniCard-uDo3WH8", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SyncResultFeedbackCard", "result", "Lcom/example/network/SyncOperationResult;", "onDismiss", "(Lcom/example/network/SyncOperationResult;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConfigSheetsDialog", "currentName", "currentSheetId", "currentWebhookUrl", "currentSyncSecret", "onSave", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "sheetId", "webhookUrl", "syncSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "app", "syncConfig", "Lcom/example/model/SyncConfig;", "apiConfig", "Lcom/example/model/ApiConfig;", "isSyncing", "", "isTestingPing", "lastSyncResult", "showConfigModal", "showOptionsMenu", "showAdvancedOptions", "toastMessage", "angle", "", "nameState", "sheetIdState", "webhookUrlState", "syncSecretState"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePlanilhasScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CompactIntegrationStatusCard$lambda$112(String str, String str2, int i, String str3, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        CompactIntegrationStatusCard(str, str2, i, str3, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigSheetsDialog$lambda$151(String str, String str2, String str3, String str4, Function0 function0, Function4 function4, int i, int i2, Composer composer, int i3) {
        ConfigSheetsDialog(str, str2, str3, str4, function0, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$101(List list, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GooglePlanilhasScreen(list, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SummaryMiniCard_uDo3WH8$lambda$116(String str, String str2, ImageVector imageVector, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m7054SummaryMiniCarduDo3WH8(str, str2, imageVector, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SyncResultFeedbackCard$lambda$123(SyncOperationResult syncOperationResult, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SyncResultFeedbackCard(syncOperationResult, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0c51  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0c5d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0c96  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0dc5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0f40  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0f4c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0f85  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0fee  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x1097  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x1147  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x124c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x1258  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x1291  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x146e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x147a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x14b3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x15a0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x15ac  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x15e5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x166f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x170c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1718  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x1751  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1835  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x1841  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x1878  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x19ac  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x19c9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1af1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x1ba9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x1bcd  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x1c08  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x1c91  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x1c15  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x1bda  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1bac  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x1b96  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x19cc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x19b7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x188e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x1847  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x1767 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x171e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x1681  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x15fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x15b2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x14c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x1480  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x12a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x125e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x10a5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0ff9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0f9b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0f52  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0cac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x072d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GooglePlanilhasScreen(java.util.List<com.example.model.Series> r237, final kotlin.jvm.functions.Function0<kotlin.Unit> r238, kotlin.jvm.functions.Function0<kotlin.Unit> r239, androidx.compose.ui.Modifier r240, androidx.compose.runtime.Composer r241, final int r242, final int r243) {
        /*
            Method dump skipped, instructions count: 7347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.GooglePlanilhasScreenKt.GooglePlanilhasScreen(java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$3$lambda$2(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final SyncConfig GooglePlanilhasScreen$lambda$8(MutableState<SyncConfig> mutableState) {
        return mutableState.getValue();
    }

    private static final ApiConfig GooglePlanilhasScreen$lambda$11(MutableState<ApiConfig> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean GooglePlanilhasScreen$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GooglePlanilhasScreen$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GooglePlanilhasScreen$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GooglePlanilhasScreen$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final SyncOperationResult GooglePlanilhasScreen$lambda$20(MutableState<SyncOperationResult> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean GooglePlanilhasScreen$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GooglePlanilhasScreen$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GooglePlanilhasScreen$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GooglePlanilhasScreen$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GooglePlanilhasScreen$lambda$29(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GooglePlanilhasScreen$lambda$30(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GooglePlanilhasScreen$lambda$32(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GooglePlanilhasScreen$showToast(CoroutineScope coroutineScope, MutableState<String> mutableState, String msg) {
        BuildersKt.launch$default(coroutineScope, null, null, new GooglePlanilhasScreenKt$GooglePlanilhasScreen$showToast$1(msg, mutableState, null), 3, null);
    }

    private static final void GooglePlanilhasScreen$triggerSync(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, List<Series> list, Context context, MutableState<ApiConfig> mutableState3, MutableState<SyncOperationResult> mutableState4, MutableState<SyncConfig> mutableState5, MutableState<String> mutableState6) {
        if (!GooglePlanilhasScreen$lambda$14(mutableState) && !GooglePlanilhasScreen$lambda$17(mutableState2)) {
            BuildersKt.launch$default(coroutineScope, null, null, new GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerSync$1(list, context, mutableState, mutableState3, mutableState4, mutableState5, coroutineScope, mutableState6, null), 3, null);
        }
    }

    private static final void GooglePlanilhasScreen$triggerTestPing(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Context context, MutableState<ApiConfig> mutableState3, MutableState<SyncOperationResult> mutableState4, MutableState<String> mutableState5) {
        if (!GooglePlanilhasScreen$lambda$14(mutableState) && !GooglePlanilhasScreen$lambda$17(mutableState2)) {
            BuildersKt.launch$default(coroutineScope, null, null, new GooglePlanilhasScreenKt$GooglePlanilhasScreen$triggerTestPing$1(context, mutableState2, mutableState3, mutableState4, coroutineScope, mutableState5, null), 3, null);
        }
    }

    private static final void GooglePlanilhasScreen$queryExistingData(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Context context, List<Series> list, MutableState<ApiConfig> mutableState3, MutableState<SyncConfig> mutableState4, MutableState<String> mutableState5) {
        if (!GooglePlanilhasScreen$lambda$14(mutableState) && !GooglePlanilhasScreen$lambda$17(mutableState2)) {
            BuildersKt.launch$default(coroutineScope, null, null, new GooglePlanilhasScreenKt$GooglePlanilhasScreen$queryExistingData$1(context, list, mutableState, mutableState3, mutableState4, coroutineScope, mutableState5, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$54$lambda$53$lambda$43$lambda$42(MutableState $showOptionsMenu$delegate) {
        GooglePlanilhasScreen$lambda$27($showOptionsMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$54$lambda$53$lambda$45$lambda$44(MutableState $showOptionsMenu$delegate) {
        GooglePlanilhasScreen$lambda$27($showOptionsMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$54$lambda$53$lambda$52(final CoroutineScope $coroutineScope, final Context $context, final List $seriesList, final MutableState $showOptionsMenu$delegate, final MutableState $showConfigModal$delegate, final MutableState $isSyncing$delegate, final MutableState $isTestingPing$delegate, final MutableState $apiConfig$delegate, final MutableState $lastSyncResult$delegate, final MutableState $toastMessage$delegate, final MutableState $syncConfig$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        String str;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C342@14521L142,332@13875L814,357@15374L137,347@14714L823,372@16211L139,362@15562L814:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(381108566, $changed, -1, "com.example.ui.sync.GooglePlanilhasScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GooglePlanilhasScreen.kt:332)");
            }
            Function2<Composer, Integer, Unit> lambda$1266271526$app = ComposableSingletons$GooglePlanilhasScreenKt.INSTANCE.getLambda$1266271526$app();
            ComposerKt.sourceInformationMarkerStart($composer, 1173133412, "CC(remember):GooglePlanilhasScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.sync.GooglePlanilhasScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$100$lambda$88$lambda$54$lambda$53$lambda$52$lambda$47$lambda$46(MutableState.this, $showConfigModal$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(lambda$1266271526$app, (Function0) obj, null, null, null, false, null, null, null, $composer, 54, 508);
            Function2<Composer, Integer, Unit> m7051getLambda$663204195$app = ComposableSingletons$GooglePlanilhasScreenKt.INSTANCE.m7051getLambda$663204195$app();
            ComposerKt.sourceInformationMarkerStart($composer, 1173160703, "CC(remember):GooglePlanilhasScreen.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance($coroutineScope) | $composer.changedInstance($context);
            Object rememberedValue2 = $composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                str = "CC(remember):GooglePlanilhasScreen.kt#9igjgp";
                obj2 = new Function0() { // from class: com.example.ui.sync.GooglePlanilhasScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$100$lambda$88$lambda$54$lambda$53$lambda$52$lambda$49$lambda$48(MutableState.this, $coroutineScope, $isSyncing$delegate, $isTestingPing$delegate, $context, $apiConfig$delegate, $lastSyncResult$delegate, $toastMessage$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                str = "CC(remember):GooglePlanilhasScreen.kt#9igjgp";
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(m7051getLambda$663204195$app, (Function0) obj2, null, null, null, false, null, null, null, $composer, 6, 508);
            Function2<Composer, Integer, Unit> lambda$774848670$app = ComposableSingletons$GooglePlanilhasScreenKt.INSTANCE.getLambda$774848670$app();
            ComposerKt.sourceInformationMarkerStart($composer, 1173187489, str);
            boolean changedInstance2 = $composer.changedInstance($coroutineScope) | $composer.changedInstance($context) | $composer.changedInstance($seriesList);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.example.ui.sync.GooglePlanilhasScreenKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$100$lambda$88$lambda$54$lambda$53$lambda$52$lambda$51$lambda$50(MutableState.this, $coroutineScope, $isSyncing$delegate, $isTestingPing$delegate, $context, $seriesList, $apiConfig$delegate, $syncConfig$delegate, $toastMessage$delegate);
                    }
                };
                $composer.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(lambda$774848670$app, (Function0) rememberedValue3, null, null, null, false, null, null, null, $composer, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$54$lambda$53$lambda$52$lambda$47$lambda$46(MutableState $showOptionsMenu$delegate, MutableState $showConfigModal$delegate) {
        GooglePlanilhasScreen$lambda$27($showOptionsMenu$delegate, false);
        GooglePlanilhasScreen$lambda$24($showConfigModal$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$54$lambda$53$lambda$52$lambda$49$lambda$48(MutableState $showOptionsMenu$delegate, CoroutineScope $coroutineScope, MutableState $isSyncing$delegate, MutableState $isTestingPing$delegate, Context $context, MutableState $apiConfig$delegate, MutableState $lastSyncResult$delegate, MutableState $toastMessage$delegate) {
        GooglePlanilhasScreen$lambda$27($showOptionsMenu$delegate, false);
        GooglePlanilhasScreen$triggerTestPing($coroutineScope, $isSyncing$delegate, $isTestingPing$delegate, $context, $apiConfig$delegate, $lastSyncResult$delegate, $toastMessage$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$54$lambda$53$lambda$52$lambda$51$lambda$50(MutableState $showOptionsMenu$delegate, CoroutineScope $coroutineScope, MutableState $isSyncing$delegate, MutableState $isTestingPing$delegate, Context $context, List $seriesList, MutableState $apiConfig$delegate, MutableState $syncConfig$delegate, MutableState $toastMessage$delegate) {
        GooglePlanilhasScreen$lambda$27($showOptionsMenu$delegate, false);
        GooglePlanilhasScreen$queryExistingData($coroutineScope, $isSyncing$delegate, $isTestingPing$delegate, $context, $seriesList, $apiConfig$delegate, $syncConfig$delegate, $toastMessage$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$57$lambda$56$lambda$55(MutableState $lastSyncResult$delegate) {
        $lastSyncResult$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$59$lambda$58(MutableState $showConfigModal$delegate) {
        GooglePlanilhasScreen$lambda$24($showConfigModal$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$61$lambda$60(CoroutineScope $coroutineScope, MutableState $isSyncing$delegate, MutableState $isTestingPing$delegate, List $seriesList, Context $context, MutableState $apiConfig$delegate, MutableState $lastSyncResult$delegate, MutableState $syncConfig$delegate, MutableState $toastMessage$delegate) {
        GooglePlanilhasScreen$triggerSync($coroutineScope, $isSyncing$delegate, $isTestingPing$delegate, $seriesList, $context, $apiConfig$delegate, $lastSyncResult$delegate, $syncConfig$delegate, $toastMessage$delegate);
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
    public static final kotlin.Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$65(androidx.compose.runtime.MutableState r109, androidx.compose.foundation.layout.RowScope r110, androidx.compose.runtime.Composer r111, int r112) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$65(androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final float GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$65$lambda$64$lambda$63$lambda$62(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$86$lambda$85$lambda$68$lambda$67(MutableState $showAdvancedOptions$delegate) {
        GooglePlanilhasScreen$lambda$30($showAdvancedOptions$delegate, !GooglePlanilhasScreen$lambda$29($showAdvancedOptions$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$86$lambda$85$lambda$84(final kotlinx.coroutines.CoroutineScope r167, final android.content.Context r168, final java.util.List r169, final androidx.compose.runtime.MutableState r170, final androidx.compose.runtime.MutableState r171, final androidx.compose.runtime.MutableState r172, final androidx.compose.runtime.MutableState r173, final androidx.compose.runtime.MutableState r174, final androidx.compose.runtime.MutableState r175, final androidx.compose.runtime.MutableState r176, androidx.compose.animation.AnimatedVisibilityScope r177, androidx.compose.runtime.Composer r178, int r179) {
        /*
            Method dump skipped, instructions count: 2588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$86$lambda$85$lambda$84(kotlinx.coroutines.CoroutineScope, android.content.Context, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$86$lambda$85$lambda$84$lambda$83$lambda$72$lambda$71(CoroutineScope $coroutineScope, MutableState $isSyncing$delegate, MutableState $isTestingPing$delegate, Context $context, MutableState $apiConfig$delegate, MutableState $lastSyncResult$delegate, MutableState $toastMessage$delegate) {
        GooglePlanilhasScreen$triggerTestPing($coroutineScope, $isSyncing$delegate, $isTestingPing$delegate, $context, $apiConfig$delegate, $lastSyncResult$delegate, $toastMessage$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$86$lambda$85$lambda$84$lambda$83$lambda$74(MutableState $isTestingPing$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C588@27031L584:GooglePlanilhasScreen.kt#9e9lx8");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1697480365, $changed, -1, "com.example.ui.sync.GooglePlanilhasScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GooglePlanilhasScreen.kt:588)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal m550spacedBy0680j_4 = Arrangement.INSTANCE.m550spacedBy0680j_4(Dp.m6622constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m550spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer m3652constructorimpl = Updater.m3652constructorimpl($composer);
            Updater.m3659setimpl(m3652constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3659setimpl(m3652constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3652constructorimpl.getInserting() || !Intrinsics.areEqual(m3652constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3652constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3652constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -979137838, "C592@27295L108,593@27444L133:GooglePlanilhasScreen.kt#9e9lx8");
            IconKt.m2150Iconww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), ColorKt.getAccentBlue(), $composer, 3504, 0);
            TextKt.m2693Text4IGK_g(GooglePlanilhasScreen$lambda$17($isTestingPing$delegate) ? "Testando..." : "Testar Conexão (1 Linha de Teste)", (Modifier) null, 0L, TextUnitKt.getSp(12.5d), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$86$lambda$85$lambda$84$lambda$83$lambda$76$lambda$75(MutableState $showConfigModal$delegate) {
        GooglePlanilhasScreen$lambda$24($showConfigModal$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$88$lambda$87$lambda$86$lambda$85$lambda$84$lambda$83$lambda$78$lambda$77(CoroutineScope $coroutineScope, MutableState $isSyncing$delegate, MutableState $isTestingPing$delegate, Context $context, List $seriesList, MutableState $apiConfig$delegate, MutableState $syncConfig$delegate, MutableState $toastMessage$delegate) {
        GooglePlanilhasScreen$queryExistingData($coroutineScope, $isSyncing$delegate, $isTestingPing$delegate, $context, $seriesList, $apiConfig$delegate, $syncConfig$delegate, $toastMessage$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$90$lambda$89(MutableState $showConfigModal$delegate) {
        GooglePlanilhasScreen$lambda$24($showConfigModal$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit GooglePlanilhasScreen$lambda$100$lambda$92$lambda$91(Context $context, MutableState $apiConfig$delegate, MutableState $syncConfig$delegate, MutableState $showConfigModal$delegate, CoroutineScope $coroutineScope, MutableState $toastMessage$delegate, String newName, String newSheetId, String newWebhookUrl, String newSyncSecret) {
        String str;
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(newSheetId, "newSheetId");
        Intrinsics.checkNotNullParameter(newWebhookUrl, "newWebhookUrl");
        Intrinsics.checkNotNullParameter(newSyncSecret, "newSyncSecret");
        String cleanId = ApiConfig.INSTANCE.extractSpreadsheetId(newSheetId);
        ApiConfig updatedApi = ApiConfig.copy$default(GooglePlanilhasScreen$lambda$11($apiConfig$delegate), cleanId, StringsKt.trim((CharSequence) newWebhookUrl).toString(), StringsKt.trim((CharSequence) newWebhookUrl).toString(), StringsKt.trim((CharSequence) newSyncSecret).toString(), null, false, false, 112, null);
        AppConfigStorage.INSTANCE.saveConfig($context, updatedApi);
        $apiConfig$delegate.setValue(updatedApi);
        SyncConfig GooglePlanilhasScreen$lambda$8 = GooglePlanilhasScreen$lambda$8($syncConfig$delegate);
        if (!StringsKt.isBlank(cleanId)) {
            if (cleanId.length() > 8) {
                str = StringsKt.take(cleanId, 4) + "..." + StringsKt.takeLast(cleanId, 4);
            } else {
                str = cleanId;
            }
        } else {
            str = "Não configurada";
        }
        SyncConfig updated = SyncConfig.copy$default(GooglePlanilhasScreen$lambda$8, null, !StringsKt.isBlank(cleanId) ? SheetsIntegrationState.CONNECTED : SheetsIntegrationState.NOT_CONFIGURED, 0, 0L, newName, str, false, null, 205, null);
        SyncStorage.INSTANCE.saveSyncConfig($context, updated);
        $syncConfig$delegate.setValue(updated);
        GooglePlanilhasScreen$lambda$24($showConfigModal$delegate, false);
        GooglePlanilhasScreen$showToast($coroutineScope, $toastMessage$delegate, "Configurações salvas e conectadas!");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int GooglePlanilhasScreen$lambda$100$lambda$94$lambda$93(int it) {
        return it / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int GooglePlanilhasScreen$lambda$100$lambda$96$lambda$95(int it) {
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
    public static final kotlin.Unit GooglePlanilhasScreen$lambda$100$lambda$99(androidx.compose.runtime.MutableState r103, androidx.compose.animation.AnimatedVisibilityScope r104, androidx.compose.runtime.Composer r105, int r106) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.GooglePlanilhasScreenKt.GooglePlanilhasScreen$lambda$100$lambda$99(androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0c98  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0ca4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0dad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0df2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x1080  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x108c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x10be  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x121c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x10d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x1090  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0e08 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0ce9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a39 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x090f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0551 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x041e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x07d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void CompactIntegrationStatusCard(final java.lang.String r199, final java.lang.String r200, final int r201, final java.lang.String r202, final kotlin.jvm.functions.Function0<kotlin.Unit> r203, androidx.compose.ui.Modifier r204, androidx.compose.runtime.Composer r205, final int r206, final int r207) {
        /*
            Method dump skipped, instructions count: 4670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.GooglePlanilhasScreenKt.CompactIntegrationStatusCard(java.lang.String, java.lang.String, int, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028c  */
    /* renamed from: SummaryMiniCard-uDo3WH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7054SummaryMiniCarduDo3WH8(final java.lang.String r123, final java.lang.String r124, final androidx.compose.ui.graphics.vector.ImageVector r125, final long r126, androidx.compose.ui.Modifier r128, androidx.compose.runtime.Composer r129, final int r130, final int r131) {
        /*
            Method dump skipped, instructions count: 1487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.GooglePlanilhasScreenKt.m7054SummaryMiniCarduDo3WH8(java.lang.String, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, long, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0554 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0430 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void SyncResultFeedbackCard(final com.example.network.SyncOperationResult r149, final kotlin.jvm.functions.Function0<kotlin.Unit> r150, androidx.compose.ui.Modifier r151, androidx.compose.runtime.Composer r152, final int r153, final int r154) {
        /*
            Method dump skipped, instructions count: 2069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.GooglePlanilhasScreenKt.SyncResultFeedbackCard(com.example.network.SyncOperationResult, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SyncResultFeedbackCard$lambda$122$lambda$121$lambda$120$lambda$119$lambda$118(Function0 $onDismiss) {
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    private static final void ConfigSheetsDialog(final String currentName, final String currentSheetId, final String currentWebhookUrl, String currentSyncSecret, final Function0<Unit> function0, final Function4<? super String, ? super String, ? super String, ? super String, Unit> function4, Composer $composer, final int $changed, final int i) {
        final String currentSyncSecret2;
        final Function0<Unit> function02;
        final Function4<? super String, ? super String, ? super String, ? super String, Unit> function42;
        String currentSyncSecret3;
        Object obj;
        MutableState nameState$delegate;
        Object obj2;
        MutableState sheetIdState$delegate;
        Object obj3;
        Object obj4;
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        Composer $composer2 = $composer.startRestartGroup(-1003946675);
        ComposerKt.sourceInformation($composer2, "C(ConfigSheetsDialog)P(!2,3)1074@49093L40,1075@49158L43,1076@49229L46,1077@49303L46,1079@49392L6588,1079@49355L6625:GooglePlanilhasScreen.kt#9e9lx8");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(currentName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(currentSheetId) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(currentWebhookUrl) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            currentSyncSecret2 = currentSyncSecret;
        } else if (($changed & 3072) == 0) {
            currentSyncSecret2 = currentSyncSecret;
            $dirty |= $composer2.changed(currentSyncSecret2) ? 2048 : 1024;
        } else {
            currentSyncSecret2 = currentSyncSecret;
        }
        if (($changed & 24576) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        if ((196608 & $changed) == 0) {
            function42 = function4;
            $dirty |= $composer2.changedInstance(function42) ? 131072 : 65536;
        } else {
            function42 = function4;
        }
        int $dirty2 = $dirty;
        if ((74899 & $dirty2) == 74898 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                currentSyncSecret3 = "";
            } else {
                currentSyncSecret3 = currentSyncSecret2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1003946675, $dirty2, -1, "com.example.ui.sync.ConfigSheetsDialog (GooglePlanilhasScreen.kt:1073)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1574896821, "CC(remember):GooglePlanilhasScreen.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentName, null, 2, null);
                obj = mutableStateOf$default3;
                $composer2.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            MutableState nameState$delegate2 = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1574898904, "CC(remember):GooglePlanilhasScreen.kt#9igjgp");
            Object rememberedValue2 = $composer2.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                nameState$delegate = nameState$delegate2;
                mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentSheetId, null, 2, null);
                obj2 = mutableStateOf$default2;
                $composer2.updateRememberedValue(obj2);
            } else {
                nameState$delegate = nameState$delegate2;
                obj2 = rememberedValue2;
            }
            MutableState sheetIdState$delegate2 = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1574901179, "CC(remember):GooglePlanilhasScreen.kt#9igjgp");
            Object rememberedValue3 = $composer2.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                sheetIdState$delegate = sheetIdState$delegate2;
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentWebhookUrl, null, 2, null);
                obj3 = mutableStateOf$default;
                $composer2.updateRememberedValue(obj3);
            } else {
                sheetIdState$delegate = sheetIdState$delegate2;
                obj3 = rememberedValue3;
            }
            final MutableState webhookUrlState$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1574903547, "CC(remember):GooglePlanilhasScreen.kt#9igjgp");
            Object rememberedValue4 = $composer2.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentSyncSecret3, null, 2, null);
                $composer2.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState syncSecretState$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final MutableState nameState$delegate3 = nameState$delegate;
            final MutableState sheetIdState$delegate3 = sheetIdState$delegate;
            AndroidDialog_androidKt.Dialog(function0, null, ComposableLambdaKt.rememberComposableLambda(774991972, true, new Function2() { // from class: com.example.ui.sync.GooglePlanilhasScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return GooglePlanilhasScreenKt.ConfigSheetsDialog$lambda$150(MutableState.this, sheetIdState$delegate3, webhookUrlState$delegate, syncSecretState$delegate, function02, function42, currentName, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 12) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            currentSyncSecret2 = currentSyncSecret3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.sync.GooglePlanilhasScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return GooglePlanilhasScreenKt.ConfigSheetsDialog$lambda$151(currentName, currentSheetId, currentWebhookUrl, currentSyncSecret2, function0, function4, $changed, i, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    private static final String ConfigSheetsDialog$lambda$125(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ConfigSheetsDialog$lambda$128(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ConfigSheetsDialog$lambda$131(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ConfigSheetsDialog$lambda$134(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x09f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ConfigSheetsDialog$lambda$150(final androidx.compose.runtime.MutableState r152, final androidx.compose.runtime.MutableState r153, final androidx.compose.runtime.MutableState r154, final androidx.compose.runtime.MutableState r155, kotlin.jvm.functions.Function0 r156, final kotlin.jvm.functions.Function4 r157, final java.lang.String r158, androidx.compose.runtime.Composer r159, int r160) {
        /*
            Method dump skipped, instructions count: 2774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.sync.GooglePlanilhasScreenKt.ConfigSheetsDialog$lambda$150(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function4, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigSheetsDialog$lambda$150$lambda$149$lambda$148$lambda$137$lambda$136(MutableState $nameState$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $nameState$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigSheetsDialog$lambda$150$lambda$149$lambda$148$lambda$139$lambda$138(MutableState $sheetIdState$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $sheetIdState$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigSheetsDialog$lambda$150$lambda$149$lambda$148$lambda$141$lambda$140(MutableState $webhookUrlState$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $webhookUrlState$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigSheetsDialog$lambda$150$lambda$149$lambda$148$lambda$143$lambda$142(MutableState $syncSecretState$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $syncSecretState$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigSheetsDialog$lambda$150$lambda$149$lambda$148$lambda$147$lambda$146$lambda$145(Function4 $onSave, MutableState $nameState$delegate, String $currentName, MutableState $sheetIdState$delegate, MutableState $webhookUrlState$delegate, MutableState $syncSecretState$delegate) {
        String ConfigSheetsDialog$lambda$125 = ConfigSheetsDialog$lambda$125($nameState$delegate);
        if (StringsKt.isBlank(ConfigSheetsDialog$lambda$125)) {
            ConfigSheetsDialog$lambda$125 = $currentName;
        }
        $onSave.invoke(ConfigSheetsDialog$lambda$125, StringsKt.trim((CharSequence) ConfigSheetsDialog$lambda$128($sheetIdState$delegate)).toString(), StringsKt.trim((CharSequence) ConfigSheetsDialog$lambda$131($webhookUrlState$delegate)).toString(), StringsKt.trim((CharSequence) ConfigSheetsDialog$lambda$134($syncSecretState$delegate)).toString());
        return Unit.INSTANCE;
    }
}

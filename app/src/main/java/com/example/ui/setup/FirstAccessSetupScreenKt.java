package com.example.ui.setup;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.CodeKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.data.AppConfigStorage;
import com.example.model.ApiConfig;
import com.example.network.DiagnosticReport;
import com.example.network.GoogleSheetsSyncService;
import com.example.ui.theme.AppColors;
import com.example.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FirstAccessSetupScreen.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\t\u001aJ\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aI\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u001f\u001a%\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010#¨\u0006$²\u0006\n\u0010%\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\f\u0010+\u001a\u0004\u0018\u00010,X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u0007X\u008a\u008e\u0002"}, d2 = {"FirstAccessSetupScreen", "", "onComplete", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "isReconfigurationMode", "", "onBack", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SectionCard", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconColor", "Landroidx/compose/ui/graphics/Color;", "title", "", "subtitle", "colors", "Lcom/example/ui/theme/AppColors;", "content", "Landroidx/compose/runtime/Composable;", "SectionCard-8V94_ZQ", "(Landroidx/compose/ui/graphics/vector/ImageVector;JLjava/lang/String;Ljava/lang/String;Lcom/example/ui/theme/AppColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ConfigInputField", "label", "value", "onValueChange", "Lkotlin/Function1;", "placeholder", "leadingIcon", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lcom/example/ui/theme/AppColors;Landroidx/compose/runtime/Composer;I)V", "StatusPill", "name", "isOk", "(Ljava/lang/String;ZLcom/example/ui/theme/AppColors;Landroidx/compose/runtime/Composer;I)V", "app", "sheetsIdInput", "sheetsWebHookUrl", "tmdbKey", "showAppsScriptCode", "cleanId", "isTesting", "diagnosticResult", "Lcom/example/network/DiagnosticReport;", "showSuccessSavedBanner"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FirstAccessSetupScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigInputField$lambda$85(String str, String str2, Function1 function1, String str3, ImageVector imageVector, AppColors appColors, int i, Composer composer, int i2) {
        ConfigInputField(str, str2, function1, str3, imageVector, appColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$75(Function0 function0, Modifier modifier, boolean z, Function0 function02, int i, int i2, Composer composer, int i3) {
        FirstAccessSetupScreen(function0, modifier, z, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SectionCard_8V94_ZQ$lambda$81(ImageVector imageVector, long j, String str, String str2, AppColors appColors, Function2 function2, int i, Composer composer, int i2) {
        m7043SectionCard8V94_ZQ(imageVector, j, str, str2, appColors, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusPill$lambda$87(String str, boolean z, AppColors appColors, int i, Composer composer, int i2) {
        StatusPill(str, z, appColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0dc9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0ea3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0eaf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0ee8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0fe6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0ff2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x102b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x1159  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x1165  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x119e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x139b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x15af  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x15bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x16cd  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x16d9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x1712  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x1783  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x1790  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x17f2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1907  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x1913  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x194c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x1a9b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x1aa7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1adc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x1b98  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x1c26  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x1c37  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x1d8e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x1c28  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x1bb2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x1af2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x1aad  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x1962 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x1919  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x17f8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1796  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x1788  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x1728 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x16df  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x15c1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x1a12  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x11b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x116b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x1041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0ff8  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0efe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0eb5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0ddf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d96  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0c31 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0903 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0791 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x08a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FirstAccessSetupScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> r201, androidx.compose.ui.Modifier r202, boolean r203, kotlin.jvm.functions.Function0<kotlin.Unit> r204, androidx.compose.runtime.Composer r205, final int r206, final int r207) {
        /*
            Method dump skipped, instructions count: 7595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.setup.FirstAccessSetupScreenKt.FirstAccessSetupScreen(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String FirstAccessSetupScreen$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FirstAccessSetupScreen$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FirstAccessSetupScreen$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FirstAccessSetupScreen$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FirstAccessSetupScreen$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FirstAccessSetupScreen$lambda$15(State<String> state) {
        return (String) state.getValue();
    }

    private static final boolean FirstAccessSetupScreen$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FirstAccessSetupScreen$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final DiagnosticReport FirstAccessSetupScreen$lambda$20(MutableState<DiagnosticReport> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FirstAccessSetupScreen$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FirstAccessSetupScreen$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final void FirstAccessSetupScreen$executeTest(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, State<String> state, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<DiagnosticReport> mutableState4) {
        BuildersKt.launch$default(coroutineScope, null, null, new FirstAccessSetupScreenKt$FirstAccessSetupScreen$executeTest$1(mutableState, state, mutableState2, mutableState3, mutableState4, null), 3, null);
    }

    private static final void FirstAccessSetupScreen$saveAndFinish(Context context, CoroutineScope coroutineScope, State<String> state, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, Function0<Unit> function0) {
        ApiConfig updatedConfig = new ApiConfig(FirstAccessSetupScreen$lambda$15(state), StringsKt.trim((CharSequence) FirstAccessSetupScreen$lambda$5(mutableState)).toString(), null, null, StringsKt.trim((CharSequence) FirstAccessSetupScreen$lambda$8(mutableState2)).toString(), true, false, 76, null);
        AppConfigStorage.INSTANCE.saveConfig(context, updatedConfig);
        FirstAccessSetupScreen$lambda$24(mutableState3, true);
        BuildersKt.launch$default(coroutineScope, null, null, new FirstAccessSetupScreenKt$FirstAccessSetupScreen$saveAndFinish$1(function0, null), 3, null);
    }

    private static final void FirstAccessSetupScreen$loadPresets(MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, CoroutineScope coroutineScope, MutableState<Boolean> mutableState4, State<String> state, MutableState<DiagnosticReport> mutableState5) {
        mutableState.setValue("1BxiMVs0XRA5nOfficialMinutagens8K9qZ");
        mutableState2.setValue("");
        mutableState3.setValue("e2832a818c1d5333f2c25eb42abce207");
        FirstAccessSetupScreen$executeTest(coroutineScope, mutableState4, state, mutableState2, mutableState3, mutableState5);
    }

    private static final void FirstAccessSetupScreen$copyAppsScriptToClipboard(Context context) {
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboard = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        ClipData clip = ClipData.newPlainText("Google Apps Script", GoogleSheetsSyncService.APPS_SCRIPT_TEMPLATE);
        if (clipboard != null) {
            clipboard.setPrimaryClip(clip);
        }
        Toast.makeText(context, "Código copiado para a área de transferência!", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$30$lambda$25(AppColors $colors, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C215@8615L264:FirstAccessSetupScreen.kt#766ah8");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1035509121, $changed, -1, "com.example.ui.setup.FirstAccessSetupScreen.<anonymous>.<anonymous>.<anonymous> (FirstAccessSetupScreen.kt:215)");
            }
            IconKt.m2150Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "Voltar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), $colors.m7093getTextPrimary0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$30$lambda$29$lambda$28(MutableState $sheetsIdInput$delegate, MutableState $sheetsWebHookUrl$delegate, MutableState $tmdbKey$delegate, CoroutineScope $coroutineScope, MutableState $isTesting$delegate, State $cleanId$delegate, MutableState $diagnosticResult$delegate) {
        FirstAccessSetupScreen$loadPresets($sheetsIdInput$delegate, $sheetsWebHookUrl$delegate, $tmdbKey$delegate, $coroutineScope, $isTesting$delegate, $cleanId$delegate, $diagnosticResult$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0ec5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0ed1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0ff3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x102a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x111a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x125c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1128  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x1040 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ff9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0ed7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x1236  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0c20 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b16 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0814 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0cdf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$55(com.example.ui.theme.AppColors r149, final androidx.compose.runtime.MutableState r150, androidx.compose.runtime.State r151, final androidx.compose.runtime.MutableState r152, final android.content.Context r153, final androidx.compose.runtime.MutableState r154, androidx.compose.runtime.Composer r155, int r156) {
        /*
            Method dump skipped, instructions count: 4706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.setup.FirstAccessSetupScreenKt.FirstAccessSetupScreen$lambda$74$lambda$73$lambda$55(com.example.ui.theme.AppColors, androidx.compose.runtime.MutableState, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$55$lambda$54$lambda$36$lambda$35(MutableState $sheetsIdInput$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $sheetsIdInput$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$55$lambda$54$lambda$39$lambda$38(MutableState $sheetsWebHookUrl$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $sheetsWebHookUrl$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$55$lambda$54$lambda$48$lambda$44$lambda$43(MutableState $showAppsScriptCode$delegate) {
        FirstAccessSetupScreen$lambda$12($showAppsScriptCode$delegate, !FirstAccessSetupScreen$lambda$11($showAppsScriptCode$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$55$lambda$54$lambda$48$lambda$45(MutableState $showAppsScriptCode$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C471@20825L275,477@21129L39,478@21197L310:FirstAccessSetupScreen.kt#766ah8");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-435831028, $changed, -1, "com.example.ui.setup.FirstAccessSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FirstAccessSetupScreen.kt:471)");
            }
            IconKt.m2150Iconww6aTOc(CodeKt.getCode(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), ColorKt.getAccentBlue(), $composer, 3504, 0);
            SpacerKt.Spacer(SizeKt.m720width3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(6)), $composer, 6);
            TextKt.m2693Text4IGK_g(FirstAccessSetupScreen$lambda$11($showAppsScriptCode$delegate) ? "Ocultar Código" : "Ver Código Script", (Modifier) null, ColorKt.getAccentBlue(), TextUnitKt.getSp(11.5d), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$55$lambda$54$lambda$48$lambda$47$lambda$46(Context $context) {
        FirstAccessSetupScreen$copyAppsScriptToClipboard($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$55$lambda$54$lambda$53$lambda$52$lambda$51$lambda$50$lambda$49(Context $context) {
        FirstAccessSetupScreen$copyAppsScriptToClipboard($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$59(com.example.ui.theme.AppColors r32, final androidx.compose.runtime.MutableState r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.setup.FirstAccessSetupScreenKt.FirstAccessSetupScreen$lambda$74$lambda$73$lambda$59(com.example.ui.theme.AppColors, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$59$lambda$58$lambda$57$lambda$56(MutableState $tmdbKey$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $tmdbKey$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$72$lambda$65$lambda$64(CoroutineScope $coroutineScope, MutableState $isTesting$delegate, State $cleanId$delegate, MutableState $sheetsWebHookUrl$delegate, MutableState $tmdbKey$delegate, MutableState $diagnosticResult$delegate) {
        FirstAccessSetupScreen$executeTest($coroutineScope, $isTesting$delegate, $cleanId$delegate, $sheetsWebHookUrl$delegate, $tmdbKey$delegate, $diagnosticResult$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$72$lambda$66(MutableState $isTesting$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C:FirstAccessSetupScreen.kt#766ah8");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-992491505, $changed, -1, "com.example.ui.setup.FirstAccessSetupScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FirstAccessSetupScreen.kt:643)");
            }
            if (FirstAccessSetupScreen$lambda$17($isTesting$delegate)) {
                $composer.startReplaceGroup(-759510623);
                ComposerKt.sourceInformation($composer, "644@29408L208,649@29641L39,650@29705L57");
                ProgressIndicatorKt.m2367CircularProgressIndicatorLxG7B9w(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), ColorKt.getAccentBlue(), Dp.m6622constructorimpl(2), 0L, 0, $composer, 438, 24);
                SpacerKt.Spacer(SizeKt.m720width3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(6)), $composer, 6);
                TextKt.m2693Text4IGK_g("Testando...", (Modifier) null, ColorKt.getAccentBlue(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-759103128);
                ComposerKt.sourceInformation($composer, "652@29816L260,658@30101L39,659@30165L94");
                IconKt.m2150Iconww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(16)), ColorKt.getAccentBlue(), $composer, 3504, 0);
                SpacerKt.Spacer(SizeKt.m720width3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(6)), $composer, 6);
                TextKt.m2693Text4IGK_g("Testar Conexão", (Modifier) null, ColorKt.getAccentBlue(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$72$lambda$68$lambda$67(Context $context, CoroutineScope $coroutineScope, State $cleanId$delegate, MutableState $sheetsWebHookUrl$delegate, MutableState $tmdbKey$delegate, MutableState $showSuccessSavedBanner$delegate, Function0 $onComplete) {
        FirstAccessSetupScreen$saveAndFinish($context, $coroutineScope, $cleanId$delegate, $sheetsWebHookUrl$delegate, $tmdbKey$delegate, $showSuccessSavedBanner$delegate, $onComplete);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FirstAccessSetupScreen$lambda$74$lambda$73$lambda$72$lambda$71(boolean r73, androidx.compose.foundation.layout.RowScope r74, androidx.compose.runtime.Composer r75, int r76) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.setup.FirstAccessSetupScreenKt.FirstAccessSetupScreen$lambda$74$lambda$73$lambda$72$lambda$71(boolean, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x056e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x067b  */
    /* renamed from: SectionCard-8V94_ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7043SectionCard8V94_ZQ(final androidx.compose.ui.graphics.vector.ImageVector r148, final long r149, final java.lang.String r151, final java.lang.String r152, final com.example.ui.theme.AppColors r153, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r154, androidx.compose.runtime.Composer r155, final int r156) {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.setup.FirstAccessSetupScreenKt.m7043SectionCard8V94_ZQ(androidx.compose.ui.graphics.vector.ImageVector, long, java.lang.String, java.lang.String, com.example.ui.theme.AppColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x038d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ConfigInputField(final java.lang.String r150, final java.lang.String r151, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r152, final java.lang.String r153, final androidx.compose.ui.graphics.vector.ImageVector r154, final com.example.ui.theme.AppColors r155, androidx.compose.runtime.Composer r156, final int r157) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.setup.FirstAccessSetupScreenKt.ConfigInputField(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, com.example.ui.theme.AppColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigInputField$lambda$84$lambda$82(String $placeholder, AppColors $colors, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C790@34750L61:FirstAccessSetupScreen.kt#766ah8");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1090432553, $changed, -1, "com.example.ui.setup.ConfigInputField.<anonymous>.<anonymous> (FirstAccessSetupScreen.kt:790)");
            }
            TextKt.m2693Text4IGK_g($placeholder, (Modifier) null, $colors.m7092getTextMuted0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3072, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ConfigInputField$lambda$84$lambda$83(AppColors $colors, ImageVector $leadingIcon, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C792@34859L218:FirstAccessSetupScreen.kt#766ah8");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121983384, $changed, -1, "com.example.ui.setup.ConfigInputField.<anonymous>.<anonymous> (FirstAccessSetupScreen.kt:792)");
            }
            IconKt.m2150Iconww6aTOc($leadingIcon, (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), $colors.m7094getTextSecondary0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void StatusPill(java.lang.String r58, final boolean r59, final com.example.ui.theme.AppColors r60, androidx.compose.runtime.Composer r61, final int r62) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.setup.FirstAccessSetupScreenKt.StatusPill(java.lang.String, boolean, com.example.ui.theme.AppColors, androidx.compose.runtime.Composer, int):void");
    }
}

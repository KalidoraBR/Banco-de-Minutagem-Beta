package com.example.ui.pendencias;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.data.PendencyStorage;
import com.example.model.PendencyFilter;
import com.example.model.PendencyItem;
import com.example.model.PendencyType;
import com.example.ui.theme.ColorKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PendenciasScreen.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aG\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002²\u0006\u0012\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002"}, d2 = {"PendenciasScreen", "", "seriesList", "", "Lcom/example/model/Series;", "onBack", "Lkotlin/Function0;", "onOpenPendency", "Lkotlin/Function1;", "Lcom/example/model/PendencyItem;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PendencyCard", "item", "onIgnore", "onOpen", "(Lcom/example/model/PendencyItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PendencyTypeBadge", LinkHeader.Parameters.Type, "Lcom/example/model/PendencyType;", "(Lcom/example/model/PendencyType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CompactEmptyPendenciesState", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "ignoredPendencyIds", "", "", "confirmationToastMessage", "confirmationToastActionLabel", "confirmationToastOnAction", "selectedFilter", "Lcom/example/model/PendencyFilter;", "showOptionsMenu", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PendenciasScreenKt {

    /* compiled from: PendenciasScreen.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PendencyFilter.values().length];
            try {
                iArr[PendencyFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[PendencyFilter.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[PendencyFilter.RECAP.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[PendencyFilter.ENDING.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[PendencyFilter.IDENTIFIERS.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PendencyType.values().length];
            try {
                iArr2[PendencyType.OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr2[PendencyType.RECAP.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr2[PendencyType.ENDING.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr2[PendencyType.IDENTIFIERS.ordinal()] = 4;
            } catch (NoSuchFieldError e9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit CompactEmptyPendenciesState$lambda$84(Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompactEmptyPendenciesState(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$72(List list, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PendenciasScreen(list, function0, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendencyCard$lambda$79(PendencyItem pendencyItem, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PendencyCard(pendencyItem, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendencyTypeBadge$lambda$81(PendencyType pendencyType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PendencyTypeBadge(pendencyType, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0e06  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0fd6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x116d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x11a6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x1226  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x147f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x148c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x1491  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x1484  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1561  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x17bf  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x17e6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x182c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x18b7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x1839  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x17f7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x17c2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x16ba  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x11bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x1173  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0fe4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0f3b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x1078  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x09a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PendenciasScreen(final java.util.List<com.example.model.Series> r192, final kotlin.jvm.functions.Function0<kotlin.Unit> r193, final kotlin.jvm.functions.Function1<? super com.example.model.PendencyItem, kotlin.Unit> r194, androidx.compose.ui.Modifier r195, androidx.compose.runtime.Composer r196, final int r197, final int r198) {
        /*
            Method dump skipped, instructions count: 6386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.pendencias.PendenciasScreenKt.PendenciasScreen(java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$1$lambda$0(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<String> PendenciasScreen$lambda$3(MutableState<Set<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PendenciasScreen$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String PendenciasScreen$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final Function0<Unit> PendenciasScreen$lambda$12(MutableState<Function0<Unit>> mutableState) {
        return mutableState.getValue();
    }

    static /* synthetic */ void PendenciasScreen$showDiscreetConfirmation$default(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, String str, String str2, Function0 function0, int i, Object obj) {
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            function0 = null;
        }
        PendenciasScreen$showDiscreetConfirmation(coroutineScope, mutableState, mutableState2, mutableState3, str, str2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PendenciasScreen$showDiscreetConfirmation(CoroutineScope coroutineScope, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Function0<Unit>> mutableState3, String msg, String actionLabel, Function0<Unit> function0) {
        BuildersKt.launch$default(coroutineScope, null, null, new PendenciasScreenKt$PendenciasScreen$showDiscreetConfirmation$1(msg, actionLabel, function0, mutableState, mutableState2, mutableState3, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final MutableState PendenciasScreen$lambda$26$lambda$25() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PendencyFilter.ALL, null, 2, null);
        return mutableStateOf$default;
    }

    private static final PendencyFilter PendenciasScreen$lambda$27(MutableState<PendencyFilter> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean PendenciasScreen$lambda$35(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PendenciasScreen$lambda$36(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$71$lambda$61$lambda$48$lambda$47$lambda$40$lambda$39(MutableState $showOptionsMenu$delegate) {
        PendenciasScreen$lambda$36($showOptionsMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$71$lambda$61$lambda$48$lambda$47$lambda$42$lambda$41(MutableState $showOptionsMenu$delegate) {
        PendenciasScreen$lambda$36($showOptionsMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$71$lambda$61$lambda$48$lambda$47$lambda$46(final Context $context, final CoroutineScope $coroutineScope, final MutableState $ignoredPendencyIds$delegate, final MutableState $showOptionsMenu$delegate, final MutableState $confirmationToastMessage$delegate, final MutableState $confirmationToastActionLabel$delegate, final MutableState $confirmationToastOnAction$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C290@12490L343,305@13318L541,289@12433L1543:PendenciasScreen.kt#6wqi8l");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(251613903, $changed, -1, "com.example.ui.pendencias.PendenciasScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PendenciasScreen.kt:289)");
            }
            Modifier testTag = TestTagKt.testTag(Modifier.INSTANCE, "action_restore_ignored");
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-173819233, true, new Function2() { // from class: com.example.ui.pendencias.PendenciasScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PendenciasScreenKt.PendenciasScreen$lambda$71$lambda$61$lambda$48$lambda$47$lambda$46$lambda$43(MutableState.this, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54);
            ComposerKt.sourceInformationMarkerStart($composer, 1282822028, "CC(remember):PendenciasScreen.kt#9igjgp");
            boolean changedInstance = $composer.changedInstance($context) | $composer.changedInstance($coroutineScope);
            Object rememberedValue = $composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.pendencias.PendenciasScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PendenciasScreenKt.PendenciasScreen$lambda$71$lambda$61$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44($context, $showOptionsMenu$delegate, $ignoredPendencyIds$delegate, $coroutineScope, $confirmationToastMessage$delegate, $confirmationToastActionLabel$delegate, $confirmationToastOnAction$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) obj, testTag, ComposableSingletons$PendenciasScreenKt.INSTANCE.m7025getLambda$574931422$app(), null, false, null, null, null, $composer, 3462, 496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$71$lambda$61$lambda$48$lambda$47$lambda$46$lambda$43(MutableState $ignoredPendencyIds$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C291@12528L271:PendenciasScreen.kt#6wqi8l");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-173819233, $changed, -1, "com.example.ui.pendencias.PendenciasScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PendenciasScreen.kt:291)");
            }
            TextKt.m2693Text4IGK_g("Restaurar pendências ignoradas (" + PendenciasScreen$lambda$3($ignoredPendencyIds$delegate).size() + ")", (Modifier) null, ColorKt.getTextWhite(), TextUnitKt.getSp(13.5d), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$71$lambda$61$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44(Context $context, MutableState $showOptionsMenu$delegate, MutableState $ignoredPendencyIds$delegate, CoroutineScope $coroutineScope, MutableState $confirmationToastMessage$delegate, MutableState $confirmationToastActionLabel$delegate, MutableState $confirmationToastOnAction$delegate) {
        PendenciasScreen$lambda$36($showOptionsMenu$delegate, false);
        int count = PendenciasScreen$lambda$3($ignoredPendencyIds$delegate).size();
        $ignoredPendencyIds$delegate.setValue(SetsKt.emptySet());
        PendencyStorage.INSTANCE.saveIgnoredIds($context, SetsKt.emptySet());
        PendenciasScreen$showDiscreetConfirmation$default($coroutineScope, $confirmationToastMessage$delegate, $confirmationToastActionLabel$delegate, $confirmationToastOnAction$delegate, count == 1 ? "1 pendência restaurada" : count + " pendências restauradas", null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$71$lambda$61$lambda$53$lambda$52$lambda$50$lambda$49(PendencyFilter $filter, MutableState $selectedFilter$delegate) {
        $selectedFilter$delegate.setValue($filter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$71$lambda$61$lambda$60$lambda$59(final List $filteredItems, final Context $context, final CoroutineScope $coroutineScope, final Function1 $onOpenPendency, final MutableState $ignoredPendencyIds$delegate, final MutableState $confirmationToastMessage$delegate, final MutableState $confirmationToastActionLabel$delegate, final MutableState $confirmationToastOnAction$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.example.ui.pendencias.PendenciasScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PendenciasScreenKt.PendenciasScreen$lambda$71$lambda$61$lambda$60$lambda$59$lambda$55((PendencyItem) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.ui.pendencias.PendenciasScreenKt$PendenciasScreen$lambda$71$lambda$61$lambda$60$lambda$59$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((PendencyItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(PendencyItem pendencyItem) {
                return null;
            }
        };
        LazyColumn.items($filteredItems.size(), new Function1<Integer, Object>() { // from class: com.example.ui.pendencias.PendenciasScreenKt$PendenciasScreen$lambda$71$lambda$61$lambda$60$lambda$59$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($filteredItems.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.pendencias.PendenciasScreenKt$PendenciasScreen$lambda$71$lambda$61$lambda$60$lambda$59$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($filteredItems.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.pendencias.PendenciasScreenKt$PendenciasScreen$lambda$71$lambda$61$lambda$60$lambda$59$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                final PendencyItem pendencyItem;
                Composer composer;
                String str;
                Object obj;
                ComposerKt.sourceInformation($composer, "C152@7074L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (($dirty & 147) == 146 && $composer.getSkipping()) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                int i = $dirty & 14;
                PendencyItem pendencyItem2 = (PendencyItem) $filteredItems.get(it);
                $composer.startReplaceGroup(-435728606);
                ComposerKt.sourceInformation($composer, "C*399@17662L700,411@18401L84,397@17568L943:PendenciasScreen.kt#6wqi8l");
                ComposerKt.sourceInformationMarkerStart($composer, -1538073650, "CC(remember):PendenciasScreen.kt#9igjgp");
                boolean changedInstance = ((((i & 112) ^ 48) > 32 && $composer.changed(pendencyItem2)) || (i & 48) == 32) | $composer.changedInstance($context) | $composer.changedInstance($coroutineScope);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    pendencyItem = pendencyItem2;
                    final Context context = $context;
                    final MutableState mutableState = $ignoredPendencyIds$delegate;
                    final CoroutineScope coroutineScope = $coroutineScope;
                    final MutableState mutableState2 = $confirmationToastMessage$delegate;
                    final MutableState mutableState3 = $confirmationToastActionLabel$delegate;
                    final MutableState mutableState4 = $confirmationToastOnAction$delegate;
                    composer = $composer;
                    str = "CC(remember):PendenciasScreen.kt#9igjgp";
                    rememberedValue = new Function0<Unit>() { // from class: com.example.ui.pendencias.PendenciasScreenKt$PendenciasScreen$2$1$4$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Set PendenciasScreen$lambda$3;
                            Set<String> PendenciasScreen$lambda$32;
                            MutableState<Set<String>> mutableState5 = mutableState;
                            PendenciasScreen$lambda$3 = PendenciasScreenKt.PendenciasScreen$lambda$3(mutableState);
                            mutableState5.setValue(SetsKt.plus((Set<? extends String>) PendenciasScreen$lambda$3, PendencyItem.this.getId()));
                            PendencyStorage pendencyStorage = PendencyStorage.INSTANCE;
                            Context context2 = context;
                            PendenciasScreen$lambda$32 = PendenciasScreenKt.PendenciasScreen$lambda$3(mutableState);
                            pendencyStorage.saveIgnoredIds(context2, PendenciasScreen$lambda$32);
                            CoroutineScope coroutineScope2 = coroutineScope;
                            MutableState<String> mutableState6 = mutableState2;
                            MutableState<String> mutableState7 = mutableState3;
                            MutableState<Function0<Unit>> mutableState8 = mutableState4;
                            final PendencyItem pendencyItem3 = PendencyItem.this;
                            final Context context3 = context;
                            final MutableState<Set<String>> mutableState9 = mutableState;
                            PendenciasScreenKt.PendenciasScreen$showDiscreetConfirmation(coroutineScope2, mutableState6, mutableState7, mutableState8, "Pendência ignorada", "Desfazer", new Function0<Unit>() { // from class: com.example.ui.pendencias.PendenciasScreenKt$PendenciasScreen$2$1$4$1$2$1$1.1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    Set PendenciasScreen$lambda$33;
                                    Set<String> PendenciasScreen$lambda$34;
                                    MutableState<Set<String>> mutableState10 = mutableState9;
                                    PendenciasScreen$lambda$33 = PendenciasScreenKt.PendenciasScreen$lambda$3(mutableState9);
                                    mutableState10.setValue(SetsKt.minus((Set<? extends String>) PendenciasScreen$lambda$33, PendencyItem.this.getId()));
                                    PendencyStorage pendencyStorage2 = PendencyStorage.INSTANCE;
                                    Context context4 = context3;
                                    PendenciasScreen$lambda$34 = PendenciasScreenKt.PendenciasScreen$lambda$3(mutableState9);
                                    pendencyStorage2.saveIgnoredIds(context4, PendenciasScreen$lambda$34);
                                }
                            });
                        }
                    };
                    $composer.updateRememberedValue(rememberedValue);
                } else {
                    composer = $composer;
                    str = "CC(remember):PendenciasScreen.kt#9igjgp";
                    pendencyItem = pendencyItem2;
                }
                Function0 function0 = (Function0) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                Composer composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -1538050618, str);
                boolean changed = composer2.changed($onOpenPendency) | ((((i & 112) ^ 48) > 32 && composer2.changed(pendencyItem)) || (i & 48) == 32);
                Object rememberedValue2 = composer2.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = $onOpenPendency;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.pendencias.PendenciasScreenKt$PendenciasScreen$2$1$4$1$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function13.invoke(pendencyItem);
                        }
                    };
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                PendenciasScreenKt.PendencyCard(pendencyItem, function0, (Function0) obj, null, composer2, (i >> 3) & 14, 8);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object PendenciasScreen$lambda$71$lambda$61$lambda$60$lambda$59$lambda$55(PendencyItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int PendenciasScreen$lambda$71$lambda$63$lambda$62(int it) {
        return it / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int PendenciasScreen$lambda$71$lambda$65$lambda$64(int it) {
        return it / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit PendenciasScreen$lambda$71$lambda$70(final androidx.compose.runtime.MutableState r103, final androidx.compose.runtime.MutableState r104, final androidx.compose.runtime.MutableState r105, androidx.compose.animation.AnimatedVisibilityScope r106, androidx.compose.runtime.Composer r107, int r108) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.pendencias.PendenciasScreenKt.PendenciasScreen$lambda$71$lambda$70(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit PendenciasScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66(MutableState $confirmationToastOnAction$delegate, MutableState $confirmationToastMessage$delegate, MutableState $confirmationToastActionLabel$delegate) {
        Function0<Unit> PendenciasScreen$lambda$12 = PendenciasScreen$lambda$12($confirmationToastOnAction$delegate);
        if (PendenciasScreen$lambda$12 != null) {
            PendenciasScreen$lambda$12.invoke();
        }
        $confirmationToastMessage$delegate.setValue(null);
        $confirmationToastActionLabel$delegate.setValue(null);
        $confirmationToastOnAction$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x07dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0406 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x09e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PendencyCard(final com.example.model.PendencyItem r147, final kotlin.jvm.functions.Function0<kotlin.Unit> r148, final kotlin.jvm.functions.Function0<kotlin.Unit> r149, androidx.compose.ui.Modifier r150, androidx.compose.runtime.Composer r151, final int r152, final int r153) {
        /*
            Method dump skipped, instructions count: 3076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.pendencias.PendenciasScreenKt.PendencyCard(com.example.model.PendencyItem, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x03c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void PendencyTypeBadge(final com.example.model.PendencyType r65, androidx.compose.ui.Modifier r66, androidx.compose.runtime.Composer r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.pendencias.PendenciasScreenKt.PendencyTypeBadge(com.example.model.PendencyType, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void CompactEmptyPendenciesState(androidx.compose.ui.Modifier r93, androidx.compose.runtime.Composer r94, final int r95, final int r96) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.pendencias.PendenciasScreenKt.CompactEmptyPendenciesState(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

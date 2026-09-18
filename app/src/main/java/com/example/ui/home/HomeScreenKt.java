package com.example.ui.home;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.example.ui.components.FilterChipRowKt;
import com.example.ui.components.SearchBarKt;
import com.example.ui.components.SeriesFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u001ak\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"HomeScreen", "", "onMenuClick", "Lkotlin/Function0;", "onAddSeriesClick", "onOpenSeries", "Lkotlin/Function1;", "Lcom/example/model/Series;", "onContinueSeries", "modifier", "Landroidx/compose/ui/Modifier;", "seriesList", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "app", "searchQuery", "", "selectedFilter", "Lcom/example/ui/components/SeriesFilter;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HomeScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$21(Function0 function0, Function0 function02, Function1 function1, Function1 function12, Modifier modifier, List list, int i, int i2, Composer composer, int i3) {
        HomeScreen(function0, function02, function1, function12, modifier, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HomeScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> r73, final kotlin.jvm.functions.Function0<kotlin.Unit> r74, final kotlin.jvm.functions.Function1<? super com.example.model.Series, kotlin.Unit> r75, final kotlin.jvm.functions.Function1<? super com.example.model.Series, kotlin.Unit> r76, androidx.compose.ui.Modifier r77, java.util.List<com.example.model.Series> r78, androidx.compose.runtime.Composer r79, final int r80, final int r81) {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.home.HomeScreenKt.HomeScreen(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String HomeScreen$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final SeriesFilter HomeScreen$lambda$4(MutableState<SeriesFilter> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17(final MutableState $searchQuery$delegate, final MutableState $selectedFilter$delegate, final List $seriesList, final Function0 $onAddSeriesClick, final Function1 $onOpenSeries, final Function1 $onContinueSeries, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(665925259, true, new Function3() { // from class: com.example.ui.home.HomeScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$9(MutableState.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1941278668, true, new Function3() { // from class: com.example.ui.home.HomeScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$12(MutableState.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2010804819, true, new Function3() { // from class: com.example.ui.home.HomeScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16($seriesList, $onAddSeriesClick, $onOpenSeries, $onContinueSeries, $searchQuery$delegate, $selectedFilter$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$9(final MutableState $searchQuery$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C70@2629L251:HomeScreen.kt#9egu7s");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(665925259, $changed, -1, "com.example.ui.home.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:70)");
            }
            Modifier m672paddingVpY3zN4$default = PaddingKt.m672paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6622constructorimpl(18), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m672paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3659setimpl(m3652constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3659setimpl(m3652constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3652constructorimpl.getInserting() || !Intrinsics.areEqual(m3652constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3652constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3652constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1814183160, "C73@2812L20,71@2708L150:HomeScreen.kt#9egu7s");
            String HomeScreen$lambda$1 = HomeScreen$lambda$1($searchQuery$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 495670489, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.example.ui.home.HomeScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt.HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$9$lambda$8$lambda$7$lambda$6(MutableState.this, (String) obj);
                    }
                };
                $composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SearchBarKt.SearchBar(HomeScreen$lambda$1, (Function1) rememberedValue, null, $composer, 48, 4);
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
    public static final Unit HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$9$lambda$8$lambda$7$lambda$6(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$12(final MutableState $selectedFilter$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Object obj;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C82@3094L23,80@2979L160:HomeScreen.kt#9egu7s");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1941278668, $changed, -1, "com.example.ui.home.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:80)");
            }
            SeriesFilter HomeScreen$lambda$4 = HomeScreen$lambda$4($selectedFilter$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1552989077, "CC(remember):HomeScreen.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: com.example.ui.home.HomeScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HomeScreenKt.HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$12$lambda$11$lambda$10(MutableState.this, (SeriesFilter) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            FilterChipRowKt.FilterChipRow(HomeScreen$lambda$4, (Function1) obj, null, $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$12$lambda$11$lambda$10(MutableState $selectedFilter$delegate, SeriesFilter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $selectedFilter$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16(List $seriesList, Function0 $onAddSeriesClick, Function1 $onOpenSeries, Function1 $onContinueSeries, final MutableState $searchQuery$delegate, final MutableState $selectedFilter$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C88@3244L933:HomeScreen.kt#9egu7s");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2010804819, $changed, -1, "com.example.ui.home.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:88)");
            }
            Modifier m672paddingVpY3zN4$default = PaddingKt.m672paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6622constructorimpl(18), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer, m672paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer m3652constructorimpl = Updater.m3652constructorimpl($composer);
            Updater.m3659setimpl(m3652constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3659setimpl(m3652constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3652constructorimpl.getInserting() || !Intrinsics.areEqual(m3652constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3652constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3652constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1975999318, "C:HomeScreen.kt#9egu7s");
            if ($seriesList.isEmpty()) {
                $composer.startReplaceGroup(1976004556);
                ComposerKt.sourceInformation($composer, "90@3379L113");
                EmptyStateViewKt.EmptyStateView($onAddSeriesClick, null, $composer, 0, 2);
                $composer.endReplaceGroup();
                composer = $composer;
            } else {
                $composer.startReplaceGroup(1976192478);
                ComposerKt.sourceInformation($composer, "100@3933L166,94@3554L575");
                String HomeScreen$lambda$1 = HomeScreen$lambda$1($searchQuery$delegate);
                SeriesFilter HomeScreen$lambda$4 = HomeScreen$lambda$4($selectedFilter$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, -351881229, "CC(remember):HomeScreen.kt#9igjgp");
                Object rememberedValue = $composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    composer = $composer;
                    rememberedValue = new Function0() { // from class: com.example.ui.home.HomeScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeScreenKt.HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13(MutableState.this, $selectedFilter$delegate);
                        }
                    };
                    $composer.updateRememberedValue(rememberedValue);
                } else {
                    composer = $composer;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                SeriesListSectionKt.SeriesListSection($seriesList, HomeScreen$lambda$1, HomeScreen$lambda$4, $onOpenSeries, $onContinueSeries, (Function0) rememberedValue, null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 64);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
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
    public static final Unit HomeScreen$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13(MutableState $searchQuery$delegate, MutableState $selectedFilter$delegate) {
        $searchQuery$delegate.setValue("");
        $selectedFilter$delegate.setValue(SeriesFilter.IN_PROGRESS);
        return Unit.INSTANCE;
    }
}

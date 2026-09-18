package com.example.ui.season;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import com.example.data.BatchHistoryRecord;
import com.example.data.BatchTimingHistoryStorage;
import com.example.model.Episode;
import com.example.model.EpisodeStatus;
import com.example.model.FixedTimingsConfig;
import com.example.model.Season;
import com.example.model.TimingSection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SeasonScreen.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002²\u0006\u0012\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007X\u008a\u008e\u0002"}, d2 = {"SeasonScreen", "", "season", "Lcom/example/model/Season;", "seriesTitle", "", "onBack", "Lkotlin/Function0;", "onUpdateSeason", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "fixedTimings", "Lcom/example/model/FixedTimingsConfig;", "initialEpisodeId", "(Lcom/example/model/Season;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/example/model/FixedTimingsConfig;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app", "episodesList", "", "Lcom/example/model/Episode;", "selectedFilter", "Lcom/example/ui/season/EpisodeFilter;", "showOptionsMenu", "", "editingEpisode", "isFillModeActive", "showLegendModal", "showBatchTimingModal", "confirmationToastMessage", "confirmationToastActionLabel", "confirmationToastOnAction"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SeasonScreenKt {

    /* compiled from: SeasonScreen.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EpisodeFilter.values().length];
            try {
                iArr[EpisodeFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EpisodeFilter.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EpisodeFilter.PARTIAL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EpisodeFilter.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$34(Season season, String str, Function0 function0, Function1 function1, Modifier modifier, FixedTimingsConfig fixedTimingsConfig, String str2, int i, int i2, Composer composer, int i3) {
        SeasonScreen(season, str, function0, function1, modifier, fixedTimingsConfig, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$92(Season season, String str, Function0 function0, Function1 function1, Modifier modifier, FixedTimingsConfig fixedTimingsConfig, String str2, int i, int i2, Composer composer, int i3) {
        SeasonScreen(season, str, function0, function1, modifier, fixedTimingsConfig, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:172:0x077d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c5  */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeasonScreen(final com.example.model.Season r48, java.lang.String r49, final kotlin.jvm.functions.Function0<kotlin.Unit> r50, final kotlin.jvm.functions.Function1<? super com.example.model.Season, kotlin.Unit> r51, androidx.compose.ui.Modifier r52, com.example.model.FixedTimingsConfig r53, java.lang.String r54, androidx.compose.runtime.Composer r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 2466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.SeasonScreenKt.SeasonScreen(com.example.model.Season, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, com.example.model.FixedTimingsConfig, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$1$lambda$0(Function0 $onBack) {
        $onBack.invoke();
        return Unit.INSTANCE;
    }

    private static final List<Episode> SeasonScreen$lambda$3(MutableState<List<Episode>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final MutableState SeasonScreen$lambda$6$lambda$5() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EpisodeFilter.ALL, null, 2, null);
        return mutableStateOf$default;
    }

    private static final EpisodeFilter SeasonScreen$lambda$7(MutableState<EpisodeFilter> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean SeasonScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SeasonScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Episode SeasonScreen$lambda$14(MutableState<Episode> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean SeasonScreen$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SeasonScreen$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SeasonScreen$lambda$20(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SeasonScreen$lambda$21(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SeasonScreen$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SeasonScreen$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$26$lambda$25(MutableState $editingEpisode$delegate, MutableState $isFillModeActive$delegate) {
        $editingEpisode$delegate.setValue(null);
        SeasonScreen$lambda$18($isFillModeActive$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$31$lambda$30(Season $season, Function1 $onUpdateSeason, MutableState $episodesList$delegate, MutableState $editingEpisode$delegate, Episode savedEpisode, boolean shouldOpenNext) {
        int i;
        Iterable iterable;
        Collection collection;
        Episode copy$default;
        Episode savedEpisode2 = savedEpisode;
        Intrinsics.checkNotNullParameter(savedEpisode2, "savedEpisode");
        Iterable<Episode> SeasonScreen$lambda$3 = SeasonScreen$lambda$3($episodesList$delegate);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(SeasonScreen$lambda$3, 10));
        for (Episode episode : SeasonScreen$lambda$3) {
            if (Intrinsics.areEqual(episode.getId(), savedEpisode2.getId())) {
                iterable = SeasonScreen$lambda$3;
                collection = arrayList;
                copy$default = Episode.copy$default(savedEpisode2, null, null, 0, null, null, null, null, null, true, null, 767, null);
            } else {
                iterable = SeasonScreen$lambda$3;
                collection = arrayList;
                copy$default = Episode.copy$default(episode, null, null, 0, null, null, null, null, null, false, null, 767, null);
            }
            collection.add(copy$default);
            savedEpisode2 = savedEpisode;
            arrayList = collection;
            SeasonScreen$lambda$3 = iterable;
        }
        $episodesList$delegate.setValue((List) arrayList);
        Iterable SeasonScreen$lambda$32 = SeasonScreen$lambda$3($episodesList$delegate);
        boolean z = false;
        if ((SeasonScreen$lambda$32 instanceof Collection) && ((Collection) SeasonScreen$lambda$32).isEmpty()) {
            i = 0;
        } else {
            int i2 = 0;
            Iterator it = SeasonScreen$lambda$32.iterator();
            while (it.hasNext()) {
                if ((((Episode) it.next()).getStatus() == EpisodeStatus.COMPLETED ? 1 : null) != null && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            i = i2;
        }
        Season updatedSeason = Season.copy$default($season, null, null, 0, 0, i, 0, false, 0L, null, SeasonScreen$lambda$3($episodesList$delegate), 495, null);
        $onUpdateSeason.invoke(updatedSeason);
        if (shouldOpenNext) {
            int currentIndex = 0;
            Iterator<Episode> it2 = SeasonScreen$lambda$3($episodesList$delegate).iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.areEqual(((Episode) it2.next()).getId(), savedEpisode.getId())) {
                        break;
                    }
                    currentIndex++;
                } else {
                    currentIndex = -1;
                    break;
                }
            }
            if (currentIndex >= 0 && currentIndex < SeasonScreen$lambda$3($episodesList$delegate).size() - 1) {
                z = true;
            }
            if (z) {
                $editingEpisode$delegate.setValue(SeasonScreen$lambda$3($episodesList$delegate).get(currentIndex + 1));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$33$lambda$32(MutableState $editingEpisode$delegate, Episode targetEpisode) {
        Intrinsics.checkNotNullParameter(targetEpisode, "targetEpisode");
        $editingEpisode$delegate.setValue(targetEpisode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SeasonScreen$lambda$36(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String SeasonScreen$lambda$39(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final Function0<Unit> SeasonScreen$lambda$42(MutableState<Function0<Unit>> mutableState) {
        return mutableState.getValue();
    }

    static /* synthetic */ void SeasonScreen$showDiscreetConfirmation$default(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, String str, String str2, Function0 function0, int i, Object obj) {
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            function0 = null;
        }
        SeasonScreen$showDiscreetConfirmation(coroutineScope, mutableState, mutableState2, mutableState3, str, str2, function0);
    }

    private static final void SeasonScreen$showDiscreetConfirmation(CoroutineScope coroutineScope, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Function0<Unit>> mutableState3, String msg, String actionLabel, Function0<Unit> function0) {
        BuildersKt.launch$default(coroutineScope, null, null, new SeasonScreenKt$SeasonScreen$showDiscreetConfirmation$1(msg, actionLabel, function0, mutableState, mutableState2, mutableState3, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SeasonScreen$lambda$71(kotlin.jvm.functions.Function0 r121, com.example.model.Season r122, final androidx.compose.runtime.MutableState r123, final androidx.compose.runtime.MutableState r124, final androidx.compose.runtime.MutableState r125, final androidx.compose.runtime.MutableState r126, final kotlinx.coroutines.CoroutineScope r127, final androidx.compose.runtime.MutableState r128, final androidx.compose.runtime.MutableState r129, final androidx.compose.runtime.MutableState r130, final androidx.compose.runtime.MutableState r131, final androidx.compose.runtime.MutableState r132, androidx.compose.runtime.Composer r133, int r134) {
        /*
            Method dump skipped, instructions count: 2120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.SeasonScreenKt.SeasonScreen$lambda$71(kotlin.jvm.functions.Function0, com.example.model.Season, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$52$lambda$51(MutableState $showBatchTimingModal$delegate) {
        SeasonScreen$lambda$24($showBatchTimingModal$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$54$lambda$53(MutableState $showOptionsMenu$delegate) {
        SeasonScreen$lambda$11($showOptionsMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$56$lambda$55(MutableState $showOptionsMenu$delegate) {
        SeasonScreen$lambda$11($showOptionsMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66(final MutableState $episodesList$delegate, final MutableState $editingEpisode$delegate, final CoroutineScope $coroutineScope, final MutableState $showOptionsMenu$delegate, final MutableState $isFillModeActive$delegate, final MutableState $showBatchTimingModal$delegate, final MutableState $confirmationToastMessage$delegate, final MutableState $confirmationToastActionLabel$delegate, final MutableState $confirmationToastOnAction$delegate, final MutableState $showLegendModal$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        String str2;
        Object obj4;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C346@15235L469,334@14503L1323,370@16663L171,358@15924L1036,390@17799L567,378@17059L1432,415@19335L166,403@18585L1035:SeasonScreen.kt#98f12s");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-664373665, $changed, -1, "com.example.ui.season.SeasonScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SeasonScreen.kt:334)");
            }
            Modifier testTag = TestTagKt.testTag(Modifier.INSTANCE, "menu_item_fill_mode");
            Function2<Composer, Integer, Unit> lambda$549291151$app = ComposableSingletons$SeasonScreenKt.INSTANCE.getLambda$549291151$app();
            ComposerKt.sourceInformationMarkerStart($composer, 1487061844, "CC(remember):SeasonScreen.kt#9igjgp");
            boolean changed = $composer.changed($episodesList$delegate) | $composer.changed($editingEpisode$delegate);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                str = "CC(remember):SeasonScreen.kt#9igjgp";
                obj = new Function0() { // from class: com.example.ui.season.SeasonScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SeasonScreenKt.SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66$lambda$58$lambda$57(MutableState.this, $episodesList$delegate, $isFillModeActive$delegate, $editingEpisode$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                str = "CC(remember):SeasonScreen.kt#9igjgp";
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            String str3 = str;
            AndroidMenu_androidKt.DropdownMenuItem(lambda$549291151$app, (Function0) obj, testTag, ComposableSingletons$SeasonScreenKt.INSTANCE.getLambda$368773548$app(), null, false, null, null, null, $composer, 3462, 496);
            Modifier testTag2 = TestTagKt.testTag(Modifier.INSTANCE, "menu_item_batch_timings");
            Function2<Composer, Integer, Unit> lambda$658603640$app = ComposableSingletons$SeasonScreenKt.INSTANCE.getLambda$658603640$app();
            ComposerKt.sourceInformationMarkerStart($composer, 1487107242, str3);
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.ui.season.SeasonScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SeasonScreenKt.SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66$lambda$60$lambda$59(MutableState.this, $showBatchTimingModal$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(lambda$658603640$app, (Function0) obj2, testTag2, ComposableSingletons$SeasonScreenKt.INSTANCE.m7034getLambda$1020121003$app(), null, false, null, null, null, $composer, 3510, 496);
            Modifier testTag3 = TestTagKt.testTag(Modifier.INSTANCE, "menu_item_next_pending");
            Function2<Composer, Integer, Unit> m7038getLambda$418497513$app = ComposableSingletons$SeasonScreenKt.INSTANCE.m7038getLambda$418497513$app();
            ComposerKt.sourceInformationMarkerStart($composer, 1487143990, str3);
            boolean changed2 = $composer.changed($episodesList$delegate) | $composer.changed($editingEpisode$delegate) | $composer.changedInstance($coroutineScope);
            Object rememberedValue3 = $composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                str2 = str3;
                obj3 = new Function0() { // from class: com.example.ui.season.SeasonScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SeasonScreenKt.SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66$lambda$63$lambda$62(MutableState.this, $episodesList$delegate, $editingEpisode$delegate, $coroutineScope, $confirmationToastMessage$delegate, $confirmationToastActionLabel$delegate, $confirmationToastOnAction$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                str2 = str3;
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(m7038getLambda$418497513$app, (Function0) obj3, testTag3, ComposableSingletons$SeasonScreenKt.INSTANCE.m7036getLambda$2097222156$app(), null, false, null, null, null, $composer, 3462, 496);
            Modifier testTag4 = TestTagKt.testTag(Modifier.INSTANCE, "menu_item_legend");
            Function2<Composer, Integer, Unit> m7035getLambda$1495598666$app = ComposableSingletons$SeasonScreenKt.INSTANCE.m7035getLambda$1495598666$app();
            ComposerKt.sourceInformationMarkerStart($composer, 1487192741, str2);
            Object rememberedValue4 = $composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = new Function0() { // from class: com.example.ui.season.SeasonScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SeasonScreenKt.SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64(MutableState.this, $showLegendModal$delegate);
                    }
                };
                $composer.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(m7035getLambda$1495598666$app, (Function0) obj4, testTag4, ComposableSingletons$SeasonScreenKt.INSTANCE.getLambda$1120643987$app(), null, false, null, null, null, $composer, 3510, 496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66$lambda$58$lambda$57(MutableState $showOptionsMenu$delegate, MutableState $episodesList$delegate, MutableState $isFillModeActive$delegate, MutableState $editingEpisode$delegate) {
        SeasonScreen$lambda$11($showOptionsMenu$delegate, false);
        Episode targetEpisode = FillModeHelper.INSTANCE.resolveFillModeEpisode(SeasonScreen$lambda$3($episodesList$delegate));
        if (targetEpisode != null) {
            SeasonScreen$lambda$18($isFillModeActive$delegate, true);
            $editingEpisode$delegate.setValue(targetEpisode);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66$lambda$60$lambda$59(MutableState $showOptionsMenu$delegate, MutableState $showBatchTimingModal$delegate) {
        SeasonScreen$lambda$11($showOptionsMenu$delegate, false);
        SeasonScreen$lambda$24($showBatchTimingModal$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66$lambda$63$lambda$62(MutableState $showOptionsMenu$delegate, MutableState $episodesList$delegate, MutableState $editingEpisode$delegate, CoroutineScope $coroutineScope, MutableState $confirmationToastMessage$delegate, MutableState $confirmationToastActionLabel$delegate, MutableState $confirmationToastOnAction$delegate) {
        Object obj;
        SeasonScreen$lambda$11($showOptionsMenu$delegate, false);
        Iterator it = SeasonScreen$lambda$3($episodesList$delegate).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Episode) obj).getStatus() == EpisodeStatus.PENDING) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Episode nextPending = (Episode) obj;
        if (nextPending == null) {
            SeasonScreen$showDiscreetConfirmation$default($coroutineScope, $confirmationToastMessage$delegate, $confirmationToastActionLabel$delegate, $confirmationToastOnAction$delegate, "Todos os episódios já foram iniciados!", null, null, 96, null);
        } else {
            $editingEpisode$delegate.setValue(nextPending);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$71$lambda$70$lambda$69$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64(MutableState $showOptionsMenu$delegate, MutableState $showLegendModal$delegate) {
        SeasonScreen$lambda$11($showOptionsMenu$delegate, false);
        SeasonScreen$lambda$21($showLegendModal$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0374 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SeasonScreen$lambda$91(androidx.compose.material3.SheetState r77, final com.example.model.Season r78, androidx.compose.material3.SheetState r79, final androidx.compose.runtime.MutableState r80, final android.content.Context r81, final kotlin.jvm.functions.Function1 r82, final kotlinx.coroutines.CoroutineScope r83, int r84, int r85, int r86, final androidx.compose.runtime.MutableState r87, java.util.List r88, androidx.compose.foundation.lazy.grid.LazyGridState r89, java.lang.Integer r90, final androidx.compose.runtime.MutableState r91, final androidx.compose.runtime.MutableState r92, androidx.compose.runtime.MutableState r93, androidx.compose.runtime.MutableState r94, final androidx.compose.runtime.MutableState r95, final androidx.compose.runtime.MutableState r96, final androidx.compose.runtime.MutableState r97, androidx.compose.foundation.layout.PaddingValues r98, androidx.compose.runtime.Composer r99, int r100) {
        /*
            Method dump skipped, instructions count: 1729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.SeasonScreenKt.SeasonScreen$lambda$91(androidx.compose.material3.SheetState, com.example.model.Season, androidx.compose.material3.SheetState, androidx.compose.runtime.MutableState, android.content.Context, kotlin.jvm.functions.Function1, kotlinx.coroutines.CoroutineScope, int, int, int, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridState, java.lang.Integer, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$91$lambda$80$lambda$76$lambda$73$lambda$72(MutableState $selectedFilter$delegate, EpisodeFilter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $selectedFilter$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$91$lambda$80$lambda$76$lambda$75$lambda$74(MutableState $isFillModeActive$delegate, MutableState $editingEpisode$delegate, Episode episode) {
        Intrinsics.checkNotNullParameter(episode, "episode");
        SeasonScreen$lambda$18($isFillModeActive$delegate, false);
        $editingEpisode$delegate.setValue(episode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$91$lambda$80$lambda$79$lambda$78$lambda$77(MutableState $confirmationToastOnAction$delegate, MutableState $confirmationToastMessage$delegate, MutableState $confirmationToastActionLabel$delegate) {
        Function0 action = SeasonScreen$lambda$42($confirmationToastOnAction$delegate);
        $confirmationToastMessage$delegate.setValue(null);
        $confirmationToastActionLabel$delegate.setValue(null);
        $confirmationToastOnAction$delegate.setValue(null);
        if (action != null) {
            action.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$91$lambda$82$lambda$81(MutableState $showLegendModal$delegate) {
        SeasonScreen$lambda$21($showLegendModal$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$91$lambda$84$lambda$83(MutableState $showBatchTimingModal$delegate) {
        SeasonScreen$lambda$24($showBatchTimingModal$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$91$lambda$90$lambda$89(final Context $context, final Season $season, final Function1 $onUpdateSeason, final MutableState $episodesList$delegate, final CoroutineScope $coroutineScope, final MutableState $confirmationToastMessage$delegate, final MutableState $confirmationToastActionLabel$delegate, final MutableState $confirmationToastOnAction$delegate, BatchApplyConfig config) {
        int i;
        List previousEpisodes;
        Episode episode;
        TimingSection timingSection;
        TimingSection timingSection2;
        TimingSection timingSection3;
        BatchApplyConfig config2 = config;
        Intrinsics.checkNotNullParameter(config2, "config");
        List previousEpisodes2 = CollectionsKt.toList(SeasonScreen$lambda$3($episodesList$delegate));
        BatchTimingHistoryStorage.INSTANCE.recordOperation($context, $season.getId(), config2.getSummaryText(), previousEpisodes2);
        Episode source = config2.getSourceEpisode();
        IntRange targetRange = new IntRange(config2.getStartEpisode(), config2.getEndEpisode());
        Iterable<Episode> SeasonScreen$lambda$3 = SeasonScreen$lambda$3($episodesList$delegate);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(SeasonScreen$lambda$3, 10));
        for (Episode episode2 : SeasonScreen$lambda$3) {
            int first = targetRange.getFirst();
            int last = targetRange.getLast();
            int episodeNumber = episode2.getEpisodeNumber();
            if (first <= episodeNumber && episodeNumber <= last) {
                TimingSection opening = episode2.getOpening();
                TimingSection recap = episode2.getRecap();
                TimingSection ending = episode2.getEnding();
                if (!config2.getCopyOpening()) {
                    previousEpisodes = previousEpisodes2;
                } else {
                    previousEpisodes = previousEpisodes2;
                    if (config2.getMode() == BatchApplyMode.OVERWRITE || !episode2.getOpening().isCompleted()) {
                        timingSection = TimingSection.copy$default(source.getOpening(), false, false, null, null, null, 31, null);
                        if (!config.getCopyRecap() && (config.getMode() == BatchApplyMode.OVERWRITE || !episode2.getRecap().isCompleted())) {
                            timingSection2 = TimingSection.copy$default(source.getRecap(), false, false, null, null, null, 31, null);
                        } else {
                            timingSection2 = recap;
                        }
                        if (!config.getCopyEnding() && (config.getMode() == BatchApplyMode.OVERWRITE || !episode2.getEnding().isCompleted())) {
                            timingSection3 = TimingSection.copy$default(source.getEnding(), false, false, null, null, null, 31, null);
                        } else {
                            timingSection3 = ending;
                        }
                        episode = Episode.copy$default(episode2, null, null, 0, null, null, timingSection, timingSection2, timingSection3, true, null, 543, null);
                    }
                }
                timingSection = opening;
                if (!config.getCopyRecap()) {
                }
                timingSection2 = recap;
                if (!config.getCopyEnding()) {
                }
                timingSection3 = ending;
                episode = Episode.copy$default(episode2, null, null, 0, null, null, timingSection, timingSection2, timingSection3, true, null, 543, null);
            } else {
                previousEpisodes = previousEpisodes2;
                episode = episode2;
            }
            arrayList.add(episode);
            config2 = config;
            previousEpisodes2 = previousEpisodes;
        }
        $episodesList$delegate.setValue((List) arrayList);
        Iterable SeasonScreen$lambda$32 = SeasonScreen$lambda$3($episodesList$delegate);
        if ((SeasonScreen$lambda$32 instanceof Collection) && ((Collection) SeasonScreen$lambda$32).isEmpty()) {
            i = 0;
        } else {
            int i2 = 0;
            Iterator it = SeasonScreen$lambda$32.iterator();
            while (it.hasNext()) {
                if ((((Episode) it.next()).getStatus() == EpisodeStatus.COMPLETED) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            i = i2;
        }
        Season updatedSeason = Season.copy$default($season, null, null, 0, 0, i, 0, false, 0L, null, SeasonScreen$lambda$3($episodesList$delegate), 495, null);
        $onUpdateSeason.invoke(updatedSeason);
        SeasonScreen$showDiscreetConfirmation($coroutineScope, $confirmationToastMessage$delegate, $confirmationToastActionLabel$delegate, $confirmationToastOnAction$delegate, "Minutagem aplicada em lote com sucesso", "Desfazer", new Function0() { // from class: com.example.ui.season.SeasonScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SeasonScreenKt.SeasonScreen$lambda$91$lambda$90$lambda$89$lambda$88($context, $season, $onUpdateSeason, $episodesList$delegate, $coroutineScope, $confirmationToastMessage$delegate, $confirmationToastActionLabel$delegate, $confirmationToastOnAction$delegate);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonScreen$lambda$91$lambda$90$lambda$89$lambda$88(Context $context, Season $season, Function1 $onUpdateSeason, MutableState $episodesList$delegate, CoroutineScope $coroutineScope, MutableState $confirmationToastMessage$delegate, MutableState $confirmationToastActionLabel$delegate, MutableState $confirmationToastOnAction$delegate) {
        int i;
        BatchHistoryRecord rollback = BatchTimingHistoryStorage.INSTANCE.popLastOperation($context, $season.getId());
        if (rollback != null) {
            $episodesList$delegate.setValue(rollback.getPreviousEpisodes());
            Iterable SeasonScreen$lambda$3 = SeasonScreen$lambda$3($episodesList$delegate);
            if ((SeasonScreen$lambda$3 instanceof Collection) && ((Collection) SeasonScreen$lambda$3).isEmpty()) {
                i = 0;
            } else {
                int i2 = 0;
                Iterator it = SeasonScreen$lambda$3.iterator();
                while (it.hasNext()) {
                    if ((((Episode) it.next()).getStatus() == EpisodeStatus.COMPLETED) && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
                i = i2;
            }
            Season revertedSeason = Season.copy$default($season, null, null, 0, 0, i, 0, false, 0L, null, SeasonScreen$lambda$3($episodesList$delegate), 495, null);
            $onUpdateSeason.invoke(revertedSeason);
            SeasonScreen$showDiscreetConfirmation$default($coroutineScope, $confirmationToastMessage$delegate, $confirmationToastActionLabel$delegate, $confirmationToastOnAction$delegate, "Operação desfeita com sucesso", null, null, 96, null);
        }
        return Unit.INSTANCE;
    }
}

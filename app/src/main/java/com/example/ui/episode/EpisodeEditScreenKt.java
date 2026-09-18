package com.example.ui.episode;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ContentCopyKt;
import androidx.compose.material.icons.filled.FastForwardKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.model.Episode;
import com.example.model.FixedTimingsConfig;
import com.example.model.Season;
import com.example.model.TimingSection;
import com.example.ui.theme.ColorKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EpisodeEditScreen.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¯\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r26\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a=\u0010\u001b\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010 \u001aG\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010'¨\u0006(²\u0006\n\u0010)\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\f\u0010+\u001a\u0004\u0018\u00010,X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\f\u00101\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002"}, d2 = {"EpisodeEditScreen", "", "episode", "Lcom/example/model/Episode;", "season", "Lcom/example/model/Season;", "seriesTitle", "", "episodesList", "", "isFillMode", "", "onBack", "Lkotlin/Function0;", "onSaveEpisode", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "updatedEpisode", "shouldOpenNext", "onNavigateEpisode", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "fixedTimings", "Lcom/example/model/FixedTimingsConfig;", "(Lcom/example/model/Episode;Lcom/example/model/Season;Ljava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/example/model/FixedTimingsConfig;Landroidx/compose/runtime/Composer;II)V", "EpisodeQuickActionsCard", "previousEpisode", "nextEpisode", "onCopyPrevious", "onSaveAndCopyNext", "(Lcom/example/model/Episode;Lcom/example/model/Episode;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EpisodeBottomControls", "canGoPrevious", "isLastEpisode", "onPrevious", "onSave", "onNext", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "currentEpisode", "hasUnsavedChanges", "editingSectionType", "Lcom/example/ui/episode/SectionType;", "showCopyPreviousModal", "showSaveAndCopyNextModal", "showOptionsMenu", "showLegendModal", "confirmationMessage"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EpisodeEditScreenKt {

    /* compiled from: EpisodeEditScreen.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SectionType.values().length];
            try {
                iArr[SectionType.OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[SectionType.RECAP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[SectionType.ENDING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeBottomControls$lambda$111(boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        EpisodeBottomControls(z, z2, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$88(Episode episode, Season season, String str, List list, boolean z, Function0 function0, Function2 function2, Function1 function1, Modifier modifier, FixedTimingsConfig fixedTimingsConfig, int i, int i2, Composer composer, int i3) {
        EpisodeEditScreen(episode, season, str, list, z, function0, function2, function1, modifier, fixedTimingsConfig, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeQuickActionsCard$lambda$99(Episode episode, Episode episode2, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        EpisodeQuickActionsCard(episode, episode2, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$1$lambda$0(Episode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0c45  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0e18  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0e6d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0eb7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0ee9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0f42  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0f49  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0f6e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0f81  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0fe9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0ffe  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x104e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x105f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x106f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x10ca  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x10f1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x112f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x11a3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x13ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x1485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x155e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x15ca  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x15a0  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x13b9  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x113c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x10fe  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x10cd  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x1061  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x1050  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0f83  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0f70  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0f4c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0f45  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0e79  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0e24  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x099a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x063d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EpisodeEditScreen(final com.example.model.Episode r168, final com.example.model.Season r169, java.lang.String r170, final java.util.List<com.example.model.Episode> r171, boolean r172, final kotlin.jvm.functions.Function0<kotlin.Unit> r173, final kotlin.jvm.functions.Function2<? super com.example.model.Episode, ? super java.lang.Boolean, kotlin.Unit> r174, kotlin.jvm.functions.Function1<? super com.example.model.Episode, kotlin.Unit> r175, androidx.compose.ui.Modifier r176, com.example.model.FixedTimingsConfig r177, androidx.compose.runtime.Composer r178, final int r179, final int r180) {
        /*
            Method dump skipped, instructions count: 5646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.EpisodeEditScreenKt.EpisodeEditScreen(com.example.model.Episode, com.example.model.Season, java.lang.String, java.util.List, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, com.example.model.FixedTimingsConfig, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Episode EpisodeEditScreen$lambda$3(MutableState<Episode> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean EpisodeEditScreen$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void EpisodeEditScreen$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final SectionType EpisodeEditScreen$lambda$9(MutableState<SectionType> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean EpisodeEditScreen$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void EpisodeEditScreen$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean EpisodeEditScreen$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void EpisodeEditScreen$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean EpisodeEditScreen$lambda$18(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void EpisodeEditScreen$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean EpisodeEditScreen$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void EpisodeEditScreen$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EpisodeEditScreen$lambda$24(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final void EpisodeEditScreen$showConfirmation(CoroutineScope coroutineScope, MutableState<String> mutableState, String message) {
        mutableState.setValue(message);
        BuildersKt.launch$default(coroutineScope, null, null, new EpisodeEditScreenKt$EpisodeEditScreen$showConfirmation$1(message, mutableState, null), 3, null);
    }

    static /* synthetic */ void EpisodeEditScreen$saveCurrentChanges$default(Function2 function2, MutableState mutableState, MutableState mutableState2, CoroutineScope coroutineScope, MutableState mutableState3, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        EpisodeEditScreen$saveCurrentChanges(function2, mutableState, mutableState2, coroutineScope, mutableState3, z);
    }

    private static final void EpisodeEditScreen$saveCurrentChanges(Function2<? super Episode, ? super Boolean, Unit> function2, MutableState<Episode> mutableState, MutableState<Boolean> mutableState2, CoroutineScope coroutineScope, MutableState<String> mutableState3, boolean andOpenNext) {
        Episode updated = Episode.copy$default(EpisodeEditScreen$lambda$3(mutableState), null, null, 0, null, null, null, null, null, true, null, 767, null);
        mutableState.setValue(updated);
        EpisodeEditScreen$lambda$7(mutableState2, false);
        function2.invoke(updated, Boolean.valueOf(andOpenNext));
        if (!andOpenNext) {
            EpisodeEditScreen$showConfirmation(coroutineScope, mutableState3, "Salvo e Sincronizado");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$28$lambda$27(MutableState $showOptionsMenu$delegate) {
        EpisodeEditScreen$lambda$19($showOptionsMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$30$lambda$29(MutableState $showOptionsMenu$delegate) {
        EpisodeEditScreen$lambda$19($showOptionsMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41(final Episode $nextEpisode, final Episode $previousEpisode, final MutableState $showOptionsMenu$delegate, final MutableState $showSaveAndCopyNextModal$delegate, final MutableState $showCopyPreviousModal$delegate, final MutableState $showLegendModal$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C219@9469L323,235@10343L248,226@9836L408,218@9416L1292,246@10856L324,262@11737L148,253@11224L410,245@10803L1194,286@12850L142,270@12077L1020:EpisodeEditScreen.kt#at6o8i");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(985831643, $changed, -1, "com.example.ui.episode.EpisodeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpisodeEditScreen.kt:218)");
            }
            boolean z = $nextEpisode != null;
            Modifier testTag = TestTagKt.testTag(Modifier.INSTANCE, "menu_action_save_and_copy_next");
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-970317653, true, new Function2() { // from class: com.example.ui.episode.EpisodeEditScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return EpisodeEditScreenKt.EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$31(Episode.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer, 54);
            ComposerKt.sourceInformationMarkerStart($composer, -1803530637, "CC(remember):EpisodeEditScreen.kt#9igjgp");
            boolean changed = $composer.changed($nextEpisode);
            Object rememberedValue = $composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.example.ui.episode.EpisodeEditScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EpisodeEditScreenKt.EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$33$lambda$32(Episode.this, $showOptionsMenu$delegate, $showSaveAndCopyNextModal$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) obj, testTag, ComposableLambdaKt.rememberComposableLambda(-1317440978, true, new Function2() { // from class: com.example.ui.episode.EpisodeEditScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return EpisodeEditScreenKt.EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$34(Episode.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer, 54), null, z, null, null, null, $composer, 3462, 464);
            boolean z2 = $previousEpisode != null;
            Modifier testTag2 = TestTagKt.testTag(Modifier.INSTANCE, "menu_action_copy_previous");
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1081838306, true, new Function2() { // from class: com.example.ui.episode.EpisodeEditScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return EpisodeEditScreenKt.EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$35(Episode.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer, 54);
            ComposerKt.sourceInformationMarkerStart($composer, -1803486129, "CC(remember):EpisodeEditScreen.kt#9igjgp");
            Object rememberedValue2 = $composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function0() { // from class: com.example.ui.episode.EpisodeEditScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EpisodeEditScreenKt.EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$37$lambda$36(MutableState.this, $showCopyPreviousModal$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda2, (Function0) obj2, testTag2, ComposableLambdaKt.rememberComposableLambda(-1791195227, true, new Function2() { // from class: com.example.ui.episode.EpisodeEditScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return EpisodeEditScreenKt.EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$38(Episode.this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer, 54), null, z2, null, null, null, $composer, 3510, 464);
            Modifier testTag3 = TestTagKt.testTag(Modifier.INSTANCE, "menu_action_legend");
            Function2<Composer, Integer, Unit> lambda$1402819107$app = ComposableSingletons$EpisodeEditScreenKt.INSTANCE.getLambda$1402819107$app();
            ComposerKt.sourceInformationMarkerStart($composer, -1803450519, "CC(remember):EpisodeEditScreen.kt#9igjgp");
            Object rememberedValue3 = $composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = new Function0() { // from class: com.example.ui.episode.EpisodeEditScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EpisodeEditScreenKt.EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$40$lambda$39(MutableState.this, $showLegendModal$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(lambda$1402819107$app, (Function0) obj3, testTag3, ComposableSingletons$EpisodeEditScreenKt.INSTANCE.m7016getLambda$1470214426$app(), null, false, null, null, null, $composer, 3510, 496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$31(Episode $nextEpisode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C220@9503L259:EpisodeEditScreen.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-970317653, $changed, -1, "com.example.ui.episode.EpisodeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpisodeEditScreen.kt:220)");
            }
            TextKt.m2693Text4IGK_g("Salvar e copiar para o próximo", (Modifier) null, $nextEpisode != null ? ColorKt.getTextWhite() : ColorKt.getTextMuted(), TextUnitKt.getSp(13.5d), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$34(Episode $nextEpisode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C227@9870L344:EpisodeEditScreen.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1317440978, $changed, -1, "com.example.ui.episode.EpisodeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpisodeEditScreen.kt:227)");
            }
            IconKt.m2150Iconww6aTOc(FastForwardKt.getFastForward(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), $nextEpisode != null ? ColorKt.getAccentPurple() : ColorKt.getTextMuted(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$33$lambda$32(Episode $nextEpisode, MutableState $showOptionsMenu$delegate, MutableState $showSaveAndCopyNextModal$delegate) {
        EpisodeEditScreen$lambda$19($showOptionsMenu$delegate, false);
        if ($nextEpisode != null) {
            EpisodeEditScreen$lambda$16($showSaveAndCopyNextModal$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$35(Episode $previousEpisode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C247@10890L260:EpisodeEditScreen.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1081838306, $changed, -1, "com.example.ui.episode.EpisodeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpisodeEditScreen.kt:247)");
            }
            TextKt.m2693Text4IGK_g("Copiar do episódio anterior", (Modifier) null, $previousEpisode != null ? ColorKt.getTextWhite() : ColorKt.getTextMuted(), TextUnitKt.getSp(13.5d), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$38(Episode $previousEpisode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C254@11258L346:EpisodeEditScreen.kt#at6o8i");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1791195227, $changed, -1, "com.example.ui.episode.EpisodeEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EpisodeEditScreen.kt:254)");
            }
            IconKt.m2150Iconww6aTOc(ContentCopyKt.getContentCopy(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), $previousEpisode != null ? ColorKt.getAccentBlue() : ColorKt.getTextMuted(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$37$lambda$36(MutableState $showOptionsMenu$delegate, MutableState $showCopyPreviousModal$delegate) {
        EpisodeEditScreen$lambda$19($showOptionsMenu$delegate, false);
        EpisodeEditScreen$lambda$13($showCopyPreviousModal$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$43$lambda$42$lambda$41$lambda$40$lambda$39(MutableState $showOptionsMenu$delegate, MutableState $showLegendModal$delegate) {
        EpisodeEditScreen$lambda$19($showOptionsMenu$delegate, false);
        EpisodeEditScreen$lambda$22($showLegendModal$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$54$lambda$45$lambda$44(MutableState $editingSectionType$delegate) {
        $editingSectionType$delegate.setValue(SectionType.OPENING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$54$lambda$47$lambda$46(MutableState $editingSectionType$delegate) {
        $editingSectionType$delegate.setValue(SectionType.RECAP);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$54$lambda$49$lambda$48(MutableState $editingSectionType$delegate) {
        $editingSectionType$delegate.setValue(SectionType.ENDING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$54$lambda$51$lambda$50(Episode $previousEpisode, MutableState $showCopyPreviousModal$delegate) {
        if ($previousEpisode != null) {
            EpisodeEditScreen$lambda$13($showCopyPreviousModal$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$54$lambda$53$lambda$52(Episode $nextEpisode, MutableState $showSaveAndCopyNextModal$delegate) {
        if ($nextEpisode != null) {
            EpisodeEditScreen$lambda$16($showSaveAndCopyNextModal$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$56$lambda$55(Episode $previousEpisode, Function1 $onNavigateEpisode, MutableState $hasUnsavedChanges$delegate, Function2 $onSaveEpisode, MutableState $currentEpisode$delegate, CoroutineScope $coroutineScope, MutableState $confirmationMessage$delegate) {
        if ($previousEpisode != null) {
            if (EpisodeEditScreen$lambda$6($hasUnsavedChanges$delegate)) {
                EpisodeEditScreen$saveCurrentChanges($onSaveEpisode, $currentEpisode$delegate, $hasUnsavedChanges$delegate, $coroutineScope, $confirmationMessage$delegate, false);
            }
            $onNavigateEpisode.invoke($previousEpisode);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$58$lambda$57(Function2 $onSaveEpisode, MutableState $currentEpisode$delegate, MutableState $hasUnsavedChanges$delegate, CoroutineScope $coroutineScope, MutableState $confirmationMessage$delegate) {
        EpisodeEditScreen$saveCurrentChanges($onSaveEpisode, $currentEpisode$delegate, $hasUnsavedChanges$delegate, $coroutineScope, $confirmationMessage$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$61$lambda$60$lambda$59(Episode $nextEpisode, Function0 $onBack, Function2 $onSaveEpisode, MutableState $currentEpisode$delegate, MutableState $hasUnsavedChanges$delegate, CoroutineScope $coroutineScope, MutableState $confirmationMessage$delegate) {
        if ($nextEpisode != null) {
            EpisodeEditScreen$saveCurrentChanges($onSaveEpisode, $currentEpisode$delegate, $hasUnsavedChanges$delegate, $coroutineScope, $confirmationMessage$delegate, true);
            EpisodeEditScreen$showConfirmation($coroutineScope, $confirmationMessage$delegate, "Salvo. Abrindo " + $nextEpisode.getFormattedNumber());
        } else {
            EpisodeEditScreen$saveCurrentChanges($onSaveEpisode, $currentEpisode$delegate, $hasUnsavedChanges$delegate, $coroutineScope, $confirmationMessage$delegate, false);
            $onBack.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int EpisodeEditScreen$lambda$87$lambda$63$lambda$62(int it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int EpisodeEditScreen$lambda$87$lambda$65$lambda$64(int it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit EpisodeEditScreen$lambda$87$lambda$68(androidx.compose.runtime.MutableState r105, androidx.compose.animation.AnimatedVisibilityScope r106, androidx.compose.runtime.Composer r107, int r108) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.EpisodeEditScreenKt.EpisodeEditScreen$lambda$87$lambda$68(androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$70$lambda$69(MutableState $editingSectionType$delegate) {
        $editingSectionType$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$72$lambda$71(SectionType $sectionType, Function2 $onSaveEpisode, MutableState $currentEpisode$delegate, MutableState $hasUnsavedChanges$delegate, MutableState $editingSectionType$delegate, TimingSection newTiming) {
        Episode updated;
        Intrinsics.checkNotNullParameter(newTiming, "newTiming");
        switch (WhenMappings.$EnumSwitchMapping$0[$sectionType.ordinal()]) {
            case 1:
                updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, newTiming, null, null, false, null, 991, null);
                break;
            case 2:
                updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, null, newTiming, null, false, null, 959, null);
                break;
            case 3:
                updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, null, null, newTiming, false, null, 895, null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        $currentEpisode$delegate.setValue(updated);
        EpisodeEditScreen$lambda$7($hasUnsavedChanges$delegate, true);
        $editingSectionType$delegate.setValue(null);
        $onSaveEpisode.invoke(updated, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$74$lambda$73(SectionType $sectionType, Function2 $onSaveEpisode, MutableState $currentEpisode$delegate, MutableState $hasUnsavedChanges$delegate, MutableState $editingSectionType$delegate) {
        Episode updated;
        TimingSection notPossuiTiming = new TimingSection(false, true, "", "", "");
        switch (WhenMappings.$EnumSwitchMapping$0[$sectionType.ordinal()]) {
            case 1:
                updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, notPossuiTiming, null, null, false, null, 991, null);
                break;
            case 2:
                updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, null, notPossuiTiming, null, false, null, 959, null);
                break;
            case 3:
                updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, null, null, notPossuiTiming, false, null, 895, null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        $currentEpisode$delegate.setValue(updated);
        EpisodeEditScreen$lambda$7($hasUnsavedChanges$delegate, true);
        $editingSectionType$delegate.setValue(null);
        $onSaveEpisode.invoke(updated, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$76$lambda$75(SectionType $sectionType, Function2 $onSaveEpisode, MutableState $currentEpisode$delegate, MutableState $hasUnsavedChanges$delegate, MutableState $editingSectionType$delegate) {
        Episode updated;
        TimingSection emptyTiming = new TimingSection(false, false, null, null, null, 31, null);
        switch (WhenMappings.$EnumSwitchMapping$0[$sectionType.ordinal()]) {
            case 1:
                updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, emptyTiming, null, null, false, null, 991, null);
                break;
            case 2:
                updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, null, emptyTiming, null, false, null, 959, null);
                break;
            case 3:
                updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, null, null, emptyTiming, false, null, 895, null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        $currentEpisode$delegate.setValue(updated);
        EpisodeEditScreen$lambda$7($hasUnsavedChanges$delegate, true);
        $editingSectionType$delegate.setValue(null);
        $onSaveEpisode.invoke(updated, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$78$lambda$77(MutableState $showCopyPreviousModal$delegate) {
        EpisodeEditScreen$lambda$13($showCopyPreviousModal$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$80$lambda$79(Episode $previousEpisode, Function2 $onSaveEpisode, MutableState $currentEpisode$delegate, MutableState $hasUnsavedChanges$delegate, MutableState $showCopyPreviousModal$delegate, CoroutineScope $coroutineScope, MutableState $confirmationMessage$delegate, boolean copyOpening, boolean copyRecap, boolean copyEnding) {
        Episode updated = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, copyOpening ? $previousEpisode.getOpening() : EpisodeEditScreen$lambda$3($currentEpisode$delegate).getOpening(), copyRecap ? $previousEpisode.getRecap() : EpisodeEditScreen$lambda$3($currentEpisode$delegate).getRecap(), copyEnding ? $previousEpisode.getEnding() : EpisodeEditScreen$lambda$3($currentEpisode$delegate).getEnding(), false, null, 799, null);
        $currentEpisode$delegate.setValue(updated);
        EpisodeEditScreen$lambda$7($hasUnsavedChanges$delegate, true);
        EpisodeEditScreen$lambda$13($showCopyPreviousModal$delegate, false);
        $onSaveEpisode.invoke(updated, false);
        EpisodeEditScreen$showConfirmation($coroutineScope, $confirmationMessage$delegate, "Copiado: Salvo e Sincronizado");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$82$lambda$81(MutableState $showSaveAndCopyNextModal$delegate) {
        EpisodeEditScreen$lambda$16($showSaveAndCopyNextModal$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$84$lambda$83(Function2 $onSaveEpisode, Episode $nextEpisode, Function1 $onNavigateEpisode, MutableState $currentEpisode$delegate, MutableState $hasUnsavedChanges$delegate, MutableState $showSaveAndCopyNextModal$delegate, CoroutineScope $coroutineScope, MutableState $confirmationMessage$delegate, boolean copyOpening, boolean copyRecap, boolean copyEnding) {
        Episode savedCurrent = Episode.copy$default(EpisodeEditScreen$lambda$3($currentEpisode$delegate), null, null, 0, null, null, null, null, null, true, null, 767, null);
        $currentEpisode$delegate.setValue(savedCurrent);
        EpisodeEditScreen$lambda$7($hasUnsavedChanges$delegate, false);
        $onSaveEpisode.invoke(savedCurrent, false);
        Episode updatedNext = Episode.copy$default($nextEpisode, null, null, 0, null, null, copyOpening ? savedCurrent.getOpening() : $nextEpisode.getOpening(), copyRecap ? savedCurrent.getRecap() : $nextEpisode.getRecap(), copyEnding ? savedCurrent.getEnding() : $nextEpisode.getEnding(), true, null, 543, null);
        EpisodeEditScreen$lambda$16($showSaveAndCopyNextModal$delegate, false);
        $onSaveEpisode.invoke(updatedNext, false);
        EpisodeEditScreen$showConfirmation($coroutineScope, $confirmationMessage$delegate, "Salvo e Sincronizado para " + $nextEpisode.getFormattedNumber());
        $onNavigateEpisode.invoke(updatedNext);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeEditScreen$lambda$87$lambda$86$lambda$85(MutableState $showLegendModal$delegate) {
        EpisodeEditScreen$lambda$22($showLegendModal$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0da7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0e57  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0eec  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0e5c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0ddc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0d5a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x095e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0635 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0401 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x072b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void EpisodeQuickActionsCard(final com.example.model.Episode r146, final com.example.model.Episode r147, final kotlin.jvm.functions.Function0<kotlin.Unit> r148, final kotlin.jvm.functions.Function0<kotlin.Unit> r149, androidx.compose.runtime.Composer r150, final int r151) {
        /*
            Method dump skipped, instructions count: 3848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.EpisodeEditScreenKt.EpisodeQuickActionsCard(com.example.model.Episode, com.example.model.Episode, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c24  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0e26  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0ec2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0e31  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0d5a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x08a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0600 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void EpisodeBottomControls(final boolean r165, final boolean r166, final kotlin.jvm.functions.Function0<kotlin.Unit> r167, final kotlin.jvm.functions.Function0<kotlin.Unit> r168, final kotlin.jvm.functions.Function0<kotlin.Unit> r169, androidx.compose.runtime.Composer r170, final int r171) {
        /*
            Method dump skipped, instructions count: 3808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.EpisodeEditScreenKt.EpisodeBottomControls(boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}

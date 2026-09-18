package com.example.ui.detail;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.core.app.FrameMetricsAggregator;
import com.example.data.ContinuityTarget;
import com.example.data.FixedTimingsStorage;
import com.example.data.SeriesContinuityManager;
import com.example.model.Episode;
import com.example.model.FixedTimingsConfig;
import com.example.model.Season;
import com.example.model.Series;
import com.example.model.SeriesStatus;
import com.example.ui.detail.modals.UpdatedIdentifiers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: SeriesDetailScreen.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002"}, d2 = {"SeriesDetailScreen", "", "series", "Lcom/example/model/Series;", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "initialOptionModal", "Lcom/example/ui/detail/DetailOptionType;", "initialSeasonId", "", "initialEpisodeId", "onUpdateSeries", "Lkotlin/Function1;", "onDeleteSeries", "(Lcom/example/model/Series;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/example/ui/detail/DetailOptionType;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app", "selectedOptionType", "showMoreOptionsModal", "", "selectedSeasonForModal", "Lcom/example/model/Season;", "activeSeasonForScreen", "targetEpisodeId", "confirmationToastMessage", "toastDismissJob", "Lkotlinx/coroutines/Job;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SeriesDetailScreenKt {

    /* compiled from: SeriesDetailScreen.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DetailOptionType.values().length];
            try {
                iArr[DetailOptionType.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[DetailOptionType.IDENTIFIERS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[DetailOptionType.FIXED_TIMINGS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$29(Series series, Function0 function0, Modifier modifier, DetailOptionType detailOptionType, String str, String str2, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        SeriesDetailScreen(series, function0, modifier, detailOptionType, str, str2, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$71(Series series, Function0 function0, Modifier modifier, DetailOptionType detailOptionType, String str, String str2, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        SeriesDetailScreen(series, function0, modifier, detailOptionType, str, str2, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$1$lambda$0(Series it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$3$lambda$2(Series it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0c36  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0c42  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0d20  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0f67  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x101c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x109e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x102e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x1005  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0df3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0ea0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0f4c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0c48  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b10 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0ac1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a81 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07d0  */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SeriesDetailScreen(final com.example.model.Series r107, final kotlin.jvm.functions.Function0<kotlin.Unit> r108, androidx.compose.ui.Modifier r109, com.example.ui.detail.DetailOptionType r110, java.lang.String r111, java.lang.String r112, kotlin.jvm.functions.Function1<? super com.example.model.Series, kotlin.Unit> r113, kotlin.jvm.functions.Function1<? super com.example.model.Series, kotlin.Unit> r114, androidx.compose.runtime.Composer r115, final int r116, final int r117) {
        /*
            Method dump skipped, instructions count: 4306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeriesDetailScreenKt.SeriesDetailScreen(com.example.model.Series, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, com.example.ui.detail.DetailOptionType, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final DetailOptionType SeriesDetailScreen$lambda$6(MutableState<DetailOptionType> mutableState) {
        return mutableState.getValue();
    }

    private static final void SeriesDetailScreen$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SeriesDetailScreen$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final Season SeriesDetailScreen$lambda$12(MutableState<Season> mutableState) {
        return mutableState.getValue();
    }

    private static final Season SeriesDetailScreen$lambda$16(MutableState<Season> mutableState) {
        return mutableState.getValue();
    }

    private static final String SeriesDetailScreen$lambda$19(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$22$lambda$21(MutableState $activeSeasonForScreen$delegate, MutableState $targetEpisodeId$delegate) {
        $activeSeasonForScreen$delegate.setValue(null);
        $targetEpisodeId$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$28$lambda$27(Series $series, Function1 $onUpdateSeries, MutableState $activeSeasonForScreen$delegate, Season updatedSeason) {
        SeriesStatus updatedStatus;
        Season copy$default;
        Intrinsics.checkNotNullParameter(updatedSeason, "updatedSeason");
        Iterable<Season> seasons = $series.getSeasons();
        int i = 10;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(seasons, 10));
        for (Season season : seasons) {
            if (Intrinsics.areEqual(season.getId(), updatedSeason.getId())) {
                copy$default = updatedSeason;
            } else {
                Iterable<Episode> episodes = season.getEpisodes();
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(episodes, i));
                for (Episode episode : episodes) {
                    arrayList2.add(episode.isLastEdited() ? Episode.copy$default(episode, null, null, 0, null, null, null, null, null, false, null, 767, null) : episode);
                }
                copy$default = Season.copy$default(season, null, null, 0, 0, 0, 0, false, 0L, null, (List) arrayList2, FrameMetricsAggregator.EVERY_DURATION, null);
            }
            arrayList.add(copy$default);
            i = 10;
        }
        List updatedSeasons = (List) arrayList;
        Iterator it = updatedSeasons.iterator();
        int totalEpisodes = 0;
        while (it.hasNext()) {
            totalEpisodes += ((Season) it.next()).getTotalEpisodes();
        }
        Iterator it2 = updatedSeasons.iterator();
        int completedEpisodes = 0;
        while (it2.hasNext()) {
            completedEpisodes += ((Season) it2.next()).getEffectiveCompletedEpisodes();
        }
        if (completedEpisodes < totalEpisodes || totalEpisodes <= 0) {
            updatedStatus = completedEpisodes > 0 ? SeriesStatus.IN_PROGRESS : $series.getStatus();
        } else {
            updatedStatus = SeriesStatus.COMPLETED_FULL;
        }
        Series tempSeries = Series.copy$default($series, null, null, 0, updatedStatus, totalEpisodes > 0 ? totalEpisodes : $series.getTotalEpisodes(), completedEpisodes, null, System.currentTimeMillis(), null, 0L, 0L, null, null, null, false, null, 0, 0, updatedSeasons, null, null, null, null, 8126279, null);
        ContinuityTarget continuity = SeriesContinuityManager.INSTANCE.getContinuityTarget(tempSeries);
        Series updatedSeries = Series.copy$default(tempSeries, null, null, 0, null, 0, 0, continuity != null ? continuity.getCode() : null, System.currentTimeMillis(), null, 0L, 0L, null, null, null, false, null, 0, 0, null, null, null, null, null, 8388415, null);
        $onUpdateSeries.invoke(updatedSeries);
        $activeSeasonForScreen$delegate.setValue(updatedSeason);
        return Unit.INSTANCE;
    }

    private static final String SeriesDetailScreen$lambda$31(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final Job SeriesDetailScreen$lambda$34(MutableState<Job> mutableState) {
        return mutableState.getValue();
    }

    private static final void SeriesDetailScreen$showDiscreetConfirmation(CoroutineScope coroutineScope, MutableState<Job> mutableState, MutableState<String> mutableState2, String message) {
        Job launch$default;
        Job SeriesDetailScreen$lambda$34 = SeriesDetailScreen$lambda$34(mutableState);
        if (SeriesDetailScreen$lambda$34 != null) {
            Job.DefaultImpls.cancel$default(SeriesDetailScreen$lambda$34, (CancellationException) null, 1, (Object) null);
        }
        mutableState2.setValue(message);
        launch$default = BuildersKt.launch$default(coroutineScope, null, null, new SeriesDetailScreenKt$SeriesDetailScreen$showDiscreetConfirmation$1(mutableState2, null), 3, null);
        mutableState.setValue(launch$default);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$49$lambda$38$lambda$37(MutableState $showMoreOptionsModal$delegate) {
        SeriesDetailScreen$lambda$10($showMoreOptionsModal$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$49$lambda$48$lambda$40$lambda$39(MutableState $selectedOptionType$delegate, DetailOptionType optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        $selectedOptionType$delegate.setValue(optionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$49$lambda$48$lambda$42$lambda$41(MutableState $activeSeasonForScreen$delegate, Season season) {
        Intrinsics.checkNotNullParameter(season, "season");
        $activeSeasonForScreen$delegate.setValue(season);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$49$lambda$48$lambda$44$lambda$43(CoroutineScope $coroutineScope, MutableState $toastDismissJob$delegate, MutableState $confirmationToastMessage$delegate) {
        SeriesDetailScreen$showDiscreetConfirmation($coroutineScope, $toastDismissJob$delegate, $confirmationToastMessage$delegate, "Temporadas sincronizadas com o TMDB");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$49$lambda$48$lambda$47$lambda$46(Series $series, Function1 $onUpdateSeries, CoroutineScope $coroutineScope, MutableState $toastDismissJob$delegate, MutableState $confirmationToastMessage$delegate) {
        Integer num;
        Iterator<T> it = $series.getSeasons().iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((Season) it.next()).getSeasonNumber());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((Season) it.next()).getSeasonNumber());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        Integer num2 = num;
        int nextNumber = (num2 != null ? num2.intValue() : 0) + 1;
        Season newSeason = new Season($series.getId() + "_s" + nextNumber, "Temporada " + nextNumber, nextNumber, 10, 0, 0, $series.getHasTmdb(), $series.getPrimaryColorHex(), null, null, 800, null);
        Series updated = Series.copy$default($series, null, null, 0, null, 0, 0, null, 0L, null, 0L, 0L, null, null, null, false, null, 0, 0, CollectionsKt.plus((Collection<? extends Season>) $series.getSeasons(), newSeason), null, null, null, null, 8126463, null);
        $onUpdateSeries.invoke(updated);
        SeriesDetailScreen$showDiscreetConfirmation($coroutineScope, $toastDismissJob$delegate, $confirmationToastMessage$delegate, "Temporada " + nextNumber + " adicionada com sucesso");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$52$lambda$51(MutableState $selectedOptionType$delegate) {
        $selectedOptionType$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$54$lambda$53(Series $series, Function1 $onUpdateSeries, MutableState $selectedOptionType$delegate, CoroutineScope $coroutineScope, MutableState $toastDismissJob$delegate, MutableState $confirmationToastMessage$delegate, SeriesStatus newStatus) {
        Intrinsics.checkNotNullParameter(newStatus, "newStatus");
        Series updated = Series.copy$default($series, null, null, 0, newStatus, 0, 0, null, 0L, null, 0L, 0L, null, null, null, false, null, 0, 0, null, null, null, null, null, 8388599, null);
        $onUpdateSeries.invoke(updated);
        $selectedOptionType$delegate.setValue(null);
        SeriesDetailScreen$showDiscreetConfirmation($coroutineScope, $toastDismissJob$delegate, $confirmationToastMessage$delegate, "Status atualizado com sucesso");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$56$lambda$55(MutableState $selectedOptionType$delegate) {
        $selectedOptionType$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$58$lambda$57(Series $series, Function1 $onUpdateSeries, MutableState $selectedOptionType$delegate, CoroutineScope $coroutineScope, MutableState $toastDismissJob$delegate, MutableState $confirmationToastMessage$delegate, UpdatedIdentifiers updatedIds) {
        Intrinsics.checkNotNullParameter(updatedIds, "updatedIds");
        String tmdbId = updatedIds.getTmdbId();
        String imdbId = updatedIds.getImdbId();
        String tvdbId = updatedIds.getTvdbId();
        Series updated = Series.copy$default($series, null, null, 0, null, 0, 0, null, 0L, null, 0L, 0L, null, null, null, updatedIds.getHasTmdb(), updatedIds.getSummary(), 0, 0, null, tmdbId, imdbId, tvdbId, null, 4669439, null);
        $onUpdateSeries.invoke(updated);
        $selectedOptionType$delegate.setValue(null);
        SeriesDetailScreen$showDiscreetConfirmation($coroutineScope, $toastDismissJob$delegate, $confirmationToastMessage$delegate, "Identificadores salvos com sucesso");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$60$lambda$59(MutableState $selectedOptionType$delegate) {
        $selectedOptionType$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$62$lambda$61(Context $context, Series $series, Function1 $onUpdateSeries, MutableState $selectedOptionType$delegate, CoroutineScope $coroutineScope, MutableState $toastDismissJob$delegate, MutableState $confirmationToastMessage$delegate, FixedTimingsConfig updatedTimings) {
        Intrinsics.checkNotNullParameter(updatedTimings, "updatedTimings");
        FixedTimingsStorage.INSTANCE.saveFixedTimings($context, $series.getId(), updatedTimings);
        Series updated = Series.copy$default($series, null, null, 0, null, 0, 0, null, 0L, null, 0L, 0L, null, null, null, false, null, updatedTimings.getActiveCount(), updatedTimings.getTotalCount(), null, null, null, null, updatedTimings, 3997695, null);
        $onUpdateSeries.invoke(updated);
        $selectedOptionType$delegate.setValue(null);
        SeriesDetailScreen$showDiscreetConfirmation($coroutineScope, $toastDismissJob$delegate, $confirmationToastMessage$delegate, "Minutagem fixa configurada com sucesso");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$64$lambda$63(MutableState $showMoreOptionsModal$delegate) {
        SeriesDetailScreen$lambda$10($showMoreOptionsModal$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$66$lambda$65(Function1 $onDeleteSeries, Series $series, MutableState $showMoreOptionsModal$delegate) {
        SeriesDetailScreen$lambda$10($showMoreOptionsModal$delegate, false);
        $onDeleteSeries.invoke($series);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesDetailScreen$lambda$70$lambda$69$lambda$68$lambda$67(MutableState $selectedSeasonForModal$delegate) {
        $selectedSeasonForModal$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}

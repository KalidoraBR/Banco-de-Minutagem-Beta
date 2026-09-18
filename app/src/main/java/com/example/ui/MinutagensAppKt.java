package com.example.ui;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import coil.disk.DiskLruCache;
import com.example.data.AppThemeMode;
import com.example.data.ContinuityTarget;
import com.example.data.EpisodeDataGenerator;
import com.example.data.SeriesContinuityManager;
import com.example.data.SeriesStorage;
import com.example.data.SyncStorage;
import com.example.data.ThemeStorage;
import com.example.data.TrashStorage;
import com.example.model.PendencyItem;
import com.example.model.PendencyType;
import com.example.model.Season;
import com.example.model.SeasonStatus;
import com.example.model.Series;
import com.example.model.SeriesStatus;
import com.example.model.TmdbSearchResult;
import com.example.model.TmdbSeasonInfo;
import com.example.model.TmdbSeriesDetails;
import com.example.ui.components.BottomNavigationBarKt;
import com.example.ui.components.TmdbSearchDialogKt;
import com.example.ui.detail.DetailOptionType;
import com.example.ui.navigation.NavDestination;
import com.example.ui.theme.AppColors;
import com.example.ui.theme.AppTheme;
import com.example.ui.theme.ThemeKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: MinutagensApp.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aI\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001aG\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\n\u001a=\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a/\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\u0010\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\f\u00105\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\f\u00106\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000209X\u008a\u008e\u0002²\u0006\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020;0 X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"MinutagensApp", "", "initialSeriesForDetails", "Lcom/example/model/Series;", "initialOptionModal", "Lcom/example/ui/detail/DetailOptionType;", "currentThemeMode", "Lcom/example/data/AppThemeMode;", "onThemeModeChange", "Lkotlin/Function1;", "(Lcom/example/model/Series;Lcom/example/ui/detail/DetailOptionType;Lcom/example/data/AppThemeMode;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MinutagensAppContent", "QuickThemeButton", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "isSelected", "", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AddSeriesDialog", "onDismiss", "onAddSeries", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app", "localThemeMode", "isFirstAccessCompleted", "allSeriesList", "", "currentDestination", "Lcom/example/ui/navigation/NavDestination;", "showMenuSheet", "showAddSeriesSheet", "selectedSeriesId", "showPendenciasScreen", "showSincronizacaoScreen", "showGooglePlanilhasScreen", "showExportarScreen", "showTesteConexaoScreen", "showLixeiraScreen", "showApiConfigScreen", "pendencyTargetSeasonId", "pendencyTargetEpisodeId", "pendencyTargetOptionModal", "category", "seasonsCountText", "episodesPerSeasonText", "tmdbId", "imdbId", "posterUrl", "backdropUrl", "synopsis", "releaseYear", "", "tmdbSeasons", "Lcom/example/model/TmdbSeasonInfo;", "showTmdbSearchDialog"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MinutagensAppKt {

    /* compiled from: MinutagensApp.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavDestination.values().length];
            try {
                iArr[NavDestination.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[NavDestination.EXPLORE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[NavDestination.MY_SERIES.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[NavDestination.MORE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$269(Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        AddSeriesDialog(function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensApp$lambda$6(Series series, DetailOptionType detailOptionType, AppThemeMode appThemeMode, Function1 function1, int i, int i2, Composer composer, int i3) {
        MinutagensApp(series, detailOptionType, appThemeMode, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$180(Series series, DetailOptionType detailOptionType, AppThemeMode appThemeMode, Function1 function1, int i, int i2, Composer composer, int i3) {
        MinutagensAppContent(series, detailOptionType, appThemeMode, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuickThemeButton$lambda$185(Modifier modifier, String str, ImageVector imageVector, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        QuickThemeButton(modifier, str, imageVector, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MinutagensApp(Series initialSeriesForDetails, DetailOptionType initialOptionModal, AppThemeMode currentThemeMode, Function1<? super AppThemeMode, Unit> function1, Composer $composer, final int $changed, final int i) {
        Series series;
        final Function1 onThemeModeChange;
        final Series initialSeriesForDetails2;
        final DetailOptionType initialOptionModal2;
        AppThemeMode currentThemeMode2;
        AppThemeMode currentThemeMode3;
        Object obj;
        Object obj2;
        final AppThemeMode currentThemeMode4;
        final Function1 onThemeModeChange2;
        Composer $composer2 = $composer.startRestartGroup(-734432662);
        ComposerKt.sourceInformation($composer2, "C(MinutagensApp)P(2,1)114@5218L7,115@5252L95,120@5462L147,126@5663L261,126@5615L309:MinutagensApp.kt#naom5h");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            series = initialSeriesForDetails;
        } else if (($changed & 6) == 0) {
            series = initialSeriesForDetails;
            $dirty |= $composer2.changedInstance(series) ? 4 : 2;
        } else {
            series = initialSeriesForDetails;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(initialOptionModal == null ? -1 : initialOptionModal.ordinal()) ? 32 : 16;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
        } else if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(currentThemeMode == null ? -1 : currentThemeMode.ordinal()) ? 256 : 128;
        }
        int i5 = i & 8;
        if (i5 != 0) {
            $dirty |= 3072;
            onThemeModeChange = function1;
        } else if (($changed & 3072) == 0) {
            onThemeModeChange = function1;
            $dirty |= $composer2.changedInstance(onThemeModeChange) ? 2048 : 1024;
        } else {
            onThemeModeChange = function1;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
            initialOptionModal2 = initialOptionModal;
            currentThemeMode4 = currentThemeMode;
            initialSeriesForDetails2 = series;
            onThemeModeChange2 = onThemeModeChange;
        } else {
            if (i2 != 0) {
                initialSeriesForDetails2 = null;
            } else {
                initialSeriesForDetails2 = series;
            }
            if (i3 == 0) {
                initialOptionModal2 = initialOptionModal;
            } else {
                initialOptionModal2 = null;
            }
            if (i4 == 0) {
                currentThemeMode2 = currentThemeMode;
            } else {
                currentThemeMode2 = null;
            }
            if (i5 != 0) {
                onThemeModeChange = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-734432662, $dirty2, -1, "com.example.ui.MinutagensApp (MinutagensApp.kt:113)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart($composer2, -1415140119, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue = $composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                currentThemeMode3 = currentThemeMode2;
                obj = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentThemeMode2 == null ? ThemeStorage.INSTANCE.getThemeMode(context) : currentThemeMode2, null, 2, null);
                $composer2.updateRememberedValue(obj);
            } else {
                currentThemeMode3 = currentThemeMode2;
                obj = rememberedValue;
            }
            final MutableState localThemeMode$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final AppThemeMode activeThemeMode = currentThemeMode3 == null ? MinutagensApp$lambda$1(localThemeMode$delegate) : currentThemeMode3;
            ComposerKt.sourceInformationMarkerStart($composer2, -1415133347, "CC(remember):MinutagensApp.kt#9igjgp");
            boolean changedInstance = $composer2.changedInstance(context) | (($dirty2 & 7168) == 2048);
            Object rememberedValue2 = $composer2.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function1() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return MinutagensAppKt.MinutagensApp$lambda$4$lambda$3(context, onThemeModeChange, localThemeMode$delegate, (AppThemeMode) obj3);
                    }
                };
                $composer2.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final Function1 handleThemeChange = (Function1) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ThemeKt.MyApplicationTheme(activeThemeMode, ComposableLambdaKt.rememberComposableLambda(1026480215, true, new Function2() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return MinutagensAppKt.MinutagensApp$lambda$5(Series.this, initialOptionModal2, activeThemeMode, handleThemeChange, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            currentThemeMode4 = currentThemeMode3;
            onThemeModeChange2 = onThemeModeChange;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return MinutagensAppKt.MinutagensApp$lambda$6(Series.this, initialOptionModal2, currentThemeMode4, onThemeModeChange2, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final AppThemeMode MinutagensApp$lambda$1(MutableState<AppThemeMode> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensApp$lambda$4$lambda$3(Context $context, Function1 $onThemeModeChange, MutableState $localThemeMode$delegate, AppThemeMode newMode) {
        Intrinsics.checkNotNullParameter(newMode, "newMode");
        $localThemeMode$delegate.setValue(newMode);
        ThemeStorage.INSTANCE.saveThemeMode($context, newMode);
        if ($onThemeModeChange != null) {
            $onThemeModeChange.invoke(newMode);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensApp$lambda$5(Series $initialSeriesForDetails, DetailOptionType $initialOptionModal, AppThemeMode $activeThemeMode, Function1 $handleThemeChange, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C127@5673L245:MinutagensApp.kt#naom5h");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1026480215, $changed, -1, "com.example.ui.MinutagensApp.<anonymous> (MinutagensApp.kt:127)");
            }
            MinutagensAppContent($initialSeriesForDetails, $initialOptionModal, $activeThemeMode, $handleThemeChange, $composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0e8a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0562 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void MinutagensAppContent(com.example.model.Series r46, com.example.ui.detail.DetailOptionType r47, com.example.data.AppThemeMode r48, kotlin.jvm.functions.Function1<? super com.example.data.AppThemeMode, kotlin.Unit> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 3757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.MinutagensAppKt.MinutagensAppContent(com.example.model.Series, com.example.ui.detail.DetailOptionType, com.example.data.AppThemeMode, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List<Series> MinutagensAppContent$lambda$12(MutableState<List<Series>> mutableState) {
        return mutableState.getValue();
    }

    private static final NavDestination MinutagensAppContent$lambda$15(MutableState<NavDestination> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean MinutagensAppContent$lambda$18(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MinutagensAppContent$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MinutagensAppContent$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MinutagensAppContent$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MinutagensAppContent$lambda$24(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean MinutagensAppContent$lambda$27(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MinutagensAppContent$lambda$28(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MinutagensAppContent$lambda$30(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MinutagensAppContent$lambda$31(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MinutagensAppContent$lambda$33(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MinutagensAppContent$lambda$34(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MinutagensAppContent$lambda$36(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MinutagensAppContent$lambda$37(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MinutagensAppContent$lambda$39(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MinutagensAppContent$lambda$40(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MinutagensAppContent$lambda$42(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MinutagensAppContent$lambda$43(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MinutagensAppContent$lambda$45(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MinutagensAppContent$lambda$46(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MinutagensAppContent$lambda$48(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String MinutagensAppContent$lambda$51(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final DetailOptionType MinutagensAppContent$lambda$54(MutableState<DetailOptionType> mutableState) {
        return mutableState.getValue();
    }

    static /* synthetic */ void MinutagensAppContent$persistSeries$default(Context context, CoroutineScope coroutineScope, MutableState mutableState, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            z2 = true;
        }
        MinutagensAppContent$persistSeries(context, coroutineScope, mutableState, list, z, z2);
    }

    private static final void MinutagensAppContent$persistSeries(Context context, CoroutineScope coroutineScope, MutableState<List<Series>> mutableState, List<Series> list, boolean markPending, boolean syncRemote) {
        mutableState.setValue(list);
        SeriesStorage.INSTANCE.saveSeries(context, list);
        if (markPending) {
            SyncStorage.incrementPendingCount$default(SyncStorage.INSTANCE, context, 0, 2, null);
        }
        if (syncRemote) {
            BuildersKt.launch$default(coroutineScope, null, null, new MinutagensAppKt$MinutagensAppContent$persistSeries$1(context, list, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$59$lambda$58(MutableState $showApiConfigScreen$delegate) {
        MinutagensAppContent$lambda$46($showApiConfigScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$61$lambda$60(MutableState $showApiConfigScreen$delegate) {
        MinutagensAppContent$lambda$46($showApiConfigScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$63$lambda$62(MutableState $selectedSeriesId$delegate, MutableState $pendencyTargetSeasonId$delegate, MutableState $pendencyTargetEpisodeId$delegate, MutableState $pendencyTargetOptionModal$delegate) {
        $selectedSeriesId$delegate.setValue(null);
        $pendencyTargetSeasonId$delegate.setValue(null);
        $pendencyTargetEpisodeId$delegate.setValue(null);
        $pendencyTargetOptionModal$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$65$lambda$64(MutableState $selectedSeriesId$delegate, MutableState $pendencyTargetSeasonId$delegate, MutableState $pendencyTargetEpisodeId$delegate, MutableState $pendencyTargetOptionModal$delegate) {
        $selectedSeriesId$delegate.setValue(null);
        $pendencyTargetSeasonId$delegate.setValue(null);
        $pendencyTargetEpisodeId$delegate.setValue(null);
        $pendencyTargetOptionModal$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$68$lambda$67(MutableState $allSeriesList$delegate, Context $context, CoroutineScope $coroutineScope, Series updatedSeries) {
        Intrinsics.checkNotNullParameter(updatedSeries, "updatedSeries");
        Iterable<Series> MinutagensAppContent$lambda$12 = MinutagensAppContent$lambda$12($allSeriesList$delegate);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(MinutagensAppContent$lambda$12, 10));
        for (Series series : MinutagensAppContent$lambda$12) {
            if (Intrinsics.areEqual(series.getId(), updatedSeries.getId())) {
                series = updatedSeries;
            }
            arrayList.add(series);
        }
        List updated = (List) arrayList;
        MinutagensAppContent$persistSeries$default($context, $coroutineScope, $allSeriesList$delegate, updated, true, false, 32, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$71$lambda$70(Context $context, MutableState $allSeriesList$delegate, CoroutineScope $coroutineScope, MutableState $selectedSeriesId$delegate, MutableState $pendencyTargetSeasonId$delegate, MutableState $pendencyTargetEpisodeId$delegate, MutableState $pendencyTargetOptionModal$delegate, Series seriesToDelete) {
        Intrinsics.checkNotNullParameter(seriesToDelete, "seriesToDelete");
        TrashStorage.INSTANCE.moveToTrash(seriesToDelete);
        Iterable MinutagensAppContent$lambda$12 = MinutagensAppContent$lambda$12($allSeriesList$delegate);
        Collection arrayList = new ArrayList();
        for (Object obj : MinutagensAppContent$lambda$12) {
            if (!Intrinsics.areEqual(((Series) obj).getId(), seriesToDelete.getId())) {
                arrayList.add(obj);
            }
        }
        List updated = (List) arrayList;
        MinutagensAppContent$persistSeries$default($context, $coroutineScope, $allSeriesList$delegate, updated, true, false, 32, null);
        $selectedSeriesId$delegate.setValue(null);
        $pendencyTargetSeasonId$delegate.setValue(null);
        $pendencyTargetEpisodeId$delegate.setValue(null);
        $pendencyTargetOptionModal$delegate.setValue(null);
        Toast.makeText($context, "'" + seriesToDelete.getTitle() + "' movida para a lixeira", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$73$lambda$72(MutableState $showApiConfigScreen$delegate) {
        MinutagensAppContent$lambda$46($showApiConfigScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$75$lambda$74(MutableState $showApiConfigScreen$delegate) {
        MinutagensAppContent$lambda$46($showApiConfigScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$77$lambda$76(MutableState $showExportarScreen$delegate) {
        MinutagensAppContent$lambda$37($showExportarScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$79$lambda$78(MutableState $showTesteConexaoScreen$delegate) {
        MinutagensAppContent$lambda$40($showTesteConexaoScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$82$lambda$81(MutableState $allSeriesList$delegate, Context $context, CoroutineScope $coroutineScope, Series restoredSeries) {
        Intrinsics.checkNotNullParameter(restoredSeries, "restoredSeries");
        Iterable MinutagensAppContent$lambda$12 = MinutagensAppContent$lambda$12($allSeriesList$delegate);
        boolean z = true;
        if (!(MinutagensAppContent$lambda$12 instanceof Collection) || !((Collection) MinutagensAppContent$lambda$12).isEmpty()) {
            Iterator it = MinutagensAppContent$lambda$12.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(((Series) it.next()).getId(), restoredSeries.getId())) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            List updated = CollectionsKt.plus((Collection<? extends Series>) MinutagensAppContent$lambda$12($allSeriesList$delegate), restoredSeries);
            MinutagensAppContent$persistSeries$default($context, $coroutineScope, $allSeriesList$delegate, updated, true, false, 32, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$84$lambda$83(MutableState $showLixeiraScreen$delegate) {
        MinutagensAppContent$lambda$43($showLixeiraScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$86$lambda$85(MutableState $showGooglePlanilhasScreen$delegate) {
        MinutagensAppContent$lambda$34($showGooglePlanilhasScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$88$lambda$87(MutableState $showApiConfigScreen$delegate) {
        MinutagensAppContent$lambda$46($showApiConfigScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$90$lambda$89(MutableState $showSincronizacaoScreen$delegate) {
        MinutagensAppContent$lambda$31($showSincronizacaoScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$92$lambda$91(MutableState $showGooglePlanilhasScreen$delegate) {
        MinutagensAppContent$lambda$34($showGooglePlanilhasScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$94$lambda$93(MutableState $showApiConfigScreen$delegate) {
        MinutagensAppContent$lambda$46($showApiConfigScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$96$lambda$95(MutableState $showPendenciasScreen$delegate) {
        MinutagensAppContent$lambda$28($showPendenciasScreen$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$98$lambda$97(MutableState $selectedSeriesId$delegate, MutableState $pendencyTargetSeasonId$delegate, MutableState $pendencyTargetEpisodeId$delegate, MutableState $pendencyTargetOptionModal$delegate, PendencyItem item) {
        DetailOptionType detailOptionType;
        Intrinsics.checkNotNullParameter(item, "item");
        $selectedSeriesId$delegate.setValue(item.getSeriesId());
        $pendencyTargetSeasonId$delegate.setValue(item.getSeasonId());
        $pendencyTargetEpisodeId$delegate.setValue(item.getEpisodeId());
        if (item.getType() == PendencyType.IDENTIFIERS && item.getSeasonId() == null) {
            detailOptionType = DetailOptionType.IDENTIFIERS;
        } else {
            detailOptionType = null;
        }
        $pendencyTargetOptionModal$delegate.setValue(detailOptionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$101(final MutableState $currentDestination$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C321@14211L27,319@14096L160:MinutagensApp.kt#naom5h");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-954248550, $changed, -1, "com.example.ui.MinutagensAppContent.<anonymous> (MinutagensApp.kt:319)");
            }
            NavDestination MinutagensAppContent$lambda$15 = MinutagensAppContent$lambda$15($currentDestination$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 2090149077, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue = $composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda73
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MinutagensAppKt.MinutagensAppContent$lambda$101$lambda$100$lambda$99(MutableState.this, (NavDestination) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BottomNavigationBarKt.BottomNavigationBar(MinutagensAppContent$lambda$15, (Function1) obj, null, $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$101$lambda$100$lambda$99(MutableState $currentDestination$delegate, NavDestination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $currentDestination$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x042d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MinutagensAppContent$lambda$130(com.example.data.AppThemeMode r45, kotlin.jvm.functions.Function1 r46, final androidx.compose.runtime.MutableState r47, final androidx.compose.runtime.MutableState r48, final androidx.compose.runtime.MutableState r49, final androidx.compose.runtime.MutableState r50, final androidx.compose.runtime.MutableState r51, final androidx.compose.runtime.MutableState r52, androidx.compose.runtime.MutableState r53, final androidx.compose.runtime.MutableState r54, final androidx.compose.runtime.MutableState r55, final androidx.compose.runtime.MutableState r56, final androidx.compose.runtime.MutableState r57, final androidx.compose.runtime.MutableState r58, final androidx.compose.runtime.MutableState r59, final androidx.compose.runtime.MutableState r60, androidx.compose.foundation.layout.PaddingValues r61, androidx.compose.runtime.Composer r62, int r63) {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.MinutagensAppKt.MinutagensAppContent$lambda$130(com.example.data.AppThemeMode, kotlin.jvm.functions.Function1, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$103$lambda$102(MutableState $showMenuSheet$delegate) {
        MinutagensAppContent$lambda$19($showMenuSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$105$lambda$104(MutableState $showAddSeriesSheet$delegate) {
        MinutagensAppContent$lambda$22($showAddSeriesSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$107$lambda$106(MutableState $selectedSeriesId$delegate, Series series) {
        Intrinsics.checkNotNullParameter(series, "series");
        $selectedSeriesId$delegate.setValue(series.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$110$lambda$109(MutableState $selectedSeriesId$delegate, MutableState $pendencyTargetSeasonId$delegate, MutableState $pendencyTargetEpisodeId$delegate, Series series) {
        Object obj;
        String id;
        Intrinsics.checkNotNullParameter(series, "series");
        ContinuityTarget continuity = SeriesContinuityManager.INSTANCE.getContinuityTarget(series);
        $selectedSeriesId$delegate.setValue(series.getId());
        if (continuity != null) {
            $pendencyTargetSeasonId$delegate.setValue(continuity.getSeasonId());
            $pendencyTargetEpisodeId$delegate.setValue(continuity.getEpisodeId());
        } else {
            Iterator it = series.getSeasons().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Season) obj).getStatus() != SeasonStatus.COMPLETED) {
                    break;
                }
            }
            Season season = (Season) obj;
            if (season == null || (id = season.getId()) == null) {
                Season season2 = (Season) CollectionsKt.firstOrNull((List) series.getSeasons());
                id = season2 != null ? season2.getId() : null;
            }
            $pendencyTargetSeasonId$delegate.setValue(id);
            $pendencyTargetEpisodeId$delegate.setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$112$lambda$111(MutableState $currentDestination$delegate) {
        $currentDestination$delegate.setValue(NavDestination.HOME);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$114$lambda$113(MutableState $currentDestination$delegate) {
        $currentDestination$delegate.setValue(NavDestination.HOME);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$116$lambda$115(MutableState $showExportarScreen$delegate) {
        MinutagensAppContent$lambda$37($showExportarScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$118$lambda$117(MutableState $showGooglePlanilhasScreen$delegate) {
        MinutagensAppContent$lambda$34($showGooglePlanilhasScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$120$lambda$119(MutableState $showSincronizacaoScreen$delegate) {
        MinutagensAppContent$lambda$31($showSincronizacaoScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$122$lambda$121(MutableState $showTesteConexaoScreen$delegate) {
        MinutagensAppContent$lambda$40($showTesteConexaoScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$124$lambda$123(MutableState $showLixeiraScreen$delegate) {
        MinutagensAppContent$lambda$43($showLixeiraScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$126$lambda$125(MutableState $showPendenciasScreen$delegate) {
        MinutagensAppContent$lambda$28($showPendenciasScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$130$lambda$129$lambda$128$lambda$127(MutableState $showApiConfigScreen$delegate) {
        MinutagensAppContent$lambda$46($showApiConfigScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$132$lambda$131(MutableState $showMenuSheet$delegate) {
        MinutagensAppContent$lambda$19($showMenuSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0d35  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0d6e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0f46  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0ff4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x1000  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x1039  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x1129  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x1135  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x116e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x12af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x12bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x12f4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x14cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x157a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x1586  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x15bf  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x16af  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x16bb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x16f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x1833  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x183f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x1878  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x1a68  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x1a74  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1aab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x1b37  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1b60  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x1bb8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x1bdb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x1c33  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1c54  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1d09  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x1d68  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x1c64  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1c36  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x1beb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x1bbb  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1b70 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x1b3a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x1ac1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x1a7a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x188e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1845  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x170a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x16c1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x15d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x158c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x130a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x12c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x1184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x113b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x104f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x1006  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0d84 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0bfe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0bb5  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0ac9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0678 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0342 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0ba3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0baf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit MinutagensAppContent$lambda$173(final com.example.ui.theme.AppColors r121, final kotlinx.coroutines.CoroutineScope r122, final androidx.compose.material3.SheetState r123, final androidx.compose.runtime.MutableState r124, final androidx.compose.runtime.MutableState r125, final androidx.compose.runtime.MutableState r126, final androidx.compose.runtime.MutableState r127, final androidx.compose.runtime.MutableState r128, com.example.data.AppThemeMode r129, final android.content.Context r130, final kotlin.jvm.functions.Function1 r131, androidx.compose.foundation.layout.ColumnScope r132, androidx.compose.runtime.Composer r133, int r134) {
        /*
            Method dump skipped, instructions count: 7534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.MinutagensAppKt.MinutagensAppContent$lambda$173(com.example.ui.theme.AppColors, kotlinx.coroutines.CoroutineScope, androidx.compose.material3.SheetState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, com.example.data.AppThemeMode, android.content.Context, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$137$lambda$135$lambda$134(CoroutineScope $coroutineScope, SheetState $sheetState, final MutableState $showMenuSheet$delegate) {
        Job launch$default;
        launch$default = BuildersKt.launch$default($coroutineScope, null, null, new MinutagensAppKt$MinutagensAppContent$24$1$1$1$1$1($sheetState, null), 3, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MinutagensAppKt.MinutagensAppContent$lambda$173$lambda$172$lambda$137$lambda$135$lambda$134$lambda$133(MutableState.this, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$137$lambda$135$lambda$134$lambda$133(MutableState $showMenuSheet$delegate, Throwable it) {
        MinutagensAppContent$lambda$19($showMenuSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$137$lambda$136(AppColors $colors, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C423@19264L295:MinutagensApp.kt#naom5h");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1490867126, $changed, -1, "com.example.ui.MinutagensAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MinutagensApp.kt:423)");
            }
            IconKt.m2150Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Fechar menu", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), $colors.m7094getTextSecondary0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$140$lambda$139(CoroutineScope $coroutineScope, SheetState $sheetState, final MutableState $showMenuSheet$delegate, final MutableState $showExportarScreen$delegate) {
        Job launch$default;
        launch$default = BuildersKt.launch$default($coroutineScope, null, null, new MinutagensAppKt$MinutagensAppContent$24$1$2$1$1($sheetState, null), 3, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MinutagensAppKt.MinutagensAppContent$lambda$173$lambda$172$lambda$140$lambda$139$lambda$138(MutableState.this, $showExportarScreen$delegate, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$140$lambda$139$lambda$138(MutableState $showMenuSheet$delegate, MutableState $showExportarScreen$delegate, Throwable it) {
        MinutagensAppContent$lambda$19($showMenuSheet$delegate, false);
        MinutagensAppContent$lambda$37($showExportarScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$146$lambda$145(CoroutineScope $coroutineScope, SheetState $sheetState, final MutableState $showMenuSheet$delegate, final MutableState $showTesteConexaoScreen$delegate) {
        Job launch$default;
        launch$default = BuildersKt.launch$default($coroutineScope, null, null, new MinutagensAppKt$MinutagensAppContent$24$1$4$1$1($sheetState, null), 3, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MinutagensAppKt.MinutagensAppContent$lambda$173$lambda$172$lambda$146$lambda$145$lambda$144(MutableState.this, $showTesteConexaoScreen$delegate, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$146$lambda$145$lambda$144(MutableState $showMenuSheet$delegate, MutableState $showTesteConexaoScreen$delegate, Throwable it) {
        MinutagensAppContent$lambda$19($showMenuSheet$delegate, false);
        MinutagensAppContent$lambda$40($showTesteConexaoScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$152$lambda$151(CoroutineScope $coroutineScope, SheetState $sheetState, final MutableState $showMenuSheet$delegate, final MutableState $showLixeiraScreen$delegate) {
        Job launch$default;
        launch$default = BuildersKt.launch$default($coroutineScope, null, null, new MinutagensAppKt$MinutagensAppContent$24$1$6$1$1($sheetState, null), 3, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MinutagensAppKt.MinutagensAppContent$lambda$173$lambda$172$lambda$152$lambda$151$lambda$150(MutableState.this, $showLixeiraScreen$delegate, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$152$lambda$151$lambda$150(MutableState $showMenuSheet$delegate, MutableState $showLixeiraScreen$delegate, Throwable it) {
        MinutagensAppContent$lambda$19($showMenuSheet$delegate, false);
        MinutagensAppContent$lambda$43($showLixeiraScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$158$lambda$157(CoroutineScope $coroutineScope, SheetState $sheetState, final MutableState $showMenuSheet$delegate, final MutableState $showSincronizacaoScreen$delegate) {
        Job launch$default;
        launch$default = BuildersKt.launch$default($coroutineScope, null, null, new MinutagensAppKt$MinutagensAppContent$24$1$8$1$1($sheetState, null), 3, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MinutagensAppKt.MinutagensAppContent$lambda$173$lambda$172$lambda$158$lambda$157$lambda$156(MutableState.this, $showSincronizacaoScreen$delegate, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$158$lambda$157$lambda$156(MutableState $showMenuSheet$delegate, MutableState $showSincronizacaoScreen$delegate, Throwable it) {
        MinutagensAppContent$lambda$19($showMenuSheet$delegate, false);
        MinutagensAppContent$lambda$31($showSincronizacaoScreen$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$168$lambda$163$lambda$162(Context $context, Function1 $onThemeModeChange) {
        ThemeStorage.INSTANCE.saveThemeMode($context, AppThemeMode.DARK);
        if ($onThemeModeChange != null) {
            $onThemeModeChange.invoke(AppThemeMode.DARK);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$168$lambda$165$lambda$164(Context $context, Function1 $onThemeModeChange) {
        ThemeStorage.INSTANCE.saveThemeMode($context, AppThemeMode.LIGHT);
        if ($onThemeModeChange != null) {
            $onThemeModeChange.invoke(AppThemeMode.LIGHT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$168$lambda$167$lambda$166(Context $context, Function1 $onThemeModeChange) {
        ThemeStorage.INSTANCE.saveThemeMode($context, AppThemeMode.SYSTEM);
        if ($onThemeModeChange != null) {
            $onThemeModeChange.invoke(AppThemeMode.SYSTEM);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$171$lambda$170(CoroutineScope $coroutineScope, SheetState $sheetState, final MutableState $showMenuSheet$delegate) {
        Job launch$default;
        launch$default = BuildersKt.launch$default($coroutineScope, null, null, new MinutagensAppKt$MinutagensAppContent$24$1$11$1$1($sheetState, null), 3, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MinutagensAppKt.MinutagensAppContent$lambda$173$lambda$172$lambda$171$lambda$170$lambda$169(MutableState.this, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$173$lambda$172$lambda$171$lambda$170$lambda$169(MutableState $showMenuSheet$delegate, Throwable it) {
        MinutagensAppContent$lambda$19($showMenuSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$175$lambda$174(MutableState $showAddSeriesSheet$delegate) {
        MinutagensAppContent$lambda$22($showAddSeriesSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$177$lambda$176(TmdbSearchResult tmdbSearchResult, TmdbSeriesDetails tmdbSeriesDetails) {
        Intrinsics.checkNotNullParameter(tmdbSearchResult, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit MinutagensAppContent$lambda$179$lambda$178(MutableState $allSeriesList$delegate, Context $context, CoroutineScope $coroutineScope, MutableState $showAddSeriesSheet$delegate, Series importedSeries) {
        Intrinsics.checkNotNullParameter(importedSeries, "importedSeries");
        MinutagensAppContent$persistSeries$default($context, $coroutineScope, $allSeriesList$delegate, CollectionsKt.plus((Collection) CollectionsKt.listOf(importedSeries), (Iterable) MinutagensAppContent$lambda$12($allSeriesList$delegate)), true, false, 32, null);
        MinutagensAppContent$lambda$22($showAddSeriesSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0403  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void QuickThemeButton(androidx.compose.ui.Modifier r111, final java.lang.String r112, final androidx.compose.ui.graphics.vector.ImageVector r113, final boolean r114, final kotlin.jvm.functions.Function0<kotlin.Unit> r115, androidx.compose.runtime.Composer r116, final int r117, final int r118) {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.MinutagensAppKt.QuickThemeButton(androidx.compose.ui.Modifier, java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit QuickThemeButton$lambda$182$lambda$181(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    private static final void AddSeriesDialog(final Function0<Unit> function0, final Function1<? super Series, Unit> function1, Composer $composer, final int $changed) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        boolean z;
        Object obj12;
        AppColors colors;
        MutableState showTmdbSearchDialog$delegate;
        Composer $composer2;
        final MutableState backdropUrl$delegate;
        Composer $composer3;
        Object obj13;
        Function0 function02;
        Object obj14;
        Object obj15;
        final Function0<Unit> function03 = function0;
        Composer $composer4 = $composer.startRestartGroup(-1347623422);
        ComposerKt.sourceInformation($composer4, "C(AddSeriesDialog)P(1)762@34555L31,763@34607L47,764@34683L32,765@34749L32,766@34800L31,767@34850L31,768@34903L42,769@34969L42,770@35032L31,771@35087L90,772@35201L80,773@35314L34,775@35376L6,776@35404L59,825@37715L17119,820@37556L17278:MinutagensApp.kt#naom5h");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer4.changedInstance(function03) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer4.changedInstance(function1) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer4.getSkipping()) {
            $composer4.skipToGroupEnd();
            $composer3 = $composer4;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1347623422, $dirty2, -1, "com.example.ui.AddSeriesDialog (MinutagensApp.kt:761)");
            }
            ComposerKt.sourceInformationMarkerStart($composer4, 2014020097, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue = $composer4.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            final MutableState title$delegate = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014021777, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue2 = $composer4.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Drama / Suspense", null, 2, null);
                $composer4.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final MutableState category$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014024194, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue3 = $composer4.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DiskLruCache.VERSION, null, 2, null);
                $composer4.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState seasonsCountText$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014026306, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue4 = $composer4.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("8", null, 2, null);
                $composer4.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState episodesPerSeasonText$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014027937, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue5 = $composer4.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState tmdbId$delegate = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014029537, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue6 = $composer4.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableState imdbId$delegate = (MutableState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014031244, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue7 = $composer4.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                obj7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer4.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableState posterUrl$delegate = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014033356, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue8 = $composer4.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                obj8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer4.updateRememberedValue(obj8);
            } else {
                obj8 = rememberedValue8;
            }
            final MutableState backdropUrl$delegate2 = (MutableState) obj8;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014035361, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue9 = $composer4.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                obj9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(obj9);
            } else {
                obj9 = rememberedValue9;
            }
            final MutableState synopsis$delegate = (MutableState) obj9;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014037180, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue10 = $composer4.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                obj10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(Calendar.getInstance().get(1)), null, 2, null);
                $composer4.updateRememberedValue(obj10);
            } else {
                obj10 = rememberedValue10;
            }
            final MutableState releaseYear$delegate = (MutableState) obj10;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014040818, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue11 = $composer4.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                obj11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer4.updateRememberedValue(obj11);
            } else {
                obj11 = rememberedValue11;
            }
            final MutableState tmdbSeasons$delegate = (MutableState) obj11;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, 2014044388, "CC(remember):MinutagensApp.kt#9igjgp");
            Object rememberedValue12 = $composer4.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                z = false;
                obj12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(obj12);
            } else {
                z = false;
                obj12 = rememberedValue12;
            }
            final MutableState showTmdbSearchDialog$delegate2 = (MutableState) obj12;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            AppColors colors2 = AppTheme.INSTANCE.getColors($composer4, 6);
            SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer4, 6, 2);
            if (AddSeriesDialog$lambda$220(showTmdbSearchDialog$delegate2)) {
                $composer4.startReplaceGroup(-1988891207);
                ComposerKt.sourceInformation($composer4, "780@35547L32,786@35799L1735,781@35618L150,779@35505L2039");
                ComposerKt.sourceInformationMarkerStart($composer4, 2014051842, "CC(remember):MinutagensApp.kt#9igjgp");
                Object rememberedValue13 = $composer4.rememberedValue();
                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    colors = colors2;
                    obj13 = new Function0() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MinutagensAppKt.AddSeriesDialog$lambda$223$lambda$222(MutableState.this);
                        }
                    };
                    $composer4.updateRememberedValue(obj13);
                } else {
                    colors = colors2;
                    obj13 = rememberedValue13;
                }
                Function0 function04 = (Function0) obj13;
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerStart($composer4, 2014061609, "CC(remember):MinutagensApp.kt#9igjgp");
                Object rememberedValue14 = $composer4.rememberedValue();
                if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    backdropUrl$delegate = backdropUrl$delegate2;
                    obj14 = new Function2() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj16, Object obj17) {
                            return MinutagensAppKt.AddSeriesDialog$lambda$228$lambda$227(MutableState.this, tmdbId$delegate, posterUrl$delegate, backdropUrl$delegate2, synopsis$delegate, releaseYear$delegate, category$delegate, tmdbSeasons$delegate, seasonsCountText$delegate, episodesPerSeasonText$delegate, showTmdbSearchDialog$delegate2, (TmdbSearchResult) obj16, (TmdbSeriesDetails) obj17);
                        }
                    };
                    function02 = function04;
                    $composer4.updateRememberedValue(obj14);
                } else {
                    function02 = function04;
                    backdropUrl$delegate = backdropUrl$delegate2;
                    obj14 = rememberedValue14;
                }
                Function2 function2 = (Function2) obj14;
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerStart($composer4, 2014054232, "CC(remember):MinutagensApp.kt#9igjgp");
                boolean z2 = (($dirty2 & 112) == 32 ? true : z) | (($dirty2 & 14) == 4 ? true : z);
                Object rememberedValue15 = $composer4.rememberedValue();
                if (z2 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    obj15 = new Function1() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj16) {
                            return MinutagensAppKt.AddSeriesDialog$lambda$230$lambda$229(Function1.this, function03, showTmdbSearchDialog$delegate2, (Series) obj16);
                        }
                    };
                    $composer4.updateRememberedValue(obj15);
                } else {
                    obj15 = rememberedValue15;
                }
                ComposerKt.sourceInformationMarkerEnd($composer4);
                showTmdbSearchDialog$delegate = showTmdbSearchDialog$delegate2;
                TmdbSearchDialogKt.TmdbSearchDialog(function02, function2, (Function1) obj15, null, $composer4, 54, 8);
                $composer2 = $composer4;
            } else {
                colors = colors2;
                showTmdbSearchDialog$delegate = showTmdbSearchDialog$delegate2;
                $composer2 = $composer4;
                backdropUrl$delegate = backdropUrl$delegate2;
                $composer2.startReplaceGroup(-2024166944);
            }
            $composer2.endReplaceGroup();
            Composer $composer5 = $composer2;
            final MutableState showTmdbSearchDialog$delegate3 = showTmdbSearchDialog$delegate;
            final AppColors colors3 = colors;
            $composer3 = $composer5;
            function03 = function0;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(function03, null, sheetState, 0.0f, null, colors.m7088getCard0d7_KjU(), 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(527410399, true, new Function3() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj16, Object obj17, Object obj18) {
                    return MinutagensAppKt.AddSeriesDialog$lambda$268(AppColors.this, function1, function0, showTmdbSearchDialog$delegate3, posterUrl$delegate, title$delegate, tmdbSeasons$delegate, category$delegate, seasonsCountText$delegate, episodesPerSeasonText$delegate, tmdbId$delegate, imdbId$delegate, releaseYear$delegate, synopsis$delegate, backdropUrl$delegate, (ColumnScope) obj16, (Composer) obj17, ((Integer) obj18).intValue());
                }
            }, $composer5, 54), $composer3, ($dirty2 & 14) | 805306368, 384, 3546);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.MinutagensAppKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj16, Object obj17) {
                    return MinutagensAppKt.AddSeriesDialog$lambda$269(Function0.this, function1, $changed, (Composer) obj16, ((Integer) obj17).intValue());
                }
            });
        }
    }

    private static final String AddSeriesDialog$lambda$187(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AddSeriesDialog$lambda$190(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AddSeriesDialog$lambda$193(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AddSeriesDialog$lambda$196(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AddSeriesDialog$lambda$199(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AddSeriesDialog$lambda$202(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AddSeriesDialog$lambda$205(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AddSeriesDialog$lambda$208(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AddSeriesDialog$lambda$211(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int AddSeriesDialog$lambda$214(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void AddSeriesDialog$lambda$215(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final List<TmdbSeasonInfo> AddSeriesDialog$lambda$217(MutableState<List<TmdbSeasonInfo>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean AddSeriesDialog$lambda$220(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AddSeriesDialog$lambda$221(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$223$lambda$222(MutableState $showTmdbSearchDialog$delegate) {
        AddSeriesDialog$lambda$221($showTmdbSearchDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$230$lambda$229(Function1 $onAddSeries, Function0 $onDismiss, MutableState $showTmdbSearchDialog$delegate, Series importedSeries) {
        Intrinsics.checkNotNullParameter(importedSeries, "importedSeries");
        AddSeriesDialog$lambda$221($showTmdbSearchDialog$delegate, false);
        $onAddSeries.invoke(importedSeries);
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r9 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AddSeriesDialog$lambda$228$lambda$227(androidx.compose.runtime.MutableState r24, androidx.compose.runtime.MutableState r25, androidx.compose.runtime.MutableState r26, androidx.compose.runtime.MutableState r27, androidx.compose.runtime.MutableState r28, androidx.compose.runtime.MutableState r29, androidx.compose.runtime.MutableState r30, androidx.compose.runtime.MutableState r31, androidx.compose.runtime.MutableState r32, androidx.compose.runtime.MutableState r33, androidx.compose.runtime.MutableState r34, com.example.model.TmdbSearchResult r35, com.example.model.TmdbSeriesDetails r36) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.MinutagensAppKt.AddSeriesDialog$lambda$228$lambda$227(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, com.example.model.TmdbSearchResult, com.example.model.TmdbSeriesDetails):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0e1e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0e2a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0e63  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0fa1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x1151  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x1269  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x1344  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1350  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x1389  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x14b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x15d9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x16ca  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x16d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x170d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x1836  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x195f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x1a59  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x1ad4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1973  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x184a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x1723  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x16dc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x15ed  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x14c8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x139f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x1356  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x127b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x1163  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0fe8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0e79 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0e30  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x1093  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0792 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0648 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x051d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0a7a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AddSeriesDialog$lambda$268(final com.example.ui.theme.AppColors r229, final kotlin.jvm.functions.Function1 r230, kotlin.jvm.functions.Function0 r231, final androidx.compose.runtime.MutableState r232, final androidx.compose.runtime.MutableState r233, final androidx.compose.runtime.MutableState r234, final androidx.compose.runtime.MutableState r235, final androidx.compose.runtime.MutableState r236, final androidx.compose.runtime.MutableState r237, final androidx.compose.runtime.MutableState r238, final androidx.compose.runtime.MutableState r239, final androidx.compose.runtime.MutableState r240, final androidx.compose.runtime.MutableState r241, final androidx.compose.runtime.MutableState r242, final androidx.compose.runtime.MutableState r243, androidx.compose.foundation.layout.ColumnScope r244, androidx.compose.runtime.Composer r245, int r246) {
        /*
            Method dump skipped, instructions count: 6874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.MinutagensAppKt.AddSeriesDialog$lambda$268(com.example.ui.theme.AppColors, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$268$lambda$267$lambda$232$lambda$231(AppColors $colors, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C855@38885L250:MinutagensApp.kt#naom5h");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1082946424, $changed, -1, "com.example.ui.AddSeriesDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MinutagensApp.kt:855)");
            }
            IconKt.m2150Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Fechar", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), $colors.m7094getTextSecondary0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$268$lambda$267$lambda$234$lambda$233(MutableState $showTmdbSearchDialog$delegate) {
        AddSeriesDialog$lambda$221($showTmdbSearchDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$268$lambda$267$lambda$244$lambda$243(MutableState $title$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $title$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$268$lambda$267$lambda$246$lambda$245(MutableState $category$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $category$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$268$lambda$267$lambda$253$lambda$249$lambda$248(MutableState $seasonsCountText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        $seasonsCountText$delegate.setValue(((StringBuilder) sb).toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$268$lambda$267$lambda$253$lambda$252$lambda$251(MutableState $episodesPerSeasonText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        $episodesPerSeasonText$delegate.setValue(((StringBuilder) sb).toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$268$lambda$267$lambda$259$lambda$256$lambda$255(MutableState $tmdbId$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        $tmdbId$delegate.setValue(((StringBuilder) sb).toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit AddSeriesDialog$lambda$268$lambda$267$lambda$259$lambda$258$lambda$257(MutableState $imdbId$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $imdbId$delegate.setValue(StringsKt.trim((CharSequence) it).toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AddSeriesDialog$lambda$268$lambda$267$lambda$266$lambda$265(Function1 $onAddSeries, MutableState $title$delegate, MutableState $tmdbSeasons$delegate, MutableState $posterUrl$delegate, MutableState $seasonsCountText$delegate, MutableState $episodesPerSeasonText$delegate, MutableState $releaseYear$delegate, MutableState $category$delegate, MutableState $synopsis$delegate, MutableState $backdropUrl$delegate, MutableState $tmdbId$delegate, MutableState $imdbId$delegate) {
        int i;
        List generatedSeasons;
        if (!StringsKt.isBlank(AddSeriesDialog$lambda$187($title$delegate))) {
            String seriesId = "series_" + System.currentTimeMillis();
            List seasonColorPalette = CollectionsKt.listOf((Object[]) new Long[]{4292617766L, 4286331629L, 4280640491L, 4278556265L, 4292441862L, 4287837162L});
            if (!AddSeriesDialog$lambda$217($tmdbSeasons$delegate).isEmpty()) {
                Iterable AddSeriesDialog$lambda$217 = AddSeriesDialog$lambda$217($tmdbSeasons$delegate);
                int i2 = 0;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(AddSeriesDialog$lambda$217, 10));
                Iterable iterable = AddSeriesDialog$lambda$217;
                int i3 = 0;
                for (Object obj : iterable) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    TmdbSeasonInfo tmdbSeasonInfo = (TmdbSeasonInfo) obj;
                    Iterable iterable2 = AddSeriesDialog$lambda$217;
                    String str = seriesId + "_s" + tmdbSeasonInfo.getSeasonNumber();
                    long longValue = ((Number) seasonColorPalette.get(i3 % seasonColorPalette.size())).longValue();
                    int i5 = i2;
                    Iterable iterable3 = iterable;
                    List generateEpisodes = EpisodeDataGenerator.INSTANCE.generateEpisodes(str, RangesKt.coerceIn(tmdbSeasonInfo.getEpisodeCount(), 1, 150), 0);
                    int seasonNumber = tmdbSeasonInfo.getSeasonNumber();
                    String name = tmdbSeasonInfo.getName();
                    if (StringsKt.isBlank(name)) {
                        name = "Temporada " + tmdbSeasonInfo.getSeasonNumber();
                    }
                    String str2 = name;
                    int episodeCount = tmdbSeasonInfo.getEpisodeCount();
                    String posterPath = tmdbSeasonInfo.getPosterPath();
                    if (posterPath == null) {
                        posterPath = AddSeriesDialog$lambda$205($posterUrl$delegate);
                    }
                    arrayList.add(new Season(str, str2, seasonNumber, episodeCount, 0, 0, true, longValue, posterPath, generateEpisodes, 32, null));
                    i3 = i4;
                    AddSeriesDialog$lambda$217 = iterable2;
                    i2 = i5;
                    iterable = iterable3;
                }
                i = 0;
                generatedSeasons = (List) arrayList;
            } else {
                Integer intOrNull = StringsKt.toIntOrNull(AddSeriesDialog$lambda$193($seasonsCountText$delegate));
                int numSeasons = RangesKt.coerceIn(intOrNull != null ? intOrNull.intValue() : 1, 1, 20);
                Integer intOrNull2 = StringsKt.toIntOrNull(AddSeriesDialog$lambda$196($episodesPerSeasonText$delegate));
                int numEpisodes = RangesKt.coerceIn(intOrNull2 != null ? intOrNull2.intValue() : 8, 1, 50);
                Iterable intRange = new IntRange(1, numSeasons);
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
                int i6 = 0;
                Iterator<Integer> it = intRange.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    int numSeasons2 = numSeasons;
                    String str3 = seriesId + "_" + nextInt;
                    arrayList2.add(new Season(str3, "Temporada " + nextInt, nextInt, numEpisodes, 0, 0, false, ((Number) seasonColorPalette.get(i6 % seasonColorPalette.size())).longValue(), AddSeriesDialog$lambda$205($posterUrl$delegate), EpisodeDataGenerator.INSTANCE.generateEpisodes(str3, numEpisodes, 0), 96, null));
                    i6 = i7;
                    numSeasons = numSeasons2;
                    seasonColorPalette = seasonColorPalette;
                }
                i = 0;
                generatedSeasons = (List) arrayList2;
            }
            Iterator it2 = generatedSeasons.iterator();
            int totalEpisodesCount = i;
            while (it2.hasNext()) {
                totalEpisodesCount += ((Season) it2.next()).getTotalEpisodes();
            }
            String obj2 = StringsKt.trim((CharSequence) AddSeriesDialog$lambda$187($title$delegate)).toString();
            int AddSeriesDialog$lambda$214 = AddSeriesDialog$lambda$214($releaseYear$delegate);
            SeriesStatus seriesStatus = SeriesStatus.IN_PROGRESS;
            String AddSeriesDialog$lambda$190 = AddSeriesDialog$lambda$190($category$delegate);
            if (StringsKt.isBlank(AddSeriesDialog$lambda$190)) {
                AddSeriesDialog$lambda$190 = "Geral";
            }
            String str4 = AddSeriesDialog$lambda$190;
            String AddSeriesDialog$lambda$211 = AddSeriesDialog$lambda$211($synopsis$delegate);
            String AddSeriesDialog$lambda$205 = AddSeriesDialog$lambda$205($posterUrl$delegate);
            String AddSeriesDialog$lambda$208 = AddSeriesDialog$lambda$208($backdropUrl$delegate);
            String AddSeriesDialog$lambda$2052 = AddSeriesDialog$lambda$205($posterUrl$delegate);
            Series newSeries = new Series(seriesId, obj2, AddSeriesDialog$lambda$214, seriesStatus, totalEpisodesCount, 0, "T01 E01", 0L, str4, 0L, 0L, AddSeriesDialog$lambda$211, AddSeriesDialog$lambda$205, AddSeriesDialog$lambda$208, (((AddSeriesDialog$lambda$2052 == null || StringsKt.isBlank(AddSeriesDialog$lambda$2052)) ? 1 : i) == 0 || !StringsKt.isBlank(AddSeriesDialog$lambda$199($tmdbId$delegate))) ? 1 : i, !StringsKt.isBlank(AddSeriesDialog$lambda$199($tmdbId$delegate)) ? "TMDB #" + AddSeriesDialog$lambda$199($tmdbId$delegate) : "", 0, 0, generatedSeasons, StringsKt.trim((CharSequence) AddSeriesDialog$lambda$199($tmdbId$delegate)).toString(), StringsKt.trim((CharSequence) AddSeriesDialog$lambda$202($imdbId$delegate)).toString(), "", null, 4392576, null);
            $onAddSeries.invoke(newSeries);
        }
        return Unit.INSTANCE;
    }
}

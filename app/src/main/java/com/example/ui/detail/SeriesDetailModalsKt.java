package com.example.ui.detail;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material.icons.filled.TimerKt;
import androidx.compose.material.icons.filled.VpnKeyKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.example.model.Season;
import com.example.model.Series;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeriesDetailModals.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001a;\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0011\u001a=\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"ProvisionalOptionModal", "", "optionType", "Lcom/example/ui/detail/DetailOptionType;", "series", "Lcom/example/model/Series;", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "(Lcom/example/ui/detail/DetailOptionType;Lcom/example/model/Series;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SeriesMoreOptionsModal", "onMoveToTrash", "(Lcom/example/model/Series;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SeasonProvisionalModal", "season", "Lcom/example/model/Season;", "(Lcom/example/model/Season;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ModalActionRow", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "title", "", "subtitle", "isDestructive", "", "onClick", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SeriesDetailModalsKt {

    /* compiled from: SeriesDetailModals.kt */
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
    public static final Unit ModalActionRow$lambda$19(ImageVector imageVector, String str, String str2, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        ModalActionRow(imageVector, str, str2, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ProvisionalOptionModal$lambda$3(DetailOptionType detailOptionType, Series series, SheetState sheetState, Function0 function0, int i, Composer composer, int i2) {
        ProvisionalOptionModal(detailOptionType, series, sheetState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeasonProvisionalModal$lambda$15(Season season, SheetState sheetState, Function0 function0, int i, Composer composer, int i2) {
        SeasonProvisionalModal(season, sheetState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesMoreOptionsModal$lambda$10(Series series, SheetState sheetState, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        SeriesMoreOptionsModal(series, sheetState, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ProvisionalOptionModal(final DetailOptionType optionType, final Series series, final SheetState sheetState, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Quadruple quadruple;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        Intrinsics.checkNotNullParameter(series, "series");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(1426361209);
        ComposerKt.sourceInformation($composer3, "C(ProvisionalOptionModal)P(1,2,3)87@3713L2491,81@3514L2690:SeriesDetailModals.kt#gbrlqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(optionType.ordinal()) ? 4 : 2;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(sheetState) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 1155) == 1154 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1426361209, $dirty2, -1, "com.example.ui.detail.ProvisionalOptionModal (SeriesDetailModals.kt:59)");
            }
            switch (WhenMappings.$EnumSwitchMapping$0[optionType.ordinal()]) {
                case 1:
                    quadruple = new Quadruple("Status da série", "O menu de gerenciamento de status será desenvolvido futuramente. Aqui você poderá alternar entre Em andamento, Finalizada, Em pausa e Incompleta.", BookmarkKt.getBookmark(Icons.INSTANCE.getDefault()), Color.m4149boximpl(ColorKt.Color(4281652121L)));
                    break;
                case 2:
                    quadruple = new Quadruple("Identificadores", "O menu de identificadores externos será desenvolvido futuramente. Aqui você poderá consultar e sincronizar os IDs do TMDB, IMDb e TheTVDB.", VpnKeyKt.getVpnKey(Icons.INSTANCE.getDefault()), Color.m4149boximpl(ColorKt.Color(4284524026L)));
                    break;
                case 3:
                    quadruple = new Quadruple("Minutagem fixa", "O menu de minutagem fixa será desenvolvido futuramente. Aqui você poderá definir durações padrão para abertura, encerramento e intervalos comerciais.", TimerKt.getTimer(Icons.INSTANCE.getDefault()), Color.m4149boximpl(ColorKt.Color(4289170426L)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            final String title = (String) quadruple.component1();
            final String description = (String) quadruple.component2();
            final ImageVector icon = (ImageVector) quadruple.component3();
            final long color = ((Color) quadruple.component4()).m4169unboximpl();
            $composer2 = $composer3;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(onDismiss, null, sheetState, 0.0f, null, ColorKt.Color(4279179050L), com.example.ui.theme.ColorKt.getTextWhite(), 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(1995059926, true, new Function3() { // from class: com.example.ui.detail.SeriesDetailModalsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SeriesDetailModalsKt.ProvisionalOptionModal$lambda$2(color, title, description, onDismiss, icon, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty2 >> 9) & 14) | 807075840 | ($dirty2 & 896), 384, 3482);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.detail.SeriesDetailModalsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SeriesDetailModalsKt.ProvisionalOptionModal$lambda$3(DetailOptionType.this, series, sheetState, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ProvisionalOptionModal$lambda$2(long r91, java.lang.String r93, java.lang.String r94, kotlin.jvm.functions.Function0 r95, androidx.compose.ui.graphics.vector.ImageVector r96, androidx.compose.foundation.layout.ColumnScope r97, androidx.compose.runtime.Composer r98, int r99) {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeriesDetailModalsKt.ProvisionalOptionModal$lambda$2(long, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void SeriesMoreOptionsModal(final Series series, final SheetState sheetState, final Function0<Unit> onDismiss, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Function0 function02;
        final Function0 onMoveToTrash;
        Composer $composer2;
        final Function0 onMoveToTrash2;
        Object obj;
        Intrinsics.checkNotNullParameter(series, "series");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(208551856);
        ComposerKt.sourceInformation($composer3, "C(SeriesMoreOptionsModal)P(2,3)172@6395L2,180@6605L2321,174@6406L2520:SeriesDetailModals.kt#gbrlqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(series) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(sheetState) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            function02 = function0;
        } else if (($changed & 3072) == 0) {
            function02 = function0;
            $dirty |= $composer3.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if (($dirty & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
            onMoveToTrash2 = function02;
        } else {
            if (i2 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -1445123310, "CC(remember):SeriesDetailModals.kt#9igjgp");
                Object rememberedValue = $composer3.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function0() { // from class: com.example.ui.detail.SeriesDetailModalsKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                onMoveToTrash = (Function0) obj;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onMoveToTrash = function02;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(208551856, $dirty, -1, "com.example.ui.detail.SeriesMoreOptionsModal (SeriesDetailModals.kt:173)");
            }
            $composer2 = $composer3;
            Function0 onMoveToTrash3 = onMoveToTrash;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(onDismiss, null, sheetState, 0.0f, null, ColorKt.Color(4279179050L), com.example.ui.theme.ColorKt.getTextWhite(), 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(41645811, true, new Function3() { // from class: com.example.ui.detail.SeriesDetailModalsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return SeriesDetailModalsKt.SeriesMoreOptionsModal$lambda$9(Series.this, onDismiss, onMoveToTrash, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty >> 6) & 14) | 807075840 | (($dirty << 3) & 896), 384, 3482);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onMoveToTrash2 = onMoveToTrash3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.detail.SeriesDetailModalsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SeriesDetailModalsKt.SeriesMoreOptionsModal$lambda$10(Series.this, sheetState, onDismiss, onMoveToTrash2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x035f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SeriesMoreOptionsModal$lambda$9(com.example.model.Series r89, final kotlin.jvm.functions.Function0 r90, final kotlin.jvm.functions.Function0 r91, androidx.compose.foundation.layout.ColumnScope r92, androidx.compose.runtime.Composer r93, int r94) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeriesDetailModalsKt.SeriesMoreOptionsModal$lambda$9(com.example.model.Series, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SeriesMoreOptionsModal$lambda$9$lambda$8$lambda$7$lambda$6(Function0 $onDismiss, Function0 $onMoveToTrash) {
        $onDismiss.invoke();
        $onMoveToTrash.invoke();
        return Unit.INSTANCE;
    }

    public static final void SeasonProvisionalModal(final Season season, final SheetState sheetState, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(season, "season");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(-2135874547);
        ComposerKt.sourceInformation($composer3, "C(SeasonProvisionalModal)P(1,2)267@9291L3579,261@9092L3778:SeriesDetailModals.kt#gbrlqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(season) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(sheetState) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        if (($dirty & 147) == 146 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2135874547, $dirty, -1, "com.example.ui.detail.SeasonProvisionalModal (SeriesDetailModals.kt:260)");
            }
            int $dirty2 = $dirty;
            $composer2 = $composer3;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(onDismiss, null, sheetState, 0.0f, null, ColorKt.Color(4279179050L), com.example.ui.theme.ColorKt.getTextWhite(), 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(1335558928, true, new Function3() { // from class: com.example.ui.detail.SeriesDetailModalsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SeriesDetailModalsKt.SeasonProvisionalModal$lambda$14(Season.this, onDismiss, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty2 >> 6) & 14) | 807075840 | (($dirty2 << 3) & 896), 384, 3482);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.detail.SeriesDetailModalsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SeriesDetailModalsKt.SeasonProvisionalModal$lambda$15(Season.this, sheetState, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit SeasonProvisionalModal$lambda$14(com.example.model.Season r91, kotlin.jvm.functions.Function0 r92, androidx.compose.foundation.layout.ColumnScope r93, androidx.compose.runtime.Composer r94, int r95) {
        /*
            Method dump skipped, instructions count: 1841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeriesDetailModalsKt.SeasonProvisionalModal$lambda$14(com.example.model.Season, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x045a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ModalActionRow(final androidx.compose.ui.graphics.vector.ImageVector r105, final java.lang.String r106, final java.lang.String r107, boolean r108, final kotlin.jvm.functions.Function0<kotlin.Unit> r109, androidx.compose.runtime.Composer r110, final int r111, final int r112) {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.SeriesDetailModalsKt.ModalActionRow(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}

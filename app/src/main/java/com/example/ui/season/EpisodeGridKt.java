package com.example.ui.season;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.example.model.Episode;
import com.example.model.EpisodeStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EpisodeGrid.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"EpisodeGrid", "", "episodes", "", "Lcom/example/model/Episode;", "gridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "nextEpisodeNumber", "", "onEpisodeClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Ljava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridState;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EpisodeGridKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeGrid$lambda$7(List list, LazyGridState lazyGridState, Integer num, Function1 function1, Modifier modifier, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        EpisodeGrid(list, lazyGridState, num, function1, modifier, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EpisodeGrid(final java.util.List<com.example.model.Episode> r109, final androidx.compose.foundation.lazy.grid.LazyGridState r110, final java.lang.Integer r111, final kotlin.jvm.functions.Function1<? super com.example.model.Episode, kotlin.Unit> r112, androidx.compose.ui.Modifier r113, androidx.compose.foundation.layout.PaddingValues r114, androidx.compose.runtime.Composer r115, final int r116, final int r117) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.EpisodeGridKt.EpisodeGrid(java.util.List, androidx.compose.foundation.lazy.grid.LazyGridState, java.lang.Integer, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeGrid$lambda$6$lambda$5(final List $episodes, final Integer $nextEpisodeNumber, final Function1 $onEpisodeClick, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final Function1 function1 = new Function1() { // from class: com.example.ui.season.EpisodeGridKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EpisodeGridKt.EpisodeGrid$lambda$6$lambda$5$lambda$2((Episode) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.ui.season.EpisodeGridKt$EpisodeGrid$lambda$6$lambda$5$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Episode) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Episode episode) {
                return null;
            }
        };
        LazyVerticalGrid.items($episodes.size(), new Function1<Integer, Object>() { // from class: com.example.ui.season.EpisodeGridKt$EpisodeGrid$lambda$6$lambda$5$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($episodes.get(index));
            }
        }, null, new Function1<Integer, Object>() { // from class: com.example.ui.season.EpisodeGridKt$EpisodeGrid$lambda$6$lambda$5$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke($episodes.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.season.EpisodeGridKt$EpisodeGrid$lambda$6$lambda$5$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope $this$items, int it, Composer $composer, int $changed) {
                Object obj;
                ComposerKt.sourceInformation($composer, "C464@19670L22:LazyGridDsl.kt#7791vq");
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
                    ComposerKt.traceEventStart(699646206, $dirty, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                }
                int i = $dirty & 14;
                final Episode episode = (Episode) $episodes.get(it);
                $composer.startReplaceGroup(-1935711577);
                ComposerKt.sourceInformation($composer, "C*84@3366L27,81@3159L252:EpisodeGrid.kt#98f12s");
                int episodeNumber = episode.getEpisodeNumber();
                Integer num = $nextEpisodeNumber;
                boolean z = true;
                boolean z2 = (num == null || episodeNumber != num.intValue() || episode.getStatus() == EpisodeStatus.COMPLETED) ? false : true;
                ComposerKt.sourceInformationMarkerStart($composer, 1045942747, "CC(remember):EpisodeGrid.kt#9igjgp");
                boolean changed = $composer.changed($onEpisodeClick);
                if ((((i & 112) ^ 48) <= 32 || !$composer.changed(episode)) && (i & 48) != 32) {
                    z = false;
                }
                boolean z3 = changed | z;
                Object rememberedValue = $composer.rememberedValue();
                if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = $onEpisodeClick;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.season.EpisodeGridKt$EpisodeGrid$2$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function13.invoke(episode);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                EpisodeCardKt.EpisodeCard(episode, z2, (Function0) obj, null, $composer, (i >> 3) & 14, 8);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object EpisodeGrid$lambda$6$lambda$5$lambda$2(Episode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }
}

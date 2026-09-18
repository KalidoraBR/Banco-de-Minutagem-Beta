package com.example.ui.tools;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.example.data.DeletedSeriesItem;
import com.example.data.TrashStorage;
import com.example.model.Series;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LixeiraScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a;\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012X\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002"}, d2 = {"LixeiraScreen", "", "onRestoreSeries", "Lkotlin/Function1;", "Lcom/example/model/Series;", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TrashItemCard", "item", "Lcom/example/data/DeletedSeriesItem;", "onRestore", "onDeletePermanentRequest", "(Lcom/example/data/DeletedSeriesItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "deletedList", "", "itemPendingPermanentDeletion"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LixeiraScreenKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LixeiraScreen$lambda$30(Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LixeiraScreen(function1, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TrashItemCard$lambda$37(DeletedSeriesItem deletedSeriesItem, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TrashItemCard(deletedSeriesItem, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x092d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LixeiraScreen(final kotlin.jvm.functions.Function1<? super com.example.model.Series, kotlin.Unit> r145, final kotlin.jvm.functions.Function0<kotlin.Unit> r146, androidx.compose.ui.Modifier r147, androidx.compose.runtime.Composer r148, final int r149, final int r150) {
        /*
            Method dump skipped, instructions count: 3148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.LixeiraScreenKt.LixeiraScreen(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List<DeletedSeriesItem> LixeiraScreen$lambda$1(MutableState<List<DeletedSeriesItem>> mutableState) {
        return mutableState.getValue();
    }

    private static final DeletedSeriesItem LixeiraScreen$lambda$4(MutableState<DeletedSeriesItem> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LixeiraScreen$lambda$17$lambda$16$lambda$15(final MutableState $deletedList$delegate, final Function1 $onRestoreSeries, final Context $context, final MutableState $itemPendingPermanentDeletion$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$LixeiraScreenKt.INSTANCE.getLambda$1871487040$app(), 3, null);
        final List LixeiraScreen$lambda$1 = LixeiraScreen$lambda$1($deletedList$delegate);
        final Function1 function1 = new Function1() { // from class: com.example.ui.tools.LixeiraScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LixeiraScreenKt.LixeiraScreen$lambda$17$lambda$16$lambda$15$lambda$11((DeletedSeriesItem) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.ui.tools.LixeiraScreenKt$LixeiraScreen$lambda$17$lambda$16$lambda$15$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((DeletedSeriesItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(DeletedSeriesItem deletedSeriesItem) {
                return null;
            }
        };
        LazyColumn.items(LixeiraScreen$lambda$1.size(), new Function1<Integer, Object>() { // from class: com.example.ui.tools.LixeiraScreenKt$LixeiraScreen$lambda$17$lambda$16$lambda$15$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke(LixeiraScreen$lambda$1.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.tools.LixeiraScreenKt$LixeiraScreen$lambda$17$lambda$16$lambda$15$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke(LixeiraScreen$lambda$1.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.tools.LixeiraScreenKt$LixeiraScreen$lambda$17$lambda$16$lambda$15$$inlined$items$default$4
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
                Object obj;
                Object obj2;
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
                final DeletedSeriesItem deletedSeriesItem = (DeletedSeriesItem) LixeiraScreen$lambda$1.get(it);
                $composer.startReplaceGroup(1619451634);
                ComposerKt.sourceInformation($composer, "C*211@8558L464,219@9075L91,209@8470L718:LixeiraScreen.kt#75g7xq");
                ComposerKt.sourceInformationMarkerStart($composer, 1991905587, "CC(remember):LixeiraScreen.kt#9igjgp");
                boolean changedInstance = $composer.changedInstance(deletedSeriesItem) | $composer.changed($onRestoreSeries) | $composer.changedInstance($context);
                Object rememberedValue = $composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = $onRestoreSeries;
                    final Context context = $context;
                    final MutableState mutableState = $deletedList$delegate;
                    obj = (Function0) new Function0<Unit>() { // from class: com.example.ui.tools.LixeiraScreenKt$LixeiraScreen$1$3$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Series restored = TrashStorage.INSTANCE.restoreSeries(DeletedSeriesItem.this.getSeries().getId());
                            if (restored != null) {
                                function13.invoke(restored);
                                mutableState.setValue(TrashStorage.INSTANCE.getDeletedSeries());
                                Toast.makeText(context, "'" + DeletedSeriesItem.this.getSeries().getTitle() + "' restaurada com sucesso!", 0).show();
                            }
                        }
                    };
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                Function0 function0 = (Function0) obj;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 1991921758, "CC(remember):LixeiraScreen.kt#9igjgp");
                boolean changedInstance2 = $composer.changedInstance(deletedSeriesItem);
                Object rememberedValue2 = $composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState2 = $itemPendingPermanentDeletion$delegate;
                    obj2 = (Function0) new Function0<Unit>() { // from class: com.example.ui.tools.LixeiraScreenKt$LixeiraScreen$1$3$1$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState2.setValue(DeletedSeriesItem.this);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                LixeiraScreenKt.TrashItemCard(deletedSeriesItem, function0, (Function0) obj2, null, $composer, (i >> 3) & 14, 8);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$LixeiraScreenKt.INSTANCE.getLambda$1407445225$app(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object LixeiraScreen$lambda$17$lambda$16$lambda$15$lambda$11(DeletedSeriesItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSeries().getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LixeiraScreen$lambda$29$lambda$19$lambda$18(MutableState $itemPendingPermanentDeletion$delegate) {
        $itemPendingPermanentDeletion$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit LixeiraScreen$lambda$29$lambda$28(final com.example.data.DeletedSeriesItem r124, final android.content.Context r125, final androidx.compose.runtime.MutableState r126, final androidx.compose.runtime.MutableState r127, androidx.compose.runtime.Composer r128, int r129) {
        /*
            Method dump skipped, instructions count: 2105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.LixeiraScreenKt.LixeiraScreen$lambda$29$lambda$28(com.example.data.DeletedSeriesItem, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LixeiraScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$22$lambda$21(MutableState $itemPendingPermanentDeletion$delegate) {
        $itemPendingPermanentDeletion$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit LixeiraScreen$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24$lambda$23(DeletedSeriesItem $item, Context $context, MutableState $deletedList$delegate, MutableState $itemPendingPermanentDeletion$delegate) {
        TrashStorage.INSTANCE.deletePermanently($item.getSeries().getId());
        $deletedList$delegate.setValue(TrashStorage.INSTANCE.getDeletedSeries());
        $itemPendingPermanentDeletion$delegate.setValue(null);
        Toast.makeText($context, "Série excluída permanentemente.", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0815 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0536 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0409 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x099f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TrashItemCard(final com.example.data.DeletedSeriesItem r163, final kotlin.jvm.functions.Function0<kotlin.Unit> r164, final kotlin.jvm.functions.Function0<kotlin.Unit> r165, androidx.compose.ui.Modifier r166, androidx.compose.runtime.Composer r167, final int r168, final int r169) {
        /*
            Method dump skipped, instructions count: 3076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.LixeiraScreenKt.TrashItemCard(com.example.data.DeletedSeriesItem, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

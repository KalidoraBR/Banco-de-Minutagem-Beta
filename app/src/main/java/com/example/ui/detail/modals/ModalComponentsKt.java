package com.example.ui.detail.modals;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ModalComponents.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001ac\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0015\u001aI\u0010\u0016\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"ModalHeader", "", "title", "", "description", "onClose", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "titleTestTag", "closeTestTag", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ModalBottomButtons", "saveText", "onCancel", "onSave", "cancelText", "isSaveEnabled", "", "cancelTestTag", "saveTestTag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "DiscreetConfirmationPill", "message", "testTag", "actionLabel", "onAction", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ModalComponentsKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DiscreetConfirmationPill$lambda$14(String str, Modifier modifier, String str2, String str3, Function0 function0, int i, int i2, Composer composer, int i3) {
        DiscreetConfirmationPill(str, modifier, str2, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ModalBottomButtons$lambda$6(String str, Function0 function0, Function0 function02, Modifier modifier, String str2, boolean z, String str3, String str4, int i, int i2, Composer composer, int i3) {
        ModalBottomButtons(str, function0, function02, modifier, str2, z, str3, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ModalHeader$lambda$2(String str, String str2, Function0 function0, Modifier modifier, String str3, String str4, int i, int i2, Composer composer, int i3) {
        ModalHeader(str, str2, function0, modifier, str3, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ModalHeader(final java.lang.String r118, final java.lang.String r119, final kotlin.jvm.functions.Function0<kotlin.Unit> r120, androidx.compose.ui.Modifier r121, java.lang.String r122, java.lang.String r123, androidx.compose.runtime.Composer r124, final int r125, final int r126) {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.ModalComponentsKt.ModalHeader(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ModalBottomButtons(final java.lang.String r51, final kotlin.jvm.functions.Function0<kotlin.Unit> r52, final kotlin.jvm.functions.Function0<kotlin.Unit> r53, androidx.compose.ui.Modifier r54, java.lang.String r55, boolean r56, java.lang.String r57, java.lang.String r58, androidx.compose.runtime.Composer r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.ModalComponentsKt.ModalBottomButtons(java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, boolean, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ModalBottomButtons$lambda$5$lambda$3(String $cancelText, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C147@5135L180:ModalComponents.kt#99r5nq");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1656642247, $changed, -1, "com.example.ui.detail.modals.ModalBottomButtons.<anonymous>.<anonymous> (ModalComponents.kt:147)");
            }
            FontWeight medium = FontWeight.INSTANCE.getMedium();
            TextKt.m2693Text4IGK_g($cancelText, (Modifier) null, ColorKt.Color(4291548641L), TextUnitKt.getSp(13.5d), (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit ModalBottomButtons$lambda$5$lambda$4(String $saveText, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C170@5908L137:ModalComponents.kt#99r5nq");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1096296503, $changed, -1, "com.example.ui.detail.modals.ModalBottomButtons.<anonymous>.<anonymous> (ModalComponents.kt:170)");
            }
            TextKt.m2693Text4IGK_g($saveText, (Modifier) null, 0L, TextUnitKt.getSp(13.5d), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void DiscreetConfirmationPill(final String message, Modifier modifier, String testTag, String actionLabel, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        String str;
        String actionLabel2;
        Function0 function02;
        Modifier.Companion modifier3;
        final String testTag2;
        final String actionLabel3;
        final Function0 onAction;
        Object obj;
        Object obj2;
        Composer $composer2;
        final Function0 onAction2;
        Composer $composer3 = $composer.startRestartGroup(-2003280068);
        ComposerKt.sourceInformation($composer3, "C(DiscreetConfirmationPill)P(1,2,4)193@6545L10,194@6603L10,196@6649L2461,191@6436L2674:ModalComponents.kt#99r5nq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(message) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            str = testTag;
        } else if (($changed & 384) == 0) {
            str = testTag;
            $dirty |= $composer3.changed(str) ? 256 : 128;
        } else {
            str = testTag;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            actionLabel2 = actionLabel;
        } else if (($changed & 3072) == 0) {
            actionLabel2 = actionLabel;
            $dirty |= $composer3.changed(actionLabel2) ? 2048 : 1024;
        } else {
            actionLabel2 = actionLabel;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty |= 24576;
            function02 = function0;
        } else if (($changed & 24576) == 0) {
            function02 = function0;
            $dirty |= $composer3.changedInstance(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        if (($dirty & 9363) == 9362 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            modifier3 = modifier2;
            testTag2 = str;
            onAction2 = function02;
            $composer2 = $composer3;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i3 == 0) {
                testTag2 = str;
            } else {
                testTag2 = "discreet_confirmation_pill";
            }
            if (i4 == 0) {
                actionLabel3 = actionLabel2;
            } else {
                actionLabel3 = null;
            }
            if (i5 == 0) {
                onAction = function02;
            } else {
                onAction = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2003280068, $dirty, -1, "com.example.ui.detail.modals.DiscreetConfirmationPill (ModalComponents.kt:190)");
            }
            String str2 = message;
            boolean z = !(str2 == null || StringsKt.isBlank(str2));
            EnterTransition fadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -1006785978, "CC(remember):ModalComponents.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function1() { // from class: com.example.ui.detail.modals.ModalComponentsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return Integer.valueOf(ModalComponentsKt.DiscreetConfirmationPill$lambda$8$lambda$7(((Integer) obj3).intValue()));
                    }
                };
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EnterTransition plus = fadeIn$default.plus(EnterExitTransitionKt.slideInVertically$default(null, (Function1) obj, 1, null));
            ExitTransition fadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -1006784122, "CC(remember):ModalComponents.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function1() { // from class: com.example.ui.detail.modals.ModalComponentsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return Integer.valueOf(ModalComponentsKt.DiscreetConfirmationPill$lambda$10$lambda$9(((Integer) obj3).intValue()));
                    }
                };
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Function0 onAction3 = onAction;
            AnimatedVisibilityKt.AnimatedVisibility(z, modifier3, plus, fadeOut$default.plus(EnterExitTransitionKt.slideOutVertically$default(null, (Function1) obj2, 1, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1270863204, true, new Function3() { // from class: com.example.ui.detail.modals.ModalComponentsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return ModalComponentsKt.DiscreetConfirmationPill$lambda$13(message, testTag2, actionLabel3, onAction, (AnimatedVisibilityScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer3, 54), $composer3, ($dirty & 112) | 200064, 16);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            actionLabel2 = actionLabel3;
            onAction2 = onAction3;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final String actionLabel4 = actionLabel2;
            final Modifier modifier4 = modifier3;
            final String testTag3 = testTag2;
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.detail.modals.ModalComponentsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ModalComponentsKt.DiscreetConfirmationPill$lambda$14(message, modifier4, testTag3, actionLabel4, onAction2, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int DiscreetConfirmationPill$lambda$8$lambda$7(int it) {
        return it / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int DiscreetConfirmationPill$lambda$10$lambda$9(int it) {
        return it / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit DiscreetConfirmationPill$lambda$13(java.lang.String r108, java.lang.String r109, java.lang.String r110, kotlin.jvm.functions.Function0 r111, androidx.compose.animation.AnimatedVisibilityScope r112, androidx.compose.runtime.Composer r113, int r114) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.ModalComponentsKt.DiscreetConfirmationPill$lambda$13(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}

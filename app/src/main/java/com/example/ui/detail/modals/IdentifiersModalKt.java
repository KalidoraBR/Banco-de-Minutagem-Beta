package com.example.ui.detail.modals;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.example.model.Series;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IdentifiersModal.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b\u001aw\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002"}, d2 = {"IdentifiersModal", "", "series", "Lcom/example/model/Series;", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "onSaveIdentifiers", "Lkotlin/Function1;", "Lcom/example/ui/detail/modals/UpdatedIdentifiers;", "(Lcom/example/model/Series;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "IdentifierInputField", "label", "", "placeholder", "value", "onValueChange", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "modifier", "Landroidx/compose/ui/Modifier;", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "errorMessage", "testTag", "errorTag", "IdentifierInputField-2BfJ-Fs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/ui/Modifier;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app", "tmdbInput", "imdbInput", "tvdbInput", "tmdbError", "imdbError", "tvdbError"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IdentifiersModalKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit IdentifierInputField_2BfJ_Fs$lambda$39(String str, String str2, String str3, Function1 function1, int i, Modifier modifier, int i2, String str4, String str5, String str6, int i3, int i4, Composer composer, int i5) {
        m7002IdentifierInputField2BfJFs(str, str2, str3, function1, i, modifier, i2, str4, str5, str6, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit IdentifiersModal$lambda$35(Series series, SheetState sheetState, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        IdentifiersModal(series, sheetState, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IdentifiersModal(final Series series, final SheetState sheetState, final Function0<Unit> onDismiss, final Function1<? super UpdatedIdentifiers, Unit> onSaveIdentifiers, Composer $composer, final int $changed) {
        Object obj;
        MutableState tmdbInput$delegate;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        long m4157copywmQWz5c;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(series, "series");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSaveIdentifiers, "onSaveIdentifiers");
        Composer $composer3 = $composer.startRestartGroup(1460814732);
        ComposerKt.sourceInformation($composer3, "C(IdentifiersModal)P(2,3)74@3013L89,75@3124L94,76@3240L90,79@3373L42,80@3437L42,81@3501L42,83@3586L7,84@3616L21,127@5082L5853,120@4829L6106:IdentifiersModal.kt#99r5nq");
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
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onSaveIdentifiers) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1460814732, $dirty2, -1, "com.example.ui.detail.modals.IdentifiersModal (IdentifiersModal.kt:72)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -611339675, "CC(remember):IdentifiersModal.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                String tmdbId = series.getTmdbId();
                if (StringsKt.isBlank(tmdbId)) {
                    tmdbId = series.getHasTmdb() ? "2328" : "";
                }
                obj = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(tmdbId, null, 2, null);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            MutableState tmdbInput$delegate2 = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -611336118, "CC(remember):IdentifiersModal.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                String imdbId = series.getImdbId();
                if (StringsKt.isBlank(imdbId)) {
                    imdbId = series.getHasTmdb() ? "tt0106093" : "";
                }
                tmdbInput$delegate = tmdbInput$delegate2;
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(imdbId, null, 2, null);
                $composer3.updateRememberedValue(obj2);
            } else {
                tmdbInput$delegate = tmdbInput$delegate2;
                obj2 = rememberedValue2;
            }
            final MutableState imdbInput$delegate = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -611332410, "CC(remember):IdentifiersModal.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                String tvdbId = series.getTvdbId();
                if (StringsKt.isBlank(tvdbId)) {
                    tvdbId = series.getHasTmdb() ? "76107" : "";
                }
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(tvdbId, null, 2, null);
                $composer3.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            final MutableState tvdbInput$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -611328202, "CC(remember):IdentifiersModal.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState tmdbError$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -611326154, "CC(remember):IdentifiersModal.kt#9igjgp");
            Object rememberedValue5 = $composer3.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState imdbError$delegate = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -611324106, "CC(remember):IdentifiersModal.kt#9igjgp");
            Object rememberedValue6 = $composer3.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableState tvdbError$delegate = (MutableState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final FocusManager focusManager = (FocusManager) consume;
            final ScrollState scrollState = ScrollKt.rememberScrollState(0, $composer3, 0, 1);
            long Color = ColorKt.Color(4279179050L);
            long textWhite = com.example.ui.theme.ColorKt.getTextWhite();
            m4157copywmQWz5c = Color.m4157copywmQWz5c(r21, (r12 & 1) != 0 ? Color.m4161getAlphaimpl(r21) : 0.65f, (r12 & 2) != 0 ? Color.m4165getRedimpl(r21) : 0.0f, (r12 & 4) != 0 ? Color.m4164getGreenimpl(r21) : 0.0f, (r12 & 8) != 0 ? Color.m4162getBlueimpl(Color.INSTANCE.m4185getBlack0d7_KjU()) : 0.0f);
            final MutableState tmdbInput$delegate3 = tmdbInput$delegate;
            $composer2 = $composer3;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(onDismiss, null, sheetState, 0.0f, null, Color, textWhite, 0.0f, m4157copywmQWz5c, null, null, null, ComposableLambdaKt.rememberComposableLambda(347052009, true, new Function3() { // from class: com.example.ui.detail.modals.IdentifiersModalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                    return IdentifiersModalKt.IdentifiersModal$lambda$34(ScrollState.this, onDismiss, focusManager, onSaveIdentifiers, tmdbInput$delegate3, tmdbError$delegate, imdbInput$delegate, imdbError$delegate, tvdbInput$delegate, tvdbError$delegate, (ColumnScope) obj7, (Composer) obj8, ((Integer) obj9).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty2 >> 6) & 14) | 907739136 | (($dirty2 << 3) & 896), 384, 3226);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.detail.modals.IdentifiersModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return IdentifiersModalKt.IdentifiersModal$lambda$35(Series.this, sheetState, onDismiss, onSaveIdentifiers, $changed, (Composer) obj7, ((Integer) obj8).intValue());
                }
            });
        }
    }

    private static final String IdentifiersModal$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String IdentifiersModal$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String IdentifiersModal$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String IdentifiersModal$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String IdentifiersModal$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String IdentifiersModal$lambda$19(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean IdentifiersModal$validate(androidx.compose.runtime.MutableState<java.lang.String> r18, androidx.compose.runtime.MutableState<java.lang.String> r19, androidx.compose.runtime.MutableState<java.lang.String> r20, androidx.compose.runtime.MutableState<java.lang.String> r21, androidx.compose.runtime.MutableState<java.lang.String> r22, androidx.compose.runtime.MutableState<java.lang.String> r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r23
            r3 = 1
            java.lang.String r4 = IdentifiersModal$lambda$2(r18)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim(r4)
            java.lang.String r4 = r4.toString()
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.isBlank(r5)
            r6 = 0
            r7 = 1
            r8 = 0
            if (r5 != 0) goto L47
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r9 = 0
            r10 = r8
        L26:
            int r11 = r5.length()
            if (r10 >= r11) goto L3d
            char r11 = r5.charAt(r10)
            r12 = r11
            r13 = 0
            boolean r14 = java.lang.Character.isDigit(r12)
            if (r14 != 0) goto L3a
            r5 = r8
            goto L3e
        L3a:
            int r10 = r10 + 1
            goto L26
        L3d:
            r5 = r7
        L3e:
            if (r5 != 0) goto L47
            java.lang.String r5 = "O TMDB ID deve conter apenas números válidos (ex: 2328)."
            IdentifiersModal$lambda$14(r0, r5)
            r3 = 0
            goto L4a
        L47:
            IdentifiersModal$lambda$14(r0, r6)
        L4a:
            java.lang.String r5 = IdentifiersModal$lambda$6(r20)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)
            java.lang.String r5 = r5.toString()
            kotlin.text.Regex r9 = new kotlin.text.Regex
            java.lang.String r10 = "^tt\\d{5,10}$"
            kotlin.text.RegexOption r11 = kotlin.text.RegexOption.IGNORE_CASE
            r9.<init>(r10, r11)
            r10 = r5
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = kotlin.text.StringsKt.isBlank(r10)
            if (r10 != 0) goto L7a
            r10 = r5
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = r9.matches(r10)
            if (r10 != 0) goto L7a
            java.lang.String r10 = "Formato inválido. Use o prefixo 'tt' seguido de dígitos (ex: tt0106093)."
            IdentifiersModal$lambda$17(r1, r10)
            r3 = 0
            goto L7d
        L7a:
            IdentifiersModal$lambda$17(r1, r6)
        L7d:
            java.lang.String r10 = IdentifiersModal$lambda$10(r22)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.CharSequence r10 = kotlin.text.StringsKt.trim(r10)
            java.lang.String r10 = r10.toString()
            r11 = r10
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = kotlin.text.StringsKt.isBlank(r11)
            if (r11 != 0) goto Lbb
            r11 = r10
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r12 = 0
            r13 = r8
        L99:
            int r14 = r11.length()
            if (r13 >= r14) goto Lb1
            char r14 = r11.charAt(r13)
            r15 = r14
            r16 = 0
            boolean r17 = java.lang.Character.isDigit(r15)
            if (r17 != 0) goto Lae
            r7 = r8
            goto Lb2
        Lae:
            int r13 = r13 + 1
            goto L99
        Lb1:
        Lb2:
            if (r7 != 0) goto Lbb
            java.lang.String r6 = "O TVDB ID deve conter apenas números válidos (ex: 76107)."
            IdentifiersModal$lambda$20(r2, r6)
            r3 = 0
            goto Lbe
        Lbb:
            IdentifiersModal$lambda$20(r2, r6)
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.IdentifiersModalKt.IdentifiersModal$validate(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit IdentifiersModal$lambda$34(androidx.compose.foundation.ScrollState r127, kotlin.jvm.functions.Function0 r128, final androidx.compose.ui.focus.FocusManager r129, final kotlin.jvm.functions.Function1 r130, final androidx.compose.runtime.MutableState r131, final androidx.compose.runtime.MutableState r132, final androidx.compose.runtime.MutableState r133, final androidx.compose.runtime.MutableState r134, final androidx.compose.runtime.MutableState r135, final androidx.compose.runtime.MutableState r136, androidx.compose.foundation.layout.ColumnScope r137, androidx.compose.runtime.Composer r138, int r139) {
        /*
            Method dump skipped, instructions count: 1969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.IdentifiersModalKt.IdentifiersModal$lambda$34(androidx.compose.foundation.ScrollState, kotlin.jvm.functions.Function0, androidx.compose.ui.focus.FocusManager, kotlin.jvm.functions.Function1, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit IdentifiersModal$lambda$34$lambda$33$lambda$24$lambda$23(MutableState $tmdbInput$delegate, MutableState $tmdbError$delegate, MutableState $imdbInput$delegate, MutableState $imdbError$delegate, MutableState $tvdbInput$delegate, MutableState $tvdbError$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $tmdbInput$delegate.setValue(it);
        if (IdentifiersModal$lambda$13($tmdbError$delegate) != null) {
            IdentifiersModal$validate($tmdbInput$delegate, $tmdbError$delegate, $imdbInput$delegate, $imdbError$delegate, $tvdbInput$delegate, $tvdbError$delegate);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit IdentifiersModal$lambda$34$lambda$33$lambda$26$lambda$25(MutableState $imdbInput$delegate, MutableState $imdbError$delegate, MutableState $tmdbInput$delegate, MutableState $tmdbError$delegate, MutableState $tvdbInput$delegate, MutableState $tvdbError$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $imdbInput$delegate.setValue(it);
        if (IdentifiersModal$lambda$16($imdbError$delegate) != null) {
            IdentifiersModal$validate($tmdbInput$delegate, $tmdbError$delegate, $imdbInput$delegate, $imdbError$delegate, $tvdbInput$delegate, $tvdbError$delegate);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit IdentifiersModal$lambda$34$lambda$33$lambda$28$lambda$27(MutableState $tvdbInput$delegate, MutableState $tvdbError$delegate, MutableState $tmdbInput$delegate, MutableState $tmdbError$delegate, MutableState $imdbInput$delegate, MutableState $imdbError$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $tvdbInput$delegate.setValue(it);
        if (IdentifiersModal$lambda$19($tvdbError$delegate) != null) {
            IdentifiersModal$validate($tmdbInput$delegate, $tmdbError$delegate, $imdbInput$delegate, $imdbError$delegate, $tvdbInput$delegate, $tvdbError$delegate);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit IdentifiersModal$lambda$34$lambda$33$lambda$32$lambda$31(FocusManager $focusManager, Function1 $onSaveIdentifiers, MutableState $tmdbInput$delegate, MutableState $tmdbError$delegate, MutableState $imdbInput$delegate, MutableState $imdbError$delegate, MutableState $tvdbInput$delegate, MutableState $tvdbError$delegate) {
        String newSummary;
        FocusManager.clearFocus$default($focusManager, false, 1, null);
        if (IdentifiersModal$validate($tmdbInput$delegate, $tmdbError$delegate, $imdbInput$delegate, $imdbError$delegate, $tvdbInput$delegate, $tvdbError$delegate)) {
            String cleanTmdb = StringsKt.trim((CharSequence) IdentifiersModal$lambda$2($tmdbInput$delegate)).toString();
            String cleanImdb = StringsKt.trim((CharSequence) IdentifiersModal$lambda$6($imdbInput$delegate)).toString();
            String cleanTvdb = StringsKt.trim((CharSequence) IdentifiersModal$lambda$10($tvdbInput$delegate)).toString();
            List summaryList = new ArrayList();
            if (!StringsKt.isBlank(cleanTmdb)) {
                summaryList.add("TMDB");
            }
            if (!StringsKt.isBlank(cleanImdb)) {
                summaryList.add("IMDb");
            }
            if (!StringsKt.isBlank(cleanTvdb)) {
                summaryList.add("TVDB");
            }
            if (!summaryList.isEmpty()) {
                newSummary = CollectionsKt.joinToString$default(summaryList, " · ", null, null, 0, null, null, 62, null);
            } else {
                newSummary = "Sem vínculo externo";
            }
            $onSaveIdentifiers.invoke(new UpdatedIdentifiers(cleanTmdb, cleanImdb, cleanTvdb, newSummary, !StringsKt.isBlank(cleanTmdb)));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04c7  */
    /* renamed from: IdentifierInputField-2BfJ-Fs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7002IdentifierInputField2BfJFs(final java.lang.String r178, final java.lang.String r179, final java.lang.String r180, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r181, final int r182, androidx.compose.ui.Modifier r183, int r184, java.lang.String r185, java.lang.String r186, java.lang.String r187, androidx.compose.runtime.Composer r188, final int r189, final int r190) {
        /*
            Method dump skipped, instructions count: 1841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.IdentifiersModalKt.m7002IdentifierInputField2BfJFs(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, int, androidx.compose.ui.Modifier, int, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit IdentifierInputField_2BfJ_Fs$lambda$38$lambda$36(String $placeholder, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C314@11888L141:IdentifiersModal.kt#99r5nq");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-695864285, $changed, -1, "com.example.ui.detail.modals.IdentifierInputField.<anonymous>.<anonymous> (IdentifiersModal.kt:314)");
            }
            TextKt.m2693Text4IGK_g($placeholder, (Modifier) null, com.example.ui.theme.ColorKt.getTextMuted(), TextUnitKt.getSp(13.5d), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

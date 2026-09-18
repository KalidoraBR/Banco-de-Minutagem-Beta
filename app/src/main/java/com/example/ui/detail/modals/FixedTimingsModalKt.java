package com.example.ui.detail.modals;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import com.example.model.FixedTimingsConfig;
import com.example.model.Series;
import com.example.model.TimingItemConfig;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: FixedTimingsModal.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001aC\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000e\u001a{\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010!\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0003¢\u0006\u0002\u0010%¨\u0006&²\u0006\n\u0010'\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\f\u00100\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002"}, d2 = {"formatTimingInput", "", "raw", "FixedTimingsModal", "", "series", "Lcom/example/model/Series;", "onDismiss", "Lkotlin/Function0;", "onSaveFixedTimings", "Lkotlin/Function1;", "Lcom/example/model/FixedTimingsConfig;", "sheetState", "Landroidx/compose/material3/SheetState;", "(Lcom/example/model/Series;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetState;Landroidx/compose/runtime/Composer;II)V", "TimingOptionRow", "name", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconTint", "Landroidx/compose/ui/graphics/Color;", "iconBg", "isEnabled", "", "durationFormatted", "isSelectedForEditing", "onToggle", "onDurationClick", "tagPrefix", "modifier", "Landroidx/compose/ui/Modifier;", "TimingOptionRow-VQfMllA", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JJZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "InAppTimingKeypad", "onDigit", "onBackspace", "onClear", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "openingEnabled", "openingDuration", "openingRawDigits", "recapEnabled", "recapDuration", "recapRawDigits", "endingEnabled", "endingDuration", "endingRawDigits", "activeEditingSegment"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FixedTimingsModalKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$77(Series series, Function0 function0, Function1 function1, SheetState sheetState, int i, int i2, Composer composer, int i3) {
        FixedTimingsModal(series, function0, function1, sheetState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InAppTimingKeypad$lambda$95(Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        InAppTimingKeypad(function1, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimingOptionRow_VQfMllA$lambda$87(String str, ImageVector imageVector, long j, long j2, boolean z, String str2, boolean z2, Function1 function1, Function0 function0, String str3, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        m7001TimingOptionRowVQfMllA(str, imageVector, j, j2, z, str2, z2, function1, function0, str3, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final String formatTimingInput(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        String str = raw;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String digits = StringsKt.take(((StringBuilder) sb).toString(), 4);
        if (digits.length() == 0) {
            return "00:00";
        }
        switch (digits.length()) {
            case 1:
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{0, Integer.valueOf(Integer.parseInt(digits))}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            case 2:
                int sec = Integer.parseInt(digits);
                if (sec < 60) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{0, Integer.valueOf(sec)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    return format2;
                }
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String format3 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(sec / 60), Integer.valueOf(sec % 60)}, 2));
                Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                return format3;
            case 3:
                String substring = digits.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int minutes = Integer.parseInt(substring);
                String substring2 = digits.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                int seconds = Integer.parseInt(substring2);
                if (seconds < 60) {
                    StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                    String format4 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes), Integer.valueOf(seconds)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
                    return format4;
                }
                int extraMin = seconds / 60;
                int remSec = seconds % 60;
                StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                String format5 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes + extraMin), Integer.valueOf(remSec)}, 2));
                Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
                return format5;
            case 4:
                String substring3 = digits.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                int minutes2 = Integer.parseInt(substring3);
                String substring4 = digits.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                int seconds2 = Integer.parseInt(substring4);
                if (seconds2 < 60) {
                    StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                    String format6 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes2), Integer.valueOf(seconds2)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format6, "format(...)");
                    return format6;
                }
                int extraMin2 = seconds2 / 60;
                int remSec2 = seconds2 % 60;
                StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                String format7 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes2 + extraMin2), Integer.valueOf(remSec2)}, 2));
                Intrinsics.checkNotNullExpressionValue(format7, "format(...)");
                return format7;
            default:
                return "00:00";
        }
    }

    public static final void FixedTimingsModal(final Series series, final Function0<Unit> onDismiss, final Function1<? super FixedTimingsConfig, Unit> onSaveFixedTimings, SheetState sheetState, Composer $composer, final int $changed, final int i) {
        SheetState sheetState2;
        Object obj;
        Object obj2;
        MutableState openingDuration$delegate;
        Object obj3;
        Object obj4;
        Object obj5;
        MutableState openingEnabled$delegate;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        int activeCount;
        SheetState effectiveSheetState;
        long m4157copywmQWz5c;
        Composer $composer2;
        final SheetState sheetState3;
        CharSequence charSequence;
        Appendable appendable;
        Intrinsics.checkNotNullParameter(series, "series");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSaveFixedTimings, "onSaveFixedTimings");
        Composer $composer3 = $composer.startRestartGroup(1882991822);
        ComposerKt.sourceInformation($composer3, "C(FixedTimingsModal)P(2)136@5421L66,137@5515L94,138@5638L117,140@5781L64,141@5871L92,142@5990L115,144@6132L65,145@6224L93,146@6345L116,149@6597L42,152@6750L21,166@7335L17567,156@6882L18020:FixedTimingsModal.kt#99r5nq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(series) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onSaveFixedTimings) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            sheetState2 = sheetState;
        } else if (($changed & 3072) == 0) {
            sheetState2 = sheetState;
            $dirty |= $composer3.changed(sheetState2) ? 2048 : 1024;
        } else {
            sheetState2 = sheetState;
        }
        if (($dirty & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
            sheetState3 = sheetState2;
        } else {
            SheetState sheetState4 = i2 != 0 ? null : sheetState2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1882991822, $dirty, -1, "com.example.ui.detail.modals.FixedTimingsModal (FixedTimingsModal.kt:135)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1373917104, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(series.getFixedTimings().getOpening().isEnabled()), null, 2, null);
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            MutableState openingEnabled$delegate2 = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1373920140, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                String durationFormatted = series.getFixedTimings().getOpening().getDurationFormatted();
                if (StringsKt.isBlank(durationFormatted)) {
                    durationFormatted = "01:00";
                }
                obj2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(durationFormatted, null, 2, null);
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            MutableState openingDuration$delegate2 = (MutableState) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1373924099, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                CharSequence durationFormatted2 = series.getFixedTimings().getOpening().getDurationFormatted();
                Appendable sb = new StringBuilder();
                openingDuration$delegate = openingDuration$delegate2;
                int length = durationFormatted2.length();
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    char charAt = durationFormatted2.charAt(i3);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                    i3++;
                    length = i4;
                }
                String sb2 = ((StringBuilder) sb).toString();
                if (StringsKt.isBlank(sb2)) {
                    sb2 = "0100";
                }
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sb2, null, 2, null);
                $composer3.updateRememberedValue(obj3);
            } else {
                openingDuration$delegate = openingDuration$delegate2;
                obj3 = rememberedValue3;
            }
            final MutableState openingRawDigits$delegate = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1373928622, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(series.getFixedTimings().getRecap().isEnabled()), null, 2, null);
                $composer3.updateRememberedValue(obj4);
            } else {
                obj4 = rememberedValue4;
            }
            final MutableState recapEnabled$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1373931530, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue5 = $composer3.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                String durationFormatted3 = series.getFixedTimings().getRecap().getDurationFormatted();
                if (StringsKt.isBlank(durationFormatted3)) {
                    durationFormatted3 = "00:30";
                }
                obj5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(durationFormatted3, null, 2, null);
                $composer3.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            final MutableState recapDuration$delegate = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1373935361, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue6 = $composer3.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                CharSequence durationFormatted4 = series.getFixedTimings().getRecap().getDurationFormatted();
                Appendable sb3 = new StringBuilder();
                int length2 = durationFormatted4.length();
                openingEnabled$delegate = openingEnabled$delegate2;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length2;
                    char charAt2 = durationFormatted4.charAt(i5);
                    if (Character.isDigit(charAt2)) {
                        sb3.append(charAt2);
                    }
                    i5++;
                    length2 = i6;
                }
                String sb4 = ((StringBuilder) sb3).toString();
                if (StringsKt.isBlank(sb4)) {
                    sb4 = "0030";
                }
                obj6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sb4, null, 2, null);
                $composer3.updateRememberedValue(obj6);
            } else {
                openingEnabled$delegate = openingEnabled$delegate2;
                obj6 = rememberedValue6;
            }
            final MutableState recapRawDigits$delegate = (MutableState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1373939855, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue7 = $composer3.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                obj7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(series.getFixedTimings().getEnding().isEnabled()), null, 2, null);
                $composer3.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableState endingEnabled$delegate = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1373942827, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue8 = $composer3.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                String durationFormatted5 = series.getFixedTimings().getEnding().getDurationFormatted();
                if (StringsKt.isBlank(durationFormatted5)) {
                    durationFormatted5 = "00:45";
                }
                obj8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(durationFormatted5, null, 2, null);
                $composer3.updateRememberedValue(obj8);
            } else {
                obj8 = rememberedValue8;
            }
            final MutableState endingDuration$delegate = (MutableState) obj8;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1373946722, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue9 = $composer3.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                CharSequence durationFormatted6 = series.getFixedTimings().getEnding().getDurationFormatted();
                Appendable sb5 = new StringBuilder();
                int length3 = durationFormatted6.length();
                int i7 = 0;
                while (i7 < length3) {
                    int i8 = length3;
                    char charAt3 = durationFormatted6.charAt(i7);
                    if (Character.isDigit(charAt3)) {
                        charSequence = durationFormatted6;
                        appendable = sb5;
                        appendable.append(charAt3);
                    } else {
                        charSequence = durationFormatted6;
                        appendable = sb5;
                    }
                    i7++;
                    sb5 = appendable;
                    length3 = i8;
                    durationFormatted6 = charSequence;
                }
                String sb6 = ((StringBuilder) sb5).toString();
                if (StringsKt.isBlank(sb6)) {
                    sb6 = "0045";
                }
                obj9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sb6, null, 2, null);
                $composer3.updateRememberedValue(obj9);
            } else {
                obj9 = rememberedValue9;
            }
            final MutableState endingRawDigits$delegate = (MutableState) obj9;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1373954712, "CC(remember):FixedTimingsModal.kt#9igjgp");
            Object rememberedValue10 = $composer3.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                obj10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(obj10);
            } else {
                obj10 = rememberedValue10;
            }
            final MutableState activeEditingSegment$delegate = (MutableState) obj10;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Iterable listOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(FixedTimingsModal$lambda$2(openingEnabled$delegate)), Boolean.valueOf(FixedTimingsModal$lambda$14(recapEnabled$delegate)), Boolean.valueOf(FixedTimingsModal$lambda$26(endingEnabled$delegate))});
            if ((listOf instanceof Collection) && ((Collection) listOf).isEmpty()) {
                activeCount = 0;
            } else {
                activeCount = 0;
                Iterator it = listOf.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue() && (activeCount = activeCount + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            final ScrollState scrollState = ScrollKt.rememberScrollState(0, $composer3, 0, 1);
            if (sheetState4 == null) {
                $composer3.startReplaceGroup(1373961769);
                ComposerKt.sourceInformation($composer3, "154@6817L59");
                effectiveSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(1373961335);
                $composer3.endReplaceGroup();
                effectiveSheetState = sheetState4;
            }
            long Color = ColorKt.Color(4279179050L);
            long textWhite = com.example.ui.theme.ColorKt.getTextWhite();
            m4157copywmQWz5c = Color.m4157copywmQWz5c(r25, (r12 & 1) != 0 ? Color.m4161getAlphaimpl(r25) : 0.65f, (r12 & 2) != 0 ? Color.m4165getRedimpl(r25) : 0.0f, (r12 & 4) != 0 ? Color.m4164getGreenimpl(r25) : 0.0f, (r12 & 8) != 0 ? Color.m4162getBlueimpl(Color.INSTANCE.m4185getBlack0d7_KjU()) : 0.0f);
            int $dirty2 = $dirty;
            final MutableState openingDuration$delegate3 = openingDuration$delegate;
            final MutableState openingEnabled$delegate3 = openingEnabled$delegate;
            final int activeCount2 = activeCount;
            $composer2 = $composer3;
            ModalBottomSheetKt.m2242ModalBottomSheetdYc4hso(onDismiss, TestTagKt.testTag(Modifier.INSTANCE, "fixed_timings_bottom_sheet"), effectiveSheetState, 0.0f, RoundedCornerShapeKt.m955RoundedCornerShapea9UjIt4$default(Dp.m6622constructorimpl(22), Dp.m6622constructorimpl(22), 0.0f, 0.0f, 12, null), Color, textWhite, 0.0f, m4157copywmQWz5c, null, new Function2() { // from class: com.example.ui.detail.modals.FixedTimingsModalKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    return FixedTimingsModalKt.FixedTimingsModal$lambda$41((Composer) obj11, ((Integer) obj12).intValue());
                }
            }, null, ComposableLambdaKt.rememberComposableLambda(1003871723, true, new Function3() { // from class: com.example.ui.detail.modals.FixedTimingsModalKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj11, Object obj12, Object obj13) {
                    return FixedTimingsModalKt.FixedTimingsModal$lambda$76(ScrollState.this, onDismiss, activeCount2, openingEnabled$delegate3, openingDuration$delegate3, activeEditingSegment$delegate, recapEnabled$delegate, recapDuration$delegate, endingEnabled$delegate, endingDuration$delegate, openingRawDigits$delegate, recapRawDigits$delegate, endingRawDigits$delegate, onSaveFixedTimings, (ColumnScope) obj11, (Composer) obj12, ((Integer) obj13).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty2 >> 3) & 14) | 907739184, 384, 2184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            sheetState3 = sheetState4;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.detail.modals.FixedTimingsModalKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    return FixedTimingsModalKt.FixedTimingsModal$lambda$77(Series.this, onDismiss, onSaveFixedTimings, sheetState3, $changed, i, (Composer) obj11, ((Integer) obj12).intValue());
                }
            });
        }
    }

    private static final boolean FixedTimingsModal$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FixedTimingsModal$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String FixedTimingsModal$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String FixedTimingsModal$lambda$11(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FixedTimingsModal$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FixedTimingsModal$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String FixedTimingsModal$lambda$18(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String FixedTimingsModal$lambda$23(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FixedTimingsModal$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FixedTimingsModal$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String FixedTimingsModal$lambda$30(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String FixedTimingsModal$lambda$35(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String FixedTimingsModal$lambda$38(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final WindowInsets FixedTimingsModal$lambda$41(Composer $composer, int $changed) {
        $composer.startReplaceGroup(1485933239);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1485933239, $changed, -1, "com.example.ui.detail.modals.FixedTimingsModal.<anonymous> (FixedTimingsModal.kt:163)");
        }
        WindowInsets m740WindowInsetsa9UjIt4$default = WindowInsetsKt.m740WindowInsetsa9UjIt4$default(Dp.m6622constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceGroup();
        return m740WindowInsetsa9UjIt4$default;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x1041, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.rememberedValue(), java.lang.Integer.valueOf(r15)) == false) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0de1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0e1a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0ff7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x1003  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x1031  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x1158  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x11f6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x1044  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x1007  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0e30 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0cff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0ceb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FixedTimingsModal$lambda$76(androidx.compose.foundation.ScrollState r145, kotlin.jvm.functions.Function0 r146, int r147, final androidx.compose.runtime.MutableState r148, final androidx.compose.runtime.MutableState r149, final androidx.compose.runtime.MutableState r150, final androidx.compose.runtime.MutableState r151, final androidx.compose.runtime.MutableState r152, final androidx.compose.runtime.MutableState r153, final androidx.compose.runtime.MutableState r154, final androidx.compose.runtime.MutableState r155, final androidx.compose.runtime.MutableState r156, final androidx.compose.runtime.MutableState r157, final kotlin.jvm.functions.Function1 r158, androidx.compose.foundation.layout.ColumnScope r159, androidx.compose.runtime.Composer r160, int r161) {
        /*
            Method dump skipped, instructions count: 4604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.FixedTimingsModalKt.FixedTimingsModal$lambda$76(androidx.compose.foundation.ScrollState, kotlin.jvm.functions.Function0, int, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$47$lambda$46(MutableState $openingEnabled$delegate, MutableState $activeEditingSegment$delegate, boolean enabled) {
        FixedTimingsModal$lambda$3($openingEnabled$delegate, enabled);
        if (!enabled || FixedTimingsModal$lambda$38($activeEditingSegment$delegate) != null) {
            if (!enabled && Intrinsics.areEqual(FixedTimingsModal$lambda$38($activeEditingSegment$delegate), "opening")) {
                $activeEditingSegment$delegate.setValue(null);
            }
        } else {
            $activeEditingSegment$delegate.setValue("opening");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$49$lambda$48(MutableState $openingEnabled$delegate, MutableState $activeEditingSegment$delegate) {
        FixedTimingsModal$lambda$3($openingEnabled$delegate, true);
        $activeEditingSegment$delegate.setValue(Intrinsics.areEqual(FixedTimingsModal$lambda$38($activeEditingSegment$delegate), "opening") ? null : "opening");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$51$lambda$50(MutableState $recapEnabled$delegate, MutableState $activeEditingSegment$delegate, boolean enabled) {
        FixedTimingsModal$lambda$15($recapEnabled$delegate, enabled);
        if (!enabled || FixedTimingsModal$lambda$38($activeEditingSegment$delegate) != null) {
            if (!enabled && Intrinsics.areEqual(FixedTimingsModal$lambda$38($activeEditingSegment$delegate), "recap")) {
                $activeEditingSegment$delegate.setValue(null);
            }
        } else {
            $activeEditingSegment$delegate.setValue("recap");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$53$lambda$52(MutableState $recapEnabled$delegate, MutableState $activeEditingSegment$delegate) {
        FixedTimingsModal$lambda$15($recapEnabled$delegate, true);
        $activeEditingSegment$delegate.setValue(Intrinsics.areEqual(FixedTimingsModal$lambda$38($activeEditingSegment$delegate), "recap") ? null : "recap");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$55$lambda$54(MutableState $endingEnabled$delegate, MutableState $activeEditingSegment$delegate, boolean enabled) {
        FixedTimingsModal$lambda$27($endingEnabled$delegate, enabled);
        if (!enabled || FixedTimingsModal$lambda$38($activeEditingSegment$delegate) != null) {
            if (!enabled && Intrinsics.areEqual(FixedTimingsModal$lambda$38($activeEditingSegment$delegate), "ending")) {
                $activeEditingSegment$delegate.setValue(null);
            }
        } else {
            $activeEditingSegment$delegate.setValue("ending");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$57$lambda$56(MutableState $endingEnabled$delegate, MutableState $activeEditingSegment$delegate) {
        FixedTimingsModal$lambda$27($endingEnabled$delegate, true);
        $activeEditingSegment$delegate.setValue(Intrinsics.areEqual(FixedTimingsModal$lambda$38($activeEditingSegment$delegate), "ending") ? null : "ending");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit FixedTimingsModal$lambda$76$lambda$75$lambda$69(final androidx.compose.runtime.MutableState r113, final androidx.compose.runtime.MutableState r114, final androidx.compose.runtime.MutableState r115, final androidx.compose.runtime.MutableState r116, final androidx.compose.runtime.MutableState r117, final androidx.compose.runtime.MutableState r118, final androidx.compose.runtime.MutableState r119, androidx.compose.animation.AnimatedVisibilityScope r120, androidx.compose.runtime.Composer r121, int r122) {
        /*
            Method dump skipped, instructions count: 1820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.FixedTimingsModalKt.FixedTimingsModal$lambda$76$lambda$75$lambda$69(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$69$lambda$68$lambda$61$lambda$59$lambda$58(MutableState $activeEditingSegment$delegate) {
        $activeEditingSegment$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$69$lambda$68$lambda$63$lambda$62(MutableState $activeEditingSegment$delegate, MutableState $openingRawDigits$delegate, MutableState $openingDuration$delegate, MutableState $recapRawDigits$delegate, MutableState $recapDuration$delegate, MutableState $endingRawDigits$delegate, MutableState $endingDuration$delegate, String digit) {
        Intrinsics.checkNotNullParameter(digit, "digit");
        String FixedTimingsModal$lambda$38 = FixedTimingsModal$lambda$38($activeEditingSegment$delegate);
        if (FixedTimingsModal$lambda$38 != null) {
            switch (FixedTimingsModal$lambda$38.hashCode()) {
                case -1298752217:
                    if (FixedTimingsModal$lambda$38.equals("ending")) {
                        String newRaw = StringsKt.takeLast(FixedTimingsModal$lambda$35($endingRawDigits$delegate) + digit, 4);
                        $endingRawDigits$delegate.setValue(newRaw);
                        $endingDuration$delegate.setValue(formatTimingInput(newRaw));
                        break;
                    }
                    break;
                case -1263184552:
                    if (FixedTimingsModal$lambda$38.equals("opening")) {
                        String newRaw2 = StringsKt.takeLast(FixedTimingsModal$lambda$11($openingRawDigits$delegate) + digit, 4);
                        $openingRawDigits$delegate.setValue(newRaw2);
                        $openingDuration$delegate.setValue(formatTimingInput(newRaw2));
                        break;
                    }
                    break;
                case 108388543:
                    if (FixedTimingsModal$lambda$38.equals("recap")) {
                        String newRaw3 = StringsKt.takeLast(FixedTimingsModal$lambda$23($recapRawDigits$delegate) + digit, 4);
                        $recapRawDigits$delegate.setValue(newRaw3);
                        $recapDuration$delegate.setValue(formatTimingInput(newRaw3));
                        break;
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$69$lambda$68$lambda$65$lambda$64(MutableState $activeEditingSegment$delegate, MutableState $openingRawDigits$delegate, MutableState $openingDuration$delegate, MutableState $recapRawDigits$delegate, MutableState $recapDuration$delegate, MutableState $endingRawDigits$delegate, MutableState $endingDuration$delegate) {
        String newRaw;
        String FixedTimingsModal$lambda$38 = FixedTimingsModal$lambda$38($activeEditingSegment$delegate);
        if (FixedTimingsModal$lambda$38 != null) {
            switch (FixedTimingsModal$lambda$38.hashCode()) {
                case -1298752217:
                    if (FixedTimingsModal$lambda$38.equals("ending")) {
                        newRaw = FixedTimingsModal$lambda$35($endingRawDigits$delegate).length() > 0 ? StringsKt.dropLast(FixedTimingsModal$lambda$35($endingRawDigits$delegate), 1) : "";
                        $endingRawDigits$delegate.setValue(newRaw);
                        $endingDuration$delegate.setValue(formatTimingInput(newRaw));
                        break;
                    }
                    break;
                case -1263184552:
                    if (FixedTimingsModal$lambda$38.equals("opening")) {
                        newRaw = FixedTimingsModal$lambda$11($openingRawDigits$delegate).length() > 0 ? StringsKt.dropLast(FixedTimingsModal$lambda$11($openingRawDigits$delegate), 1) : "";
                        $openingRawDigits$delegate.setValue(newRaw);
                        $openingDuration$delegate.setValue(formatTimingInput(newRaw));
                        break;
                    }
                    break;
                case 108388543:
                    if (FixedTimingsModal$lambda$38.equals("recap")) {
                        newRaw = FixedTimingsModal$lambda$23($recapRawDigits$delegate).length() > 0 ? StringsKt.dropLast(FixedTimingsModal$lambda$23($recapRawDigits$delegate), 1) : "";
                        $recapRawDigits$delegate.setValue(newRaw);
                        $recapDuration$delegate.setValue(formatTimingInput(newRaw));
                        break;
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$69$lambda$68$lambda$67$lambda$66(MutableState $activeEditingSegment$delegate, MutableState $openingRawDigits$delegate, MutableState $openingDuration$delegate, MutableState $recapRawDigits$delegate, MutableState $recapDuration$delegate, MutableState $endingRawDigits$delegate, MutableState $endingDuration$delegate) {
        String FixedTimingsModal$lambda$38 = FixedTimingsModal$lambda$38($activeEditingSegment$delegate);
        if (FixedTimingsModal$lambda$38 != null) {
            switch (FixedTimingsModal$lambda$38.hashCode()) {
                case -1298752217:
                    if (FixedTimingsModal$lambda$38.equals("ending")) {
                        $endingRawDigits$delegate.setValue("");
                        $endingDuration$delegate.setValue("00:00");
                        break;
                    }
                    break;
                case -1263184552:
                    if (FixedTimingsModal$lambda$38.equals("opening")) {
                        $openingRawDigits$delegate.setValue("");
                        $openingDuration$delegate.setValue("00:00");
                        break;
                    }
                    break;
                case 108388543:
                    if (FixedTimingsModal$lambda$38.equals("recap")) {
                        $recapRawDigits$delegate.setValue("");
                        $recapDuration$delegate.setValue("00:00");
                        break;
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit FixedTimingsModal$lambda$76$lambda$75$lambda$74$lambda$73$lambda$72(Function1 $onSaveFixedTimings, MutableState $openingEnabled$delegate, MutableState $openingDuration$delegate, MutableState $recapEnabled$delegate, MutableState $recapDuration$delegate, MutableState $endingEnabled$delegate, MutableState $endingDuration$delegate) {
        FixedTimingsConfig newConfig = new FixedTimingsConfig(new TimingItemConfig("Abertura", FixedTimingsModal$lambda$2($openingEnabled$delegate), FixedTimingsModal$lambda$6($openingDuration$delegate)), new TimingItemConfig("Recap", FixedTimingsModal$lambda$14($recapEnabled$delegate), FixedTimingsModal$lambda$18($recapDuration$delegate)), new TimingItemConfig("Encerramento", FixedTimingsModal$lambda$26($endingEnabled$delegate), FixedTimingsModal$lambda$30($endingDuration$delegate)));
        $onSaveFixedTimings.invoke(newConfig);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0df2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0501 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0247  */
    /* renamed from: TimingOptionRow-VQfMllA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7001TimingOptionRowVQfMllA(final java.lang.String r201, final androidx.compose.ui.graphics.vector.ImageVector r202, final long r203, final long r205, final boolean r207, final java.lang.String r208, final boolean r209, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r210, final kotlin.jvm.functions.Function0<kotlin.Unit> r211, final java.lang.String r212, androidx.compose.ui.Modifier r213, androidx.compose.runtime.Composer r214, final int r215, final int r216, final int r217) {
        /*
            Method dump skipped, instructions count: 3622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.FixedTimingsModalKt.m7001TimingOptionRowVQfMllA(java.lang.String, androidx.compose.ui.graphics.vector.ImageVector, long, long, boolean, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimingOptionRow_VQfMllA$lambda$86$lambda$85$lambda$84$lambda$82$lambda$81(Function0 $onDurationClick) {
        $onDurationClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void InAppTimingKeypad(final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r149, final kotlin.jvm.functions.Function0<kotlin.Unit> r150, final kotlin.jvm.functions.Function0<kotlin.Unit> r151, androidx.compose.runtime.Composer r152, final int r153) {
        /*
            Method dump skipped, instructions count: 1977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.detail.modals.FixedTimingsModalKt.InAppTimingKeypad(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit InAppTimingKeypad$lambda$94$lambda$93$lambda$92$lambda$91$lambda$89$lambda$88(String $key, Function0 $onClear, Function0 $onBackspace, Function1 $onDigit) {
        if (Intrinsics.areEqual($key, "C")) {
            $onClear.invoke();
        } else if (Intrinsics.areEqual($key, "⌫")) {
            $onBackspace.invoke();
        } else {
            $onDigit.invoke($key);
        }
        return Unit.INSTANCE;
    }
}

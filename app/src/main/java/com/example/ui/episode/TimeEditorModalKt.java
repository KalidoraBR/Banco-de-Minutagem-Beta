package com.example.ui.episode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.example.model.TimingSection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: TimeEditorModal.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001as\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a=\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"parseTimeDigits", "Lcom/example/ui/episode/ParsedTimeResult;", "digits", "", "timeToRawDigits", "timeStr", "TimeEditorModal", "", "sectionName", "initialTiming", "Lcom/example/model/TimingSection;", "onDismiss", "Lkotlin/Function0;", "onConfirmTiming", "Lkotlin/Function1;", "onMarkHasNot", "onClearSection", "fixedDuration", "sheetState", "", "(Ljava/lang/String;Lcom/example/model/TimingSection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)V", "KeypadGrid", "onKeyPress", "onBackspace", "onClear", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "activeField", "Lcom/example/ui/episode/ActiveTimeField;", "startDigits", "endDigits"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimeEditorModalKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit KeypadGrid$lambda$55(Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        KeypadGrid(function1, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeEditorModal$lambda$46(String str, TimingSection timingSection, Function0 function0, Function1 function1, Function0 function02, Function0 function03, String str2, Object obj, int i, int i2, Composer composer, int i3) {
        TimeEditorModal(str, timingSection, function0, function1, function02, function03, str2, obj, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final ParsedTimeResult parseTimeDigits(String digits) {
        Pair pair;
        Intrinsics.checkNotNullParameter(digits, "digits");
        String str = digits;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = ((StringBuilder) sb).toString();
        if (sb2.length() == 0) {
            return new ParsedTimeResult("00:00", 0, true, null);
        }
        if (sb2.length() > 4) {
            return new ParsedTimeResult("00:00", 0, false, "Máximo de 4 dígitos");
        }
        switch (sb2.length()) {
            case 1:
                pair = TuplesKt.to(0, Integer.valueOf(Integer.parseInt(sb2)));
                break;
            case 2:
                pair = TuplesKt.to(0, Integer.valueOf(Integer.parseInt(sb2)));
                break;
            case 3:
                String substring = sb2.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                Integer valueOf = Integer.valueOf(Integer.parseInt(substring));
                String substring2 = sb2.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                pair = TuplesKt.to(valueOf, Integer.valueOf(Integer.parseInt(substring2)));
                break;
            case 4:
                String substring3 = sb2.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(substring3));
                String substring4 = sb2.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                pair = TuplesKt.to(valueOf2, Integer.valueOf(Integer.parseInt(substring4)));
                break;
            default:
                pair = TuplesKt.to(0, 0);
                break;
        }
        int min = ((Number) pair.component1()).intValue();
        int sec = ((Number) pair.component2()).intValue();
        String display = StringsKt.padStart(String.valueOf(min), 2, '0') + ServerSentEventKt.COLON + StringsKt.padStart(String.valueOf(sec), 2, '0');
        if (sec > 59) {
            return new ParsedTimeResult(display, (min * 60) + sec, false, "Segundos não podem ser maiores que 59 (atual: " + sec + ")");
        }
        int totalSec = (min * 60) + sec;
        return new ParsedTimeResult(display, totalSec, true, null);
    }

    public static final String timeToRawDigits(String timeStr) {
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        String str = timeStr;
        Appendable sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return ((StringBuilder) sb).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TimeEditorModal(final java.lang.String r23, final com.example.model.TimingSection r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, final kotlin.jvm.functions.Function1<? super com.example.model.TimingSection, kotlin.Unit> r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, java.lang.String r29, java.lang.Object r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.TimeEditorModalKt.TimeEditorModal(java.lang.String, com.example.model.TimingSection, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.Object, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final ActiveTimeField TimeEditorModal$lambda$3(MutableState<ActiveTimeField> mutableState) {
        return mutableState.getValue();
    }

    private static final String TimeEditorModal$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String TimeEditorModal$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final void TimeEditorModal$onKeyPress(MutableState<ActiveTimeField> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, String digit) {
        if (TimeEditorModal$lambda$3(mutableState) == ActiveTimeField.START) {
            if (TimeEditorModal$lambda$6(mutableState2).length() < 4) {
                mutableState2.setValue(TimeEditorModal$lambda$6(mutableState2) + digit);
                return;
            }
            return;
        }
        if (TimeEditorModal$lambda$9(mutableState3).length() < 4) {
            mutableState3.setValue(TimeEditorModal$lambda$9(mutableState3) + digit);
        }
    }

    private static final void TimeEditorModal$onBackspace(MutableState<ActiveTimeField> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3) {
        if (TimeEditorModal$lambda$3(mutableState) == ActiveTimeField.START) {
            if (!(TimeEditorModal$lambda$6(mutableState2).length() > 0)) {
                return;
            }
            mutableState2.setValue(StringsKt.dropLast(TimeEditorModal$lambda$6(mutableState2), 1));
        } else {
            if (!(TimeEditorModal$lambda$9(mutableState3).length() > 0)) {
                return;
            }
            mutableState3.setValue(StringsKt.dropLast(TimeEditorModal$lambda$9(mutableState3), 1));
        }
    }

    private static final void TimeEditorModal$onClearDigits(MutableState<ActiveTimeField> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3) {
        if (TimeEditorModal$lambda$3(mutableState) == ActiveTimeField.START) {
            mutableState2.setValue("");
        } else {
            mutableState3.setValue("");
        }
    }

    private static final void TimeEditorModal$handleConfirm(String $fixedDuration, ParsedTimeResult parsedStart, ParsedTimeResult parsedEnd, Function1<? super TimingSection, Unit> function1, MutableState<ActiveTimeField> mutableState, MutableState<String> mutableState2) {
        if (TimeEditorModal$lambda$3(mutableState) == ActiveTimeField.START) {
            if (TimeEditorModal$lambda$9(mutableState2).length() == 0) {
                if ($fixedDuration != null && parsedStart.isValid()) {
                    List parts = StringsKt.split$default((CharSequence) $fixedDuration, new String[]{ServerSentEventKt.COLON}, false, 0, 6, (Object) null);
                    if (parts.size() == 2) {
                        Integer intOrNull = StringsKt.toIntOrNull((String) parts.get(0));
                        int intValue = (intOrNull != null ? intOrNull.intValue() : 0) * 60;
                        Integer intOrNull2 = StringsKt.toIntOrNull((String) parts.get(1));
                        fixedSeconds = intOrNull2 != null ? intOrNull2.intValue() : 0;
                        fixedSeconds += intValue;
                    }
                    int totalSec = parsedStart.getTotalSeconds() + fixedSeconds;
                    int min = totalSec / 60;
                    int sec = totalSec % 60;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(min), Integer.valueOf(sec)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    mutableState2.setValue(format);
                }
                mutableState.setValue(ActiveTimeField.END);
                return;
            }
        }
        String startStr = parsedStart.getFormatted();
        String endStr = parsedEnd.getFormatted();
        String formattedRange = startStr + " - " + endStr;
        function1.invoke(new TimingSection(true, false, startStr, endStr, formattedRange));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0bb5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0d3e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0daf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0dde  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0df5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0e79  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0f4d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0f86  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x1007  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x1139  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x1145  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x117e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x1203  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x13a6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x13ad  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x143b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x14d8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1508  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x1537  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x15e1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x15ed  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1620  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1701  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x179e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x17aa  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x17e3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x18ca  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x18d6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x190f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1a61  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x1a84  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x1a9b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x1ad4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x1b19  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x1b75  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x1c39  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x1c45  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x1c7e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x1d65  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x1d71  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x1daa  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1e13  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x1f16  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x20ae  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x2178  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x20bc  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x213b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x1e1a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x1dc0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x1d77  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x1c94  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x1c4b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x1b9c  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x1b24  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x1ade  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x1a9e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x1925 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x18dc  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x17f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x17b0  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x170c  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x1636 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x15f1  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x1545  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x1516  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x14e6  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x14a4  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x1194 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x114b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x100e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0f9c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0f53  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0e7c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0de5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0d54 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0d0b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0c48  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0b14 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x096a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x077f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0505 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x03da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0b74  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit TimeEditorModal$lambda$45(final com.example.ui.episode.ParsedTimeResult r188, final com.example.ui.episode.ParsedTimeResult r189, java.lang.String r190, java.lang.String r191, com.example.model.TimingSection r192, kotlin.jvm.functions.Function0 r193, java.lang.String r194, final androidx.compose.runtime.MutableState r195, final androidx.compose.runtime.MutableState r196, final androidx.compose.runtime.MutableState r197, kotlin.jvm.functions.Function0 r198, final java.lang.String r199, final kotlin.jvm.functions.Function1 r200, final kotlin.jvm.functions.Function0 r201, androidx.compose.runtime.Composer r202, int r203) {
        /*
            Method dump skipped, instructions count: 8574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.TimeEditorModalKt.TimeEditorModal$lambda$45(com.example.ui.episode.ParsedTimeResult, com.example.ui.episode.ParsedTimeResult, java.lang.String, java.lang.String, com.example.model.TimingSection, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeEditorModal$lambda$45$lambda$44$lambda$43$lambda$20$lambda$15$lambda$14(MutableState $activeField$delegate) {
        $activeField$delegate.setValue(ActiveTimeField.START);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeEditorModal$lambda$45$lambda$44$lambda$43$lambda$20$lambda$18$lambda$17(MutableState $activeField$delegate) {
        $activeField$delegate.setValue(ActiveTimeField.END);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeEditorModal$lambda$45$lambda$44$lambda$43$lambda$26$lambda$25(MutableState $activeField$delegate, MutableState $startDigits$delegate, MutableState $endDigits$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TimeEditorModal$onKeyPress($activeField$delegate, $startDigits$delegate, $endDigits$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeEditorModal$lambda$45$lambda$44$lambda$43$lambda$28$lambda$27(MutableState $activeField$delegate, MutableState $startDigits$delegate, MutableState $endDigits$delegate) {
        TimeEditorModal$onBackspace($activeField$delegate, $startDigits$delegate, $endDigits$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeEditorModal$lambda$45$lambda$44$lambda$43$lambda$30$lambda$29(MutableState $activeField$delegate, MutableState $startDigits$delegate, MutableState $endDigits$delegate) {
        TimeEditorModal$onClearDigits($activeField$delegate, $startDigits$delegate, $endDigits$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeEditorModal$lambda$45$lambda$44$lambda$43$lambda$39$lambda$36$lambda$35(String $fixedDuration, ParsedTimeResult $parsedStart, ParsedTimeResult $parsedEnd, Function1 $onConfirmTiming, MutableState $activeField$delegate, MutableState $endDigits$delegate) {
        TimeEditorModal$handleConfirm($fixedDuration, $parsedStart, $parsedEnd, $onConfirmTiming, $activeField$delegate, $endDigits$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TimeEditorModal$lambda$45$lambda$44$lambda$43$lambda$42$lambda$41$lambda$40(Function0 $onClearSection) {
        $onClearSection.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void KeypadGrid(final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r150, final kotlin.jvm.functions.Function0<kotlin.Unit> r151, final kotlin.jvm.functions.Function0<kotlin.Unit> r152, androidx.compose.runtime.Composer r153, final int r154) {
        /*
            Method dump skipped, instructions count: 2004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.TimeEditorModalKt.KeypadGrid(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit KeypadGrid$lambda$54$lambda$53$lambda$52$lambda$51$lambda$49$lambda$48(String $key, Function0 $onClear, Function0 $onBackspace, Function1 $onKeyPress) {
        if (Intrinsics.areEqual($key, "Limpar")) {
            $onClear.invoke();
        } else if (Intrinsics.areEqual($key, "⌫")) {
            $onBackspace.invoke();
        } else {
            $onKeyPress.invoke($key);
        }
        return Unit.INSTANCE;
    }
}

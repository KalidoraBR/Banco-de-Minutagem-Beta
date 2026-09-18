package com.example.ui.tools;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.example.data.DiagnosticItem;
import com.example.data.DiagnosticStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TesteConexaoScreen.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"TesteConexaoScreen", "", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DiagnosticItemCard", "item", "Lcom/example/data/DiagnosticItem;", "(Lcom/example/data/DiagnosticItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatusPill", "label", "", "color", "Landroidx/compose/ui/graphics/Color;", "StatusPill-RPmYEkk", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "app", "diagnostics", "", "isRunningTests", "", "hasRunAtLeastOnce"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TesteConexaoScreenKt {

    /* compiled from: TesteConexaoScreen.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiagnosticStatus.values().length];
            try {
                iArr[DiagnosticStatus.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[DiagnosticStatus.CHECKING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[DiagnosticStatus.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[DiagnosticStatus.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[DiagnosticStatus.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit DiagnosticItemCard$lambda$34(DiagnosticItem diagnosticItem, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DiagnosticItemCard(diagnosticItem, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit StatusPill_RPmYEkk$lambda$36(String str, long j, int i, Composer composer, int i2) {
        m7101StatusPillRPmYEkk(str, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TesteConexaoScreen$lambda$26(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TesteConexaoScreen(function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0800 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x08d6 A[LOOP:0: B:89:0x08d0->B:91:0x08d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x090a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TesteConexaoScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r147, androidx.compose.ui.Modifier r148, androidx.compose.runtime.Composer r149, final int r150, final int r151) {
        /*
            Method dump skipped, instructions count: 2685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.TesteConexaoScreenKt.TesteConexaoScreen(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List<DiagnosticItem> TesteConexaoScreen$lambda$1(MutableState<List<DiagnosticItem>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean TesteConexaoScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TesteConexaoScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean TesteConexaoScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TesteConexaoScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TesteConexaoScreen$startDiagnostics(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, Context context, MutableState<List<DiagnosticItem>> mutableState2, MutableState<Boolean> mutableState3) {
        if (!TesteConexaoScreen$lambda$4(mutableState)) {
            TesteConexaoScreen$lambda$5(mutableState, true);
            BuildersKt.launch$default(coroutineScope, null, null, new TesteConexaoScreenKt$TesteConexaoScreen$startDiagnostics$1(context, mutableState2, mutableState, mutableState3, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit TesteConexaoScreen$lambda$25$lambda$24$lambda$17(androidx.compose.runtime.MutableState r127, androidx.compose.animation.AnimatedVisibilityScope r128, androidx.compose.runtime.Composer r129, int r130) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.TesteConexaoScreenKt.TesteConexaoScreen$lambda$25$lambda$24$lambda$17(androidx.compose.runtime.MutableState, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TesteConexaoScreen$lambda$25$lambda$24$lambda$19$lambda$18(CoroutineScope $coroutineScope, MutableState $isRunningTests$delegate, Context $context, MutableState $diagnostics$delegate, MutableState $hasRunAtLeastOnce$delegate) {
        TesteConexaoScreen$startDiagnostics($coroutineScope, $isRunningTests$delegate, $context, $diagnostics$delegate, $hasRunAtLeastOnce$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0379  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit TesteConexaoScreen$lambda$25$lambda$24$lambda$23(androidx.compose.runtime.MutableState r80, androidx.compose.foundation.layout.RowScope r81, androidx.compose.runtime.Composer r82, int r83) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.TesteConexaoScreenKt.TesteConexaoScreen$lambda$25$lambda$24$lambda$23(androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x08a1, code lost:
    
        if (r3 == null) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0744 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0ad0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void DiagnosticItemCard(final com.example.data.DiagnosticItem r164, androidx.compose.ui.Modifier r165, androidx.compose.runtime.Composer r166, final int r167, final int r168) {
        /*
            Method dump skipped, instructions count: 3014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.TesteConexaoScreenKt.DiagnosticItemCard(com.example.data.DiagnosticItem, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0150, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.rememberedValue(), java.lang.Integer.valueOf(r37)) == false) goto L38;
     */
    /* renamed from: StatusPill-RPmYEkk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m7101StatusPillRPmYEkk(java.lang.String r58, final long r59, androidx.compose.runtime.Composer r61, final int r62) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.tools.TesteConexaoScreenKt.m7101StatusPillRPmYEkk(java.lang.String, long, androidx.compose.runtime.Composer, int):void");
    }
}

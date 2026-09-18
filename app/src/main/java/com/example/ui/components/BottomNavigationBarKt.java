package com.example.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import com.example.ui.navigation.NavDestination;
import com.example.ui.theme.AppColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomNavigationBar.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"BottomNavigationBar", "", "currentDestination", "Lcom/example/ui/navigation/NavDestination;", "onNavigate", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/ui/navigation/NavDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app", "iconColor", "Landroidx/compose/ui/graphics/Color;", "textColor"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomNavigationBarKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BottomNavigationBar$lambda$12(NavDestination navDestination, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomNavigationBar(navDestination, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BottomNavigationBar(final com.example.ui.navigation.NavDestination r151, final kotlin.jvm.functions.Function1<? super com.example.ui.navigation.NavDestination, kotlin.Unit> r152, androidx.compose.ui.Modifier r153, androidx.compose.runtime.Composer r154, final int r155, final int r156) {
        /*
            Method dump skipped, instructions count: 2194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.BottomNavigationBarKt.BottomNavigationBar(com.example.ui.navigation.NavDestination, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BottomNavigationBar$lambda$1$lambda$0(AppColors $colors, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m4695drawLineNGM6Ib0$default(drawBehind, $colors.m7086getBorder0d7_KjU(), OffsetKt.Offset(0.0f, 0.0f), OffsetKt.Offset(Size.m3987getWidthimpl(drawBehind.mo4709getSizeNHjbRc()), 0.0f), drawBehind.mo362toPx0680j_4(Dp.m6622constructorimpl(1)), 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }

    private static final long BottomNavigationBar$lambda$11$lambda$10$lambda$9$lambda$2(State<Color> state) {
        return ((Color) state.getValue()).m4169unboximpl();
    }

    private static final long BottomNavigationBar$lambda$11$lambda$10$lambda$9$lambda$3(State<Color> state) {
        return ((Color) state.getValue()).m4169unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit BottomNavigationBar$lambda$11$lambda$10$lambda$9$lambda$6$lambda$5(Function1 $onNavigate, NavDestination $destination) {
        $onNavigate.invoke($destination);
        return Unit.INSTANCE;
    }
}

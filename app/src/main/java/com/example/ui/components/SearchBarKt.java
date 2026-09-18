package com.example.ui.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.example.ui.theme.AppColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: SearchBar.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"SearchBar", "", "query", "", "onQueryChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchBarKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SearchBar$lambda$5(String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchBar(str, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SearchBar(final java.lang.String r91, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r92, androidx.compose.ui.Modifier r93, androidx.compose.runtime.Composer r94, final int r95, final int r96) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.SearchBarKt.SearchBar(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SearchBar$lambda$4$lambda$2$lambda$1(Function1 $onQueryChange) {
        $onQueryChange.invoke("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit SearchBar$lambda$4$lambda$3(AppColors $colors, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C101@3542L236:SearchBar.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(661845748, $changed, -1, "com.example.ui.components.SearchBar.<anonymous>.<anonymous> (SearchBar.kt:101)");
            }
            IconKt.m2150Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Limpar busca", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), $colors.m7094getTextSecondary0d7_KjU(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}

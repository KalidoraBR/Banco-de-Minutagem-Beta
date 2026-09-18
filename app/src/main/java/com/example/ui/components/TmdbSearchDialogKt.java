package com.example.ui.components;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.example.data.AppConfigStorage;
import com.example.model.ApiConfig;
import com.example.model.Series;
import com.example.model.TmdbSearchResult;
import com.example.model.TmdbSeriesDetails;
import com.example.ui.theme.AppTheme;
import com.example.ui.theme.ColorKt;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: TmdbSearchDialog.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b\u001aY\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\n0\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002"}, d2 = {"buildSeriesFromTmdb", "Lcom/example/model/Series;", "result", "Lcom/example/model/TmdbSearchResult;", "details", "Lcom/example/model/TmdbSeriesDetails;", "apiKey", "", "(Lcom/example/model/TmdbSearchResult;Lcom/example/model/TmdbSeriesDetails;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TmdbSearchDialog", "", "onDismiss", "Lkotlin/Function0;", "onSelectSeries", "Lkotlin/Function2;", "onImportCompleteSeries", "Lkotlin/Function1;", "initialQuery", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "app", "searchQuery", "searchResults", "", "isSearching", "", "importingItemId", "", "searchJob", "Lkotlinx/coroutines/Job;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TmdbSearchDialogKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TmdbSearchDialog$lambda$69(Function0 function0, Function2 function2, Function1 function1, String str, int i, int i2, Composer composer, int i3) {
        TmdbSearchDialog(function0, function2, function1, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:237|(1:239)|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|270|271|272|273|274|275|(1:277)(14:278|172|173|174|175|(10:178|(2:179|(3:181|(1:183)(1:224)|(1:186)(1:185))(2:225|226))|187|(1:223)(5:191|(2:193|(3:195|(1:197)|(5:199|(4:203|(1:205)|206|(2:208|209))|210|211|209)))(1:222)|221|(0)|(0))|(1:220)(3:215|(1:217)(1:219)|218)|(5:201|203|(0)|206|(0))|210|211|209|176)|227|228|(1:230)(1:315)|231|(1:233)(1:314)|234|235|(6:313|155|(2:158|156)|159|160|161)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(46:62|(1:64)|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|(1:109)(10:110|15|16|17|18|(10:21|(2:22|(3:24|(1:26)(1:55)|(1:29)(1:28))(2:56|57))|30|(1:54)(4:34|(1:36)(1:53)|37|(5:39|(4:43|(1:45)|46|(2:48|49))|50|51|49))|52|(5:41|43|(0)|46|(0))|50|51|49|19)|58|59|60|(6:154|155|(1:156)|159|160|161)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0aed, code lost:
    
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0b16, code lost:
    
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0b41, code lost:
    
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0b6c, code lost:
    
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0b97, code lost:
    
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0bc6, code lost:
    
        r28 = r1;
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0bf5, code lost:
    
        r33 = r33;
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0c24, code lost:
    
        r36 = r36;
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0c53, code lost:
    
        r39 = r39;
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0c82, code lost:
    
        r40 = r40;
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0cb1, code lost:
    
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r42;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0ce2, code lost:
    
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r41;
        r6 = r5;
        r41 = r15;
        r37 = r1;
        r42 = r10;
        r29 = r4;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0ce0, code lost:
    
        r4 = r81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0d10, code lost:
    
        r38 = r2;
        r2 = r23;
        r35 = r7;
        r7 = r11;
        r11 = r12;
        r44 = r80;
        r23 = r3;
        r43 = r6;
        r3 = r24;
        r45 = r4;
        r6 = r5;
        r41 = r15;
        r37 = r1;
        r42 = r10;
        r29 = r81;
        r10 = r6;
        r4 = r2;
        r2 = r14;
        r14 = r12;
        r1 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0522, code lost:
    
        r40 = r82;
        r37 = r8;
        r2 = r11;
        r21 = r13;
        r41 = r38;
        r38 = r3;
        r8 = r4;
        r13 = r12;
        r3 = r24;
        r22 = r14;
        r4 = r21;
        r1 = r83;
        r33 = r6;
        r6 = r12;
        r11 = r14;
        r14 = r33;
        r15 = r35;
        r35 = r7;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x054a, code lost:
    
        r36 = r2;
        r40 = r82;
        r37 = r8;
        r2 = r11;
        r21 = r13;
        r41 = r38;
        r38 = r3;
        r8 = r4;
        r13 = r12;
        r3 = r24;
        r22 = r14;
        r4 = r21;
        r1 = r83;
        r33 = r6;
        r6 = r12;
        r11 = r14;
        r14 = r33;
        r15 = r35;
        r35 = r7;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0576, code lost:
    
        r36 = r2;
        r40 = r82;
        r37 = r8;
        r2 = r11;
        r21 = r13;
        r41 = r38;
        r38 = r3;
        r8 = r4;
        r13 = r12;
        r3 = r24;
        r22 = r14;
        r4 = r21;
        r1 = r83;
        r33 = r6;
        r6 = r12;
        r11 = r14;
        r14 = r33;
        r15 = r35;
        r35 = r7;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x05a2, code lost:
    
        r36 = r2;
        r40 = r82;
        r37 = r8;
        r2 = r11;
        r21 = r13;
        r41 = r38;
        r38 = r3;
        r8 = r4;
        r13 = r12;
        r3 = r24;
        r22 = r14;
        r4 = r21;
        r1 = r83;
        r33 = r6;
        r6 = r12;
        r11 = r14;
        r14 = r33;
        r15 = r35;
        r35 = r7;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x05ce, code lost:
    
        r36 = r2;
        r40 = r82;
        r37 = r8;
        r2 = r11;
        r21 = r13;
        r41 = r38;
        r38 = r3;
        r8 = r4;
        r13 = r12;
        r3 = r24;
        r22 = r14;
        r4 = r21;
        r1 = r83;
        r33 = r6;
        r6 = r12;
        r11 = r14;
        r14 = r33;
        r15 = r35;
        r35 = r7;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x05fa, code lost:
    
        r36 = r2;
        r40 = r82;
        r37 = r8;
        r2 = r11;
        r21 = r13;
        r41 = r38;
        r38 = r3;
        r8 = r4;
        r13 = r12;
        r3 = r24;
        r22 = r14;
        r4 = r21;
        r1 = r83;
        r33 = r6;
        r6 = r12;
        r11 = r14;
        r14 = r33;
        r15 = r35;
        r35 = r7;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0626, code lost:
    
        r36 = r2;
        r40 = r82;
        r37 = r8;
        r2 = r11;
        r21 = r13;
        r41 = r38;
        r38 = r3;
        r8 = r4;
        r13 = r12;
        r3 = r24;
        r22 = r14;
        r4 = r21;
        r1 = r83;
        r33 = r6;
        r6 = r12;
        r11 = r14;
        r14 = r33;
        r15 = r35;
        r35 = r7;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x065a, code lost:
    
        r36 = r2;
        r40 = r82;
        r37 = r8;
        r2 = r11;
        r21 = r13;
        r41 = r38;
        r38 = r3;
        r8 = r4;
        r13 = r12;
        r3 = r24;
        r22 = r14;
        r4 = r21;
        r1 = r83;
        r33 = r6;
        r6 = r12;
        r11 = r14;
        r14 = r33;
        r15 = r35;
        r35 = r7;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0654, code lost:
    
        r39 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0658, code lost:
    
        r39 = r80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0683, code lost:
    
        r39 = r80;
        r36 = r2;
        r40 = r82;
        r37 = r8;
        r2 = r11;
        r21 = r13;
        r41 = r1;
        r38 = r3;
        r8 = r4;
        r13 = r12;
        r3 = r24;
        r22 = r14;
        r4 = r21;
        r1 = r83;
        r33 = r6;
        r6 = r12;
        r11 = r14;
        r14 = r33;
        r15 = r35;
        r35 = r7;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x02a9, code lost:
    
        if (r13 == null) goto L48;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0f30  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0f71 A[LOOP:2: B:156:0x0f6b->B:158:0x0f71, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0e4a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0a83 -> B:15:0x0ab1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0d40 -> B:18:0x0d6d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x04e2 -> B:166:0x0504). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:271:0x06ae -> B:169:0x06cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object buildSeriesFromTmdb(com.example.model.TmdbSearchResult r80, com.example.model.TmdbSeriesDetails r81, java.lang.String r82, kotlin.coroutines.Continuation<? super com.example.model.Series> r83) {
        /*
            Method dump skipped, instructions count: 4080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.TmdbSearchDialogKt.buildSeriesFromTmdb(com.example.model.TmdbSearchResult, com.example.model.TmdbSeriesDetails, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object buildSeriesFromTmdb$default(TmdbSearchResult tmdbSearchResult, TmdbSeriesDetails tmdbSeriesDetails, String str, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "e2832a818c1d5333f2c25eb42abce207";
        }
        return buildSeriesFromTmdb(tmdbSearchResult, tmdbSeriesDetails, str, continuation);
    }

    public static final void TmdbSearchDialog(final Function0<Unit> onDismiss, final Function2<? super TmdbSearchResult, ? super TmdbSeriesDetails, Unit> onSelectSeries, Function1<? super Series, Unit> function1, String initialQuery, Composer $composer, final int $changed, final int i) {
        Function1 function12;
        String initialQuery2;
        Function1 onImportCompleteSeries;
        Object obj;
        Object obj2;
        Object obj3;
        MutableState searchQuery$delegate;
        Function1 onImportCompleteSeries2;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        CoroutineScope coroutineScope;
        MutableState isSearching$delegate;
        String initialQuery3;
        TmdbSearchDialogKt$TmdbSearchDialog$1$1 tmdbSearchDialogKt$TmdbSearchDialog$1$1;
        Composer $composer2;
        final String initialQuery4;
        final Function1 onImportCompleteSeries3;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSelectSeries, "onSelectSeries");
        Composer $composer3 = $composer.startRestartGroup(-1848078737);
        ComposerKt.sourceInformation($composer3, "C(TmdbSearchDialog)P(1,3,2)261@10648L7,262@10681L24,263@10726L49,264@10802L6,266@10833L41,267@10900L64,268@10988L34,269@11050L39,270@11111L39,302@11942L93,302@11921L114,314@12230L26786,308@12041L26975:TmdbSearchDialog.kt#qonjpd");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onSelectSeries) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            function12 = function1;
        } else if (($changed & 384) == 0) {
            function12 = function1;
            $dirty |= $composer3.changedInstance(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            initialQuery2 = initialQuery;
        } else if (($changed & 3072) == 0) {
            initialQuery2 = initialQuery;
            $dirty |= $composer3.changed(initialQuery2) ? 2048 : 1024;
        } else {
            initialQuery2 = initialQuery;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            onImportCompleteSeries3 = function12;
            initialQuery4 = initialQuery2;
            $composer2 = $composer3;
        } else {
            if (i2 != 0) {
                onImportCompleteSeries = null;
            } else {
                onImportCompleteSeries = function12;
            }
            if (i3 != 0) {
                initialQuery2 = "";
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1848078737, $dirty2, -1, "com.example.ui.components.TmdbSearchDialog (TmdbSearchDialog.kt:260)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = $composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3));
                $composer3.updateRememberedValue(obj);
            } else {
                obj = rememberedValue;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) obj).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2112804832, "CC(remember):TmdbSearchDialog.kt#9igjgp");
            Object rememberedValue2 = $composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                obj2 = AppConfigStorage.INSTANCE.loadConfig(context);
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = rememberedValue2;
            }
            final ApiConfig apiConfig = (ApiConfig) obj2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            AppTheme.INSTANCE.getColors($composer3, 6);
            ComposerKt.sourceInformationMarkerStart($composer3, 2112808248, "CC(remember):TmdbSearchDialog.kt#9igjgp");
            Object rememberedValue3 = $composer3.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialQuery2, null, 2, null);
                $composer3.updateRememberedValue(obj3);
            } else {
                obj3 = rememberedValue3;
            }
            MutableState searchQuery$delegate2 = (MutableState) obj3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2112810415, "CC(remember):TmdbSearchDialog.kt#9igjgp");
            Object rememberedValue4 = $composer3.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                searchQuery$delegate = searchQuery$delegate2;
                onImportCompleteSeries2 = onImportCompleteSeries;
                obj4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(obj4);
            } else {
                searchQuery$delegate = searchQuery$delegate2;
                onImportCompleteSeries2 = onImportCompleteSeries;
                obj4 = rememberedValue4;
            }
            final MutableState searchResults$delegate = (MutableState) obj4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2112813201, "CC(remember):TmdbSearchDialog.kt#9igjgp");
            Object rememberedValue5 = $composer3.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                obj5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(obj5);
            } else {
                obj5 = rememberedValue5;
            }
            MutableState isSearching$delegate2 = (MutableState) obj5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2112815190, "CC(remember):TmdbSearchDialog.kt#9igjgp");
            Object rememberedValue6 = $composer3.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(obj6);
            } else {
                obj6 = rememberedValue6;
            }
            final MutableState importingItemId$delegate = (MutableState) obj6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2112817142, "CC(remember):TmdbSearchDialog.kt#9igjgp");
            Object rememberedValue7 = $composer3.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                obj7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(obj7);
            } else {
                obj7 = rememberedValue7;
            }
            final MutableState searchJob$delegate = (MutableState) obj7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final List quickSearchSuggestions = CollectionsKt.listOf((Object[]) new String[]{"Arquivo X", "Power Rangers", "Ultraman Blazar", "Kamen Rider Wizard", "Sobrenatural", "Doctor Who", "Stranger Things"});
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 2112843788, "CC(remember):TmdbSearchDialog.kt#9igjgp");
            boolean changedInstance = (($dirty2 & 7168) == 2048) | $composer3.changedInstance(coroutineScope2);
            Object rememberedValue8 = $composer3.rememberedValue();
            if (changedInstance || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                coroutineScope = coroutineScope2;
                isSearching$delegate = isSearching$delegate2;
                initialQuery3 = initialQuery2;
                tmdbSearchDialogKt$TmdbSearchDialog$1$1 = new TmdbSearchDialogKt$TmdbSearchDialog$1$1(initialQuery3, coroutineScope, searchJob$delegate, searchResults$delegate, isSearching$delegate, apiConfig, null);
                $composer3.updateRememberedValue(tmdbSearchDialogKt$TmdbSearchDialog$1$1);
            } else {
                coroutineScope = coroutineScope2;
                tmdbSearchDialogKt$TmdbSearchDialog$1$1 = rememberedValue8;
                isSearching$delegate = isSearching$delegate2;
                initialQuery3 = initialQuery2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) tmdbSearchDialogKt$TmdbSearchDialog$1$1, $composer3, 6);
            final CoroutineScope coroutineScope3 = coroutineScope;
            final MutableState isSearching$delegate3 = isSearching$delegate;
            final MutableState searchQuery$delegate3 = searchQuery$delegate;
            final Function1 onImportCompleteSeries4 = onImportCompleteSeries2;
            AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(false, false, null, false, false, 7, null), ComposableLambdaKt.rememberComposableLambda(-1587827706, true, new Function2() { // from class: com.example.ui.components.TmdbSearchDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj8, Object obj9) {
                    return TmdbSearchDialogKt.TmdbSearchDialog$lambda$68(CoroutineScope.this, onImportCompleteSeries4, onSelectSeries, onDismiss, searchQuery$delegate3, searchJob$delegate, searchResults$delegate, isSearching$delegate3, apiConfig, quickSearchSuggestions, importingItemId$delegate, (Composer) obj8, ((Integer) obj9).intValue());
                }
            }, $composer3, 54), $composer3, ($dirty2 & 14) | 432, 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            initialQuery4 = initialQuery3;
            onImportCompleteSeries3 = onImportCompleteSeries2;
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.components.TmdbSearchDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj8, Object obj9) {
                    return TmdbSearchDialogKt.TmdbSearchDialog$lambda$69(Function0.this, onSelectSeries, onImportCompleteSeries3, initialQuery4, $changed, i, (Composer) obj8, ((Integer) obj9).intValue());
                }
            });
        }
    }

    private static final String TmdbSearchDialog$lambda$19(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<TmdbSearchResult> TmdbSearchDialog$lambda$22(MutableState<List<TmdbSearchResult>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean TmdbSearchDialog$lambda$25(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TmdbSearchDialog$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer TmdbSearchDialog$lambda$28(MutableState<Integer> mutableState) {
        return mutableState.getValue();
    }

    private static final Job TmdbSearchDialog$lambda$31(MutableState<Job> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TmdbSearchDialog$doSearch(CoroutineScope coroutineScope, MutableState<Job> mutableState, MutableState<List<TmdbSearchResult>> mutableState2, MutableState<Boolean> mutableState3, ApiConfig apiConfig, String query) {
        Job launch$default;
        Job TmdbSearchDialog$lambda$31 = TmdbSearchDialog$lambda$31(mutableState);
        if (TmdbSearchDialog$lambda$31 != null) {
            Job.DefaultImpls.cancel$default(TmdbSearchDialog$lambda$31, (CancellationException) null, 1, (Object) null);
        }
        if (!StringsKt.isBlank(query)) {
            launch$default = BuildersKt.launch$default(coroutineScope, null, null, new TmdbSearchDialogKt$TmdbSearchDialog$doSearch$1(query, apiConfig, mutableState3, mutableState2, null), 3, null);
            mutableState.setValue(launch$default);
        } else {
            mutableState2.setValue(CollectionsKt.emptyList());
            TmdbSearchDialog$lambda$26(mutableState3, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TmdbSearchDialog$lambda$68(final CoroutineScope $coroutineScope, final Function1 $onImportCompleteSeries, final Function2 $onSelectSeries, final Function0 $onDismiss, final MutableState $searchQuery$delegate, final MutableState $searchJob$delegate, final MutableState $searchResults$delegate, final MutableState $isSearching$delegate, final ApiConfig $apiConfig, final List $quickSearchSuggestions, final MutableState $importingItemId$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C321@12449L26561,315@12240L26770:TmdbSearchDialog.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1587827706, $changed, -1, "com.example.ui.components.TmdbSearchDialog.<anonymous> (TmdbSearchDialog.kt:315)");
            }
            SurfaceKt.m2543SurfaceT9BRK9s(TestTagKt.testTag(BackgroundKt.m225backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.getNavyBackground(), null, 2, null), "tmdb_search_dialog"), null, ColorKt.getNavyBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1043928993, true, new Function2() { // from class: com.example.ui.components.TmdbSearchDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TmdbSearchDialogKt.TmdbSearchDialog$lambda$68$lambda$67(CoroutineScope.this, $onImportCompleteSeries, $onSelectSeries, $onDismiss, $searchQuery$delegate, $searchJob$delegate, $searchResults$delegate, $isSearching$delegate, $apiConfig, $quickSearchSuggestions, $importingItemId$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12583302, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0e90  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0e9f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0ea4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0e95  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0f83  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x112e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x113a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x1279  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x1285  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x12bc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x1383  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x141e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x15db  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x1423  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x1386  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x12d2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x128b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x1140  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x1581  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x056b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0c6b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit TmdbSearchDialog$lambda$68$lambda$67(kotlinx.coroutines.CoroutineScope r195, final kotlin.jvm.functions.Function1 r196, final kotlin.jvm.functions.Function2 r197, final kotlin.jvm.functions.Function0 r198, final androidx.compose.runtime.MutableState r199, final androidx.compose.runtime.MutableState r200, final androidx.compose.runtime.MutableState r201, final androidx.compose.runtime.MutableState r202, final com.example.model.ApiConfig r203, java.util.List r204, final androidx.compose.runtime.MutableState r205, androidx.compose.runtime.Composer r206, int r207) {
        /*
            Method dump skipped, instructions count: 5601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.TmdbSearchDialogKt.TmdbSearchDialog$lambda$68$lambda$67(kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, com.example.model.ApiConfig, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$44$lambda$39$lambda$38(MutableState $searchQuery$delegate, CoroutineScope $coroutineScope, MutableState $searchJob$delegate, MutableState $searchResults$delegate, MutableState $isSearching$delegate, ApiConfig $apiConfig, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        TmdbSearchDialog$doSearch($coroutineScope, $searchJob$delegate, $searchResults$delegate, $isSearching$delegate, $apiConfig, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$44$lambda$40(MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C421@16717L326:TmdbSearchDialog.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1171484749, $changed, -1, "com.example.ui.components.TmdbSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TmdbSearchDialog.kt:421)");
            }
            IconKt.m2150Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(20)), TmdbSearchDialog$lambda$19($searchQuery$delegate).length() > 0 ? ColorKt.getAccentBlue() : ColorKt.getTextSecondary(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$44$lambda$43(MutableState $isSearching$delegate, final MutableState $searchQuery$delegate, final MutableState $searchResults$delegate, Composer $composer, int $changed) {
        Object obj;
        ComposerKt.sourceInformation($composer, "C:TmdbSearchDialog.kt#qonjpd");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1659844530, $changed, -1, "com.example.ui.components.TmdbSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TmdbSearchDialog.kt:429)");
            }
            if (TmdbSearchDialog$lambda$25($isSearching$delegate)) {
                $composer.startReplaceGroup(-469858270);
                ComposerKt.sourceInformation($composer, "430@17191L242");
                ProgressIndicatorKt.m2367CircularProgressIndicatorLxG7B9w(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(18)), ColorKt.getAccentPurple(), Dp.m6622constructorimpl(2), 0L, 0, $composer, 438, 24);
                $composer.endReplaceGroup();
            } else {
                if (TmdbSearchDialog$lambda$19($searchQuery$delegate).length() > 0) {
                    $composer.startReplaceGroup(-469503971);
                    ComposerKt.sourceInformation($composer, "437@17591L164,436@17533L727");
                    ComposerKt.sourceInformationMarkerStart($composer, -1677710958, "CC(remember):TmdbSearchDialog.kt#9igjgp");
                    Object rememberedValue = $composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        obj = new Function0() { // from class: com.example.ui.components.TmdbSearchDialogKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TmdbSearchDialogKt.TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$44$lambda$43$lambda$42$lambda$41(MutableState.this, $searchResults$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                    } else {
                        obj = rememberedValue;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    IconButtonKt.IconButton((Function0) obj, SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(24)), false, null, null, ComposableSingletons$TmdbSearchDialogKt.INSTANCE.m6994getLambda$701423249$app(), $composer, 196662, 28);
                } else {
                    $composer.startReplaceGroup(-486888492);
                }
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$44$lambda$43$lambda$42$lambda$41(MutableState $searchQuery$delegate, MutableState $searchResults$delegate) {
        $searchQuery$delegate.setValue("");
        $searchResults$delegate.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$49$lambda$48$lambda$46$lambda$45(String $suggestion, MutableState $searchQuery$delegate, CoroutineScope $coroutineScope, MutableState $searchJob$delegate, MutableState $searchResults$delegate, MutableState $isSearching$delegate, ApiConfig $apiConfig) {
        $searchQuery$delegate.setValue($suggestion);
        TmdbSearchDialog$doSearch($coroutineScope, $searchJob$delegate, $searchResults$delegate, $isSearching$delegate, $apiConfig, $suggestion);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64(MutableState $searchResults$delegate, final CoroutineScope $coroutineScope, final Function1 $onImportCompleteSeries, final Function2 $onSelectSeries, final Function0 $onDismiss, final MutableState $importingItemId$delegate, final ApiConfig $apiConfig, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List TmdbSearchDialog$lambda$22 = TmdbSearchDialog$lambda$22($searchResults$delegate);
        final Function1 function1 = new Function1() { // from class: com.example.ui.components.TmdbSearchDialogKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TmdbSearchDialogKt.TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64$lambda$53((TmdbSearchResult) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((TmdbSearchResult) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(TmdbSearchResult tmdbSearchResult) {
                return null;
            }
        };
        LazyColumn.items(TmdbSearchDialog$lambda$22.size(), new Function1<Integer, Object>() { // from class: com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke(TmdbSearchDialog$lambda$22.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return Function1.this.invoke(TmdbSearchDialog$lambda$22.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:103:0x0a4e  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0c65  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x0f8d  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x106e  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x1100  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x1132  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x11c7  */
            /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:154:0x1070  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x101f  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0ec2  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x0c4c  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x09f5 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:166:0x09ac  */
            /* JADX WARN: Removed duplicated region for block: B:168:0x08f6 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:170:0x0772 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:171:0x0729  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x047e  */
            /* JADX WARN: Removed duplicated region for block: B:190:0x032c  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x031a  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0326  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x03cc  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x03d8  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0717  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0723  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x075c  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0858  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x099a  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x09a6  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x09df  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope r182, int r183, androidx.compose.runtime.Composer r184, int r185) {
                /*
                    Method dump skipped, instructions count: 4555
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.example.ui.components.TmdbSearchDialogKt$TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64$$inlined$items$default$4.invoke(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64$lambda$53(TmdbSearchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TmdbSearchDialog$lambda$68$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63$triggerImport(CoroutineScope coroutineScope, TmdbSearchResult $item, ApiConfig apiConfig, Function1<? super Series, Unit> function1, Function2<? super TmdbSearchResult, ? super TmdbSeriesDetails, Unit> function2, Function0<Unit> function0, MutableState<Integer> mutableState) {
        BuildersKt.launch$default(coroutineScope, null, null, new TmdbSearchDialogKt$TmdbSearchDialog$2$1$1$5$1$2$triggerImport$1($item, apiConfig, function1, function2, function0, mutableState, null), 3, null);
    }
}

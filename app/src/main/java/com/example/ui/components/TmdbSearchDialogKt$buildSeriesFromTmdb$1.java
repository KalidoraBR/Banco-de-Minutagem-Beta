package com.example.ui.components;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TmdbSearchDialog.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.example.ui.components.TmdbSearchDialogKt", f = "TmdbSearchDialog.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {124, 179}, m = "buildSeriesFromTmdb", n = {"result", "details", "apiKey", "seriesId", "title", "synopsis", "posterUrl", "backdropUrl", "genres", "tmdbSeasons", "seasonColorPalette", "$this$mapIndexed\\7", "$this$mapIndexedTo\\8", "destination\\8", "item\\8", "sInfo\\9", "sId\\9", "year", "$i$f$mapIndexed\\7\\118", "$i$f$mapIndexedTo\\8\\819", "index\\8", "index\\9", "$i$a$-mapIndexed-TmdbSearchDialogKt$buildSeriesFromTmdb$seasons$1\\9\\822\\0", "colorHex\\9", "result", "details", "apiKey", "seriesId", "title", "synopsis", "posterUrl", "backdropUrl", "genres", "tmdbSeasons", "seasonColorPalette", "$this$mapIndexed\\18", "$this$mapIndexedTo\\19", "destination\\19", "item\\19", "sId\\20", "year", "numSeasons", "totalEps", "epsPerSeason", "$i$f$mapIndexed\\18\\174", "$i$f$mapIndexedTo\\19\\828", "index\\19", "sNum\\20", "index\\20", "$i$a$-mapIndexed-TmdbSearchDialogKt$buildSeriesFromTmdb$seasons$2\\20\\831\\0", "colorHex\\20"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$15", "L$16", "L$17", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$15", "L$16", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "I$8", "I$9", "J$0"})
/* loaded from: classes11.dex */
public final class TmdbSearchDialogKt$buildSeriesFromTmdb$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    int I$7;
    int I$8;
    int I$9;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TmdbSearchDialogKt$buildSeriesFromTmdb$1(Continuation<? super TmdbSearchDialogKt$buildSeriesFromTmdb$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TmdbSearchDialogKt.buildSeriesFromTmdb(null, null, null, this);
    }
}

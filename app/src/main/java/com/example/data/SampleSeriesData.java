package com.example.data;

import com.example.model.Series;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: SampleSeriesData.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/example/data/SampleSeriesData;", "", "<init>", "()V", "sampleList", "", "Lcom/example/model/Series;", "getSampleList", "()Ljava/util/List;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SampleSeriesData {
    public static final SampleSeriesData INSTANCE = new SampleSeriesData();
    private static final List<Series> sampleList = CollectionsKt.emptyList();
    public static final int $stable = 8;

    private SampleSeriesData() {
    }

    public final List<Series> getSampleList() {
        return sampleList;
    }
}

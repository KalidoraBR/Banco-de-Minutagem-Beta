package com.example.data;

import com.example.model.Series;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrashStorage.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/data/TrashStorage;", "", "<init>", "()V", "PREFS_NAME", "", "memoryTrash", "", "Lcom/example/data/DeletedSeriesItem;", "getDeletedSeries", "", "moveToTrash", "", "series", "Lcom/example/model/Series;", "restoreSeries", "seriesId", "deletePermanently", "", "clearAll", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrashStorage {
    private static final String PREFS_NAME = "minutagens_trash_prefs";
    public static final TrashStorage INSTANCE = new TrashStorage();
    private static final List<DeletedSeriesItem> memoryTrash = new ArrayList();
    public static final int $stable = 8;

    private TrashStorage() {
    }

    public final List<DeletedSeriesItem> getDeletedSeries() {
        return CollectionsKt.toList(memoryTrash);
    }

    public final void moveToTrash(Series series) {
        Intrinsics.checkNotNullParameter(series, "series");
        Iterable iterable = memoryTrash;
        boolean z = true;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Intrinsics.areEqual(((DeletedSeriesItem) it.next()).getSeries().getId(), series.getId())) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            memoryTrash.add(0, new DeletedSeriesItem(series, 0L, null, 6, null));
        }
    }

    public final Series restoreSeries(String seriesId) {
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        int index = 0;
        Iterator<DeletedSeriesItem> it = memoryTrash.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((DeletedSeriesItem) it.next()).getSeries().getId(), seriesId)) {
                    break;
                }
                index++;
            } else {
                index = -1;
                break;
            }
        }
        if (index != -1) {
            DeletedSeriesItem item = memoryTrash.remove(index);
            return item.getSeries();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean deletePermanently$lambda$2(String $seriesId, DeletedSeriesItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSeries().getId(), $seriesId);
    }

    public final boolean deletePermanently(final String seriesId) {
        Intrinsics.checkNotNullParameter(seriesId, "seriesId");
        List<DeletedSeriesItem> list = memoryTrash;
        final Function1 function1 = new Function1() { // from class: com.example.data.TrashStorage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TrashStorage.deletePermanently$lambda$2(seriesId, (DeletedSeriesItem) obj));
            }
        };
        return list.removeIf(new Predicate() { // from class: com.example.data.TrashStorage$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean booleanValue;
                booleanValue = ((Boolean) Function1.this.invoke(obj)).booleanValue();
                return booleanValue;
            }
        });
    }

    public final int clearAll() {
        int count = memoryTrash.size();
        memoryTrash.clear();
        return count;
    }
}

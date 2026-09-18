package com.example.ui.season;

import com.example.model.Episode;
import com.example.model.EpisodeStatus;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FillModeHelper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\b"}, d2 = {"Lcom/example/ui/season/FillModeHelper;", "", "<init>", "()V", "resolveFillModeEpisode", "Lcom/example/model/Episode;", "episodes", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FillModeHelper {
    public static final int $stable = 0;
    public static final FillModeHelper INSTANCE = new FillModeHelper();

    private FillModeHelper() {
    }

    public final Episode resolveFillModeEpisode(List<Episode> episodes) {
        Iterable iterable;
        Object obj;
        Episode nextPendingAfter;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(episodes, "episodes");
        Object obj4 = null;
        if (episodes.isEmpty()) {
            return null;
        }
        List<Episode> list = episodes;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iterable = null;
                    break;
                }
                Episode episode = (Episode) it.next();
                if (((episode.getStatus() != EpisodeStatus.PENDING || episode.isLastEdited()) ? 1 : null) != null) {
                    iterable = 1;
                    break;
                }
            }
        } else {
            iterable = null;
        }
        if (iterable == null) {
            return (Episode) CollectionsKt.firstOrNull((List) episodes);
        }
        ListIterator listIterator = episodes.listIterator(episodes.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((Episode) obj).isLastEdited()) {
                break;
            }
        }
        Episode lastEdited = (Episode) obj;
        if (lastEdited == null) {
            ListIterator listIterator2 = episodes.listIterator(episodes.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    obj3 = null;
                    break;
                }
                obj3 = listIterator2.previous();
                if ((((Episode) obj3).getStatus() != EpisodeStatus.PENDING ? 1 : null) != null) {
                    break;
                }
            }
            lastEdited = (Episode) obj3;
        }
        if (lastEdited == null) {
            Iterator it2 = episodes.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if ((((Episode) next).getStatus() == EpisodeStatus.PENDING ? 1 : null) != null) {
                    obj4 = next;
                    break;
                }
            }
            Episode episode2 = (Episode) obj4;
            if (episode2 != null) {
                return episode2;
            }
            Episode episode3 = (Episode) CollectionsKt.lastOrNull((List) episodes);
            return episode3 == null ? (Episode) CollectionsKt.firstOrNull((List) episodes) : episode3;
        }
        if (lastEdited.getStatus() != EpisodeStatus.COMPLETED) {
            return lastEdited;
        }
        int lastIndex = 0;
        Iterator<Episode> it3 = episodes.iterator();
        while (true) {
            if (!it3.hasNext()) {
                lastIndex = -1;
                break;
            }
            if (Intrinsics.areEqual(((Episode) it3.next()).getId(), lastEdited.getId())) {
                break;
            }
            lastIndex++;
        }
        if (lastIndex == -1 || lastIndex >= episodes.size() - 1) {
            nextPendingAfter = null;
        } else {
            Iterator it4 = episodes.subList(lastIndex + 1, episodes.size()).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it4.next();
                if ((((Episode) obj2).getStatus() == EpisodeStatus.PENDING ? 1 : null) != null) {
                    break;
                }
            }
            nextPendingAfter = (Episode) obj2;
        }
        if (nextPendingAfter != null) {
            return nextPendingAfter;
        }
        Iterator it5 = episodes.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next2 = it5.next();
            if ((((Episode) next2).getStatus() == EpisodeStatus.PENDING ? 1 : null) != null) {
                obj4 = next2;
                break;
            }
        }
        Episode episode4 = (Episode) obj4;
        return episode4 == null ? lastEdited : episode4;
    }
}

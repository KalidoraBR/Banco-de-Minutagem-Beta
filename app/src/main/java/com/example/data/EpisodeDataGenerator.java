package com.example.data;

import com.example.model.Episode;
import com.example.model.TimingSection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* compiled from: EpisodeDataGenerator.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/data/EpisodeDataGenerator;", "", "<init>", "()V", "mmprTitles", "", "", "getEpisodeTitle", "seasonId", "episodeNum", "", "getEpisodeAirDate", "generateEpisodes", "Lcom/example/model/Episode;", "totalCount", "completedCount", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EpisodeDataGenerator {
    public static final EpisodeDataGenerator INSTANCE = new EpisodeDataGenerator();
    private static final List<String> mmprTitles = CollectionsKt.listOf((Object[]) new String[]{"O Dia da Mudança", "Equipe nas Alturas", "Trabalho em Equipe", "Um Problema de Peso", "Diferenças Superadas", "A Hora da Comida", "Irmãs Mascaradas", "De Olho no Futuro", "Para Quem os Sinos Dobram", "Felizes Para Sempre", "A Noite dos Monstros", "Prisão do Medo", "Paz, Amor e Luta", "A Ilha da Ilusão — Parte 1", "A Ilha da Ilusão — Parte 2", "O Monstro da Poluição"});
    public static final int $stable = 8;

    private EpisodeDataGenerator() {
    }

    public final String getEpisodeTitle(String seasonId, int episodeNum) {
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        boolean z = false;
        if (StringsKt.startsWith$default(seasonId, "mmpr", false, 2, (Object) null)) {
            int size = mmprTitles.size();
            int i = episodeNum - 1;
            if (i >= 0 && i < size) {
                z = true;
            }
            if (z) {
                return mmprTitles.get(episodeNum - 1);
            }
        }
        return "Episódio " + episodeNum;
    }

    public final String getEpisodeAirDate(String seasonId, int episodeNum) {
        Intrinsics.checkNotNullParameter(seasonId, "seasonId");
        if (StringsKt.startsWith$default(seasonId, "mmpr", false, 2, (Object) null)) {
            switch (episodeNum) {
                case 1:
                    return "28/08/1993";
                case 2:
                    return "04/09/1993";
                case 3:
                    return "08/09/1993";
                case 4:
                    return "09/09/1993";
                case 5:
                    return "10/09/1993";
                case 6:
                    return "14/09/1993";
                case 7:
                    return "15/09/1993";
                case 8:
                    return "16/09/1993";
                default:
                    return StringsKt.padStart(String.valueOf((episodeNum % 28) + 1), 2, '0') + "/09/1993";
            }
        }
        return StringsKt.padStart(String.valueOf((episodeNum % 28) + 1), 2, '0') + "/10/1993";
    }

    public final List<Episode> generateEpisodes(String seasonId, int totalCount, int completedCount) {
        Iterable iterable;
        Collection collection;
        Episode episode;
        String seasonId2 = seasonId;
        Intrinsics.checkNotNullParameter(seasonId2, "seasonId");
        if (totalCount <= 0) {
            return CollectionsKt.emptyList();
        }
        boolean z = true;
        Iterable intRange = new IntRange(1, totalCount);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            String episodeTitle = INSTANCE.getEpisodeTitle(seasonId2, nextInt);
            String episodeAirDate = INSTANCE.getEpisodeAirDate(seasonId2, nextInt);
            if (nextInt <= completedCount) {
                Iterable iterable2 = intRange;
                String str = seasonId2 + "_ep" + nextInt;
                TimingSection timingSection = new TimingSection(true, false, "01:00", "02:30", "01:00 - 02:30", 2, null);
                TimingSection timingSection2 = new TimingSection(false, true, null, null, null, 29, null);
                TimingSection timingSection3 = new TimingSection(true, false, "20:00", "21:00", "20:00 - 21:00", 2, null);
                boolean z2 = nextInt == completedCount ? z : false;
                collection = arrayList;
                iterable = iterable2;
                episode = new Episode(str, seasonId2, nextInt, episodeTitle, episodeAirDate, timingSection, timingSection2, timingSection3, z2, null, 512, null);
            } else {
                iterable = intRange;
                collection = arrayList;
                episode = (Intrinsics.areEqual(seasonId2, "mmpr_part_1") && nextInt == 3) ? new Episode(seasonId2 + "_ep" + nextInt, seasonId2, nextInt, episodeTitle, episodeAirDate, new TimingSection(true, false, "01:00", "02:30", "01:00 - 02:30", 2, null), new TimingSection(false, false, null, null, null, 31, null), new TimingSection(false, false, null, null, null, 31, null), false, null, 512, null) : (Intrinsics.areEqual(seasonId2, "mmpr_part_1") && nextInt == 5) ? new Episode(seasonId2 + "_ep" + nextInt, seasonId2, nextInt, episodeTitle, episodeAirDate, new TimingSection(false, true, null, null, null, 29, null), new TimingSection(true, false, "00:00", "00:45", "00:00 - 00:45", 2, null), new TimingSection(false, false, null, null, null, 31, null), false, null, 512, null) : new Episode(seasonId2 + "_ep" + nextInt, seasonId2, nextInt, episodeTitle, episodeAirDate, new TimingSection(false, false, null, null, null, 31, null), new TimingSection(false, false, null, null, null, 31, null), new TimingSection(false, false, null, null, null, 31, null), false, null, 512, null);
            }
            collection.add(episode);
            seasonId2 = seasonId;
            arrayList = collection;
            intRange = iterable;
            z = true;
        }
        return (List) arrayList;
    }
}

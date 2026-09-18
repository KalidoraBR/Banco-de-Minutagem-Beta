package com.example.network;

import androidx.core.app.NotificationCompat;
import com.example.model.TmdbEpisodeInfo;
import com.example.model.TmdbSearchResult;
import com.example.model.TmdbSeasonInfo;
import com.example.model.TmdbSeriesDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TmdbService.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J \u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u0014J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00102\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010!J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00102\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/example/network/TmdbService;", "", "<init>", "()V", "client", "Lokhttp3/OkHttpClient;", "TMDB_BASE_URL", "", "TMDB_IMAGE_BASE_W500", "TMDB_IMAGE_BASE_ORIGINAL", "DEFAULT_TMDB_KEY", "isBearer", "", "key", "getEffectiveKey", "searchTvSeries", "", "Lcom/example/model/TmdbSearchResult;", "query", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseSearchResults", "jsonStr", "getSeriesDetails", "Lcom/example/model/TmdbSeriesDetails;", "tmdbId", "parseSeriesDetails", "responseBody", "defaultId", "getSeasonEpisodes", "Lcom/example/model/TmdbEpisodeInfo;", "seasonNumber", "", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFallbackSeasonEpisodes", "getFallbackSearchResults", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TmdbService {
    private static final String DEFAULT_TMDB_KEY = "e2832a818c1d5333f2c25eb42abce207";
    private static final String TMDB_BASE_URL = "https://api.themoviedb.org/3";
    public static final String TMDB_IMAGE_BASE_ORIGINAL = "https://image.tmdb.org/t/p/original";
    public static final String TMDB_IMAGE_BASE_W500 = "https://image.tmdb.org/t/p/w500";
    public static final TmdbService INSTANCE = new TmdbService();
    private static final OkHttpClient client = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
    public static final int $stable = 8;

    private TmdbService() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBearer(String key) {
        String trimmed = StringsKt.trim((CharSequence) key).toString();
        return StringsKt.startsWith$default(trimmed, "ey", false, 2, (Object) null) || trimmed.length() > 45;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getEffectiveKey(String key) {
        String trimmed = StringsKt.trim((CharSequence) key).toString();
        return !StringsKt.isBlank(trimmed) ? trimmed : DEFAULT_TMDB_KEY;
    }

    public final Object searchTvSeries(String query, String apiKey, Continuation<? super List<TmdbSearchResult>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TmdbService$searchTvSeries$2(query, apiKey, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb A[Catch: Exception -> 0x012a, TryCatch #0 {Exception -> 0x012a, blocks: (B:3:0x000a, B:5:0x0019, B:8:0x001e, B:10:0x0025, B:13:0x0063, B:19:0x0073, B:21:0x008a, B:26:0x009b, B:30:0x00c6, B:32:0x00cc, B:34:0x00eb, B:36:0x00f8, B:38:0x0112), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.example.model.TmdbSearchResult> parseSearchResults(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.network.TmdbService.parseSearchResults(java.lang.String):java.util.List");
    }

    public final Object getSeriesDetails(String tmdbId, String apiKey, Continuation<? super TmdbSeriesDetails> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TmdbService$getSeriesDetails$2(tmdbId, apiKey, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TmdbSeriesDetails parseSeriesDetails(String responseBody, String defaultId) {
        String posterPath;
        String backdropPath;
        List genresList;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = "poster_path";
        String str8 = "id";
        String str9 = "name";
        try {
            JSONObject json = new JSONObject(responseBody);
            Integer intOrNull = StringsKt.toIntOrNull(defaultId);
            int id = json.optInt("id", intOrNull != null ? intOrNull.intValue() : 0);
            String name = json.optString("name", "");
            String originalName = json.optString("original_name", "");
            String firstAirDate = json.optString("first_air_date", "");
            String overview = json.optString("overview", "");
            String posterPath2 = json.optString("poster_path");
            Intrinsics.checkNotNull(posterPath2);
            if (((StringsKt.isBlank(posterPath2) || Intrinsics.areEqual(posterPath2, AbstractJsonLexerKt.NULL)) ? null : 1) == null) {
                posterPath2 = null;
            }
            String backdropPath2 = json.optString("backdrop_path");
            Intrinsics.checkNotNull(backdropPath2);
            if (((StringsKt.isBlank(backdropPath2) || Intrinsics.areEqual(backdropPath2, AbstractJsonLexerKt.NULL)) ? null : 1) == null) {
                backdropPath2 = null;
            }
            int numberOfSeasons = json.optInt("number_of_seasons", 1);
            int numberOfEpisodes = json.optInt("number_of_episodes", 1);
            String status = json.optString(NotificationCompat.CATEGORY_STATUS, "Ended");
            List genresList2 = new ArrayList();
            JSONArray genresArray = json.optJSONArray("genres");
            if (genresArray != null) {
                int length = genresArray.length();
                posterPath = posterPath2;
                for (int i = 0; i < length; i++) {
                    String optString = genresArray.getJSONObject(i).optString("name");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    genresList2.add(optString);
                }
            } else {
                posterPath = posterPath2;
            }
            List seasonsList = new ArrayList();
            JSONArray seasonsArray = json.optJSONArray("seasons");
            if (seasonsArray != null) {
                backdropPath = backdropPath2;
                int length2 = seasonsArray.length();
                genresList = genresList2;
                int i2 = 0;
                while (i2 < length2) {
                    JSONObject sObj = seasonsArray.getJSONObject(i2);
                    JSONArray seasonsArray2 = seasonsArray;
                    int i3 = length2;
                    int i4 = i2;
                    int sNum = sObj.optInt("season_number", 1);
                    if (sNum > 0) {
                        int sId = sObj.optInt(str8, sNum);
                        str4 = str8;
                        String sName = sObj.optString(str9, "Temporada " + sNum);
                        int epCount = sObj.optInt("episode_count", 0);
                        String sPoster = sObj.optString(str7);
                        Intrinsics.checkNotNull(sPoster);
                        if (!((StringsKt.isBlank(sPoster) || Intrinsics.areEqual(sPoster, AbstractJsonLexerKt.NULL)) ? false : true)) {
                            sPoster = null;
                        }
                        Intrinsics.checkNotNull(sName);
                        if (sPoster != null) {
                            String str10 = sPoster;
                            str3 = str7;
                            str5 = str9;
                            str6 = StringsKt.startsWith$default(str10, "/", false, 2, (Object) null) ? TMDB_IMAGE_BASE_W500 + str10 : str10;
                        } else {
                            str3 = str7;
                            str5 = str9;
                            str6 = null;
                        }
                        seasonsList.add(new TmdbSeasonInfo(sId, sNum, sName, epCount, str6));
                    } else {
                        str3 = str7;
                        str4 = str8;
                        str5 = str9;
                    }
                    i2 = i4 + 1;
                    seasonsArray = seasonsArray2;
                    length2 = i3;
                    str8 = str4;
                    str7 = str3;
                    str9 = str5;
                }
            } else {
                backdropPath = backdropPath2;
                genresList = genresList2;
            }
            Intrinsics.checkNotNull(name);
            Intrinsics.checkNotNull(originalName);
            Intrinsics.checkNotNull(firstAirDate);
            Intrinsics.checkNotNull(overview);
            if (posterPath != null) {
                String str11 = posterPath;
                if (StringsKt.startsWith$default(str11, "/", false, 2, (Object) null)) {
                    str11 = TMDB_IMAGE_BASE_W500 + str11;
                }
                str = str11;
            } else {
                str = null;
            }
            if (backdropPath != null) {
                String str12 = backdropPath;
                if (StringsKt.startsWith$default(str12, "/", false, 2, (Object) null)) {
                    str12 = TMDB_IMAGE_BASE_ORIGINAL + str12;
                }
                str2 = str12;
            } else {
                str2 = null;
            }
            Intrinsics.checkNotNull(status);
            return new TmdbSeriesDetails(id, name, originalName, firstAirDate, overview, str, str2, numberOfSeasons, numberOfEpisodes, genresList, status, seasonsList);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Object getSeasonEpisodes(String tmdbId, int seasonNumber, String apiKey, Continuation<? super List<TmdbEpisodeInfo>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new TmdbService$getSeasonEpisodes$2(tmdbId, seasonNumber, apiKey, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TmdbEpisodeInfo> getFallbackSeasonEpisodes(String tmdbId, int seasonNumber) {
        char c;
        char c2;
        char c3 = '0';
        if (Intrinsics.areEqual(tmdbId, "4087")) {
            c = 11;
            c2 = '\f';
        } else {
            c2 = '\f';
            c = 11;
            if (!StringsKt.contains$default((CharSequence) tmdbId, (CharSequence) "arquivo", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) tmdbId, (CharSequence) "x-files", false, 2, (Object) null)) {
                if (!Intrinsics.areEqual(tmdbId, "2328") && !StringsKt.contains$default((CharSequence) tmdbId, (CharSequence) "ranger", false, 2, (Object) null)) {
                    return CollectionsKt.emptyList();
                }
                Iterable mmprTitles = CollectionsKt.listOf((Object[]) new String[]{"O Dia da Mudança", "Equipe nas Alturas", "Trabalho em Equipe", "Um Problema de Peso", "Diferenças Superadas", "A Hora da Comida", "Irmãs Mascaradas", "De Olho no Futuro", "Para Quem os Sinos Dobram", "Felizes Para Sempre", "A Noite dos Monstros", "Prisão do Medo", "Paz, Amor e Luta", "A Ilha da Ilusão — Parte 1", "A Ilha da Ilusão — Parte 2", "O Monstro da Poluição"});
                Iterable iterable = mmprTitles;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                int i = 0;
                for (Object obj : iterable) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    int i3 = i + 1;
                    arrayList.add(new TmdbEpisodeInfo(i3, (String) obj, StringsKt.padStart(String.valueOf(i3), 2, c3) + "/09/1993", null, null, 24, null));
                    i = i2;
                    c3 = '0';
                }
                return (List) arrayList;
            }
        }
        String[] strArr = new String[24];
        strArr[0] = "Piloto";
        strArr[1] = "Garganta Profunda";
        strArr[2] = "A Gaiola";
        strArr[3] = "O Elo Perdido";
        strArr[4] = "O Diabo de Jersey";
        strArr[5] = "Sombras";
        strArr[6] = "Fantasma na Máquina";
        strArr[7] = "Espaço";
        strArr[8] = "Gelo";
        strArr[9] = "Anjo Caído";
        strArr[10] = "Eva";
        strArr[c] = "Fogo";
        strArr[c2] = "Além do Mar";
        strArr[13] = "Transgênero";
        strArr[14] = "Lázaro";
        strArr[15] = "Coração das Trevas";
        strArr[16] = "Seres da Noite";
        strArr[17] = "O Homem das Cavernas";
        strArr[18] = "Metamorfose";
        strArr[19] = "A Luz Vermelha";
        strArr[20] = "Ressurreição";
        strArr[21] = "Volta ao Passado";
        strArr[22] = "Roland";
        strArr[23] = "O Frasco de Erlenmeyer";
        List xFilesS1 = CollectionsKt.listOf((Object[]) strArr);
        List list = xFilesS1;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i4 = 0;
        for (Object obj2 : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i6 = i4 + 1;
            arrayList2.add(new TmdbEpisodeInfo(i6, (String) obj2, StringsKt.padStart(String.valueOf(i6), 2, '0') + "/09/1993", null, null, 24, null));
            i4 = i5;
            xFilesS1 = xFilesS1;
        }
        return (List) arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TmdbSearchResult> getFallbackSearchResults(String query) {
        String str;
        String lowerCase = query.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String q = StringsKt.trim((CharSequence) lowerCase).toString();
        List list = new ArrayList();
        if (StringsKt.contains$default((CharSequence) q, (CharSequence) "arquivo", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) q, (CharSequence) "x-files", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) q, (CharSequence) "x files", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) q, (CharSequence) "mulder", false, 2, (Object) null)) {
            list.add(new TmdbSearchResult(4087, "Arquivo X", "The X-Files", "1993-09-10", "Dois agentes do FBI, Fox Mulder e Dana Scully, investigam casos não explicados e paranormais conhecidos como Arquivos X.", "https://image.tmdb.org/t/p/w500/7XIUqYyXz3p9LdZg44M2k028iN4.jpg", "https://image.tmdb.org/t/p/original/bUcu881k5vWb6e3fB1a4Ym8u1F1.jpg", 8.4d));
        }
        if (StringsKt.contains$default((CharSequence) q, (CharSequence) "power", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) q, (CharSequence) "ranger", false, 2, (Object) null)) {
            list.add(new TmdbSearchResult(2328, "Power Rangers", "Mighty Morphin Power Rangers", "1993-08-28", "Cinco adolescentes com garra e atitude são recrutados pelo sábio Zordon para defender a Terra contra a feiticeira Rita Repulsa.", "https://image.tmdb.org/t/p/w500/mXpE9c4wWfM5m1kE0vIeQ7q5x9b.jpg", "https://image.tmdb.org/t/p/original/9rVbTqD4tU3Kz1G1pY2e3w5l7m0.jpg", 7.6d));
        }
        if (StringsKt.contains$default((CharSequence) q, (CharSequence) "blazar", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) q, (CharSequence) "ultra", false, 2, (Object) null)) {
            list.add(new TmdbSearchResult(225139, "Ultraman Blazar", "ウルトラマンブレーザー", "2023-07-08", "Capitão Gento Warabino lidera a equipe SKaRD e se funde com um gigante de luz primordial para deter catástrofes Kaiju.", "https://image.tmdb.org/t/p/w500/y1j2k3l4m5n6o7p8q9r0s.jpg", null, 8.1d, 64, null));
        }
        if (StringsKt.contains$default((CharSequence) q, (CharSequence) "kamen", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) q, (CharSequence) "rider", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) q, (CharSequence) "wizard", false, 2, (Object) null)) {
            list.add(new TmdbSearchResult(46420, "Kamen Rider Wizard", "仮面ライダーウィザード", "2012-09-02", "Haruto Souma utiliza anéis arcanos e seu WizarDriver para lutar contra os temíveis Phantoms e proteger a esperança.", "https://image.tmdb.org/t/p/w500/kamen_rider_wizard.jpg", null, 7.8d, 64, null));
        }
        if (StringsKt.contains$default((CharSequence) q, (CharSequence) "supernatural", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) q, (CharSequence) "sobrenatural", false, 2, (Object) null)) {
            list.add(new TmdbSearchResult(1622, "Sobrenatural", "Supernatural", "2005-09-13", "Dois irmãos seguem as pegadas do pai como caçadores, lutando contra seres sobrenaturais e salvando pessoas.", "https://image.tmdb.org/t/p/w500/KoYWXbn4Tz9i4U17G0b7k4l0k.jpg", null, 8.3d, 64, null));
        }
        if (list.isEmpty()) {
            int coerceAtLeast = (RangesKt.coerceAtLeast(query.hashCode(), 0) % 9000) + 1000;
            if (!(query.length() > 0)) {
                str = query;
            } else {
                StringBuilder sb = new StringBuilder();
                String valueOf = String.valueOf(query.charAt(0));
                Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                StringBuilder append = sb.append((Object) upperCase);
                String substring = query.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                str = append.append(substring).toString();
            }
            list.add(new TmdbSearchResult(coerceAtLeast, str, query, "2024-01-01", "Série encontrada no catálogo online com dados disponíveis para importação automática.", null, null, 8.0d, 64, null));
        }
        return list;
    }
}

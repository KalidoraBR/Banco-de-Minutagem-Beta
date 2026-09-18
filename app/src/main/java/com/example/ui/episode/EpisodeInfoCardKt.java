package com.example.ui.episode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.example.model.Episode;
import com.example.model.EpisodeStatus;
import com.example.model.Season;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: EpisodeInfoCard.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"EpisodeInfoCard", "", "episode", "Lcom/example/model/Episode;", "season", "Lcom/example/model/Season;", "seriesTitle", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/model/Episode;Lcom/example/model/Season;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EpisodeInfoCardKt {

    /* compiled from: EpisodeInfoCard.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EpisodeStatus.values().length];
            try {
                iArr[EpisodeStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EpisodeStatus.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EpisodeStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeInfoCard$lambda$9(Episode episode, Season season, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EpisodeInfoCard(episode, season, str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0be2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0ead  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0eb9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0ef0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x1046  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0f06  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0ebf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0c3d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0bf4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0b08 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0810 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x096a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EpisodeInfoCard(final com.example.model.Episode r206, final com.example.model.Season r207, final java.lang.String r208, androidx.compose.ui.Modifier r209, androidx.compose.runtime.Composer r210, final int r211, final int r212) {
        /*
            Method dump skipped, instructions count: 4206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.episode.EpisodeInfoCardKt.EpisodeInfoCard(com.example.model.Episode, com.example.model.Season, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

package com.example.ui.season;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material.icons.filled.RemoveKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.NotificationCompat;
import com.example.model.Episode;
import com.example.model.EpisodeStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EpisodeCard.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"EpisodeCard", "", "episode", "Lcom/example/model/Episode;", "isNextEpisode", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/model/Episode;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EpisodeStatusIndicator", NotificationCompat.CATEGORY_STATUS, "Lcom/example/model/EpisodeStatus;", "episodeNumber", "", "(Lcom/example/model/EpisodeStatus;ZILandroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EpisodeCardKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeCard$lambda$2(Episode episode, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EpisodeCard(episode, z, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit EpisodeStatusIndicator$lambda$7(EpisodeStatus episodeStatus, boolean z, int i, int i2, Composer composer, int i3) {
        EpisodeStatusIndicator(episodeStatus, z, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EpisodeCard(final com.example.model.Episode r109, final boolean r110, final kotlin.jvm.functions.Function0<kotlin.Unit> r111, androidx.compose.ui.Modifier r112, androidx.compose.runtime.Composer r113, final int r114, final int r115) {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.season.EpisodeCardKt.EpisodeCard(com.example.model.Episode, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void EpisodeStatusIndicator(final EpisodeStatus status, final boolean isNextEpisode, final int episodeNumber, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0 function0;
        long m4157copywmQWz5c;
        Function0 function02;
        Composer composer;
        long m4157copywmQWz5c2;
        Function0 function03;
        Composer composer2;
        int i;
        long m4157copywmQWz5c3;
        Function0 function04;
        Composer $composer3 = $composer.startRestartGroup(-624143773);
        ComposerKt.sourceInformation($composer3, "C(EpisodeStatusIndicator)P(2,1):EpisodeCard.kt#98f12s");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(status.ordinal()) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isNextEpisode) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(episodeNumber) ? 256 : 128;
        }
        if (($dirty & 147) == 146 && $composer3.getSkipping()) {
            $composer3.skipToGroupEnd();
            $composer2 = $composer3;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-624143773, $dirty, -1, "com.example.ui.season.EpisodeStatusIndicator (EpisodeCard.kt:145)");
            }
            float indicatorSize = Dp.m6622constructorimpl(25);
            RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
            if (!isNextEpisode) {
                if (status != EpisodeStatus.COMPLETED) {
                    if (status == EpisodeStatus.PARTIAL) {
                        $composer3.startReplaceGroup(-951860715);
                        ComposerKt.sourceInformation($composer3, "192@7229L626");
                        Modifier clip = ClipKt.clip(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, indicatorSize), circleShape);
                        m4157copywmQWz5c = Color.m4157copywmQWz5c(r26, (r12 & 1) != 0 ? Color.m4161getAlphaimpl(r26) : 0.22f, (r12 & 2) != 0 ? Color.m4165getRedimpl(r26) : 0.0f, (r12 & 4) != 0 ? Color.m4164getGreenimpl(r26) : 0.0f, (r12 & 8) != 0 ? Color.m4162getBlueimpl(ColorKt.Color(4292441862L)) : 0.0f);
                        Modifier testTag = TestTagKt.testTag(BorderKt.m236borderxT4_qwU(BackgroundKt.m225backgroundbw27NRU$default(clip, m4157copywmQWz5c, null, 2, null), Dp.m6622constructorimpl((float) 1.2d), ColorKt.Color(4294688548L), circleShape), "episode_status_partial_" + episodeNumber);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier($composer3, testTag);
                        Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer3.startReusableNode();
                        if ($composer3.getInserting()) {
                            function02 = constructor;
                            $composer3.createNode(function02);
                        } else {
                            function02 = constructor;
                            $composer3.useNode();
                        }
                        Composer m3652constructorimpl = Updater.m3652constructorimpl($composer3);
                        Updater.m3659setimpl(m3652constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3659setimpl(m3652constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3652constructorimpl.getInserting()) {
                            composer = $composer3;
                        } else {
                            composer = $composer3;
                            if (Intrinsics.areEqual(m3652constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                int i3 = (i2 >> 6) & 14;
                                Composer composer3 = composer;
                                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                int i4 = ((48 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart(composer3, -355467051, "C201@7644L197:EpisodeCard.kt#98f12s");
                                BoxKt.Box(BackgroundKt.m225backgroundbw27NRU$default(ClipKt.clip(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(11)), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4294688548L), null, 2, null), composer3, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                $composer3.endReplaceGroup();
                                $composer2 = $composer3;
                            }
                        }
                        m3652constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3652constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m3659setimpl(m3652constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i32 = (i2 >> 6) & 14;
                        Composer composer32 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer32, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        int i42 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer32, -355467051, "C201@7644L197:EpisodeCard.kt#98f12s");
                        BoxKt.Box(BackgroundKt.m225backgroundbw27NRU$default(ClipKt.clip(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(11)), RoundedCornerShapeKt.getCircleShape()), ColorKt.Color(4294688548L), null, 2, null), composer32, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        $composer3.endReplaceGroup();
                        $composer2 = $composer3;
                    } else {
                        $composer3.startReplaceGroup(-951153078);
                        ComposerKt.sourceInformation($composer3, "212@7942L637");
                        Modifier testTag2 = TestTagKt.testTag(BorderKt.m236borderxT4_qwU(BackgroundKt.m225backgroundbw27NRU$default(ClipKt.clip(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, indicatorSize), circleShape), ColorKt.Color(4280166715L), null, 2, null), Dp.m6622constructorimpl(1), ColorKt.Color(4282865001L), circleShape), "episode_status_pending_" + episodeNumber);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier($composer3, testTag2);
                        Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        $composer2 = $composer3;
                        int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!($composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer3.startReusableNode();
                        if ($composer3.getInserting()) {
                            function0 = constructor2;
                            $composer3.createNode(function0);
                        } else {
                            function0 = constructor2;
                            $composer3.useNode();
                        }
                        Composer m3652constructorimpl2 = Updater.m3652constructorimpl($composer3);
                        Updater.m3659setimpl(m3652constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3659setimpl(m3652constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3652constructorimpl2.getInserting() && Intrinsics.areEqual(m3652constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            Updater.m3659setimpl(m3652constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i6 = (i5 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            int i7 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer3, 1403527347, "C221@8335L230:EpisodeCard.kt#98f12s");
                            IconKt.m2150Iconww6aTOc(RemoveKt.getRemove(Icons.INSTANCE.getDefault()), "Pendente", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(13)), ColorKt.Color(4287931320L), $composer3, 3504, 0);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            $composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            $composer2.endReplaceGroup();
                        }
                        m3652constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3652constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m3659setimpl(m3652constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i62 = (i5 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                        int i72 = ((48 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer3, 1403527347, "C221@8335L230:EpisodeCard.kt#98f12s");
                        IconKt.m2150Iconww6aTOc(RemoveKt.getRemove(Icons.INSTANCE.getDefault()), "Pendente", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(13)), ColorKt.Color(4287931320L), $composer3, 3504, 0);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        $composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        $composer2.endReplaceGroup();
                    }
                } else {
                    $composer3.startReplaceGroup(-952621486);
                    ComposerKt.sourceInformation($composer3, "172@6461L661");
                    Modifier clip2 = ClipKt.clip(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, indicatorSize), circleShape);
                    m4157copywmQWz5c2 = Color.m4157copywmQWz5c(r26, (r12 & 1) != 0 ? Color.m4161getAlphaimpl(r26) : 0.22f, (r12 & 2) != 0 ? Color.m4165getRedimpl(r26) : 0.0f, (r12 & 4) != 0 ? Color.m4164getGreenimpl(r26) : 0.0f, (r12 & 8) != 0 ? Color.m4162getBlueimpl(ColorKt.Color(4278556265L)) : 0.0f);
                    Modifier testTag3 = TestTagKt.testTag(BorderKt.m236borderxT4_qwU(BackgroundKt.m225backgroundbw27NRU$default(clip2, m4157copywmQWz5c2, null, 2, null), Dp.m6622constructorimpl((float) 1.2d), ColorKt.Color(4279286145L), circleShape), "episode_status_completed_" + episodeNumber);
                    Alignment center3 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier($composer3, testTag3);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i8 = ((((48 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if ($composer3.getInserting()) {
                        function03 = constructor3;
                        $composer3.createNode(function03);
                    } else {
                        function03 = constructor3;
                        $composer3.useNode();
                    }
                    Composer m3652constructorimpl3 = Updater.m3652constructorimpl($composer3);
                    Updater.m3659setimpl(m3652constructorimpl3, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3659setimpl(m3652constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3652constructorimpl3.getInserting()) {
                        composer2 = $composer3;
                        i = currentCompositeKeyHash3;
                    } else {
                        composer2 = $composer3;
                        i = currentCompositeKeyHash3;
                        if (Intrinsics.areEqual(m3652constructorimpl3.rememberedValue(), Integer.valueOf(i))) {
                            Updater.m3659setimpl(m3652constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i9 = (i8 >> 6) & 14;
                            Composer composer4 = composer2;
                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                            int i10 = ((48 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer4, 928445139, "C181@6878L230:EpisodeCard.kt#98f12s");
                            IconKt.m2150Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "Concluído", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(14)), ColorKt.Color(4281652121L), composer4, 3504, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            $composer3.endReplaceGroup();
                            $composer2 = $composer3;
                        }
                    }
                    m3652constructorimpl3.updateRememberedValue(Integer.valueOf(i));
                    m3652constructorimpl3.apply(Integer.valueOf(i), setCompositeKeyHash3);
                    Updater.m3659setimpl(m3652constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i92 = (i8 >> 6) & 14;
                    Composer composer42 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer42, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
                    int i102 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer42, 928445139, "C181@6878L230:EpisodeCard.kt#98f12s");
                    IconKt.m2150Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "Concluído", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(14)), ColorKt.Color(4281652121L), composer42, 3504, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    ComposerKt.sourceInformationMarkerEnd(composer42);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    $composer3.endReplaceGroup();
                    $composer2 = $composer3;
                }
            } else {
                $composer3.startReplaceGroup(-953399028);
                ComposerKt.sourceInformation($composer3, "152@5677L667");
                Modifier clip3 = ClipKt.clip(SizeKt.m715size3ABfNKs(Modifier.INSTANCE, indicatorSize), circleShape);
                m4157copywmQWz5c3 = Color.m4157copywmQWz5c(r22, (r12 & 1) != 0 ? Color.m4161getAlphaimpl(r22) : 0.25f, (r12 & 2) != 0 ? Color.m4165getRedimpl(r22) : 0.0f, (r12 & 4) != 0 ? Color.m4164getGreenimpl(r22) : 0.0f, (r12 & 8) != 0 ? Color.m4162getBlueimpl(ColorKt.Color(4280110808L)) : 0.0f);
                Modifier testTag4 = TestTagKt.testTag(BorderKt.m236borderxT4_qwU(BackgroundKt.m225backgroundbw27NRU$default(clip3, m4157copywmQWz5c3, null, 2, null), Dp.m6622constructorimpl((float) 1.2d), ColorKt.Color(4282090230L), circleShape), "episode_status_next_" + episodeNumber);
                Alignment center4 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap currentCompositionLocalMap4 = $composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier($composer3, testTag4);
                Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int i11 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function04 = constructor4;
                    $composer3.createNode(function04);
                } else {
                    function04 = constructor4;
                    $composer3.useNode();
                }
                Composer m3652constructorimpl4 = Updater.m3652constructorimpl($composer3);
                Updater.m3659setimpl(m3652constructorimpl4, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3659setimpl(m3652constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3652constructorimpl4.getInserting() && Intrinsics.areEqual(m3652constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    Updater.m3659setimpl(m3652constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i12 = (i11 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    int i13 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -598133263, "C161@6089L241:EpisodeCard.kt#98f12s");
                    IconKt.m2150Iconww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), "Próximo episódio", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(15)), ColorKt.Color(4284524026L), $composer3, 3504, 0);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endReplaceGroup();
                    $composer2 = $composer3;
                }
                m3652constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3652constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                Updater.m3659setimpl(m3652constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i122 = (i11 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance52 = BoxScopeInstance.INSTANCE;
                int i132 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -598133263, "C161@6089L241:EpisodeCard.kt#98f12s");
                IconKt.m2150Iconww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), "Próximo episódio", SizeKt.m715size3ABfNKs(Modifier.INSTANCE, Dp.m6622constructorimpl(15)), ColorKt.Color(4284524026L), $composer3, 3504, 0);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
                $composer2 = $composer3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.ui.season.EpisodeCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EpisodeCardKt.EpisodeStatusIndicator$lambda$7(EpisodeStatus.this, isNextEpisode, episodeNumber, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

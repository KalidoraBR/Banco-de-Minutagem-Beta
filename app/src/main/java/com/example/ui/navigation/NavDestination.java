package com.example.ui.navigation;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ExploreKt;
import androidx.compose.material.icons.filled.HomeKt;
import androidx.compose.material.icons.filled.MoreHorizKt;
import androidx.compose.material.icons.filled.VideoLibraryKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: NavDestination.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/example/ui/navigation/NavDestination;", "", "title", "", "selectedIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "unselectedIcon", "testTag", "<init>", "(Ljava/lang/String;ILjava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSelectedIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getUnselectedIcon", "getTestTag", "HOME", "EXPLORE", "MY_SERIES", "MORE", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum NavDestination {
    HOME("Início", HomeKt.getHome(Icons.Filled.INSTANCE), androidx.compose.material.icons.outlined.HomeKt.getHome(Icons.Outlined.INSTANCE), "nav_item_home"),
    EXPLORE("Explorar", ExploreKt.getExplore(Icons.Filled.INSTANCE), androidx.compose.material.icons.outlined.ExploreKt.getExplore(Icons.Outlined.INSTANCE), "nav_item_explore"),
    MY_SERIES("Minhas séries", VideoLibraryKt.getVideoLibrary(Icons.Filled.INSTANCE), androidx.compose.material.icons.outlined.VideoLibraryKt.getVideoLibrary(Icons.Outlined.INSTANCE), "nav_item_my_series"),
    MORE("Mais", MoreHorizKt.getMoreHoriz(Icons.Filled.INSTANCE), androidx.compose.material.icons.outlined.MoreHorizKt.getMoreHoriz(Icons.Outlined.INSTANCE), "nav_item_more");

    private final ImageVector selectedIcon;
    private final String testTag;
    private final String title;
    private final ImageVector unselectedIcon;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<NavDestination> getEntries() {
        return $ENTRIES;
    }

    NavDestination(String title, ImageVector selectedIcon, ImageVector unselectedIcon, String testTag) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unselectedIcon = unselectedIcon;
        this.testTag = testTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImageVector getSelectedIcon() {
        return this.selectedIcon;
    }

    public final ImageVector getUnselectedIcon() {
        return this.unselectedIcon;
    }

    public final String getTestTag() {
        return this.testTag;
    }
}

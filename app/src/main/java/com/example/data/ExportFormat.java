package com.example.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: ExportManager.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/example/data/ExportFormat;", "", "title", "", "extension", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getExtension", "getDescription", "CSV", "JSON", "SPREADSHEET", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ExportFormat {
    CSV("CSV Padronizado", "csv", "Compatível com imdb_id, segment_type, season, episode, start, end, tvdb_id"),
    JSON("JSON Estruturado", "json", "imdb_id, segment_type, season, episode, start_sec, end_sec, tvdb_id"),
    SPREADSHEET("Modo Planilha (Abas por Série)", "tsv", "Planilha única consolidada com uma aba/seção dedicada por série");

    private final String description;
    private final String extension;
    private final String title;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<ExportFormat> getEntries() {
        return $ENTRIES;
    }

    ExportFormat(String title, String extension, String description) {
        this.title = title;
        this.extension = extension;
        this.description = description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final String getTitle() {
        return this.title;
    }
}

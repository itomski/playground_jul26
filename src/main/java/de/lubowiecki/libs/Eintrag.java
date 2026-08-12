package de.lubowiecki.libs;

import java.time.LocalDateTime;

public class Eintrag {

    private String title;
    private LocalDateTime erzeugtAm;
    private String content;

    public Eintrag() {
    }

    public Eintrag(String title, LocalDateTime erzeugtAm, String content) {
        this.title = title;
        this.erzeugtAm = erzeugtAm;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getErzeugtAm() {
        return erzeugtAm;
    }

    public String getContent() {
        return content;
    }
}

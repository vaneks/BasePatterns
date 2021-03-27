package main.java.com.vaneks.patterns.behavioral.memento;

import java.util.Date;

public class Save {
    private final String version;
    private final String text;
    private final Date data;

    public Save(String version, String text) {
        this.version = version;
        this.text = text;
        this.data = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getData() {
        return data;
    }

    public String getText() {
        return text;
    }
}

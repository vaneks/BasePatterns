package main.java.com.vaneks.patterns.behavioral.memento;

import java.util.Date;

public class Editor {
    private String version;
    private String text;
    private Date date;

    public void setVersionAndDate(String version, String text) {
        this.version = version;
        this.date = new Date();
        this.text = text;
    }

    public Save save() {
        return new Save(version, text);
    }
    public void open(Save save) {
        version = save.getVersion();
        text = save.getText();
        date = save.getData();
    }

    @Override
    public String toString() {
        return "Editor: \n" +
                "version= " + version +
                "\ntext= " + text +
                "\ndate= " + date + "\n"; }
}

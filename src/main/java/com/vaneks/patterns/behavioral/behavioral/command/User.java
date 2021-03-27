package main.java.com.vaneks.patterns.behavioral.command;

public class User {
    Command select;
    Command copy;
    Command delete;
    Command undo;

    public User(Command select, Command copy, Command delete, Command undo) {
        this.select = select;
        this.copy = copy;
        this.delete = delete;
        this.undo = undo;
    }
    public void selectText() {
        select.execute();
    }
    public void copyText() {
        copy.execute();
    }
    public void deleteText() {
        delete.execute();
    }
    public void undoText() {
        undo.execute();
    }
}

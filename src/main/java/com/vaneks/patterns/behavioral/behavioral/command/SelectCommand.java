package main.java.com.vaneks.patterns.behavioral.command;

public class SelectCommand implements Command{
    Editor editor;

    public SelectCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.getSelection();
    }
}

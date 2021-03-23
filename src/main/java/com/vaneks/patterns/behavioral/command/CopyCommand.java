package main.java.com.vaneks.patterns.behavioral.command;

public class CopyCommand implements Command {
    Editor editor;

    public CopyCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copySelection();
    }
}

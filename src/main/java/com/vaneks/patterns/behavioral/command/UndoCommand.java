package main.java.com.vaneks.patterns.behavioral.command;

public class UndoCommand implements Command {
    Editor editor;

    public UndoCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.undo();
    }
}

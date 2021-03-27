package main.java.com.vaneks.patterns.behavioral.command;

public class DeleteCommand implements Command {
    Editor editor;

    public DeleteCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.deleteSelection();
    }
}

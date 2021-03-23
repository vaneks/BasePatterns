package main.java.com.vaneks.patterns.behavioral.command;

public class ProgramRun {
    public static void main(String[] args) {
        Editor editor = new Editor();
        User user = new User(
                new SelectCommand(editor),
                new CopyCommand(editor),
                new DeleteCommand(editor),
                new UndoCommand(editor)
        );
        user.copyText();
        user.selectText();
        user.undoText();
        user.deleteText();
    }
}

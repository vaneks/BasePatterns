package main.java.com.vaneks.patterns.behavioral.memento;

public class ProgramRun {
    public static void main(String[] args) throws InterruptedException {
        Editor editor = new Editor();
        SaveRepo saveRepo = new SaveRepo();
        editor.setVersionAndDate("1.0", "First version");
        System.out.println(editor);
        saveRepo.setSave(editor.save());
        Thread.sleep(2000);
        editor.setVersionAndDate("1.1", "New text");
        System.out.println(editor);
        saveRepo.setSave(editor.save());
        editor.setVersionAndDate("1.2", "Second text");
        System.out.println(editor);
        saveRepo.setSave(editor.save());
        editor.open(saveRepo.getSave("1.0"));
        System.out.println(editor);
    }
}

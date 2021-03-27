package main.java.com.vaneks.patterns.behavioral.command;

public class Editor {
    public void getSelection() {
        System.out.println("Select text");
    }
    public void deleteSelection() {
        System.out.println("Delete text");
    }
    public void copySelection() {
        System.out.println("Copy text");
    }
    public void undo() {
        System.out.println("Undo");
    }
}

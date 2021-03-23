package main.java.com.vaneks.behavioral.chainOfResponsibility;

public class SimpleQuest extends Notifier {
    public SimpleQuest(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Enter 1, if your computer..." + message);
    }
}

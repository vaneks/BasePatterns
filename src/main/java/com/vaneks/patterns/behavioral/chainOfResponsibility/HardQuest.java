package main.java.com.vaneks.patterns.behavioral.chainOfResponsibility;

public class HardQuest extends Notifier{
    public HardQuest(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Hello, my name's Nick. Can i help you? " + message);
    }
}

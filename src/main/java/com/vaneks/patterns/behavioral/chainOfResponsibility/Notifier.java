package main.java.com.vaneks.patterns.behavioral.chainOfResponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier newNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.newNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level) {
        if(level >= priority) {
            write(message);
        }
        if(newNotifier != null) {
            newNotifier.notifyManager(message, level);
        }
    }
    public abstract void write(String message);
}

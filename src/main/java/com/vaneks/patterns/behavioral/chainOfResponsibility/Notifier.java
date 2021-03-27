package main.java.com.vaneks.patterns.behavioral.chainOfResponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier newtNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.newtNotifier = newtNotifier;
    }

    public void notifyManager(String message, int level) {
        if(level >= priority) {
            write(message);
        }
        if(newtNotifier != null) {
            newtNotifier.notifyManager(message, level);
        }
    }
    public abstract void write(String message);
}

package main.java.com.vaneks.behavioral.chainOfResponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier newxtNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNewxtNotifier(Notifier newxtNotifier) {
        this.newxtNotifier = newxtNotifier;
    }

    public void notifyManager(String message, int level) {
        if(level >= priority) {
            write(message);
        }
        if(newxtNotifier != null) {
            newxtNotifier.notifyManager(message, level);
        }
    }
    public abstract void write(String message);
}

package main.java.com.vaneks.patterns.behavioral.observer;

public interface Observed {
    public void  addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyCustomers();
}

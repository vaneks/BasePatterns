package main.java.com.vaneks.behavioral.observer;

public interface Observed {
    public void  addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyCustomers();
}

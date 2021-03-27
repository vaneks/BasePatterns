package main.java.com.vaneks.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore implements Observed {
    List<String> products = new ArrayList<>();
    List<Observer> customers = new ArrayList<>();
    public void addProducts(String product) {
        products.add(product);
        notifyCustomers();
    }
    public void removeProduct(String product) {
        products.remove(product);
        notifyCustomers();
    }
    @Override
    public void addObserver(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyCustomers() {
        for(Observer observer: customers) {
            observer.handleEvent(this.products);
        }
    }
}

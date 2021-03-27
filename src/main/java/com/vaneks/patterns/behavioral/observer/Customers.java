package main.java.com.vaneks.patterns.behavioral.observer;

import java.util.List;

public class Customers implements Observer {
    String name;

    public Customers(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> products) {
        System.out.println("Hello " + name + " ! " + "We have some products\n" + products + "\n");
    }
}

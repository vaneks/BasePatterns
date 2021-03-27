package main.java.com.vaneks.patterns.behavioral.observer;

import javax.management.ObjectName;

public class ProgramRun {
    public static void main(String[] args) {
        OnlineStore onlineStore = new OnlineStore();
        onlineStore.addProducts("Monitor");
        onlineStore.addProducts("KeyBoard");

        Observer customer1 = new Customers("Nick");
        Observer customer2 = new Customers("Ivan");

        onlineStore.addObserver(customer1);
        onlineStore.addObserver(customer2);
        onlineStore.addProducts("Mouse");
        onlineStore.removeProduct("KeyBoard");
    }
}

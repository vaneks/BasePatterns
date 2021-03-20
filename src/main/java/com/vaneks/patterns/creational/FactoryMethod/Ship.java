package main.java.com.vaneks.patterns.creational.FactoryMethod;

public class Ship implements Transport {

    @Override
    public void transport() {
        System.out.println("The ship transports...");
    }
}

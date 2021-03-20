package main.java.com.vaneks.patterns.creational.FactoryMethod;

public class Car implements Transport {

    @Override
    public void transport() {
        System.out.println("The car transports...");
    }
}

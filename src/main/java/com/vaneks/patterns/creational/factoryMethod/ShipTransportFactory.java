package main.java.com.vaneks.patterns.creational.factoryMethod;

public class ShipTransportFactory implements TransportFactory{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

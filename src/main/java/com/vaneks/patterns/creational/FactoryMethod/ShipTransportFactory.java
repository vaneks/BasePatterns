package main.java.com.vaneks.patterns.creational.FactoryMethod;

public class ShipTransportFactory implements TransportFactory{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

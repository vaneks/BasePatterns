package main.java.com.vaneks.patterns.creational.factoryMethod;

public class CarTransportFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Car();
    }
}

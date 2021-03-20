package main.java.com.vaneks.patterns.creational.FactoryMethod;

public class CarTransportFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Car();
    }
}

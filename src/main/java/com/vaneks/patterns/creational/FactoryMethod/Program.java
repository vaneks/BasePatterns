package main.java.com.vaneks.patterns.creational.FactoryMethod;

public class Program {
    public static void main(String[] args) {
        TransportFactory transportFactory = new CarTransportFactory();
        Transport transport = transportFactory.createTransport();
        transport.transport();
    }
}

package main.java.com.vaneks.patterns.creational.builder;

public class ToyotaCarBuilder extends CarBuilder{
    @Override
    void buildModel() {
        car.setModel("Camry");
    }

    @Override
    void buildColor() {
        car.setColor(Color.Black);
    }

    @Override
    void buildEngine() {
        car.setEngine(2.5);
    }

    @Override
    void buildPrice() {
        car.setPrice(20000);
    }
}

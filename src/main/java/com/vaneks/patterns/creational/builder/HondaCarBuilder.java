package main.java.com.vaneks.patterns.creational.builder;

public class HondaCarBuilder extends CarBuilder{

    @Override
    void buildModel() {
        car.setModel("Fit");
    }

    @Override
    void buildColor() {
        car.setColor(Color.Blue);
    }

    @Override
    void buildEngine() {
        car.setEngine(1.0);
    }

    @Override
    void buildPrice() {
        car.setPrice(10000);
    }
}

package main.java.com.vaneks.patterns.creational.Builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }
    Car buildCar() {
        builder.createCar();
        builder.buildModel();
        builder.buildColor();
        builder.buildEngine();
        builder.buildPrice();
        Car car = builder.getCar();
        return car;
    }
}

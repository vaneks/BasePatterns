package main.java.com.vaneks.patterns.creational.Builder;

public abstract class CarBuilder {

    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildModel();
    abstract void buildColor();
    abstract void buildEngine();
    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}

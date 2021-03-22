package main.java.com.vaneks.patterns.creational.builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new ToyotaCarBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}

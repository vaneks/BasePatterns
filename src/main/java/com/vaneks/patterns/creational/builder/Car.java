package main.java.com.vaneks.patterns.creational.builder;

public class Car {

    private Color color;
    private String model;
    private double engine;
    private double price;

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';
    }
}


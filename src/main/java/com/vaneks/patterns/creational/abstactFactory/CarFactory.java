package main.java.com.vaneks.patterns.creational.abstactFactory;

public interface CarFactory {
    Sedan getSedan();
    Jeep getJeep();
    Crossover getCrossover();
}

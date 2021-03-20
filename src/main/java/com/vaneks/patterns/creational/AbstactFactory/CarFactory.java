package main.java.com.vaneks.patterns.creational.AbstactFactory;

public interface CarFactory {
    Sedan getSedan();
    Jeep getJeep();
    Crossover getCrossover();
}

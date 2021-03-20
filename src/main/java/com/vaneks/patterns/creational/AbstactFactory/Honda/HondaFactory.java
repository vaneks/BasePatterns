package main.java.com.vaneks.patterns.creational.AbstactFactory.Honda;

import main.java.com.vaneks.patterns.creational.AbstactFactory.CarFactory;
import main.java.com.vaneks.patterns.creational.AbstactFactory.Crossover;
import main.java.com.vaneks.patterns.creational.AbstactFactory.Jeep;
import main.java.com.vaneks.patterns.creational.AbstactFactory.Sedan;

public class HondaFactory implements CarFactory {
    @Override
    public Sedan getSedan() {
        return new HondaSedan();
    }

    @Override
    public Jeep getJeep() {
        return new HondaJeep();
    }

    @Override
    public Crossover getCrossover() {
        return new HondaCrossover();
    }
}

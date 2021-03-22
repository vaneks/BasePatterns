package main.java.com.vaneks.patterns.creational.abstactFactory.Honda;

import main.java.com.vaneks.patterns.creational.abstactFactory.CarFactory;
import main.java.com.vaneks.patterns.creational.abstactFactory.Crossover;
import main.java.com.vaneks.patterns.creational.abstactFactory.Jeep;
import main.java.com.vaneks.patterns.creational.abstactFactory.Sedan;

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

package main.java.com.vaneks.patterns.creational.AbstactFactory.Honda;

import main.java.com.vaneks.patterns.creational.AbstactFactory.Crossover;

public class HondaCrossover implements Crossover {
    @Override
    public void createCrossover() {
        System.out.println("Creating HondaCrossover");
    }
}

package main.java.com.vaneks.patterns.creational.abstactFactory.Honda;

import main.java.com.vaneks.patterns.creational.abstactFactory.Crossover;

public class HondaCrossover implements Crossover {
    @Override
    public void createCrossover() {
        System.out.println("Creating HondaCrossover");
    }
}

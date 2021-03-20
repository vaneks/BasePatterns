package main.java.com.vaneks.patterns.creational.AbstactFactory;

import main.java.com.vaneks.patterns.creational.AbstactFactory.Honda.HondaFactory;

public class FactoryHondaInTokyo {
    public static void main(String[]args) {
        CarFactory carFactory = new HondaFactory();
        Sedan sedan = carFactory.getSedan();
        Jeep jeep = carFactory.getJeep();
        Crossover crossover = carFactory.getCrossover();
        System.out.println("Creating HondaFactoryCar");
        sedan.createSedan();
        jeep.createJeep();
        crossover.createCrossover();
    }
}

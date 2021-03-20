package main.java.com.vaneks.patterns.creational.AbstactFactory.Honda;

import main.java.com.vaneks.patterns.creational.AbstactFactory.Sedan;

public class HondaSedan implements Sedan {
    @Override
    public void createSedan() {
        System.out.println("Creating hondaSedan");
    }
}

package main.java.com.vaneks.patterns.creational.abstactFactory.Honda;

import main.java.com.vaneks.patterns.creational.abstactFactory.Sedan;

public class HondaSedan implements Sedan {
    @Override
    public void createSedan() {
        System.out.println("Creating hondaSedan");
    }
}

package main.java.com.vaneks.patterns.creational.AbstactFactory.Honda;

import main.java.com.vaneks.patterns.creational.AbstactFactory.Jeep;

public class HondaJeep implements Jeep {
    @Override
    public void createJeep() {
        System.out.println("Creating HondaJeep");
    }
}

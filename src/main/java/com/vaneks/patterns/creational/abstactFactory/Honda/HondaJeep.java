package main.java.com.vaneks.patterns.creational.abstactFactory.Honda;

import main.java.com.vaneks.patterns.creational.abstactFactory.Jeep;

public class HondaJeep implements Jeep {
    @Override
    public void createJeep() {
        System.out.println("Creating HondaJeep");
    }
}

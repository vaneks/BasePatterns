package main.java.com.vaneks.behavioral.visitor;

public class Test implements ProjectElement {
    @Override
    public void beWriter(Developer developer) {
        developer.create(this);
    }
}

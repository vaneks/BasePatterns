package main.java.com.vaneks.behavioral.visitor;

public class ProjectClass implements ProjectElement{

    @Override
    public void beWriter(Developer developer) {
        developer.create(this);
    }
}

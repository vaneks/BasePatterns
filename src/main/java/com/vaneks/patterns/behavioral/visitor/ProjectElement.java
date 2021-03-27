package main.java.com.vaneks.patterns.behavioral.visitor;

public interface ProjectElement {
    public void Accept(Visitor visitor);
}


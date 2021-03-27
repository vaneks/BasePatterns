package main.java.com.vaneks.patterns.behavioral.visitor;
public class ElementProjectClass implements ProjectElement{

    @Override
    public void Accept(Visitor visitor) {
        visitor.create(this);
    }
}

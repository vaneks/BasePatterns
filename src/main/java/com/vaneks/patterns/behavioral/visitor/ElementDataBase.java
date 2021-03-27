package main.java.com.vaneks.patterns.behavioral.visitor;

public class ElementDataBase implements ProjectElement {
    @Override
    public void Accept(Visitor visitor) {
        visitor.create(this);
    }
}

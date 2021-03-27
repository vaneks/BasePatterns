package main.java.com.vaneks.patterns.behavioral.visitor;

public interface Visitor {
    public void create(ElementProjectClass elementProjectClass);
    public void create(ElementDataBase elementDataBase);
    public void create(ElementTest elementTest);
}

package main.java.com.vaneks.patterns.behavioral.visitor;

public class SeniorVisitor implements Visitor {
    @Override
    public void create(ElementProjectClass elementProjectClass) {
        System.out.println("Rewriting code...");
    }

    @Override
    public void create(ElementDataBase elementDataBase) {
        System.out.println("Creating database...");
    }

    @Override
    public void create(ElementTest elementTest) {
        System.out.println("Creating test...");
    }
}

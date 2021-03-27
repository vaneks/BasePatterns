package main.java.com.vaneks.patterns.behavioral.visitor;

public class JuniorVisitor implements Visitor {
    @Override
    public void create(ElementProjectClass elementProjectClass) {
        System.out.println("Writing bad code...");
    }

    @Override
    public void create(ElementDataBase elementDataBase) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(ElementTest elementTest) {
        System.out.println("Create bad test...");
    }
}

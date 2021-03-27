package main.java.com.vaneks.behavioral.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting code...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Creating database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating test...");
    }
}

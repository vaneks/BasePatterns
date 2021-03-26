package main.java.com.vaneks.behavioral.visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing bad code...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Create bad test...");
    }
}

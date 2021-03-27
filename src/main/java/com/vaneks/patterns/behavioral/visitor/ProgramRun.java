package main.java.com.vaneks.patterns.behavioral.visitor;

public class ProgramRun {
    public static void main(String[] args) {
        Project project = new Project();
        Visitor junior = new JuniorVisitor();
        Visitor senior = new SeniorVisitor();

        System.out.println("Junior in Action...");
        project.Accept(junior);

        System.out.println("\n====================\n");

        System.out.println("Senior in Action...");
        project.Accept(senior);
    }
}

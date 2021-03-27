package main.java.com.vaneks.behavioral.visitor;

public class ProgramRun {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in Action...");
        project.beWriter(junior);

        System.out.println("\n====================\n");

        System.out.println("Senior in Action...");
        project.beWriter(senior);
    }
}

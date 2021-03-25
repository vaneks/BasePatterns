package main.java.com.vaneks.patterns.behavioral.template;

public class ProgramRun {
    public static void main(String[] args) {
        Template school = new School();
        Template university = new University();

        school.templateMethod();
        System.out.println("");
        university.templateMethod();
    }
}

package main.java.com.vaneks.patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"Project1", "Source source = new Source();");
        System.out.println(master);
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);
    }
}

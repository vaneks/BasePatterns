package main.java.com.vaneks.behavioral.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void beWriter(Developer developer) {
        for(ProjectElement projectElement:  projectElements) {
            projectElement.beWriter(developer);
        }
    }
}

package main.java.com.vaneks.patterns.behavioral.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ElementProjectClass(),
                new ElementDataBase(),
                new ElementTest()
        };
    }

    @Override
    public void Accept(Visitor visitor) {
        for(ProjectElement projectElement:  projectElements) {
            projectElement.Accept(visitor);
        }
    }
}

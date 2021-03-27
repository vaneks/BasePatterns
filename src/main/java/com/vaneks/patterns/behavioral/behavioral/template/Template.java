package main.java.com.vaneks.patterns.behavioral.template;

public abstract class Template {
    public void templateMethod() {
        enter();
        study();
        passExams();
        getDocument();
    }
    public abstract void enter();
    public abstract void study();
    public abstract void passExams();
    public abstract void getDocument();
}

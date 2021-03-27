package main.java.com.vaneks.patterns.behavioral.template;

public class University extends Template{
    @Override
    public void enter() {
        System.out.println("First curs");
    }

    @Override
    public void study() {
        System.out.println("University studies");
    }

    @Override
    public void passExams() {
        System.out.println("Diploma defense");
    }

    @Override
    public void getDocument() {
        System.out.println("Presentation of the diploma");
    }
}

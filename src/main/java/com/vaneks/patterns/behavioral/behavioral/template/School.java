package main.java.com.vaneks.patterns.behavioral.template;

import jdk.swing.interop.SwingInterOpUtils;

public class School extends Template{

    @Override
    public void enter() {
        System.out.println("First class");
    }

    @Override
    public void study() {
        System.out.println("Studying at school");
    }

    @Override
    public void passExams() {
        System.out.println("Final exams");
    }

    @Override
    public void getDocument() {
        System.out.println("Presentation of the certificate");
    }
}

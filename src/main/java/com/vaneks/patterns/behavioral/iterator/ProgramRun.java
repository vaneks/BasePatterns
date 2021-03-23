package main.java.com.vaneks.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProgramRun {
    public static void main(String[] args) {
        List<String> lessons = new ArrayList<>();
        lessons.add("mathematics");
        lessons.add("physics");
        lessons.add("history");
        lessons.add("English language");

        Student student = new Student("Nick Ivanov", lessons);
        Iterator iterator = student.getIterator();
        System.out.println("Student: " + student.name);
        System.out.println("Lessons: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}

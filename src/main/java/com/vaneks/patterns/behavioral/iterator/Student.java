package main.java.com.vaneks.patterns.behavioral.iterator;

import java.util.List;

public class Student implements Collection{
    String name;
    private List<String> lessons;

    public Student(String name, List<String> lessons) {
        this.name = name;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLessons() {
        return lessons;
    }

    public void setLessons(List<String> lessons) {
        this.lessons = lessons;
    }

    @Override
    public Iterator getIterator() {
        return new LessonIterator();
    }
    private class LessonIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if(index < lessons.size()) {
                return true;
            }
            return false;
        }


        @Override
        public Object next() {
            return lessons.get(index++);
        }
    }
}

package main.java.com.vaneks.patterns.behavioral.state;

public class Moderation implements State{
    @Override
    public void publish() {
        System.out.println("Document's state is MODERATION");
    }
}

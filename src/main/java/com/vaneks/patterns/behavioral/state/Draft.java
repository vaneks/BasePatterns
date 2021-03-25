package main.java.com.vaneks.patterns.behavioral.state;

public class Draft implements State{
    @Override
    public void publish() {
        System.out.println("Document's state is DRAFT");
    }
}

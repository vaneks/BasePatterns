package main.java.com.vaneks.patterns.behavioral.state;

public class Published implements State{
    @Override
    public void publish() {
        System.out.println("Document's state is PUBLISHED");
    }
}

package main.java.com.vaneks.patterns.behavioral.state;

public class ProgramRun {
    public static void main(String[] args) {
        State state = new Draft();
        Document document = new Document();
        document.setState(state);

        for(int i = 0; i < 10; i++) {
            document.publish();
            document.changeState();
        }
    }
}

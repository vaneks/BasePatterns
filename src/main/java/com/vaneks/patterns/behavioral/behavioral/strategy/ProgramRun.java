package main.java.com.vaneks.patterns.behavioral.strategy;

import main.java.com.vaneks.patterns.behavioral.state.Draft;
import main.java.com.vaneks.patterns.behavioral.state.Moderation;
import main.java.com.vaneks.patterns.behavioral.state.Published;
import main.java.com.vaneks.patterns.behavioral.state.State;

public class ProgramRun {
    public static void main(String[] args) {
        Document document = new Document();

        document.setState(new Draft());
        document.executeState();

        document.setState(new Moderation());
        document.executeState();

        document.setState(new Published());
        document.executeState();
    }
}

package main.java.com.vaneks.patterns.behavioral.strategy;

import main.java.com.vaneks.patterns.behavioral.state.Draft;
import main.java.com.vaneks.patterns.behavioral.state.Moderation;
import main.java.com.vaneks.patterns.behavioral.state.Published;
import main.java.com.vaneks.patterns.behavioral.state.State;

public class Document {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void executeState() {
        state.publish();
    }
}

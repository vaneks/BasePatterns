package main.java.com.vaneks.patterns.behavioral.observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> products);
}

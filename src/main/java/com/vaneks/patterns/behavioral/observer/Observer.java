package main.java.com.vaneks.behavioral.observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> products);
}

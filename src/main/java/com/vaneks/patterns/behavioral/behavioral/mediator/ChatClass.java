package main.java.com.vaneks.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatClass implements Chat {
    User dispatcher;
    List<User> pilots = new ArrayList<>();

    public void setDispatcher(User dispatcher) {
        this.dispatcher = dispatcher;
    }
    public void addPilot(User pilot){
        this.pilots.add(pilot);
    }

    @Override
    public void sendMessage(String message, User user) {
        dispatcher.getMessage(message);
        for(User u: pilots) {
            if(dispatcher == user) {
                u.getMessage(message);
            }
        }
    }
}

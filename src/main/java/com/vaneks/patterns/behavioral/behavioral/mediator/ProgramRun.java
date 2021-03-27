package main.java.com.vaneks.behavioral.mediator;

public class ProgramRun {
    public static void main(String[] args) {
        ChatClass chat = new ChatClass();
        User dispatcher = new Dispatcher(chat, "dispatcher");
        User pilot1 = new Pilot(chat,"pilot1");
        User pilot2 = new Pilot(chat,"pilot2");

        chat.setDispatcher(dispatcher);
        chat.addPilot(pilot1);
        chat.addPilot(pilot2);

        dispatcher.sendMessage("Hello.");
        System.out.println("");
        pilot1.sendMessage("Hi");

    }
}

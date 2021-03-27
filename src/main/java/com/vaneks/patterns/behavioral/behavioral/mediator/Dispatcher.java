package main.java.com.vaneks.behavioral.mediator;

public class Dispatcher implements User{
    Chat chat;
    String name;

    public Dispatcher(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name+ " receiving message " + message);
    }
}

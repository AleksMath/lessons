package Lesson9.iterfaces.interfaces.ex2;

public class Client {
    private final Messenger messenger;

    public Client(Messenger messenger) {
        this.messenger = messenger;
    }

    public void sendMessage() {
        messenger.sendMessage();
    }

    public void getMessage() {
        messenger.getMessage();
    }
}

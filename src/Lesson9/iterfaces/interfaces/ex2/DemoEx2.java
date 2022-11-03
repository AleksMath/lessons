package Lesson9.iterfaces.interfaces.ex2;

public class DemoEx2 {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone(new Telegram());
        smartPhone.startapplication();

        Client client = new Client(new Telegram());
        client.sendMessage();
        client.getMessage();
        Application.test();
    }
}

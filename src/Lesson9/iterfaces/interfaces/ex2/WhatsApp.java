package Lesson9.iterfaces.interfaces.ex2;

public class WhatsApp implements Messenger, Application {
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в ватсап");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение в ватсап");
    }

}

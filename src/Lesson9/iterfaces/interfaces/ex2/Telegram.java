package Lesson9.iterfaces.interfaces.ex2;

public class Telegram implements Messenger,Application {
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в телеграмм");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение в телеграмм");
    }


}

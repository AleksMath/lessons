package Lesson9.iterfaces.interfaces.ex2;

public class Viber implements Messenger, Application {
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в вайбер");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение в вайбер");
    }
}

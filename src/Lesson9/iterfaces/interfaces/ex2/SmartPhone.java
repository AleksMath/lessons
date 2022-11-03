package Lesson9.iterfaces.interfaces.ex2;

public class SmartPhone {
    private final Application application;

    public SmartPhone(Application application) {
        this.application = application;
    }

    public void startapplication(){
        application.start();
    }
}

package Lesson9.iterfaces.interfaces.ex2;

public interface Application {
     default void start() {
          System.out.println("Мобильное приложение запускается");
     }
     static void test(){
          System.out.println("This is static method");
     }
}

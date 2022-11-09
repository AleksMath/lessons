package Lesson12.multithreading;

public class Main {
    public static void main(String[] args)  {
       /*A a = new A();
        Thread threadA = new Thread(a);
        threadA.start();
        Thread threadB = new Thread(new Runnable() {
            @Override

            public void run() {
                System.out.println("Hello from thread B");
            }
        });
        threadB.start();
        Thread threadC = new Thread(() -> System.out.println("Hello from thread C"));
        threadC.start();

        System.out.println("Hollo from main thread");

        D d = new D();
        d.start();
        if(d.isAlive()) {
            System.out.println("Thread D is alive");
        }
        d.join();
        System.out.println("After thread D");
        System.out.println();*/

        for (int i = 3; i >= 1; i--) {
            System.out.println("Программа завершится через " + i + "секунд");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

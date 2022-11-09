package homework9easy;

/*1. Создать массив, содержащий целые числа, размера 10.
        2. Заполнить массив случайными числами (класс Random).
        3. Создать и запустить побочный поток, вычисляющий максимальное значение массива.
        4. Создать и запустить побочный поток, вычисляющий минимальное значение массива.
        5. Гланый поток ожидает завершения побочных потоков (можно воспользоваться для этого методом join)
         и выводит максимум и минимум на консоль.
*/
public class MainEasy {
    public static void main(String[] args) throws InterruptedException {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        MaxThread maxThread = new MaxThread();
        maxThread.array = array;
        maxThread.start();
        if(maxThread.isAlive()) {
            System.out.println("maxThread is alive");
        }
        maxThread.join();
        System.out.println("After maxThread");

        MinThread minThread = new MinThread();
        minThread.array2 = array;
        minThread.start();
    }
}
class MaxThread extends Thread {
    int array[];
    public void run() {
        int maxNum = array[0];
        for (int j : array) {
            if (j > maxNum) maxNum = j;
        }
        System.out.println("Максимальное число в массиве случайных чисел: " + maxNum);
    }
}
class MinThread extends Thread {
    int array2[];
    public void run() {
        int minNum = array2[0];
        for (int j : array2) {
            if (j < minNum) minNum = j;
        }
        System.out.println("Минимальное число в массиве случайных чисел: " + minNum);
    }
}

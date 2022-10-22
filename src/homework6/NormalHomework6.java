package homework6;

import java.util.Scanner;

public class NormalHomework6 {
    public static void main(String[] args) {

        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) ((Math.random() * 80 + 20));
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("Введите число из ряда выше:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int index;
        for (int i = 0; i < mass.length; i++) {
            if (n == mass[i]) {
                index = i;
                System.out.println("Вы ввели число под индексом " + index);
            }
    }
}
}





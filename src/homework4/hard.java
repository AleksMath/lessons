package homework4;

import java.util.Scanner;

public class hard {
    public static void main(String[] args) {
        System.out.println("Программа выводит последовательность фибонначи до F(n)");
        System.out.println("Введите n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Последовательность фибоначчи до F(" + n + "):");
        int fib0 = 0;
        int fib1 = 1;
        if (n >= 2) {
            int[] fibNum = new int[n + 1];
            fibNum[0] = fib0;
            fibNum[1] = fib1;
            System.out.print(fibNum[0] + " " + fibNum[1] + " ");
            for (int i = 2; i <= n; i++) {
                fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
                System.out.print(fibNum[i] + " ");
            }
        } else if (n == 1) {
            System.out.println(fib0 + " " + fib1);
        } else {
            System.out.println(fib0);
        }
    }
}


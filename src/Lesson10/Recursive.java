package Lesson10;

public class Recursive {
    public static void main(String[] args) {

        long calculatedFactorial = calculateFactorial(3);
        System.out.println("Calculated factorial: " + calculatedFactorial);

        long calculateFibNumbers = calculateFibNumberByLoop(3);
        System.out.println("Число фибоначи до F(n): " + calculateFibNumbers);

    }

    private static long calculateFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }
    private static long calculateFibNumber(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return  calculateFibNumber(n-1) + calculateFibNumber(n-2);
    }
    private static long calculateFibNumberByLoop(int n) {
        int[] fibNumbers = new int[n+1];
        fibNumbers [0] = 0;
        fibNumbers [1] = 1;
        for (int i = 2; i <= n; i++  ) {
            fibNumbers [i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }
        return fibNumbers [n];

    }
}

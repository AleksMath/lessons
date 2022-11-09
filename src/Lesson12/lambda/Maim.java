package Lesson12.lambda;

public class Maim {
    public static void main(String[] args) {
        Multeplier multeplier = (a, b) -> a * b;
        System.out.println(multeplier.multi(5, 5));
        Printable printable = (sentense) -> {
            System.out.println("Hello java");
            System.out.println(sentense);
        };
        printable.print("Hello world");
    }

}


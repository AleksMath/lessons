package Lesson8;

public class FinalKeyword {
    static final int MY_FINAL_INTEGER = 1;
    public static void main(String[] args) {
       final double PI = 3.14;
        System.out.println(PI);
        System.out.println(MY_FINAL_INTEGER);
        printConstant("Hello");
    }
    static void printConstant(final String constant){
        System.out.println("Constant: " + constant);
    };

}

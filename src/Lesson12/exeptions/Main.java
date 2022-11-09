package Lesson12.exeptions;

public class Main {
    public static void main(String[] args) {
        //System.out.println("8 : 4 = " + MathUtil.divide(8,4));
        try {
            System.out.println("8 : 5 = " + MathUtil.divide(8, 5));
        } catch (CheckedArithmeticExeption | TestExeption e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("After try-catch");
        }
        //System.out.println("8 : 0 = " + MathUtil.divide (8, 0));
        System.out.println("The end");
    }
}

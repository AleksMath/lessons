package Lesson12.exeptions;

public class MathUtil {
    public static int divide (int number1, int number2 ) throws CheckedArithmeticExeption, TestExeption {
        if (number2 == 0) {
            throw new CheckedArithmeticExeption("На ноль делить нельзя");
        }
        if (number2 == 5){
            throw new TestExeption("It is test exeptions");
        }
        return number1 / number2;
    }
}

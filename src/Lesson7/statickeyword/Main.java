package Lesson7.statickeyword;

public class Main {
    int noStaticVariable;
    static int staticVariable;

    public static void main(String[] args) {
        Car merzedes = new Car("White");
        System.out.println(merzedes);

        Car bmv = new Car("blye");
        System.out.println(bmv);

        System.out.println();

        //MathUtil mathUtil = new MathUtil();
        int result = MathUtil.sum(2,3);
        System.out.println("Result: " + result);

        System.out.println();

    }
}


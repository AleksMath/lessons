package Lesson8.modificators.p1;

public class B extends A {
    void test(){
        System.out.println(pablicVariable);
        pablickMethod();

        //System.out.println(privateVariable);
        //privateMethod();

        System.out.println(defaultVariable);
        defaultMethod();

        System.out.println(protectVariable);
        protectMethod();

    }
}
